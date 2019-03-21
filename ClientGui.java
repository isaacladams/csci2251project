import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
	
public class ClientGui extends JFrame {
		
	//MatrixGui constructor - accepts SharedArray for storing file input and output results 
	public ClientGui() {
		super("Real Estate Management System v1.0");
			
		//set layout for JFrame to enable customizing JPane elements layout
		setLayout(new BorderLayout()); 
			
		//create JPanes to hold GUI elements and define Listeners
		createGui(this);
	}
	
	public void createGui(ClientGui clientGui) {
			
		//create main panel to hold other panels
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		add(mainPanel);
		JMenuBar menubar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		JMenuItem file1 = new JMenuItem("Exit");
		fileMenu.add(file1);
		menubar.add(fileMenu);
		JMenu actionMenu = new JMenu("Actions");
		JMenuItem actions1 = new JMenuItem("Balance Statement");
		JMenuItem actions2 = new JMenuItem("Late Payment Notice");
		JMenuItem actions3 = new JMenuItem("Warning Letter");
		JMenuItem actions4 = new JMenuItem("Termination Letter");
		JMenuItem actions5 = new JMenuItem("Evacuation Letter");
		actionMenu.add(actions1);
		actionMenu.add(actions2);
		actionMenu.add(actions3);
		actionMenu.add(actions4);
		actionMenu.add(actions5);
		menubar.add(actionMenu);
		JMenu settingsMenu = new JMenu("Settings");
		JMenuItem settings1 = new JMenuItem("Server Settings");
		settingsMenu.add(settings1);
		menubar.add(settingsMenu);
		this.setJMenuBar(menubar);
			
		//create panel for menus
		JPanel panel1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel1.setBorder(new EmptyBorder(30, 10, 10, 10));
		JLabel label1 = new JLabel("Search Records:");
		JTextField searchTerm = new JTextField(40);
		label1.setPreferredSize(new Dimension(100,20));
		searchTerm.setPreferredSize(new Dimension(500,20));
		searchTerm.setFont(new Font("monospaced", Font.PLAIN, 14));
		panel1.add(label1);
		panel1.add(searchTerm);
		mainPanel.add(panel1);
			
		//create panel for textarea to display results
		JPanel panel2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel2.setBorder(new EmptyBorder(10, 10, 10, 10));
		String[] columnNames = {"Property ID","Tenant Info","Address","Description","Availability","Status"};
		String[][] data = {{"A","A","A","A","A","A"},{"B","B","B","B","B","B"}};
		JTable resultsTable = new JTable(data, columnNames);
		JScrollPane scrollPane = new JScrollPane(resultsTable);
		resultsTable.setFillsViewportHeight(true);
		resultsTable.setAutoCreateRowSorter(true);
		resultsTable.setFont(new Font("monospaced", Font.PLAIN, 14));
		scrollPane.setPreferredSize(new Dimension(750,500));
		panel2.add(scrollPane);
		mainPanel.add(panel2);
			
			
		//actionlistener to set threads
		file1.addActionListener(
			new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent event) {
					System.exit(0);
				}
			}
	    );
		
		settings1.addActionListener(
				new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent event) {
						JDialog settingsDialog = new JDialog(clientGui, true);
						settingsDialog.setLayout(new GridLayout(2,1));
						JPanel settingsPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
						settingsPanel.setBorder(new EmptyBorder(15, 30, 30, 30));
						JLabel server = new JLabel("Server IP:");
						JTextField serverIP = new JTextField(18);
						serverIP.setText("127.0.0.1");
						server.setPreferredSize(new Dimension(100,20));
						serverIP.setPreferredSize(new Dimension(100,20));
						settingsPanel.add(server);
						settingsPanel.add(serverIP);
						JPanel settingsButtons = new JPanel(new FlowLayout(FlowLayout.LEFT));
						settingsButtons.setBorder(new EmptyBorder(0, 30, 0, 30));
						JButton okButton = new JButton("OK");
						JButton cancelButton = new JButton("Cancel");
						okButton.setPreferredSize(new Dimension(75,20));
						cancelButton.setPreferredSize(new Dimension(75,20));
						settingsButtons.add(okButton);
						settingsButtons.add(cancelButton);
						settingsDialog.add(settingsPanel);
						settingsDialog.add(settingsButtons);
						settingsDialog.setSize(new Dimension(300,200));
						settingsDialog.setVisible(true);
					}
				}
		    );
	}		
}
