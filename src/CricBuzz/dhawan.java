/* Sri Sai
 * 411757
 */

package cricbuzz;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Panel;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;

public class dhawan {

	private JFrame frame;

	public dhawan() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame("News");
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBackground(Color.WHITE);
		frame.setUndecorated(true);
		frame.setBounds(400, 25, 370, 670);
		
		Panel panel = new Panel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 10, 330, 667);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBackground(Color.WHITE);
		Image img_l =new ImageIcon(this.getClass().getResource("/dhawan.jpeg")).getImage();
		label.setIcon(new ImageIcon(img_l));
		label.setBounds(13, 117, 305, 168);
		panel.add(label);
		
		JTextPane txtpnDcSealPlay = new JTextPane();
		txtpnDcSealPlay.setBackground(Color.WHITE);
		txtpnDcSealPlay.setEditable(false);
		txtpnDcSealPlay.setFont(new Font("Century Schoolbook L", Font.BOLD, 12));
		txtpnDcSealPlay.setText("DC seal play offs berth after six years ");
		txtpnDcSealPlay.setBounds(13, 296, 318, 21);
		panel.add(txtpnDcSealPlay);
		
		JTextPane txtpnWarBackTo = new JTextPane();
		txtpnWarBackTo.setBackground(Color.WHITE);
		txtpnWarBackTo.setEditable(false);
		txtpnWarBackTo.setText("way back to 2012 ,DD had made it past the league stage of the IPL for the third time infive seasons.but their next six years were filled with disappointment as their best finish was the sixth position they securesd in 2016 and 2017.the six year drought finally came to an end on sunday when DC  secured a 16 run win over RCB .half centuries from shikhar dhawan and sheryas iyer and an cameo from shefane rutherford powered the capitals to a total of 187 for 5 .in reply,the RCB started well but ran ran out of steam to an end up with their eighth loss in 12 games .meanwhile ,the capitals registered their eighth win in 12 games ,which not only helped them top the table but also paved way for their qualification to the playoffs .  ");
		txtpnWarBackTo.setBounds(13, 384, 320, 276);
		panel.add(txtpnWarBackTo);
		
		JLabel lblCricbuzzStaff = new JLabel("Cricbuzz staff ");
		lblCricbuzzStaff.setBackground(Color.WHITE);
		lblCricbuzzStaff.setFont(new Font("FreeSerif", Font.BOLD, 12));
		lblCricbuzzStaff.setBounds(13, 335, 105, 15);
		panel.add(lblCricbuzzStaff);
		
		JLabel lblSunaprpm = new JLabel("sun ,Apr 28,7:51pm");
		lblSunaprpm.setBackground(Color.WHITE);
		lblSunaprpm.setFont(new Font("Umpush", Font.BOLD, 12));
		lblSunaprpm.setBounds(12, 351, 157, 21);
		panel.add(lblSunaprpm);
		
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(panel);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(0, 0, 45, 48);
		panel.add(label_1);
		label_1.setBackground(Color.WHITE);
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
			}
		});
		Image img_1=new ImageIcon(this.getClass().getResource("/back_.png")).getImage();
		label_1.setIcon(new ImageIcon(img_1));
		
	}
}
