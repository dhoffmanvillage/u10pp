# Unit 10 Programming Project

In this programming project you are going create a recursive program that solves a puzzle game. You will select one of the two options below.

## Allowed Resources for the Project

You are allowed to use any of the following to help you with your project:

- Oracle Java API
- Group discssion in class or on Slack
- Online concept tutorials (Examples: *How does Recursion Work?* *How to Parse a String into an int in Java?*)
- Tutorials on what a Sudoku or Nubrix puzzle is and how it works

You are not permitted to use any of the following:

- Any tutorials on how to code a Sudoku or Numbrix Puzzle solver in any programming language

## Option 1: `SudokuSolver`

### What is Sudoku?

A Sudoku puzzle is a puzzle where you are given an `n x n` board and you have to fill it is so that the numbers `1 -  n` are all on the board. Easy you might say. Well, the trick is that no two of the same number can be in the same row, column or sub-square.

Examples can be found at <https://www.websudoku.com/>

### `SudokuSolver` Details

You are given a set of puzzles in `sudokuPuzzles.txt`. Your job is to implement the class `SudokuSolver`. In your class, you must have the following `public` methods:

- `public SudokuSolver(List<String> initial)` - A constructor that takes a `List` of `Strings` that represent the initial values of the board. Each `String` in `initial` is a row of values on the game board. A `0` represents an empty square.
- `public String toString()` - Returns a formatted, solved board
- `public int[][] getSolvedBoard` - Returns your solved puzzle as a 2D int array

You may create any private instance variables or methods that you want in order to solve this project
Your solution must use recursion.

### `SudokuSolver` Example Run

A file with the following initialBoards

    0
    NEW LINE
    2 0 4 0
    0 3 0 1
    0 2 0 4
    1 0 3 0
    NEW LINE
    8 0 0 0 0 0 0 0 0 
    0 0 3 6 0 0 0 0 0 
    0 7 0 0 9 0 2 0 0 
    0 5 0 0 0 7 0 0 0 
    0 0 0 0 4 5 7 0 0 
    0 0 0 1 0 0 0 3 0 
    0 1 0 0 0 0 6 8 0
    0 0 8 5 0 0 0 1 0 
    0 9 0 0 0 0 4 0 0

Would result in the following solved boards

    1

    2 1 4 3
    4 3 2 1
    3 2 1 4
    1 4 3 2

    8 2 1 7 5 4 3 6 9 
    9 4 3 6 1 2 8 5 7 
    5 7 6 8 9 3 2 4 1 
    3 5 4 9 6 7 1 2 8 
    1 8 2 3 4 5 7 9 6 
    7 6 9 1 2 8 5 3 4 
    2 1 7 4 3 9 6 8 5 
    4 3 8 5 7 6 9 1 2 
    6 9 5 2 8 1 4 7 3 

## Option 2: `NumbrixSolver`

### What is Numberix?

A Numbrix puzzle is a puzzle where you are given an `n x n` board and you have to fill it in so that the numbers `1 -  (n * n)` are all on the board. Easy you might say. Well, the trick is that consecutive numbers have to be adjacent to each other, and diagonals do not count. Also, some boards might have some values already filled in.
Examples can be found at <https://parade.com/numbrix/>

### `NumbrixSolver` Details

You are given a set of puzzles in `numbrixPuzzles.txt`. Your job is to implement the class `SudokuSolver`. In your class, you must have the following `public` methods:

- `public NumbrixSolver(List<String> initial)` - A constructor that takes a `List` of `Strings` that represent the initial values of the board. Each `String` in `initial` is a row of values on the game board. A `0` represents an empty square.
- `public String toString()` - Returns a formatted, solved board
- `public int[][] getSolvedBoard` - Returns your solved puzzle as a 2D int array

You may create any private instance variables or methods that you want in order to solve this project
Your solution must use recursion.

### `NumbrixSolver` Example Run

A file with the following initialBoards

    1 0 3
    0 0 0
    9 0 0
    NEW LINE
    67 00 00 00 51 00 00 00 15
    00 00 00 61 00 53 00 00 00
    00 00 00 00 00 00 00 00 00
    00 71 00 00 00 00 00 19 00
    77 00 00 00 00 00 00 00 11
    00 79 00 00 00 00 00 09 00
    00 00 00 00 00 00 00 00 00
    00 00 00 29 00 25 00 00 00
    35 00 00 00 27 00 00 00 03
    NEW LINE
    000 000 000 000 000 000 000 000 000 000 000 000
    000 000 094 095 000 000 000 000 032 027 000 000
    000 098 000 000 000 084 083 000 000 000 025 000
    000 105 000 107 000 000 000 000 036 000 018 000
    000 000 000 000 000 000 000 000 000 000 000 000
    000 000 118 000 000 000 000 000 000 039 000 000
    000 000 119 000 000 000 000 000 000 042 000 000
    000 000 000 000 000 000 000 000 000 000 000 000
    000 132 000 122 000 000 000 000 003 000 007 000
    000 131 000 000 000 069 052 000 000 000 010 000
    000 000 125 126 000 000 000 000 055 056 000 000
    000 000 000 000 000 000 000 000 000 000 000 000

Would result in the following solved boards

    1 2 3 
    8 7 4 
    9 6 5 

    67 66 63 62 51 50 49 16 15 
    68 65 64 61 52 53 48 17 14 
    69 72 73 60 55 54 47 18 13 
    70 71 74 59 56 45 46 19 12 
    77 76 75 58 57 44 21 20 11 
    78 79 80 81 42 43 22  9 10 
    37 38 39 40 41 24 23  8  1 
    36 33 32 29 28 25  6  7  2 
    35 34 31 30 27 26  5  4  3  

    101 100  93  92  91  90  89  30  29  28  23  22 
    102  99  94  95  86  87  88  31  32  27  24  21 
    103  98  97  96  85  84  83  34  33  26  25  20 
    104 105 106 107 108  81  82  35  36  37  18  19 
    137 136 117 116 109  80  79  46  45  38  17  16 
    138 135 118 115 110  77  78  47  44  39  40  15 
    139 134 119 114 111  76  75  48  43  42  41  14 
    140 133 120 113 112  73  74  49   4   5   6  13 
    141 132 121 122  71  72  51  50   3   8   7  12 
    142 131 124 123  70  69  52   1   2   9  10  11 
    143 130 125 126  67  68  53  54  55  56  57  58 
    144 129 128 127  66  65  64  63  62  61  60  59 

## Grading Breakdown

- Attempt code for `SudokuSolver` or `NumbrixSolver`: 30 points
- JavaDoc all code: 20 points
- Pass all test cases (without hard-coding solution): 50 points
-- **NOTE** This means that you should see all the test cases for the project you are doing pass and all the test cases for the project you are not doing fail

## Bonus

Stretch yourself by doing both `SudokuSovler` and `NumbrixSolver`
