package StudentRecordPackage;

import java.awt.*;
import javax.swing.*;
public class Communicator {
	private JTextArea panel2textArea;
	private JScrollPane scrollPane2;
	private JTextField n;
	private JLabel lbl6;
	private Font n1;
	public Communicator()
	{     n1  = new Font("serif",Font.BOLD,30);
		  panel2textArea = new JTextArea();
          panel2textArea.requestFocus();
          panel2textArea.setFont(n1);
          panel2textArea.disable();
          panel2textArea.setText("                       For Chat with Admins \n");
          panel2textArea.setLineWrap(true);
          panel2textArea.setBackground(Color.WHITE);

          
          scrollPane2 = new JScrollPane(panel2textArea);
          scrollPane2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
          scrollPane2.setVisible(false);
          scrollPane2.setBounds(1200,20,480,700);
         
          
          n = new JTextField();
          n.setVisible(false);
          n.setBounds(1200,720,450,30);
          n.setFont(n1);
         
          
          lbl6 = new JLabel();
          ImageIcon img9 = new ImageIcon("sendingbutton2.png");
          lbl6.setIcon(img9);
          lbl6.setBounds(1650,720,25,25);
          lbl6.setVisible(false);
          
	}

}
