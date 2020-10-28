/* Suraj K
 * Roll No 411731 */

package cricbuzz;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;

import net.proteanit.sql.DbUtils;

import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;

import java.awt.CardLayout;
import java.sql.*;
import java.awt.SystemColor;

public class MatchesFrame {

	private JFrame frmMatch;
	private JPanel panel;
	private JButton btnC2, btnC1;
	private JTextField txtC2, txtC1;
	private JTable tableT, tableBat;

	Connection con = null;
	private JTable tableBall;
	public MatchesFrame() {
		con = OracleCon.connectToDB();
		initialize();
		frmMatch.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMatch = new JFrame("Match Result");
		frmMatch.setResizable(false);
		frmMatch.setFont(new Font("Georgia", Font.PLAIN, 12));
		frmMatch.getContentPane().setBackground(Color.LIGHT_GRAY);
		frmMatch.setBounds(400, 25, 370, 670);
		frmMatch.setUndecorated(true);
		
		CardLayout cl = new CardLayout(0, 0);
		
		JPanel pnlMatches = new JPanel();
		pnlMatches.setBackground(new Color(245, 245, 245));
		pnlMatches.setBounds(0, 0, 375, 660);
		pnlMatches.setLayout(null);
		
		JPanel pnlMatchHead = new JPanel();
		pnlMatchHead.setBounds(0, 0, 375, 103);
		pnlMatchHead.setBackground(new Color(10, 175, 133));
		pnlMatches.add(pnlMatchHead);
		pnlMatchHead.setLayout(null);
		
		JLabel lblBack = new JLabel("");
		lblBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frmMatch.dispose();
			}
		});
		lblBack.setBounds(0, 0, 45, 60);
		Image greenLeft = new ImageIcon(this.getClass().getResource("/greenLeft.png")).getImage();
		lblBack.setIcon(new ImageIcon(greenLeft));
		pnlMatchHead.add(lblBack);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 101, 107, 2);
		pnlMatchHead.add(separator);
		
		JSeparator separatorT = new JSeparator();
		separatorT.setBounds(127, 101, 81, 2);
		separatorT.setVisible(false);
		pnlMatchHead.add(separatorT);
		
		JLabel lblMatches = new JLabel("Matches");
		lblMatches.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMatches.setForeground(Color.WHITE);
		lblMatches.setBounds(55, 26, 74, 15);
		pnlMatchHead.add(lblMatches);
		
		JLabel lblNewLabel = new JLabel("SCORECARD");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				separator.setVisible(true);
				separatorT.setVisible(false);
				cl.show(panel, "Score Card");
				
			}
		});
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel.setBounds(10, 71, 107, 30);
		pnlMatchHead.add(lblNewLabel);
		
		JLabel lblTeams = new JLabel("TEAMS");
		lblTeams.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				separator.setVisible(false);
				separatorT.setVisible(true);
				cl.show(panel, "Teams");
			}
		});
		lblTeams.setVerticalAlignment(SwingConstants.BOTTOM);
		lblTeams.setForeground(Color.WHITE);
		lblTeams.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTeams.setBounds(127, 73, 107, 30);
		pnlMatchHead.add(lblTeams);
		
		frmMatch.getContentPane().add(pnlMatches);
		
		panel = new JPanel();
		panel.setBounds(0, 103, 370, 553);
		pnlMatches.add(panel);
		panel.setLayout(cl);
		
		JPanel panelSC = new JPanel();
		panelSC.setBackground(SystemColor.inactiveCaptionBorder);
		panelSC.setBounds(0, 103, 370, 553);
		panelSC.setLayout(null);
		
		JLabel lblResult = new JLabel("India won by 6 wkts");
		lblResult.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblResult.setForeground(Color.BLUE);
		lblResult.setBounds(10, 11, 350, 27);
		panelSC.add(lblResult);
		
		txtC1 = new JTextField();
		txtC1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtC1.setBackground(new Color(10, 175, 133));
				txtC2.setBackground(Color.WHITE);
				txtC1.setForeground(Color.white);
				txtC2.setForeground(Color.black);
				try{  
					PreparedStatement pst = con.prepareStatement("select cricketers.name as name, batting.runs as R, batting.balls as B, batting.fours as \"4s\", batting.sixes as \"6s\", batting.strike_rate as SR from batting, cricketers where batting.batsman_id = cricketers.id and batting.country_id = 'AUS'");
					ResultSet rs = pst.executeQuery();
					tableBat.setModel(DbUtils.resultSetToTableModel(rs));
					rs.close();
					pst.close();
					pst = con.prepareStatement("select c.name as name, b.overs as O, b.maiden as M, b.runs R, b.Wickets W, b.econamy ER from bowling b, cricketers c where b.bowler_id = c.id and b.country_id = 'IND'");
					rs = pst.executeQuery();
					tableBall.setModel(DbUtils.resultSetToTableModel(rs));
					rs.close();
					pst.close();
				}catch(Exception e1) { 
					System.out.println(e1);
				} 
			}
		});
		txtC1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtC1.setBackground(Color.WHITE);
		txtC1.setHorizontalAlignment(SwingConstants.LEFT);
		txtC1.setText("Australia\t\t\t164-6 (20.0)");
		txtC1.setEditable(false);
		txtC1.setBounds(10, 34, 350, 55);
		panelSC.add(txtC1);
		txtC1.setColumns(10);
		
		txtC2 = new JTextField();
		txtC2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtC1.setBackground(Color.WHITE);
				txtC2.setBackground(new Color(10, 175, 133));
				txtC1.setForeground(Color.black);
				txtC2.setForeground(Color.white);
				try{  
					PreparedStatement pst = con.prepareStatement("select cricketers.name as name, batting.runs as R, batting.balls as B, batting.fours as \"4s\", batting.sixes as \"6s\", batting.strike_rate as SR from batting, cricketers where batting.batsman_id = cricketers.id and batting.country_id = 'IND'");
					ResultSet rs = pst.executeQuery();
					tableBat.setModel(DbUtils.resultSetToTableModel(rs));
					rs.close();
					pst.close();
					pst = con.prepareStatement("select c.name as name, b.overs as O, b.maiden as M, b.runs R, b.Wickets W, b.econamy ER from bowling b, cricketers c where b.bowler_id = c.id and b.country_id = 'AUS'");
					rs = pst.executeQuery();
					tableBall.setModel(DbUtils.resultSetToTableModel(rs));
					rs.close();
					pst.close();
				}catch(Exception e1) { 
					System.out.println(e1);
				}
			}
		});
		txtC2.setText("India\t\t\t168-4 (19.4)");
		txtC2.setHorizontalAlignment(SwingConstants.LEFT);
		txtC2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtC2.setEditable(false);
		txtC2.setColumns(10);
		txtC2.setBackground(Color.WHITE);
		txtC2.setBounds(10, 90, 350, 55);
		panelSC.add(txtC2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 171, 350, 180);
		panelSC.add(scrollPane);
		
		tableBat = new JTable(){
			public boolean isCellEditable(int rowIndex, int colIndex) {
				return false; //Disallow the editing of any cell
				}
				};
		tableBat.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		tableBat.setFillsViewportHeight(true);
		tableBat.setRowHeight(35);
		tableBat.setSelectionBackground(new Color(0, 255, 127));
		tableBat.setShowVerticalLines(false);
		tableBat.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 15));
		scrollPane.setViewportView(tableBat);
		panel.add(panelSC, "Score Card");
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 373, 350, 180);
		panelSC.add(scrollPane_2);
		
		tableBall = new JTable(){
			public boolean isCellEditable(int rowIndex, int colIndex) {
				return false; //Disallow the editing of any cell
				}
				};
		tableBall.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		tableBall.setShowVerticalLines(false);
		tableBall.setSelectionBackground(new Color(0, 255, 127));
		tableBall.setRowHeight(35);
		tableBall.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 15));
		tableBall.setFillsViewportHeight(true);
		scrollPane_2.setViewportView(tableBall);
		
		JLabel lblBatting = new JLabel("Batting");
		lblBatting.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblBatting.setForeground(Color.GREEN);
		lblBatting.setHorizontalAlignment(SwingConstants.CENTER);
		lblBatting.setBounds(10, 156, 69, 14);
		panelSC.add(lblBatting);
		
		JLabel lblBowling = new JLabel("Bowling");
		lblBowling.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblBowling.setForeground(Color.GREEN);
		lblBowling.setHorizontalAlignment(SwingConstants.CENTER);
		lblBowling.setBounds(10, 358, 69, 14);
		panelSC.add(lblBowling);
		
		JPanel panelT = new JPanel();
		panelT.setBounds(0, 103, 370, 670);
		panelT.setLayout(null);

		
		btnC1 = new JButton("India");
		btnC1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnC1.setForeground(Color.WHITE);
				btnC2.setForeground(Color.black);
				try{  
					PreparedStatement pst = con.prepareStatement("SELECT name, player_type FROM cricketers WHERE country_id = 'IND'");
					ResultSet rs = pst.executeQuery();
					tableT.setModel(DbUtils.resultSetToTableModel(rs));
					rs.close();
					pst.close();
				}catch(Exception e1) { 
					System.out.println(e1);
				} 
			}
		});
		btnC1.setBounds(10, 11, 175, 45);
		btnC1.setBackground(new Color(10, 175, 133));
		panelT.add(btnC1);
		
		btnC2 = new JButton("Australia");
		btnC2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnC1.setForeground(Color.black);
				btnC2.setForeground(Color.white);
				try{  
					PreparedStatement pst = con.prepareStatement("SELECT name, player_type FROM cricketers WHERE country_id = 'AUS'");
					ResultSet rs = pst.executeQuery();
					tableT.setModel(DbUtils.resultSetToTableModel(rs));
					rs.close();
					pst.close();
				}catch(Exception e1) { 
					System.out.println(e1);
				} 
			}
		});
		btnC2.setBackground(new Color(10, 175, 133));
		btnC2.setBounds(185, 11, 175, 45);
		panelT.add(btnC2);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 60, 350, 480);
		panelT.add(scrollPane_1);
		
		tableT = new JTable(){
			public boolean isCellEditable(int rowIndex, int colIndex) {
				return false; //Disallow the editing of any cell
				}
				};
		tableT.setFillsViewportHeight(true);
		tableT.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		tableT.setSelectionBackground(Color.LIGHT_GRAY);
		tableT.setRowHeight(35);
		tableT.setOpaque(false);
		tableT.setShowVerticalLines(false);
		tableT.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 15));
		scrollPane_1.setViewportView(tableT);
		panel.add(panelT, "Teams");
	}
}
