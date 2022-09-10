package StudentRecordPackage;

import java.awt.*;
import javax.swing.*;

import javax.swing.ImageIcon;
public class ImageBackgroundForCommunicator extends JPanel {
	  public void paintComponent(Graphics r)
	    {
	        super.paintComponent(r);
	        Image image = new ImageIcon("backgroundfor12.jpg").getImage();
	        r.drawImage(image,0,0,getWidth(),getHeight(),this);
	    }

}
