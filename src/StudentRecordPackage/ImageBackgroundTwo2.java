package StudentRecordPackage;
import java.awt.*;
import javax.swing.*;


 class ImageBackgroundTwo2 extends JPanel

{
	
    public void paintComponent(Graphics r)
    {
        super.paintComponent(r);
        Image image = new ImageIcon("backgroundimage4.jpg").getImage();
        r.drawImage(image,0,0,400,500,this);
    }
}
 



