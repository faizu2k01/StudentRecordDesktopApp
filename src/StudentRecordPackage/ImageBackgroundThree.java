package StudentRecordPackage;

import java.awt.*;
import javax.swing.*;
public class ImageBackgroundThree extends JPanel{
	
	public void paintComponent(Graphics u)
	{
		super.paintComponent(u);
		Image o = new ImageIcon("backgroundimage3.jpg").getImage();
		u.drawImage(o,0,0,getWidth(),getHeight(),this);
	}

}
