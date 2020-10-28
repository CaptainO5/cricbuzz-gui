/* Sri Sai
 * 411757
 */

package cricbuzz;


import java.awt.Image;
import java.awt.Label;
import java.awt.Panel;

import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class News {
	JPanel panelN;

	public News() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		panelN = new JPanel();
		panelN.setBackground(SystemColor.inactiveCaptionBorder);
		panelN.setBounds(0,0, 330, 711);
		
		Panel panel = new Panel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		
		Label label = new Label("MATCH REPORTS                                               1hr ago ");
		label.setBackground(SystemColor.inactiveCaptionBorder);
		label.setFont(new Font("Century Schoolbook L", Font.BOLD, 12));
		label.setBounds(0, 0, 315, 21);
		panel.add(label);
		
		JTextPane txtpnDcSealPaly = new JTextPane();
		txtpnDcSealPaly.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new dhawan();
			}
		});
		txtpnDcSealPaly.setEditable(false);
		txtpnDcSealPaly.setBackground(Color.WHITE);
		txtpnDcSealPaly.setFont(new Font("Bitstream Charter", Font.BOLD | Font.ITALIC, 12));
		txtpnDcSealPaly.setBounds(81, 21, 234, 33);
		txtpnDcSealPaly.setText("DC seal paly offs berth after six years ");
		panel.add(txtpnDcSealPaly);
		
		JTextPane txtpnIyerdhawanStruck = new JTextPane();
		txtpnIyerdhawanStruck.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new dhawan();
			}
		});
		txtpnIyerdhawanStruck.setEditable(false);
		txtpnIyerdhawanStruck.setBackground(Color.WHITE);
		txtpnIyerdhawanStruck.setFont(new Font("DejaVu Sans Light", Font.ITALIC, 12));
		txtpnIyerdhawanStruck.setBounds(0, 54, 315, 51);
		txtpnIyerdhawanStruck.setText("Iyer ,Dhawan struck half centuries before the bowlers sealed a 16 run as RCB failed to chase down 187");
		panel.add(txtpnIyerdhawanStruck);
		
		Panel panel_1 = new Panel();
		panel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new LIVE();
			}
		});
		panel_1.setBackground(Color.WHITE);
		panel_1.setLayout(null);
		
		Label label_1 = new Label("LIVE BLOGS                                                         2hrs ago ");
		label_1.setBackground(SystemColor.inactiveCaptionBorder);
		label_1.setFont(new Font("Century Schoolbook L", Font.BOLD, 12));
		label_1.setBounds(0, 0, 315, 21);
		panel_1.add(label_1);
		
		JTextPane txtpnAllTheLive = new JTextPane();
		txtpnAllTheLive.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new LIVE();
			}
		});
		txtpnAllTheLive.setEditable(false);
		txtpnAllTheLive.setBackground(Color.WHITE);
		txtpnAllTheLive.setFont(new Font("DejaVu Sans Light", Font.ITALIC, 12));
		txtpnAllTheLive.setBounds(0, 69, 315, 36);
		txtpnAllTheLive.setText("all the live updates from match 47of the indian premier league ");
		panel_1.add(txtpnAllTheLive);
		
		Panel panel_2 = new Panel();
		panel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new POLLOCK();
			}
		});
		panel_2.setBackground(Color.WHITE);
		panel_2.setLayout(null);
		Label label_2 = new Label("NEWS                                                                        2hrs ago ");
		label_2.setBackground(SystemColor.inactiveCaptionBorder);
		label_2.setFont(new Font("Century Schoolbook L", Font.BOLD, 12));
		label_2.setBounds(0, 5, 320, 21);
		panel_2.add(label_2);
		
		Panel panel_3 = new Panel();
		panel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new AKRAMKHAN();
			}
		});
		panel_3.setBackground(Color.WHITE);
		panel_3.setLayout(null);
		
		Label label_3 = new Label("NEWS                                                                        3hrs ago ");
		label_3.setBackground(SystemColor.inactiveCaptionBorder);
		label_3.setFont(new Font("Century Schoolbook L", Font.BOLD, 12));
		label_3.setBounds(0, 0, 315, 21);
		panel_3.add(label_3);
		
		Panel panel_4 = new Panel();
		panel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new NewsFrame();
			}
		});
		panel_4.setBackground(Color.WHITE);
		panel_4.setLayout(null);
		
		Label label_4 = new Label("NEWS                                                                        5hrs ago ");
		label_4.setBackground(SystemColor.inactiveCaptionBorder);
		label_4.setFont(new Font("Century Schoolbook L", Font.BOLD, 12));
		label_4.setBounds(0, 0, 315, 21);
		panel_4.add(label_4);
		
		Panel panel_5 = new Panel();
		panel_5.setBackground(Color.WHITE);
		panel_5.setLayout(null);
		
		JTextPane txtpnSponsored = new JTextPane();
		txtpnSponsored.setEditable(false);
		txtpnSponsored.setBackground(Color.WHITE);
		txtpnSponsored.setFont(new Font("DejaVu Sans Condensed", Font.BOLD | Font.ITALIC, 12));
		txtpnSponsored.setBounds(0, 0, 315, 21);
		txtpnSponsored.setText("SPONSORED                                                                          ");
		panel_5.add(txtpnSponsored);
		GroupLayout gl_panelN = new GroupLayout(panelN);
		gl_panelN.setHorizontalGroup(
			gl_panelN.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelN.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_panelN.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 315, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 315, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 315, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 315, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 315, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 315, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		gl_panelN.setVerticalGroup(
			gl_panelN.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelN.createSequentialGroup()
					.addGap(10)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 103, Short.MAX_VALUE)
					.addGap(6)
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 136, Short.MAX_VALUE)
					.addGap(10))
		);
		
		JLabel label_7 = new JLabel("");
		label_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new NewsFrame();
			}
		});
		label_7.setBackground(SystemColor.inactiveCaptionBorder);
		Image img_7 =new ImageIcon(this.getClass().getResource("/tendulkar.png")).getImage();
		label_7.setIcon(new ImageIcon(img_7));
		label_7.setBounds(10, 23, 76, 45);
		panel_4.add(label_7);
		
		JTextPane txtpnRecievedNoMonetory = new JTextPane();
		txtpnRecievedNoMonetory.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new NewsFrame();
			}
		});
		txtpnRecievedNoMonetory.setEditable(false);
		txtpnRecievedNoMonetory.setBackground(Color.WHITE);
		txtpnRecievedNoMonetory.setFont(new Font("Bitstream Charter", Font.BOLD | Font.ITALIC, 12));
		txtpnRecievedNoMonetory.setText("recieved no monetory benefit from MI:tendulkar to ombudsman");
		txtpnRecievedNoMonetory.setBounds(104, 23, 199, 45);
		panel_4.add(txtpnRecievedNoMonetory);
		
		JTextPane txtpnAlsoACac = new JTextPane();
		txtpnAlsoACac.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new NewsFrame();
			}
		});
		txtpnAlsoACac.setEditable(false);
		txtpnAlsoACac.setBackground(Color.WHITE);
		txtpnAlsoACac.setFont(new Font("DejaVu Sans Light", Font.ITALIC, 12));
		txtpnAlsoACac.setText("also a CAC member,tendulkar clarified that he had no decision making powers as mumbai indian's icon player ");
		txtpnAlsoACac.setBounds(0, 72, 315, 33);
		panel_4.add(txtpnAlsoACac);
		
		JLabel label_5 = new JLabel("");
		label_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new AKRAMKHAN();
			}
		});
		label_5.setBackground(SystemColor.inactiveCaptionBorder);
		Image img_5 =new ImageIcon(this.getClass().getResource("/akramkhan.png")).getImage();
		label_5.setIcon(new ImageIcon(img_5));
		label_5.setBounds(10, 22, 65, 47);
		panel_3.add(label_5);
		
		JTextPane txtpnIncludedRazaAnd = new JTextPane();
		txtpnIncludedRazaAnd.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new AKRAMKHAN();
			}
		});
		txtpnIncludedRazaAnd.setEditable(false);
		txtpnIncludedRazaAnd.setBackground(Color.WHITE);
		txtpnIncludedRazaAnd.setFont(new Font("Bitstream Charter", Font.BOLD | Font.ITALIC, 12));
		txtpnIncludedRazaAnd.setText("included raza and taskin on the insistence of head coach :alram khan ");
		txtpnIncludedRazaAnd.setBounds(82, 22, 233, 47);
		panel_3.add(txtpnIncludedRazaAnd);
		
		JTextPane txtpnTheAdditionOf = new JTextPane();
		txtpnTheAdditionOf.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new AKRAMKHAN();
			}
		});
		txtpnTheAdditionOf.setEditable(false);
		txtpnTheAdditionOf.setBackground(Color.WHITE);
		txtpnTheAdditionOf.setFont(new Font("DejaVu Sans Light", Font.ITALIC, 12));
		txtpnTheAdditionOf.setText("the addition of two players saw bangladesh's squad for the tournament rise to 19");
		txtpnTheAdditionOf.setBounds(0, 69, 315, 36);
		panel_3.add(txtpnTheAdditionOf);
		
		JLabel label_6 = new JLabel("");
		label_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new POLLOCK();
			}
		});
		label_6.setBackground(SystemColor.inactiveCaptionBorder);
		Image img_6 =new ImageIcon(this.getClass().getResource("/pollock(2).png")).getImage();
		label_6.setIcon(new ImageIcon(img_6));
		label_6.setBounds(8, 22, 65, 45);
		panel_2.add(label_6);
		
		JTextPane txtpnRusselsPressConference = new JTextPane();
		txtpnRusselsPressConference.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new POLLOCK();
			}
		});
		txtpnRusselsPressConference.setEditable(false);
		txtpnRusselsPressConference.setBackground(Color.WHITE);
		txtpnRusselsPressConference.setFont(new Font("Bitstream Charter", Font.BOLD | Font.ITALIC, 12));
		txtpnRusselsPressConference.setText("russels press conference achieves nothing for KKR:pollock");
		txtpnRusselsPressConference.setBounds(78, 22, 240, 36);
		panel_2.add(txtpnRusselsPressConference);
		
		JTextPane txtpnKkrAllrounderHad = new JTextPane();
		txtpnKkrAllrounderHad.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new POLLOCK();
			}
			
		});
		txtpnKkrAllrounderHad.setEditable(false);
		txtpnKkrAllrounderHad.setBackground(Color.WHITE);
		txtpnKkrAllrounderHad.setFont(new Font("DejaVu Sans Light", Font.ITALIC, 12));
		txtpnKkrAllrounderHad.setText("KKR allrounder had blamed the series of losses on poor decision making and the bowlers");
		txtpnKkrAllrounderHad.setBounds(-2, 72, 305, 33);
		panel_2.add(txtpnKkrAllrounderHad);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new LIVE();
			}
		});
		lblNewLabel_1.setBackground(SystemColor.inactiveCaptionBorder);
		Image img =new ImageIcon(this.getClass().getResource("/mi.png")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img));
		lblNewLabel_1.setBounds(10, 12, 85, 45);
		panel_1.add(lblNewLabel_1);
		
		Panel panel_7 = new Panel();
		panel_7.setBackground(SystemColor.inactiveCaptionBorder);
		panel_7.setBounds(83, 12, 232, 51);
		panel_1.add(panel_7);
		panel_7.setLayout(null);
		
		JTextPane txtpnLiveCricketScore = new JTextPane();
		txtpnLiveCricketScore.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new LIVE();
			}
		});
		txtpnLiveCricketScore.setEditable(false);
		txtpnLiveCricketScore.setBackground(Color.WHITE);
		txtpnLiveCricketScore.setFont(new Font("Bitstream Charter", Font.BOLD | Font.ITALIC, 12));
		txtpnLiveCricketScore.setText("live cricket score kkr vs mi IPL 2019");
		txtpnLiveCricketScore.setBounds(0, 11, 232, 39);
		panel_7.add(txtpnLiveCricketScore);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new dhawan();
			}
		});
		lblNewLabel.setBackground(SystemColor.inactiveCaptionBorder);
		Image img2 =new ImageIcon(this.getClass().getResource("/index(1).png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img2));
		lblNewLabel.setBounds(10, 21, 76, 33);
		panel.add(lblNewLabel);
		JTextPane txtpnAreYouWasting = new JTextPane();
		txtpnAreYouWasting.setEditable(false);
		txtpnAreYouWasting.setBackground(Color.WHITE);
		txtpnAreYouWasting.setFont(new Font("Waree", Font.ITALIC, 12));
		txtpnAreYouWasting.setText("are you wasting hours in reading irrelevent stuff in the newspaper ?did you know you...");
		txtpnAreYouWasting.setBounds(113, 53, 190, 62);
		panel_5.add(txtpnAreYouWasting);
		
		JTextPane txtpnInshortsWords = new JTextPane();
		txtpnInshortsWords.setEditable(false);
		txtpnInshortsWords.setBackground(Color.WHITE);
		txtpnInshortsWords.setFont(new Font("Liberation Mono", Font.BOLD, 12));
		txtpnInshortsWords.setText("INSHORTS -60 words news summary");
		txtpnInshortsWords.setBounds(113, 20, 169, 28);
		panel_5.add(txtpnInshortsWords);
		
		JButton btnInstall = new JButton("INSTALL");
		btnInstall.setBackground(SystemColor.inactiveCaptionBorder);
		btnInstall.setBounds(213, 114, 102, 24);
		panel_5.add(btnInstall);
		
		JLabel label_8 = new JLabel("");
		label_8.setBackground(SystemColor.inactiveCaptionBorder);
		Image img_8 =new ImageIcon(this.getClass().getResource("/ishorts(1).png")).getImage();
		label_8.setIcon(new ImageIcon(img_8));
		label_8.setBounds(0, 20, 114, 106);
		panel_5.add(label_8);
		panelN.setLayout(gl_panelN);
	}
}
