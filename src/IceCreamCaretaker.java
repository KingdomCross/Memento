/**
 * Alex Chheng and Chloe
 * 10/24/2019
 * Input:
 * Output:
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
public class IceCreamCaretaker {
    
    /**
     * 
     * @param m is the momento being added to the caretaker
     */
    public void addMemento(IceCreamMemento m) {
        try {
        	FileOutputStream f = new FileOutputStream(new File("IceCream.txt"));
        	ObjectOutputStream o = new ObjectOutputStream(f);
        	o.writeObject(m);
        	o.close();
        	f.close();

        }
        catch(Exception ex) {
        	System.out.println("Had trouble accomplishing this task");
        	ex.printStackTrace();
        }
    }

    /**
     * 
     * @param index
     * @return returns momento at that index
     */
    public IceCreamMemento getMemento() {
    	IceCreamMemento b = new IceCreamMemento();
    	ObjectInputStream in;
		try {
			in = new ObjectInputStream(  new FileInputStream("IceCream.txt"));
			 b = (IceCreamMemento) in.readObject();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return b;
      	
    }

    /**
     * 
     * @param vanilla
     * @return
     */
    public IceCreamMemento getMemento(String vanilla) {
    	ObjectInputStream in;
    	IceCreamMemento object = new IceCreamMemento();
		try {
			
			in = new ObjectInputStream( new FileInputStream("IceCream.txt"));
		    for (;;)
		    {
		       object = (IceCreamMemento) in.readObject();
		        if(vanilla.compareTo(object.getFlavor()) ==0) {
		        	 IceCreamMemento NewCone = (IceCreamMemento) in.readObject();
		        	object = NewCone;
		        }
		        // ...
		    }
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EOFException e) {
			// TODO Auto-generated catch block
			
		}
		catch(NullPointerException O) {
			System.out.println("Object does not exist");
		}

		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return object;
    }

}