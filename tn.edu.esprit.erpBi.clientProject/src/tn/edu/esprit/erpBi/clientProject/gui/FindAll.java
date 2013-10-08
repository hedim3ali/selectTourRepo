package tn.edu.esprit.erpBi.clientProject.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import org.hibernate.annotations.Table;

import tn.edu.esprit.erpBi.clientProject.delegate.DelegateOfEventManagementServicesRemote;
import tn.edu.esprit.erpBi.ejbProject.services.domain.Event;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;

public class FindAll extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FindAll frame = new FindAll();
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
	public FindAll() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 516, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel ManageEvent = new JPanel();
		ManageEvent.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Manage Event", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		contentPane.add(ManageEvent, BorderLayout.CENTER);
		ManageEvent.setLayout(null);
		
		JButton btnNewButton = new JButton("consulter");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\image\\voirproject.png"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame fr =new JFrame();
				JScrollPane js=new JScrollPane();
				JTable tabel =new JTable();
				DelegateOfEventManagementServicesRemote

				delegateOfEventManagementServicesRemote = new

				DelegateOfEventManagementServicesRemote();

				List<Event> events;
				events=delegateOfEventManagementServicesRemote.DofindAllEvents();
				String [] [] donnees = new String [events.size()][10];
				

				for (int i = 0; i < events.size(); i++) {

					donnees[i][0] = events.get(i).getName_event();
					donnees[i][1] = events.get(i).getCategory();
					donnees[i][2] = events.get(i).getCountry();
					donnees[i][3] = events.get(i).getCity();
					donnees[i][5] = events.get(i).getDescription();
					donnees[i][6] = events.get(i).getStart_date().toString();
					donnees[i][7] = events.get(i).getEnd_date().toString();
					donnees[i][8] = String.valueOf(events.get(i).getBooking());
					donnees[i][9] =  String.valueOf(events.get(i).getFee());


				}
				tabel.setModel(new javax.swing.table.DefaultTableModel(
						
						donnees, new String[] {
								"name event", "category", "country", "city", "adress", "description", "date start",  "date end","booking", "fee"
						}));
				
				
				js.setViewportView(tabel);
				
				//frm.add(btn, BorderLayout.NORTH);
//				fr.add(new JScrollPane(tbl), BorderLayout.CENTER);
			fr.getContentPane().add(new JScrollPane(js),BorderLayout.SOUTH);
				fr.setSize(1400,500);
				fr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				fr.setVisible(true);
				
			}
		});
		

		btnNewButton.setBounds(10, 45, 179, 43);
		ManageEvent.add(btnNewButton);
		
		JButton btnCreateNewEvent = new JButton("create new Event");
		btnCreateNewEvent.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\image\\ajoutproject.png"));
		btnCreateNewEvent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Addev jf=new Addev();
				jf.setVisible(true);
			}
		});
		btnCreateNewEvent.setBounds(224, 45, 196, 43);
		ManageEvent.add(btnCreateNewEvent);
		
		JButton btnNewButton_1 = new JButton("modify Event");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\image\\modifproject.png"));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		btnNewButton_1.setBounds(10, 133, 179, 38);
		ManageEvent.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Delete Event");
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\image\\supppro.png"));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(224, 133, 196, 38);
		ManageEvent.add(btnNewButton_2);
		
		
	}
}
