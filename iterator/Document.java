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
     * Adds a change to the document
     * @param change - the change to add
     * @return the change that was added
     */
    public String makeChange(String change){
        undoStack.push(change);
        redoStack.clear();
        return "Making change: " +change;
    }

    /*
     * Undoes the latest change to the document
     * @return the change that was undone
     */
    public String undoChange(){
        if (undoStack.isEmpty())
            return null;
        String change = undoStack.pop();
        redoStack.push(change);
        return "Undoing: " +change;
    }

    /*
     * Checks if the document can be undone
     * @return true if the document can be undone, false otherwise
     */
    public boolean canUndo(){
        return !undoStack.isEmpty();
    }

    /*
     * Redoes the latest change to the document
     * @return the change that was redone
     */
    public String redoChange(){
        if (redoStack.isEmpty())
            return null;
        String change = redoStack.pop();
        undoStack.push(change);
        return "Redoing: " +change;
    }

    /*
     * Checks if the document can be redone
     * @return true if the document can be redone, false otherwise
     */
    public boolean canRedo(){
        return !redoStack.isEmpty();
    }

    /*
     * Getter for the undo stack
     * @return the undo stack
     */
    public StackIterator getUndoIterator(){
        return new StackIterator(undoStack);
    }

    /*
     * Getter for the redo stack
     * @return the redo stack
     */
    public StackIterator getRedoIterator(){
        return new StackIterator(redoStack);
    }
}
