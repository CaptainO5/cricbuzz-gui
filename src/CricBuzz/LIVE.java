/* Sri Sai
 * 411757
 */

package cricbuzz;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Panel;
import javax.swing.JLabel;
import javax.swing.JFormattedTextField;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;

public class LIVE {

	private JFrame frame;

	public LIVE() {
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
		
		Panel panel = new Panel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 0, 330, 642);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JTextPane txtpnLiveCricketScore = new JTextPane();
		txtpnLiveCricketScore.setBackground(Color.WHITE);
		txtpnLiveCricketScore.setEditable(false);
		txtpnLiveCricketScore.setText("live cricket score :KKR vs MI ,match 47,IPL 2019");
		txtpnLiveCricketScore.setFont(new Font("Century Schoolbook L", Font.BOLD, 12));
		txtpnLiveCricketScore.setBounds(0, 252, 318, 21);
		panel.add(txtpnLiveCricketScore);
		
		JLabel label_1 = new JLabel("Cricbuzz staff ");
		label_1.setBackground(Color.WHITE);
		label_1.setFont(new Font("FreeSerif", Font.BOLD, 12));
		label_1.setBounds(10, 277, 105, 15);
		panel.add(label_1);
		
		JLabel lblSunaprpm = new JLabel("sun ,Apr 28,7:05pm");
		lblSunaprpm.setBackground(Color.WHITE);
		lblSunaprpm.setFont(new Font("Umpush", Font.BOLD, 12));
		lblSunaprpm.setBounds(0, 295, 157, 21);
		panel.add(lblSunaprpm);
		
		JLabel label = new JLabel("");
		label.setBackground(Color.WHITE);
		Image img_2=new ImageIcon(this.getClass().getResource("/mivskkr.jpeg")).getImage();
		label.setIcon(new ImageIcon(img_2));
		label.setBounds(10, 73, 305, 168);
		panel.add(label);
		
		JLabel label_3 = new JLabel("");
		label_3.setBackground(Color.WHITE);
		label_3.setBounds(0, 0, 45, 48);
		panel.add(label_3);
		label_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
			}
		});
		Image img_1=new ImageIcon(this.getClass().getResource("/back_.png")).getImage();
		label_3.setIcon(new ImageIcon(img_1));
		
		
		JTextPane txtpnSoAWin = new JTextPane();
		txtpnSoAWin.setBackground(Color.WHITE);
		txtpnSoAWin.setEditable(false);
		txtpnSoAWin.setText("so a win for KKR over MI after four years ! they racked up the season's highest total and broke out of their their six match losing streak .MI could have qualified with a win tonight but that's a story for some other day.more importantly .KKR hang by a thread in the competition .what spice what joy .hope you liked our coverage .see you tomorrow ta-ta!\n");
		txtpnSoAWin.setBounds(0, 370, 330, 272);
		panel.add(txtpnSoAWin);
		
		JTextPane txtpnWelcomeToOur = new JTextPane();
		txtpnWelcomeToOur.setBackground(Color.WHITE);
		txtpnWelcomeToOur.setEditable(false);
		txtpnWelcomeToOur.setFont(new Font("Ubuntu", Font.BOLD | Font.ITALIC, 12));
		txtpnWelcomeToOur.setText("welcome to our IPL blog! tweet your opinions to @prat1204");
		txtpnWelcomeToOur.setBounds(10, 320, 308, 36);
		panel.add(txtpnWelcomeToOur);
	}
}
