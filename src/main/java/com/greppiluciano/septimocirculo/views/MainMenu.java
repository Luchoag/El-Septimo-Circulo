package com.greppiluciano.septimocirculo.views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import interfaces.LibroDAO;

public class MainMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu frame = new MainMenu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws Exception 
	 */
	public MainMenu() throws Exception {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		String[] columnNamesLibros = {"Título", "Cod_autor", "Año", "Cod_pais", "Cod_editorial"};
		//DefaultTableModel tableModel2 = new DefaultTableModel(columnNamesVentas, 0);
		DefaultTableModel dataLibros = new DefaultTableModel(columnNamesLibros, 0);
				
		JTable tableLibros = new JTable(dataLibros);
		//LibroDAO daoL = new LibroDAO();
		Object [] dataColumns = new Object[5];
		//daoL.cargarLibros(dataColumns, dataLibros);
		
		
	}

}
