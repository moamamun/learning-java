import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class TicTacToe {

    static ArrayList<Integer> playerPositions = new ArrayList<Integer>();
    static ArrayList<Integer> cpuPositions = new ArrayList<Integer>();

    public static void main(String[] args) {

        char[][] gameBoard = {{' ', '|', ' ', '|', ' '},
                              {'-', '+', '-','+', '-'},
                              {' ', '|', ' ', '|', ' '},
                              {'-', '+', '-','+', '-'},
                              {' ', '|', ' ', '|', ' '}};

        printGameBoard(gameBoard);

        while(true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter your placement (1-9): ");
            int pos = scan.nextInt();
            while(playerPositions.contains(pos) || cpuPositions.contains(playerPositions)) {
                System.out.println("Position already taken! Enter a correct Postion");
                pos = scan.nextInt();
            }
            System.out.println(pos);

            printCurrentGame(gameBoard, pos, "player");

            String gameResult = checkWinner();
            if(gameResult.length() > 0) {
                System.out.println(gameResult);
                break;
            }

            Random rand = new Random();
            int cpuPos = rand.nextInt(9) + 1;
            while(playerPositions.contains(cpuPos) || cpuPositions.contains(playerPositions)) {
                cpuPos = rand.nextInt(9) + 1;
            }
            printCurrentGame(gameBoard, cpuPos, "cpu");

            gameResult = checkWinner();
            if(gameResult.length() > 0) {
                System.out.println(gameResult);
                break;
            }

            System.out.println(gameResult);
        }

    }
    public static void printGameBoard(char[][] gameBoard) {
        for(char[] r: gameBoard) {
            for(char c : r) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static void printCurrentGame(char[][] gameBoard, int pos, String user) {
        char symbol = ' ';
        if(user.equals("player")) {
            symbol = 'X';
            playerPositions.add(pos);
        } else if(user.equals("cpu")) {
            symbol = 'O';
            cpuPositions.add(pos);
        }

        switch(pos) {
            case 1:
                gameBoard[0][0] = symbol;
                break;
            case 2:
                gameBoard[0][2] = symbol;
                break;
            case 3:
                gameBoard[0][4] = symbol;
                break;
            case 4:
                gameBoard[2][0] = symbol;
                break;
            case 5:
                gameBoard[2][2] = symbol;
                break;
            case 6:
                gameBoard[2][4] = symbol;
                break;
            case 7:
                gameBoard[4][0] = symbol;
                break;
            case 8:
                gameBoard[4][2] = symbol;
                break;
            case 9:
                gameBoard[4][4] = symbol;
                break;
        }
        printGameBoard(gameBoard);
    }

    public static String checkWinner() {

        List topRow = Arrays.asList(1, 2, 3);
        List middleRow = Arrays.asList(4, 5, 6);
        List bottomRow = Arrays.asList(7, 8, 9);
        List leftColumn = Arrays.asList(1, 4, 7);
        List middleColumn = Arrays.asList(2, 5, 8);
        List rightcolumn = Arrays.asList(3, 6, 9);
        List leftCross = Arrays.asList(1, 5, 9);
        List rightCross = Arrays.asList(3, 5, 7);

        List<List> winningConditions = new ArrayList<List>();
        winningConditions.add(topRow);
        winningConditions.add(middleRow);
        winningConditions.add(bottomRow);
        winningConditions.add(leftColumn);
        winningConditions.add(middleColumn);
        winningConditions.add(rightcolumn);
        winningConditions.add(leftCross);
        winningConditions.add(rightCross);

        for(List l: winningConditions) {
            if(playerPositions.containsAll(l)) {
                return "Congratulation you won!";
            } else if(cpuPositions.containsAll(l)) {
                return "CPU WINS!";
            } else if(playerPositions.size() + cpuPositions.size() == 9) {
                return "NO WINNER!";
            }
        }

        return "";
    }
}
