/* Sameer Baig
 * 411742
 */

package cricbuzz;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class p extends MouseAdapter{

	JPanel p;
 p() {
		initialize();
	}

	
	private void initialize() {
		p = new JPanel();
		JLabel label = new JLabel("");
		Image img=new ImageIcon(this.getClass().getResource("/icon1.png")).getImage();
	    label.setIcon(new ImageIcon(img));
	    label.addMouseListener(this);
        p.add(label);
		
		JLabel lblNew = new JLabel("");
		Image img1=new ImageIcon(this.getClass().getResource("/icon3.png")).getImage();
	    lblNew.setIcon(new ImageIcon(img1));
	    lblNew.addMouseListener(this);
		p.add(lblNew);
		
		JLabel lblNew_1 = new JLabel("");
		Image img2=new ImageIcon(this.getClass().getResource("/icon2.png")).getImage();
	    lblNew_1.setIcon(new ImageIcon(img2));
	    lblNew_1.addMouseListener(this);
		p.add(lblNew_1);
		
		JLabel lblNew_2 = new JLabel("");
		Image img3=new ImageIcon(this.getClass().getResource("/icon4.png")).getImage();
	    lblNew_2.setIcon(new ImageIcon(img3));
	    lblNew_2.addMouseListener(this);
		p.add(lblNew_2);
		
		JLabel label_1 = new JLabel("");
		Image img4=new ImageIcon(this.getClass().getResource("/icon5.png")).getImage();
	    label_1.setIcon(new ImageIcon(img4));
	    label_1.addMouseListener(this);
	    p.add(label_1)	;
	    
	    GroupLayout gl_p = new GroupLayout(p);
	    gl_p.setHorizontalGroup(
	    	gl_p.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_p.createSequentialGroup()
	    			.addContainerGap()
	    			.addComponent(label, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
	    			.addGap(18)
	    			.addComponent(lblNew)
	    			.addGap(18)
	    			.addComponent(lblNew_1)
	    			.addGap(10)
	    			.addComponent(lblNew_2)
	    			.addGap(27)
	    			.addComponent(label_1)
	    			.addGap(24))
	    );
	    gl_p.setVerticalGroup(
	    	gl_p.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_p.createSequentialGroup()
	    			.addContainerGap()
	    			.addGroup(gl_p.createParallelGroup(Alignment.LEADING)
	    				.addComponent(label_1)
	    				.addComponent(lblNew_1)
	    				.addComponent(lblNew_2)
	    				.addComponent(lblNew)
	    				.addComponent(label, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE))
	    			.addContainerGap(29, Short.MAX_VALUE))
	    );
		p.setLayout(gl_p);
		
	}
	public void mouseClicked(MouseEvent e){
		   new VideosFrame();
		}
}
