package tn.edu.esprit.erpBi.clientProject.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import tn.edu.esprit.erpBi.clientProject.delegate.DelegateOfEventManagementServicesRemote;
import tn.edu.esprit.erpBi.ejbProject.services.domain.Event;
import tn.edu.esprit.erpBi.clientProject.serviceLocator.*;

public class FindE extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FindE frame = new FindE();
					frame.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FindE() {

		Object[][] donnees = {};
		Object[] name = { "name event", "category", "country", "city",
				"adress", "description", "date start", "date end", "booking",
				"fee" };
		DelegateOfEventManagementServicesRemote

		delegateOfEventManagementServicesRemote = new

		DelegateOfEventManagementServicesRemote();

		List<Event> events = new ArrayList<Event>();
		events = delegateOfEventManagementServicesRemote.DofindAllEvents();

		System.out.println("laalallalalala" + events.get(3).getName_event());
		int indice = 0;
		donnees = new Object[events.size()][10];
		for (int i = 0; i < events.size(); i++) {

			donnees[i][0] = events.get(i).getName_event();
			donnees[i][1] = events.get(i).getCategory();
			donnees[i][2] = events.get(i).getCountry();
			donnees[i][3] = events.get(i).getCity();
			donnees[i][4] = events.get(i).getAdress();
			donnees[i][5] = events.get(i).getStart_date();
			donnees[i][6] = events.get(i).getEnd_date();
			donnees[i][7] = events.get(i).getBooking();
			donnees[i][8] = events.get(i).getFee();
		}

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		table = new JTable();
		table.setBounds(10, 146, 404, -134);

		DefaultTableModel model = new DefaultTableModel(donnees, name);
		table.setModel(model);
		System.out.println("laaaaaaaalaaaalaaa"+events.get(1).getName_event());

		panel.add(table);

	}
}
