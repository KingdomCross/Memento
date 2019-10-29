/**
 * Alex Chheng and Chloe
 * 10/24/2019
 * Input:
 * Output:
 */
//The logic to read/write a file needs to be put in the Caretaker class.
import java.util.*;
public class IceCreamCaretaker {
    private List<IceCreamMemento> mlist = new ArrayList<IceCreamMemento>();

    public void addMemento(IceCreamMemento m) {
        mlist.add(m);
    }

    public IceCreamMemento getMemento(int index) {
        return mlist.get(index);
    }

    public IceCreamMemento getMemento(String vanilla) {
        return null;
    }
}