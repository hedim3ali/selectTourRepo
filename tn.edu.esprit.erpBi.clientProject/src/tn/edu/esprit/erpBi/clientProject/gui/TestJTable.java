package tn.edu.esprit.erpBi.clientProject.gui;


 
import javax.swing.*;
import javax.swing.table.*;

import tn.edu.esprit.erpBi.clientProject.delegate.DelegateOfEventManagementServicesRemote;
import tn.edu.esprit.erpBi.ejbProject.services.domain.Event;
import tn.edu.esprit.erpBi.clientProject.serviceLocator.*;

import java.awt.*;
import java.awt.event.*;
import java.util.List;
 
public class TestJTable
{
	public static void main(String[] args)
	{
	//	final String[] colNames = {"prestation", "qte", "prix", "montant"};
		//modele avec colNames comme noms des colonnes et 0 lignes
		
		//moi
		
		
		DelegateOfEventManagementServicesRemote

		delegateOfEventManagementServicesRemote = new

		DelegateOfEventManagementServicesRemote();

		List<Event> events = delegateOfEventManagementServicesRemote
				.DofindAllEvents();
	

		final String[] colNames = { "name event", "category", "country",
				"city", "adress", "description", "date end", "date start",
				"booking", "fee" };
		Object[][] donnees = {};

		// modele avec colNames comme noms des colonnes et 0 lignes
		final DefaultTableModel model = new DefaultTableModel(colNames, 0);
		JTable tbl = new JTable(model);
		
		
		
		JButton btn = new JButton("Add Event ");


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
		final DefaultTableModel model2 = new DefaultTableModel(donnees, 8);
		JTable tbl2 = new JTable(model2);
		//end
		
		
		btn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
   				model.addRow(new Object[colNames.length]);
			}
		});
		JFrame frm = new JFrame();
		frm.add(btn, BorderLayout.NORTH);
		frm.add(new JScrollPane(tbl), BorderLayout.CENTER);
		frm.add(new JScrollPane(tbl2),BorderLayout.SOUTH);
		frm.setSize(700,700);
		frm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frm.setVisible(true);
	}
}