/* Siva Sankar
 * 411752
 */

package cricbuzz;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class More {

	
	JPanel panelMo;
	private JTextField txtSi;
	private JTextField txtBrowseTeam;
	private JTextField txtBrowsePlayer;
	private JLabel lblNewLabel;
	private JLabel label;
	private JLabel label_1;
	private JPanel panel_1;
	private JTextField txtSchedule;
	private JTextField txtArchives;
	private JLabel label_2;
	private JLabel label_3;
	private JPanel panel_2;
	private JTextField txtPhotos;
	private JLabel label_4;
	private JPanel panel_3;
	private JTextField txtQ;
	private JLabel label_5;
	private JPanel panel_4;
	private JTextField txtIccRankingsmen;
	private JTextField txtIccRankingswomen;
	private JTextField txtRecords;
	private JLabel label_6;
	private JLabel label_7;
	private JLabel label_8;
	private JPanel panel_5;
	private JTextField txtRateTheApp;
	private JTextField txtFeedback;
	private JLabel label_9;
	private JLabel label_10;
	
	More(){
		initialize();
	}
	
	private void initialize() {
		panelMo = new JPanel();
		
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		
		panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		
		txtSchedule = new JTextField();
		txtSchedule.setText("Schedule");
		txtSchedule.setFont(new Font("Dialog", Font.PLAIN, 16));
		txtSchedule.setHorizontalAlignment(SwingConstants.CENTER);
		txtSchedule.setEditable(false);
		txtSchedule.setColumns(10);
		txtSchedule.setBackground(Color.WHITE);
		txtSchedule.setBounds(57, -2, 318, 46);
		panel_1.add(txtSchedule);
		
		txtArchives = new JTextField();
		txtArchives.setText("Archives");
		txtArchives.setHorizontalAlignment(SwingConstants.CENTER);
		txtArchives.setFont(new Font("Dialog", Font.PLAIN, 16));
		txtArchives.setEditable(false);
		txtArchives.setColumns(10);
		txtArchives.setBackground(Color.WHITE);
		txtArchives.setBounds(57, 42, 318, 46);
		panel_1.add(txtArchives);
		
		label_2 = new JLabel("");
		Image l05a4 = new ImageIcon(this.getClass().getResource("/PicsArt_04-28-07.00.32.jpg")).getImage();
		label_2.setIcon(new ImageIcon(l05a4));
		label_2.setBounds(0, 0, 66, 46);
		panel_1.add(label_2);
		
		label_3 = new JLabel("");
		Image l05a44 = new ImageIcon(this.getClass().getResource("/PicsArt_04-28-06.58.45.jpg")).getImage();
		label_3.setIcon(new ImageIcon(l05a44));
		label_3.setBounds(0, 44, 66, 46);
		panel_1.add(label_3);
		
		panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(Color.WHITE);
		
		txtPhotos = new JTextField();
		txtPhotos.setText("Photos");
		txtPhotos.setFont(new Font("Dialog", Font.PLAIN, 16));
		txtPhotos.setHorizontalAlignment(SwingConstants.CENTER);
		txtPhotos.setEditable(false);
		txtPhotos.setColumns(10);
		txtPhotos.setBackground(Color.WHITE);
		txtPhotos.setBounds(59, 0, 316, 46);
		panel_2.add(txtPhotos);
		
		label_4 = new JLabel("");
		Image l0544 = new ImageIcon(this.getClass().getResource("/PicsArt_04-28-06.57.57.jpg")).getImage();
		label_4.setIcon(new ImageIcon(l0544));
		label_4.setBounds(0, 0, 49, 46);
		panel_2.add(label_4);
		
		panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(Color.WHITE);
		
		txtQ = new JTextField();
		txtQ.setText("Quotes");
		txtQ.setFont(new Font("Dialog", Font.PLAIN, 16));
		txtQ.setHorizontalAlignment(SwingConstants.CENTER);
		txtQ.setEditable(false);
		txtQ.setColumns(10);
		txtQ.setBackground(Color.WHITE);
		txtQ.setBounds(59, 0, 316, 46);
		panel_3.add(txtQ);
		
		label_5 = new JLabel("");
		Image l05446 = new ImageIcon(this.getClass().getResource("/PicsArt_04-28-06.53.18.jpg")).getImage();
		label_5.setIcon(new ImageIcon(l05446));
		label_5.setBounds(0, 0, 68, 46);
		panel_3.add(label_5);
		
		panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBackground(Color.WHITE);
		
		txtIccRankingsmen = new JTextField();
		txtIccRankingsmen.setText("ICC Rankings-Men");
		txtIccRankingsmen.setFont(new Font("Dialog", Font.PLAIN, 16));
		txtIccRankingsmen.setHorizontalAlignment(SwingConstants.CENTER);
		txtIccRankingsmen.setEditable(false);
		txtIccRankingsmen.setColumns(10);
		txtIccRankingsmen.setBackground(Color.WHITE);
		txtIccRankingsmen.setBounds(62, -2, 313, 46);
		panel_4.add(txtIccRankingsmen);
		
		txtIccRankingswomen = new JTextField();
		txtIccRankingswomen.setText("ICC Rankings-Women");
		txtIccRankingswomen.setHorizontalAlignment(SwingConstants.CENTER);
		txtIccRankingswomen.setFont(new Font("Dialog", Font.PLAIN, 16));
		txtIccRankingswomen.setEditable(false);
		txtIccRankingswomen.setColumns(10);
		txtIccRankingswomen.setBackground(Color.WHITE);
		txtIccRankingswomen.setBounds(62, 42, 313, 46);
		panel_4.add(txtIccRankingswomen);
		
		txtRecords = new JTextField();
		txtRecords.setText("Records");
		txtRecords.setHorizontalAlignment(SwingConstants.CENTER);
		txtRecords.setFont(new Font("Dialog", Font.PLAIN, 16));
		txtRecords.setEditable(false);
		txtRecords.setColumns(10);
		txtRecords.setBackground(Color.WHITE);
		txtRecords.setBounds(62, 85, 313, 48);
		panel_4.add(txtRecords);
		
		label_6 = new JLabel("");
		Image l0546 = new ImageIcon(this.getClass().getResource("/PicsArt_04-28-06.53.47.jpg")).getImage();
		label_6.setIcon(new ImageIcon(l0546));
		label_6.setBounds(0, 0, 66, 46);
		panel_4.add(label_6);
		
		label_7 = new JLabel("");
		Image l0646 = new ImageIcon(this.getClass().getResource("/PicsArt_04-28-06.53.47.jpg")).getImage();
		label_7.setIcon(new ImageIcon(l0646));
		label_7.setBounds(0, 44, 66, 46);
		panel_4.add(label_7);
		
		txtRateTheApp = new JTextField();
		txtRateTheApp.setBounds(0, 0, 299, 46);
		panel_4.add(txtRateTheApp);
		txtRateTheApp.setText("Rate the App");
		txtRateTheApp.setFont(new Font("Dialog", Font.PLAIN, 16));
		txtRateTheApp.setHorizontalAlignment(SwingConstants.CENTER);
		txtRateTheApp.setEditable(false);
		txtRateTheApp.setColumns(10);
		txtRateTheApp.setBackground(Color.WHITE);
		
		label_8 = new JLabel("");
		Image l0642 = new ImageIcon(this.getClass().getResource("/PicsArt_04-28-06.54.32.jpg")).getImage();
		label_8.setIcon(new ImageIcon(l0642));
		label_8.setBounds(0, 88, 66, 46);
		panel_4.add(label_8);
		
		panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBackground(Color.WHITE);
		
		txtFeedback = new JTextField();
		txtFeedback.setText("Feedback");
		txtFeedback.setHorizontalAlignment(SwingConstants.CENTER);
		txtFeedback.setFont(new Font("Dialog", Font.PLAIN, 16));
		txtFeedback.setEditable(false);
		txtFeedback.setColumns(10);
		txtFeedback.setBackground(Color.WHITE);
		txtFeedback.setBounds(61, -2, 314, 46);
		panel_5.add(txtFeedback);
		
		label_9 = new JLabel("");
		Image l042 = new ImageIcon(this.getClass().getResource("/PicsArt_04-28-06.55.07.jpg")).getImage();
		label_9.setIcon(new ImageIcon(l042));
		label_9.setBounds(0, 0, 66, 46);
		panel_5.add(label_9);
		
		label_10 = new JLabel("New label");
		Image l022 = new ImageIcon(this.getClass().getResource("/PicsArt_04-28-06.55.46.jpg")).getImage();
		label_10.setIcon(new ImageIcon(l022));
		label_10.setBounds(0, 44, 66, 46);
		panel_5.add(label_10);
		Image l02 = new ImageIcon(this.getClass().getResource("/PicsArt_04-28-06.56.21.jpg")).getImage();
		Image l0 = new ImageIcon(this.getClass().getResource("/PicsArt_04-28-06.56.52.jpg")).getImage();
		GroupLayout gl_panelMo = new GroupLayout(panelMo);
		gl_panelMo.setHorizontalGroup(
			gl_panelMo.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
				.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
				.addComponent(panel_4, GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
				.addComponent(panel_5, GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
				.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
		);
		gl_panelMo.setVerticalGroup(
			gl_panelMo.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelMo.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(101, Short.MAX_VALUE))
		);
		panel.setLayout(null);
		
		txtSi = new JTextField();
		txtSi.setFont(new Font("Dialog", Font.PLAIN, 16));
		txtSi.setText("Browse Series");
		txtSi.setBounds(58, -2, 317, 46);
		txtSi.setHorizontalAlignment(SwingConstants.CENTER);
		txtSi.setBackground(Color.WHITE);
		txtSi.setEditable(false);
		panel.add(txtSi);
		txtSi.setColumns(10);
		
		txtBrowseTeam = new JTextField();
		txtBrowseTeam.setFont(new Font("Dialog", Font.PLAIN, 16));
		txtBrowseTeam.setHorizontalAlignment(SwingConstants.CENTER);
		txtBrowseTeam.setText("Browse Team");
		txtBrowseTeam.setBounds(58, 42, 317, 46);
		txtBrowseTeam.setEditable(false);
		txtBrowseTeam.setColumns(10);
		txtBrowseTeam.setBackground(Color.WHITE);
		panel.add(txtBrowseTeam);
		
		txtBrowsePlayer = new JTextField();
		txtBrowsePlayer.setText("Browse Player");
		txtBrowsePlayer.setHorizontalAlignment(SwingConstants.CENTER);
		txtBrowsePlayer.setFont(new Font("Dialog", Font.PLAIN, 16));
		txtBrowsePlayer.setBounds(58, 85, 317, 48);
		txtBrowsePlayer.setEditable(false);
		txtBrowsePlayer.setColumns(10);
		txtBrowsePlayer.setBackground(Color.WHITE);
		panel.add(txtBrowsePlayer);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		Image l10 = new ImageIcon(this.getClass().getResource("/PicsArt_04-28-06.28.01-1.jpg")).getImage();
		lblNewLabel.setIcon(new ImageIcon(l10));
		lblNewLabel.setBounds(0, 0, 55, 46);
		panel.add(lblNewLabel);
		
		label = new JLabel("");
		Image l11 = new ImageIcon(this.getClass().getResource("/PicsArt_04-28-07.02.45.jpg")).getImage();
		label.setIcon(new ImageIcon(l11));
		label.setBounds(0, 44, 66, 46);
		panel.add(label);
		
		label_1 = new JLabel("");
		Image l1 = new ImageIcon(this.getClass().getResource("/PicsArt_04-28-07.01.20.jpg")).getImage();
		label_1.setIcon(new ImageIcon(l1));
		label_1.setBounds(0, 88, 66, 46);
		panel.add(label_1);
		panelMo.setBounds(0,0, 350, 600);
		panelMo.setLayout(gl_panelMo);

	}	
}
