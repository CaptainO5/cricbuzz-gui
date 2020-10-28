/* Sri Sai
 * 411757
 */

package cricbuzz;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Panel;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.SystemColor;
import java.awt.Color;

public class AKRAMKHAN {

	private JFrame frame;

	public AKRAMKHAN() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(Color.WHITE);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(400, 25, 370, 670);
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
		Image img_1 =new ImageIcon(this.getClass().getResource("/back_.png")).getImage();
		label.setIcon(new ImageIcon(img_1));
		
		
		JLabel label_1 = new JLabel("");
		label_1.setBackground(Color.WHITE);
		Image img_2 =new ImageIcon(this.getClass().getResource("/akram.jpeg")).getImage();
		label_1.setIcon(new ImageIcon(img_2));
		label_1.setBounds(13, 107, 305, 168);
		frame.getContentPane().add(label_1);
		
		JTextPane txtpnIncludedRezaAnd = new JTextPane();
		txtpnIncludedRezaAnd.setBackground(Color.WHITE);
		txtpnIncludedRezaAnd.setEditable(false);
		txtpnIncludedRezaAnd.setText("included reza and taskin on the insistence of head coach :akram khan");
		txtpnIncludedRezaAnd.setFont(new Font("Century Schoolbook L", Font.BOLD, 12));
		txtpnIncludedRezaAnd.setBounds(13, 275, 318, 42);
		frame.getContentPane().add(txtpnIncludedRezaAnd);
		
		JLabel label_2 = new JLabel("Cricbuzz staff ");
		label_2.setBackground(Color.WHITE);
		label_2.setAutoscrolls(true);
		label_2.setOpaque(true);
		label_2.setFont(new Font("FreeSerif", Font.BOLD, 12));
		label_2.setBounds(13, 325, 105, 15);
		frame.getContentPane().add(label_2);
		
		JLabel lblSunapr = new JLabel("sun ,Apr 28,6:38 p.m.");
		lblSunapr.setBackground(Color.WHITE);
		lblSunapr.setFont(new Font("Umpush", Font.BOLD, 12));
		lblSunapr.setBounds(12, 341, 157, 21);
		frame.getContentPane().add(lblSunapr);
		
		JTextPane txtpnBangladeshCrickerBoard = new JTextPane();
		txtpnBangladeshCrickerBoard.setBackground(Color.WHITE);
		txtpnBangladeshCrickerBoard.setEditable(false);
		txtpnBangladeshCrickerBoard.setText("bangladesh cricker board operations chairman akram khan said ,on sunday, that taskin ahmed and farthad reza were included in the squad for the tri nation series involving ireland and west indies on the insistence of head coach,steve rhodes .the addition of the two players saw banglasesh's squad for the tournament rise to 19 ,but khan reveaked that there was a need for them as the other pacers hae injury clouds hovering above them .");
		txtpnBangladeshCrickerBoard.setBounds(13, 374, 320, 276);
		frame.getContentPane().add(txtpnBangladeshCrickerBoard);
	}

}
