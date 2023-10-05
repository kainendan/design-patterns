package iterator;

import java.util.Stack;

/*
 * Document
 */
public class Document {
    
    private String title;
    private Stack<String> undoStack;
    private Stack<String> redoStack;

    /*
     * Constructor
     * @param title - the title of the document
     */
    public Document(String title){
        this.title = title;
        undoStack = new Stack<String>();
        redoStack = new Stack<String>();
    }

    /*
     * Returns the title of the document
     * @return the title of the document
     */
    public String makeChange(String change){
        undoStack.push(change);
        redoStack.clear();
        return "Making change: " +change;
    }

    /*
     * Returns the title of the document
     * @return the title of the document
     */
    public String undoChange(){
        if (undoStack.isEmpty())
            return null;
        String change = undoStack.pop();
        redoStack.push(change);
        return "Undoing: " +change;
    }

    /*
     * Returns the title of the document
     * @return the title of the document
     */
    public boolean canUndo(){
        return !undoStack.isEmpty();
    }

    /*
     * Returns the title of the document
     * @return the title of the document
     */
    public String redoChange(){
        if (redoStack.isEmpty())
            return null;
        String change = redoStack.pop();
        undoStack.push(change);
        return "Redoing: " +change;
    }

    /*
     * Returns the title of the document
     * @return the title of the document
     */
    public boolean canRedo(){
        return !redoStack.isEmpty();
    }

    /*
     * Returns the title of the document
     * @return the title of the document
     */
    public StackIterator getUndoIterator(){
        return new StackIterator(undoStack);
    }

    /*
     * Returns the title of the document
     * @return the title of the document
     */
    public StackIterator getRedoIterator(){
        return new StackIterator(redoStack);
    }
}
