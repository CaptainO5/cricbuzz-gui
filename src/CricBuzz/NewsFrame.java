/* Sri Sai
 * 411757
 */

package cricbuzz;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTextPane;
import java.awt.Panel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;

public class NewsFrame {

	private JFrame frame;

	public NewsFrame() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBackground(Color.WHITE);
		frame.setBounds(400, 25,370,670);
		frame.setUndecorated(true);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBackground(Color.WHITE);
		label.setBounds(0, 0, 45, 48);
		frame.getContentPane().add(label);
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose(); 
			}
		});
		Image img_l =new ImageIcon(this.getClass().getResource("/back_.png")).getImage();
		label.setIcon(new ImageIcon(img_l));
		
		
		JLabel label_1 = new JLabel("");
		label_1.setBackground(Color.WHITE);
		Image img_2 =new ImageIcon(this.getClass().getResource("/tendulkar.jpeg")).getImage();
		label_1.setIcon(new ImageIcon(img_2));
		label_1.setBounds(27, 74, 305, 168);
		frame.getContentPane().add(label_1);
		
		JTextPane txtpnSachinHasRebutted = new JTextPane();
		txtpnSachinHasRebutted.setBackground(Color.WHITE);
		txtpnSachinHasRebutted.setEditable(false);
		txtpnSachinHasRebutted.setText("recieved no manetory benefit from MI:tendulkar to ombudsman");
		txtpnSachinHasRebutted.setFont(new Font("Century Schoolbook L", Font.BOLD, 12));
		txtpnSachinHasRebutted.setBounds(25, 253, 318, 48);
		frame.getContentPane().add(txtpnSachinHasRebutted);
		
		JLabel label_2 = new JLabel("Cricbuzz staff ");
		label_2.setBackground(Color.WHITE);
		label_2.setFont(new Font("FreeSerif", Font.BOLD, 12));
		label_2.setBounds(25, 310, 105, 15);
		frame.getContentPane().add(label_2);
		
		JLabel lblSunapr = new JLabel("sun ,Apr 28,4:31 p.m.");
		lblSunapr.setBackground(Color.WHITE);
		lblSunapr.setFont(new Font("Umpush", Font.BOLD, 12));
		lblSunapr.setBounds(25, 324, 157, 21);
		frame.getContentPane().add(lblSunapr);
		
		JTextPane txtpnSachinTendulkarHas = new JTextPane();
		txtpnSachinTendulkarHas.setBackground(Color.WHITE);
		txtpnSachinTendulkarHas.setEditable(false);
		txtpnSachinTendulkarHas.setText("\n\nSachin Tendulkar has rebutted the 'Conflict of Interest' charges that were levelled against him, pointing out that he hasn't \"received any compensation\" and doesn't have a decision-making role in the IPL side Mumbai Indians.\n\nTendulkar and VVS Laxman on Wednesday (April 24) were served 'conflict of interest' notices by DK Jain, BCCI's ombudsman-cum-ethics officer, for serving as mentors of Mumbai Indians and Sunrisers Hyderabad respectively, while being members of the Cricket Advisory Committee (CAC). The complaint against their dual roles was filed by Sanjeev Gupta, a member of the Madhya Pradesh Cricket Association (MPCA). The BCCI and the pair were subsequently asked to file written responses to the allegations by April 28.\n");
		txtpnSachinTendulkarHas.setBounds(25, 357, 320, 337);
		frame.getContentPane().add(txtpnSachinTendulkarHas);
		
		
	}
}
