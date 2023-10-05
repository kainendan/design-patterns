package iterator;

import java.util.Stack;

/**
 * StackIterator
 */
public class StackIterator {
    
    private Stack<String> items;
    private int position;

    /*
     * Constructor
     * @param items - the stack to iterate over
     */
    public StackIterator(Stack<String> items){
        this.items = items;
        position = items.size() - 1;
    }

    /*
     * Returns the next item in the stack
     * @return the next item in the stack
     */
    public String next(){
        return items.get(position--);
    }

    /*
     * Returns true if there is another item in the stack
     * @return true if there is another item in the stack
     */
    public boolean hasNext(){
        return position >= 0;
    }
}
