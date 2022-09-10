package StudentRecordPackage;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.sql.DriverManager;
public class AutheticationPageOne1   {
     public JFrame frame;
     public JPanel panel1,panel5,pan;
    public JButton button1,buttonclick,buttonSub,buttonBack,buttonsubmit,buttonmain;
     public JTextField textOne,textTwo,adminNameFirst,adminNameLast,adminId,adminAddress,adminPassword,adminConfirmpassword;
     public JLabel labelOne,labelTwo,labelThree,UserNameFirst,UserNameLast,UserId,userAddress,userpassword,userconfirmPassword,brief1,brief2;
     public String firstname,lastname,userid,address,password,confirmpassword,s1,s2,s3,s4;
     public boolean truefalse;
     
   
    public void FrameWork()
    {
        frame = new JFrame("Authetication");
        frame.setBounds(300,100,1300,750);



        Font font = new Font("serif",Font.ITALIC,20);

         panel1 = new ImageBackground1();
         panel1.setBounds(450,80,400,500);
         
        


        labelOne = new JLabel("User Id");
        labelOne.setBounds(20,50,80,20);
        labelOne.setFont(font);
        labelOne.setVisible(true);
        panel1.add(labelOne);

        textOne = new JTextField();
        textOne.setVisible(true);
        textOne.setBounds(20,80,350,30);
        textOne.setFont(font);
        panel1.add(textOne);

        labelTwo = new JLabel("Password");
        labelTwo.setVisible(true);
        labelTwo.setBounds(20,130,80,20);
        labelTwo.setFont(font);
        panel1.add(labelTwo);

        textTwo = new JTextField();
        textTwo.setVisible(true);
        textTwo.setBounds(20,160,350,30);
        textTwo.setFont(font);
        panel1.add(textTwo);

        button1 = new JButton("AdminCheck");
        button1.setVisible(true);
        button1.setFont(font);
        button1.setBounds(40,250,200,30);
        button1.addActionListener(new DataCheckerClass());
        panel1.add(button1);

        buttonclick = new JButton("Click");
        buttonclick.setVisible(false);
        buttonclick.setFont(font);
        buttonclick.setBounds(80,300,120,30);
        buttonclick.addActionListener(new FirstPageConnection());
        panel1.add(buttonclick);


        Font font1 = new Font("serif",Font.PLAIN,20);
        labelThree = new JLabel("New User click here");
        labelThree.setFont(font1);
        labelThree.setVisible(true);
        labelThree.setBounds(60,350,400,30);
        labelThree.addMouseListener(new NewPageForAdmin());
        panel1.add(labelThree);
        
        


        panel1.setLayout(null);




         panel5 = new ImageBackground1();


        panel5.setBounds(0,0,1300,750);
        panel5.setVisible(true);

        panel5.add(panel1);
        
        pan = new ImageBackgroundThree();
        pan.setBounds(250,0,800,750);
        
        Font font2 = new Font("SansSerif",Font.ITALIC,40);
        Font font3  = new Font("serif",Font.PLAIN,25);
        
        brief1 = new JLabel("Welcome new Admin !");
        brief1.setBounds(150,30,500,30);
        brief1.setFont(font2);
        brief1.setForeground(Color.BLACK);
        brief1.setVisible(true);
        pan.add(brief1);
        
        //first name block open
        UserNameFirst = new JLabel("Enter your first name ");
        UserNameFirst.setBounds(30,90,1000,20);
        UserNameFirst.setForeground(Color.BLACK);
        UserNameFirst.setFont(font3);
        UserNameFirst.setVisible(true);
        pan.add(UserNameFirst);
        
        adminNameFirst = new JTextField(30);
        adminNameFirst.setBounds(30,140,250,30);
        adminNameFirst.setVisible(true);
        adminNameFirst.setFont(font3);
        pan.add(adminNameFirst);
        //first name block finish
        
        //last name block open
        UserNameLast = new JLabel("Enter your last name ");
        UserNameLast.setBounds(400,90,1000,20);
        UserNameLast.setForeground(Color.BLACK);
        UserNameLast.setFont(font3);
        UserNameLast.setVisible(true);
        pan.add(UserNameLast);
        
        adminNameLast = new JTextField(30);
        adminNameLast.setBounds(400,140,250,30);
        adminNameLast.setVisible(true);
        adminNameLast.setFont(font3);
        pan.add(adminNameLast);
        //last name block close
        UserId = new JLabel("Create id ");
        UserId.setBounds(400,180,1000,20);
        UserId.setForeground(Color.BLACK);
        UserId.setFont(font3);
        UserId.setVisible(true);
        pan.add(UserId);
        
        adminId = new JTextField(30);
        adminId.setBounds(400,230,250,30);
        adminId.setVisible(true);
        adminId.setFont(font3);
        pan.add(adminId);
        
        //CURRECTION MATERIAL STARTS
        userAddress = new JLabel("Enter address ");
        userAddress.setBounds(30,190,1000,20);
        userAddress.setForeground(Color.BLACK);
        userAddress.setFont(font3);
        userAddress.setVisible(true);
        pan.add(userAddress);
        
        adminAddress = new JTextField(30);
        adminAddress.setBounds(30,230,250,30);
        adminAddress.setVisible(true);
        adminAddress.setFont(font3);
        pan.add(adminAddress);
        
        userpassword = new JLabel("Create password");
        userpassword.setBounds(30,280,1000,20);
        userpassword.setForeground(Color.BLACK);
        userpassword.setFont(font3);
        userpassword.setVisible(true);
        pan.add(userpassword);
        
        adminPassword = new JTextField(30);
        adminPassword.setBounds(30,320,250,30);
        adminPassword.setVisible(true);
        adminPassword.setFont(font3);
        pan.add(adminPassword);
        
        userconfirmPassword = new JLabel("Confirm password ");
        userconfirmPassword.setBounds(400,280,1000,20);
        userconfirmPassword.setForeground(Color.BLACK);
        userconfirmPassword.setFont(font3);
        userconfirmPassword.setVisible(true);
        pan.add(userconfirmPassword);
        
        adminConfirmpassword = new JTextField(30);
        adminConfirmpassword.setBounds(400,320,250,30);
        adminConfirmpassword.setVisible(true);
        adminConfirmpassword.setFont(font3);
        pan.add(adminConfirmpassword);
        //CURRECTION MATERIAL BLOCK FINISH
        buttonsubmit = new JButton("Submit");
        buttonsubmit.setBounds(400,500,150,30);
        buttonsubmit.setVisible(true);
        buttonsubmit.setFont(font3);
        buttonsubmit.addActionListener(new NewAdminDataPage());
        pan.add(buttonsubmit);
        
        buttonmain = new JButton("Finish");
        buttonmain.setBounds(550,500,150,30);
        buttonmain.setVisible(true);
        buttonmain.setFont(font3);
        buttonmain.addActionListener(new FirstPageConnection());
        pan.add(buttonmain);
        
        
        pan.setVisible(true);
        pan.setLayout(null);
        
        

        panel5.setLayout(null);

      

        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(panel5);

    }

    class DataCheckerClass implements ActionListener
    {
        
        
        public void actionPerformed(ActionEvent e) {

        	 s1 = textOne.getText();
             s2 = textTwo.getText();
               truefalse = false;
            try
            {
                String url = "jdbc:mysql://localhost:3308/studentrecordapplication";
                String uname = "root";
                String pass = "";
                String quary = ("select * from administratorsdetails where Password="+s2);

                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection(url,uname,pass);
                Statement st = con.createStatement();
                ResultSet set = st.executeQuery(quary);
                set.next();

                s3 = set.getString("UserId");
                s4  = set.getString("Password");
                
                textOne.setText("");
                textTwo.setText("");

             
            }
            catch(Exception e1)
            {

            }
            if((s3.equals(s1))&&(s4.equals(s2)))
            {
            	buttonclick.setVisible(true);
              }   
             else if((s3 != s1)&&(s4 != s2))
             { 
          	   buttonclick.setVisible(false);
             }
        }
    }
    class NewPageForAdmin implements MouseListener
    {
    	String matchCode = "0909";
       
        public void mouseClicked(MouseEvent e) {

        	try {
        		
            String code = JOptionPane.showInputDialog(panel5,"Enter the Administrative code ");
            
        	if(matchCode.equals(code))
        	{
        		frame.setContentPane(pan);
        	}
        	else
        	{
        		JOptionPane.showMessageDialog(panel5, "You are not in cluster of Admins");
        		
        	}
        }
        	catch(Exception ert)
        	{
        		
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
    
    class NewAdminDataPage implements ActionListener
    {
    	public void actionPerformed(ActionEvent we)
    	{
    		firstname = adminNameFirst.getText();
    		lastname = adminNameLast.getText();
    		userid = adminId.getText();
    		address = adminAddress.getText();
    		password = adminPassword.getText();
    		confirmpassword = adminConfirmpassword.getText();
    		
    		 
           try
           {
               String url = "jdbc:mysql://localhost:3308/studentrecordapplication";
               String uname = "root";
               String pass = "";
               String quary = ("insert into administratorsdetails values('"+firstname+"','"+lastname+"','"+userid+"','"+address+"','"+password+"','"+confirmpassword+"')");

               Class.forName("com.mysql.cj.jdbc.Driver");
               Connection con = DriverManager.getConnection(url,uname,pass);
               PreparedStatement stp = con.prepareStatement(quary);
               stp.executeUpdate();
              adminNameFirst.setText("");
              adminNameLast.setText("");
              adminId.setText("");
              adminAddress.setText("");
              adminPassword.setText("");
              adminConfirmpassword.setText("");
    		
    	}
           catch(Exception ol)
           {
           
           }
    }
}
    
    class FirstPageConnection implements ActionListener
    {
    	public void actionPerformed(ActionEvent u)
    	{	
    		frame.dispose();
    		
    	}
    }
  
}
   
 
