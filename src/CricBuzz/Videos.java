/* Sameer Baig
 * 411742
 */

package cricbuzz;

import java.awt.EventQueue;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JScrollBar;

public class Videos {
	JPanel panel;


	public Videos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		p videos = new p();
		
		p3 latestVideos=new p3();
		
		p4 matchanalysis=new p4();
		
		panel = new JPanel();

		
		JLabel Videos = new JLabel("       Videos");
		Videos.setForeground(new Color(0, 0, 0));
		Videos.setBackground(Color.GREEN);
		Videos.setFont(new Font("Arial", Font.BOLD, 16));
		Videos.setHorizontalAlignment(SwingConstants.LEFT);
		
		
		JLabel lblLatestVideos = new JLabel("Latest Videos");
		lblLatestVideos.setFont(new Font("Arial", Font.PLAIN, 15));
		
		JLabel lblN = new JLabel("Match Analysis");
		lblN.setFont(new Font("Arial", Font.PLAIN, 15));
		
		JScrollPane scrollPane = new JScrollPane(videos.p);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		
		JScrollPane scrollPane1 = new JScrollPane(latestVideos.p3);
		scrollPane1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
		scrollPane1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		JScrollPane scrollPane2 = new JScrollPane(matchanalysis.p4);
		scrollPane2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
		scrollPane2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(10)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 339, GroupLayout.PREFERRED_SIZE))
				.addComponent(Videos, GroupLayout.PREFERRED_SIZE, 339, GroupLayout.PREFERRED_SIZE)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(10)
					.addComponent(lblLatestVideos, GroupLayout.PREFERRED_SIZE, 330, GroupLayout.PREFERRED_SIZE))
				.addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 339, GroupLayout.PREFERRED_SIZE)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(10)
					.addComponent(lblN, GroupLayout.PREFERRED_SIZE, 330, GroupLayout.PREFERRED_SIZE))
				.addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, 339, GroupLayout.PREFERRED_SIZE)
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(27)
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE))
						.addComponent(Videos, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addComponent(lblLatestVideos, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
					.addGap(2)
					.addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 207, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblN, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(34)
							.addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, 207, GroupLayout.PREFERRED_SIZE))))
		);
		panel.setLayout(gl_panel);
		
		
		
	}
}
