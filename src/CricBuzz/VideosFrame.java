/* Sameer Baig
 * 411742
 */

package cricbuzz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VideosFrame {

	private JFrame frame;
    public VideosFrame() {
    	initialize();
    	frame.setVisible(true);
    }
	/**
	 * Launch the application.
	 */
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
		frame.setBounds(400, 25, 370, 670);
		frame.setUndecorated(true);
		frame.getContentPane().setLayout(null);
		
		p6 panel1=new p6();
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaptionText);
		panel.setBounds(0, 0, 370, 200);
		frame.getContentPane().add(panel);
		
		JLabel lblN_1 = new JLabel("");
		lblN_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frame.dispose();
			}
		});
		Image img=new ImageIcon(this.getClass().getResource("/b1.png")).getImage();
	    lblN_1.setIcon(new ImageIcon(img));
	    panel.add(lblN_1);
	    
		JLabel lblLaba = new JLabel("");
		Image img1=new ImageIcon(this.getClass().getResource("/b2.png")).getImage();
	    lblLaba.setIcon(new ImageIcon(img1));
	    panel.add(lblLaba);
	    
		JLabel lblNew = new JLabel("");
		Image img2=new ImageIcon(this.getClass().getResource("/b3.png")).getImage();
	    lblNew.setIcon(new ImageIcon(img2));
	    panel.add(lblNew);
	    
		JLabel lblNew_1 = new JLabel("new2");
		Image img3=new ImageIcon(this.getClass().getResource("/b4.png")).getImage();
	    lblNew_1.setIcon(new ImageIcon(img3));
	    panel.add(lblNew_1);
	    
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
					.addGap(161)
					.addComponent(lblNew, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(211, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNew_1, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 370, Short.MAX_VALUE)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblN_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 297, Short.MAX_VALUE)
							.addComponent(lblLaba, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)))
					.addGap(30))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblN_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
							.addComponent(lblNew)
							.addGap(68))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblLaba, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNew_1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
		);
		panel.setLayout(gl_panel);
		
		JLabel lblNew_2 = new JLabel("  Cricbuzz LIVE: Match 47, Kolkata v Mumbai, Post-match show");
		lblNew_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		lblNew_2.setBounds(0, 199, 370, 57);
		frame.getContentPane().add(lblNew_2);
		
		JLabel lblHdh = new JLabel("");
		Image img5=new ImageIcon(this.getClass().getResource("/b5.png")).getImage();
	    lblHdh.setIcon(new ImageIcon(img5));
		lblHdh.setBounds(0, 267, 96, 30);
		frame.getContentPane().add(lblHdh);
		
		JLabel lblJfjd = new JLabel("jfjd");
		Image img6=new ImageIcon(this.getClass().getResource("/b6.png")).getImage();
	    lblJfjd.setIcon(new ImageIcon(img6));
		lblJfjd.setBounds(102, 265, 96, 30);
		frame.getContentPane().add(lblJfjd);
		
		JLabel lblFvf = new JLabel("  Suggested Videos");
		lblFvf.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblFvf.setBounds(0, 308, 370, 39);
		frame.getContentPane().add(lblFvf);
		
		JScrollPane scrollPane = new JScrollPane(panel1.p6);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(0, 347, 370, 252);
		frame.getContentPane().add(scrollPane);
	}
}
