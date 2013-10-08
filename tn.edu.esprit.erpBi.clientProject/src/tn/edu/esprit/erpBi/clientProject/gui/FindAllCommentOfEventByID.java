package tn.edu.esprit.erpBi.clientProject.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import tn.edu.esprit.erpBi.clientProject.delegate.DelegateOfCommentEventManagementServicesRemote;
import tn.edu.esprit.erpBi.clientProject.delegate.DelegateOfEventManagementServicesRemote;
import tn.edu.esprit.erpBi.ejbProject.services.domain.CommentEvent;
import tn.edu.esprit.erpBi.ejbProject.services.domain.Event;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class FindAllCommentOfEventByID extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {

//					InputStream in;
//					try {
//						in = new FileInputStream(
//								new File(
//										"C:\\Users\\user\\Documents\\NetBeansProjects\\sense\\mkachkha.wav"));
////						AudioStream audios = new AudioStream(in);
////						AudioPlayer.player.start(audios);
//					} catch (Exception e) {
//						JOptionPane.showMessageDialog(null, e);
//					}

					FindAllCommentOfEventByID frame = new FindAllCommentOfEventByID();
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
	public FindAllCommentOfEventByID() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "List Comment", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JScrollPane js = new JScrollPane();
		JTable tabel = new JTable();
		DelegateOfCommentEventManagementServicesRemote delegateOfCommentEventManagementServicesRemote = new DelegateOfCommentEventManagementServicesRemote();


		List<CommentEvent> commentEvents;
		commentEvents = delegateOfCommentEventManagementServicesRemote.DofindCommentEventById(2);
		String[][] donnees = new String[commentEvents.size()][6];

		for (int i = 0; i < commentEvents.size(); i++) {

			donnees[i][0] =String.valueOf(commentEvents.get(i).getIdCommentEvent()) ;
			donnees[i][1] = commentEvents.get(i).getContent();
			donnees[i][2] = commentEvents.get(i).getDateCom().toString();
			donnees[i][3] = commentEvents.get(i).getName();
			donnees[i][5] = commentEvents.get(i).getEvent().getName_event();
		
		}
		tabel.setModel(new javax.swing.table.DefaultTableModel(

		donnees, new String[] { "id comment event", "content", "date com", "name",
				"name of event" }));

		js.setViewportView(tabel);

		panel.add(new JScrollPane(js), BorderLayout.SOUTH);
		panel.setSize(700, 700);
		
		JButton btnNewButton = new JButton("Liste Comment of this Event");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFrame fr =new JFrame();
				JScrollPane js = new JScrollPane();
				JTable tabel = new JTable();
				DelegateOfCommentEventManagementServicesRemote delegateOfCommentEventManagementServicesRemote = new DelegateOfCommentEventManagementServicesRemote();


				List<CommentEvent> commentEvents;
				 int idEvent = Integer.parseInt(textField.getText());
				
				commentEvents = delegateOfCommentEventManagementServicesRemote.DofindCommentEventById(idEvent);
				String[][] donnees = new String[commentEvents.size()][6];

				for (int i = 0; i < commentEvents.size(); i++) {

					donnees[i][0] =String.valueOf(commentEvents.get(i).getIdCommentEvent()) ;
					donnees[i][1] = commentEvents.get(i).getContent();
					donnees[i][2] = commentEvents.get(i).getDateCom().toString();
					donnees[i][3] = commentEvents.get(i).getName();
					donnees[i][4] = commentEvents.get(i).getEvent().getName_event();
					
					System.out.println("name of event is "+commentEvents.get(i).getEvent().getName_event());
				
				}
				tabel.setModel(new javax.swing.table.DefaultTableModel(

				donnees, new String[] { "id comment event", "content", "date comment", "name",
						"name of event" }));

				js.setViewportView(tabel);

				fr.getContentPane().add(new JScrollPane(js),BorderLayout.SOUTH);
				fr.setSize(1400,500);
				fr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				fr.setVisible(true);
				
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\JEE6ToolsEsprit\\Workspace\\hrmWorkspace2\\tn.edu.esprit.erpBi.clientProject\\src\\Image\\suivant.png"));
		btnNewButton.setBounds(34, 51, 245, 23);
		panel.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(34, 20, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		// panel.setDefaultCloseOperation(panel.);

		panel.setVisible(true);

	}
}
