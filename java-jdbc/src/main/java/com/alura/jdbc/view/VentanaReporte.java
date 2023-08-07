package com.alura.jdbc.view;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.alura.jdbc.controller.ControladorCategoria;

public class VentanaReporte extends JFrame{
	
	private static final long serialVersionUID = 1L;

    private JTable tablaReporte;
    private DefaultTableModel modelo;

    private ControladorCategoria categoriaController;

    public VentanaReporte(VentanaControlStock controlDeStockFrame) {
        super("Reporte de produtos del stock");

        this.categoriaController = new ControladorCategoria();

        Container container = getContentPane();
        setLayout(null);

        tablaReporte = new JTable();
        tablaReporte.setBounds(0, 0, 600, 400);
        container.add(tablaReporte);

        modelo = (DefaultTableModel) tablaReporte.getModel();
        modelo.addColumn("");
        modelo.addColumn("");
        modelo.addColumn("");
        modelo.addColumn("");

        cargaReporte();

        setSize(600, 400);
        setVisible(true);
        setLocationRelativeTo(controlDeStockFrame);
    }

    private void cargaReporte() {
        var contenido = categoriaController.cargarReporte();
        
        // TODO
        contenido.forEach(fila -> modelo
                .addRow(new Object[] {}));
    }
}
