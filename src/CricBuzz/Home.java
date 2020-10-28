/* Suraj K
 * Roll No 411731 */

package cricbuzz;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.Image;
import java.awt.CardLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.SystemColor;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTextPane;

public class Home {

	JPanel panelH;
	JTextPane txpnNews1, txpnNews2;
	/**
	 * Create the application.
	 */
	public Home() {
		initialize();
	}

	private void initialize() {
		panelH = new JPanel();
		panelH.setBackground(SystemColor.inactiveCaptionBorder);
		panelH.setBounds(0, 0, 349, 700);
		
		CardLayout cl_panel1 = new CardLayout(0, 0);
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(new Color(255, 255, 255));
		
		JLabel lblFeaturedMatches = new JLabel("Featured Matches");
		lblFeaturedMatches.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JLabel labelL = new JLabel("<");
		labelL.setToolTipText("Previous");
		labelL.setForeground(Color.GRAY);
		labelL.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cl_panel1.previous(panel1);
			}
			@Override
			public void mousePressed(MouseEvent e) {
				labelL.setForeground(Color.BLACK);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				labelL.setForeground(Color.GRAY);
			}
		});
		labelL.setFont(new Font("Tahoma", Font.PLAIN, 22));
		
		JLabel labelR = new JLabel(">");
		labelR.setToolTipText("Next");
		labelR.setForeground(Color.GRAY);
		labelR.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cl_panel1.next(panel1);
			}
			@Override
			public void mousePressed(MouseEvent e) {
				labelR.setForeground(Color.BLACK);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				labelR.setForeground(Color.GRAY);
			}
		});
		labelR.setFont(new Font("Tahoma", Font.PLAIN, 22));
		
		JLabel lblFeaturedVideos = new JLabel("Featured Videos");
		lblFeaturedVideos.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		p3 lv=new p3();
		JScrollPane scrollPane = new JScrollPane(lv.p3);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
		
		JLabel lblTopStories = new JLabel("Top Stories");
		lblTopStories.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JPanel panel = new JPanel();
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				panel.setBackground(new Color(225, 225, 225));
				txpnNews1.setBackground(new Color(225, 225, 225));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				panel.setBackground(Color.WHITE);
				txpnNews1.setBackground(Color.white);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				new POLLOCK();
			}
		});
		panel.setBackground(Color.WHITE);
		
		JPanel panel_1 = new JPanel();
		panel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				panel_1.setBackground(new Color(225, 225, 225));
				txpnNews2.setBackground(new Color(225, 225, 225));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				panel_1.setBackground(Color.WHITE);
				txpnNews2.setBackground(Color.WHITE);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				new POLLOCK();
			}
		});
		panel_1.setBackground(Color.WHITE);
		
		GroupLayout gl_panelH = new GroupLayout(panelH);
		gl_panelH.setHorizontalGroup(
			gl_panelH.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelH.createSequentialGroup()
					.addGroup(gl_panelH.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelH.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panelH.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panelH.createSequentialGroup()
									.addComponent(labelL, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addGap(10)
									.addComponent(panel1, GroupLayout.PREFERRED_SIZE, 273, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(labelR, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
									.addGap(24))
								.addGroup(gl_panelH.createSequentialGroup()
									.addGap(6)
									.addGroup(gl_panelH.createParallelGroup(Alignment.LEADING, false)
										.addComponent(lblFeaturedVideos, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblTopStories, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
										.addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
										.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
									.addGap(18))))
						.addGroup(gl_panelH.createSequentialGroup()
							.addGap(19)
							.addComponent(lblFeaturedMatches, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_panelH.setVerticalGroup(
			gl_panelH.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelH.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelH.createParallelGroup(Alignment.TRAILING, false)
						.addGroup(gl_panelH.createSequentialGroup()
							.addComponent(lblFeaturedMatches, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
							.addGroup(gl_panelH.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panelH.createSequentialGroup()
									.addGap(67)
									.addComponent(labelL))
								.addGroup(gl_panelH.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(panel1, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)))
							.addGap(14)
							.addComponent(lblFeaturedVideos, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED))
						.addGroup(gl_panelH.createSequentialGroup()
							.addComponent(labelR, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
							.addGap(104)))
					.addGap(0, 0, Short.MAX_VALUE)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblTopStories, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 226, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
					.addGap(91))
		);
		panel_1.setLayout(null);
		
		JLabel lblIpl = new JLabel("  IPL 2019");
		lblIpl.setForeground(Color.GRAY);
		lblIpl.setBounds(0, 0, 324, 20);
		panel_1.add(lblIpl);
		
		JLabel lblNews2 = new JLabel("");
		lblNews2.setBounds(10, 27, 72, 74);
		Image n2 = new ImageIcon(this.getClass().getResource("/News02.png")).getImage(); 
		lblNews2.setIcon(new ImageIcon(n2));
		panel_1.add(lblNews2);
		
		txpnNews2 = new JTextPane();
		txpnNews2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				panel_1.setBackground(new Color(225, 225, 225));
				txpnNews2.setBackground(new Color(225, 225, 225));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				panel_1.setBackground(Color.WHITE);
				txpnNews2.setBackground(Color.WHITE);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				new NewsFrame();
			}
		});
		txpnNews2.setText("  IPL 2019 - That Happened\r\n  \r\n  Updates from the world of IPL on and\r\n  off the field");
		txpnNews2.setEditable(false);
		txpnNews2.setBounds(92, 31, 222, 93);
		panel_1.add(txpnNews2);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("  T20 REVOLUTION");
		lblNewLabel.setForeground(Color.GRAY);
		lblNewLabel.setBounds(10, 0, 314, 20);
		panel.add(lblNewLabel);
		
		JLabel lblNews1 = new JLabel("");
		lblNews1.setBounds(0, 22, 324, 124);
		Image n1 = new ImageIcon(this.getClass().getResource("/News01.png")).getImage(); 
		lblNews1.setIcon(new ImageIcon(n1));
		panel.add(lblNews1);
		
		txpnNews1 = new JTextPane();
		txpnNews1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				panel.setBackground(new Color(225, 225, 225));
				txpnNews1.setBackground(new Color(225, 225, 225));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				panel.setBackground(Color.WHITE);
				txpnNews1.setBackground(Color.white);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				new LIVE();
			}
		});
		txpnNews1.setText("The T20 Revolution coaching Revision\r\n\r\nAn in-depth look at how coaching has shaped up over the years on franchise cricket\r\n");
		txpnNews1.setEditable(false);
		txpnNews1.setBounds(10, 146, 314, 80);
		panel.add(txpnNews1);
		
		panel1.setLayout(cl_panel1);
		
		PanelM match0 = new PanelM("SAT, 02 MAR 2019", "/ind.png", "/aus.png", "IND", "AUS", "240-4 (48.2)", "236-7 (50.0)", "India won by 6 wkts");
		PanelM match1 = new PanelM("SUN, 25 NOV 2018", "/aus.png", "/ind.png", "AUS", "IND", "164-6 (20.0)", "168-4 (19.4)", "India won by 6 wkts");
		PanelM match2 = new PanelM("SAT, 22 DEC 2018", "/ban.png", "/wi.png", "BAN", "WI", "140-10 (17.0)", "190-10 (19.2)", "Windies won by 50 runs");
		PanelM match3 = new PanelM("TUE, 03 JUL 2019", "/ind.png", "/eng.png", "IND", "ENG", "159-8 (20.0)", "163-2 (18.2)", "India won by 8 wkts");
		
		panel1.add(match1.pnlMatch, "M2");
		panel1.add(match2.pnlMatch, "M3");
		panel1.add(match0.pnlMatch, "M1");
		panel1.add(match3.pnlMatch, "M4");
		panelH.setLayout(gl_panelH);
		
	}
}
