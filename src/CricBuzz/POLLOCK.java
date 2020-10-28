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
import java.awt.Color;

public class POLLOCK {

	private JFrame frame;

	public POLLOCK() {
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
		frame.setBounds(400, 25,  370, 670);
		frame.setUndecorated(true);
		frame.getContentPane().setLayout(null);
		
		Panel panel = new Panel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 330, 627);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBackground(Color.WHITE);
		label.setBounds(0, 0, 45, 48);
		panel.add(label);
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
			}
		});
		Image img_1 =new ImageIcon(this.getClass().getResource("/back_.png")).getImage();
		label.setIcon(new ImageIcon(img_1));
		
		
		JLabel label_2 = new JLabel("");
		label_2.setBackground(Color.WHITE);
		Image img_2 =new ImageIcon(this.getClass().getResource("/russell.jpeg")).getImage();
		label_2.setIcon(new ImageIcon(img_2));
		label_2.setBounds(12, 64, 305, 168);
		panel.add(label_2);
		
		JTextPane txtpnRussellsPressConference = new JTextPane();
		txtpnRussellsPressConference.setBackground(Color.WHITE);
		txtpnRussellsPressConference.setEditable(false);
		txtpnRussellsPressConference.setText("russell's press conference achieves nothing for KKR ;POLLOCK");
		txtpnRussellsPressConference.setFont(new Font("Century Schoolbook L", Font.BOLD, 12));
		txtpnRussellsPressConference.setBounds(12, 244, 318, 42);
		panel.add(txtpnRussellsPressConference);
		
		JLabel label_3 = new JLabel("Cricbuzz staff ");
		label_3.setBackground(Color.WHITE);
		label_3.setFont(new Font("FreeSerif", Font.BOLD, 12));
		label_3.setBounds(10, 289, 105, 15);
		panel.add(label_3);
		
		JLabel lblSunapr = new JLabel("sun ,Apr 28,6:54 p.m.");
		lblSunapr.setBackground(Color.WHITE);
		lblSunapr.setFont(new Font("Umpush", Font.BOLD, 12));
		lblSunapr.setBounds(12, 302, 157, 21);
		panel.add(lblSunapr);
		
		JTextPane txtpnItsNotBeen = new JTextPane();
		txtpnItsNotBeen.setBackground(Color.WHITE);
		txtpnItsNotBeen.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtpnItsNotBeen.setEditable(false);
		txtpnItsNotBeen.setText("its not been the greatest season for the KKR .after winning four out of their first five games ,they are now in the middle of an unreal losing streak thats streched up to six matches .and to make things worse andrew russell,one of the ir senior plauer,recently lit it all out at a press conference , passionately expressing his displeasure towards the decision making in the team");
		txtpnItsNotBeen.setBounds(10, 335, 320, 317);
		panel.add(txtpnItsNotBeen);
	}

}
