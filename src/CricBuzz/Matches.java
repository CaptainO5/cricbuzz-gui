/* Suraj K
 * Roll No 411731 */

package cricbuzz;

import java.awt.SystemColor;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;

public class Matches {

	JPanel panelMa;
	public Matches() {
		panelMa = new JPanel();
		panelMa.setBounds(0, 0, 350, 630);
		panelMa.setBackground(SystemColor.inactiveCaptionBorder);
		 
		PanelM_1 match0 = new PanelM_1("SAT, 02 MAR 2019", "/ind.png", "/aus.png", "IND", "AUS", "240-4 (48.2)", "236-7 (50.0)", "India won by 6 wkts", 10, 10);
		PanelM_1 match1 = new PanelM_1("SUN, 25 NOV 2018", "/aus.png", "/ind.png", "AUS", "IND", "164-6 (20.0)", "168-4 (19.4)", "India won by 6 wkts", 10, 160);
		PanelM_1 match2 = new PanelM_1("SAT, 22 DEC 2018", "/ban.png", "/wi.png", "BAN", "WI", "140-10 (17.0)", "190-10 (19.2)", "Windies won by 50 runs", 10, 320);
		PanelM_1 match3 = new PanelM_1("TUE, 03 JUL 2019", "/ind.png", "/eng.png", "IND", "ENG", "159-8 (20.0)", "163-2 (18.2)", "India won by 8 wkts", 10, 490);
		
		panelMa.add(match0.pm);
		panelMa.add(match1.pm);
		panelMa.add(match2.pm);
		panelMa.add(match3.pm);
		
		JLabel lblIndiaTourOf = new JLabel("India tour of England, 2019");
		GroupLayout gl_panelMa = new GroupLayout(panelMa);
		gl_panelMa.setHorizontalGroup(
			gl_panelMa.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelMa.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblIndiaTourOf)
					.addContainerGap(292, Short.MAX_VALUE))
		);
		gl_panelMa.setVerticalGroup(
			gl_panelMa.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panelMa.createSequentialGroup()
					.addContainerGap(464, Short.MAX_VALUE)
					.addComponent(lblIndiaTourOf)
					.addGap(149))
		);
		panelMa.setLayout(gl_panelMa);	
	}
}
