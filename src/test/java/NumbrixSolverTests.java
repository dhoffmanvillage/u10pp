import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;

public class NumbrixSolverTests {
    private List<List<String>> testPuzzles = HelperMethods.getFormattedFileData("src\\test\\java\\numbrixPuzzles.txt");
    private int[][] 
    puzzle1Sol = {{1}},
    puzzle2Sol = {{3, 2}, 
                  {4, 1}},
    puzzle3Sol = {{1, 2, 3},
                  {8, 9, 4},
                  {7, 6, 5}},
    puzzle4Sol = {{27, 28, 29, 32, 33, 70, 71, 74, 75},
                  {26, 25, 30, 31, 34, 69, 72, 73, 76},
                  {23, 24, 19, 18, 35, 68, 79, 78, 77},
                  {22, 21, 20, 17, 36, 67, 80, 61, 60},
                  {13, 14, 15, 16, 37, 66, 81, 62, 59},
                  {12,  9,  8, 39, 38, 65, 64, 63, 58},
                  {11, 10,  7, 40, 45, 46, 51, 52, 57},
                  { 2,  1,  6, 41, 44, 47, 50, 53, 56},
                  { 3,  4,  5, 42, 43, 48, 49, 54, 55}},
    puzzle5Sol = {{101, 100,  93,  92,  91,  90,  89,  30,  29,  28,  23,  22},
                  {102,  99,  94,  95,  86,  87,  88,  31,  32,  27,  24,  21},
                  {103,  98,  97,  96,  85,  84,  83,  34,  33,  26,  25,  20}, 
                  {104, 105, 106, 107, 108,  81,  82,  35,  36,  37,  18,  19},    
                  {137, 136, 117, 116, 109,  80,  79,  46,  45,  38,  17,  16},    
                  {138, 135, 118, 115, 110,  77,  78,  47,  44,  39,  40,  15},    
                  {139, 134, 119, 114, 111,  76,  75,  48,  43,  42,  41,  14},    
                  {140, 133, 120, 113, 112,  73,  74,  49,   4,   5,   6,  13},    
                  {141, 132, 121, 122,  71,  72,  51,  50,   3,   8,   7,  12},    
                  {142, 131, 124, 123,  70,  69,  52,   1,   2,   9,  10,  11},    
                  {143, 130, 125, 126,  67,  68,  53,  54,  55,  56,  57,  58},    
                  {144, 129, 128, 127,  66,  65,  64,  63,  62,  61,  60,  59}};

    private String 
    puzzle1SolString = HelperMethods.formatPuzzle(puzzle1Sol, 1),
    puzzle2SolString = HelperMethods.formatPuzzle(puzzle2Sol, 4),
    puzzle3SolString = HelperMethods.formatPuzzle(puzzle3Sol, 9),
    puzzle4SolString = HelperMethods.formatPuzzle(puzzle4Sol, 81),
    puzzle5SolString = HelperMethods.formatPuzzle(puzzle5Sol, 144);

    @Test
    public void whenPuzzle1IsCreated_thePuzzleIsCorrectlySolvedAndSet() {
        NumbrixSolver puzzle1 = new NumbrixSolver(testPuzzles.get(0));
        assertArrayEquals(puzzle1Sol, puzzle1.getSolvedPuzzle());
    }

    @Test
    public void whenPuzzle2IsCreated_thePuzzleIsCorrectlySolvedAndSet() {
        NumbrixSolver puzzle2 = new NumbrixSolver(testPuzzles.get(1));
        assertArrayEquals(puzzle2Sol, puzzle2.getSolvedPuzzle());
    }

    @Test
    public void whenPuzzle3IsCreated_thePuzzleIsCorrectlySolvedAndSet() {
        NumbrixSolver puzzle3 = new NumbrixSolver(testPuzzles.get(2));
        assertArrayEquals(puzzle3Sol, puzzle3.getSolvedPuzzle());
    }

    @Test
    public void whenPuzzle4IsCreated_thePuzzleIsCorrectlySolvedAndSet() {
        NumbrixSolver puzzle4 = new NumbrixSolver(testPuzzles.get(3));
        assertArrayEquals(puzzle4Sol, puzzle4.getSolvedPuzzle());
    }

    @Test
    public void whenPuzzle5IsCreated_thePuzzleIsCorrectlySolvedAndSet() {
        NumbrixSolver puzzle5 = new NumbrixSolver(testPuzzles.get(4));
        assertArrayEquals(puzzle5Sol, puzzle5.getSolvedPuzzle());
    }

    @Test
    public void toString_WithPuzzle1_ShouldReturnPuzzle1SolString(){
        NumbrixSolver puzzle1 = new NumbrixSolver(testPuzzles.get(0));
        assertEquals(puzzle1SolString, puzzle1.toString());
    }

    @Test
    public void toString_WithPuzzle2_ShouldReturnPuzzle1SolString(){
        NumbrixSolver puzzle2 = new NumbrixSolver(testPuzzles.get(1));
        assertEquals(puzzle2SolString, puzzle2.toString());
    }

    @Test
    public void toString_WithPuzzle3_ShouldReturnPuzzle3SolString(){
        NumbrixSolver puzzle3 = new NumbrixSolver(testPuzzles.get(2));
        assertEquals(puzzle3SolString, puzzle3.toString());
    }

    @Test
    public void toString_WithPuzzle4_ShouldReturnPuzzle1SolString(){
        NumbrixSolver puzzle4 = new NumbrixSolver(testPuzzles.get(3));
        assertEquals(puzzle4SolString, puzzle4.toString());
    }

    @Test
    public void toString_WithPuzzle5_ShouldReturnPuzzle1SolString(){
        NumbrixSolver puzzle5 = new NumbrixSolver(testPuzzles.get(4));
        assertEquals(puzzle5SolString, puzzle5.toString());
    }

}
