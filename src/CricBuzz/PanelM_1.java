/* Suraj K
 * Roll No 411731 */

package cricbuzz;

import javax.swing.JPanel;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PanelM_1 extends MouseAdapter{
	
	JPanel pm;

	public PanelM_1(String details, String r1, String r2, String cn1, String cn2, String s1, String s2, String result, int i, int j) {

		pm = new JPanel();
		pm.addMouseListener(this);
		pm.setBackground(Color.WHITE);
		pm.setBounds(i, j, 330, 135);
		pm.setLayout(null);
		
		Image c1 = new ImageIcon(this.getClass().getResource(r1)).getImage();
		Image c2 = new ImageIcon(this.getClass().getResource(r2)).getImage();
		
		JLabel lblDetails = new JLabel(details);
		lblDetails.setForeground(Color.GRAY);
		lblDetails.setBounds(10, 0, 315, 25);
		pm.add(lblDetails);
		
		JLabel lblC1 = new JLabel();
		lblC1.setBounds(10, 36, 30, 27);
		lblC1.setIcon(new ImageIcon(c1));
		lblC1.addMouseListener(this);
		pm.add(lblC1);
		
		JLabel lblC2 = new JLabel();
		lblC2.setBounds(10, 74, 30, 25);
		lblC2.setIcon(new ImageIcon(c2));
		lblC2.addMouseListener(this);
		pm.add(lblC2);
		
		JLabel lblResult = new JLabel(result);
		lblResult.setForeground(Color.BLUE);
		lblResult.setBounds(10, 110, 315, 14);
		pm.add(lblResult);
		
		JLabel lblCName1 = new JLabel(cn1);
		lblCName1.setForeground(Color.LIGHT_GRAY);
		lblCName1.setBounds(50, 42, 48, 14);
		pm.add(lblCName1);
		
		JLabel lblCName2 = new JLabel(cn2);
		lblCName2.setForeground(Color.LIGHT_GRAY);
		lblCName2.setBounds(50, 79, 48, 14);
		pm.add(lblCName2);
		
		JLabel lblScore1 = new JLabel(s1);
		lblScore1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblScore1.setHorizontalAlignment(SwingConstants.CENTER);
		lblScore1.setBounds(170, 36, 138, 27);
		pm.add(lblScore1);
		
		JLabel lblScore2 = new JLabel(s2);
		lblScore2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblScore2.setHorizontalAlignment(SwingConstants.CENTER);
		lblScore2.setBounds(170, 72, 138, 27);
		pm.add(lblScore2);
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		pm.setBackground(new Color(220, 220, 220));
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		pm.setBackground(Color.WHITE);
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		new MatchesFrame();
	}
}
