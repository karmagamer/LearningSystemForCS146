package com.company;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionListener;


public class Main implements ActionListener{

    static CardLayout cardLayout;
    static JPanel card = new JPanel();
    static JButton next = new JButton("Next");

    static JButton back = new JButton("Back");
    static JButton quit = new JButton("Quit ");
    static JButton AVL= new JButton("AVL Tree ");
    static JButton Binary = new JButton("Binary Tree");
    static JButton Expression = new JButton("Expression Tree");
    static JButton Stack = new JButton("Stack-Calculator Program ");
    static JButton Sorting = new JButton("Sorting methods");
    static JButton RunB = new JButton("Run Example !");
    static JButton Dj = new JButton("dijkstra Algorithm");

    static JButton backB = new JButton("Back");
    static JButton quitB = new JButton("Quit ");

    static JButton RunA = new JButton("Run Example !");

    static JButton backA = new JButton("Back");
    static JButton quitA = new JButton("Quit ");
    static JButton RunS = new JButton("Run Example !");

    static JButton backS = new JButton("Back");
    static JButton quitS = new JButton("Quit ");
    static JButton RunSt = new JButton("Run Example !");

    static JButton backSt = new JButton("Back");
    static JButton quitSt = new JButton("Quit ");
    static JButton RunE = new JButton("Run Example !");

    static JButton backE = new JButton("Back");
    static JButton quitE = new JButton("Quit ");
    static JButton RunDj = new JButton("Run Example !");

    static JButton backDj = new JButton("Back");
    static JButton quitDj = new JButton("Quit ");
    public void actionPerformed(ActionEvent e){}




    public static void main(String []args){
       JFrame frame = new JFrame();
        JPanel contentPane = (JPanel)frame.getContentPane();
        card.setLayout(cardLayout=new CardLayout());
        ActionListener AL = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            Object source = e.getSource();
                if(source==next){
                    cardLayout.show(card,"Card N");
                }
                if(source ==quit){
                    System.exit(0);
                }
                if(source==back){
                    cardLayout.show(card,"Card H");

                }
                if(source==RunB){
                    BinaryTreeTest.main(args);
                }
                if(source ==quitB){
                    System.exit(0);
                }
                if(source==backB){
                    cardLayout.show(card,"Card N");

                }
                if(source==RunS){
                    sortingtechniques.main(args);
                }
                if(source ==quitS){
                    System.exit(0);
                }
                if(source==backS){
                    cardLayout.show(card,"Card N");

                }
                if(source==RunSt){
                    RomanStack.main(args);
                }
                if(source ==quitSt){
                    System.exit(0);
                }
                if(source==backSt){
                    cardLayout.show(card,"Card N");

                }
                if(source==RunA){
                    AVLTest.main(args);
                }
                if(source ==quitA){
                    System.exit(0);
                }
                if(source==backA){
                    cardLayout.show(card,"Card N");

                }
                if(source==RunE){
                    ExpressionTreeTest.main(args);
                }
                if(source ==quitE){
                    System.exit(0);
                }
                if(source==backE){
                    cardLayout.show(card,"Card N");

                }
                if(source==RunDj){
                    Dijkstras_Shortest_Path.main(args);
                }
                if(source ==quitDj){
                    System.exit(0);
                }
                if(source==backDj){
                    cardLayout.show(card,"Card N");

                }
                if(source==Sorting){
                cardLayout.show(card,"Card S");
                }
                if(source==AVL){cardLayout.show(card,"Card A");

                }
                if(source==Expression){
                cardLayout.show(card,"Card E");
                }
                if(source==Stack){
                    cardLayout.show(card,"Card St");

                }
                if(source==Binary){
                    cardLayout.show(card,"Card B");


                }
                if(source==Dj){
                    cardLayout.show(card,"Card Dj");
                }
            }
        };
        JPanel cardH = new JPanel();
        cardH.setLayout(new GridLayout(2,1));
        JPanel label = new JPanel();
        JLabel lbl = new JLabel("Welcome to Data Structures and Algorithms Tutorial!");
        label.add(lbl);
        cardH.add(label);
        JPanel bP = new JPanel();
        bP.add(quit); bP.add(next);

       // bP.add(back);

       next.addActionListener(AL);quit.addActionListener(AL);back.addActionListener(AL);
        AVL.addActionListener(AL);Expression.addActionListener(AL);Binary.addActionListener(AL);
        Dj.addActionListener(AL);
        Sorting.addActionListener(AL);Stack.addActionListener(AL);backB.addActionListener(AL);
        quitB.addActionListener(AL);RunB.addActionListener(AL);
        ;backS.addActionListener(AL);
        quitS.addActionListener(AL);RunS.addActionListener(AL);
        backSt.addActionListener(AL);
        quitSt.addActionListener(AL);RunSt.addActionListener(AL);
        backA.addActionListener(AL);
        quitA.addActionListener(AL);RunA.addActionListener(AL);
        backDj.addActionListener(AL);
        quitDj.addActionListener(AL);RunDj.addActionListener(AL);
        backE.addActionListener(AL);
        quitE.addActionListener(AL);RunE.addActionListener(AL);


        cardH.add(bP);

        JPanel cardN = new JPanel();
        cardN.setLayout(new GridLayout(6,1));
        JPanel label2 = new JPanel();
        JLabel lbl2 = new JLabel("Pick a Topic to Learn and See Example!! ");
        label2.add(lbl2);
        cardN.add(label2);
        JPanel bp2 = new JPanel();
        bp2.add(AVL);
        bp2.add(Expression);
        bp2.add(Binary);
        bp2.add(Sorting);
        bp2.add(Stack);
        bp2.add(back);
        bp2.add(quit);
        bp2.add(Dj);
        cardN.add(bp2);
        //Binary Tree Buttons and Card
        //String sep = System.getProperty("line.separator");
        JPanel cardB = new JPanel();
        cardN.setLayout(new GridLayout(6,1));
        JPanel label3 = new JPanel();
        JLabel lbl3 = new JLabel("Click run to see the Example!!");
        label3.add(lbl3);
        cardB.add(label3);
        JPanel bp3 = new JPanel();
        bp3.add(backB);
        bp3.add(quitB);
        bp3.add(RunB);
        cardB.add(bp3);
        //sorting
        JPanel cardS = new JPanel();
        cardN.setLayout(new GridLayout(6,1));
        JPanel labelS = new JPanel();
        JLabel lblS = new JLabel("Click run to see the Example!!");
        labelS.add(lblS);
        cardS.add(labelS);
        JPanel bpS = new JPanel();
        bpS.add(backS);
        bpS.add(quitS);
        bpS.add(RunS);
        cardS.add(bpS);
        //stack
        JPanel cardSt = new JPanel();
        cardN.setLayout(new GridLayout(6,1));
        JPanel labelSt = new JPanel();
        JLabel lblSt = new JLabel("Click run to see the Example!!");
        labelSt.add(lblSt);
        cardSt.add(labelSt);
        JPanel bpSt = new JPanel();
        bpSt.add(backSt);
        bpSt.add(quitSt);
        bpSt.add(RunSt);
        cardSt.add(bpSt);
        //AVL Tree
        JPanel cardA = new JPanel();
        cardN.setLayout(new GridLayout(6,1));
        JPanel labelA = new JPanel();
        JLabel lblA = new JLabel("Click run to see the Example!!");
        labelA.add(lblA);
        cardA.add(labelA);
        JPanel bpA = new JPanel();
        bpA.add(backA);
        bpA.add(quitA);
        bpA.add(RunA);
        cardA.add(bpA);
        //E Tree
        JPanel cardE = new JPanel();
        cardN.setLayout(new GridLayout(6,1));
        JPanel labelE = new JPanel();
        JLabel lblE = new JLabel("Click run to see the Example!!");
        labelE.add(lblE);
        cardE.add(labelE);
        JPanel bpE = new JPanel();
        bpE.add(backE);
        bpE.add(quitE);
        bpE.add(RunE);
        cardE.add(bpE);
        //graph algorithm Tree
        JPanel cardDj = new JPanel();
        cardN.setLayout(new GridLayout(6,1));
        JPanel labelDj = new JPanel();
        JLabel lblDj = new JLabel("Click run to see the Example!!");
        labelDj.add(lblDj);
        cardDj.add(labelDj);
        JPanel bpDj = new JPanel();
        bpDj.add(backDj);
        bpDj.add(quitDj);
        bpDj.add(RunDj);
        cardDj.add(bpDj);

        card.add("Card H", cardH);card.add("Card N",cardN);card.add("Card B",cardB);card.add("Card S",cardS);
        card.add("Card St",cardSt);card.add("Card A",cardA);card.add("Card E",cardE);card.add("Card Dj",cardDj);


        cardLayout.show(card,"Card H");
        contentPane.add(card);
        frame.setVisible(true);
        frame.setResizable(true);
        frame.setSize(800,800);
        frame.setLocation(580,380);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    //public static void main(String []args){

        //sortingtechniques.main(args);
        //RomanStack.main(args);
        //AVLTest.main(args);
    }

}