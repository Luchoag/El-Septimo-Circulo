package org.greppiluciano.septimocirculo.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.greppiluciano.septimocirculo.model.Autor;
import com.greppiluciano.septimocirculo.model.Editorial;

import interfaces.EditorialDAO;

public class EditorialDAOImpl extends Conexion implements EditorialDAO{

	public void registrar(Editorial ed) {
		// TODO Auto-generated method stub
		
	}

	public void actualizar(Editorial ed) {
		try {
			this.conectar();
			PreparedStatement st = this.con.prepareStatement("UPDATE Editorial SET Nombre = ? WHERE Cod_editorial = ?");
			st.setString(1, ed.getNombre());
			st.setInt(2, ed.getCod_editorial());
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

	public void eliminar(Editorial ed) {
		try {
			this.conectar();
			PreparedStatement st = this.con.prepareStatement("DELETE FROM Editorial WHERE Cod_editorial = ?");
			st.setInt(1, ed.getCod_editorial());
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

	public List<Editorial> listar() throws Exception {
		List<Editorial> lista = null;
		try {
			this.conectar();
			PreparedStatement st = this.con.prepareStatement("SELECT * FROM Editorial");
			lista = new ArrayList<Editorial>();
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				
				Editorial ed = new Editorial();
				ed.setCod_editorial(rs.getInt("Cod_editorial"));
				ed.setNombre(rs.getString("Nombre"));
				lista.add(ed);
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
