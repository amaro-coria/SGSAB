package com.teknei.sitm.gsab.form;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import lombok.Data;
import lombok.EqualsAndHashCode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import com.teknei.sitm.gsab.dto.CaupUsuaPrefDTO;
import com.teknei.sitm.gsab.service.CaupUsuaPrefService;
import com.teknei.sitm.gsab.service.ServiceException;

@Component
@Data
@EqualsAndHashCode(callSuper=false)
public class PestanaUsuaPrefBeanForm  implements ListSelectionListener, ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtPrefNombre;
	private JTextField txtPrefApeP;
	private JTextField txtPrefCURP;
	private JTable table;
	private JLabel lblNombre_1;
	private JTextField txtPrefOutputName;
	private JLabel lblTipoUsuario_1;
	private JTextField txtPrefUsuarioTipo;
	private JButton btnPrefPersonalizar;
	private JPanel thisPanel;
	@Autowired
	private CaupUsuaPrefService serviceCaupPref;
	private JScrollPane scrollPane;
	private JButton btnPrefBuscar;
	private CaupUsuaPrefDTO currentUsuaPrefDTO;

	/**
	 * Create the panel.
	 */
	public PestanaUsuaPrefBeanForm() {
		thisPanel = new JPanel();
		thisPanel.setLayout(null);

		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 27, 68, 14);
		thisPanel.add(lblNombre);

		txtPrefNombre = new JTextField();
		txtPrefNombre.setBounds(103, 24, 209, 20);
		thisPanel.add(txtPrefNombre);
		txtPrefNombre.setColumns(10);

		JLabel lblApellidoP = new JLabel("Apellido P");
		lblApellidoP.setBounds(364, 27, 78, 14);
		thisPanel.add(lblApellidoP);

		txtPrefApeP = new JTextField();
		txtPrefApeP.setBounds(499, 24, 202, 20);
		thisPanel.add(txtPrefApeP);
		txtPrefApeP.setColumns(10);

		JLabel lblCurp = new JLabel("CURP");
		lblCurp.setBounds(10, 85, 68, 14);
		thisPanel.add(lblCurp);

		txtPrefCURP = new JTextField();
		txtPrefCURP.setBounds(103, 82, 209, 20);
		thisPanel.add(txtPrefCURP);
		txtPrefCURP.setColumns(10);
		scrollPane = new JScrollPane();
		scrollPane.setBounds(65, 158, 636, 194);
		thisPanel.add(scrollPane);
		
		btnPrefBuscar= new JButton("Buscar");
		btnPrefBuscar.addActionListener(this);
		btnPrefBuscar.setBounds(612, 118, 89, 23);
		thisPanel.add(btnPrefBuscar);

		table = new JTable();
		table.setBounds(80, 175, 621, 163);
		table.setModel(new DefaultTableModel());
		table.getSelectionModel().addListSelectionListener(this);
		scrollPane.add(table);

		lblNombre_1 = new JLabel("Nombre");
		lblNombre_1.setBounds(32, 377, 46, 14);
		thisPanel.add(lblNombre_1);

		txtPrefOutputName = new JTextField();
		txtPrefOutputName.setEditable(false);
		txtPrefOutputName.setBounds(118, 374, 583, 20);
		thisPanel.add(txtPrefOutputName);
		txtPrefOutputName.setColumns(10);

		lblTipoUsuario_1 = new JLabel("Tipo Usuario");
		lblTipoUsuario_1.setBounds(364, 85, 78, 14);
		thisPanel.add(lblTipoUsuario_1);

		txtPrefUsuarioTipo = new JTextField();
		txtPrefUsuarioTipo.setBounds(499, 82, 202, 20);
		thisPanel.add(txtPrefUsuarioTipo);
		txtPrefUsuarioTipo.setColumns(10);

		btnPrefPersonalizar = new JButton("Personalizar");
		btnPrefPersonalizar.setBounds(579, 415, 122, 52);
		btnPrefPersonalizar.addActionListener(this);
		btnPrefPersonalizar.setEnabled(false);
		thisPanel.add(btnPrefPersonalizar);

	}
	
	private JTable getTable(TableModel model){
		JTable table = new JTable();
		table.setModel(model);
		table.getSelectionModel().addListSelectionListener(this);
		return table;
	}

	private TableModel getTableModel(Vector<Vector<String>> data) {
		Vector<String> colsVec = new Vector<String>();
		colsVec.add("#");
		colsVec.add("Nombre");
		colsVec.add("Ape. Pat");
		colsVec.add("Ape. Mat");
		colsVec.add("CURP");
		DefaultTableModel model = new DefaultTableModel(data, colsVec){
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		return model;
	}
	

	@Override
	public void valueChanged(ListSelectionEvent e) {
		String idUsuaPrefString = (table.getValueAt(
				table.getSelectedRow(), 0)).toString();
		Integer idUsuaPref = Integer.parseInt(idUsuaPrefString);
		try {
			CaupUsuaPrefDTO dto = serviceCaupPref
					.findByPK(idUsuaPref);
			currentUsuaPrefDTO = dto;
			String nombre = dto.getPersName();
			String apePat = dto.getPersApePat();
			String apeMat = dto.getPersApeMat();
			String outputName = nombre + " " + apePat + " "
					+ apeMat;
			txtPrefOutputName.setText(outputName);
			txtPrefOutputName.repaint();
			btnPrefPersonalizar.setEnabled(true);
		} catch (ServiceException e1) {

		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnPrefBuscar){
			searchUsers();
			txtPrefOutputName.setText("");
			btnPrefPersonalizar.setEnabled(false);
		}else if(e.getSource() == btnPrefPersonalizar){
			UsuaPrefDiagForm dialog = new UsuaPrefDiagForm();
			dialog.setUsuaPrefDTO(currentUsuaPrefDTO);
			dialog.initUserData();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setModal(true);
			dialog.setVisible(true);
			
		}
		
	}
	
	private void searchUsers(){
		scrollPane.getViewport().remove(table);;
		List<CaupUsuaPrefDTO> listAll;
		Vector<Vector<String>> vData = new Vector<Vector<String>>();
		try {
			String name = txtPrefNombre.getText();
			String apePat = txtPrefApeP.getText();
			listAll = serviceCaupPref.findFiltered(name, apePat, null);
			if(listAll != null 	|| !CollectionUtils.isEmpty(listAll)){
				for (CaupUsuaPrefDTO dto : listAll) {
					Vector<String> vsData = new Vector<>();
					vsData.add(String.valueOf(dto.getIdUsuaPref()));
					vsData.add(dto.getPersName());
					vsData.add(dto.getPersApePat());
					vsData.add(dto.getPersApeMat());
					vsData.add(dto.getPersCURP());
					//model.addRow(data);
					//rowCount++;
					vData.add(vsData);
				}
			}
			DefaultTableModel model = (DefaultTableModel) getTableModel(vData);
			//scrollPane.add(getTable(model));
			//table.repaint();
			table = getTable(model);
			scrollPane.getViewport().add(table);
		} catch (ServiceException e1) {
		}
	}
}
