import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLOutput;
import java.util.Arrays;

public class Chess {

    private JFrame frame;
    private JPanel panel;


    //all the buttons (individual squares on the board
    private JButton cellA1;
    private JButton cellA2;
    private JButton cellA3;
    private JButton cellA4;
    private JButton cellA5;
    private JButton cellA6;
    private JButton cellA7;
    private JButton cellA8;

    private JButton cellB1;
    private JButton cellB2;
    private JButton cellB3;
    private JButton cellB4;
    private JButton cellB5;
    private JButton cellB6;
    private JButton cellB7;
    private JButton cellB8;

    private JButton cellC1;
    private JButton cellC2;
    private JButton cellC3;
    private JButton cellC4;
    private JButton cellC5;
    private JButton cellC6;
    private JButton cellC7;
    private JButton cellC8;

    private JButton cellD1;
    private JButton cellD2;
    private JButton cellD3;
    private JButton cellD4;
    private JButton cellD5;
    private JButton cellD6;
    private JButton cellD7;
    private JButton cellD8;

    private JButton cellE1;
    private JButton cellE2;
    private JButton cellE3;
    private JButton cellE4;
    private JButton cellE5;
    private JButton cellE6;
    private JButton cellE7;
    private JButton cellE8;

    private JButton cellF1;
    private JButton cellF2;
    private JButton cellF3;
    private JButton cellF4;
    private JButton cellF5;
    private JButton cellF6;
    private JButton cellF7;
    private JButton cellF8;

    private JButton cellG1;
    private JButton cellG2;
    private JButton cellG3;
    private JButton cellG4;
    private JButton cellG5;
    private JButton cellG6;
    private JButton cellG7;
    private JButton cellG8;

    private JButton cellH1;
    private JButton cellH2;
    private JButton cellH3;
    private JButton cellH4;
    private JButton cellH5;
    private JButton cellH6;
    private JButton cellH7;
    private JButton cellH8;


    private String[][] gameTracker;
    private JButton[][] gameBoard;

    private boolean inSelection;
    private String turn;
    private String[] squareInfo;
    private int prevX;
    private int prevY;

    private int x;
    private int y;

    private final Icon pawnWW = new ImageIcon("pawnWW.jpg");
    private final Icon pawnWB = new ImageIcon("pawnWB.jpg");
    private final Icon pawnBW = new ImageIcon("pawnBW.jpg");
    private final Icon pawnBB = new ImageIcon("pawnBB.jpg");

    private final Icon rookWW = new ImageIcon("rookWW.jpg");
    private final Icon rookWB = new ImageIcon("rookWB.jpg");
    private final Icon rookBW = new ImageIcon("rookBW.jpg");
    private final Icon rookBB = new ImageIcon("rookBB.jpg");

    private final Icon knightWW = new ImageIcon("knightWW.jpg");
    private final Icon knightWB = new ImageIcon("knightWB.jpg");
    private final Icon knightBW = new ImageIcon("knightBW.jpg");
    private final Icon knightBB = new ImageIcon("knightBB.jpg");

    private final Icon bishopWW = new ImageIcon("bishopWW.jpg");
    private final Icon bishopWB = new ImageIcon("bishopWB.jpg");
    private final Icon bishopBW = new ImageIcon("bishopBW.jpg");
    private final Icon bishopBB = new ImageIcon("bishopBB.jpg");

    private final Icon queenWW = new ImageIcon("queenWW.jpg");
    private final Icon queenWB = new ImageIcon("queenWB.jpg");
    private final Icon queenBW = new ImageIcon("queenBW.jpg");
    private final Icon queenBB = new ImageIcon("queenBB.jpg");

    private final Icon kingWW = new ImageIcon("kingWW.jpg");
    private final Icon kingWB = new ImageIcon("kingWB.jpg");
    private final Icon kingBW = new ImageIcon("kingBW.jpg");
    private final Icon kingBB = new ImageIcon("kingBB.jpg");

    private final Icon defaultB0 = new ImageIcon("defaultB0.jpg");
    private final Icon defaultB1 = new ImageIcon("defaultB1.jpg");
    private final Icon defaultW0 = new ImageIcon("defaultW0.jpg");
    private final Icon defaultW1 = new ImageIcon("defaultW1.jpg");

    
    public void reset() {
        for (int i = 0; i < this.gameBoard.length; i++) {
            for (int j = 0; j < this.gameBoard[0].length; j++) {
                this.gameTracker[i][j] = this.gameTracker[i][j].substring(0,this.gameTracker[i][j].length() - 1) + "N";
                this.gameBoard[i][j].setBackground(Color.WHITE);
                if (this.gameBoard[i][j].getIcon().equals(defaultB1)) {
                    this.gameBoard[i][j].setIcon(defaultB0);
                } else if (this.gameBoard[i][j].getIcon().equals(defaultW1)) {
                    this.gameBoard[i][j].setIcon(defaultW0);
                }
            }
        }
    }
    
    public void kingReset() {
        for (int i = 0; i < this.gameBoard.length; i++) {
            for (int j = 0; j < this.gameBoard[0].length; j++) {
                if (gameTracker[i][j].charAt(6) == 'Y') {
                    this.gameTracker[i][j] = this.gameTracker[i][j].substring(0,this.gameTracker[i][j].length() - 1) + "N";
                } else if (gameTracker[i][j].charAt(6) == 'K') {
                    this.gameTracker[i][j] = this.gameTracker[i][j].substring(0,this.gameTracker[i][j].length() - 1) + "Y";
                }
            }
        }
    }
    
    public void highlightCells() {
        for (int i = 0; i < this.gameBoard.length; i++) {
            for (int j = 0; j < this.gameBoard[0].length; j++) {
                if (this.gameTracker[i][j].charAt(6) == 'Y') {
                    if (this.gameTracker[i][j].charAt(0) == 'X') {
                        if (this.gameTracker[i][j].charAt(4) == 'W') {
                            this.gameBoard[i][j].setIcon(defaultW1);
                        } else if (this.gameTracker[i][j].charAt(4) == 'B') {
                            this.gameBoard[i][j].setIcon(defaultB1);
                        }
                    } else {
                        this.gameBoard[i][j].setBackground(Color.GREEN);
                    }
                }
            }
        }
    }

    public boolean checkmate(String color) {
        //TODO finish method

        boolean result = false;


        System.out.println("Checkmate: " + result);
        return result;
    }
    
    
    public void startChess() {
        //TODO add main code

        //pieceType_pieceColor_squareColor_moveable
        gameTracker = new String[8][8];
        gameBoard = new JButton[8][8];
        inSelection = false;
        turn = "W";


        


        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //find the indexes of the selected square
                x = 0;
                y = 0;
                for (int i = 0; i < gameBoard.length; i++) {
                    for (int j = 0; j < gameBoard[0].length; j++) {
                        if (gameBoard[i][j] == e.getSource()) {
                            x = i;
                            y = j;
                        }
                    }
                }



                if (!(inSelection)) {

                    //TODO if not selected

                    squareInfo = gameTracker[x][y].split("_");
                    prevX = x;
                    prevY = y;

                    switch (squareInfo[0]) {
                        case "P" -> {
                            //TODO is the x != 0 needed? or should it be nested
                            if (squareInfo[1].equals("W") && turn.equals("W") && x != 0) {
                                //gameTracker[x][y] = gameTracker[x][y].substring(gameTracker[x][y].length() - 1) + "Y";
                                if (gameTracker[x-1][y].split("_")[0].equals("X")) {
                                    gameTracker[x-1][y] = gameTracker[x-1][y].substring(0,gameTracker[x-1][y].length() - 1) + "Y";
                                    if (squareInfo[2].equals("W")) {
                                        gameBoard[x-1][y].setIcon(defaultB1);
                                    } else if (squareInfo[2].equals("B")) {
                                        gameBoard[x-1][y].setIcon(defaultW1);
                                    }
                                }

                                //TODO add highlighting for pieces being taken
                                if (y == 0) {
                                    if (!(gameTracker[x-1][y+1].split("_")[0].equals("X") || gameTracker[x-1][y+1].split("_")[1].equals("W"))) {
                                        gameTracker[x-1][y+1] = gameTracker[x-1][y+1].substring(0,gameTracker[x-1][y+1].length() - 1) + "Y";
                                        gameBoard[x-1][y+1].setBackground(Color.GREEN);

                                    }
                                } else if (y == 7) {
                                    if (!(gameTracker[x-1][y-1].split("_")[0].equals("X") || gameTracker[x-1][y-1].split("_")[1].equals("W"))) {
                                        gameTracker[x-1][y-1] = gameTracker[x-1][y-1].substring(0,gameTracker[x-1][y-1].length() - 1) + "Y";
                                        gameBoard[x-1][y-1].setBackground(Color.GREEN);

                                    }
                                } else {
                                    if (!(gameTracker[x-1][y+1].split("_")[0].equals("X") || gameTracker[x-1][y+1].split("_")[1].equals("W"))) {
                                        gameTracker[x-1][y+1] = gameTracker[x-1][y+1].substring(0,gameTracker[x-1][y+1].length() - 1) + "Y";
                                        gameBoard[x-1][y+1].setBackground(Color.GREEN);

                                    }
                                    if (!(gameTracker[x-1][y-1].split("_")[0].equals("X") || gameTracker[x-1][y-1].split("_")[1].equals("W"))) {
                                        gameTracker[x-1][y-1] = gameTracker[x-1][y-1].substring(0,gameTracker[x-1][y-1].length() - 1) + "Y";
                                        gameBoard[x-1][y-1].setBackground(Color.GREEN);

                                    }
                                }

                                if (x == 6) {
                                    if (gameTracker[x-2][y].split("_")[0].equals("X")) {
                                        gameTracker[x-2][y] = gameTracker[x-2][y].substring(0,gameTracker[x-2][y].length() - 1) + "Y";
                                        if (squareInfo[2].equals("W")) {
                                            gameBoard[x-2][y].setIcon(defaultW1);
                                        } else if (squareInfo[2].equals("B")) {
                                            gameBoard[x-2][y].setIcon(defaultB1);
                                        }
                                    }
                                }

                                inSelection = true;

                            } else if (squareInfo[1].equals("B") && turn.equals("B") && x!=7) {
                                //gameTracker[x][y] = gameTracker[x][y].substring(gameTracker[x][y].length() - 1) + "Y";

                                if (gameTracker[x+1][y].split("_")[0].equals("X")) {
                                    gameTracker[x+1][y] = gameTracker[x+1][y].substring(0,gameTracker[x+1][y].length() - 1) + "Y";
                                    if (squareInfo[2].equals("W")) {
                                        gameBoard[x+1][y].setIcon(defaultB1);
                                    } else if (squareInfo[2].equals("B")) {
                                        gameBoard[x+1][y].setIcon(defaultW1);
                                    }
                                }

                                //TODO add highlighting when about to take a piece
                                if (y == 0) {
                                    if (!(gameTracker[x+1][y+1].split("_")[0].equals("X") || gameTracker[x+1][y+1].split("_")[1].equals("B"))) {
                                        gameTracker[x+1][y+1] = gameTracker[x+1][y+1].substring(0,gameTracker[x+1][y+1].length() - 1) + "Y";
                                        gameBoard[x+1][y+1].setBackground(Color.GREEN);

                                    }
                                } else if (y == 7) {
                                    if (!(gameTracker[x+1][y-1].split("_")[0].equals("X") || gameTracker[x+1][y-1].split("_")[1].equals("B"))) {
                                        gameTracker[x+1][y-1] = gameTracker[x+1][y-1].substring(0,gameTracker[x+1][y-1].length() - 1) + "Y";
                                        gameBoard[x+1][y-1].setBackground(Color.GREEN);

                                    }
                                } else {
                                    if (!(gameTracker[x+1][y+1].split("_")[0].equals("X") || gameTracker[x+1][y+1].split("_")[1].equals("B"))) {
                                        gameTracker[x+1][y+1] = gameTracker[x+1][y+1].substring(0,gameTracker[x+1][y+1].length() - 1) + "Y";
                                        gameBoard[x+1][y+1].setBackground(Color.GREEN);

                                    }
                                    if (!(gameTracker[x+1][y-1].split("_")[0].equals("X") || gameTracker[x+1][y-1].split("_")[1].equals("B"))) {
                                        gameTracker[x+1][y-1] = gameTracker[x+1][y-1].substring(0,gameTracker[x+1][y-1].length() - 1) + "Y";
                                        gameBoard[x+1][y-1].setBackground(Color.GREEN);

                                    }
                                }

                                if (x == 1) {
                                    if (gameTracker[x+2][y].split("_")[0].equals("X")) {
                                        gameTracker[x+2][y] = gameTracker[x+2][y].substring(0,gameTracker[x+2][y].length() - 1) + "Y";
                                        if (squareInfo[2].equals("W")) {
                                            gameBoard[x+2][y].setIcon(defaultW1);
                                        } else if (squareInfo[2].equals("B")) {
                                            gameBoard[x+2][y].setIcon(defaultB1);
                                        }
                                    }
                                }

                                inSelection = true;

                            }

                        }
                        case "B" -> {
                            //bishop

                            if (squareInfo[1].equals("W") && turn.equals("W")) {
                                int counter = 0;
                                boolean hitPiece = false;
                                while (true) {
                                    counter++;
                                    if (x-counter < 0 || y-counter < 0) {
                                        break;
                                    }
                                    if (hitPiece) {
                                        break;
                                    }
                                    if (gameTracker[x-counter][y-counter].charAt(0) != 'X') {
                                        hitPiece = true;
                                    }
                                    if (gameTracker[x-counter][y-counter].charAt(2) != 'W') {
                                        gameTracker[x-counter][y-counter] = gameTracker[x-counter][y-counter].substring(0,gameTracker[x-counter][y-counter].length() - 1) + "Y";
                                    }
                                }

                                counter = 0;
                                hitPiece = false;
                                while (true) {
                                    counter++;
                                    if (x+counter > 7 || y-counter < 0) {
                                        break;
                                    }
                                    if (hitPiece) {
                                        break;
                                    }
                                    if (gameTracker[x+counter][y-counter].charAt(0) != 'X') {
                                        hitPiece = true;
                                    }
                                    if (gameTracker[x+counter][y-counter].charAt(2) != 'W') {
                                        gameTracker[x+counter][y-counter] = gameTracker[x+counter][y-counter].substring(0,gameTracker[x+counter][y-counter].length() - 1) + "Y";
                                    }
                                }

                                counter = 0;
                                hitPiece = false;
                                while (true) {
                                    counter++;
                                    if (x+counter > 7 || y+counter > 7) {
                                        break;
                                    }
                                    if (hitPiece) {
                                        break;
                                    }
                                    if (gameTracker[x+counter][y+counter].charAt(0) != 'X') {
                                        hitPiece = true;
                                    }
                                    if (gameTracker[x+counter][y+counter].charAt(2) != 'W') {
                                        gameTracker[x+counter][y+counter] = gameTracker[x+counter][y+counter].substring(0,gameTracker[x+counter][y+counter].length() - 1) + "Y";
                                    }
                                }

                                counter = 0;
                                hitPiece = false;
                                while (true) {
                                    counter++;
                                    if (x-counter < 0 || y+counter > 7) {
                                        break;
                                    }
                                    if (hitPiece) {
                                        break;
                                    }
                                    if (gameTracker[x-counter][y+counter].charAt(0) != 'X') {
                                        hitPiece = true;
                                    }
                                    if (gameTracker[x-counter][y+counter].charAt(2) != 'W') {
                                        gameTracker[x-counter][y+counter] = gameTracker[x-counter][y+counter].substring(0,gameTracker[x-counter][y+counter].length() - 1) + "Y";
                                    }
                                }


                                //make all the Y squares highlighted
                                highlightCells();
                            /*
                            for (int i = 0; i < gameBoard.length; i++) {
                                for (int j = 0; j < gameBoard[0].length; j++) {
                                    if (gameTracker[i][j].charAt(6) == 'Y') {
                                        if (gameTracker[i][j].charAt(0) == 'X') {
                                            if (gameTracker[i][j].charAt(4) == 'W') {
                                                gameBoard[i][j].setIcon(defaultW1);
                                            } else if (gameTracker[i][j].charAt(4) == 'B') {
                                                gameBoard[i][j].setIcon(defaultB1);
                                            }
                                        } else {
                                            gameBoard[i][j].setBackground(Color.GREEN);
                                        }
                                    }
                                }
                            }

                             */

                                inSelection = true;
                            } else if (squareInfo[1].equals("B") && turn.equals("B")) {
                                int counter = 0;
                                boolean hitPiece = false;
                                while (true) {
                                    counter++;
                                    if (x-counter < 0 || y-counter < 0) {
                                        break;
                                    }
                                    if (hitPiece) {
                                        break;
                                    }
                                    if (gameTracker[x-counter][y-counter].charAt(0) != 'X') {
                                        hitPiece = true;
                                    }
                                    if (gameTracker[x-counter][y-counter].charAt(2) != 'B') {
                                        gameTracker[x-counter][y-counter] = gameTracker[x-counter][y-counter].substring(0,gameTracker[x-counter][y-counter].length() - 1) + "Y";
                                    }
                                }

                                counter = 0;
                                hitPiece = false;
                                while (true) {
                                    counter++;
                                    if (x+counter > 7 || y-counter < 0) {
                                        break;
                                    }
                                    if (hitPiece) {
                                        break;
                                    }
                                    if (gameTracker[x+counter][y-counter].charAt(0) != 'X') {
                                        hitPiece = true;
                                    }
                                    if (gameTracker[x+counter][y-counter].charAt(2) != 'B') {
                                        gameTracker[x+counter][y-counter] = gameTracker[x+counter][y-counter].substring(0,gameTracker[x+counter][y-counter].length() - 1) + "Y";
                                    }
                                }

                                counter = 0;
                                hitPiece = false;
                                while (true) {
                                    counter++;
                                    if (x+counter > 7 || y+counter > 7) {
                                        break;
                                    }
                                    if (hitPiece) {
                                        break;
                                    }
                                    if (gameTracker[x+counter][y+counter].charAt(0) != 'X') {
                                        hitPiece = true;
                                    }
                                    if (gameTracker[x+counter][y+counter].charAt(2) != 'B') {
                                        gameTracker[x+counter][y+counter] = gameTracker[x+counter][y+counter].substring(0,gameTracker[x+counter][y+counter].length() - 1) + "Y";
                                    }
                                }

                                counter = 0;
                                hitPiece = false;
                                while (true) {
                                    counter++;
                                    if (x-counter < 0 || y+counter > 7) {
                                        break;
                                    }
                                    if (hitPiece) {
                                        break;
                                    }
                                    if (gameTracker[x-counter][y+counter].charAt(0) != 'X') {
                                        hitPiece = true;
                                    }
                                    if (gameTracker[x-counter][y+counter].charAt(2) != 'B') {
                                        gameTracker[x-counter][y+counter] = gameTracker[x-counter][y+counter].substring(0,gameTracker[x-counter][y+counter].length() - 1) + "Y";
                                    }
                                }


                                //make all the Y squares highlighted
                                highlightCells();
                                inSelection = true;
                            }



                        }
                        case "N" -> {
                            //knight

                            if (squareInfo[1].equals("W") && turn.equals("W")) {
                                if (x+2 >= 0 && x+2 <= 7 && y-1 >=0 && y-1 <=7) {
                                    if (gameTracker[x+2][y-1].charAt(2) != 'W') {
                                        gameTracker[x+2][y-1] = gameTracker[x+2][y-1].substring(0, 
                                                gameTracker[x+2][y-1].length() - 1) + "Y";
                                    }
                                }
                                if (x-2 >= 0 && x-2 <= 7 && y-1 >=0 && y-1 <=7) {
                                    if (gameTracker[x-2][y-1].charAt(2) != 'W') {
                                        gameTracker[x-2][y-1] = gameTracker[x-2][y-1].substring(0,
                                                gameTracker[x-2][y-1].length() - 1) + "Y";
                                    }
                                }
                                if (x+2 >= 0 && x+2 <= 7 && y+1 >=0 && y+1 <=7) {
                                    if (gameTracker[x+2][y+1].charAt(2) != 'W') {
                                        gameTracker[x+2][y+1] = gameTracker[x+2][y+1].substring(0,
                                                gameTracker[x+2][y+1].length() - 1) + "Y";
                                    }
                                }
                                if (x-2 >= 0 && x-2 <= 7 && y+1 >=0 && y+1 <=7) {
                                    if (gameTracker[x-2][y+1].charAt(2) != 'W') {
                                        gameTracker[x-2][y+1] = gameTracker[x-2][y+1].substring(0,
                                                gameTracker[x-2][y+1].length() - 1) + "Y";
                                    }
                                }
                                if (x+1 >= 0 && x+1 <= 7 && y-2 >=0 && y-2 <=7) {
                                    if (gameTracker[x+1][y-2].charAt(2) != 'W') {
                                        gameTracker[x+1][y-2] = gameTracker[x+1][y-2].substring(0,
                                                gameTracker[x+1][y-2].length() - 1) + "Y";
                                    }
                                }
                                if (x-1 >= 0 && x-1 <= 7 && y-2 >=0 && y-2 <=7) {
                                    if (gameTracker[x-1][y-2].charAt(2) != 'W') {
                                        gameTracker[x-1][y-2] = gameTracker[x-1][y-2].substring(0,
                                                gameTracker[x-1][y-2].length() - 1) + "Y";
                                    }
                                }
                                if (x+1 >= 0 && x+1 <= 7 && y+2 >=0 && y+2 <=7) {
                                    if (gameTracker[x+1][y+2].charAt(2) != 'W') {
                                        gameTracker[x+1][y+2] = gameTracker[x+1][y+2].substring(0,
                                                gameTracker[x+1][y+2].length() - 1) + "Y";
                                    }
                                }
                                if (x-1 >= 0 && x-1 <= 7 && y+2 >=0 && y+2 <=7) {
                                    if (gameTracker[x-1][y+2].charAt(2) != 'W') {
                                        gameTracker[x-1][y+2] = gameTracker[x-1][y+2].substring(0,
                                                gameTracker[x-1][y+2].length() - 1) + "Y";
                                    }
                                }
                                
                                inSelection = true;
                                highlightCells();
                                
                                
                            } else if (squareInfo[1].equals("B") && turn.equals("B")) {
                                if (x+2 >= 0 && x+2 <= 7 && y-1 >=0 && y-1 <=7) {
                                    if (gameTracker[x+2][y-1].charAt(2) != 'B') {
                                        gameTracker[x+2][y-1] = gameTracker[x+2][y-1].substring(0,
                                                gameTracker[x+2][y-1].length() - 1) + "Y";
                                    }
                                }
                                if (x-2 >= 0 && x-2 <= 7 && y-1 >=0 && y-1 <=7) {
                                    if (gameTracker[x-2][y-1].charAt(2) != 'B') {
                                        gameTracker[x-2][y-1] = gameTracker[x-2][y-1].substring(0,
                                                gameTracker[x-2][y-1].length() - 1) + "Y";
                                    }
                                }
                                if (x+2 >= 0 && x+2 <= 7 && y+1 >=0 && y+1 <=7) {
                                    if (gameTracker[x+2][y+1].charAt(2) != 'B') {
                                        gameTracker[x+2][y+1] = gameTracker[x+2][y+1].substring(0,
                                                gameTracker[x+2][y+1].length() - 1) + "Y";
                                    }
                                }
                                if (x-2 >= 0 && x-2 <= 7 && y+1 >=0 && y+1 <=7) {
                                    if (gameTracker[x-2][y+1].charAt(2) != 'B') {
                                        gameTracker[x-2][y+1] = gameTracker[x-2][y+1].substring(0,
                                                gameTracker[x-2][y+1].length() - 1) + "Y";
                                    }
                                }
                                if (x+1 >= 0 && x+1 <= 7 && y-2 >=0 && y-2 <=7) {
                                    if (gameTracker[x+1][y-2].charAt(2) != 'B') {
                                        gameTracker[x+1][y-2] = gameTracker[x+1][y-2].substring(0,
                                                gameTracker[x+1][y-2].length() - 1) + "Y";
                                    }
                                }
                                if (x-1 >= 0 && x-1 <= 7 && y-2 >=0 && y-2 <=7) {
                                    if (gameTracker[x-1][y-2].charAt(2) != 'B') {
                                        gameTracker[x-1][y-2] = gameTracker[x-1][y-2].substring(0,
                                                gameTracker[x-1][y-2].length() - 1) + "Y";
                                    }
                                }
                                if (x+1 >= 0 && x+1 <= 7 && y+2 >=0 && y+2 <=7) {
                                    if (gameTracker[x+1][y+2].charAt(2) != 'B') {
                                        gameTracker[x+1][y+2] = gameTracker[x+1][y+2].substring(0,
                                                gameTracker[x+1][y+2].length() - 1) + "Y";
                                    }
                                }
                                if (x-1 >= 0 && x-1 <= 7 && y+2 >=0 && y+2 <=7) {
                                    if (gameTracker[x-1][y+2].charAt(2) != 'B') {
                                        gameTracker[x-1][y+2] = gameTracker[x-1][y+2].substring(0,
                                                gameTracker[x-1][y+2].length() - 1) + "Y";
                                    }
                                }

                                inSelection = true;
                                highlightCells();
                            }
                            
                            
                        }
                        case "R" -> {
                            //rook

                            if (squareInfo[1].equals("W") && turn.equals("W")) {

                                int counter = 0;
                                boolean hitPiece = false;
                                while (true) {
                                    counter++;
                                    if (x-counter < 0) {
                                        break;
                                    }
                                    if (hitPiece) {
                                        break;
                                    }
                                    if (gameTracker[x-counter][y].charAt(0) != 'X') {
                                        hitPiece = true;
                                    }
                                    if (gameTracker[x-counter][y].charAt(2) != 'W') {
                                        gameTracker[x-counter][y] = gameTracker[x-counter][y].substring(0,gameTracker[x-counter][y].length() - 1) + "Y";
                                    }
                                }
                                counter = 0;
                                hitPiece = false;
                                while (true) {
                                    counter++;
                                    if (x+counter > 7) {
                                        break;
                                    }
                                    if (hitPiece) {
                                        break;
                                    }
                                    if (gameTracker[x+counter][y].charAt(0) != 'X') {
                                        hitPiece = true;
                                    }
                                    if (gameTracker[x+counter][y].charAt(2) != 'W') {
                                        gameTracker[x+counter][y] = gameTracker[x+counter][y].substring(0,gameTracker[x+counter][y].length() - 1) + "Y";
                                    }
                                }
                                counter = 0;
                                hitPiece = false;
                                while (true) {
                                    counter++;
                                    if (y-counter < 0) {
                                        break;
                                    }
                                    if (hitPiece) {
                                        break;
                                    }
                                    if (gameTracker[x][y - counter].charAt(0) != 'X') {
                                        hitPiece = true;
                                    }
                                    if (gameTracker[x][y - counter].charAt(2) != 'W') {
                                        gameTracker[x][y - counter] = gameTracker[x][y - counter].substring(0,gameTracker[x][y - counter].length() - 1) + "Y";
                                    }
                                }
                                counter = 0;
                                hitPiece = false;
                                while (true) {
                                    counter++;
                                    if (y+counter > 7) {
                                        break;
                                    }
                                    if (hitPiece) {
                                        break;
                                    }
                                    if (gameTracker[x][y + counter].charAt(0) != 'X') {
                                        hitPiece = true;
                                    }
                                    if (gameTracker[x][y + counter].charAt(2) != 'W') {
                                        gameTracker[x][y + counter] = gameTracker[x][y + counter].substring(0,gameTracker[x][y + counter].length() - 1) + "Y";
                                    }
                                }
                                
                                inSelection = true;
                                highlightCells();

                            } else if (squareInfo[1].equals("B") && turn.equals("B")) {
                                int counter = 0;
                                boolean hitPiece = false;
                                while (true) {
                                    counter++;
                                    if (x-counter < 0) {
                                        break;
                                    }
                                    if (hitPiece) {
                                        break;
                                    }
                                    if (gameTracker[x-counter][y].charAt(0) != 'X') {
                                        hitPiece = true;
                                    }
                                    if (gameTracker[x-counter][y].charAt(2) != 'B') {
                                        gameTracker[x-counter][y] = gameTracker[x-counter][y].substring(0,gameTracker[x-counter][y].length() - 1) + "Y";
                                    }
                                }
                                counter = 0;
                                hitPiece = false;
                                while (true) {
                                    counter++;
                                    if (x+counter > 7) {
                                        break;
                                    }
                                    if (hitPiece) {
                                        break;
                                    }
                                    if (gameTracker[x+counter][y].charAt(0) != 'X') {
                                        hitPiece = true;
                                    }
                                    if (gameTracker[x+counter][y].charAt(2) != 'B') {
                                        gameTracker[x+counter][y] = gameTracker[x+counter][y].substring(0,gameTracker[x+counter][y].length() - 1) + "Y";
                                    }
                                }
                                counter = 0;
                                hitPiece = false;
                                while (true) {
                                    counter++;
                                    if (y-counter < 0) {
                                        break;
                                    }
                                    if (hitPiece) {
                                        break;
                                    }
                                    if (gameTracker[x][y - counter].charAt(0) != 'X') {
                                        hitPiece = true;
                                    }
                                    if (gameTracker[x][y - counter].charAt(2) != 'B') {
                                        gameTracker[x][y - counter] = gameTracker[x][y - counter].substring(0,gameTracker[x][y - counter].length() - 1) + "Y";
                                    }
                                }
                                counter = 0;
                                hitPiece = false;
                                while (true) {
                                    counter++;
                                    if (y+counter > 7) {
                                        break;
                                    }
                                    if (hitPiece) {
                                        break;
                                    }
                                    if (gameTracker[x][y + counter].charAt(0) != 'X') {
                                        hitPiece = true;
                                    }
                                    if (gameTracker[x][y + counter].charAt(2) != 'B') {
                                        gameTracker[x][y + counter] = gameTracker[x][y + counter].substring(0,gameTracker[x][y + counter].length() - 1) + "Y";
                                    }
                                }

                                inSelection = true;
                                highlightCells();
                            }

                            
                        }
                        case "Q" -> {
                            //queen

                            if (squareInfo[1].equals("W") && turn.equals("W")) {
                                int counter = 0;
                                boolean hitPiece = false;
                                while (true) {
                                    counter++;
                                    if (x-counter < 0) {
                                        break;
                                    }
                                    if (hitPiece) {
                                        break;
                                    }
                                    if (gameTracker[x-counter][y].charAt(0) != 'X') {
                                        hitPiece = true;
                                    }
                                    if (gameTracker[x-counter][y].charAt(2) != 'W') {
                                        gameTracker[x-counter][y] = gameTracker[x-counter][y].substring(0,gameTracker[x-counter][y].length() - 1) + "Y";
                                    }
                                }
                                counter = 0;
                                hitPiece = false;
                                while (true) {
                                    counter++;
                                    if (x+counter > 7) {
                                        break;
                                    }
                                    if (hitPiece) {
                                        break;
                                    }
                                    if (gameTracker[x+counter][y].charAt(0) != 'X') {
                                        hitPiece = true;
                                    }
                                    if (gameTracker[x+counter][y].charAt(2) != 'W') {
                                        gameTracker[x+counter][y] = gameTracker[x+counter][y].substring(0,gameTracker[x+counter][y].length() - 1) + "Y";
                                    }
                                }
                                counter = 0;
                                hitPiece = false;
                                while (true) {
                                    counter++;
                                    if (y-counter < 0) {
                                        break;
                                    }
                                    if (hitPiece) {
                                        break;
                                    }
                                    if (gameTracker[x][y - counter].charAt(0) != 'X') {
                                        hitPiece = true;
                                    }
                                    if (gameTracker[x][y - counter].charAt(2) != 'W') {
                                        gameTracker[x][y - counter] = gameTracker[x][y - counter].substring(0,gameTracker[x][y - counter].length() - 1) + "Y";
                                    }
                                }
                                counter = 0;
                                hitPiece = false;
                                while (true) {
                                    counter++;
                                    if (y+counter > 7) {
                                        break;
                                    }
                                    if (hitPiece) {
                                        break;
                                    }
                                    if (gameTracker[x][y + counter].charAt(0) != 'X') {
                                        hitPiece = true;
                                    }
                                    if (gameTracker[x][y + counter].charAt(2) != 'W') {
                                        gameTracker[x][y + counter] = gameTracker[x][y + counter].substring(0,gameTracker[x][y + counter].length() - 1) + "Y";
                                    }
                                }

                                counter = 0;
                                hitPiece = false;
                                while (true) {
                                    counter++;
                                    if (x-counter < 0 || y-counter < 0) {
                                        break;
                                    }
                                    if (hitPiece) {
                                        break;
                                    }
                                    if (gameTracker[x-counter][y-counter].charAt(0) != 'X') {
                                        hitPiece = true;
                                    }
                                    if (gameTracker[x-counter][y-counter].charAt(2) != 'W') {
                                        gameTracker[x-counter][y-counter] = gameTracker[x-counter][y-counter].substring(0,gameTracker[x-counter][y-counter].length() - 1) + "Y";
                                    }
                                }

                                counter = 0;
                                hitPiece = false;
                                while (true) {
                                    counter++;
                                    if (x+counter > 7 || y-counter < 0) {
                                        break;
                                    }
                                    if (hitPiece) {
                                        break;
                                    }
                                    if (gameTracker[x+counter][y-counter].charAt(0) != 'X') {
                                        hitPiece = true;
                                    }
                                    if (gameTracker[x+counter][y-counter].charAt(2) != 'W') {
                                        gameTracker[x+counter][y-counter] = gameTracker[x+counter][y-counter].substring(0,gameTracker[x+counter][y-counter].length() - 1) + "Y";
                                    }
                                }

                                counter = 0;
                                hitPiece = false;
                                while (true) {
                                    counter++;
                                    if (x+counter > 7 || y+counter > 7) {
                                        break;
                                    }
                                    if (hitPiece) {
                                        break;
                                    }
                                    if (gameTracker[x+counter][y+counter].charAt(0) != 'X') {
                                        hitPiece = true;
                                    }
                                    if (gameTracker[x+counter][y+counter].charAt(2) != 'W') {
                                        gameTracker[x+counter][y+counter] = gameTracker[x+counter][y+counter].substring(0,gameTracker[x+counter][y+counter].length() - 1) + "Y";
                                    }
                                }

                                counter = 0;
                                hitPiece = false;
                                while (true) {
                                    counter++;
                                    if (x-counter < 0 || y+counter > 7) {
                                        break;
                                    }
                                    if (hitPiece) {
                                        break;
                                    }
                                    if (gameTracker[x-counter][y+counter].charAt(0) != 'X') {
                                        hitPiece = true;
                                    }
                                    if (gameTracker[x-counter][y+counter].charAt(2) != 'W') {
                                        gameTracker[x-counter][y+counter] = gameTracker[x-counter][y+counter].substring(0,gameTracker[x-counter][y+counter].length() - 1) + "Y";
                                    }
                                }

                                inSelection = true;
                                highlightCells();
                                
                            } else if (squareInfo[1].equals("B") && turn.equals("B")) {
                                int counter = 0;
                                boolean hitPiece = false;
                                while (true) {
                                    counter++;
                                    if (x-counter < 0) {
                                        break;
                                    }
                                    if (hitPiece) {
                                        break;
                                    }
                                    if (gameTracker[x-counter][y].charAt(0) != 'X') {
                                        hitPiece = true;
                                    }
                                    if (gameTracker[x-counter][y].charAt(2) != 'B') {
                                        gameTracker[x-counter][y] = gameTracker[x-counter][y].substring(0,gameTracker[x-counter][y].length() - 1) + "Y";
                                    }
                                }
                                counter = 0;
                                hitPiece = false;
                                while (true) {
                                    counter++;
                                    if (x+counter > 7) {
                                        break;
                                    }
                                    if (hitPiece) {
                                        break;
                                    }
                                    if (gameTracker[x+counter][y].charAt(0) != 'X') {
                                        hitPiece = true;
                                    }
                                    if (gameTracker[x+counter][y].charAt(2) != 'B') {
                                        gameTracker[x+counter][y] = gameTracker[x+counter][y].substring(0,gameTracker[x+counter][y].length() - 1) + "Y";
                                    }
                                }
                                counter = 0;
                                hitPiece = false;
                                while (true) {
                                    counter++;
                                    if (y-counter < 0) {
                                        break;
                                    }
                                    if (hitPiece) {
                                        break;
                                    }
                                    if (gameTracker[x][y - counter].charAt(0) != 'X') {
                                        hitPiece = true;
                                    }
                                    if (gameTracker[x][y - counter].charAt(2) != 'B') {
                                        gameTracker[x][y - counter] = gameTracker[x][y - counter].substring(0,gameTracker[x][y - counter].length() - 1) + "Y";
                                    }
                                }
                                counter = 0;
                                hitPiece = false;
                                while (true) {
                                    counter++;
                                    if (y+counter > 7) {
                                        break;
                                    }
                                    if (hitPiece) {
                                        break;
                                    }
                                    if (gameTracker[x][y + counter].charAt(0) != 'X') {
                                        hitPiece = true;
                                    }
                                    if (gameTracker[x][y + counter].charAt(2) != 'B') {
                                        gameTracker[x][y + counter] = gameTracker[x][y + counter].substring(0,gameTracker[x][y + counter].length() - 1) + "Y";
                                    }
                                }

                                counter = 0;
                                hitPiece = false;
                                while (true) {
                                    counter++;
                                    if (x-counter < 0 || y-counter < 0) {
                                        break;
                                    }
                                    if (hitPiece) {
                                        break;
                                    }
                                    if (gameTracker[x-counter][y-counter].charAt(0) != 'X') {
                                        hitPiece = true;
                                    }
                                    if (gameTracker[x-counter][y-counter].charAt(2) != 'B') {
                                        gameTracker[x-counter][y-counter] = gameTracker[x-counter][y-counter].substring(0,gameTracker[x-counter][y-counter].length() - 1) + "Y";
                                    }
                                }

                                counter = 0;
                                hitPiece = false;
                                while (true) {
                                    counter++;
                                    if (x+counter > 7 || y-counter < 0) {
                                        break;
                                    }
                                    if (hitPiece) {
                                        break;
                                    }
                                    if (gameTracker[x+counter][y-counter].charAt(0) != 'X') {
                                        hitPiece = true;
                                    }
                                    if (gameTracker[x+counter][y-counter].charAt(2) != 'B') {
                                        gameTracker[x+counter][y-counter] = gameTracker[x+counter][y-counter].substring(0,gameTracker[x+counter][y-counter].length() - 1) + "Y";
                                    }
                                }

                                counter = 0;
                                hitPiece = false;
                                while (true) {
                                    counter++;
                                    if (x+counter > 7 || y+counter > 7) {
                                        break;
                                    }
                                    if (hitPiece) {
                                        break;
                                    }
                                    if (gameTracker[x+counter][y+counter].charAt(0) != 'X') {
                                        hitPiece = true;
                                    }
                                    if (gameTracker[x+counter][y+counter].charAt(2) != 'B') {
                                        gameTracker[x+counter][y+counter] = gameTracker[x+counter][y+counter].substring(0,gameTracker[x+counter][y+counter].length() - 1) + "Y";
                                    }
                                }

                                counter = 0;
                                hitPiece = false;
                                while (true) {
                                    counter++;
                                    if (x-counter < 0 || y+counter > 7) {
                                        break;
                                    }
                                    if (hitPiece) {
                                        break;
                                    }
                                    if (gameTracker[x-counter][y+counter].charAt(0) != 'X') {
                                        hitPiece = true;
                                    }
                                    if (gameTracker[x-counter][y+counter].charAt(2) != 'B') {
                                        gameTracker[x-counter][y+counter] = gameTracker[x-counter][y+counter].substring(0,gameTracker[x-counter][y+counter].length() - 1) + "Y";
                                    }
                                }

                                inSelection = true;
                                highlightCells();
                            }
                            
                        }
                        case "K" -> {
                            //TODO king - remember to add castle

                            if (squareInfo[1].equals("B") && turn.equals("B")) {

                                for (int i = 0; i < gameTracker.length; i++) {
                                    for (int j = 0; j < gameTracker[0].length; j++) {
                                        if (gameTracker[i][j].charAt(2) == 'W') {
                                            switch (gameTracker[i][j].charAt(0)) {
                                                //TODO long copj paste
                                                
                                                case 'P' -> {

                                                    if (j == 0) {
                                                        if (!(gameTracker[i-1][j+1].split("_")[0].equals("X") || gameTracker[i-1][j+1].split("_")[1].equals("W"))) {
                                                            gameTracker[i-1][j+1] = gameTracker[i-1][j+1].substring(0,gameTracker[i-1][j+1].length() - 1) + "Y";

                                                        }
                                                    } else if (j == 7) {
                                                        if (!(gameTracker[i-1][j-1].split("_")[0].equals("X") || gameTracker[i-1][j-1].split("_")[1].equals("W"))) {
                                                            gameTracker[i-1][j-1] = gameTracker[i-1][j-1].substring(0,gameTracker[i-1][j-1].length() - 1) + "Y";

                                                        }
                                                    } else {
                                                        if (!(gameTracker[i-1][j+1].split("_")[0].equals("X") || gameTracker[i-1][j+1].split("_")[1].equals("W"))) {
                                                            gameTracker[i-1][j+1] = gameTracker[i-1][j+1].substring(0,gameTracker[i-1][j+1].length() - 1) + "Y";

                                                        }
                                                        if (!(gameTracker[i-1][j-1].split("_")[0].equals("X") || gameTracker[i-1][j-1].split("_")[1].equals("W"))) {
                                                            gameTracker[i-1][j-1] = gameTracker[i-1][j-1].substring(0,gameTracker[i-1][j-1].length() - 1) + "Y";

                                                        }
                                                    }


                                                }
                                                case 'B' -> {
                                                    int counter = 0;
                                                    boolean hitPiece = false;
                                                    while (true) {
                                                        counter++;
                                                        if (i-counter < 0 || j-counter < 0) {
                                                            break;
                                                        }
                                                        if (hitPiece) {
                                                            break;
                                                        }
                                                        if (gameTracker[i-counter][j-counter].charAt(0) != 'X') {
                                                            hitPiece = true;
                                                        }
                                                        if (gameTracker[i-counter][j-counter].charAt(2) != 'W') {
                                                            gameTracker[i-counter][j-counter] = gameTracker[i-counter][j-counter].substring(0,gameTracker[i-counter][j-counter].length() - 1) + "Y";
                                                        }
                                                    }

                                                    counter = 0;
                                                    hitPiece = false;
                                                    while (true) {
                                                        counter++;
                                                        if (i+counter > 7 || j-counter < 0) {
                                                            break;
                                                        }
                                                        if (hitPiece) {
                                                            break;
                                                        }
                                                        if (gameTracker[i+counter][j-counter].charAt(0) != 'X') {
                                                            hitPiece = true;
                                                        }
                                                        if (gameTracker[i+counter][j-counter].charAt(2) != 'W') {
                                                            gameTracker[i+counter][j-counter] = gameTracker[i+counter][j-counter].substring(0,gameTracker[i+counter][j-counter].length() - 1) + "Y";
                                                        }
                                                    }

                                                    counter = 0;
                                                    hitPiece = false;
                                                    while (true) {
                                                        counter++;
                                                        if (i+counter > 7 || j+counter > 7) {
                                                            break;
                                                        }
                                                        if (hitPiece) {
                                                            break;
                                                        }
                                                        if (gameTracker[i+counter][j+counter].charAt(0) != 'X') {
                                                            hitPiece = true;
                                                        }
                                                        if (gameTracker[i+counter][j+counter].charAt(2) != 'W') {
                                                            gameTracker[i+counter][j+counter] = gameTracker[i+counter][j+counter].substring(0,gameTracker[i+counter][j+counter].length() - 1) + "Y";
                                                        }
                                                    }

                                                    counter = 0;
                                                    hitPiece = false;
                                                    while (true) {
                                                        counter++;
                                                        if (i-counter < 0 || j+counter > 7) {
                                                            break;
                                                        }
                                                        if (hitPiece) {
                                                            break;
                                                        }
                                                        if (gameTracker[i-counter][j+counter].charAt(0) != 'X') {
                                                            hitPiece = true;
                                                        }
                                                        if (gameTracker[i-counter][j+counter].charAt(2) != 'W') {
                                                            gameTracker[i-counter][j+counter] = gameTracker[i-counter][j+counter].substring(0,gameTracker[i-counter][j+counter].length() - 1) + "Y";
                                                        }
                                                    }
                                                }
                                                case 'N' -> {
                                                    if (i+2 >= 0 && i+2 <= 7 && j-1 >=0 && j-1 <=7) {
                                                        if (gameTracker[i+2][j-1].charAt(2) != 'W') {
                                                            gameTracker[i+2][j-1] = gameTracker[i+2][j-1].substring(0,
                                                                    gameTracker[i+2][j-1].length() - 1) + "Y";
                                                        }
                                                    }
                                                    if (i-2 >= 0 && i-2 <= 7 && j-1 >=0 && j-1 <=7) {
                                                        if (gameTracker[i-2][j-1].charAt(2) != 'W') {
                                                            gameTracker[i-2][j-1] = gameTracker[i-2][j-1].substring(0,
                                                                    gameTracker[i-2][j-1].length() - 1) + "Y";
                                                        }
                                                    }
                                                    if (i+2 >= 0 && i+2 <= 7 && j+1 >=0 && j+1 <=7) {
                                                        if (gameTracker[i+2][j+1].charAt(2) != 'W') {
                                                            gameTracker[i+2][j+1] = gameTracker[i+2][j+1].substring(0,
                                                                    gameTracker[i+2][j+1].length() - 1) + "Y";
                                                        }
                                                    }
                                                    if (i-2 >= 0 && i-2 <= 7 && j+1 >=0 && j+1 <=7) {
                                                        if (gameTracker[i-2][j+1].charAt(2) != 'W') {
                                                            gameTracker[i-2][j+1] = gameTracker[i-2][j+1].substring(0,
                                                                    gameTracker[i-2][j+1].length() - 1) + "Y";
                                                        }
                                                    }
                                                    if (i+1 >= 0 && i+1 <= 7 && j-2 >=0 && j-2 <=7) {
                                                        if (gameTracker[i+1][j-2].charAt(2) != 'W') {
                                                            gameTracker[i+1][j-2] = gameTracker[i+1][j-2].substring(0,
                                                                    gameTracker[i+1][j-2].length() - 1) + "Y";
                                                        }
                                                    }
                                                    if (i-1 >= 0 && i-1 <= 7 && j-2 >=0 && j-2 <=7) {
                                                        if (gameTracker[i-1][j-2].charAt(2) != 'W') {
                                                            gameTracker[i-1][j-2] = gameTracker[i-1][j-2].substring(0,
                                                                    gameTracker[i-1][j-2].length() - 1) + "Y";
                                                        }
                                                    }
                                                    if (i+1 >= 0 && i+1 <= 7 && j+2 >=0 && j+2 <=7) {
                                                        if (gameTracker[i+1][j+2].charAt(2) != 'W') {
                                                            gameTracker[i+1][j+2] = gameTracker[i+1][j+2].substring(0,
                                                                    gameTracker[i+1][j+2].length() - 1) + "Y";
                                                        }
                                                    }
                                                    if (i-1 >= 0 && i-1 <= 7 && j+2 >=0 && j+2 <=7) {
                                                        if (gameTracker[i-1][j+2].charAt(2) != 'W') {
                                                            gameTracker[i-1][j+2] = gameTracker[i-1][j+2].substring(0,
                                                                    gameTracker[i-1][j+2].length() - 1) + "Y";
                                                        }
                                                    }
                                                }
                                                case 'R' -> {
                                                    int counter = 0;
                                                    boolean hitPiece = false;
                                                    while (true) {
                                                        counter++;
                                                        if (i-counter < 0) {
                                                            break;
                                                        }
                                                        if (hitPiece) {
                                                            break;
                                                        }
                                                        if (gameTracker[i-counter][j].charAt(0) != 'X') {
                                                            hitPiece = true;
                                                        }
                                                        if (gameTracker[i-counter][j].charAt(2) != 'W') {
                                                            gameTracker[i-counter][j] = gameTracker[i-counter][j].substring(0,gameTracker[i-counter][j].length() - 1) + "Y";
                                                        }
                                                    }
                                                    counter = 0;
                                                    hitPiece = false;
                                                    while (true) {
                                                        counter++;
                                                        if (i+counter > 7) {
                                                            break;
                                                        }
                                                        if (hitPiece) {
                                                            break;
                                                        }
                                                        if (gameTracker[i+counter][j].charAt(0) != 'X') {
                                                            hitPiece = true;
                                                        }
                                                        if (gameTracker[i+counter][j].charAt(2) != 'W') {
                                                            gameTracker[i+counter][j] = gameTracker[i+counter][j].substring(0,gameTracker[i+counter][j].length() - 1) + "Y";
                                                        }
                                                    }
                                                    counter = 0;
                                                    hitPiece = false;
                                                    while (true) {
                                                        counter++;
                                                        if (j-counter < 0) {
                                                            break;
                                                        }
                                                        if (hitPiece) {
                                                            break;
                                                        }
                                                        if (gameTracker[i][j - counter].charAt(0) != 'X') {
                                                            hitPiece = true;
                                                        }
                                                        if (gameTracker[i][j - counter].charAt(2) != 'W') {
                                                            gameTracker[i][j - counter] = gameTracker[i][j - counter].substring(0,gameTracker[i][j - counter].length() - 1) + "Y";
                                                        }
                                                    }
                                                    counter = 0;
                                                    hitPiece = false;
                                                    while (true) {
                                                        counter++;
                                                        if (j+counter > 7) {
                                                            break;
                                                        }
                                                        if (hitPiece) {
                                                            break;
                                                        }
                                                        if (gameTracker[i][j + counter].charAt(0) != 'X') {
                                                            hitPiece = true;
                                                        }
                                                        if (gameTracker[i][j + counter].charAt(2) != 'W') {
                                                            gameTracker[i][j + counter] = gameTracker[i][j + counter].substring(0,gameTracker[i][j + counter].length() - 1) + "Y";
                                                        }
                                                    }
                                                }
                                                case 'Q' -> {
                                                    int counter = 0;
                                                    boolean hitPiece = false;
                                                    while (true) {
                                                        counter++;
                                                        if (i-counter < 0) {
                                                            break;
                                                        }
                                                        if (hitPiece) {
                                                            break;
                                                        }
                                                        if (gameTracker[i-counter][j].charAt(0) != 'X') {
                                                            hitPiece = true;
                                                        }
                                                        if (gameTracker[i-counter][j].charAt(2) != 'W') {
                                                            gameTracker[i-counter][j] = gameTracker[i-counter][j].substring(0,gameTracker[i-counter][j].length() - 1) + "Y";
                                                        }
                                                    }
                                                    counter = 0;
                                                    hitPiece = false;
                                                    while (true) {
                                                        counter++;
                                                        if (i+counter > 7) {
                                                            break;
                                                        }
                                                        if (hitPiece) {
                                                            break;
                                                        }
                                                        if (gameTracker[i+counter][j].charAt(0) != 'X') {
                                                            hitPiece = true;
                                                        }
                                                        if (gameTracker[i+counter][j].charAt(2) != 'W') {
                                                            gameTracker[i+counter][j] = gameTracker[i+counter][j].substring(0,gameTracker[i+counter][j].length() - 1) + "Y";
                                                        }
                                                    }
                                                    counter = 0;
                                                    hitPiece = false;
                                                    while (true) {
                                                        counter++;
                                                        if (j-counter < 0) {
                                                            break;
                                                        }
                                                        if (hitPiece) {
                                                            break;
                                                        }
                                                        if (gameTracker[i][j - counter].charAt(0) != 'X') {
                                                            hitPiece = true;
                                                        }
                                                        if (gameTracker[i][j - counter].charAt(2) != 'W') {
                                                            gameTracker[i][j - counter] = gameTracker[i][j - counter].substring(0,gameTracker[i][j - counter].length() - 1) + "Y";
                                                        }
                                                    }
                                                    counter = 0;
                                                    hitPiece = false;
                                                    while (true) {
                                                        counter++;
                                                        if (j+counter > 7) {
                                                            break;
                                                        }
                                                        if (hitPiece) {
                                                            break;
                                                        }
                                                        if (gameTracker[i][j + counter].charAt(0) != 'X') {
                                                            hitPiece = true;
                                                        }
                                                        if (gameTracker[i][j + counter].charAt(2) != 'W') {
                                                            gameTracker[i][j + counter] = gameTracker[i][j + counter].substring(0,gameTracker[i][j + counter].length() - 1) + "Y";
                                                        }
                                                    }

                                                    counter = 0;
                                                    hitPiece = false;
                                                    while (true) {
                                                        counter++;
                                                        if (i-counter < 0 || j-counter < 0) {
                                                            break;
                                                        }
                                                        if (hitPiece) {
                                                            break;
                                                        }
                                                        if (gameTracker[i-counter][j-counter].charAt(0) != 'X') {
                                                            hitPiece = true;
                                                        }
                                                        if (gameTracker[i-counter][j-counter].charAt(2) != 'W') {
                                                            gameTracker[i-counter][j-counter] = gameTracker[i-counter][j-counter].substring(0,gameTracker[i-counter][j-counter].length() - 1) + "Y";
                                                        }
                                                    }

                                                    counter = 0;
                                                    hitPiece = false;
                                                    while (true) {
                                                        counter++;
                                                        if (i+counter > 7 || j-counter < 0) {
                                                            break;
                                                        }
                                                        if (hitPiece) {
                                                            break;
                                                        }
                                                        if (gameTracker[i+counter][j-counter].charAt(0) != 'X') {
                                                            hitPiece = true;
                                                        }
                                                        if (gameTracker[i+counter][j-counter].charAt(2) != 'W') {
                                                            gameTracker[i+counter][j-counter] = gameTracker[i+counter][j-counter].substring(0,gameTracker[i+counter][j-counter].length() - 1) + "Y";
                                                        }
                                                    }

                                                    counter = 0;
                                                    hitPiece = false;
                                                    while (true) {
                                                        counter++;
                                                        if (i+counter > 7 || j+counter > 7) {
                                                            break;
                                                        }
                                                        if (hitPiece) {
                                                            break;
                                                        }
                                                        if (gameTracker[i+counter][j+counter].charAt(0) != 'X') {
                                                            hitPiece = true;
                                                        }
                                                        if (gameTracker[i+counter][j+counter].charAt(2) != 'W') {
                                                            gameTracker[i+counter][j+counter] = gameTracker[i+counter][j+counter].substring(0,gameTracker[i+counter][j+counter].length() - 1) + "Y";
                                                        }
                                                    }

                                                    counter = 0;
                                                    hitPiece = false;
                                                    while (true) {
                                                        counter++;
                                                        if (i-counter < 0 || j+counter > 7) {
                                                            break;
                                                        }
                                                        if (hitPiece) {
                                                            break;
                                                        }
                                                        if (gameTracker[i-counter][j+counter].charAt(0) != 'X') {
                                                            hitPiece = true;
                                                        }
                                                        if (gameTracker[i-counter][j+counter].charAt(2) != 'W') {
                                                            gameTracker[i-counter][j+counter] = gameTracker[i-counter][j+counter].substring(0,gameTracker[i-counter][j+counter].length() - 1) + "Y";
                                                        }
                                                    }
                                                }
                                                
                                            }
                                        }
                                    }
                                }

                                if (x >= 0 && x <=7 && y+1 >= 0 && y+1 <= 7) {
                                    if (!(gameTracker[x][y+1].charAt(6) == 'Y'|| gameTracker[x][y+1].charAt(2) == gameTracker[x][y].charAt(2))) {
                                        gameTracker[x][y+1] = gameTracker[x][y+1].substring(0,gameTracker[x][y+1].length() - 1) + "K";
                                    }
                                }
                                if (x >= 0 && x <=7 && y-1 >= 0 && y-1 <= 7) {
                                    if (!(gameTracker[x][y-1].charAt(6) == 'Y'|| gameTracker[x][y-1].charAt(2) == gameTracker[x][y].charAt(2))) {
                                        gameTracker[x][y-1] = gameTracker[x][y-1].substring(0,gameTracker[x][y-1].length() - 1) + "K";
                                    }
                                }
                                if (x+1 >= 0 && x+1 <=7 && y >= 0 && y <= 7) {
                                    if (!(gameTracker[x+1][y].charAt(6) == 'Y'|| gameTracker[x+1][y].charAt(2) == gameTracker[x][y].charAt(2))) {
                                        gameTracker[x+1][y] = gameTracker[x+1][y].substring(0,gameTracker[x+1][y].length() - 1) + "K";
                                    }
                                }
                                if (x+1 >= 0 && x+1 <=7 && y+1 >= 0 && y+1 <= 7) {
                                    if (!(gameTracker[x+1][y+1].charAt(6) == 'Y'|| gameTracker[x+1][y+1].charAt(2) == gameTracker[x][y].charAt(2))) {
                                        gameTracker[x+1][y+1] = gameTracker[x+1][y+1].substring(0,gameTracker[x+1][y+1].length() - 1) + "K";
                                    }
                                }
                                if (x+1 >= 0 && x+1 <=7 && y-1 >= 0 && y-1 <= 7) {
                                    if (!(gameTracker[x+1][y-1].charAt(6) == 'Y'|| gameTracker[x+1][y-1].charAt(2) == gameTracker[x][y].charAt(2))) {
                                        gameTracker[x+1][y-1] = gameTracker[x+1][y-1].substring(0,gameTracker[x+1][y-1].length() - 1) + "K";
                                    }
                                }
                                if (x-1 >= 0 && x-1 <=7 && y >= 0 && y <= 7) {
                                    if (!(gameTracker[x-1][y].charAt(6) == 'Y'|| gameTracker[x-1][y].charAt(2) == gameTracker[x][y].charAt(2))) {
                                        gameTracker[x-1][y] = gameTracker[x-1][y].substring(0,gameTracker[x-1][y].length() - 1) + "K";
                                    }
                                }
                                if (x-1 >= 0 && x-1 <=7 && y+1 >= 0 && y+1 <= 7) {
                                    if (!(gameTracker[x-1][y+1].charAt(6) == 'Y'|| gameTracker[x-1][y+1].charAt(2) == gameTracker[x][y].charAt(2))) {
                                        gameTracker[x-1][y+1] = gameTracker[x-1][y+1].substring(0,gameTracker[x-1][y+1].length() - 1) + "K";
                                    }
                                }
                                if (x-1 >= 0 && x-1 <=7 && y-1 >= 0 && y-1 <= 7) {
                                    if (!(gameTracker[x-1][y-1].charAt(6) == 'Y'|| gameTracker[x-1][y-1].charAt(2) == gameTracker[x][y].charAt(2))) {
                                        gameTracker[x-1][y-1] = gameTracker[x-1][y-1].substring(0,gameTracker[x-1][y-1].length() - 1) + "K";
                                    }
                                }

                                kingReset();
                                highlightCells();

                                inSelection = true;


                            } else if (squareInfo[1].equals("W") && turn.equals("W")) {
                                for (int i = 0; i < gameBoard.length; i++) {
                                    for (int j = 0; j < gameBoard[0].length; j++) {
                                        if (gameTracker[i][j].charAt(2) == 'B') {
                                            switch (gameTracker[i][j].charAt(0)) {
                                                //TODO long copj paste

                                                case 'P' -> {

                                                    if (j == 0) {
                                                        if (!(gameTracker[i+1][j+1].split("_")[0].equals("X") || gameTracker[i+1][j+1].split("_")[1].equals("B"))) {
                                                            gameTracker[i+1][j+1] = gameTracker[i+1][j+1].substring(0,gameTracker[i+1][j+1].length() - 1) + "Y";
                                                        }
                                                    } else if (j == 7) {
                                                        if (!(gameTracker[i+1][j-1].split("_")[0].equals("X") || gameTracker[i+1][j-1].split("_")[1].equals("B"))) {
                                                            gameTracker[i+1][j-1] = gameTracker[i+1][j-1].substring(0,gameTracker[i+1][j-1].length() - 1) + "Y";
                                                        }
                                                    } else {
                                                        if (!(gameTracker[i+1][j+1].split("_")[0].equals("X") || gameTracker[i+1][j+1].split("_")[1].equals("B"))) {
                                                            gameTracker[i+1][j+1] = gameTracker[i+1][j+1].substring(0,gameTracker[i+1][j+1].length() - 1) + "Y";
                                                        }
                                                        if (!(gameTracker[i+1][j-1].split("_")[0].equals("X") || gameTracker[i+1][j-1].split("_")[1].equals("B"))) {
                                                            gameTracker[i+1][j-1] = gameTracker[i+1][j-1].substring(0,gameTracker[i+1][j-1].length() - 1) + "Y";
                                                        }
                                                    }


                                                }
                                                case 'B' -> {
                                                    int counter = 0;
                                                    boolean hitPiece = false;
                                                    while (true) {
                                                        counter++;
                                                        if (i-counter < 0 || j-counter < 0) {
                                                            break;
                                                        }
                                                        if (hitPiece) {
                                                            break;
                                                        }
                                                        if (gameTracker[i-counter][j-counter].charAt(0) != 'X') {
                                                            hitPiece = true;
                                                        }
                                                        if (gameTracker[i-counter][j-counter].charAt(2) != 'B') {
                                                            gameTracker[i-counter][j-counter] = gameTracker[i-counter][j-counter].substring(0,gameTracker[i-counter][j-counter].length() - 1) + "Y";
                                                        }
                                                    }

                                                    counter = 0;
                                                    hitPiece = false;
                                                    while (true) {
                                                        counter++;
                                                        if (i+counter > 7 || j-counter < 0) {
                                                            break;
                                                        }
                                                        if (hitPiece) {
                                                            break;
                                                        }
                                                        if (gameTracker[i+counter][j-counter].charAt(0) != 'X') {
                                                            hitPiece = true;
                                                        }
                                                        if (gameTracker[i+counter][j-counter].charAt(2) != 'B') {
                                                            gameTracker[i+counter][j-counter] = gameTracker[i+counter][j-counter].substring(0,gameTracker[i+counter][j-counter].length() - 1) + "Y";
                                                        }
                                                    }

                                                    counter = 0;
                                                    hitPiece = false;
                                                    while (true) {
                                                        counter++;
                                                        if (i+counter > 7 || j+counter > 7) {
                                                            break;
                                                        }
                                                        if (hitPiece) {
                                                            break;
                                                        }
                                                        if (gameTracker[i+counter][j+counter].charAt(0) != 'X') {
                                                            hitPiece = true;
                                                        }
                                                        if (gameTracker[i+counter][j+counter].charAt(2) != 'B') {
                                                            gameTracker[i+counter][j+counter] = gameTracker[i+counter][j+counter].substring(0,gameTracker[i+counter][j+counter].length() - 1) + "Y";
                                                        }
                                                    }

                                                    counter = 0;
                                                    hitPiece = false;
                                                    while (true) {
                                                        counter++;
                                                        if (i-counter < 0 || j+counter > 7) {
                                                            break;
                                                        }
                                                        if (hitPiece) {
                                                            break;
                                                        }
                                                        if (gameTracker[i-counter][j+counter].charAt(0) != 'X') {
                                                            hitPiece = true;
                                                        }
                                                        if (gameTracker[i-counter][j+counter].charAt(2) != 'B') {
                                                            gameTracker[i-counter][j+counter] = gameTracker[i-counter][j+counter].substring(0,gameTracker[i-counter][j+counter].length() - 1) + "Y";
                                                        }
                                                    }
                                                }
                                                case 'N' -> {
                                                    if (i+2 >= 0 && i+2 <= 7 && j-1 >=0 && j-1 <=7) {
                                                        if (gameTracker[i+2][j-1].charAt(2) != 'B') {
                                                            gameTracker[i+2][j-1] = gameTracker[i+2][j-1].substring(0,
                                                                    gameTracker[i+2][j-1].length() - 1) + "Y";
                                                        }
                                                    }
                                                    if (i-2 >= 0 && i-2 <= 7 && j-1 >=0 && j-1 <=7) {
                                                        if (gameTracker[i-2][j-1].charAt(2) != 'B') {
                                                            gameTracker[i-2][j-1] = gameTracker[i-2][j-1].substring(0,
                                                                    gameTracker[i-2][j-1].length() - 1) + "Y";
                                                        }
                                                    }
                                                    if (i+2 >= 0 && i+2 <= 7 && j+1 >=0 && j+1 <=7) {
                                                        if (gameTracker[i+2][j+1].charAt(2) != 'B') {
                                                            gameTracker[i+2][j+1] = gameTracker[i+2][j+1].substring(0,
                                                                    gameTracker[i+2][j+1].length() - 1) + "Y";
                                                        }
                                                    }
                                                    if (i-2 >= 0 && i-2 <= 7 && j+1 >=0 && j+1 <=7) {
                                                        if (gameTracker[i-2][j+1].charAt(2) != 'B') {
                                                            gameTracker[i-2][j+1] = gameTracker[i-2][j+1].substring(0,
                                                                    gameTracker[i-2][j+1].length() - 1) + "Y";
                                                        }
                                                    }
                                                    if (i+1 >= 0 && i+1 <= 7 && j-2 >=0 && j-2 <=7) {
                                                        if (gameTracker[i+1][j-2].charAt(2) != 'B') {
                                                            gameTracker[i+1][j-2] = gameTracker[i+1][j-2].substring(0,
                                                                    gameTracker[i+1][j-2].length() - 1) + "Y";
                                                        }
                                                    }
                                                    if (i-1 >= 0 && i-1 <= 7 && j-2 >=0 && j-2 <=7) {
                                                        if (gameTracker[i-1][j-2].charAt(2) != 'B') {
                                                            gameTracker[i-1][j-2] = gameTracker[i-1][j-2].substring(0,
                                                                    gameTracker[i-1][j-2].length() - 1) + "Y";
                                                        }
                                                    }
                                                    if (i+1 >= 0 && i+1 <= 7 && j+2 >=0 && j+2 <=7) {
                                                        if (gameTracker[i+1][j+2].charAt(2) != 'B') {
                                                            gameTracker[i+1][j+2] = gameTracker[i+1][j+2].substring(0,
                                                                    gameTracker[i+1][j+2].length() - 1) + "Y";
                                                        }
                                                    }
                                                    if (i-1 >= 0 && i-1 <= 7 && j+2 >=0 && j+2 <=7) {
                                                        if (gameTracker[i-1][j+2].charAt(2) != 'B') {
                                                            gameTracker[i-1][j+2] = gameTracker[i-1][j+2].substring(0,
                                                                    gameTracker[i-1][j+2].length() - 1) + "Y";
                                                        }
                                                    }
                                                }
                                                case 'R' -> {
                                                    int counter = 0;
                                                    boolean hitPiece = false;
                                                    while (true) {
                                                        counter++;
                                                        if (i-counter < 0) {
                                                            break;
                                                        }
                                                        if (hitPiece) {
                                                            break;
                                                        }
                                                        if (gameTracker[i-counter][j].charAt(0) != 'X') {
                                                            hitPiece = true;
                                                        }
                                                        if (gameTracker[i-counter][j].charAt(2) != 'B') {
                                                            gameTracker[i-counter][j] = gameTracker[i-counter][j].substring(0,gameTracker[i-counter][j].length() - 1) + "Y";
                                                        }
                                                    }
                                                    counter = 0;
                                                    hitPiece = false;
                                                    while (true) {
                                                        counter++;
                                                        if (i+counter > 7) {
                                                            break;
                                                        }
                                                        if (hitPiece) {
                                                            break;
                                                        }
                                                        if (gameTracker[i+counter][j].charAt(0) != 'X') {
                                                            hitPiece = true;
                                                        }
                                                        if (gameTracker[i+counter][j].charAt(2) != 'B') {
                                                            gameTracker[i+counter][j] = gameTracker[i+counter][j].substring(0,gameTracker[i+counter][j].length() - 1) + "Y";
                                                        }
                                                    }
                                                    counter = 0;
                                                    hitPiece = false;
                                                    while (true) {
                                                        counter++;
                                                        if (j-counter < 0) {
                                                            break;
                                                        }
                                                        if (hitPiece) {
                                                            break;
                                                        }
                                                        if (gameTracker[i][j - counter].charAt(0) != 'X') {
                                                            hitPiece = true;
                                                        }
                                                        if (gameTracker[i][j - counter].charAt(2) != 'B') {
                                                            gameTracker[i][j - counter] = gameTracker[i][j - counter].substring(0,gameTracker[i][j - counter].length() - 1) + "Y";
                                                        }
                                                    }
                                                    counter = 0;
                                                    hitPiece = false;
                                                    while (true) {
                                                        counter++;
                                                        if (j+counter > 7) {
                                                            break;
                                                        }
                                                        if (hitPiece) {
                                                            break;
                                                        }
                                                        if (gameTracker[i][j + counter].charAt(0) != 'X') {
                                                            hitPiece = true;
                                                        }
                                                        if (gameTracker[i][j + counter].charAt(2) != 'B') {
                                                            gameTracker[i][j + counter] = gameTracker[i][j + counter].substring(0,gameTracker[i][j + counter].length() - 1) + "Y";
                                                        }
                                                    }
                                                }
                                                case 'Q' -> {
                                                    int counter = 0;
                                                    boolean hitPiece = false;
                                                    while (true) {
                                                        counter++;
                                                        if (i-counter < 0) {
                                                            break;
                                                        }
                                                        if (hitPiece) {
                                                            break;
                                                        }
                                                        if (gameTracker[i-counter][j].charAt(0) != 'X') {
                                                            hitPiece = true;
                                                        }
                                                        if (gameTracker[i-counter][j].charAt(2) != 'B') {
                                                            gameTracker[i-counter][j] = gameTracker[i-counter][j].substring(0,gameTracker[i-counter][j].length() - 1) + "Y";
                                                        }
                                                    }
                                                    counter = 0;
                                                    hitPiece = false;
                                                    while (true) {
                                                        counter++;
                                                        if (i+counter > 7) {
                                                            break;
                                                        }
                                                        if (hitPiece) {
                                                            break;
                                                        }
                                                        if (gameTracker[i+counter][j].charAt(0) != 'X') {
                                                            hitPiece = true;
                                                        }
                                                        if (gameTracker[i+counter][j].charAt(2) != 'B') {
                                                            gameTracker[i+counter][j] = gameTracker[i+counter][j].substring(0,gameTracker[i+counter][j].length() - 1) + "Y";
                                                        }
                                                    }
                                                    counter = 0;
                                                    hitPiece = false;
                                                    while (true) {
                                                        counter++;
                                                        if (j-counter < 0) {
                                                            break;
                                                        }
                                                        if (hitPiece) {
                                                            break;
                                                        }
                                                        if (gameTracker[i][j - counter].charAt(0) != 'X') {
                                                            hitPiece = true;
                                                        }
                                                        if (gameTracker[i][j - counter].charAt(2) != 'B') {
                                                            gameTracker[i][j - counter] = gameTracker[i][j - counter].substring(0,gameTracker[i][j - counter].length() - 1) + "Y";
                                                        }
                                                    }
                                                    counter = 0;
                                                    hitPiece = false;
                                                    while (true) {
                                                        counter++;
                                                        if (j+counter > 7) {
                                                            break;
                                                        }
                                                        if (hitPiece) {
                                                            break;
                                                        }
                                                        if (gameTracker[i][j + counter].charAt(0) != 'X') {
                                                            hitPiece = true;
                                                        }
                                                        if (gameTracker[i][j + counter].charAt(2) != 'B') {
                                                            gameTracker[i][j + counter] = gameTracker[i][j + counter].substring(0,gameTracker[i][j + counter].length() - 1) + "Y";
                                                        }
                                                    }

                                                    counter = 0;
                                                    hitPiece = false;
                                                    while (true) {
                                                        counter++;
                                                        if (i-counter < 0 || j-counter < 0) {
                                                            break;
                                                        }
                                                        if (hitPiece) {
                                                            break;
                                                        }
                                                        if (gameTracker[i-counter][j-counter].charAt(0) != 'X') {
                                                            hitPiece = true;
                                                        }
                                                        if (gameTracker[i-counter][j-counter].charAt(2) != 'B') {
                                                            gameTracker[i-counter][j-counter] = gameTracker[i-counter][j-counter].substring(0,gameTracker[i-counter][j-counter].length() - 1) + "Y";
                                                        }
                                                    }

                                                    counter = 0;
                                                    hitPiece = false;
                                                    while (true) {
                                                        counter++;
                                                        if (i+counter > 7 || j-counter < 0) {
                                                            break;
                                                        }
                                                        if (hitPiece) {
                                                            break;
                                                        }
                                                        if (gameTracker[i+counter][j-counter].charAt(0) != 'X') {
                                                            hitPiece = true;
                                                        }
                                                        if (gameTracker[i+counter][j-counter].charAt(2) != 'B') {
                                                            gameTracker[i+counter][j-counter] = gameTracker[i+counter][j-counter].substring(0,gameTracker[i+counter][j-counter].length() - 1) + "Y";
                                                        }
                                                    }

                                                    counter = 0;
                                                    hitPiece = false;
                                                    while (true) {
                                                        counter++;
                                                        if (i+counter > 7 || j+counter > 7) {
                                                            break;
                                                        }
                                                        if (hitPiece) {
                                                            break;
                                                        }
                                                        if (gameTracker[i+counter][j+counter].charAt(0) != 'X') {
                                                            hitPiece = true;
                                                        }
                                                        if (gameTracker[i+counter][j+counter].charAt(2) != 'B') {
                                                            gameTracker[i+counter][j+counter] = gameTracker[i+counter][j+counter].substring(0,gameTracker[i+counter][j+counter].length() - 1) + "Y";
                                                        }
                                                    }

                                                    counter = 0;
                                                    hitPiece = false;
                                                    while (true) {
                                                        counter++;
                                                        if (i-counter < 0 || j+counter > 7) {
                                                            break;
                                                        }
                                                        if (hitPiece) {
                                                            break;
                                                        }
                                                        if (gameTracker[i-counter][j+counter].charAt(0) != 'X') {
                                                            hitPiece = true;
                                                        }
                                                        if (gameTracker[i-counter][j+counter].charAt(2) != 'B') {
                                                            gameTracker[i-counter][j+counter] = gameTracker[i-counter][j+counter].substring(0,gameTracker[i-counter][j+counter].length() - 1) + "Y";
                                                        }
                                                    }
                                                }

                                            }
                                        }
                                    }
                                }

                                if (x >= 0 && x <=7 && y+1 >= 0 && y+1 <= 7) {
                                    if (!(gameTracker[x][y+1].charAt(6) == 'Y'|| gameTracker[x][y+1].charAt(2) == gameTracker[x][y].charAt(2))) {
                                        gameTracker[x][y+1] = gameTracker[x][y+1].substring(0,gameTracker[x][y+1].length() - 1) + "K";
                                    }
                                }
                                if (x >= 0 && x <=7 && y-1 >= 0 && y-1 <= 7) {
                                    if (!(gameTracker[x][y-1].charAt(6) == 'Y'|| gameTracker[x][y-1].charAt(2) == gameTracker[x][y].charAt(2))) {
                                        gameTracker[x][y-1] = gameTracker[x][y-1].substring(0,gameTracker[x][y-1].length() - 1) + "K";
                                    }
                                }
                                if (x+1 >= 0 && x+1 <=7 && y >= 0 && y <= 7) {
                                    if (!(gameTracker[x+1][y].charAt(6) == 'Y'|| gameTracker[x+1][y].charAt(2) == gameTracker[x][y].charAt(2))) {
                                        gameTracker[x+1][y] = gameTracker[x+1][y].substring(0,gameTracker[x+1][y].length() - 1) + "K";
                                    }
                                }
                                if (x+1 >= 0 && x+1 <=7 && y+1 >= 0 && y+1 <= 7) {
                                    if (!(gameTracker[x+1][y+1].charAt(6) == 'Y'|| gameTracker[x+1][y+1].charAt(2) == gameTracker[x][y].charAt(2))) {
                                        gameTracker[x+1][y+1] = gameTracker[x+1][y+1].substring(0,gameTracker[x+1][y+1].length() - 1) + "K";
                                    }
                                }
                                if (x+1 >= 0 && x+1 <=7 && y-1 >= 0 && y-1 <= 7) {
                                    if (!(gameTracker[x+1][y-1].charAt(6) == 'Y'|| gameTracker[x+1][y-1].charAt(2) == gameTracker[x][y].charAt(2))) {
                                        gameTracker[x+1][y-1] = gameTracker[x+1][y-1].substring(0,gameTracker[x+1][y-1].length() - 1) + "K";
                                    }
                                }
                                if (x-1 >= 0 && x-1 <=7 && y >= 0 && y <= 7) {
                                    if (!(gameTracker[x-1][y].charAt(6) == 'Y'|| gameTracker[x-1][y].charAt(2) == gameTracker[x][y].charAt(2))) {
                                        gameTracker[x-1][y] = gameTracker[x-1][y].substring(0,gameTracker[x-1][y].length() - 1) + "K";
                                    }
                                }
                                if (x-1 >= 0 && x-1 <=7 && y+1 >= 0 && y+1 <= 7) {
                                    if (!(gameTracker[x-1][y+1].charAt(6) == 'Y'|| gameTracker[x-1][y+1].charAt(2) == gameTracker[x][y].charAt(2))) {
                                        gameTracker[x-1][y+1] = gameTracker[x-1][y+1].substring(0,gameTracker[x-1][y+1].length() - 1) + "K";
                                    }
                                }
                                if (x-1 >= 0 && x-1 <=7 && y-1 >= 0 && y-1 <= 7) {
                                    if (!(gameTracker[x-1][y-1].charAt(6) == 'Y'|| gameTracker[x-1][y-1].charAt(2) == gameTracker[x][y].charAt(2))) {
                                        gameTracker[x-1][y-1] = gameTracker[x-1][y-1].substring(0,gameTracker[x-1][y-1].length() - 1) + "K";
                                    }
                                }




                                kingReset();
                                highlightCells();

                                inSelection = true;


                            }
                            //TODO continue here

                            /*
                            if (x >= 0 && x <=7 && y >= 0 && y <= 7) {
                                if (!(gameTracker[x][y].charAt(6) == 'Y' || gameTracker[x][y].charAt(2) == gameTracker[x][y].charAt(2))) {
                                    gameTracker[x][y] = gameTracker[x][y].substring(0,gameTracker[x][y].length() - 1) + "K";
                                }
                            }

                             */
                        }
                    }



                } else {
                    //TODO if selected

                    switch (squareInfo[0]) {
                        case "P" -> {
                            //pawn


                            if (gameTracker[x][y].split("_")[3].equals("Y")) {

                                if (squareInfo[1].equals("W")) {
                                    gameTracker[x][y] = "P_W_" + gameTracker[x][y].split("_")[2] + "_N";
                                } else if (squareInfo[1].equals("B")) {
                                    gameTracker[x][y] = "P_B_" + gameTracker[x][y].split("_")[2] + "_N";
                                }
                                gameTracker[prevX][prevY] = "X_X_" + gameTracker[prevX][prevY].split("_")[2] + "_N";


                                if (squareInfo[1].equals("W")) {
                                    if (gameTracker[x][y].split("_")[2].equals("W")) {
                                        gameBoard[x][y].setIcon(pawnWW);
                                    } else if (gameTracker[x][y].split("_")[2].equals("B")) {
                                        gameBoard[x][y].setIcon(pawnWB);
                                    }
                                    if (gameTracker[prevX][prevY].split("_")[2].equals("W")) {
                                        gameBoard[prevX][prevY].setIcon(defaultW0);
                                    } else if (gameTracker[prevX][prevY].split("_")[2].equals("B")) {
                                        gameBoard[prevX][prevY].setIcon(defaultB0);
                                    }
                                } else if (squareInfo[1].equals("B")) {
                                    if (gameTracker[x][y].split("_")[2].equals("W")) {
                                        gameBoard[x][y].setIcon(pawnBW);
                                    } else if (gameTracker[x][y].split("_")[2].equals("B")) {
                                        gameBoard[x][y].setIcon(pawnBB);
                                    }
                                    if (gameTracker[prevX][prevY].split("_")[2].equals("W")) {
                                        gameBoard[prevX][prevY].setIcon(defaultW0);
                                    } else if (gameTracker[prevX][prevY].split("_")[2].equals("B")) {
                                        gameBoard[prevX][prevY].setIcon(defaultB0);
                                    }
                                }

                                if (gameTracker[x][y].split("_")[1].equals("W")) {
                                    if (x == 0) {
                                        gameTracker[x][y] = "Q" + gameTracker[x][y].substring(1);
                                        if (gameTracker[x][y].charAt(4) == 'W') {
                                            gameBoard[x][y].setIcon(queenWW);
                                        } else if (gameTracker[x][y].charAt(4) == 'B') {
                                            gameBoard[x][y].setIcon(queenWB);
                                        }
                                    }
                                } else if (gameTracker[x][y].split("_")[1].equals("B")) {
                                    if (x == 7) {
                                        gameTracker[x][y] = "Q" + gameTracker[x][y].substring(1);
                                        if (gameTracker[x][y].charAt(4) == 'W') {
                                            gameBoard[x][y].setIcon(queenBW);
                                        } else if (gameTracker[x][y].charAt(4) == 'B') {
                                            gameBoard[x][y].setIcon(queenBB);
                                        }
                                    }
                                }

                                if (turn.equals("W")) {
                                    turn = "B";
                                } else if (turn.equals("B")) {
                                    turn = "W";
                                }


                            }


                            //TODO add reset selections
                            inSelection = false;
                            reset();

                            System.out.println("Reached:  " + turn);
                            if (turn.equals("B")) {
                                if (checkmate("B")) {
                                    JOptionPane.showMessageDialog(null, "Checkmate! White Wins!", "Game Over!", JOptionPane.INFORMATION_MESSAGE);
                                    System.out.println("Reached checkmate");
                                }
                            } else if (turn.equals("W")) {
                                if (checkmate("W")) {
                                    JOptionPane.showMessageDialog(null, "Checkmate! Black Wins!", "Game Over!", JOptionPane.INFORMATION_MESSAGE);
                                    System.out.println("Reached checkmate");
                                }
                            }


                            /*
                            for (int i = 0; i < gameBoard.length; i++) {
                                for (int j = 0; j < gameBoard[0].length; j++) {
                                    gameTracker[i][j] = gameTracker[i][j].substring(0,gameTracker[i][j].length() - 1) + "N";
                                    gameBoard[i][j].setBackground(Color.WHITE);
                                    if (gameBoard[i][j].getIcon().equals(defaultB1)) {
                                        gameBoard[i][j].setIcon(defaultB0);
                                    } else if (gameBoard[i][j].getIcon().equals(defaultW1)) {
                                        gameBoard[i][j].setIcon(defaultW0);
                                    }
                                }
                            }

                             */



                        }
                        case "B" -> {
                            //bishop

                            if (gameTracker[x][y].split("_")[3].equals("Y")) {

                                if (squareInfo[1].equals("W")) {
                                    gameTracker[x][y] = "B_W_" + gameTracker[x][y].split("_")[2] + "_N";
                                } else if (squareInfo[1].equals("B")) {
                                    gameTracker[x][y] = "B_B_" + gameTracker[x][y].split("_")[2] + "_N";
                                }
                                gameTracker[prevX][prevY] = "X_X_" + gameTracker[prevX][prevY].split("_")[2] + "_N";


                                if (squareInfo[1].equals("W")) {
                                    if (gameTracker[x][y].split("_")[2].equals("W")) {
                                        gameBoard[x][y].setIcon(bishopWW);
                                    } else if (gameTracker[x][y].split("_")[2].equals("B")) {
                                        gameBoard[x][y].setIcon(bishopWB);
                                    }
                                    if (gameTracker[prevX][prevY].split("_")[2].equals("W")) {
                                        gameBoard[prevX][prevY].setIcon(defaultW0);
                                    } else if (gameTracker[prevX][prevY].split("_")[2].equals("B")) {
                                        gameBoard[prevX][prevY].setIcon(defaultB0);
                                    }
                                } else if (squareInfo[1].equals("B")) {
                                    if (gameTracker[x][y].split("_")[2].equals("W")) {
                                        gameBoard[x][y].setIcon(bishopBW);
                                    } else if (gameTracker[x][y].split("_")[2].equals("B")) {
                                        gameBoard[x][y].setIcon(bishopBB);
                                    }
                                    if (gameTracker[prevX][prevY].split("_")[2].equals("W")) {
                                        gameBoard[prevX][prevY].setIcon(defaultW0);
                                    } else if (gameTracker[prevX][prevY].split("_")[2].equals("B")) {
                                        gameBoard[prevX][prevY].setIcon(defaultB0);
                                    }
                                }

                                if (turn.equals("W")) {
                                    turn = "B";
                                } else if (turn.equals("B")) {
                                    turn = "W";
                                }

                            }
                            inSelection = false;
                            reset();

                            System.out.println("Reached:  " + turn);
                            if (turn.equals("B")) {
                                if (checkmate("B")) {
                                    JOptionPane.showMessageDialog(null, "Checkmate! White Wins!", "Game Over!", JOptionPane.INFORMATION_MESSAGE);
                                    System.out.println("Reached checkmate");
                                }
                            } else if (turn.equals("W")) {
                                if (checkmate("W")) {
                                    JOptionPane.showMessageDialog(null, "Checkmate! Black Wins!", "Game Over!", JOptionPane.INFORMATION_MESSAGE);
                                    System.out.println("Reached checkmate");
                                }
                            }



                        }
                        case "N" -> {
                            //knight

                            if (gameTracker[x][y].split("_")[3].equals("Y")) {

                                if (squareInfo[1].equals("W")) {
                                    gameTracker[x][y] = "N_W_" + gameTracker[x][y].split("_")[2] + "_N";
                                } else if (squareInfo[1].equals("B")) {
                                    gameTracker[x][y] = "N_B_" + gameTracker[x][y].split("_")[2] + "_N";
                                }
                                gameTracker[prevX][prevY] = "X_X_" + gameTracker[prevX][prevY].split("_")[2] + "_N";


                                if (squareInfo[1].equals("W")) {
                                    if (gameTracker[x][y].split("_")[2].equals("W")) {
                                        gameBoard[x][y].setIcon(knightWW);
                                    } else if (gameTracker[x][y].split("_")[2].equals("B")) {
                                        gameBoard[x][y].setIcon(knightWB);
                                    }
                                    if (gameTracker[prevX][prevY].split("_")[2].equals("W")) {
                                        gameBoard[prevX][prevY].setIcon(defaultW0);
                                    } else if (gameTracker[prevX][prevY].split("_")[2].equals("B")) {
                                        gameBoard[prevX][prevY].setIcon(defaultB0);
                                    }
                                } else if (squareInfo[1].equals("B")) {
                                    if (gameTracker[x][y].split("_")[2].equals("W")) {
                                        gameBoard[x][y].setIcon(knightBW);
                                    } else if (gameTracker[x][y].split("_")[2].equals("B")) {
                                        gameBoard[x][y].setIcon(knightBB);
                                    }
                                    if (gameTracker[prevX][prevY].split("_")[2].equals("W")) {
                                        gameBoard[prevX][prevY].setIcon(defaultW0);
                                    } else if (gameTracker[prevX][prevY].split("_")[2].equals("B")) {
                                        gameBoard[prevX][prevY].setIcon(defaultB0);
                                    }
                                }

                                if (turn.equals("W")) {
                                    turn = "B";
                                } else if (turn.equals("B")) {
                                    turn = "W";
                                }

                            }

                            inSelection = false;
                            reset();

                            System.out.println("Reached:  " + turn);
                            if (turn.equals("B")) {
                                if (checkmate("B")) {
                                    JOptionPane.showMessageDialog(null, "Checkmate! White Wins!", "Game Over!", JOptionPane.INFORMATION_MESSAGE);
                                    System.out.println("Reached checkmate");
                                }
                            } else if (turn.equals("W")) {
                                if (checkmate("W")) {
                                    JOptionPane.showMessageDialog(null, "Checkmate! Black Wins!", "Game Over!", JOptionPane.INFORMATION_MESSAGE);
                                    System.out.println("Reached checkmate");
                                }
                            }



                        }
                        case "R" -> {
                            //rook


                            if (gameTracker[x][y].split("_")[3].equals("Y")) {

                                if (squareInfo[1].equals("W")) {
                                    gameTracker[x][y] = "R_W_" + gameTracker[x][y].split("_")[2] + "_N";
                                } else if (squareInfo[1].equals("B")) {
                                    gameTracker[x][y] = "R_B_" + gameTracker[x][y].split("_")[2] + "_N";
                                }
                                gameTracker[prevX][prevY] = "X_X_" + gameTracker[prevX][prevY].split("_")[2] + "_N";


                                if (squareInfo[1].equals("W")) {
                                    if (gameTracker[x][y].split("_")[2].equals("W")) {
                                        gameBoard[x][y].setIcon(rookWW);
                                    } else if (gameTracker[x][y].split("_")[2].equals("B")) {
                                        gameBoard[x][y].setIcon(rookWB);
                                    }
                                    if (gameTracker[prevX][prevY].split("_")[2].equals("W")) {
                                        gameBoard[prevX][prevY].setIcon(defaultW0);
                                    } else if (gameTracker[prevX][prevY].split("_")[2].equals("B")) {
                                        gameBoard[prevX][prevY].setIcon(defaultB0);
                                    }
                                } else if (squareInfo[1].equals("B")) {
                                    if (gameTracker[x][y].split("_")[2].equals("W")) {
                                        gameBoard[x][y].setIcon(rookBW);
                                    } else if (gameTracker[x][y].split("_")[2].equals("B")) {
                                        gameBoard[x][y].setIcon(rookBB);
                                    }
                                    if (gameTracker[prevX][prevY].split("_")[2].equals("W")) {
                                        gameBoard[prevX][prevY].setIcon(defaultW0);
                                    } else if (gameTracker[prevX][prevY].split("_")[2].equals("B")) {
                                        gameBoard[prevX][prevY].setIcon(defaultB0);
                                    }
                                }

                                if (turn.equals("W")) {
                                    turn = "B";
                                } else if (turn.equals("B")) {
                                    turn = "W";
                                }

                            }

                            inSelection = false;
                            reset();

                            System.out.println("Reached:  " + turn);
                            if (turn.equals("B")) {
                                if (checkmate("B")) {
                                    JOptionPane.showMessageDialog(null, "Checkmate! White Wins!", "Game Over!", JOptionPane.INFORMATION_MESSAGE);
                                    System.out.println("Reached checkmate");
                                }
                            } else if (turn.equals("W")) {
                                if (checkmate("W")) {
                                    JOptionPane.showMessageDialog(null, "Checkmate! Black Wins!", "Game Over!", JOptionPane.INFORMATION_MESSAGE);
                                    System.out.println("Reached checkmate");
                                }
                            }


                        }
                        case "Q" -> {
                            //queen
                            if (gameTracker[x][y].split("_")[3].equals("Y")) {

                                if (squareInfo[1].equals("W")) {
                                    gameTracker[x][y] = "Q_W_" + gameTracker[x][y].split("_")[2] + "_N";
                                } else if (squareInfo[1].equals("B")) {
                                    gameTracker[x][y] = "Q_B_" + gameTracker[x][y].split("_")[2] + "_N";
                                }
                                gameTracker[prevX][prevY] = "X_X_" + gameTracker[prevX][prevY].split("_")[2] + "_N";


                                if (squareInfo[1].equals("W")) {
                                    if (gameTracker[x][y].split("_")[2].equals("W")) {
                                        gameBoard[x][y].setIcon(queenWW);
                                    } else if (gameTracker[x][y].split("_")[2].equals("B")) {
                                        gameBoard[x][y].setIcon(queenWB);
                                    }
                                    if (gameTracker[prevX][prevY].split("_")[2].equals("W")) {
                                        gameBoard[prevX][prevY].setIcon(defaultW0);
                                    } else if (gameTracker[prevX][prevY].split("_")[2].equals("B")) {
                                        gameBoard[prevX][prevY].setIcon(defaultB0);
                                    }
                                } else if (squareInfo[1].equals("B")) {
                                    if (gameTracker[x][y].split("_")[2].equals("W")) {
                                        gameBoard[x][y].setIcon(queenBW);
                                    } else if (gameTracker[x][y].split("_")[2].equals("B")) {
                                        gameBoard[x][y].setIcon(queenBB);
                                    }
                                    if (gameTracker[prevX][prevY].split("_")[2].equals("W")) {
                                        gameBoard[prevX][prevY].setIcon(defaultW0);
                                    } else if (gameTracker[prevX][prevY].split("_")[2].equals("B")) {
                                        gameBoard[prevX][prevY].setIcon(defaultB0);
                                    }
                                }

                                if (turn.equals("W")) {
                                    turn = "B";
                                } else if (turn.equals("B")) {
                                    turn = "W";
                                }

                            }

                            inSelection = false;
                            reset();

                            System.out.println("Reached:  " + turn);
                            if (turn.equals("B")) {
                                if (checkmate("B")) {
                                    JOptionPane.showMessageDialog(null, "Checkmate! White Wins!", "Game Over!", JOptionPane.INFORMATION_MESSAGE);
                                    System.out.println("Reached checkmate");
                                }
                            } else if (turn.equals("W")) {
                                if (checkmate("W")) {
                                    JOptionPane.showMessageDialog(null, "Checkmate! Black Wins!", "Game Over!", JOptionPane.INFORMATION_MESSAGE);
                                    System.out.println("Reached checkmate");
                                }
                            }


                        }
                        case "K" -> {
                            //king

                            if (gameTracker[x][y].split("_")[3].equals("Y")) {

                                if (squareInfo[1].equals("W")) {
                                    gameTracker[x][y] = "K_W_" + gameTracker[x][y].split("_")[2] + "_N";
                                } else if (squareInfo[1].equals("B")) {
                                    gameTracker[x][y] = "K_B_" + gameTracker[x][y].split("_")[2] + "_N";
                                }
                                gameTracker[prevX][prevY] = "X_X_" + gameTracker[prevX][prevY].split("_")[2] + "_N";


                                if (squareInfo[1].equals("W")) {
                                    if (gameTracker[x][y].split("_")[2].equals("W")) {
                                        gameBoard[x][y].setIcon(kingWW);
                                    } else if (gameTracker[x][y].split("_")[2].equals("B")) {
                                        gameBoard[x][y].setIcon(kingWB);
                                    }
                                    if (gameTracker[prevX][prevY].split("_")[2].equals("W")) {
                                        gameBoard[prevX][prevY].setIcon(defaultW0);
                                    } else if (gameTracker[prevX][prevY].split("_")[2].equals("B")) {
                                        gameBoard[prevX][prevY].setIcon(defaultB0);
                                    }
                                } else if (squareInfo[1].equals("B")) {
                                    if (gameTracker[x][y].split("_")[2].equals("W")) {
                                        gameBoard[x][y].setIcon(kingBW);
                                    } else if (gameTracker[x][y].split("_")[2].equals("B")) {
                                        gameBoard[x][y].setIcon(kingBB);
                                    }
                                    if (gameTracker[prevX][prevY].split("_")[2].equals("W")) {
                                        gameBoard[prevX][prevY].setIcon(defaultW0);
                                    } else if (gameTracker[prevX][prevY].split("_")[2].equals("B")) {
                                        gameBoard[prevX][prevY].setIcon(defaultB0);
                                    }
                                }

                                if (turn.equals("W")) {
                                    turn = "B";
                                } else if (turn.equals("B")) {
                                    turn = "W";
                                }

                            }

                            inSelection = false;
                            reset();

                            System.out.println("Reached:  " + turn);
                            if (turn.equals("B")) {
                                if (checkmate("B")) {
                                    JOptionPane.showMessageDialog(null, "Checkmate! White Wins!", "Game Over!", JOptionPane.INFORMATION_MESSAGE);
                                    System.out.println("Reached checkmate");
                                }
                            } else if (turn.equals("W")) {
                                if (checkmate("W")) {
                                    JOptionPane.showMessageDialog(null, "Checkmate! Black Wins!", "Game Over!", JOptionPane.INFORMATION_MESSAGE);
                                    System.out.println("Reached checkmate");
                                }
                            }


                        }
                    }


                    //TODO add checkmate

                }

            }
        };

        //TODO add reset selections method
        //TODO add checkmate method
                

        frame = new JFrame("Chess");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        panel = new JPanel();
        panel.setLayout(new GridLayout(8,8));

        cellA1 = new JButton(rookWB);
        cellA1.addActionListener(actionListener);
        cellA2 = new JButton(pawnWW);
        cellA2.addActionListener(actionListener);
        cellA3 = new JButton(defaultB0);
        cellA3.addActionListener(actionListener);
        cellA4 = new JButton(defaultW0);
        cellA4.addActionListener(actionListener);
        cellA5 = new JButton(defaultB0);
        cellA5.addActionListener(actionListener);
        cellA6 = new JButton(defaultW0);
        cellA6.addActionListener(actionListener);
        cellA7 = new JButton(pawnBB);
        cellA7.addActionListener(actionListener);
        cellA8 = new JButton(rookBW);
        cellA8.addActionListener(actionListener);

        cellB1 = new JButton(knightWW);
        cellB1.addActionListener(actionListener);
        cellB2 = new JButton(pawnWB);
        cellB2.addActionListener(actionListener);
        cellB3 = new JButton(defaultW0);
        cellB3.addActionListener(actionListener);
        cellB4 = new JButton(defaultB0);
        cellB4.addActionListener(actionListener);
        cellB5 = new JButton(defaultW0);
        cellB5.addActionListener(actionListener);
        cellB6 = new JButton(defaultB0);
        cellB6.addActionListener(actionListener);
        cellB7 = new JButton(pawnBW);
        cellB7.addActionListener(actionListener);
        cellB8 = new JButton(knightBB);
        cellB8.addActionListener(actionListener);

        cellC1 = new JButton(bishopWB);
        cellC1.addActionListener(actionListener);
        cellC2 = new JButton(pawnWW);
        cellC2.addActionListener(actionListener);
        cellC3 = new JButton(defaultB0);
        cellC3.addActionListener(actionListener);
        cellC4 = new JButton(defaultW0);
        cellC4.addActionListener(actionListener);
        cellC5 = new JButton(defaultB0);
        cellC5.addActionListener(actionListener);
        cellC6 = new JButton(defaultW0);
        cellC6.addActionListener(actionListener);
        cellC7 = new JButton(pawnBB);
        cellC7.addActionListener(actionListener);
        cellC8 = new JButton(bishopBW);
        cellC8.addActionListener(actionListener);

        cellD1 = new JButton(queenWW);
        cellD1.addActionListener(actionListener);
        cellD2 = new JButton(pawnWB);
        cellD2.addActionListener(actionListener);
        cellD3 = new JButton(defaultW0);
        cellD3.addActionListener(actionListener);
        cellD4 = new JButton(defaultB0);
        cellD4.addActionListener(actionListener);
        cellD5 = new JButton(defaultW0);
        cellD5.addActionListener(actionListener);
        cellD6 = new JButton(defaultB0);
        cellD6.addActionListener(actionListener);
        cellD7 = new JButton(pawnBW);
        cellD7.addActionListener(actionListener);
        cellD8 = new JButton(queenBB);
        cellD8.addActionListener(actionListener);

        cellE1 = new JButton(kingWB);
        cellE1.addActionListener(actionListener);
        cellE2 = new JButton(pawnWW);
        cellE2.addActionListener(actionListener);
        cellE3 = new JButton(defaultB0);
        cellE3.addActionListener(actionListener);
        cellE4 = new JButton(defaultW0);
        cellE4.addActionListener(actionListener);
        cellE5 = new JButton(defaultB0);
        cellE5.addActionListener(actionListener);
        cellE6 = new JButton(defaultW0);
        cellE6.addActionListener(actionListener);
        cellE7 = new JButton(pawnBB);
        cellE7.addActionListener(actionListener);
        cellE8 = new JButton(kingBW);
        cellE8.addActionListener(actionListener);

        cellF1 = new JButton(bishopWW);
        cellF1.addActionListener(actionListener);
        cellF2 = new JButton(pawnWB);
        cellF2.addActionListener(actionListener);
        cellF3 = new JButton(defaultW0);
        cellF3.addActionListener(actionListener);
        cellF4 = new JButton(defaultB0);
        cellF4.addActionListener(actionListener);
        cellF5 = new JButton(defaultW0);
        cellF5.addActionListener(actionListener);
        cellF6 = new JButton(defaultB0);
        cellF6.addActionListener(actionListener);
        cellF7 = new JButton(pawnBW);
        cellF7.addActionListener(actionListener);
        cellF8 = new JButton(bishopBB);
        cellF8.addActionListener(actionListener);

        cellG1 = new JButton(knightWB);
        cellG1.addActionListener(actionListener);
        cellG2 = new JButton(pawnWW);
        cellG2.addActionListener(actionListener);
        cellG3 = new JButton(defaultB0);
        cellG3.addActionListener(actionListener);
        cellG4 = new JButton(defaultW0);
        cellG4.addActionListener(actionListener);
        cellG5 = new JButton(defaultB0);
        cellG5.addActionListener(actionListener);
        cellG6 = new JButton(defaultW0);
        cellG6.addActionListener(actionListener);
        cellG7 = new JButton(pawnBB);
        cellG7.addActionListener(actionListener);
        cellG8 = new JButton(knightBW);
        cellG8.addActionListener(actionListener);

        cellH1 = new JButton(rookWW);
        cellH1.addActionListener(actionListener);
        cellH2 = new JButton(pawnWB);
        cellH2.addActionListener(actionListener);
        cellH3 = new JButton(defaultW0);
        cellH3.addActionListener(actionListener);
        cellH4 = new JButton(defaultB0);
        cellH4.addActionListener(actionListener);
        cellH5 = new JButton(defaultW0);
        cellH5.addActionListener(actionListener);
        cellH6 = new JButton(defaultB0);
        cellH6.addActionListener(actionListener);
        cellH7 = new JButton(pawnBW);
        cellH7.addActionListener(actionListener);
        cellH8 = new JButton(rookBB);
        cellH8.addActionListener(actionListener);


        gameBoard[7][0] = cellA1;
        gameBoard[6][0] = cellA2;
        gameBoard[5][0] = cellA3;
        gameBoard[4][0] = cellA4;
        gameBoard[3][0] = cellA5;
        gameBoard[2][0] = cellA6;
        gameBoard[1][0] = cellA7;
        gameBoard[0][0] = cellA8;


        gameTracker[7][0] = "R_W_B_N";
        gameTracker[6][0] = "P_W_W_N";
        gameTracker[5][0] = "X_X_B_N";
        gameTracker[4][0] = "X_X_W_N";
        gameTracker[3][0] = "X_X_B_N";
        gameTracker[2][0] = "X_X_W_N";
        gameTracker[1][0] = "P_B_B_N";
        gameTracker[0][0] = "R_B_W_N";



        gameBoard[7][1] = cellB1;
        gameBoard[6][1] = cellB2;
        gameBoard[5][1] = cellB3;
        gameBoard[4][1] = cellB4;
        gameBoard[3][1] = cellB5;
        gameBoard[2][1] = cellB6;
        gameBoard[1][1] = cellB7;
        gameBoard[0][1] = cellB8;

        gameTracker[7][1] = "N_W_W_N";
        gameTracker[6][1] = "P_W_B_N";
        gameTracker[5][1] = "X_X_W_N";
        gameTracker[4][1] = "X_X_B_N";
        gameTracker[3][1] = "X_X_W_N";
        gameTracker[2][1] = "X_X_B_N";
        gameTracker[1][1] = "P_B_W_N";
        gameTracker[0][1] = "N_B_B_N";

        gameBoard[7][2] = cellC1;
        gameBoard[6][2] = cellC2;
        gameBoard[5][2] = cellC3;
        gameBoard[4][2] = cellC4;
        gameBoard[3][2] = cellC5;
        gameBoard[2][2] = cellC6;
        gameBoard[1][2] = cellC7;
        gameBoard[0][2] = cellC8;

        gameTracker[7][2] = "B_W_B_N";
        gameTracker[6][2] = "P_W_W_N";
        gameTracker[5][2] = "X_X_B_N";
        gameTracker[4][2] = "X_X_W_N";
        gameTracker[3][2] = "X_X_B_N";
        gameTracker[2][2] = "X_X_W_N";
        gameTracker[1][2] = "P_B_B_N";
        gameTracker[0][2] = "B_B_W_N";

        gameBoard[7][3] = cellD1;
        gameBoard[6][3] = cellD2;
        gameBoard[5][3] = cellD3;
        gameBoard[4][3] = cellD4;
        gameBoard[3][3] = cellD5;
        gameBoard[2][3] = cellD6;
        gameBoard[1][3] = cellD7;
        gameBoard[0][3] = cellD8;

        gameTracker[7][3] = "Q_W_W_N";
        gameTracker[6][3] = "P_W_B_N";
        gameTracker[5][3] = "X_X_W_N";
        gameTracker[4][3] = "X_X_B_N";
        gameTracker[3][3] = "X_X_W_N";
        gameTracker[2][3] = "X_X_B_N";
        gameTracker[1][3] = "P_B_W_N";
        gameTracker[0][3] = "Q_B_B_N";

        gameBoard[7][4] = cellE1;
        gameBoard[6][4] = cellE2;
        gameBoard[5][4] = cellE3;
        gameBoard[4][4] = cellE4;
        gameBoard[3][4] = cellE5;
        gameBoard[2][4] = cellE6;
        gameBoard[1][4] = cellE7;
        gameBoard[0][4] = cellE8;

        gameTracker[7][4] = "K_W_B_N";
        gameTracker[6][4] = "P_W_W_N";
        gameTracker[5][4] = "X_X_B_N";
        gameTracker[4][4] = "X_X_W_N";
        gameTracker[3][4] = "X_X_B_N";
        gameTracker[2][4] = "X_X_W_N";
        gameTracker[1][4] = "P_B_B_N";
        gameTracker[0][4] = "K_B_W_N";

        gameBoard[7][5] = cellF1;
        gameBoard[6][5] = cellF2;
        gameBoard[5][5] = cellF3;
        gameBoard[4][5] = cellF4;
        gameBoard[3][5] = cellF5;
        gameBoard[2][5] = cellF6;
        gameBoard[1][5] = cellF7;
        gameBoard[0][5] = cellF8;

        gameTracker[7][5] = "B_W_W_N";
        gameTracker[6][5] = "P_W_B_N";
        gameTracker[5][5] = "X_X_W_N";
        gameTracker[4][5] = "X_X_B_N";
        gameTracker[3][5] = "X_X_W_N";
        gameTracker[2][5] = "X_X_B_N";
        gameTracker[1][5] = "P_B_W_N";
        gameTracker[0][5] = "B_B_B_N";

        gameBoard[7][6] = cellG1;
        gameBoard[6][6] = cellG2;
        gameBoard[5][6] = cellG3;
        gameBoard[4][6] = cellG4;
        gameBoard[3][6] = cellG5;
        gameBoard[2][6] = cellG6;
        gameBoard[1][6] = cellG7;
        gameBoard[0][6] = cellG8;

        gameTracker[7][6] = "N_W_B_N";
        gameTracker[6][6] = "P_W_W_N";
        gameTracker[5][6] = "X_X_B_N";
        gameTracker[4][6] = "X_X_W_N";
        gameTracker[3][6] = "X_X_B_N";
        gameTracker[2][6] = "X_X_W_N";
        gameTracker[1][6] = "P_B_B_N";
        gameTracker[0][6] = "N_B_W_N";

        gameBoard[7][7] = cellH1;
        gameBoard[6][7] = cellH2;
        gameBoard[5][7] = cellH3;
        gameBoard[4][7] = cellH4;
        gameBoard[3][7] = cellH5;
        gameBoard[2][7] = cellH6;
        gameBoard[1][7] = cellH7;
        gameBoard[0][7] = cellH8;

        gameTracker[7][7] = "R_W_W_N";
        gameTracker[6][7] = "P_W_B_N";
        gameTracker[5][7] = "X_X_W_N";
        gameTracker[4][7] = "X_X_B_N";
        gameTracker[3][7] = "X_X_W_N";
        gameTracker[2][7] = "X_X_B_N";
        gameTracker[1][7] = "P_B_W_N";
        gameTracker[0][7] = "R_B_B_N";



        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[0].length; j++) {
                gameBoard[i][j].setBackground(Color.WHITE);
            }
        }


        panel.add(cellA8);
        panel.add(cellB8);
        panel.add(cellC8);
        panel.add(cellD8);
        panel.add(cellE8);
        panel.add(cellF8);
        panel.add(cellG8);
        panel.add(cellH8);

        panel.add(cellA7);
        panel.add(cellB7);
        panel.add(cellC7);
        panel.add(cellD7);
        panel.add(cellE7);
        panel.add(cellF7);
        panel.add(cellG7);
        panel.add(cellH7);

        panel.add(cellA6);
        panel.add(cellB6);
        panel.add(cellC6);
        panel.add(cellD6);
        panel.add(cellE6);
        panel.add(cellF6);
        panel.add(cellG6);
        panel.add(cellH6);

        panel.add(cellA5);
        panel.add(cellB5);
        panel.add(cellC5);
        panel.add(cellD5);
        panel.add(cellE5);
        panel.add(cellF5);
        panel.add(cellG5);
        panel.add(cellH5);

        panel.add(cellA4);
        panel.add(cellB4);
        panel.add(cellC4);
        panel.add(cellD4);
        panel.add(cellE4);
        panel.add(cellF4);
        panel.add(cellG4);
        panel.add(cellH4);

        panel.add(cellA3);
        panel.add(cellB3);
        panel.add(cellC3);
        panel.add(cellD3);
        panel.add(cellE3);
        panel.add(cellF3);
        panel.add(cellG3);
        panel.add(cellH3);

        panel.add(cellA2);
        panel.add(cellB2);
        panel.add(cellC2);
        panel.add(cellD2);
        panel.add(cellE2);
        panel.add(cellF2);
        panel.add(cellG2);
        panel.add(cellH2);

        panel.add(cellA1);
        panel.add(cellB1);
        panel.add(cellC1);
        panel.add(cellD1);
        panel.add(cellE1);
        panel.add(cellF1);
        panel.add(cellG1);
        panel.add(cellH1);


        frame.add(panel);
        frame.pack();
        frame.setVisible(true);

    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Chess chess = new Chess();
                chess.startChess();
            }
        });
    }
}
