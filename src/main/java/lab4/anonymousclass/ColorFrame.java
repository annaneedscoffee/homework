package lab4.anonymousclass;


import lab4.anonymousclass.Counter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ColorFrame extends JFrame {

    public ColorFrame(int value) throws HeadlessException {

        Counter counter = new Counter(value);

        setSize(500,500);
        JButton button = new JButton("click me to be red");



       /* List.of("","sd").sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });*/


        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counter.getAndIncreaseCounter();

            }
        });

        getContentPane().add(button, BorderLayout.NORTH);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ColorFrame(10);
    }
}

