// definition of the package in which class definition is placed
package model;

/**
 * A simple class that stores data about a single mismatch (difference)
 * found during palindrome analysis.
 */
public record Mismatch(int pos1, char char1, int pos2, char char2) {

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
}