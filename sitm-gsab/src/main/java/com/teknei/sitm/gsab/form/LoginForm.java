package com.teknei.sitm.gsab.form;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import lombok.Data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.teknei.sitm.gsab.controller.UserController;

@Component
public class LoginForm {

	private JFrame frame;
	private JTextField txtUsuario;
	private JPasswordField txtPassword;
	@Autowired
	private UserController userController;
	@Autowired
	private MainWindow mainWindow;

	
	/**
	 * Launch the application.
	 */
	/*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginForm window = new LoginForm();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	*/

	/**
	 * Create the application.
	 */
	public LoginForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(100, 115, 46, 14);
		frame.getContentPane().add(lblUsuario);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(100, 164, 46, 14);
		frame.getContentPane().add(lblPassword);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(183, 112, 149, 20);
		frame.getContentPane().add(txtUsuario);
		txtUsuario.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(183, 161, 149, 20);
		frame.getContentPane().add(txtPassword);
		
		JButton btnIngresar = new JButton("Ingresar");
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = txtUsuario.getText();
				if(username == null){
					username = "";
				}
				String password = String.valueOf(txtPassword.getPassword());
				if(password == null){
					password = "";
				}
				boolean aut = userController.authenticate(username, password);
				if(aut){
					mainWindow.getFrame().setVisible(true);
					frame.dispose();
				}else{
					showAutDialog();
				}
			}
		});
		btnIngresar.setBounds(243, 208, 89, 23);
		frame.getContentPane().add(btnIngresar);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\WORKSPACE_HOME\\LUNA\\sitm-gsab\\src\\main\\resources\\img\\logoTkn.jpg"));
		lblNewLabel.setBounds(158, 11, 104, 64);
		frame.getContentPane().add(lblNewLabel);
		frame.getRootPane().setDefaultButton(btnIngresar);
	}
	
	private void showAutDialog(){
		JOptionPane.showMessageDialog(this.frame, "Error de credenciales");
	}

	/**
	 * @return the frame
	 */
	public JFrame getFrame() {
		return frame;
	}

	/**
	 * @param frame the frame to set
	 */
	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
}
