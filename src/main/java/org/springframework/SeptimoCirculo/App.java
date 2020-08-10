package org.springframework.SeptimoCirculo;


import java.util.List;

import org.greppiluciano.septimocirculo.dao.AutorDAOImpl;
import org.greppiluciano.septimocirculo.dao.EditorialDAOImpl;
import org.greppiluciano.septimocirculo.dao.LibroDAOImpl;
import org.greppiluciano.septimocirculo.dao.PaisDAOImpl;

import com.greppiluciano.septimocirculo.model.Autor;
import com.greppiluciano.septimocirculo.model.Editorial;
import com.greppiluciano.septimocirculo.model.Libro;
import com.greppiluciano.septimocirculo.model.Pais;

import interfaces.AutorDAO;
import interfaces.EditorialDAO;
import interfaces.LibroDAO;
import interfaces.PaisDAO;


public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	  	
    	LibroDAO daoLibro = new LibroDAOImpl();
    	List <Libro> lista = daoLibro.listar();
    	
    	for (int i = 0; i<lista.size(); i++) {
    		System.out.println(lista.get(i).getTitulo());
    	}
    	System.out.println("---------------------------------");
    	AutorDAO daoAutor = new AutorDAOImpl();
    	List <Autor> lista2 = daoAutor.listar();
    	
    	for (int i = 0; i<lista2.size(); i++) {
    		System.out.println(lista2.get(i).getNombre());
    	}    	
    	System.out.println("---------------------------------");
    	PaisDAO daoPais = new PaisDAOImpl();
    	List <Pais> lista3 = daoPais.listar();
    	
    	for (int i = 0; i<lista3.size(); i++) {
    		System.out.println(lista3.get(i).getNombre());
    	} 
    	System.out.println("---------------------------------");
    	EditorialDAO daoEdit = new EditorialDAOImpl();
    	List <Editorial> lista4 = daoEdit.listar();
    	
    	for (int i = 0; i<lista4.size(); i++) {
    		System.out.println(lista4.get(i).getNombre());
    	}     	
    	
    }
}
