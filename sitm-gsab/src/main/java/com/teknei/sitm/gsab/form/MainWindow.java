package com.teknei.sitm.gsab.form;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.teknei.sitm.gsab.service.CaupUsuaPrefService;

@Component
public class MainWindow {

	private JFrame frame;
	private PestanaUsuaPrefBeanForm pestanaUsuaPref;
	@Autowired
	private CaupUsuaPrefService serviceUsuaPref;

	/**
	 * Launch the application.
	 */
	/*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
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
	@Autowired
	public MainWindow(PestanaUsuaPrefBeanForm pestanaUsuaPrefBeanForm) {
		this.pestanaUsuaPref = pestanaUsuaPrefBeanForm;
		initComponents();
		initialize();
	}
	
	private void initComponents(){
		//pestanaUsuaPref = new PestanaUsuaPref();
		//pestanaUsuaPref.setServiceCaupPref(serviceUsuaPref);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 785, 652);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		//pestanaUsuaPref.setVisible(true);
		tabbedPane.add("Usuarios Pref.", pestanaUsuaPref.getThisPanel());
		tabbedPane.add("Alta de Usuarios Pref.", new PestanaCapturaUsuaPrefForm());
		tabbedPane.setBounds(0, 61, 763, 519);
		frame.getContentPane().add(tabbedPane);
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
