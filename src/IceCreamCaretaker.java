/**
 * Alex Chheng and Chloe Culver
 * 10/24/2019
 * Input: Not require
 * Output: Saving data
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

//import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;
public class IceCreamCaretaker {
	 ArrayList<IceCreamMemento> woi=new ArrayList<>();
    /**
     * 
     * @param m is the momento being added to the caretaker
     */
    public void addMemento(IceCreamMemento m) {
        try {
        	woi.add(m);
        	FileOutputStream f = new FileOutputStream(new File("IceCream.txt"));
        	ObjectOutputStream o = new ObjectOutputStream(f);
        	o.writeObject(woi);
        	o.close(); //close files
        	f.close(); //close files

        }
        catch(Exception ex) {
        	System.out.println("Had trouble accomplishing this task");
        	ex.printStackTrace();
        }
    }

    /**
     * 
     * @param vanilla
     * @return
     */
    public IceCreamMemento getMemento(String vanilla) {
    	ObjectInputStream in = null;
    	IceCreamMemento object = new IceCreamMemento();
		try {
			
			in = new ObjectInputStream( new FileInputStream("IceCream.txt"));

			 try {
			        FileInputStream fis=new FileInputStream("IceCream.txt");
			        ObjectInputStream ois=new ObjectInputStream(fis);
			        ArrayList<IceCreamMemento> woi=new ArrayList<>();
			        woi=(ArrayList<IceCreamMemento>)ois.readObject();

			        for(int i=0;i<woi.size();i++){
			            woi.get(i).toString();
			            if(vanilla.compareTo(((IceCreamMemento) woi.get(i)).getFlavor()) ==0) {
				        	 IceCreamMemento NewCone = (IceCreamMemento) woi.get(i);
				        	 System.out.println("Cone Found: /n "+ NewCone.toString());
				        	 return NewCone;
				        	 
			        }
			        }	    
			
		} 
			 finally {
				    if (in != null) { 
				       
				        in.close(); 
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
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.out.println("File ended");
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