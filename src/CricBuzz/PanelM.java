/* Suraj K
 * Roll No 411731 */

package cricbuzz;

import javax.swing.JPanel;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PanelM extends MouseAdapter{
	
	JTextField txtResult;
	JPanel pnlMatch;
	JLabel lblCountry1, lblCountry2, lblScore1, lblScore2;
	private JLabel lblMatchDetails;

	public PanelM(String details, String r1, String r2, String co1, String co2, String s1, String s2, String result) {

		pnlMatch = new JPanel();
		pnlMatch.setBackground(Color.WHITE);
		pnlMatch.setLayout(null);
		pnlMatch.addMouseListener(this);
		
		Image c1 = new ImageIcon(this.getClass().getResource(r1)).getImage();
		lblCountry1 = new JLabel("");
		lblCountry1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCountry1.setToolTipText("Country one");
		lblCountry1.setBounds(10, 30, 39, 29);
		lblCountry1.setIcon(new ImageIcon(c1));
		lblCountry1.addMouseListener(this);
		pnlMatch.add(lblCountry1);
		
		Image c2 = new ImageIcon(this.getClass().getResource(r2)).getImage();
		lblCountry2 = new JLabel("");
		lblCountry2.setHorizontalAlignment(SwingConstants.CENTER);
		lblCountry2.setToolTipText("Country two");
		lblCountry2.setBounds(10, 82, 39, 29);
		lblCountry2.setIcon(new ImageIcon(c2));
		lblCountry2.addMouseListener(this);
		pnlMatch.add(lblCountry2);
		
		txtResult = new JTextField();
		txtResult.setForeground(Color.BLUE);
		txtResult.setEditable(false);
		txtResult.setBackground(UIManager.getColor("Button.background"));
		txtResult.setHorizontalAlignment(SwingConstants.RIGHT);
		txtResult.setText(result);
		txtResult.setBounds(0, 136, 274, 20);
		pnlMatch.add(txtResult);
		txtResult.setColumns(10);
		
		JLabel lblScore1 = new JLabel(s1);
		lblScore1.setHorizontalAlignment(SwingConstants.CENTER);
		lblScore1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblScore1.setBounds(125, 18, 129, 49);
		pnlMatch.add(lblScore1);
		
		JLabel lblScore2 = new JLabel(s2);
		lblScore2.setHorizontalAlignment(SwingConstants.CENTER);
		lblScore2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblScore2.setBounds(125, 69, 129, 50);
		pnlMatch.add(lblScore2);
		
		lblMatchDetails = new JLabel("");
		lblMatchDetails.setText(details);
		lblMatchDetails.setToolTipText("Match Details");
		lblMatchDetails.setForeground(SystemColor.activeCaptionBorder);
		lblMatchDetails.setHorizontalAlignment(SwingConstants.CENTER);
		lblMatchDetails.setBounds(0, 0, 274, 25);
		lblMatchDetails.addMouseListener(this);
		pnlMatch.add(lblMatchDetails);
		
		JLabel lblCname = new JLabel(co1);
		lblCname.setForeground(Color.GRAY);
		lblCname.setBounds(63, 37, 56, 14);
		pnlMatch.add(lblCname);
		
		JLabel lblCname2 = new JLabel(co2);
		lblCname2.setForeground(Color.GRAY);
		lblCname2.setBounds(64, 89, 56, 14);
		pnlMatch.add(lblCname2);
		
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		pnlMatch.setBackground(new Color(220, 220, 220));
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		pnlMatch.setBackground(Color.WHITE);
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		new MatchesFrame();
	}
}
