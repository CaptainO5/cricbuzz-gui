/* Sameer Baig
 * 411742
 */

package cricbuzz;

import java.awt.EventQueue;

import java.awt.Image;
import java.awt.Panel;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class p4 extends MouseAdapter {
	public JPanel p4;
	
	
	public p4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		p4=new JPanel();
		
		JLabel lblNew = new JLabel("");
		Image img=new ImageIcon(this.getClass().getResource("/a1.png")).getImage();
	    lblNew.setIcon(new ImageIcon(img));
	    lblNew.addMouseListener(this);
	    p4.add(lblNew);
		
		JLabel lblNew_1 = new JLabel("");
		Image img1=new ImageIcon(this.getClass().getResource("/a2.png")).getImage();
	    lblNew_1.setIcon(new ImageIcon(img1));
	    lblNew_1.addMouseListener(this);
	    p4.add(lblNew_1);
	    
		JLabel lblNew_2 = new JLabel("");
		Image img2=new ImageIcon(this.getClass().getResource("/a3.png")).getImage();
	    lblNew_2.setIcon(new ImageIcon(img2));
	    lblNew_2.addMouseListener(this);
	    p4.add(lblNew_2);
	    
		JLabel lblNew_3 = new JLabel("");
		Image img3=new ImageIcon(this.getClass().getResource("/a4.png")).getImage();
	    lblNew_3.setIcon(new ImageIcon(img3));
	    lblNew_3.addMouseListener(this);
	    p4.add(lblNew_3);
	    
		JLabel lblNew_4 = new JLabel("");
		Image img4=new ImageIcon(this.getClass().getResource("/a5.png")).getImage();
	    lblNew_4.setIcon(new ImageIcon(img4));
	    lblNew_4.addMouseListener(this);
	    p4.add(lblNew_4);
	    
		GroupLayout gl_p4 = new GroupLayout(p4);
		gl_p4.setHorizontalGroup(
			gl_p4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_p4.createSequentialGroup()
					.addComponent(lblNew, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNew_1, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNew_2, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNew_3, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE)
					.addGap(14)
					.addComponent(lblNew_4, GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE))
		);
		gl_p4.setVerticalGroup(
			gl_p4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_p4.createSequentialGroup()
					.addGroup(gl_p4.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_p4.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblNew, GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblNew_1, GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblNew_4, GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblNew_2, GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNew_3, GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(115, Short.MAX_VALUE))
		);
		p4.setLayout(gl_p4);
		
		
	}
	public void mouseClicked(MouseEvent e){
		   new VideosFrame();
		}
}
