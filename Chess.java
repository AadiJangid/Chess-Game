import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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


    public void startChess() {
        //TODO add main code

        //piece_squareColor_?
        gameTracker = new String[8][8];
        gameBoard = new JButton[8][8];


        Icon pawnWW = new ImageIcon("pawnWW.jpg");
        Icon pawnWB = new ImageIcon("pawnWB.jpg");
        Icon pawnBW = new ImageIcon("pawnBW.jpg");
        Icon pawnBB = new ImageIcon("pawnBB.jpg");

        Icon rookWW = new ImageIcon("rookWW.jpg");
        Icon rookWB = new ImageIcon("rookWB.jpg");
        Icon rookBW = new ImageIcon("rookBW.jpg");
        Icon rookBB = new ImageIcon("rookBB.jpg");

        Icon knightWW = new ImageIcon("knightWW.jpg");
        Icon knightWB = new ImageIcon("knightWB.jpg");
        Icon knightBW = new ImageIcon("knightBW.jpg");
        Icon knightBB = new ImageIcon("knightBB.jpg");

        Icon bishopWW = new ImageIcon("bishopWW.jpg");
        Icon bishopWB = new ImageIcon("bishopWB.jpg");
        Icon bishopBW = new ImageIcon("bishopBW.jpg");
        Icon bishopBB = new ImageIcon("bishopBB.jpg");

        Icon queenWW = new ImageIcon("queenWW.jpg");
        Icon queenWB = new ImageIcon("queenWB.jpg");
        Icon queenBW = new ImageIcon("queenBW.jpg");
        Icon queenBB = new ImageIcon("queenBB.jpg");

        Icon kingWW = new ImageIcon("kingWW.jpg");
        Icon kingWB = new ImageIcon("kingWB.jpg");
        Icon kingBW = new ImageIcon("kingBW.jpg");
        Icon kingBB = new ImageIcon("kingBB.jpg");

        Icon defaultB0 = new ImageIcon("defaultB0.jpg");
        Icon defaultB1 = new ImageIcon("defaultB1.jpg");
        Icon defaultW0 = new ImageIcon("defaultW0.jpg");
        Icon defaultW1 = new ImageIcon("defaultW1.jpg");



                

        frame = new JFrame("Chess");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        panel = new JPanel();
        panel.setLayout(new GridLayout(8,8));

        cellA1 = new JButton(rookWB);
        cellA1.addActionListener(e->{
        });
        cellA2 = new JButton(pawnWW);
        cellA2.addActionListener(e->{});
        cellA3 = new JButton(defaultB0);
        cellA3.addActionListener(e->{});
        cellA4 = new JButton(defaultW0);
        cellA4.addActionListener(e->{});
        cellA5 = new JButton(defaultB0);
        cellA5.addActionListener(e->{});
        cellA6 = new JButton(defaultW0);
        cellA6.addActionListener(e->{});
        cellA7 = new JButton(pawnBB);
        cellA7.addActionListener(e->{});
        cellA8 = new JButton(rookBW);
        cellA8.addActionListener(e->{});

        cellB1 = new JButton(knightWW);
        cellB1.addActionListener(e->{});
        cellB2 = new JButton(pawnWB);
        cellB2.addActionListener(e->{});
        cellB3 = new JButton(defaultW0);
        cellB3.addActionListener(e->{});
        cellB4 = new JButton(defaultB0);
        cellB4.addActionListener(e->{});
        cellB5 = new JButton(defaultW0);
        cellB5.addActionListener(e->{});
        cellB6 = new JButton(defaultB0);
        cellB6.addActionListener(e->{});
        cellB7 = new JButton(pawnBW);
        cellB7.addActionListener(e->{});
        cellB8 = new JButton(knightBB);
        cellB8.addActionListener(e->{});

        cellC1 = new JButton(bishopWB);
        cellC1.addActionListener(e->{
        });
        cellC2 = new JButton(pawnWW);
        cellC2.addActionListener(e->{
        });
        cellC3 = new JButton(defaultB0);
        cellC3.addActionListener(e->{});
        cellC4 = new JButton(defaultW0);
        cellC4.addActionListener(e->{});
        cellC5 = new JButton(defaultB0);
        cellC5.addActionListener(e->{});
        cellC6 = new JButton(defaultW0);
        cellC6.addActionListener(e->{});
        cellC7 = new JButton(pawnBB);
        cellC7.addActionListener(e->{});
        cellC8 = new JButton(bishopBW);
        cellC8.addActionListener(e->{});

        cellD1 = new JButton(queenWW);
        cellD1.addActionListener(e->{});
        cellD2 = new JButton(pawnWB);
        cellD2.addActionListener(e->{});
        cellD3 = new JButton(defaultW0);
        cellD3.addActionListener(e->{});
        cellD4 = new JButton(defaultB0);
        cellD4.addActionListener(e->{});
        cellD5 = new JButton(defaultW0);
        cellD5.addActionListener(e->{});
        cellD6 = new JButton(defaultB0);
        cellD6.addActionListener(e->{});
        cellD7 = new JButton(pawnBW);
        cellD7.addActionListener(e->{});
        cellD8 = new JButton(queenBB);
        cellD8.addActionListener(e->{});

        cellE1 = new JButton(kingWB);
        cellE1.addActionListener(e->{});
        cellE2 = new JButton(pawnWW);
        cellE2.addActionListener(e->{});
        cellE3 = new JButton(defaultB0);
        cellE3.addActionListener(e->{});
        cellE4 = new JButton(defaultW0);
        cellE4.addActionListener(e->{});
        cellE5 = new JButton(defaultB0);
        cellE5.addActionListener(e->{});
        cellE6 = new JButton(defaultW0);
        cellE6.addActionListener(e->{});
        cellE7 = new JButton(pawnBB);
        cellE7.addActionListener(e->{});
        cellE8 = new JButton(kingBW);
        cellE8.addActionListener(e->{});

        cellF1 = new JButton(bishopWW);
        cellF1.addActionListener(e->{});
        cellF2 = new JButton(pawnWB);
        cellF2.addActionListener(e->{});
        cellF3 = new JButton(defaultW0);
        cellF3.addActionListener(e->{});
        cellF4 = new JButton(defaultB0);
        cellF4.addActionListener(e->{});
        cellF5 = new JButton(defaultW0);
        cellF5.addActionListener(e->{});
        cellF6 = new JButton(defaultB0);
        cellF6.addActionListener(e->{});
        cellF7 = new JButton(pawnBW);
        cellF7.addActionListener(e->{});
        cellF8 = new JButton(bishopBB);
        cellF8.addActionListener(e->{});

        cellG1 = new JButton(knightWB);
        cellG1.addActionListener(e->{});
        cellG2 = new JButton(pawnWW);
        cellG2.addActionListener(e->{});
        cellG3 = new JButton(defaultB0);
        cellG3.addActionListener(e->{});
        cellG4 = new JButton(defaultW0);
        cellG4.addActionListener(e->{});
        cellG5 = new JButton(defaultB0);
        cellG5.addActionListener(e->{});
        cellG6 = new JButton(defaultW0);
        cellG6.addActionListener(e->{});
        cellG7 = new JButton(pawnBB);
        cellG7.addActionListener(e->{});
        cellG8 = new JButton(knightBW);
        cellG8.addActionListener(e->{});

        cellH1 = new JButton(rookWW);
        cellH1.addActionListener(e->{});
        cellH2 = new JButton(pawnWB);
        cellH2.addActionListener(e->{});
        cellH3 = new JButton(defaultW0);
        cellH3.addActionListener(e->{});
        cellH4 = new JButton(defaultB0);
        cellH4.addActionListener(e->{});
        cellH5 = new JButton(defaultW0);
        cellH5.addActionListener(e->{});
        cellH6 = new JButton(defaultB0);
        cellH6.addActionListener(e->{});
        cellH7 = new JButton(pawnBW);
        cellH7.addActionListener(e->{});
        cellH8 = new JButton(rookBB);
        cellH8.addActionListener(e->{});


        gameBoard[7][0] = cellA1;
        gameBoard[6][0] = cellA2;
        gameBoard[5][0] = cellA3;
        gameBoard[4][0] = cellA4;
        gameBoard[3][0] = cellA5;
        gameBoard[2][0] = cellA6;
        gameBoard[1][0] = cellA7;
        gameBoard[0][0] = cellA8;

        gameBoard[7][1] = cellB1;
        gameBoard[6][1] = cellB2;
        gameBoard[5][1] = cellB3;
        gameBoard[4][1] = cellB4;
        gameBoard[3][1] = cellB5;
        gameBoard[2][1] = cellB6;
        gameBoard[1][1] = cellB7;
        gameBoard[0][1] = cellB8;

        gameBoard[7][2] = cellC1;
        gameBoard[6][2] = cellC2;
        gameBoard[5][2] = cellC3;
        gameBoard[4][2] = cellC4;
        gameBoard[3][2] = cellC5;
        gameBoard[2][2] = cellC6;
        gameBoard[1][2] = cellC7;
        gameBoard[0][2] = cellC8;

        gameBoard[7][3] = cellD1;
        gameBoard[6][3] = cellD2;
        gameBoard[5][3] = cellD3;
        gameBoard[4][3] = cellD4;
        gameBoard[3][3] = cellD5;
        gameBoard[2][3] = cellD6;
        gameBoard[1][3] = cellD7;
        gameBoard[0][3] = cellD8;

        gameBoard[7][4] = cellE1;
        gameBoard[6][4] = cellE2;
        gameBoard[5][4] = cellE3;
        gameBoard[4][4] = cellE4;
        gameBoard[3][4] = cellE5;
        gameBoard[2][4] = cellE6;
        gameBoard[1][4] = cellE7;
        gameBoard[0][4] = cellE8;

        gameBoard[7][5] = cellF1;
        gameBoard[6][5] = cellF2;
        gameBoard[5][5] = cellF3;
        gameBoard[4][5] = cellF4;
        gameBoard[3][5] = cellF5;
        gameBoard[2][5] = cellF6;
        gameBoard[1][5] = cellF7;
        gameBoard[0][5] = cellF8;

        gameBoard[7][6] = cellG1;
        gameBoard[6][6] = cellG2;
        gameBoard[5][6] = cellG3;
        gameBoard[4][6] = cellG4;
        gameBoard[3][6] = cellG5;
        gameBoard[2][6] = cellG6;
        gameBoard[1][6] = cellG7;
        gameBoard[0][6] = cellG8;

        gameBoard[7][7] = cellH1;
        gameBoard[6][7] = cellH2;
        gameBoard[5][7] = cellH3;
        gameBoard[4][7] = cellH4;
        gameBoard[3][7] = cellH5;
        gameBoard[2][7] = cellH6;
        gameBoard[1][7] = cellH7;
        gameBoard[0][7] = cellH8;



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
