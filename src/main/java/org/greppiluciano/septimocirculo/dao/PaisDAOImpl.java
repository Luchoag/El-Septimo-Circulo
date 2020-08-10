package org.greppiluciano.septimocirculo.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.greppiluciano.septimocirculo.model.Autor;
import com.greppiluciano.septimocirculo.model.Pais;

import interfaces.PaisDAO;

public class PaisDAOImpl extends Conexion implements PaisDAO {

	public void registrar(Pais pa) {
		// TODO Auto-generated method stub
		
	}

	public void actualizar(Pais pa) {
		try {
			this.conectar();
			PreparedStatement st = this.con.prepareStatement("UPDATE Pais SET Nombre = ? WHERE Cod_pais = ?");
			st.setString(1, pa.getNombre());
			st.setInt(2, pa.getCod_pais());
			st.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				this.cerrarConexion();
			} catch (SQLException e) {
				System.out.println(e);
				e.printStackTrace();
			}
		}
	}

	public void eliminar(Pais pa) {
		try {
			this.conectar();
			PreparedStatement st = this.con.prepareStatement("DELETE FROM Pais WHERE Cod_pais = ?");
			st.setInt(1, pa.getCod_pais());
			st.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				this.cerrarConexion();
			} catch (SQLException e) {
				System.out.println(e);
				e.printStackTrace();
			}
		}		
	}

	public List<Pais> listar() throws Exception {
		List<Pais> lista = null;
		try {
			this.conectar();
			PreparedStatement st = this.con.prepareStatement("SELECT * FROM Pais");
			lista = new ArrayList<Pais>();
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				
				Pais pa = new Pais();
				pa.setCod_pais(rs.getInt("Cod_pais"));
				pa.setNombre(rs.getString("Nombre"));
				lista.add(pa);
			}
			rs.close();
			st.close();			
		} catch (Exception e) {
			
		} finally {
			this.cerrarConexion();
		}	
		return lista;
	}

}
