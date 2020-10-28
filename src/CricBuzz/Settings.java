/* Suraj K
 * Roll No 411731 */

package cricbuzz;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Image;

import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Settings {
	
	JPanel pnlSettings;
	JLabel lblBack;

	public Settings() {
		initialize();
	}

	private void initialize() {
		pnlSettings = new JPanel();
		pnlSettings.setBackground(new Color(245, 245, 245));
		pnlSettings.setBounds(0, 0, 375, 660);
		pnlSettings.setLayout(null);
		
		SettingsPanel sp = new SettingsPanel();
		
		JScrollPane setScrollPane = new JScrollPane(sp.panelS);
		setScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		setScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		setScrollPane.setBounds(0, 59, 393, 601);
		pnlSettings.add(setScrollPane);
		
		JPanel pnlsettingHead = new JPanel();
		pnlsettingHead.setBounds(0, 0, 375, 60);
		pnlsettingHead.setBackground(new Color(10, 175, 133));
		pnlSettings.add(pnlsettingHead);
		pnlsettingHead.setLayout(null);
		
		lblBack = new JLabel("");
		lblBack.setBounds(0, 0, 45, 60);
		Image greenLeft = new ImageIcon(this.getClass().getResource("/greenLeft.png")).getImage();
		lblBack.setIcon(new ImageIcon(greenLeft));
		pnlsettingHead.add(lblBack);
		
		JLabel lblSettings = new JLabel("Settings");
		lblSettings.setHorizontalAlignment(SwingConstants.CENTER);
		lblSettings.setForeground(Color.WHITE);
		lblSettings.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblSettings.setBounds(42, 11, 74, 49);
		pnlsettingHead.add(lblSettings);


	}
}
