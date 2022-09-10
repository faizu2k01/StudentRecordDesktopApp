package StudentRecordPackage;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.*;

public class FrontPage  {
      JFrame frame;
     JLabel label,label2,label3,label4,label5,label6;
     JLabel label7,label8,label9,label10,label11,label12,label13,label14,label15,label16,lbl,lbl1,lbl2,lbl3,lbl4,lbl5,lbl6,lbl7;
    JButton button,button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11,buttonpdf;
    JPanel panel,panel1,panel2,panel3,backgroundpanel,companelInpanle2;
    JTextField text1,text2,text3,text4,text5,text6,text7,text8,n,n5;
    JTextArea textArea1,panel2textArea,panel1textArea,panel3textArea,paneltextArea4,paneltextArea5,paneltextArea6;
    String s1,s3,s4,s2,s5,s6,s7,s8;
    Font n1,font;
    JScrollPane scrollPane2,scrollPane,scrollPane1,scrollPane3,scrollPane4,scrollPane5,scrollPane6;
    
      public static void main(String[] arg)
      {
    	  FrontPage o = new FrontPage();
    	  o.go();
      }
        public void go()
        {
        frame = new JFrame();
        frame.setBounds(0,0,1980,1080);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        backgroundpanel = new ImageBackground1();
        frame.setContentPane(backgroundpanel);
        frame.setLayout(null);


        label = new JLabel("Student Record Management");
         font  = new Font("serif",Font.BOLD,80);
        label.setFont(font);

        label.setVisible(true);
        label.setBounds(500,100,1200,500);
        frame.getContentPane().add(label);

       button  = new JButton("Press for further");
       button.setVisible(true);
       button.setBounds(850,400,200,50);
       Font f = new Font("serif",Font.BOLD,20);
        n1 =  new Font("serif",Font.BOLD,20);
       button.setFont(f);
       frame.getContentPane().add(button);
       button.addActionListener(new SecondPage());

            panel = new ImageBackground1();
            panel.setBounds(1,1,1980,1080);
            panel.setBackground(Color.WHITE);
            panel.setVisible(true);

            button1 = new JButton("Data Insertion");
            button1.setVisible(true);
            button1.setFont(n1);
            button1.setBounds(50,500,200,50);
       
            panel.add(button1);

            panel1 = new ImageBackground1();
            panel1.setVisible(true);
            panel1.setBounds(1,1,1982,1080);
            panel1.setBackground(Color.WHITE);
            button1.addActionListener(new ThirdPage());
            
            button2 = new JButton("Privious");
            button2.setBounds(50,500,200,50);
            button2.setFont(n1);
            button2.setVisible(true);
            panel.setLayout(null);
            panel1.add(button2);
           
            
            button3 = new JButton("Exit");
            button3.setVisible(true);
            button3.setFont(n1);
            button3.setBounds(300,500,150,50);
            panel.add(button3);
            button4 = new JButton("Data Retrieve");
            button4.setVisible(true);
            button4.setFont(n1);
            button4.setBounds(500,500,200,50);
            button4.addActionListener(new FourPage());
            panel.add(button4);


            panel2 = new ImageBackground1();
            panel2.setLayout(null);
            panel2.setVisible(true);
            panel2.setBounds(1,1,1980,1080);


            Font font1 = new Font("serif",Font.BOLD,35);
            label3 = new JLabel("Choose your Quary");
            label3.setFont(font1);
            label3.setVisible(true);
            label3.setBounds(50,100,500,40);
            panel.add(label3);

            Font font2 = new Font("serif",Font.BOLD,30);
            label4 = new JLabel();
            label4.setText("Click 'Data Insertion' button for data entry");
            label4.setFont(font2);
            label4.setVisible(true);
            label4.setBounds(50,140,600,80);
            panel.add(label4);

            Font font3 = new Font("serif",Font.BOLD,30);
            label5 = new JLabel();
            label5.setText("Click 'Data Retrieve' button for data show");
            label5.setFont(font3);
            label5.setVisible(true);
            label5.setBounds(50,180,600,80);
            panel.add(label5);

            Font font4 = new Font("serif",Font.BOLD,30);
            label6 = new JLabel();
            label6.setText("Click 'Exit' button for closing the window");
            label6.setFont(font4);
            label6.setVisible(true);
            label6.setBounds(50,220,600,80);
            panel.add(label6);
            
            /*Panel one clicker logos*/
            
            lbl3 = new JLabel();
            ImageIcon img4 = new ImageIcon("listofadmin.png");
            lbl3.setIcon(img4);
            lbl3.setBounds(1750,100,200,200);
            lbl3.setVisible(true);
            lbl3.addMouseListener(new Information());
            panel.add(lbl3);
            
            
            paneltextArea4 = new JTextArea();
            
            paneltextArea4.setBackground(Color.WHITE);
            paneltextArea4.setFont(n1);
            try {
            	
            }catch(Exception e)
            {
            	
            }
            paneltextArea4.setText("                       List of Admin users \n"
            		+ "\n"
            		+ "1. Er. Dipti Ranjan Tiwari (HOD-CSE)"
            		+ "\n2. Er. Aarifa khan "
            		+ "\n3. Er. Fareed Siddiqui (Dean-LIT)"
            		+ "\n4. Er. Vipin Jisawal (Director-LIT)");
            paneltextArea4.setEnabled(true);
            paneltextArea4.setLineWrap(true);
            paneltextArea4.setVisible(true);

            scrollPane4 = new JScrollPane(paneltextArea4);
            scrollPane4.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
            scrollPane4.setVisible(false);
            scrollPane4.setBounds(1200,20,480,700);
            panel.add(scrollPane4);
            
            
            
            
            lbl4 = new JLabel();
            ImageIcon img5 = new ImageIcon("listofcategory.png");
            lbl4.setIcon(img5);
            lbl4.setBounds(1750,300,200,200);
            lbl4.setVisible(true);
            lbl4.addMouseListener(new CategoryClasses());
            panel.add(lbl4);
            
            paneltextArea5 = new JTextArea();
            paneltextArea5.requestFocus();
            paneltextArea5.setFont(n1);
            paneltextArea5.setText("                   List of Branches and classes\n\n"
            		+ "MBA"
            		+ "\nM.Tech"
            		+ "\n* Computer Science and Engineering"
            		+ "\n* Machanical Engineering"
            		+ "\n* Civil Engineering"
            		+ "\n* Electrical Engineering\n"
            		+ "B.Tech "
            		+ "\n* Computer Science and Engineering"
            		+ "\n* Information Technology"
            		+ "\n* Civil Engineering"
            		+ "\n* Machanical Engineering"
            		+ "\n* Electrical Engineering"
            		+ "\n* Electronics Engineering"
            		+ "\n* Artificial Intelligence"
            		+ "\n* Machine Learning"
            		+ "\n\nDiploma"
            		+ "\nMachnical "
            		+ "\nElectrical"
            		+ "\nCivil");
            paneltextArea5.setLineWrap(true);
            paneltextArea5.setEnabled(true);
            paneltextArea5.setVisible(true);

            scrollPane5 = new JScrollPane(paneltextArea5);
            scrollPane5.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
            scrollPane5.setVisible(false);
            scrollPane5.setBounds(1200,20,480,700);
            panel.add(scrollPane5);
            
            
            lbl5 = new JLabel();
            ImageIcon img6 = new ImageIcon("informationlogo.png");
            lbl5.setIcon(img6);
            lbl5.setBounds(1750,500,200,200);
            lbl5.setVisible(true);
            lbl5.addMouseListener(new InformationClass());
            panel.add(lbl5);
            
            paneltextArea6 = new JTextArea();
            paneltextArea6.requestFocus();
            paneltextArea6.setFont(n1);
            paneltextArea6.setText("                       Information of Application \n "
            		+ "\n 1.This application is for working within orgnization."
            		+ "\n 2.Only the orgnization members can access it."
            		+ "\n 3.There are certain features this application contains."
            		+ "\n   Those features are:-Admin chat,List of Admin,List of Branchs etc."
            		+ "\n 4.Before working with this application the admin should have userid of this application."
            		+ "\n 5.This is basically for the management of student records so education institutions can only use it. ");
            
            paneltextArea6.setLineWrap(true);
            paneltextArea6.setEnabled(false);
            paneltextArea6.setEnabled(true);
            paneltextArea6.setBackground(Color.WHITE);
           

            scrollPane6 = new JScrollPane(paneltextArea6);
            scrollPane6.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
            scrollPane6.setVisible(false);
            scrollPane6.setBounds(1200,20,480,700);
            panel.add(scrollPane6);
            
            
            


           Font n2 = new Font("serif",Font.BOLD,20);

            button3.addActionListener(new ExitPage());
            panel1.setLayout(null);
            label2 = new JLabel("Exit");
            label2.setBounds(500,300,400,300);
            label2.setFont(font);
            label2.setVisible(true);

            label7 = new JLabel("Name : ");
            text1 = new JTextField(10);
            label7.setVisible(true);
            text1.setVisible(true);
            label7.setFont(n2);
            text1.setFont(n2);
            label7.setBounds(50,50,100,50);
            text1.setBounds(50,90,250,30);
            panel1.add(label7);
            panel1.add(text1);

            label8 = new JLabel("Digit Id : ");
            text2 = new JTextField(10);
            label8.setVisible(true);
            text2.setVisible(true);
            label8.setFont(n2);
            text2.setFont(n2);
            label8.setBounds(350,50,100,50);
            text2.setBounds(350,90,250,30);
            panel1.add(label8);
            panel1.add(text2);

            label9 = new JLabel("Address : ");
            text3 = new JTextField(10);
            label9.setVisible(true);
            text3.setVisible(true);
            label9.setFont(n2);
            text3.setFont(n2);
            label9.setBounds(50,140,100,50);
            text3.setBounds(50,180,550,30);
            panel1.add(label9);
            panel1.add(text3);

            label10= new JLabel("Course Details : ");
            text4 = new JTextField(10);
            label10.setVisible(true);
            text4.setVisible(true);
            label10.setFont(n2);
            text4.setFont(n2);
            label10.setBounds(50,220,100,30);
            text4.setBounds(50,250,250,30);
            panel1.add(label10);
            panel1.add(text4);

            label11= new JLabel("Session : ");
            text5 = new JTextField(10);
            label11.setVisible(true);
            text5.setVisible(true);
            label11.setFont(n2);
            text5.setFont(n2);
            label11.setBounds(50,300,100,30);
            text5.setBounds(50,330,150,30);
            panel1.add(label11);
            panel1.add(text5);
            
            label12= new JLabel("Phone_Number : ");
            text6 = new JTextField(10);
            label12.setVisible(true);
            text6.setVisible(true);
            label12.setFont(n2);
            label12.setFont(n2);
            label12.setBounds(350,220,150,30);
            text6.setBounds(350,250,250,30);
            panel1.add(label12);
            panel1.add(text6);

            label13= new JLabel("Date_Of_Birth : ");
            text7 = new JTextField(10);
            label13.setVisible(true);
            text7.setVisible(true);
            label13.setFont(n2);
            label13.setFont(n2);
            label13.setBounds(350,300,150,30);
            text7.setBounds(350,330,250,30);
            panel1.add(label13);
            panel1.add(text7);

            button4 = new JButton("Exit");
            button4.setBounds(300,500,150,50);
            button4.setFont(n1);
            panel1.add(button4);
            button4.setVisible(true);
            button4.addActionListener(new ExitPage());

            button5 = new JButton("Submitt");
            button5.setBounds(500,500,150,50);
            button5.setFont(n1);
            panel1.add(button5);
            button5.setVisible(true);
            button5.addActionListener(new StringTrasmission1());



           
            
            lbl1 = new JLabel();
            ImageIcon img2 = new ImageIcon("discossion.png");
            lbl1.setIcon(img2);
            lbl1.setBounds(1750,100,200,200);
            lbl1.setVisible(true);
            lbl1.addMouseListener(new CommunicatorStart2());
            panel1.add(lbl1);
            
            //Communicator of panel1 for data insertion
            
            panel3textArea = new JTextArea();
            panel3textArea.requestFocus();
            panel3textArea.setFont(n1);
            panel3textArea.setEnabled(true);
            panel3textArea.setText("                       For Chat with Admins \n");
            panel3textArea.setLineWrap(true);
            panel3textArea.setBackground(Color.WHITE);

            scrollPane3 = new JScrollPane(panel3textArea);
            scrollPane3.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
            scrollPane3.setVisible(false);
            scrollPane3.setBounds(1200,20,480,700);
            panel1.add(scrollPane3);
            
            n5 = new JTextField();
            n5.setVisible(false);
            n5.setBounds(1200,720,450,30);
            n5.setFont(n1);
            panel1.add(n5);
            
            lbl7 = new JLabel();
            ImageIcon img10 = new ImageIcon("sendingbutton2.png");
            lbl7.setIcon(img10);
            lbl7.setBounds(1650,720,25,25);
            lbl7.setVisible(false);
            lbl7.addMouseListener(new SenderClass1());
            panel1.add(lbl7);
            
            //Finish of communicator of panel1
           


            button6 = new JButton("Exit");
            button6.setBounds(300,500,150,50);
            button6.setFont(n1);
            panel2.add(button6);
            button6.setVisible(true);
            button6.addActionListener(new ExitPage());

            button7 = new JButton("privious");
            button7.setBounds(50,500,200,50);
            button7.setFont(n1);
            panel2.add(button7);
            button7.setVisible(true);
            button7.addActionListener(new PreviousPage());

            button8 = new JButton("Check");
            button8.setBounds(500,500,200,50);
            button8.setFont(n1);
            panel2.add(button8);
            button8.setVisible(true);
            button8.addActionListener(new FramePage());
            button8.addActionListener(new StringTransission2());
           /* 
            *buttonpdf = new JButton("Add in pdf");
            *buttonpdf.setBounds(750,500,200,50);
            *buttonpdf.setFont(n1);
            *panel2.add(buttonpdf);
            *buttonpdf.setVisible(true);
            */
            


            label14 = new JLabel("Digit Id of Student: ");
            text8 = new JTextField(10);
            label14.setVisible(true);
            text8.setVisible(true);
            Font font0 = new Font("serif",Font.BOLD,20);
            label14.setFont(font0);
            label14.setBounds(50,50,200,40);
            text8.setBounds(50,100,250,40);
            text8.setFont(font0);
            panel2.add(label14);
            panel2.add(text8);
            
            lbl = new JLabel();
            ImageIcon img = new ImageIcon("discossion.png");
            lbl.setIcon(img);
            lbl.setBounds(1750,100,200,200);
            lbl.setVisible(true);
            lbl.addMouseListener(new CommunicatorStart());
            panel2.add(lbl);
            
          /*  lbl2 = new JLabel();
            *ImageIcon img3 = new ImageIcon("pdfform.png");
            *lbl2.setIcon(img3);
            lbl2.setBounds(1750,300,200,200);
            *lbl2.setVisible(true);
            *panel2.add(lbl2);
            */
            //Communicator of panel2
            
            
           
            panel2textArea = new JTextArea();
            panel2textArea.requestFocus();
            panel2textArea.setFont(n1);
            panel2textArea.setEnabled(true);
            panel2textArea.setText("                       For Chat with Admins \n");
            panel2textArea.setLineWrap(true);
            panel2textArea.setBackground(Color.WHITE);

            scrollPane2 = new JScrollPane(panel2textArea);
            
            scrollPane2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
            scrollPane2.setVisible(false);
            scrollPane2.setBounds(1200,20,480,700);
            panel2.add(scrollPane2);
            
            n = new JTextField();
            n.setVisible(false);
            n.setBounds(1200,720,450,30);
            n.setFont(n1);
            panel2.add(n);
            
            lbl6 = new JLabel();
            ImageIcon img9 = new ImageIcon("sendingbutton2.png");
            lbl6.setIcon(img9);
            lbl6.setBounds(1650,720,25,25);
            lbl6.setVisible(false);
            lbl6.addMouseListener(new SenderClass());
            panel2.add(lbl6);
            //Finish communicator of panel2 two

            panel3 = new JPanel();
            panel3.setBounds(400,100,500,300);
            panel3.setVisible(true);
            panel3.setLayout(null);
            panel3.setBackground(Color.WHITE);

            button9 = new JButton("Exit");
            button9.setBounds(150,250,80,20);
            panel3.add(button9);
            button9.setVisible(true);
            button9.addActionListener(new ExitPage());

            button10 = new JButton("Privious");
            button10.setBounds(60,250,90,20);
            panel3.add(button10);
            button10.setVisible(true);
            button10.addActionListener(new FourPage());


            textArea1 = new JTextArea(10,10);
            textArea1.setVisible(true);
            textArea1.requestFocus();
            textArea1.setLineWrap(true);


            scrollPane = new JScrollPane(textArea1);
            scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
            scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
            scrollPane.setVisible(true);
            scrollPane.setBounds(20,40,450,200);
            panel3.add(scrollPane);

            label15 = new JLabel("Student Data");
            label15.setVisible(true);
            label15.setFont(n2);
            label15.setBounds(1,1,80,30);
            panel3.add(label15);
            
         
            
                
            
          
            
       }

        
       
    class SecondPage implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
        	AutheticationPageOne1 a = new AutheticationPageOne1();
            a.FrameWork();
            frame.setContentPane(panel);
            label.setVisible(false);
            button.setVisible(false);
            
           
        }
    }
    class ThirdPage implements ActionListener
    {
        public void actionPerformed(ActionEvent event1)
        {
            frame.setContentPane(panel1);

            button2.addActionListener(new PreviousPage());

        }
    }

    class FourPage implements  ActionListener
    {
        public void actionPerformed(ActionEvent event4)
        {
            frame.setContentPane(panel2);
            textArea1.setText("");
        }
    }
    class ExitPage implements ActionListener{
        public void actionPerformed(ActionEvent event3)
        {
            panel.setVisible(false);
            panel1.setVisible(false);
           label2.setVisible(true);
            frame.setContentPane(label2);
             frame.dispose();
            



        }

    }
    class FramePage implements ActionListener
    {
        public void actionPerformed(ActionEvent event5)
        {

            frame.setContentPane(panel3);



        }

    }
    class StringTrasmission1 implements ActionListener
    {
        public void actionPerformed(ActionEvent event7)
        {
        	

           
            try
            {
            	 s1 = text1.getText();
                 s2 = text2.getText();
                 s3 = text3.getText();
                 s4 = text4.getText();
                 s5 = text5.getText();
                 s6 = text6.getText();
                 s7 = text7.getText();
                 s8 = text8.getText();
               
            	String url = "jdbc:mysql://localhost:3308/studentrecordapplication";
            	String uname  = "root";
            	String pass = "";
            	String quary = ("insert into studentrecordapplication values ('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"','"+s8+"')");             
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection(url,uname,pass);
            PreparedStatement s = c.prepareStatement(quary);
            s.executeUpdate();
         
            text1.setText("");
            text2.setText("");
            text3.setText("");
            text4.setText("");
            text5.setText("");
            text6.setText("");
            text7.setText("");
            s.close();
            c.close();
            
            }
            catch(Exception q)
            {
            	q.printStackTrace();
            }


        }
    }
    class StringTransission2 implements ActionListener
    {
        public void actionPerformed(ActionEvent event8)
        {    s8 = text8.getText();
             text8.setText("");
             Font n3 = new Font("serif",Font.BOLD,20);
                try
                {
             String url = "jdbc:mysql://localhost:3308/studentrecordapplication";
             String uname = "root";
             String pass = "";
             String quary = ("select * from studentrecordapplication where DigitId="+s8);
             
             Class.forName("com.mysql.cj.jdbc.Driver");
             Connection con = DriverManager.getConnection(url, uname, pass);
             Statement st = con.createStatement();
             ResultSet set = st.executeQuery(quary);
             set.next();
             
             s1 = set.getString("Name");            
             s2 = set.getString("Session"); 
             s3 =set.getString("CourseDetails"); 
             s4 = set.getString("PhoneNumber"); 
             s5 = set.getString("Address"); 
             s6 = set.getString("Dateofbirth"); 
             s7 = set.getString("DigitId"); 
             
             textArea1.append("Name of Student : "+s1);
             textArea1.append("\nSession of collage : "+s2);
             textArea1.append("\nCourseDetails : "+s3);
             textArea1.append("\nPhoneNumber : "+s4);
             textArea1.append("\nAddress : "+s5);
             textArea1.append("\nDateofbirth : "+s6);
             textArea1.append("\nDigitId : "+s7);
             textArea1.setFont(n3);
             st.close();
             con.close();
            
                }
                catch(Exception e)
                {
                	e.printStackTrace();
                	 textArea1.append("Wrong Entry");
                }
             }             
        }
    public void exitMethod()
    {
    	frame.dispose();
    }
   
   class PreviousPage implements ActionListener
   {
	   public void actionPerformed(ActionEvent ip)
	   {
		   frame.setContentPane(panel);
           label.setVisible(false);
           button.setVisible(false);
	   }
   }
    	
   
   class CommunicatorStart implements MouseListener
   {
	   
	public void mouseClicked(MouseEvent e) {
		if(scrollPane2.isVisible())
		{
		scrollPane2.setVisible(false);
		n.setVisible(false);
		lbl6.setVisible(false);
		}
		else
		{
			scrollPane2.setVisible(true);
			n.setVisible(true);
			lbl6.setVisible(true);
		}
		
	}

	public void mousePressed(MouseEvent e) {
		
		
	}

	public void mouseReleased(MouseEvent e) {
		
		
	}

	public void mouseEntered(MouseEvent e) {
		
		
	}

	public void mouseExited(MouseEvent e) {
		
		
		
	}
   }
	
   
   class CommunicatorStart2 implements MouseListener
   {
	   
	public void mouseClicked(MouseEvent e) {
		if(scrollPane3.isVisible())
		{
		scrollPane3.setVisible(false);
		n5.setVisible(false);
		lbl7.setVisible(false);
		}
		else
		{
			scrollPane3.setVisible(true);
			n5.setVisible(true);
			lbl7.setVisible(true);
		}
		
	}

	public void mousePressed(MouseEvent e) {
		
		
	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
		
	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
		
	}
   }
   
   class SenderClass implements MouseListener
   {


	public void mouseClicked(MouseEvent e) {
		
		
	
		String s;   
		s = n.getText();
		/*Call the chating class
		 * pass the string in the method
		*/
		panel2textArea.append("You:- "+s);
		
		Chating c = new Chating();
		
		
		String answer = c.run(s);
		panel2textArea.append("\nServer:-"+answer+"\n");
		n.setText("");
		
		
	}

	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	   
   }
   
   class SenderClass1 implements MouseListener
   {


	public void mouseClicked(MouseEvent e) {
		
		
	
		String s;   
		s = n5.getText();
		
		panel3textArea.append("You:- "+s+"\n");
        Chating c = new Chating();
		String answer = c.run(s);
		panel3textArea.append("\nServer:-"+answer+"\n");
		
		n5.setText("");
		
	}

	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}  
   }
    
   class Information implements MouseListener
   {
	   

	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(scrollPane4.isVisible())
		{
		scrollPane4.setVisible(false);
	
		
		}
		else
		{
			scrollPane4.setVisible(true);
			
		}
		
		
		
	}

	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
   }
   
    class CategoryClasses implements MouseListener
   {

		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			if(scrollPane5.isVisible())
			{
				scrollPane5.setVisible(false);
			}
			else
			{
				scrollPane5.setVisible(true);
			}
		}

		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	   
   }
   
    class InformationClass implements MouseListener
    {

		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			if(scrollPane6.isVisible())
			{
				scrollPane6.setVisible(false);
			}
			else
			{
				scrollPane6.setVisible(true);
			}
		}

		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
    	
    }
   
}


