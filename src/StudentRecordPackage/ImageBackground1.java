package StudentRecordPackage;

import java.awt.*;
import javax.swing.*;


class  ImageBackground1 extends JPanel
{
    public  void paintComponent(Graphics s)
    {
        super.paintComponent(s);
        Image  i = new ImageIcon("backgroundimage4.jpg").getImage();
        s.drawImage(i,0,0,getWidth(),getHeight(),this);
    }
}
 
