package StudentRecordPackage;
import java.net.*;
import java.io.*;
import java.util.*;

public class Chating {
	     
	    String work3;
	    	    
	    public String run(String str)
	    {
	    	try {
	    		
	    	    String work2 =str ;
        	    Socket s = new Socket("localhost",4910);
	            PrintWriter writer = new PrintWriter(s.getOutputStream());
	            writer.println(work2);
	            writer.flush();
	            
	            InputStreamReader streamReader = new InputStreamReader(s.getInputStream());
	            BufferedReader bf = new BufferedReader(streamReader);
	            
	             work3 = bf.readLine();
	            
	       
	    	}catch(IOException e)
	    	{
	    		
	    	}
	    	
	    	 return work3;

	    }
	   


}
