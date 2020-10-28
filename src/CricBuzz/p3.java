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
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;

public class p3 extends MouseAdapter  {

		
	public JPanel p3;
	
	p3(){
		initialize();
	}
	
	private void initialize() {
	
	
	p3=new JPanel();
	
	JLabel lblNew = new JLabel("");
	Image img=new ImageIcon(this.getClass().getResource("/1.png")).getImage();
    lblNew.setIcon(new ImageIcon(img));
    lblNew.addMouseListener(this);
    p3.add(lblNew);
	
	JLabel lblNew_1 = new JLabel("");
	Image img1=new ImageIcon(this.getClass().getResource("/2.png")).getImage();
    lblNew_1.setIcon(new ImageIcon(img1));
    lblNew_1.addMouseListener(this);
    p3.add(lblNew_1);
    
	JLabel lblNew_2 = new JLabel("");
	Image img2=new ImageIcon(this.getClass().getResource("/3.png")).getImage();
    lblNew_2.setIcon(new ImageIcon(img2));
    lblNew_2.addMouseListener(this);
    p3.add(lblNew_2);
    
	JLabel lblNew_3 = new JLabel("");
	Image img3=new ImageIcon(this.getClass().getResource("/4.png")).getImage();
    lblNew_3.setIcon(new ImageIcon(img3));
    lblNew_3.addMouseListener(this);
    p3.add(lblNew_3);
    
	JLabel lblNew_4 = new JLabel("");
	Image img4=new ImageIcon(this.getClass().getResource("/5.png")).getImage();
    lblNew_4.setIcon(new ImageIcon(img4));
    lblNew_4.addMouseListener(this);
    p3.add(lblNew_4);
    
	GroupLayout gl_p3 = new GroupLayout(p3);
	gl_p3.setHorizontalGroup(
		gl_p3.createParallelGroup(Alignment.LEADING)
			.addGroup(gl_p3.createSequentialGroup()
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
	gl_p3.setVerticalGroup(
		gl_p3.createParallelGroup(Alignment.LEADING)
			.addGroup(gl_p3.createSequentialGroup()
				.addGroup(gl_p3.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_p3.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNew, GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNew_1, GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNew_4, GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNew_2, GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE))
					.addComponent(lblNew_3, GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE))
				.addContainerGap(115, Short.MAX_VALUE))
	);
	p3.setLayout(gl_p3);
	

}
	public void mouseClicked(MouseEvent e){
		   new VideosFrame();
		}
}