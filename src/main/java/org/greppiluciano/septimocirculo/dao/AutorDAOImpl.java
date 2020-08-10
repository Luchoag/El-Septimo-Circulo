package org.greppiluciano.septimocirculo.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.greppiluciano.septimocirculo.model.Autor;

import interfaces.AutorDAO;

public class AutorDAOImpl extends Conexion implements AutorDAO {

	public void registrar(Autor aut) {
		// TODO Auto-generated method stub
		
	}

	public void actualizar(Autor aut) {
		try {
			this.conectar();
			PreparedStatement st = this.con.prepareStatement("UPDATE Autor SET Nombre = ? WHERE Cod_autor = ?");
			st.setString(1, aut.getNombre());
			st.setInt(2, aut.getCod_autor());
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

	public void eliminar(Autor aut) {
		try {
			this.conectar();
			PreparedStatement st = this.con.prepareStatement("DELETE FROM Autor WHERE Cod_autor = ?");
			st.setInt(1, aut.getCod_autor());
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

	public List<Autor> listar() throws Exception {
		List<Autor> lista = null;
		try {
			this.conectar();
			PreparedStatement st = this.con.prepareStatement("SELECT * FROM Autor");
			lista = new ArrayList<Autor>();
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				
				Autor aut = new Autor();
				aut.setCod_autor(rs.getInt("Cod_autor"));
				aut.setNombre(rs.getString("Nombre"));
				lista.add(aut);
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
