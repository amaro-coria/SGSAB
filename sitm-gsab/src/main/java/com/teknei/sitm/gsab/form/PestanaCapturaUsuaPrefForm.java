package com.teknei.sitm.gsab.form;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PestanaCapturaUsuaPrefForm extends JPanel {
	private JTextField txtFolio;
	private JTextField txtCred;
	private JTextField txtAPaterno;
	private JTextField txtAMaterno;
	private JTextField txtNombre;
	private JTextField txtCurp;
	private JTextField txtFNacDia;
	private JTextField txtFNacMes;
	private JTextField txtFNacAno;
	private JTextField txtFAfilDia;
	private JTextField txtFAfilMes;
	private JTextField txtFAfilAno;
	private JTextField txtNombreFoto;
	private JTextField txtIdentificacion;
	private JTextField txtPreferencial;

	/**
	 * Create the panel.
	 */
	public PestanaCapturaUsuaPrefForm() {
		setLayout(null);
		
		JPanel panelGeneral = new JPanel();
		panelGeneral.setToolTipText("Info. General");
		panelGeneral.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelGeneral.setBounds(20, 23, 714, 92);
		add(panelGeneral);
		panelGeneral.setLayout(null);
		
		JLabel lblFolio = new JLabel("Folio ");
		lblFolio.setBounds(10, 11, 46, 14);
		panelGeneral.add(lblFolio);
		
		txtFolio = new JTextField();
		txtFolio.setBounds(97, 8, 109, 20);
		panelGeneral.add(txtFolio);
		txtFolio.setColumns(10);
		
		JLabel lblNoIdentificacin = new JLabel("No. Cred.");
		lblNoIdentificacin.setBounds(265, 11, 68, 14);
		panelGeneral.add(lblNoIdentificacin);
		
		txtCred = new JTextField();
		txtCred.setBounds(369, 8, 117, 20);
		panelGeneral.add(txtCred);
		txtCred.setColumns(10);
		
		JLabel lblIdentOficial = new JLabel("Ident. Oficial");
		lblIdentOficial.setBounds(10, 47, 74, 14);
		panelGeneral.add(lblIdentOficial);
		
		JComboBox cmbIdent = new JComboBox();
		cmbIdent.setBounds(97, 44, 109, 20);
		panelGeneral.add(cmbIdent);
		
		JLabel lblIdentPref = new JLabel("Ident. Pref.");
		lblIdentPref.setBounds(253, 47, 68, 14);
		panelGeneral.add(lblIdentPref);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(367, 44, 119, 20);
		panelGeneral.add(comboBox);
		
		JLabel lblTipoUsuario = new JLabel("Tipo Usuario");
		lblTipoUsuario.setBounds(510, 11, 74, 14);
		panelGeneral.add(lblTipoUsuario);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(594, 8, 109, 20);
		panelGeneral.add(comboBox_1);
		
		JPanel panelPersonal = new JPanel();
		panelPersonal.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelPersonal.setBounds(20, 126, 714, 157);
		add(panelPersonal);
		panelPersonal.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("A. Paterno");
		lblNewLabel.setBounds(10, 11, 68, 14);
		panelPersonal.add(lblNewLabel);
		
		txtAPaterno = new JTextField();
		txtAPaterno.setBounds(98, 8, 223, 20);
		panelPersonal.add(txtAPaterno);
		txtAPaterno.setColumns(10);
		
		JLabel lblAMaterno = new JLabel("A. Materno");
		lblAMaterno.setBounds(357, 11, 75, 14);
		panelPersonal.add(lblAMaterno);
		
		txtAMaterno = new JTextField();
		txtAMaterno.setBounds(442, 11, 239, 20);
		panelPersonal.add(txtAMaterno);
		txtAMaterno.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 47, 46, 14);
		panelPersonal.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(98, 44, 223, 20);
		panelPersonal.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblCurp = new JLabel("CURP");
		lblCurp.setBounds(357, 47, 46, 14);
		panelPersonal.add(lblCurp);
		
		txtCurp = new JTextField();
		txtCurp.setBounds(442, 44, 239, 20);
		panelPersonal.add(txtCurp);
		txtCurp.setColumns(10);
		
		JLabel lblFNac = new JLabel("F. Nac.");
		lblFNac.setBounds(10, 87, 46, 14);
		panelPersonal.add(lblFNac);
		
		txtFNacDia = new JTextField();
		txtFNacDia.setBounds(98, 84, 39, 20);
		panelPersonal.add(txtFNacDia);
		txtFNacDia.setColumns(10);
		
		JLabel label = new JLabel("-");
		label.setBounds(150, 87, 15, 14);
		panelPersonal.add(label);
		
		txtFNacMes = new JTextField();
		txtFNacMes.setBounds(164, 84, 39, 20);
		panelPersonal.add(txtFNacMes);
		txtFNacMes.setColumns(10);
		
		JLabel label_1 = new JLabel("-");
		label_1.setBounds(213, 87, 15, 14);
		panelPersonal.add(label_1);
		
		txtFNacAno = new JTextField();
		txtFNacAno.setBounds(238, 84, 83, 20);
		panelPersonal.add(txtFNacAno);
		txtFNacAno.setColumns(10);
		
		JLabel lblFAfil = new JLabel("F. Afil.");
		lblFAfil.setBounds(357, 87, 46, 14);
		panelPersonal.add(lblFAfil);
		
		txtFAfilDia = new JTextField();
		txtFAfilDia.setBounds(447, 84, 39, 20);
		panelPersonal.add(txtFAfilDia);
		txtFAfilDia.setColumns(10);
		
		JLabel label_2 = new JLabel("-");
		label_2.setBounds(496, 87, 15, 14);
		panelPersonal.add(label_2);
		
		txtFAfilMes = new JTextField();
		txtFAfilMes.setBounds(521, 84, 39, 20);
		panelPersonal.add(txtFAfilMes);
		txtFAfilMes.setColumns(10);
		
		JLabel label_3 = new JLabel("-");
		label_3.setBounds(570, 87, 15, 14);
		panelPersonal.add(label_3);
		
		txtFAfilAno = new JTextField();
		txtFAfilAno.setBounds(595, 84, 86, 20);
		panelPersonal.add(txtFAfilAno);
		txtFAfilAno.setColumns(10);
		
		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setBounds(10, 128, 46, 14);
		panelPersonal.add(lblSexo);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(98, 125, 223, 20);
		panelPersonal.add(comboBox_2);
		
		JPanel panelArchivos = new JPanel();
		panelArchivos.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelArchivos.setBounds(20, 294, 714, 136);
		add(panelArchivos);
		panelArchivos.setLayout(null);
		
		JLabel lblFotografa = new JLabel("Fotograf\u00EDa");
		lblFotografa.setBounds(10, 11, 71, 14);
		panelArchivos.add(lblFotografa);
		
		txtNombreFoto = new JTextField();
		txtNombreFoto.setEditable(false);
		txtNombreFoto.setBounds(124, 8, 416, 20);
		panelArchivos.add(txtNombreFoto);
		txtNombreFoto.setColumns(10);
		
		JButton btnBuscarFoto = new JButton("Buscar");
		btnBuscarFoto.setBounds(588, 11, 89, 23);
		panelArchivos.add(btnBuscarFoto);
		
		JLabel lblIdentificacin = new JLabel("Identificaci\u00F3n");
		lblIdentificacin.setBounds(10, 53, 89, 14);
		panelArchivos.add(lblIdentificacin);
		
		txtIdentificacion = new JTextField();
		txtIdentificacion.setEditable(false);
		txtIdentificacion.setBounds(124, 50, 416, 20);
		panelArchivos.add(txtIdentificacion);
		txtIdentificacion.setColumns(10);
		
		JButton btnBuscarIdentificacion = new JButton("Buscar");
		btnBuscarIdentificacion.setBounds(588, 49, 89, 23);
		panelArchivos.add(btnBuscarIdentificacion);
		
		JLabel lblPreferencial = new JLabel("Preferencial");
		lblPreferencial.setBounds(10, 90, 71, 14);
		panelArchivos.add(lblPreferencial);
		
		txtPreferencial = new JTextField();
		txtPreferencial.setEditable(false);
		txtPreferencial.setBounds(124, 87, 416, 20);
		panelArchivos.add(txtPreferencial);
		txtPreferencial.setColumns(10);
		
		JButton btnBuscarPreferencial = new JButton("Buscar");
		btnBuscarPreferencial.setBounds(588, 83, 89, 23);
		panelArchivos.add(btnBuscarPreferencial);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(645, 441, 89, 23);
		add(btnCancelar);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(493, 441, 89, 23);
		add(btnAceptar);

	}
}
