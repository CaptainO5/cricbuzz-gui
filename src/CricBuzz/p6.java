/* Sameer Baig
 * 411742
 */

package cricbuzz;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class p6 {

	public JPanel p6;
	public p6() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		p6=new JPanel();
		
		JLabel lblNew = new JLabel("new1");
		Image img1=new ImageIcon(this.getClass().getResource("/i5.png")).getImage();
	    lblNew.setIcon(new ImageIcon(img1));
	    p6.add(lblNew);
	    
		JLabel lblNew_1 = new JLabel("new2");
		Image img2=new ImageIcon(this.getClass().getResource("/i1.png")).getImage();
	    lblNew_1.setIcon(new ImageIcon(img2));
	    p6.add(lblNew_1);
	    
		JLabel lblNew_2 = new JLabel("new3");
		Image img3=new ImageIcon(this.getClass().getResource("/i2.png")).getImage();
	    lblNew_2.setIcon(new ImageIcon(img3));
	    p6.add(lblNew_2);
	    
		JLabel lblNew_3 = new JLabel("new4");
		Image img4=new ImageIcon(this.getClass().getResource("/i3.png")).getImage();
	    lblNew_3.setIcon(new ImageIcon(img4));
	    p6.add(lblNew_3);
	    
		JLabel lblNew_4 = new JLabel("new5");
		Image img5=new ImageIcon(this.getClass().getResource("/i4.png")).getImage();
	    lblNew_4.setIcon(new ImageIcon(img5));
	    p6.add(lblNew_4);
	    
		GroupLayout gl_p6 = new GroupLayout(p6);
		gl_p6.setHorizontalGroup(
			gl_p6.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_p6.createSequentialGroup()
					.addComponent(lblNew, GroupLayout.PREFERRED_SIZE, 370, Short.MAX_VALUE)
					.addGap(45))
				.addGroup(Alignment.TRAILING, gl_p6.createSequentialGroup()
					.addComponent(lblNew_1, GroupLayout.PREFERRED_SIZE, 394, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(Alignment.TRAILING, gl_p6.createSequentialGroup()
					.addGroup(gl_p6.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNew_2, GroupLayout.PREFERRED_SIZE, 369, Short.MAX_VALUE)
						.addComponent(lblNew_3, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 364, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNew_4, GroupLayout.PREFERRED_SIZE, 369, Short.MAX_VALUE))
					.addGap(46))
		);
		gl_p6.setVerticalGroup(
			gl_p6.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_p6.createSequentialGroup()
					.addGap(21)
					.addComponent(lblNew, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNew_1, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNew_2, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblNew_3, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNew_4, GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
					.addContainerGap())
		);
		p6.setLayout(gl_p6);

}
}