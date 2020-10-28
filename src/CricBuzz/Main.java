/* Suraj K
 * Roll No 411731 */

package cricbuzz;

import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.Panel;
import java.awt.Color;
import java.awt.Image;
import javax.swing.JScrollPane;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.ScrollPaneConstants;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Main {

	private JFrame frame;
	private Image CBLogo, home0, home1, matches0, matches1, news0, news1, videos0, videos1, more0, more1, settings;
	private Panel pnl0, pnl2;;
	private JLabel lblHome, lblMatches, lblNews, lblVideos, lblMore, lblLogo;
	private JPanel pnl1;
	private JScrollPane matchesSP;
	private JScrollPane newsSP;
	private JScrollPane videosSP;
	private JScrollPane moreSP;
	private CardLayout cl_pnl1;
	private JScrollPane homeSP;
	private JLabel lblSettings;
	private Settings s;
	private Matches m;
	private Home h;
	private More mo;
	private Videos v;
	private News news;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.initialize();
					FrmO frm = new FrmO();
					frm.frmO.setVisible(true);
					
					Timer t = new Timer();
					t.schedule(new TimerTask() {

						@Override
						public void run() {
							window.frame.setVisible(true);
							frm.frmO.dispose();
						}	
					}, 2500);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	private void initialize() {
		h = new Home();
		m = new Matches();
		s = new Settings();
		mo = new More();
		v = new Videos();
		news = new News();
		
		// Main Frame
		
		frame = new JFrame("CricBuzz");
		frame.setResizable(false);
		frame.setFont(new Font("Georgia", Font.PLAIN, 12));
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(400, 25, 375, 667);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pnl0 = new Panel();
		pnl0.setBounds(0, 0, 379, 62);
		pnl0.setBackground(new Color(10, 175, 133));
		
		pnl2 = new Panel();
		pnl2.setBounds(0, 582, 379, 56);
		pnl2.setBackground(new Color(250, 250, 250));
		
		JLabel lblContent = new JLabel("Home");
		lblContent.setBounds(148, 25, 94, 20);
		lblContent.setHorizontalAlignment(SwingConstants.CENTER);
		lblContent.setForeground(Color.WHITE);
		lblContent.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		// Images 
		ImageIcon settingsic, more1ic, home1ic, matches1ic, news1ic, videos1ic, more0ic, home0ic, matches0ic, news0ic, videos0ic;
		settings = new ImageIcon(this.getClass().getResource("/Settings.png")).getImage();
		more1 = new ImageIcon(this.getClass().getResource("/More1.png")).getImage();
		home1 = new ImageIcon(this.getClass().getResource("/Home1.png")).getImage();
		matches1 = new ImageIcon(this.getClass().getResource("/Matches1.png")).getImage();
		news1 = new ImageIcon(this.getClass().getResource("/News1.png")).getImage();
		videos1 = new ImageIcon(this.getClass().getResource("/Videos1.png")).getImage();
		more0 = new ImageIcon(this.getClass().getResource("/More0.png")).getImage();
		home0 = new ImageIcon(this.getClass().getResource("/Home0.png")).getImage();
		matches0 = new ImageIcon(this.getClass().getResource("/Matches0.png")).getImage();
		news0 = new ImageIcon(this.getClass().getResource("/News0.png")).getImage();
		videos0 = new ImageIcon(this.getClass().getResource("/Videos0.png")).getImage();
		settingsic = new ImageIcon(settings);
		more1ic = new ImageIcon(more1);
		home1ic = new ImageIcon(home1);
		matches1ic = new ImageIcon(matches1);
		news1ic = new ImageIcon(news1);
		videos1ic = new ImageIcon(videos1);
		more0ic = new ImageIcon(more0);
		home0ic = new ImageIcon(home0);
		matches0ic = new ImageIcon(matches0);
		news0ic = new ImageIcon(news0);
		videos0ic = new ImageIcon(videos0);

		lblHome = new JLabel("");
		lblHome.setBounds(10, 0, 56, 56);
		lblHome.setToolTipText("Home");
		lblHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblMore.setIcon(more1ic);
				lblVideos.setIcon(videos1ic);
				lblNews.setIcon(news1ic);
				lblMatches.setIcon(matches1ic);
				lblHome.setIcon(home0ic);	
				lblContent.setText("Home");
				lblSettings.setVisible(true);
				cl_pnl1.show(pnl1,"Home");
			}
		});
		lblHome.setIcon(home0ic);
		
		lblMatches = new JLabel("");
		lblMatches.setBounds(80, 0, 56, 56);
		lblMatches.setToolTipText("Matches");
		lblMatches.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblMore.setIcon(more1ic);
				lblVideos.setIcon(videos1ic);
				lblNews.setIcon(news1ic);
				lblMatches.setIcon(matches0ic);
				lblHome.setIcon(home1ic);
				lblContent.setText("Matches");
				lblSettings.setVisible(true);
				cl_pnl1.show(pnl1,"Matches");
			}
		});
		lblMatches.setIcon(matches1ic);
		
		lblNews = new JLabel(" ");
		lblNews.setBounds(154, 0, 56, 56);
		lblNews.setToolTipText("News");
		lblNews.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblMore.setIcon(more1ic);
				lblVideos.setIcon(videos1ic);
				lblNews.setIcon(news0ic);
				lblMatches.setIcon(matches1ic);
				lblHome.setIcon(home1ic);
				lblContent.setText("News");
				lblSettings.setVisible(true);
				cl_pnl1.show(pnl1,"News");
			}
		});
		lblNews.setIcon(news1ic);
		
		lblVideos = new JLabel(" ");
		lblVideos.setBounds(228, 0, 56, 56);
		lblVideos.setToolTipText("Videos");
		lblVideos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblMore.setIcon(more1ic);
				lblVideos.setIcon(videos0ic);
				lblNews.setIcon(news1ic);
				lblMatches.setIcon(matches1ic);
				lblHome.setIcon(home1ic);
				lblContent.setText("Videos");
				lblSettings.setVisible(true);
				cl_pnl1.show(pnl1,"Videos");
			}
		});
		lblVideos.setIcon(videos1ic);
		
		lblMore = new JLabel(" ");
		lblMore.setBounds(294, 0, 56, 56);
		lblMore.setToolTipText("More");
		lblMore.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblMore.setIcon(more0ic);
				lblVideos.setIcon(videos1ic);
				lblNews.setIcon(news1ic);
				lblMatches.setIcon(matches1ic);
				lblHome.setIcon(home1ic);
				lblContent.setText("More");
				lblSettings.setVisible(false);
				cl_pnl1.show(pnl1,"More");
			}
		});
		lblMore.setIcon(more1ic);
		pnl2.setLayout(null);
		pnl2.add(lblHome);
		pnl2.add(lblMatches);
		pnl2.add(lblNews);
		pnl2.add(lblVideos);
		pnl2.add(lblMore);
		
		lblLogo = new JLabel("");
		lblLogo.setBounds(-12, 0, 124, 62);
		CBLogo = new ImageIcon(this.getClass().getResource("/cbLogo.png")).getImage();
		lblLogo.setIcon(new ImageIcon(CBLogo));
		
		lblSettings = new JLabel("");
		lblSettings.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				pnl0.setVisible(false);
				pnl1.setVisible(false);
				pnl2.setVisible(false);
				s.pnlSettings.setVisible(true);
			}
		});
		lblSettings.setBounds(303, 0, 66, 60);
		lblSettings.setToolTipText("Settings");
		lblSettings.setIcon(settingsic);
		
		s.lblBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				pnl0.setVisible(true);
				pnl1.setVisible(true);
				pnl2.setVisible(true);
				s.pnlSettings.setVisible(false);
			}
		});
		
		pnl0.setLayout(null);
		pnl0.add(lblLogo);
		pnl0.add(lblContent);
		pnl0.add(lblSettings);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(pnl2);
		
		pnl1 = new JPanel();
		pnl1.setBounds(0, 62, 379, 522);
		cl_pnl1 = new CardLayout(0, 0);
		
		pnl1.setLayout(cl_pnl1);
		
		homeSP = new JScrollPane(h.panelH);
		homeSP.setForeground(Color.ORANGE);
		homeSP.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		homeSP.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		pnl1.add(homeSP, "Home");
		
				matchesSP = new JScrollPane(m.panelMa);
				matchesSP.setForeground(Color.ORANGE);
				matchesSP.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
				matchesSP.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
				pnl1.add(matchesSP, "Matches");
				
				newsSP = new JScrollPane(news.panelN);
				newsSP.setForeground(Color.ORANGE);
				newsSP.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
				newsSP.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
				pnl1.add(newsSP, "News");
				
				videosSP = new JScrollPane(v.panel);
				videosSP.setForeground(Color.ORANGE);
				videosSP.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
				videosSP.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
				pnl1.add(videosSP, "Videos");
				
				moreSP = new JScrollPane(mo.panelMo);
				moreSP.setForeground(Color.ORANGE);
				moreSP.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
				moreSP.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
				pnl1.add(moreSP, "More");
				frame.getContentPane().add(pnl1);
		frame.getContentPane().add(pnl0);
		frame.getContentPane().add(s.pnlSettings);
	}
}
