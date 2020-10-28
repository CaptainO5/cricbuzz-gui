/* Suraj K
 * Roll No 411731 */

package cricbuzz;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class FrmO {

	JFrame frmO;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmO window = new FrmO();
					window.frmO.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FrmO() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Image CBLogo1 = new ImageIcon(this.getClass().getResource("/cbLogo1.png")).getImage();
		Image capL = new ImageIcon(this.getClass().getResource("/Cap.png")).getImage();
		frmO = new JFrame();
		frmO.setBounds(400, 25, 375, 667);		
		frmO.getContentPane().setBackground(new Color(10, 175, 133));
		frmO.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(0, 188, 375, 204);
		label.setIcon(new ImageIcon(CBLogo1));
		frmO.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("SIVA");
		label_1.setHorizontalAlignment(SwingConstants.LEFT);
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("High Tower Text", Font.BOLD | Font.ITALIC, 15));
		label_1.setBounds(274, 634, 101, 33);
		frmO.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("SRI SAI");
		label_2.setHorizontalAlignment(SwingConstants.LEFT);
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("High Tower Text", Font.BOLD | Font.ITALIC, 15));
		label_2.setBounds(274, 605, 101, 33);
		frmO.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("SAMEER");
		label_3.setHorizontalAlignment(SwingConstants.LEFT);
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("High Tower Text", Font.BOLD | Font.ITALIC, 15));
		label_3.setBounds(274, 575, 101, 33);
		frmO.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("SURAJ");
		label_4.setHorizontalAlignment(SwingConstants.LEFT);
		label_4.setForeground(Color.WHITE);
		label_4.setFont(new Font("High Tower Text", Font.BOLD | Font.ITALIC, 15));
		label_4.setBounds(274, 548, 101, 33);
		frmO.getContentPane().add(label_4);
		
		JLabel lblCap = new JLabel("");
		lblCap.setBounds(231, 547, 33, 34);
		lblCap.setIcon(new ImageIcon(capL));
		frmO.getContentPane().add(lblCap);
		frmO.setUndecorated(true);
	}
}
