package tn.edu.esprit.erpBi.clientProject.gui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import tn.edu.esprit.erpBi.ejbProject.services.domain.Event;
import tn.edu.esprit.erpBi.ejbProject.services.interf.EventManagementServicesRemote;
import tn.edu.esprit.erpBi.clientProject.delegate.*;
import tn.edu.esprit.erpBi.clientProject.serviceLocator.*;

import com.toedter.calendar.JDateChooser;
import javax.swing.UIManager;
import java.awt.Color;

public class Addev extends JFrame {

	private JPanel contentPane;
	private JTextField NametextField;
	private JTextField categorytextField_1;
	private JTextField citytextField_2;
	private JTextField adresstextField_3;
	private JTextField textField_4;
	private JTextField BookingtextField_5;
	private JTextField FeetextField_6;
	private JTextField descriptiontextField_7;
	private JComboBox countrycomboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Addev frame = new Addev();
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
	public Addev() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 785, 441);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Create Event", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setToolTipText("");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 345, Short.MAX_VALUE)
					.addContainerGap())
		);

		NametextField = new JTextField();
		NametextField.setColumns(10);

		categorytextField_1 = new JTextField();
		categorytextField_1.setColumns(10);

		countrycomboBox = new JComboBox();
		countrycomboBox.setModel(new DefaultComboBoxModel(new String[] {
				"tunisia", "egypt", "alg", "germ", "mexico" }));

		countrycomboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {

			}
		});
		countrycomboBox.setToolTipText("tunisia\r\negypt");

		JLabel lblNewLabel = new JLabel("Name");

		JLabel lblNewLabel_1 = new JLabel("Category");

		JLabel lblNewLabel_2 = new JLabel("Country");

		citytextField_2 = new JTextField();
		citytextField_2.setColumns(10);

		adresstextField_3 = new JTextField();
		adresstextField_3.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("City");

		JLabel lblNewLabel_4 = new JLabel("Adress");

		JLabel lblNewLabel_5 = new JLabel("Description");

		textField_4 = new JTextField();
		textField_4.setColumns(10);

		JLabel lblNewLabel_6 = new JLabel("Date From");

		final JDateChooser dateChooserFrom = new JDateChooser();

		final JDateChooser dateChooser_1To = new JDateChooser();

		JLabel lblNewLabel_7 = new JLabel("TO");

		JLabel lblNewLabel_8 = new JLabel("Booking");

		JLabel lblNewLabel_9 = new JLabel("Fee");

		BookingtextField_5 = new JTextField();
		BookingtextField_5.setColumns(10);

		FeetextField_6 = new JTextField();
		FeetextField_6.setColumns(10);

		JButton btnNewButton = new JButton("Create Event");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				

					/*Context context = new InitialContext();
					EventManagementServicesRemote proxy = (EventManagementServicesRemote) context
							.lookup("ejb:/tn.edu.esprit.erpBi.ejbProjectt/EventManagementServices!tn.edu.esprit.erpBi.ejbProject.services.interf.EventManagementServicesRemote");*/
				
					
					DelegateOfEventManagementServicesRemote delegateOfEventManagementServicesRemote= new DelegateOfEventManagementServicesRemote();
					
					
					
					Date date = new Date();
					SimpleDateFormat dateFormatComp;

					dateFormatComp = new SimpleDateFormat("dd MMM yyyy hh:mm:ss a");

					Date date2 = dateChooserFrom.getDate();
					Date date3 = dateChooser_1To.getDate();
					
					
					String country=countrycomboBox.getSelectedItem().toString();

					// Calendar calendar = jc.getCalendar();
					// System.out.println(calendar.get(Calendar.DAY_OF_MONTH));

					// System.out.println(dateFormatComp.format(date));
				
					 int booking = Integer.parseInt(BookingtextField_5.getText());

					 int fee = Integer.parseInt(FeetextField_6.getText());
					
					 
					 Event event = new Event(NametextField.getText(),categorytextField_1.getText(),country,citytextField_2.getText(),adresstextField_3.getText(),descriptiontextField_7.getText(),date2,date3,booking,fee);
					// Event event = new Event(NametextField.getText(),categorytextField_1.getText(),countrycomboBox.getToolTipText(),citytextField_2.getText(),adresstextField_3.getText(),descriptiontextField_7.getText(),date2,date3,booking,fee);
					// Event event = new
					// Event(textField.getText(),textField_2.getText(),comb.getName(),textField_1.getText(),textField_7.getText(),date2,date3,textField_5.get,textField_6.getText());
					/*proxy.addEvent(event);*/
					 
					 delegateOfEventManagementServicesRemote.DoaddEvent(event);
					 
					 
				

			}
		});

		JLabel lblNewLabel_10 = new JLabel("Description");

		descriptiontextField_7 = new JTextField();
		descriptiontextField_7.setColumns(10);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel
				.createParallelGroup(Alignment.LEADING)
				.addGroup(
						gl_panel.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										gl_panel.createParallelGroup(
												Alignment.LEADING)
												.addGroup(
														gl_panel.createSequentialGroup()
																.addGroup(
																		gl_panel.createParallelGroup(
																				Alignment.LEADING)
																				.addGroup(
																						gl_panel.createParallelGroup(
																								Alignment.LEADING)
																								.addGroup(
																										gl_panel.createSequentialGroup()
																												.addGroup(
																														gl_panel.createParallelGroup(
																																Alignment.LEADING)
																																.addComponent(
																																		lblNewLabel_5)
																																.addComponent(
																																		lblNewLabel)
																																.addComponent(
																																		lblNewLabel_2)
																																.addComponent(
																																		lblNewLabel_1))
																												.addGap(18))
																								.addGroup(
																										gl_panel.createSequentialGroup()
																												.addComponent(
																														lblNewLabel_3,
																														GroupLayout.DEFAULT_SIZE,
																														67,
																														Short.MAX_VALUE)
																												.addPreferredGap(
																														ComponentPlacement.RELATED)))
																				.addGroup(
																						gl_panel.createSequentialGroup()
																								.addComponent(
																										lblNewLabel_4)
																								.addPreferredGap(
																										ComponentPlacement.RELATED)))
																.addGroup(
																		gl_panel.createParallelGroup(
																				Alignment.LEADING)
																				.addGroup(
																						gl_panel.createSequentialGroup()
																								.addGroup(
																										gl_panel.createParallelGroup(
																												Alignment.LEADING)
																												.addGroup(
																														gl_panel.createSequentialGroup()
																																.addGroup(
																																		gl_panel.createParallelGroup(
																																				Alignment.LEADING)
																																				.addGroup(
																																						gl_panel.createParallelGroup(
																																								Alignment.LEADING,
																																								false)
																																								.addComponent(
																																										countrycomboBox,
																																										0,
																																										GroupLayout.DEFAULT_SIZE,
																																										Short.MAX_VALUE)
																																								.addComponent(
																																										categorytextField_1)
																																								.addComponent(
																																										NametextField))
																																				.addComponent(
																																						citytextField_2,
																																						GroupLayout.PREFERRED_SIZE,
																																						GroupLayout.DEFAULT_SIZE,
																																						GroupLayout.PREFERRED_SIZE))
																																.addPreferredGap(
																																		ComponentPlacement.RELATED,
																																		GroupLayout.DEFAULT_SIZE,
																																		Short.MAX_VALUE)
																																.addComponent(
																																		textField_4,
																																		GroupLayout.PREFERRED_SIZE,
																																		GroupLayout.DEFAULT_SIZE,
																																		GroupLayout.PREFERRED_SIZE))
																												.addGroup(
																														gl_panel.createSequentialGroup()
																																.addComponent(
																																		adresstextField_3,
																																		GroupLayout.PREFERRED_SIZE,
																																		GroupLayout.DEFAULT_SIZE,
																																		GroupLayout.PREFERRED_SIZE)
																																.addPreferredGap(
																																		ComponentPlacement.RELATED)))
																								.addGap(58))
																				.addGroup(
																						gl_panel.createSequentialGroup()
																								.addPreferredGap(
																										ComponentPlacement.RELATED)
																								.addComponent(
																										descriptiontextField_7,
																										GroupLayout.PREFERRED_SIZE,
																										GroupLayout.DEFAULT_SIZE,
																										GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										ComponentPlacement.RELATED)))
																.addGroup(
																		gl_panel.createParallelGroup(
																				Alignment.TRAILING)
																				.addGroup(
																						gl_panel.createSequentialGroup()
																								.addGroup(
																										gl_panel.createParallelGroup(
																												Alignment.LEADING)
																												.addComponent(
																														lblNewLabel_6)
																												.addComponent(
																														lblNewLabel_7)
																												.addComponent(
																														lblNewLabel_8)
																												.addComponent(
																														lblNewLabel_9))
																								.addGap(18)
																								.addGroup(
																										gl_panel.createParallelGroup(
																												Alignment.LEADING)
																												.addComponent(
																														dateChooser_1To,
																														GroupLayout.PREFERRED_SIZE,
																														GroupLayout.DEFAULT_SIZE,
																														GroupLayout.PREFERRED_SIZE)
																												.addComponent(
																														dateChooserFrom,
																														GroupLayout.PREFERRED_SIZE,
																														GroupLayout.DEFAULT_SIZE,
																														GroupLayout.PREFERRED_SIZE)
																												.addComponent(
																														BookingtextField_5,
																														Alignment.TRAILING,
																														GroupLayout.PREFERRED_SIZE,
																														GroupLayout.DEFAULT_SIZE,
																														GroupLayout.PREFERRED_SIZE)
																												.addComponent(
																														FeetextField_6,
																														Alignment.TRAILING,
																														GroupLayout.PREFERRED_SIZE,
																														GroupLayout.DEFAULT_SIZE,
																														GroupLayout.PREFERRED_SIZE)))
																				.addComponent(
																						btnNewButton))
																.addContainerGap(
																		62,
																		Short.MAX_VALUE))
												.addComponent(lblNewLabel_10))));
		gl_panel.setVerticalGroup(gl_panel
				.createParallelGroup(Alignment.LEADING)
				.addGroup(
						gl_panel.createSequentialGroup()
								.addGap(22)
								.addGroup(
										gl_panel.createParallelGroup(
												Alignment.BASELINE)
												.addComponent(lblNewLabel)
												.addComponent(
														NametextField,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE))
								.addGap(18)
								.addGroup(
										gl_panel.createParallelGroup(
												Alignment.BASELINE)
												.addComponent(lblNewLabel_1)
												.addComponent(
														categorytextField_1,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE))
								.addGroup(
										gl_panel.createParallelGroup(
												Alignment.LEADING)
												.addGroup(
														gl_panel.createSequentialGroup()
																.addGap(5)
																.addGroup(
																		gl_panel.createParallelGroup(
																				Alignment.LEADING)
																				.addGroup(
																						gl_panel.createSequentialGroup()
																								.addComponent(
																										lblNewLabel_6)
																								.addGap(18)
																								.addGroup(
																										gl_panel.createParallelGroup(
																												Alignment.LEADING)
																												.addComponent(
																														lblNewLabel_7)
																												.addGroup(
																														gl_panel.createSequentialGroup()
																																.addComponent(
																																		dateChooser_1To,
																																		GroupLayout.PREFERRED_SIZE,
																																		GroupLayout.DEFAULT_SIZE,
																																		GroupLayout.PREFERRED_SIZE)
																																.addPreferredGap(
																																		ComponentPlacement.RELATED,
																																		12,
																																		Short.MAX_VALUE)
																																.addGroup(
																																		gl_panel.createParallelGroup(
																																				Alignment.BASELINE)
																																				.addComponent(
																																						BookingtextField_5,
																																						GroupLayout.PREFERRED_SIZE,
																																						GroupLayout.DEFAULT_SIZE,
																																						GroupLayout.PREFERRED_SIZE)
																																				.addComponent(
																																						lblNewLabel_8))
																																.addGap(30)
																																.addGroup(
																																		gl_panel.createParallelGroup(
																																				Alignment.BASELINE)
																																				.addComponent(
																																						FeetextField_6,
																																						GroupLayout.PREFERRED_SIZE,
																																						GroupLayout.DEFAULT_SIZE,
																																						GroupLayout.PREFERRED_SIZE)
																																				.addComponent(
																																						lblNewLabel_9))
																																.addGap(31))))
																				.addComponent(
																						dateChooserFrom,
																						GroupLayout.PREFERRED_SIZE,
																						GroupLayout.DEFAULT_SIZE,
																						GroupLayout.PREFERRED_SIZE))
																.addGap(13)
																.addComponent(
																		btnNewButton)
																.addGap(20))
												.addGroup(
														gl_panel.createSequentialGroup()
																.addGap(18)
																.addGroup(
																		gl_panel.createParallelGroup(
																				Alignment.BASELINE)
																				.addComponent(
																						countrycomboBox,
																						GroupLayout.PREFERRED_SIZE,
																						GroupLayout.DEFAULT_SIZE,
																						GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						lblNewLabel_2))
																.addGap(20)
																.addGroup(
																		gl_panel.createParallelGroup(
																				Alignment.BASELINE)
																				.addComponent(
																						lblNewLabel_3)
																				.addComponent(
																						citytextField_2,
																						GroupLayout.PREFERRED_SIZE,
																						GroupLayout.DEFAULT_SIZE,
																						GroupLayout.PREFERRED_SIZE))
																.addGap(32)
																.addGroup(
																		gl_panel.createParallelGroup(
																				Alignment.BASELINE)
																				.addComponent(
																						adresstextField_3,
																						GroupLayout.PREFERRED_SIZE,
																						GroupLayout.DEFAULT_SIZE,
																						GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						lblNewLabel_4))
																.addGap(33)
																.addGroup(
																		gl_panel.createParallelGroup(
																				Alignment.BASELINE)
																				.addComponent(
																						lblNewLabel_10)
																				.addComponent(
																						descriptiontextField_7,
																						GroupLayout.PREFERRED_SIZE,
																						GroupLayout.DEFAULT_SIZE,
																						GroupLayout.PREFERRED_SIZE))))
								.addGap(73)
								.addGroup(
										gl_panel.createParallelGroup(
												Alignment.BASELINE)
												.addComponent(lblNewLabel_5)
												.addComponent(
														textField_4,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE))
								.addGap(11)));
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}

	public JComboBox getComboBox() {
		return countrycomboBox;
	}
}
