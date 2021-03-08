import java.util.List;

public class Main 
{
    public static void main(String[] args) {

        String prompt = "Would you like to solve (S)udoku or (N)umbrix: ";
        String[] validResponses = {"S", "SUDOKU", "N", "NUMBRIX"};
        String puzzleType = HelperMethods.getValidResponse(prompt, validResponses);

        List<List<String>> fileInput;

        if(puzzleType.equals("S") || puzzleType.equals("SUDOKU")) {
            fileInput = HelperMethods.getFormattedFileData("src\\main\\java\\sudokuPuzzles.txt");
            for(List<String> puzzle : fileInput) {
                SudokuSolver solver = new SudokuSolver(puzzle);
                System.out.println(solver);
            }
        } else {
            fileInput = HelperMethods.getFormattedFileData("src\\main\\java\\numbrixPuzzles.txt");
            for(List<String> puzzle : fileInput) {
                NumbrixSolver solver = new NumbrixSolver(puzzle);
                System.out.println(solver);
            }
        }
    }
}
