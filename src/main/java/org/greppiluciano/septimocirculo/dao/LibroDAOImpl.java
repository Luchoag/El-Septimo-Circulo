package org.greppiluciano.septimocirculo.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.greppiluciano.septimocirculo.model.Libro;

import interfaces.LibroDAO;

public class LibroDAOImpl extends Conexion implements LibroDAO {

	public void registrar(Libro lib) {

	}

	public void actualizar (Libro lib) {
		try {
			this.conectar();
			PreparedStatement st = this.con.prepareStatement("UPDATE Libro SET Titulo = ?, Cod_Autor = ?, Fecha_lanzamiento = ?, Cod_pais = ?, Cod_editorial = ? WHERE id = ?");
			st.setString(1, lib.getTitulo());
			st.setInt(2, lib.getCod_autor());
			st.setInt(3, lib.getFecha_lanzamiento());
			st.setInt(4, lib.getCod_pais());
			st.setInt(5, lib.getCod_editorial());
			st.setInt(6, lib.getCod_libro());
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

	public void eliminar(Libro lib) {
		try {
			this.conectar();
			PreparedStatement st = this.con.prepareStatement("DELETE FROM Libro WHERE Cod_libro = ?");
			st.setInt(1, lib.getCod_libro());
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

	public List<Libro> listar() throws Exception {
		List<Libro> lista = null;
		try {
			this.conectar();
			PreparedStatement st = this.con.prepareStatement("SELECT * FROM Libro");
			lista = new ArrayList<Libro>();
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				
				Libro lib = new Libro();
				lib.setCod_autor(rs.getInt("Cod_autor"));
				lib.setTitulo(rs.getString("Titulo"));
				lib.setFecha_lanzamiento(rs.getInt("fecha_lanzamiento"));
				lib.setCod_pais(rs.getInt("Cod_pais"));
				lib.setCod_editorial(rs.getInt("Cod_editorial"));
				lista.add(lib);
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
