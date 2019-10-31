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

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;
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
    	ObjectInputStream in = null;
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
		finally {
		    if (in != null) { 
		        System.out.println("Closing PrintWriter");
		        try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
		    } else { 
		        System.out.println("PrintWriter not open");
		    } 
		} 
		return b;
      	
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
//		    IceCreamMemento obj = null;
//		    while ((obj = (IceCreamMemento) in.readObject()) != null) {
//		    	System.out.println( obj.toString());
//		        	if(vanilla.compareTo(((IceCreamMemento) obj).getFlavor()) ==0) {
//			        	 IceCreamMemento NewCone = (IceCreamMemento) in.readObject();
//			        	 System.out.println("Cone Found: /n "+ NewCone.toString());
//			        	 object = NewCone;
//			        	 
//		        }
//		      }
			 try {
			        FileInputStream fis=new FileInputStream("IceCream.txt");
			        ObjectInputStream ois=new ObjectInputStream(fis);
			        IceCreamMemento wo=null;
			        Array[] woj=new Array[5];

			        ArrayList<IceCreamMemento> woi=new ArrayList<>();
			        woi=(ArrayList<IceCreamMemento>)ois.readObject();

			        for(int i=0;i<woi.size();i++){
			            woi.get(i).toString();
			            if(vanilla.compareTo(((IceCreamMemento) woi.get(i)).getFlavor()) ==0) {
				        	 IceCreamMemento NewCone = (IceCreamMemento) in.readObject();
				        	 System.out.println("Cone Found: /n "+ NewCone.toString());
				        	 object = NewCone;
				        	 
			        }
			        }
		     
		    
			
		} 
			 finally {
				    if (in != null) { 
				        System.out.println("Closing PrintWriter");
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