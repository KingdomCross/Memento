
import java.io.PrintWriter;
public class Write {
Write()
{
	
}

public void WriteObjectToFile(Object serObj) 
	{
	 
    try {
    
//        FileOutputStream fileOut = new FileOutputStream("IceCream.txt");
//        ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
    	PrintWriter Order = new PrintWriter("IceCream.txt");
//        objectOut.writeObject(serObj);
//        objectOut.close();
    	Order.println(serObj.toString());
    	Order.close();
        System.out.println("The Object was succesfully written to a file");

    } catch (Exception ex) 
    {
        System.out.println("There was a problem writing to file : (");
    }
	}
}
