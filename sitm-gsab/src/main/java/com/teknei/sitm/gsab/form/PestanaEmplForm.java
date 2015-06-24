package com.teknei.sitm.gsab.form;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;

public class PestanaEmplForm extends JPanel {
	private JTextField txtNombre;
	private JTextField txtAPaterno;
	private JTextField txtAMaterno;
	private JTextField txtCurp;
	private JTable table;
	private JTextField txtEmpleadoOut;

	/**
	 * Create the panel.
	 */
	public PestanaEmplForm() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 11, 652, 138);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(22, 13, 64, 14);
		panel.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(86, 10, 105, 20);
		panel.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblApePaterno = new JLabel("Ape. Paterno");
		lblApePaterno.setBounds(207, 13, 78, 14);
		panel.add(lblApePaterno);
		
		txtAPaterno = new JTextField();
		txtAPaterno.setBounds(295, 10, 121, 20);
		panel.add(txtAPaterno);
		txtAPaterno.setColumns(10);
		
		JLabel lblApeMaterno = new JLabel("Ape. Materno");
		lblApeMaterno.setBounds(438, 13, 78, 14);
		panel.add(lblApeMaterno);
		
		txtAMaterno = new JTextField();
		txtAMaterno.setBounds(526, 10, 116, 20);
		panel.add(txtAMaterno);
		txtAMaterno.setColumns(10);
		
		JLabel lblCurp = new JLabel("CURP");
		lblCurp.setBounds(22, 55, 46, 14);
		panel.add(lblCurp);
		
		txtCurp = new JTextField();
		txtCurp.setBounds(85, 55, 105, 20);
		panel.add(txtCurp);
		txtCurp.setColumns(10);
		
		JLabel lblrea = new JLabel("\u00C1rea");
		lblrea.setBounds(207, 55, 46, 14);
		panel.add(lblrea);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(295, 52, 121, 25);
		panel.add(comboBox);
		
		JLabel lblPuesto = new JLabel("Puesto");
		lblPuesto.setBounds(438, 58, 46, 14);
		panel.add(lblPuesto);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(525, 52, 117, 25);
		panel.add(comboBox_1);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(553, 104, 89, 23);
		panel.add(btnBuscar);
		
		JPanel panelTabla = new JPanel();
		panelTabla.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelTabla.setBounds(12, 171, 650, 197);
		add(panelTabla);
		panelTabla.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 630, 175);
		panelTabla.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JLabel lblEmpleado = new JLabel("Empleado");
		lblEmpleado.setBounds(10, 382, 67, 14);
		add(lblEmpleado);
		
		txtEmpleadoOut = new JTextField();
		txtEmpleadoOut.setEditable(false);
		txtEmpleadoOut.setBounds(92, 379, 570, 19);
		add(txtEmpleadoOut);
		txtEmpleadoOut.setColumns(10);
		
		JButton btnPersonalizar = new JButton("Personalizar");
		btnPersonalizar.setBounds(545, 409, 117, 30);
		add(btnPersonalizar);

	}
}
