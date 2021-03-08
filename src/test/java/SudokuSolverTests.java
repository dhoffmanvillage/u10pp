import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;

public class SudokuSolverTests {
    private List<List<String>> testPuzzles = HelperMethods.getFormattedFileData("src\\test\\java\\sudokuPuzzles.txt");
    private int[][] 
    puzzle1Sol = {{1}},
    puzzle2Sol = {{1}}, 
    puzzle3Sol = {{2, 3, 4, 1}, 
                  {1, 4, 3, 2},
                  {4, 2, 1, 3},
                  {3, 1, 2, 4}}, 
    puzzle4Sol = {{9, 2, 6, 5, 1, 4, 3, 7, 8},
                  {1, 8, 5, 3, 7, 9, 6, 2, 4},
                  {4, 7, 3, 6, 2, 8, 9, 1, 5},
                  {7, 3, 2, 4, 9, 5, 1, 8, 6},
                  {6, 4, 9, 1, 8, 3, 7, 5, 2},
                  {8, 5, 1, 2, 6, 7, 4, 9, 3},
                  {2, 6, 7, 8, 3, 1, 5, 4, 9},
                  {3, 9, 4, 7, 5, 2, 8, 6, 1},
                  {5, 1, 8, 9, 4, 6, 2, 3, 7}},
    puzzle5Sol = {{5, 3, 1, 9, 7, 4, 8, 2, 6},
                  {2, 4, 9, 6, 8, 3, 5, 1, 7},
                  {8, 7, 6, 1, 5, 2, 9, 3, 4},
                  {7, 2, 3, 5, 6, 8, 4, 9, 1},
                  {1, 8, 4, 3, 9, 7, 2, 6, 5},
                  {9, 6, 5, 4, 2, 1, 3, 7, 8},
                  {3, 5, 8, 2, 1, 6, 7, 4, 9},
                  {6, 9, 2, 7, 4, 5, 1, 8, 3},
                  {4, 1, 7, 8, 3, 9, 6, 5, 2}};
    private String 
    puzzle1SolString = HelperMethods.formatPuzzle(puzzle1Sol, 1),
    puzzle2SolString = HelperMethods.formatPuzzle(puzzle2Sol, 1),
    puzzle3SolString = HelperMethods.formatPuzzle(puzzle3Sol, 4),
    puzzle4SolString = HelperMethods.formatPuzzle(puzzle4Sol, 9),
    puzzle5SolString = HelperMethods.formatPuzzle(puzzle5Sol, 9);

    @Test
    public void whenPuzzle1IsCreated_thePuzzleIsCorrectlySolvedAndSet() {
        SudokuSolver puzzle1 = new SudokuSolver(testPuzzles.get(0));
        assertArrayEquals(puzzle1Sol, puzzle1.getSolvedPuzzle());
    }

    @Test
    public void whenPuzzle2IsCreated_thePuzzleIsCorrectlySolvedAndSet() {
        SudokuSolver puzzle2 = new SudokuSolver(testPuzzles.get(1));
        assertArrayEquals(puzzle2Sol, puzzle2.getSolvedPuzzle());
    }

    @Test
    public void whenPuzzle3IsCreated_thePuzzleIsCorrectlySolvedAndSet() {
        SudokuSolver puzzle3 = new SudokuSolver(testPuzzles.get(2));
        assertArrayEquals(puzzle3Sol, puzzle3.getSolvedPuzzle());
    }

    @Test
    public void whenPuzzle4IsCreated_thePuzzleIsCorrectlySolvedAndSet() {
        SudokuSolver puzzle4 = new SudokuSolver(testPuzzles.get(3));
        assertArrayEquals(puzzle4Sol, puzzle4.getSolvedPuzzle());
    }

    @Test
    public void whenPuzzle5IsCreated_thePuzzleIsCorrectlySolvedAndSet() {
        SudokuSolver puzzle5 = new SudokuSolver(testPuzzles.get(4));
        assertArrayEquals(puzzle5Sol, puzzle5.getSolvedPuzzle());
    }

    @Test
    public void toString_WithPuzzle1_ShouldReturnPuzzle1SolString(){
        SudokuSolver puzzle1 = new SudokuSolver(testPuzzles.get(0));
        assertEquals(puzzle1SolString, puzzle1.toString());
    }

    @Test
    public void toString_WithPuzzle2_ShouldReturnPuzzle1SolString(){
        SudokuSolver puzzle2 = new SudokuSolver(testPuzzles.get(1));
        assertEquals(puzzle2SolString, puzzle2.toString());
    }

    @Test
    public void toString_WithPuzzle3_ShouldReturnPuzzle3SolString(){
        SudokuSolver puzzle3 = new SudokuSolver(testPuzzles.get(2));
        assertEquals(puzzle3SolString, puzzle3.toString());
    }

    @Test
    public void toString_WithPuzzle4_ShouldReturnPuzzle1SolString(){
        SudokuSolver puzzle4 = new SudokuSolver(testPuzzles.get(3));
        assertEquals(puzzle4SolString, puzzle4.toString());
    }

    @Test
    public void toString_WithPuzzle5_ShouldReturnPuzzle1SolString(){
        SudokuSolver puzzle5 = new SudokuSolver(testPuzzles.get(4));
        assertEquals(puzzle5SolString, puzzle5.toString());
    }

}
