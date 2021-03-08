import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HelperMethods {

    public static String getValidResponse(String prompt, String[] validResponses) {
        Scanner inputScanner = new Scanner(System.in);

        String response = "";
        boolean isValid = false;

        while(!isValid) {
            System.out.print(prompt);
            response = inputScanner.nextLine().toUpperCase();
            isValid = isValidResponse(response, validResponses);
        }

        inputScanner.close();

        return response;
    }

    private static boolean isValidResponse(String response, String[] validResponses) {
        for(String res : validResponses)
            if(res.equals(response))
                return true;
        return false;
    }

    public static List<List<String>> getFormattedFileData(String fileName) {
        List<List<String>> fileData = new ArrayList<List<String>>();

        try {
            File file = new File(fileName);
            Scanner fileScanner = new Scanner(file);
            List<String> puzzleData = new ArrayList<String>();
            while (fileScanner.hasNextLine()) {
                String data = fileScanner.nextLine();
                if(data.equals("NEW LINE")) {
                    fileData.add(puzzleData);
                    puzzleData = new ArrayList<String>();
                } else
                    puzzleData.add(data);
            }
            fileData.add(puzzleData);
            fileScanner.close();
        } catch (FileNotFoundException error) {
            System.out.println(fileName + " not found");
        }

        return fileData;
    }

    public static int[][] convertPuzzle(List<String> puzzle) {
        int[][] retArr = new int[puzzle.size()][puzzle.get(0).split(" ").length];

        for(int r = 0; r < puzzle.size(); r++) {
            String[] row = puzzle.get(r).split(" ");
            for(int c = 0; c < row.length; c++) {
                retArr[r][c] = Integer.parseInt(row[c]);
            }
        }

        return retArr;
    }

    public static String formatPuzzle(int[][] puzzle, int largestNum) {
        String retStr = "";
        int neededSpaces = (largestNum + " ").length();

        for(int[] row : puzzle) {
            for(int num : row) {
                String digits = (num + " ");
                for(int i = 0; i < neededSpaces - digits.length(); i++)
                    retStr += " ";
                retStr += digits;
            }
            retStr = retStr.trim();
            retStr += "\n";
        }
            
        return retStr.trim();
    }
}
