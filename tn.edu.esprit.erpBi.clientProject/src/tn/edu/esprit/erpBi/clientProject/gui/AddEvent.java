package tn.edu.esprit.erpBi.clientProject.gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import tn.edu.esprit.erpBi.ejbProject.services.domain.Event;
import tn.edu.esprit.erpBi.ejbProject.services.interf.EventManagementServicesRemote;

import com.toedter.calendar.JCalendar;

public class AddEvent extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JComboBox comb;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	
	JCalendar jc = new JCalendar();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddEvent frame = new AddEvent();
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
	public AddEvent() {
		
		
		setTitle("ManageEvent");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 699, 440);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JPanel panelData = new JPanel();
		panelData.setBorder(new TitledBorder(UIManager
				.getBorder("TitledBorder.border"), "Create Event",
				TitledBorder.LEADING, TitledBorder.TOP, null,
				new Color(0, 0, 0)));

		JPanel panelButtom = new JPanel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(
				Alignment.LEADING).addGroup(
				gl_contentPane
						.createSequentialGroup()
						.addGap(22)
						.addComponent(panelData, GroupLayout.PREFERRED_SIZE,
								480, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panelButtom, GroupLayout.DEFAULT_SIZE,
								155, Short.MAX_VALUE).addContainerGap()));
		gl_contentPane.setVerticalGroup(gl_contentPane
				.createParallelGroup(Alignment.LEADING)
				.addGroup(
						gl_contentPane
								.createSequentialGroup()
								.addGap(47)
								.addComponent(panelButtom,
										GroupLayout.PREFERRED_SIZE, 294,
										GroupLayout.PREFERRED_SIZE)
								.addContainerGap())
				.addGroup(
						gl_contentPane
								.createSequentialGroup()
								.addContainerGap()
								.addComponent(panelData,
										GroupLayout.PREFERRED_SIZE, 370,
										Short.MAX_VALUE).addGap(9)));

		JButton btnNewButton = new JButton("Create event");
		btnNewButton.addActionListener(new ActionListener() {

			public void initFrame() throws NamingException {
				Context context = new InitialContext();
				EventManagementServicesRemote proxy = (EventManagementServicesRemote) context
						.lookup("ejb:/tn.edu.esprit.erpBi.ejbProjectt/EventManagementServices!tn.edu.esprit.erpBi.ejbProject.services.interf.EventManagementServicesRemote");

			}

			public void actionPerformed(ActionEvent e) {

				try {
					initFrame();
					Context context = new InitialContext();
					EventManagementServicesRemote proxy = (EventManagementServicesRemote) context
							.lookup("ejb:/tn.edu.esprit.erpBi.ejbProjectt/EventManagementServices!tn.edu.esprit.erpBi.ejbProject.services.interf.EventManagementServicesRemote");
					Date date = new Date();
					SimpleDateFormat dateFormatComp;

					dateFormatComp = new SimpleDateFormat(
							"dd MMM yyyy hh:mm:ss a");
					
					Calendar calendar = jc.getCalendar();
					System.out.println(calendar.get(Calendar.DAY_OF_MONTH));

					
					// System.out.println(dateFormatComp.format(date));
				//	Event event = new Event(textField.getText(), textField_2
					//		.getText());
					// Event event = new
					// Event(textField.getText(),textField_2.getText(),comb.getName(),textField_1.getText(),textField_7.getText(),dateFormatComp,dateFormatComp,textField_5.get,textField_6.getText());
			//		proxy.addEvent(event);
				} catch (NamingException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		GroupLayout gl_panelButtom = new GroupLayout(panelButtom);
		gl_panelButtom.setHorizontalGroup(gl_panelButtom.createParallelGroup(
				Alignment.LEADING).addGroup(
				gl_panelButtom.createSequentialGroup().addGap(18)
						.addComponent(btnNewButton)
						.addContainerGap(48, Short.MAX_VALUE)));
		gl_panelButtom.setVerticalGroup(gl_panelButtom.createParallelGroup(
				Alignment.LEADING).addGroup(
				gl_panelButtom.createSequentialGroup().addGap(48)
						.addComponent(btnNewButton)
						.addContainerGap(223, Short.MAX_VALUE)));
		panelButtom.setLayout(gl_panelButtom);

		JLabel lblName = new JLabel("Name");

		JLabel lblNewLabel = new JLabel("Category");

		JLabel lblCity = new JLabel("City");

		JLabel lblAdress = new JLabel("Adress");

		JLabel lblDescription = new JLabel("Description");

		JLabel lblNewLabel_1 = new JLabel("Date start");

		JLabel lblNewLabel_2 = new JLabel("Booking");

		JLabel lblNewLabel_3 = new JLabel("Fee");

		JLabel lblDateEnd = new JLabel("Date end");

		textField = new JTextField();
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setColumns(10);

		textField_4 = new JTextField();
		textField_4.setColumns(10);

		textField_5 = new JTextField();
		textField_5.setColumns(10);

		textField_6 = new JTextField();
		textField_6.setColumns(10);

		textField_7 = new JTextField();
		textField_7.setColumns(10);

		JCalendar jc = new JCalendar();
		

		JComboBox comboBox = new JComboBox();
		GroupLayout gl_panelData = new GroupLayout(panelData);
		gl_panelData.setHorizontalGroup(gl_panelData
				.createParallelGroup(Alignment.LEADING)
				.addGroup(
						gl_panelData
								.createSequentialGroup()
								.addGap(10)
								.addComponent(lblName)
								.addGap(62)
								.addComponent(textField,
										GroupLayout.PREFERRED_SIZE, 94,
										GroupLayout.PREFERRED_SIZE))
				.addGroup(
						gl_panelData
								.createSequentialGroup()
								.addGap(10)
								.addComponent(lblNewLabel)
								.addGap(44)
								.addComponent(textField_2,
										GroupLayout.PREFERRED_SIZE, 94,
										GroupLayout.PREFERRED_SIZE))
				.addGroup(
						gl_panelData
								.createSequentialGroup()
								.addGap(10)
								.addComponent(lblCity)
								.addGap(70)
								.addComponent(comboBox,
										GroupLayout.PREFERRED_SIZE, 94,
										GroupLayout.PREFERRED_SIZE))
				.addGroup(
						gl_panelData
								.createSequentialGroup()
								.addGap(10)
								.addComponent(lblAdress)
								.addGap(56)
								.addComponent(textField_1,
										GroupLayout.PREFERRED_SIZE, 94,
										GroupLayout.PREFERRED_SIZE))
				.addGroup(
						gl_panelData
								.createSequentialGroup()
								.addGap(10)
								.addComponent(lblDescription)
								.addGap(36)
								.addComponent(textField_7,
										GroupLayout.PREFERRED_SIZE, 94,
										GroupLayout.PREFERRED_SIZE))
				.addGroup(
						gl_panelData
								.createSequentialGroup()
								.addGap(10)
								.addComponent(lblNewLabel_1)
								.addGap(40)
								.addComponent(textField_3,
										GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addComponent(lblDateEnd)
								.addGap(34)
								.addComponent(textField_4,
										GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
				.addGroup(
						gl_panelData
								.createSequentialGroup()
								.addGap(22)
								.addComponent(lblNewLabel_2)
								.addGap(40)
								.addComponent(textField_5,
										GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
				.addGroup(
						gl_panelData
								.createSequentialGroup()
								.addGap(10)
								.addComponent(lblNewLabel_3,
										GroupLayout.PREFERRED_SIZE, 27,
										GroupLayout.PREFERRED_SIZE)
								.addGap(62)
								.addComponent(textField_6,
										GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)));
		gl_panelData
				.setVerticalGroup(gl_panelData
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								gl_panelData
										.createSequentialGroup()
										.addGap(20)
										.addGroup(
												gl_panelData
														.createParallelGroup(
																Alignment.LEADING)
														.addGroup(
																gl_panelData
																		.createSequentialGroup()
																		.addGap(6)
																		.addComponent(
																				lblName))
														.addComponent(
																textField,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))
										.addGap(18)
										.addGroup(
												gl_panelData
														.createParallelGroup(
																Alignment.LEADING)
														.addGroup(
																gl_panelData
																		.createSequentialGroup()
																		.addGap(3)
																		.addComponent(
																				lblNewLabel))
														.addComponent(
																textField_2,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))
										.addGap(26)
										.addGroup(
												gl_panelData
														.createParallelGroup(
																Alignment.LEADING)
														.addGroup(
																gl_panelData
																		.createSequentialGroup()
																		.addGap(6)
																		.addComponent(
																				lblCity))
														.addComponent(
																comboBox,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))
										.addGap(18)
										.addGroup(
												gl_panelData
														.createParallelGroup(
																Alignment.LEADING)
														.addGroup(
																gl_panelData
																		.createSequentialGroup()
																		.addGap(3)
																		.addComponent(
																				lblAdress))
														.addComponent(
																textField_1,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))
										.addGap(35)
										.addGroup(
												gl_panelData
														.createParallelGroup(
																Alignment.LEADING)
														.addGroup(
																gl_panelData
																		.createSequentialGroup()
																		.addGap(2)
																		.addComponent(
																				lblDescription))
														.addComponent(
																textField_7,
																GroupLayout.PREFERRED_SIZE,
																17,
																GroupLayout.PREFERRED_SIZE))
										.addGap(41)
										.addGroup(
												gl_panelData
														.createParallelGroup(
																Alignment.LEADING)
														.addComponent(
																lblNewLabel_1)
														.addComponent(
																textField_3,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE)
														.addGroup(
																gl_panelData
																		.createSequentialGroup()
																		.addGap(3)
																		.addComponent(
																				lblDateEnd))
														.addComponent(
																textField_4,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))
										.addGap(18)
										.addGroup(
												gl_panelData
														.createParallelGroup(
																Alignment.LEADING)
														.addComponent(
																lblNewLabel_2)
														.addComponent(
																textField_5,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))
										.addGap(12)
										.addGroup(
												gl_panelData
														.createParallelGroup(
																Alignment.LEADING)
														.addGroup(
																gl_panelData
																		.createSequentialGroup()
																		.addGap(3)
																		.addComponent(
																				lblNewLabel_3))
														.addComponent(
																textField_6,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))));
		panelData.setLayout(gl_panelData);
		contentPane.setLayout(gl_contentPane);
	}
}
