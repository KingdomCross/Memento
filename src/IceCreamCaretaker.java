/**
 * Alex Chheng and Chloe
 * 10/24/2019
 * Input: Take an IceCreamMemento Object and puts it into the file
 * Output: Returns Ice Cream momento whe searched for
 */
//The logic to read/write a file needs to be put in the Caretaker class.
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;
public class IceCreamCaretaker {
	 ObjectOutputStream o;
	 FileOutputStream f;
 	
	 ObjectInputStream in ;	
	 IceCreamCaretaker(){
		 try {
			f = new FileOutputStream(new File("IceCream.txt"));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		 try {
			o = new ObjectOutputStream(f);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
    /**
     * This method adds the memento to the file "IceCream.txt"
     * @param m is the momento being added to the caretaker
     */
    public void addMemento(IceCreamMemento m) {
        try {
        	
        	o.writeObject(m);
        	
        	}
        catch(Exception ex) 
        {
        	System.out.println("Had trouble accomplishing this task");
        	ex.printStackTrace();
        }
    } 

    /**
     * This method searches through the file for a mememnto with the flavor given
     * @param vanilla is the flavor given for the search
     * @return returns the correct momento
     */
    public IceCreamMemento getMemento(String vanilla) {
    	
    	IceCreamMemento object = new IceCreamMemento();
		try {
			
			
			in = new ObjectInputStream( new FileInputStream("IceCream.txt"));

			 try {
			        
			        object = (IceCreamMemento) in.readObject();
			        while(in != null){
			            if(vanilla.compareTo(object.getFlavor()) ==0)
			             {
				        	 IceCreamMemento NewCone = object;
				        	// System.out.println("Cone Found: /n "+ NewCone.toString());
				        	 return NewCone;
				        	 
			             }
			            object = (IceCreamMemento) in.readObject();
			            
			        }

			
			 	} 
			 finally {
				    if (in != null) 
				    {
				        in.close(); 
				        f.close();
						o.close();
				      
				    } else { 
				        System.out.println("PrintWriter not open");
				    } 
			 }
		}
				    catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EOFException e) {
			// TODO Auto-generated catch block
			try {
				in.close();
				f.close();
				o.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			//System.out.println("File ended");
		}
		catch(NullPointerException O) {
			System.out.println("Object does not exist");
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	
		return object;
    }
		
}