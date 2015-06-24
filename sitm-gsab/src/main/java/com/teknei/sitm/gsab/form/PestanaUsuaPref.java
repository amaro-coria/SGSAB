package com.teknei.sitm.gsab.form;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
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

import com.teknei.sitm.gsab.dto.CaupUsuaPrefDTO;
import com.teknei.sitm.gsab.service.CaupUsuaPrefService;
import com.teknei.sitm.gsab.service.ServiceException;
import javax.swing.JScrollPane;

@Component
@Data
@EqualsAndHashCode(callSuper=false)
public class PestanaUsuaPref extends JPanel {
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

	/**
	 * Create the panel.
	 */
	public PestanaUsuaPref() {
		thisPanel = new JPanel();
		setLayout(null);

		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 27, 68, 14);
		add(lblNombre);

		txtPrefNombre = new JTextField();
		txtPrefNombre.setBounds(103, 24, 209, 20);
		add(txtPrefNombre);
		txtPrefNombre.setColumns(10);

		JLabel lblApellidoP = new JLabel("Apellido P");
		lblApellidoP.setBounds(364, 27, 78, 14);
		add(lblApellidoP);

		txtPrefApeP = new JTextField();
		txtPrefApeP.setBounds(499, 24, 202, 20);
		add(txtPrefApeP);
		txtPrefApeP.setColumns(10);

		JLabel lblCurp = new JLabel("CURP");
		lblCurp.setBounds(10, 85, 68, 14);
		add(lblCurp);

		txtPrefCURP = new JTextField();
		txtPrefCURP.setBounds(103, 82, 209, 20);
		add(txtPrefCURP);
		txtPrefCURP.setColumns(10);

		JButton btnPrefBuscar = new JButton("Buscar");
		btnPrefBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				thisPanel.remove(table);
				
				
				List<CaupUsuaPrefDTO> listAll;
				Vector<Vector<String>> vData = new Vector<Vector<String>>();
				try {
					listAll = serviceCaupPref.getAll();
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
					table = new JTable();
					table.setBounds(80, 175, 621, 163);
					table.setModel(getTableModel(vData));
					thisPanel.add(table);
					table.repaint();
				} catch (ServiceException e1) {
				}

			}
		});
		btnPrefBuscar.setBounds(612, 118, 89, 23);
		add(btnPrefBuscar);

		lblNombre_1 = new JLabel("Nombre");
		lblNombre_1.setBounds(32, 377, 46, 14);
		add(lblNombre_1);

		txtPrefOutputName = new JTextField();
		txtPrefOutputName.setEditable(false);
		txtPrefOutputName.setBounds(118, 374, 583, 20);
		add(txtPrefOutputName);
		txtPrefOutputName.setColumns(10);

		lblTipoUsuario_1 = new JLabel("Tipo Usuario");
		lblTipoUsuario_1.setBounds(364, 85, 78, 14);
		add(lblTipoUsuario_1);

		txtPrefUsuarioTipo = new JTextField();
		txtPrefUsuarioTipo.setBounds(499, 82, 202, 20);
		add(txtPrefUsuarioTipo);
		txtPrefUsuarioTipo.setColumns(10);

		btnPrefPersonalizar = new JButton("Personalizar");
		btnPrefPersonalizar.setBounds(579, 415, 122, 52);
		add(btnPrefPersonalizar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(65, 158, 636, 194);
		add(scrollPane);
		
				table = new JTable();
				scrollPane.setViewportView(table);
				table.setModel(getTableModel(null));
				table.getSelectionModel().addListSelectionListener(
				new ListSelectionListener() {

					@Override
					public void valueChanged(ListSelectionEvent e) {
						String idUsuaPrefString = (table.getValueAt(
								table.getSelectedRow(), 0)).toString();
						Integer idUsuaPref = Integer.parseInt(idUsuaPrefString);
						try {
							CaupUsuaPrefDTO dto = serviceCaupPref
									.findByPK(idUsuaPref);
							String nombre = dto.getPersName();
							String apePat = dto.getPersApePat();
							String apeMat = dto.getPersApeMat();
							String outputName = nombre + " " + apePat + " "
									+ apeMat;
							txtPrefOutputName.setText(outputName);
						} catch (ServiceException e1) {

						}
					}
				});

	}

	private TableModel getTableModel(Vector<Vector<String>> data) {
		Vector<String> colsVec = new Vector<String>();
		colsVec.add("#");
		colsVec.add("Nombre");
		colsVec.add("Ape. Pat");
		colsVec.add("Ape. Mat");
		colsVec.add("CURP");
		DefaultTableModel model = new DefaultTableModel(data, colsVec);
		return model;
	}
}
