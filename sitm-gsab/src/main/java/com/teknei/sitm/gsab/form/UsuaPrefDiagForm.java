package com.teknei.sitm.gsab.form;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import lombok.Data;
import lombok.EqualsAndHashCode;

import com.teknei.sitm.gsab.dto.CaupUsuaPrefDTO;
import javax.swing.ImageIcon;

@Data
@EqualsAndHashCode(callSuper=false)
public class UsuaPrefDiagForm extends JDialog implements ActionListener{
	private JTextField txtNombre;
	private JTextField txtApePat;
	private JTextField txtApeMat;
	private JTextField txtTipoUsua;
	private JTextField txtUID;
	private JButton btnLecturaDeTarjeta;
	private CaupUsuaPrefDTO usuaPrefDTO;
	private JButton btnConfirmarAsignacin;
	private JLabel lblUser;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UsuaPrefDiagForm dialog = new UsuaPrefDiagForm();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public UsuaPrefDiagForm() {
		setBounds(100, 100, 558, 430);
		getContentPane().setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Nombre");
			lblNewLabel.setBounds(20, 11, 82, 18);
			getContentPane().add(lblNewLabel);
		}
		{
			txtNombre = new JTextField();
			txtNombre.setEditable(false);
			txtNombre.setBounds(112, 11, 158, 18);
			getContentPane().add(txtNombre);
			txtNombre.setColumns(10);
		}
		{
			JLabel lblApellidoP = new JLabel("Apellido P");
			lblApellidoP.setBounds(20, 48, 82, 18);
			getContentPane().add(lblApellidoP);
		}
		{
			txtApePat = new JTextField();
			txtApePat.setEditable(false);
			txtApePat.setBounds(112, 48, 158, 18);
			getContentPane().add(txtApePat);
			txtApePat.setColumns(10);
		}
		{
			JLabel lblApellidoM = new JLabel("Apellido M");
			lblApellidoM.setBounds(20, 85, 82, 25);
			getContentPane().add(lblApellidoM);
		}
		{
			txtApeMat = new JTextField();
			txtApeMat.setEditable(false);
			txtApeMat.setBounds(112, 88, 158, 18);
			getContentPane().add(txtApeMat);
			txtApeMat.setColumns(10);
		}
		{
			JLabel lblTipoDeUsuario = new JLabel("Tipo de Usuario");
			lblTipoDeUsuario.setBounds(20, 121, 115, 25);
			getContentPane().add(lblTipoDeUsuario);
		}
		{
			txtTipoUsua = new JTextField();
			txtTipoUsua.setEditable(false);
			txtTipoUsua.setBounds(112, 124, 158, 18);
			getContentPane().add(txtTipoUsua);
			txtTipoUsua.setColumns(10);
		}
		{
			JLabel lblTarjeta = new JLabel("Tarjeta");
			lblTarjeta.setBounds(20, 164, 71, 25);
			getContentPane().add(lblTarjeta);
		}
		{
			txtUID = new JTextField();
			txtUID.setEditable(false);
			txtUID.setBounds(112, 167, 158, 18);
			getContentPane().add(txtUID);
			txtUID.setColumns(10);
		}
		
		btnLecturaDeTarjeta= new JButton("Lectura de tarjeta");
		btnLecturaDeTarjeta.setBounds(60, 250, 158, 54);
		btnLecturaDeTarjeta.addActionListener(this);
		getContentPane().add(btnLecturaDeTarjeta);
		
		
		btnConfirmarAsignacin= new JButton("Confirmar asignaci\u00F3n");
		btnConfirmarAsignacin.setEnabled(false);
		btnConfirmarAsignacin.setBounds(300, 250, 158, 54);
		btnConfirmarAsignacin.addActionListener(this);
		getContentPane().add(btnConfirmarAsignacin);
		
		{
			lblUser = new JLabel("");
			lblUser.setIcon(new ImageIcon("C:\\WORKSPACE_HOME\\ACABUS\\sitm-gsab\\src\\main\\resources\\img\\user.jpg"));
			lblUser.setBounds(353, 31, 121, 129);
			getContentPane().add(lblUser);
		}
	}
	
	public void initUserData(){
		txtNombre.setText(usuaPrefDTO.getPersName());
		txtApePat.setText(usuaPrefDTO.getPersApePat());
		txtApeMat.setText(usuaPrefDTO.getPersApeMat());
		txtTipoUsua.setText("3ra edad");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnLecturaDeTarjeta){
			//TODO invocacion de lectura de TKP_API
			txtUID.setText("040a44f2174480");
			btnLecturaDeTarjeta.setEnabled(false);
			btnConfirmarAsignacin.setEnabled(true);
		}else if(e.getSource() == btnConfirmarAsignacin){
			int result = JOptionPane.showConfirmDialog(this, "\u00BFDeseas asignar esta tarjeta al usuario?", "Confirmaci\u00F3n", JOptionPane.YES_NO_OPTION);
			if(result == JOptionPane.YES_OPTION){
				JOptionPane.showMessageDialog(this, "Tarjeta asignada correctamente");
				this.dispose();
			}
		}
		
	}
}
