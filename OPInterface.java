import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JSpinner;
import javax.swing.JRadioButton;

public class OPInterface {

	private JFrame frame;
	
	//Initializing values for database connection
	static Connection connection = null;
	static String databaseName = "one_piece";
	static String url = "jdbc:mysql://localhost:3306/" + databaseName;
	static String username = "root";
	static String password = "Zoro#SS!";
	
	//Initialize the GUI text fields
	private JTextField userField;
	private JTextField passField;
	private JTextField LnameField;
	private JTextField MinitField;
	private JTextField FnameField;
	private JTextField BdateField;
	private JTextField sexField;
	private JTextField raceField;
	private JTextField epithetField;
	private JTextField classField;
	private JTextField affiliationField;
	private JTextField crewField;
	private JTextField chapterField;
	private JTextField episodeField;
	private JTextField bountyField;
	private JTextField devilField;
	private JTextField englishField;
	private JTextField homeField;
	private JTextField locationField;
	private JTextField crewCapField;
	private JTextField crewNameField;
	private JTextField shipField;
	private JTextField textField;
	private JTextField textField2;
	private JTextField deleteNameField;
	private JTextField deleteCrewField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OPInterface window = new OPInterface();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public OPInterface() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws SQLException 
	 */
	private void initialize() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		
		//Establish connection with the MySQL Server
		Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		connection = DriverManager.getConnection(url, username, password);
		
		//Initialize JFrame
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 15));
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().setForeground(Color.BLACK);
		frame.setBounds(100, 100, 796, 518);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//Creating the different pages/panels
		JPanel Screen1 = new JPanel();
		Screen1.setBackground(Color.RED);
		Screen1.setBounds(0, 0, 782, 481);
		Screen1.setLayout(null);
		frame.getContentPane().add(Screen1);
		
		JPanel ScreenGenerate1 = new JPanel();
		ScreenGenerate1.setBackground(Color.RED);
		ScreenGenerate1.setBounds(0, 0, 782, 481);
		ScreenGenerate1.setLayout(null);
		
		JPanel ScreenChoose = new JPanel();
		ScreenChoose.setBackground(Color.RED);
		ScreenChoose.setBounds(0, 0, 782, 481);
		ScreenChoose.setLayout(null);
		
		JPanel ScreenGenerate2 = new JPanel();
		ScreenGenerate2.setBackground(Color.RED);
		ScreenGenerate2.setBounds(0, 0, 782, 481);
		ScreenGenerate2.setLayout(null);
		
		JPanel ScreenCharacter = new JPanel();
		ScreenCharacter.setBackground(Color.RED);
		ScreenCharacter.setBounds(0, 0, 782, 481);
		ScreenCharacter.setLayout(null);
		
		JPanel ScreenCrews = new JPanel();
		ScreenCrews.setBackground(Color.RED);
		ScreenCrews.setBounds(0, 0, 782, 481);
		ScreenCrews.setLayout(null);
		
		JPanel ScreenCrews2 = new JPanel();
		ScreenCrews2.setBackground(Color.RED);
		ScreenCrews2.setBounds(0, 0, 782, 481);
		ScreenCrews2.setLayout(null);
		
		JPanel Screen3 = new JPanel();
		Screen3.setBackground(Color.RED);
		Screen3.setBounds(0, 0, 782, 481);
		Screen3.setLayout(null);
		
		JPanel ScreenInsert = new JPanel();
		ScreenInsert.setBackground(Color.RED);
		ScreenInsert.setBounds(0, 0, 782, 481);
		ScreenInsert.setLayout(null);
				
		JPanel ScreenDelete = new JPanel();
		ScreenDelete.setBackground(Color.RED);
		ScreenDelete.setBounds(0, 0, 782, 481);
		ScreenDelete.setLayout(null);
		
		JPanel Screen2 = new JPanel();
		Screen2.setBackground(Color.RED);
		Screen2.setBounds(0, 0, 782, 481);
		Screen2.setLayout(null);
		
		JPanel ScreenDeleteChar = new JPanel();
		ScreenDeleteChar.setBackground(Color.RED);
		ScreenDeleteChar.setBounds(0, 0, 782, 481);
		ScreenDeleteChar.setLayout(null);
		
		JPanel ScreenDeleteCrew = new JPanel();
		ScreenDeleteCrew.setBackground(Color.RED);
		ScreenDeleteCrew.setBounds(0, 0, 782, 481);
		ScreenDeleteCrew.setLayout(null);
								
										
										JPanel ScreenTitleCard = new JPanel();
										ScreenTitleCard.setLayout(null);
										ScreenTitleCard.setBackground(Color.RED);
										ScreenTitleCard.setBounds(0, 0, 782, 481);
										
										
										JLabel LnameLabel_1 = new JLabel("Last Name:");
										LnameLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
										LnameLabel_1.setBounds(10, 10, 96, 38);
										ScreenTitleCard.add(LnameLabel_1);
										
										JLabel MnameLabel_1 = new JLabel("Middle Initial:");
										MnameLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
										MnameLabel_1.setBounds(10, 58, 125, 38);
										ScreenTitleCard.add(MnameLabel_1);
										
										JLabel FnameLabel_1 = new JLabel("First Name:");
										FnameLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
										FnameLabel_1.setBounds(10, 106, 96, 38);
										ScreenTitleCard.add(FnameLabel_1);
										
										JLabel BdateLabel_1 = new JLabel("Birthday:");
										BdateLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
										BdateLabel_1.setBounds(10, 154, 96, 38);
										ScreenTitleCard.add(BdateLabel_1);
										
										JLabel sexLabel_1 = new JLabel("Sex:");
										sexLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
										sexLabel_1.setBounds(10, 202, 96, 38);
										ScreenTitleCard.add(sexLabel_1);
										
										JLabel raceLabel_1 = new JLabel("Race:");
										raceLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
										raceLabel_1.setBounds(10, 250, 96, 38);
										ScreenTitleCard.add(raceLabel_1);
										
										JLabel epithetLabel_1 = new JLabel("Epithet:");
										epithetLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
										epithetLabel_1.setBounds(10, 298, 96, 38);
										ScreenTitleCard.add(epithetLabel_1);
										
										JLabel classLabel_1 = new JLabel("Classification:");
										classLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
										classLabel_1.setBounds(10, 346, 125, 38);
										ScreenTitleCard.add(classLabel_1);
										
										JLabel typeLabel = new JLabel("Type In The Character's First Name");
										typeLabel.setHorizontalAlignment(SwingConstants.CENTER);
										typeLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
										typeLabel.setBounds(94, 10, 583, 60);
										ScreenGenerate1.add(typeLabel);
										
										JButton backButton2_1 = new JButton("Back");
										backButton2_1.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												frame.setContentPane(ScreenGenerate1);
												frame.repaint();
												frame.revalidate();
												typeLabel.setText("Type In The Character's First Name");
												textField.setText("");
											}
										});
										backButton2_1.setForeground(Color.RED);
										backButton2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
										backButton2_1.setBackground(Color.WHITE);
										backButton2_1.setBounds(10, 406, 119, 55);
										ScreenTitleCard.add(backButton2_1);
										
										JLabel affiliationLabel_1 = new JLabel("Affiliation:");
										affiliationLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
										affiliationLabel_1.setBounds(309, 10, 96, 38);
										ScreenTitleCard.add(affiliationLabel_1);
										
										JLabel crewLabel_1 = new JLabel("Crew:");
										crewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
										crewLabel_1.setBounds(309, 58, 96, 38);
										ScreenTitleCard.add(crewLabel_1);
										
										JLabel chapterLabel_1 = new JLabel("First Chapter:");
										chapterLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
										chapterLabel_1.setBounds(309, 106, 119, 38);
										ScreenTitleCard.add(chapterLabel_1);
										
										JLabel episodeLabel_1 = new JLabel("First Episode:");
										episodeLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
										episodeLabel_1.setBounds(309, 154, 119, 38);
										ScreenTitleCard.add(episodeLabel_1);
										
										JLabel bountyLabel_1 = new JLabel("Bounty: ");
										bountyLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
										bountyLabel_1.setBounds(309, 202, 119, 38);
										ScreenTitleCard.add(bountyLabel_1);
										
										JLabel devilLabel_1 = new JLabel("Devil Fruit:");
										devilLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
										devilLabel_1.setBounds(309, 250, 119, 38);
										ScreenTitleCard.add(devilLabel_1);
										
										JLabel englishLabel_1 = new JLabel("English Ver:");
										englishLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
										englishLabel_1.setBounds(309, 298, 119, 38);
										ScreenTitleCard.add(englishLabel_1);
										
										JLabel hakiLabel_1 = new JLabel("Haki User:");
										hakiLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
										hakiLabel_1.setBounds(309, 346, 119, 38);
										ScreenTitleCard.add(hakiLabel_1);
										
										JLabel homeLabel_1 = new JLabel("Hometown:");
										homeLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
										homeLabel_1.setBounds(484, 106, 119, 38);
										ScreenTitleCard.add(homeLabel_1);
										
										JLabel locationLabel_1 = new JLabel("Location:");
										locationLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
										locationLabel_1.setBounds(484, 154, 119, 38);
										ScreenTitleCard.add(locationLabel_1);
										
										JLabel LnameAnswer = new JLabel("Answer");
										LnameAnswer.setFont(new Font("Tahoma", Font.BOLD, 16));
										LnameAnswer.setBounds(116, 10, 110, 38);
										ScreenTitleCard.add(LnameAnswer);
										
										JLabel MinitAnswer = new JLabel("Answer");
										MinitAnswer.setFont(new Font("Tahoma", Font.BOLD, 16));
										MinitAnswer.setBounds(126, 58, 110, 38);
										ScreenTitleCard.add(MinitAnswer);
										
										JLabel FnameAnswer = new JLabel("Answer");
										FnameAnswer.setFont(new Font("Tahoma", Font.BOLD, 16));
										FnameAnswer.setBounds(116, 106, 110, 38);
										ScreenTitleCard.add(FnameAnswer);
										
										JLabel BdateAnswer = new JLabel("Answer");
										BdateAnswer.setFont(new Font("Tahoma", Font.BOLD, 16));
										BdateAnswer.setBounds(92, 154, 200, 38);
										ScreenTitleCard.add(BdateAnswer);
										
										JLabel sexAnswer = new JLabel("Answer");
										sexAnswer.setFont(new Font("Tahoma", Font.BOLD, 16));
										sexAnswer.setBounds(53, 202, 110, 38);
										ScreenTitleCard.add(sexAnswer);
										
										JLabel raceAnswer = new JLabel("Answer");
										raceAnswer.setFont(new Font("Tahoma", Font.BOLD, 16));
										raceAnswer.setBounds(63, 250, 110, 38);
										ScreenTitleCard.add(raceAnswer);
										
										JLabel epithetAnswer = new JLabel("Answer");
										epithetAnswer.setFont(new Font("Tahoma", Font.BOLD, 16));
										epithetAnswer.setBounds(92, 298, 200, 38);
										ScreenTitleCard.add(epithetAnswer);
										
										JLabel classAnswer = new JLabel("Answer");
										classAnswer.setFont(new Font("Tahoma", Font.BOLD, 16));
										classAnswer.setBounds(139, 346, 110, 38);
										ScreenTitleCard.add(classAnswer);
										
										JLabel affiliationAnswer = new JLabel("Answer");
										affiliationAnswer.setFont(new Font("Tahoma", Font.BOLD, 16));
										affiliationAnswer.setBounds(401, 10, 110, 38);
										ScreenTitleCard.add(affiliationAnswer);
										
										JLabel crewAnswer = new JLabel("Answer");
										crewAnswer.setFont(new Font("Tahoma", Font.BOLD, 16));
										crewAnswer.setBounds(366, 58, 200, 38);
										ScreenTitleCard.add(crewAnswer);
										
										JLabel chapterAnswer = new JLabel("Answer");
										chapterAnswer.setFont(new Font("Tahoma", Font.BOLD, 16));
										chapterAnswer.setBounds(430, 118, 154, 26);
										ScreenTitleCard.add(chapterAnswer);
										
										JLabel episodeAnswer = new JLabel("Answer");
										episodeAnswer.setFont(new Font("Tahoma", Font.BOLD, 16));
										episodeAnswer.setBounds(430, 166, 154, 26);
										ScreenTitleCard.add(episodeAnswer);
										
										JLabel bountyAnswer = new JLabel("Answer");
										bountyAnswer.setFont(new Font("Tahoma", Font.BOLD, 16));
										bountyAnswer.setBounds(430, 214, 200, 26);
										ScreenTitleCard.add(bountyAnswer);
										
										JLabel devilAnswer = new JLabel("Answer");
										devilAnswer.setFont(new Font("Tahoma", Font.BOLD, 16));
										devilAnswer.setBounds(430, 262, 200, 26);
										ScreenTitleCard.add(devilAnswer);
										
										JLabel englishAnswer = new JLabel("Answer");
										englishAnswer.setFont(new Font("Tahoma", Font.BOLD, 16));
										englishAnswer.setBounds(430, 310, 200, 26);
										ScreenTitleCard.add(englishAnswer);
										
										JLabel hometownAnswer = new JLabel("Answer");
										hometownAnswer.setFont(new Font("Tahoma", Font.BOLD, 16));
										hometownAnswer.setBounds(600, 106, 200, 26);
										ScreenTitleCard.add(hometownAnswer);
										
										JLabel locationAnswer = new JLabel("Answer");
										locationAnswer.setFont(new Font("Tahoma", Font.BOLD, 16));
										locationAnswer.setBounds(600, 154, 200, 26);
										ScreenTitleCard.add(locationAnswer);
										
										JLabel hakiAnswer = new JLabel("Answer");
										hakiAnswer.setFont(new Font("Tahoma", Font.BOLD, 16));
										hakiAnswer.setBounds(438, 355, 200, 21);
										ScreenTitleCard.add(hakiAnswer);
										
										deleteCrewField = new JTextField();
										deleteCrewField.setFont(new Font("Tahoma", Font.PLAIN, 22));
										deleteCrewField.setBounds(285, 139, 190, 45);
										ScreenDeleteCrew.add(deleteCrewField);
										deleteCrewField.setColumns(10);
										
										JLabel deleteLabel3 = new JLabel("DELETED");
										deleteLabel3.setHorizontalAlignment(SwingConstants.CENTER);
										deleteLabel3.setFont(new Font("Tahoma", Font.BOLD, 22));
										deleteLabel3.setBounds(285, 64, 190, 45);
										ScreenDeleteCrew.add(deleteLabel3);
										deleteLabel3.hide();
										
										JLabel typeLabel4 = new JLabel("Type In The Crew's Name");
										typeLabel4.setHorizontalAlignment(SwingConstants.CENTER);
										typeLabel4.setFont(new Font("Tahoma", Font.BOLD, 22));
										typeLabel4.setBounds(94, 10, 583, 60);
										ScreenDeleteCrew.add(typeLabel4);
										
										JButton deleteCrewButton = new JButton("Delete");
										deleteCrewButton.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												PreparedStatement ps = null;
												String crew = deleteCrewField.getText();
												try {
													ps = connection.prepareStatement("SELECT * FROM crews WHERE crew_name = ?");
													ps.setString(1, crew);
													
													ResultSet result = ps.executeQuery();
													
													if (result.next()) {
														ps = connection.prepareStatement("DELETE FROM crews WHERE crew_name= ?;");
														ps.setString(1, crew);
													
														int status = ps.executeUpdate();
													
														if (status != 0) {
														deleteLabel3.show();
														}
													}
													else {
														typeLabel4.setText("This crew does not exist. Try again");
													}
												}
												catch (SQLException e1) {
													// TODO Auto-generated catch block
													e1.printStackTrace();
												}
													
											}
										});
										deleteCrewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
										deleteCrewButton.setBounds(314, 204, 134, 45);
										ScreenDeleteCrew.add(deleteCrewButton);
										
										
										JButton logoutButton2_2 = new JButton("Logout");
										logoutButton2_2.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												frame.setContentPane(Screen1);
												frame.repaint();
												frame.revalidate();
											}
										});
										logoutButton2_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
										logoutButton2_2.setBounds(10, 10, 104, 48);
										ScreenDeleteCrew.add(logoutButton2_2);
										
										JButton backButton3_2 = new JButton("Back");
										backButton3_2.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												frame.setContentPane(ScreenDelete);
												frame.repaint();
												frame.revalidate();
											}
										});
										backButton3_2.setForeground(Color.RED);
										backButton3_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
										backButton3_2.setBackground(Color.WHITE);
										backButton3_2.setBounds(10, 416, 119, 55);
										ScreenDeleteCrew.add(backButton3_2);
																														
										deleteNameField = new JTextField();
										deleteNameField.setFont(new Font("Tahoma", Font.PLAIN, 18));
										deleteNameField.setBounds(285, 139, 190, 45);
										ScreenDeleteChar.add(deleteNameField);
										deleteNameField.setColumns(10);
										
										JLabel deleteLabel2 = new JLabel("DELETED");
										deleteLabel2.setHorizontalAlignment(SwingConstants.CENTER);
										deleteLabel2.setFont(new Font("Tahoma", Font.BOLD, 22));
										deleteLabel2.setBounds(285, 64, 190, 45);
										ScreenDeleteChar.add(deleteLabel2);
										deleteLabel2.hide();
										
										JLabel typeLabel3 = new JLabel("Type In The Character's First Name");
										typeLabel3.setHorizontalAlignment(SwingConstants.CENTER);
										typeLabel3.setFont(new Font("Tahoma", Font.BOLD, 22));
										typeLabel3.setBounds(94, 10, 583, 60);
										ScreenDeleteChar.add(typeLabel3);
										
										JButton deleteCharButton = new JButton("Delete");
										deleteCharButton.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												PreparedStatement ps = null;
												String name = deleteNameField.getText();
												try {
													ps = connection.prepareStatement("SELECT * FROM characters WHERE first_name = ?");
													ps.setString(1, name);
													
													ResultSet result = ps.executeQuery();
													
													if (result.next()) {
														ps = connection.prepareStatement("DELETE FROM appearances WHERE pirate_name= ?;");
														ps.setString(1, name);
													
														ps.executeUpdate();
														
														ps = connection.prepareStatement("DELETE FROM haki_users WHERE pirate_name= ?;");
														ps.setString(1, name);
													
														ps.executeUpdate();
														
														ps = connection.prepareStatement("DELETE FROM hometown WHERE pirate_name= ?;");
														ps.setString(1, name);
													
														ps.executeUpdate();
														
														ps = connection.prepareStatement("DELETE FROM bounties WHERE pirate_name= ?;");
														ps.setString(1, name);
													
														ps.executeUpdate();
														
														ps = connection.prepareStatement("DELETE FROM haki_users WHERE pirate_name= ?;");
														ps.setString(1, name);
													
														ps.executeUpdate();
														
														ps = connection.prepareStatement("DELETE FROM devil_fruits WHERE pirate_name= ?;");
														ps.setString(1, name);
													
														int status = ps.executeUpdate();
													
														if (status != 0) {
															ps = connection.prepareStatement("DELETE FROM characters WHERE first_name= ?;");
															ps.setString(1, name);
														
															status = ps.executeUpdate();
														
															if (status !=0 ) {
																deleteLabel2.show();
															}
														}
													}
													else {
														typeLabel3.setText("That character does not exist. Try again.");
													}
												}												
												catch (SQLException e1) {
													// TODO Auto-generated catch block
													e1.printStackTrace();
												}
											}
													
											});
										deleteCharButton.setFont(new Font("Tahoma", Font.BOLD, 16));
										deleteCharButton.setBounds(314, 204, 134, 45);
										ScreenDeleteChar.add(deleteCharButton);
										
										
										JButton logoutButton2_1 = new JButton("Logout");
										logoutButton2_1.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												frame.setContentPane(Screen1);
												frame.repaint();
												frame.revalidate();
											}
										});
										logoutButton2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
										logoutButton2_1.setBounds(10, 10, 104, 48);
										ScreenDeleteChar.add(logoutButton2_1);
										
										JButton backButton3_1 = new JButton("Back");
										backButton3_1.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												frame.setContentPane(ScreenDelete);
												frame.repaint();
												frame.revalidate();
											}
										});
										backButton3_1.setForeground(Color.RED);
										backButton3_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
										backButton3_1.setBackground(Color.WHITE);
										backButton3_1.setBounds(10, 416, 119, 55);
										ScreenDeleteChar.add(backButton3_1);
										
										textField = new JTextField();
										textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
										textField.setBounds(285, 139, 190, 45);
										ScreenGenerate1.add(textField);
										textField.setColumns(10);
										
										JButton generateButton = new JButton("Generate");
										generateButton.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												PreparedStatement ps = null;
												PreparedStatement ps2 = null;
												PreparedStatement ps3 = null;
												PreparedStatement ps4 = null;
												PreparedStatement ps5 = null;
												PreparedStatement ps6 = null;
												try {
													ps = connection.prepareStatement("SELECT * FROM characters WHERE first_name= ?;");
													ps.setString(1, textField.getText());
													
													ps2 = connection.prepareStatement("SELECT current_bounty FROM bounties WHERE pirate_name= ?;");
													ps2.setString(1, textField.getText());
													
													ps3 = connection.prepareStatement("SELECT first_chapter, first_episode FROM appearances WHERE pirate_name= ?;");
													ps3.setString(1, textField.getText());
													
													ps4 = connection.prepareStatement("SELECT hometown, location FROM hometown WHERE pirate_name= ?;");
													ps4.setString(1, textField.getText());
													
													ps5 = connection.prepareStatement("SELECT devil_fruit, english_ver FROM devil_fruits WHERE pirate_name= ?;");
													ps5.setString(1, textField.getText());
													
													ps6 = connection.prepareStatement("SELECT observation, armament, conquerors FROM haki_users WHERE pirate_name= ?;");
													ps6 .setString(1, textField.getText());
												}
												catch (SQLException e1) {
													// TODO Auto-generated catch block
													e1.printStackTrace();
												}
												finally {
													try {
														ResultSet result = ps.executeQuery();
														if (result.next()) {
															
															frame.setContentPane(ScreenTitleCard);
															frame.repaint();
															frame.revalidate();
															
															LnameAnswer.setText(result.getString("last_name"));
															MinitAnswer.setText(result.getString("m_init"));
															FnameAnswer.setText(result.getString("first_name"));
															BdateAnswer.setText(result.getString("b_date"));
															sexAnswer.setText(result.getString("sex"));
															raceAnswer.setText(result.getString("race"));
															epithetAnswer.setText(result.getString("epithet"));
															classAnswer.setText(result.getString("classification"));
															affiliationAnswer.setText(result.getString("affiliation"));
															crewAnswer.setText(result.getString("crew"));
														}
														else {
															typeLabel.setText("That character does not exist. Try again");
														}
														ResultSet result2 = ps2.executeQuery();
														if (result2.next()) {
															
															bountyAnswer.setText(result2.getString("current_bounty"));
														}
														
														ResultSet result3 = ps3.executeQuery();
														if (result3.next()) {
															
															chapterAnswer.setText(result3.getString("first_chapter"));
															episodeAnswer.setText(result3.getString("first_episode"));
														}
														
														ResultSet result4 = ps4.executeQuery();
														if (result4.next()) {
															
															hometownAnswer.setText(result4.getString("hometown"));
															locationAnswer.setText(result4.getString("location"));
														}
														
														ResultSet result5 = ps5.executeQuery();
														if (result5.next()) {
															
															devilAnswer.setText(result5.getString("devil_fruit"));
															englishAnswer.setText(result5.getString("english_ver"));
														}
														
														ResultSet result6 = ps6.executeQuery();
														if (result6.next()) {
															
															hakiAnswer.setText("Obv: " + result6.getString("observation") + " Arm: " + result6.getString("armament") + " Conq: " + result6.getString("conquerors"));
														}
													}
													catch(SQLException e1) {
														e1.printStackTrace();
													}
													
												}
													
											}
										});
										generateButton.setFont(new Font("Tahoma", Font.BOLD, 16));
										generateButton.setBounds(314, 204, 134, 45);
										ScreenGenerate1.add(generateButton);
										
										JButton backButton_6 = new JButton("Back");
										backButton_6.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												frame.setContentPane(ScreenChoose);
												frame.repaint();
												frame.revalidate();
											}
										});
										backButton_6.setForeground(Color.RED);
										backButton_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
										backButton_6.setBackground(Color.WHITE);
										backButton_6.setBounds(10, 416, 119, 55);
										ScreenGenerate1.add(backButton_6);
								
										
										JLabel typeLabel2 = new JLabel("Type In The Crew Name");
										typeLabel2.setHorizontalAlignment(SwingConstants.CENTER);
										typeLabel2.setFont(new Font("Tahoma", Font.BOLD, 22));
										typeLabel2.setBounds(87, 10, 583, 60);
										ScreenGenerate2.add(typeLabel2);
										
										JLabel crewNameLabel2 = new JLabel("Crew Name:");
										crewNameLabel2.setFont(new Font("Tahoma", Font.BOLD, 20));
										crewNameLabel2.setBounds(10, 67, 139, 60);
										ScreenCrews2.add(crewNameLabel2);
										
										JLabel crewCapLabel2 = new JLabel("Crew Captain:");
										crewCapLabel2.setFont(new Font("Tahoma", Font.BOLD, 20));
										crewCapLabel2.setBounds(10, 166, 168, 60);
										ScreenCrews2.add(crewCapLabel2);
										
										JLabel shipLabel2 = new JLabel("Ship Name:");
										shipLabel2.setFont(new Font("Tahoma", Font.BOLD, 20));
										shipLabel2.setBounds(10, 266, 139, 60);
										ScreenCrews2.add(shipLabel2);
										
										JLabel crewNameAnswer = new JLabel("Answer");
										crewNameAnswer.setFont(new Font("Tahoma", Font.BOLD, 20));
										crewNameAnswer.setBounds(189, 182, 211, 38);
										ScreenCrews2.add(crewNameAnswer);
										
										JLabel crewCapAnswer = new JLabel("Answer");
										crewCapAnswer.setFont(new Font("Tahoma", Font.BOLD, 20));
										crewCapAnswer.setBounds(189, 80, 211, 38);
										ScreenCrews2.add(crewCapAnswer);
										
										JLabel shipAnswer = new JLabel("Answer");
										shipAnswer.setFont(new Font("Tahoma", Font.BOLD, 20));
										shipAnswer.setBounds(189, 282, 211, 38);
										ScreenCrews2.add(shipAnswer);
										
										JLabel pageLabel = new JLabel("Crews Title Card");
										pageLabel.setHorizontalAlignment(SwingConstants.CENTER);
										pageLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
										pageLabel.setBounds(98, 10, 583, 60);
										ScreenCrews2.add(pageLabel);
										
										textField2 = new JTextField();
										textField2.setFont(new Font("Tahoma", Font.PLAIN, 20));
										textField2.setBounds(203, 139, 355, 49);
										ScreenGenerate2.add(textField2);
										textField2.setColumns(10);
										
										JButton backButton_6_2 = new JButton("Back");
										backButton_6_2.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												frame.setContentPane(ScreenGenerate2);
												frame.repaint();
												frame.revalidate();
												typeLabel2.setText("Type In The Crew Name");
												textField2.setText("");
											}
										});
										backButton_6_2.setForeground(Color.RED);
										backButton_6_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
										backButton_6_2.setBackground(Color.WHITE);
										backButton_6_2.setBounds(10, 416, 119, 55);
										ScreenCrews2.add(backButton_6_2);
										
										JButton generateButton2 = new JButton("Generate");
										generateButton2.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												PreparedStatement ps = null;
												try {
													ps = connection.prepareStatement("SELECT * FROM crews WHERE crew_name = ?");
													ps.setString(1, textField2.getText());
													
												} catch (SQLException e1) {
													// TODO Auto-generated catch block
													e1.printStackTrace();
												}
												
												finally {
													try {
												
													ResultSet result;
													result = ps.executeQuery();
													
													if (result.next()) {
														frame.setContentPane(ScreenCrews2);
														frame.repaint();
														frame.revalidate();
														
														crewNameAnswer.setText(result.getString("crew_name"));
														crewCapAnswer.setText(result.getString("crew_captain"));
														shipAnswer.setText(result.getString("ship_name"));
													}
													else {
														typeLabel2.setText("That crew does not exist. Try again");
													}
													
													} 
													catch (SQLException e1) {
													// TODO Auto-generated catch block
													e1.printStackTrace();
													}
												}
											}
										});
										generateButton2.setFont(new Font("Tahoma", Font.BOLD, 16));
										generateButton2.setBounds(313, 215, 134, 45);
										ScreenGenerate2.add(generateButton2);
										
										JButton backButton_6_1 = new JButton("Back");
										backButton_6_1.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												frame.setContentPane(ScreenChoose);
												frame.repaint();
												frame.revalidate();
											}
										});
										backButton_6_1.setForeground(Color.RED);
										backButton_6_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
										backButton_6_1.setBackground(Color.WHITE);
										backButton_6_1.setBounds(10, 416, 119, 55);
										ScreenGenerate2.add(backButton_6_1);
										
										
										JLabel chooseLabel = new JLabel("Choose One to Generate");
										chooseLabel.setHorizontalAlignment(SwingConstants.CENTER);
										chooseLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
										chooseLabel.setBounds(107, 10, 583, 60);
										ScreenChoose.add(chooseLabel);
										
										JButton characterChoice = new JButton("Character");
										characterChoice.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												frame.setContentPane(ScreenGenerate1);
												frame.repaint();
												frame.revalidate();
												typeLabel.setText("Type In The Character's First Name");
												textField.setText("");
											}
										});
										characterChoice.setFont(new Font("Tahoma", Font.PLAIN, 20));
										characterChoice.setBounds(107, 175, 166, 85);
										ScreenChoose.add(characterChoice);
										
										JButton crewChoice = new JButton("Crew");
										crewChoice.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												frame.setContentPane(ScreenGenerate2);
												frame.repaint();
												frame.revalidate();
												typeLabel2.setText("Type In The Crew Name");
												textField2.setText("");
											}
										});
										crewChoice.setFont(new Font("Tahoma", Font.PLAIN, 20));
										crewChoice.setBounds(487, 179, 166, 85);
										ScreenChoose.add(crewChoice);
										
										JLabel lblNewLabel_1 = new JLabel("OR");
										lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
										lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
										lblNewLabel_1.setBounds(338, 179, 94, 85);
										ScreenChoose.add(lblNewLabel_1);
										
										JButton backButton_5 = new JButton("Back");
										backButton_5.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												frame.setContentPane(Screen1);
												frame.repaint();
												frame.revalidate();
											}
										});
										backButton_5.setForeground(Color.RED);
										backButton_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
										backButton_5.setBackground(Color.WHITE);
										backButton_5.setBounds(10, 416, 119, 55);
										ScreenChoose.add(backButton_5);
																				
										JButton wholeButton2 = new JButton("Character?");
										wholeButton2.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												frame.setContentPane(ScreenDeleteChar);
												frame.repaint();
												frame.revalidate();
												typeLabel3.setText("Type In The Character's First Name");
												deleteNameField.setText("");
											}
										});
										wholeButton2.setFont(new Font("Tahoma", Font.BOLD, 18));
										wholeButton2.setBounds(295, 100, 212, 103);
										ScreenDelete.add(wholeButton2);										
										
										JButton crewsButton2 = new JButton("Crews?");
										crewsButton2.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												frame.setContentPane(ScreenDeleteCrew);
												frame.repaint();
												frame.revalidate();
												typeLabel4.setText("Type In Crew's Name");
												deleteLabel3.hide();
												deleteCrewField.setText("");
											}
										});
										crewsButton2.setFont(new Font("Tahoma", Font.BOLD, 18));
										crewsButton2.setBounds(295, 300, 212, 103);
										ScreenDelete.add(crewsButton2);
										
										JLabel deleteLabel = new JLabel("Delete:");
										deleteLabel.setHorizontalAlignment(SwingConstants.RIGHT);
										deleteLabel.setFont(new Font("Tahoma", Font.BOLD, 21));
										deleteLabel.setBounds(10, 38, 177, 103);
										ScreenDelete.add(deleteLabel);
										
										
										JButton logoutButton_3 = new JButton("Logout");
										logoutButton_3.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												frame.setContentPane(Screen1);
												frame.repaint();
												frame.revalidate();
											}
										});
										logoutButton_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
										logoutButton_3.setBounds(0, 0, 104, 48);
										ScreenDelete.add(logoutButton_3);
										
										JButton backButton_4 = new JButton("Back");
										backButton_4.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												frame.setContentPane(Screen3);
												frame.repaint();
												frame.revalidate();
											}
										});
										backButton_4.setForeground(Color.RED);
										backButton_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
										backButton_4.setBackground(Color.WHITE);
										backButton_4.setBounds(10, 416, 119, 55);
										ScreenDelete.add(backButton_4);
										
										JLabel lblNewLabel = new JLabel("SUCCESS");
										lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
										lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
										lblNewLabel.setBounds(632, 175, 119, 47);
										ScreenCharacter.add(lblNewLabel);
										lblNewLabel.hide();
										
										JLabel successLabel2 = new JLabel("SUCCESS");
										successLabel2.setHorizontalAlignment(SwingConstants.CENTER);
										successLabel2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
										successLabel2.setBounds(321, 439, 144, 32);
										ScreenCrews.add(successLabel2);
										successLabel2.hide();
								
								
								JButton wholeButton = new JButton("Character?");
								wholeButton.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										frame.setContentPane(ScreenCharacter);
										frame.repaint();
										frame.revalidate();
										lblNewLabel.hide();
										LnameField.setText("");
										MinitField.setText("");
										FnameField.setText("");
										BdateField.setText("");
										sexField.setText("");
										raceField.setText("");
										epithetField.setText("");
										classField.setText("");
										affiliationField.setText("");
										crewField.setText("");
									}
								});
								wholeButton.setFont(new Font("Tahoma", Font.BOLD, 18));
								wholeButton.setBounds(295, 100, 212, 103);
								ScreenInsert.add(wholeButton);
								
								JButton backButton = new JButton("Back");
								backButton.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										frame.setContentPane(Screen3);
										frame.repaint();
										frame.revalidate();
									}
								});
								backButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
								backButton.setForeground(Color.RED);
								backButton.setBackground(Color.WHITE);
								backButton.setBounds(10, 416, 119, 55);
								ScreenInsert.add(backButton);
								
								JButton crewsButton = new JButton("Crews?");
								crewsButton.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										frame.setContentPane(ScreenCrews);
										frame.repaint();
										frame.revalidate();
										successLabel2.hide();
										crewCapField.setText("");
										crewNameField.setText("");
										shipField.setText("");
									}
								});
								crewsButton.setFont(new Font("Tahoma", Font.BOLD, 18));
								crewsButton.setBounds(295, 300, 212, 103);
								ScreenInsert.add(crewsButton);
								
								JLabel intoLabel = new JLabel("Insert Into:");
								intoLabel.setHorizontalAlignment(SwingConstants.RIGHT);
								intoLabel.setFont(new Font("Tahoma", Font.BOLD, 21));
								intoLabel.setBounds(10, 38, 177, 103);
								ScreenInsert.add(intoLabel);
								
								JButton logoutButton_1 = new JButton("Logout");
								logoutButton_1.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										frame.setContentPane(Screen1);
										frame.repaint();
										frame.revalidate();
									}
								});
								logoutButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
								logoutButton_1.setBounds(0, 0, 104, 48);
								ScreenInsert.add(logoutButton_1);
								
								
								
								JButton insertButton = new JButton("INSERT");
								insertButton.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										frame.setContentPane(ScreenInsert);
										frame.repaint();
										frame.revalidate();
									}
								});
								insertButton.setFont(new Font("Tahoma", Font.BOLD, 18));
								insertButton.setBounds(312, 90, 134, 73);
								Screen3.add(insertButton);
								
								
								JButton deleteButton = new JButton("DELETE");
								deleteButton.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										frame.setContentPane(ScreenDelete);
										frame.repaint();
										frame.revalidate();
									}
								});
								deleteButton.setFont(new Font("Tahoma", Font.BOLD, 18));
								deleteButton.setBounds(312, 300, 134, 73);
								Screen3.add(deleteButton);
								
								JLabel whichLabel = new JLabel("Which do you wish to do?");
								whichLabel.setHorizontalAlignment(SwingConstants.CENTER);
								whichLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
								whichLabel.setBounds(91, 10, 583, 60);
								Screen3.add(whichLabel);
								
								JButton logoutButton = new JButton("Logout");
								logoutButton.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										frame.setContentPane(Screen1);
										frame.repaint();
										frame.revalidate();
									}
								});
								logoutButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
								logoutButton.setBounds(0, 0, 104, 48);
								Screen3.add(logoutButton);
								
								JLabel credLabel = new JLabel("Enter your credentials");
								credLabel.setHorizontalAlignment(SwingConstants.CENTER);
								credLabel.setFont(new Font("Tahoma", Font.PLAIN, 22));
								credLabel.setBounds(208, 10, 400, 40);
								Screen2.add(credLabel);
															
								
								JLabel userLabel = new JLabel("Username:");
								userLabel.setForeground(Color.WHITE);
								userLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
								userLabel.setBounds(102, 56, 115, 73);
								Screen2.add(userLabel);
								
								JLabel passLabel = new JLabel("Password:");
								passLabel.setForeground(Color.WHITE);
								passLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
								passLabel.setBounds(102, 193, 115, 73);
								Screen2.add(passLabel);
								
								userField = new JTextField();
								userField.setFont(new Font("Tahoma", Font.PLAIN, 20));
								userField.setBounds(258, 76, 280, 42);
								Screen2.add(userField);
								userField.setColumns(10);
								
								passField = new JTextField();
								passField.setFont(new Font("Tahoma", Font.PLAIN, 20));
								passField.setColumns(10);
								passField.setBounds(258, 210, 280, 42);
								Screen2.add(passField);
								
								
								JButton enterButton = new JButton("Enter");
								enterButton.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										String user = userField.getText();
										PreparedStatement ps = null;
										try {
											ps = connection.prepareStatement("SELECT * FROM logins WHERE user_name = ?");
											ps.setString(1, user);
											
										} catch (SQLException e1) {
											// TODO Auto-generated catch block
											e1.printStackTrace();
										}
										finally {
											String pass = passField.getText();
											try {
												ResultSet result = ps.executeQuery();
												
												if (result.next()) {
													if (pass.equals(result.getString("pass_word"))) {
														frame.setContentPane(Screen3);
														frame.repaint();
														frame.revalidate();
														whichLabel.setText("Welcome, " + user + "! Which do you wish to do?");
													}
													else {
														credLabel.setText("Password is incorrect. Try again");
													}
												}
											else {
												credLabel.setText("Username does not exist. Try again.");
											}
											}
											catch (SQLException e1) {
												e1.printStackTrace();
											}
										}
										
									}
								});
								enterButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
								enterButton.setBounds(325, 290, 134, 73);
								Screen2.add(enterButton);
								
								JButton backButton_1 = new JButton("Back");
								backButton_1.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										frame.setContentPane(Screen1);
										frame.repaint();
										frame.revalidate();
									}
								});
								backButton_1.setForeground(Color.RED);
								backButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
								backButton_1.setBackground(Color.WHITE);
								backButton_1.setBounds(10, 416, 119, 55);
								Screen2.add(backButton_1);
				
				
				
				JLabel lblInsertIntoCrews = new JLabel("Insert Into Crews");
				lblInsertIntoCrews.setHorizontalAlignment(SwingConstants.CENTER);
				lblInsertIntoCrews.setFont(new Font("Tahoma", Font.BOLD, 22));
				lblInsertIntoCrews.setBounds(98, 10, 583, 60);
				ScreenCrews.add(lblInsertIntoCrews);
				
				JLabel crewNameLabel = new JLabel("Crew Name:");
				crewNameLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
				crewNameLabel.setBounds(10, 67, 139, 60);
				ScreenCrews.add(crewNameLabel);
				
				JLabel crewCapLabel = new JLabel("Crew Captain:");
				crewCapLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
				crewCapLabel.setBounds(10, 166, 168, 60);
				ScreenCrews.add(crewCapLabel);
				
				JLabel shipLabel = new JLabel("Ship Name:");
				shipLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
				shipLabel.setBounds(10, 266, 139, 60);
				ScreenCrews.add(shipLabel);
				
				crewCapField = new JTextField();
				crewCapField.setBounds(189, 182, 211, 38);
				crewCapField.setFont(new Font("Tahoma", Font.PLAIN, 20));
				ScreenCrews.add(crewCapField);
				crewCapField.setColumns(10);
				
				crewNameField = new JTextField();
				crewNameField.setColumns(10);
				crewNameField.setBounds(189, 80, 211, 38);
				crewNameField.setFont(new Font("Tahoma", Font.PLAIN, 20));
				ScreenCrews.add(crewNameField);
				
				shipField = new JTextField();
				shipField.setColumns(10);
				shipField.setBounds(189, 282, 211, 38);
				shipField.setFont(new Font("Tahoma", Font.PLAIN, 20));
				ScreenCrews.add(shipField);
				
				JButton enterButton3 = new JButton("Enter");
				enterButton3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						try {
							PreparedStatement ps = connection.prepareStatement("INSERT INTO `crews` (`crew_name`,`crew_captain`,`ship_name`) VALUES (?,?,?);");
							ps.setString(1, crewNameField.getText());
							ps.setString(2, crewCapField.getText());
							ps.setString(3, shipField.getText());
							int status = ps.executeUpdate();
							 
							if (status !=0) {
								successLabel2.show();
							}
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				});
				enterButton3.setFont(new Font("Tahoma", Font.BOLD, 20));
				enterButton3.setBounds(321, 358, 144, 60);
				ScreenCrews.add(enterButton3);
				
				
				JButton logoutButton2 = new JButton("Logout");
				logoutButton2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						frame.setContentPane(Screen1);
						frame.repaint();
						frame.revalidate();
					}
				});
				logoutButton2.setFont(new Font("Tahoma", Font.PLAIN, 14));
				logoutButton2.setBounds(10, 10, 104, 48);
				ScreenCrews.add(logoutButton2);
				
				JButton backButton3 = new JButton("Back");
				backButton3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						frame.setContentPane(ScreenInsert);
						frame.repaint();
						frame.revalidate();
					}
				});
				backButton3.setForeground(Color.RED);
				backButton3.setFont(new Font("Tahoma", Font.PLAIN, 15));
				backButton3.setBackground(Color.WHITE);
				backButton3.setBounds(10, 416, 119, 55);
				ScreenCrews.add(backButton3);
								
				
				JLabel LnameLabel = new JLabel("Last Name:");
				LnameLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
				LnameLabel.setBounds(10, 10, 96, 38);
				ScreenCharacter.add(LnameLabel);
				
				JLabel MnameLabel = new JLabel("Middle Initial:");
				MnameLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
				MnameLabel.setBounds(10, 58, 125, 38);
				ScreenCharacter.add(MnameLabel);
				
				JLabel FnameLabel = new JLabel("First Name:");
				FnameLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
				FnameLabel.setBounds(10, 106, 96, 38);
				ScreenCharacter.add(FnameLabel);
				
				JLabel BdateLabel = new JLabel("Birthday:");
				BdateLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
				BdateLabel.setBounds(10, 154, 96, 38);
				ScreenCharacter.add(BdateLabel);
				
				JLabel sexLabel = new JLabel("Sex:");
				sexLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
				sexLabel.setBounds(10, 202, 96, 38);
				ScreenCharacter.add(sexLabel);
				
				JLabel raceLabel = new JLabel("Race:");
				raceLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
				raceLabel.setBounds(10, 250, 96, 38);
				ScreenCharacter.add(raceLabel);
				
				JLabel epithetLabel = new JLabel("Epithet:");
				epithetLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
				epithetLabel.setBounds(10, 298, 96, 38);
				ScreenCharacter.add(epithetLabel);
				
				JLabel classLabel = new JLabel("Classification:");
				classLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
				classLabel.setBounds(10, 346, 125, 38);
				ScreenCharacter.add(classLabel);
				
				JButton backButton2 = new JButton("Back");
				backButton2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						frame.setContentPane(ScreenInsert);
						frame.repaint();
						frame.revalidate();
					}
				});
				backButton2.setForeground(Color.RED);
				backButton2.setFont(new Font("Tahoma", Font.PLAIN, 15));
				backButton2.setBackground(Color.WHITE);
				backButton2.setBounds(10, 406, 119, 55);
				ScreenCharacter.add(backButton2);
				
				LnameField = new JTextField();
				LnameField.setFont(new Font("Tahoma", Font.PLAIN, 16));
				LnameField.setBounds(145, 16, 154, 26);
				ScreenCharacter.add(LnameField);
				LnameField.setColumns(10);
				
				MinitField = new JTextField();
				MinitField.setFont(new Font("Tahoma", Font.PLAIN, 16));
				MinitField.setColumns(10);
				MinitField.setBounds(145, 70, 154, 26);
				ScreenCharacter.add(MinitField);
				
				FnameField = new JTextField();
				FnameField.setFont(new Font("Tahoma", Font.PLAIN, 16));
				FnameField.setColumns(10);
				FnameField.setBounds(145, 118, 154, 26);
				ScreenCharacter.add(FnameField);
				
				BdateField = new JTextField();
				BdateField.setFont(new Font("Tahoma", Font.PLAIN, 16));
				BdateField.setColumns(10);
				BdateField.setBounds(145, 166, 154, 26);
				ScreenCharacter.add(BdateField);
				
				sexField = new JTextField();
				sexField.setFont(new Font("Tahoma", Font.PLAIN, 16));
				sexField.setColumns(10);
				sexField.setBounds(145, 214, 154, 26);
				ScreenCharacter.add(sexField);
				
				raceField = new JTextField();
				raceField.setFont(new Font("Tahoma", Font.PLAIN, 16));
				raceField.setColumns(10);
				raceField.setBounds(145, 262, 154, 26);
				ScreenCharacter.add(raceField);
				
				epithetField = new JTextField();
				epithetField.setFont(new Font("Tahoma", Font.PLAIN, 16));
				epithetField.setColumns(10);
				epithetField.setBounds(145, 310, 154, 26);
				ScreenCharacter.add(epithetField);
				
				classField = new JTextField();
				classField.setFont(new Font("Tahoma", Font.PLAIN, 16));
				classField.setColumns(10);
				classField.setBounds(145, 358, 154, 26);
				ScreenCharacter.add(classField);
				
				JLabel affiliationLabel = new JLabel("Affiliation:");
				affiliationLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
				affiliationLabel.setBounds(309, 10, 96, 38);
				ScreenCharacter.add(affiliationLabel);
				
				JLabel crewLabel = new JLabel("Crew:");
				crewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
				crewLabel.setBounds(309, 58, 96, 38);
				ScreenCharacter.add(crewLabel);
				
				JLabel chapterLabel = new JLabel("First Chapter:");
				chapterLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
				chapterLabel.setBounds(309, 106, 119, 38);
				ScreenCharacter.add(chapterLabel);
				
				JLabel episodeLabel = new JLabel("First Episode:");
				episodeLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
				episodeLabel.setBounds(309, 154, 119, 38);
				ScreenCharacter.add(episodeLabel);
				
				JLabel bountyLabel = new JLabel("Bounty: ");
				bountyLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
				bountyLabel.setBounds(309, 202, 119, 38);
				ScreenCharacter.add(bountyLabel);
				
				JLabel devilLabel = new JLabel("Devil Fruit:");
				devilLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
				devilLabel.setBounds(309, 250, 119, 38);
				ScreenCharacter.add(devilLabel);
				
				JLabel englishLabel = new JLabel("English Ver:");
				englishLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
				englishLabel.setBounds(309, 298, 119, 38);
				ScreenCharacter.add(englishLabel);
				
				JLabel hakiLabel = new JLabel("Haki User:");
				hakiLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
				hakiLabel.setBounds(309, 346, 119, 38);
				ScreenCharacter.add(hakiLabel);
				
				JLabel homeLabel = new JLabel("Hometown:");
				homeLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
				homeLabel.setBounds(309, 394, 119, 38);
				ScreenCharacter.add(homeLabel);
				
				JLabel locationLabel = new JLabel("Location:");
				locationLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
				locationLabel.setBounds(309, 429, 119, 38);
				ScreenCharacter.add(locationLabel);
				
				affiliationField = new JTextField();
				affiliationField.setFont(new Font("Tahoma", Font.PLAIN, 16));
				affiliationField.setColumns(10);
				affiliationField.setBounds(430, 16, 154, 26);
				ScreenCharacter.add(affiliationField);
				
				crewField = new JTextField();
				crewField.setFont(new Font("Tahoma", Font.PLAIN, 16));
				crewField.setColumns(10);
				crewField.setBounds(430, 70, 154, 26);
				ScreenCharacter.add(crewField);
				
				chapterField = new JTextField();
				chapterField.setFont(new Font("Tahoma", Font.PLAIN, 16));
				chapterField.setColumns(10);
				chapterField.setBounds(430, 118, 154, 26);
				ScreenCharacter.add(chapterField);
				
				episodeField = new JTextField();
				episodeField.setFont(new Font("Tahoma", Font.PLAIN, 16));
				episodeField.setColumns(10);
				episodeField.setBounds(430, 166, 154, 26);
				ScreenCharacter.add(episodeField);
				
				bountyField = new JTextField();
				bountyField.setFont(new Font("Tahoma", Font.PLAIN, 16));
				bountyField.setColumns(10);
				bountyField.setBounds(430, 214, 154, 26);
				ScreenCharacter.add(bountyField);
				
				devilField = new JTextField();
				devilField.setFont(new Font("Tahoma", Font.PLAIN, 16));
				devilField.setColumns(10);
				devilField.setBounds(430, 262, 154, 26);
				ScreenCharacter.add(devilField);
				
				englishField = new JTextField();
				englishField.setFont(new Font("Tahoma", Font.PLAIN, 16));
				englishField.setColumns(10);
				englishField.setBounds(430, 310, 154, 26);
				ScreenCharacter.add(englishField);
				
				homeField = new JTextField();
				homeField.setFont(new Font("Tahoma", Font.PLAIN, 16));
				homeField.setColumns(10);
				homeField.setBounds(438, 406, 154, 26);
				ScreenCharacter.add(homeField);
				
				locationField = new JTextField();
				locationField.setFont(new Font("Tahoma", Font.PLAIN, 16));
				locationField.setColumns(10);
				locationField.setBounds(438, 441, 154, 26);
				ScreenCharacter.add(locationField);
				
				JRadioButton obvRadio = new JRadioButton("O");
				obvRadio.setFont(new Font("Tahoma", Font.PLAIN, 16));
				obvRadio.setBounds(438, 355, 44, 21);
				ScreenCharacter.add(obvRadio);
				
				JRadioButton armRadio = new JRadioButton("A");
				armRadio.setFont(new Font("Tahoma", Font.PLAIN, 16));
				armRadio.setBounds(484, 355, 48, 21);
				ScreenCharacter.add(armRadio);
				
				JRadioButton conqRadio = new JRadioButton("C");
				conqRadio.setFont(new Font("Tahoma", Font.PLAIN, 16));
				conqRadio.setBounds(534, 355, 50, 21);
				ScreenCharacter.add(conqRadio);
				
				JTextField[] fields = new JTextField[10];
				fields[0] = LnameField;
				fields[1] = MinitField;
				fields[2] = FnameField;
				fields[3] = BdateField;
				fields[4] = sexField;
				fields[5] = raceField;
				fields[6] = epithetField;
				fields[7] = classField;
				fields[8] = affiliationField;
				fields[9] = crewField;
				
				
				JButton enterCharacterButton = new JButton("Enter");
				enterCharacterButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						try {
							PreparedStatement ps = connection.prepareStatement("INSERT INTO characters (last_name, m_init,first_name,b_date,sex,race,epithet,classification,affiliation,crew) VALUES (?,?,?,?,?,?,?,?,?,?);");
							for (int i = 0; i < fields.length; i++) {
								String sample = fields[i].getText();
								if (sample.equals("")) {
									ps.setString(i + 1, null);
								}
								else {
									ps.setString(i + 1, sample);
								}
							}
								int status = ps.executeUpdate();
								
								if (status !=0) {
									PreparedStatement ds = connection.prepareStatement("INSERT INTO appearances (pirate_name,first_chapter,first_episode) VALUES (?,?,?);");								
									ds.setString(1, FnameField.getText());
									if (chapterField.getText().equals("")) {
										ds.setString(2, null);
									}
									else {
										ds.setInt(2, (int) Double.parseDouble(chapterField.getText()));
									}
									
									if (episodeField.getText().equals("")) {
										ds.setString(3, null);
									}
									else {
										ds.setInt(3, (int) Double.parseDouble(episodeField.getText()));
									}
									
									int status2 = ds.executeUpdate();
									
									PreparedStatement cs = connection.prepareStatement("INSERT INTO bounties (pirate_name,current_bounty) VALUES (?,?);");
									cs.setString(1, FnameField.getText());
									if (bountyField.getText().equals("")) {
										cs.setString(2, null);
									}
									else {
										cs.setInt(2, (int) Double.parseDouble(bountyField.getText()));
									}
									int status3 = cs.executeUpdate();
									
									PreparedStatement fs = connection.prepareStatement("INSERT INTO devil_fruits (pirate_name,devil_fruit,english_ver) VALUES (?,?,?);");
									fs.setString(1, FnameField.getText());
									if (devilField.getText().equals("")) {
										fs.setString(2, null);
									}
									else {
										fs.setString(2, devilField.getText());
									}
									if (englishField.getText().equals("")) {
										fs.setString(3, null);
									}
									else {
										fs.setString(3, englishField.getText());
									}
									int status4 = fs.executeUpdate();
									
									PreparedStatement es = connection.prepareStatement("INSERT INTO hometown (pirate_name,hometown,location) VALUES (?,?,?);");
									es.setString(1, FnameField.getText());
									if (homeField.getText().equals("")) {
										es.setString(2, null);
									}
									else {
										es.setString(2, homeField.getText());
									}
									if (locationField.getText().equals("")) {
										es.setString(3, null);
									}
									else {
										es.setString(3, locationField.getText());
									}
									int status5 = es.executeUpdate();
									
									PreparedStatement ls = connection.prepareStatement("INSERT INTO haki_users (pirate_name, observation, armament, conquerors) VALUES (?,?,?,?);");
									ls.setString(1, FnameField.getText());
									if(obvRadio.isSelected()) {
										ls.setString(2, "Y");
									}
									else {
										ls.setString(2, "N");
									}
									
									if(armRadio.isSelected()) {
										ls.setString(3, "Y");
									}
									else {
										ls.setString(3, "N");
									}
									
									if(conqRadio.isSelected()) {
										ls.setString(4, "Y");
									}
									else {
										ls.setString(4, "N");
									}
									int status6 = ls.executeUpdate();
									
									if (status2 !=0 && status3 !=0 && status4 !=0 && status5 !=0 && status6 != 0 ) {
										lblNewLabel.setText("SUCCESS");
										lblNewLabel.show();
									}
									
								
							}
							 
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				});
				enterCharacterButton.setFont(new Font("Tahoma", Font.BOLD, 16));
				enterCharacterButton.setBounds(632, 100, 119, 55);
				ScreenCharacter.add(enterCharacterButton);
				
				
				JButton Button1 = new JButton("Admin");
				Button1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						frame.setContentPane(Screen2);
						frame.repaint();
						frame.revalidate();
						userField.setText("");
						passField.setText("");
						credLabel.setText("Enter your credentials");
					}
				});
				Button1.setFont(new Font("Tahoma", Font.BOLD, 20));
				Screen1.add(Button1);
				Button1.setBounds(319,118,156,68);
				
				JButton Button2 = new JButton("Title Cards");
				Button2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						frame.setContentPane(ScreenChoose);
						frame.repaint();
						frame.revalidate();
					}
				});
				Button2.setFont(new Font("Tahoma", Font.BOLD, 20));
				Button2.setBounds(319, 266, 156, 68);
				Screen1.add(Button2);
				
				JLabel OPLabel = new JLabel("Welcome To My One Piece Database");
				OPLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
				OPLabel.setHorizontalAlignment(SwingConstants.CENTER);
				OPLabel.setBounds(104, 23, 583, 60);
				Screen1.add(OPLabel);
	}
}
