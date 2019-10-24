/**
 * Alex Chheng and Chloe
 * 10/24/2019
 * Input:
 * Output:
 */
//The logic to read/write a file needs to be put in the Caretaker class.
import java.util.*;
public class CareTaker {
    private List<Memento> mlist = new ArrayList<Memento>();

    public void add(Memento m) {
        mlist.add(m);
    }

    public Memento get(int index) {
        return mlist.get(index);
    }
}