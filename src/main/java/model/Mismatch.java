// definition of the package in which class definition is placed
package model;

/**
 * A simple class that stores data about a single mismatch (difference)
 * found during palindrome analysis.
 */
public class Mismatch {

    private int pos1;
    private char char1;
    private int pos2;
    private char char2;

    /**
     * Mismatch Constructor.
     * @param pos1 First character position
     * @param char1 First character
     * @param pos2 Second character position
     * @param char2 Second character
     */
    public Mismatch(int pos1, char char1, int pos2, char char2) {
        this.pos1 = pos1;
        this.char1 = char1;
        this.pos2 = pos2;
        this.char2 = char2;
    }

    // getters
    
    public int getPos1() {
        return pos1;
    }

    public char getChar1() {
        return char1;
    }

    public int getPos2() {
        return pos2;
    }

    public char getChar2() {
        return char2;
    }
}