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


    public void initialize() {
        //TODO add main code

        gameTracker = new String[8][8];


        Icon pawnWW = new ImageIcon("pawnWW.jpg");


                

        frame = new JFrame("Chess");
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        panel = new JPanel();
        panel.setLayout(new GridLayout(8,8));

        cellA1 = new JButton("A1");
        cellA1.addActionListener(e->{});
        cellA2 = new JButton(pawnWW);
        cellA2.addActionListener(e->{});
        cellA3 = new JButton("A3");
        cellA3.addActionListener(e->{});
        cellA4 = new JButton("A4");
        cellA4.addActionListener(e->{});
        cellA5 = new JButton("A5");
        cellA5.addActionListener(e->{});
        cellA6 = new JButton("A6");
        cellA6.addActionListener(e->{});
        cellA7 = new JButton("A7");
        cellA7.addActionListener(e->{});
        cellA8 = new JButton("A8");
        cellA8.addActionListener(e->{});

        cellB1 = new JButton("B1");
        cellB1.addActionListener(e->{});
        cellB2 = new JButton("B2");
        cellB2.addActionListener(e->{});
        cellB3 = new JButton("B3");
        cellB3.addActionListener(e->{});
        cellB4 = new JButton("B4");
        cellB4.addActionListener(e->{});
        cellB5 = new JButton("B5");
        cellB5.addActionListener(e->{});
        cellB6 = new JButton("B6");
        cellB6.addActionListener(e->{});
        cellB7 = new JButton("B7");
        cellB7.addActionListener(e->{});
        cellB8 = new JButton("B8");
        cellB8.addActionListener(e->{});

        cellC1 = new JButton("C1");
        cellC1.addActionListener(e->{
        });
        cellC2 = new JButton("C2");
        cellC2.addActionListener(e->{
        });
        cellC3 = new JButton("C3");
        cellC3.addActionListener(e->{});
        cellC4 = new JButton("C4");
        cellC4.addActionListener(e->{});
        cellC5 = new JButton("C5");
        cellC5.addActionListener(e->{});
        cellC6 = new JButton("C6");
        cellC6.addActionListener(e->{});
        cellC7 = new JButton("C7");
        cellC7.addActionListener(e->{});
        cellC8 = new JButton("C8");
        cellC8.addActionListener(e->{});

        cellD1 = new JButton("D1");
        cellD1.addActionListener(e->{});
        cellD2 = new JButton("D2");
        cellD2.addActionListener(e->{});
        cellD3 = new JButton("D3");
        cellD3.addActionListener(e->{});
        cellD4 = new JButton("D4");
        cellD4.addActionListener(e->{});
        cellD5 = new JButton("D5");
        cellD5.addActionListener(e->{});
        cellD6 = new JButton("D6");
        cellD6.addActionListener(e->{});
        cellD7 = new JButton("D7");
        cellD7.addActionListener(e->{});
        cellD8 = new JButton("D8");
        cellD8.addActionListener(e->{});

        cellE1 = new JButton("E1");
        cellE1.addActionListener(e->{});
        cellE2 = new JButton("E2");
        cellE2.addActionListener(e->{});
        cellE3 = new JButton("E3");
        cellE3.addActionListener(e->{});
        cellE4 = new JButton("E4");
        cellE4.addActionListener(e->{});
        cellE5 = new JButton("E5");
        cellE5.addActionListener(e->{});
        cellE6 = new JButton("E6");
        cellE6.addActionListener(e->{});
        cellE7 = new JButton("E7");
        cellE7.addActionListener(e->{});
        cellE8 = new JButton("E8");
        cellE8.addActionListener(e->{});

        cellF1 = new JButton("F1");
        cellF1.addActionListener(e->{});
        cellF2 = new JButton("F2");
        cellF2.addActionListener(e->{});
        cellF3 = new JButton("F3");
        cellF3.addActionListener(e->{});
        cellF4 = new JButton("F4");
        cellF4.addActionListener(e->{});
        cellF5 = new JButton("F5");
        cellF5.addActionListener(e->{});
        cellF6 = new JButton("F6");
        cellF6.addActionListener(e->{});
        cellF7 = new JButton("F7");
        cellF7.addActionListener(e->{});
        cellF8 = new JButton("F8");
        cellF8.addActionListener(e->{});

        cellG1 = new JButton("G1");
        cellG1.addActionListener(e->{});
        cellG2 = new JButton("G2");
        cellG2.addActionListener(e->{});
        cellG3 = new JButton("G3");
        cellG3.addActionListener(e->{});
        cellG4 = new JButton("G4");
        cellG4.addActionListener(e->{});
        cellG5 = new JButton("G5");
        cellG5.addActionListener(e->{});
        cellG6 = new JButton("G6");
        cellG6.addActionListener(e->{});
        cellG7 = new JButton("G7");
        cellG7.addActionListener(e->{});
        cellG8 = new JButton("G8");
        cellG8.addActionListener(e->{});

        cellH1 = new JButton("H1");
        cellH1.addActionListener(e->{});
        cellH2 = new JButton("H2");
        cellH2.addActionListener(e->{});
        cellH3 = new JButton("H3");
        cellH3.addActionListener(e->{});
        cellH4 = new JButton("H4");
        cellH4.addActionListener(e->{});
        cellH5 = new JButton("H5");
        cellH5.addActionListener(e->{});
        cellH6 = new JButton("H6");
        cellH6.addActionListener(e->{});
        cellH7 = new JButton("H7");
        cellH7.addActionListener(e->{});
        cellH8 = new JButton("H8");
        cellH8.addActionListener(e->{});


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
                chess.initialize();
            }
        });
    }
}
