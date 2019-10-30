 
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.*;
public class Write {
Write()
{
	
}

public void WriteObjectToFile(Object serObj) 
	{
	

	 
    try {
    
        FileOutputStream fileOut = new FileOutputStream("IceCream.txt");
        ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
//    	PrintWriter Order = new PrintWriter("IceCream.txt");
//    	Order.println(serObj.toString());
//    	Order.close();
        objectOut.writeObject(serObj);
        objectOut.close();

        System.out.println("The Object was succesfully written to a file");

    } catch (Exception ex) 
    {
        System.out.println("There was a problem writing to file : (");
    }
	}
}
