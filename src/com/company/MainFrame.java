package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

    private JTextArea textArea;
    private JButton btnAddText;
    private JButton btnClearText;
    private Integer counter;


public MainFrame() {
    super("Border Demonstration");

                counter =0;

                setSize(600,500);

                setLayout(new BorderLayout());

                textArea = new JTextArea("Counter");
                btnAddText = new JButton("Click Me");
                btnClearText = new JButton("Clear");

                btnAddText.addActionListener(
                        new ActionListener(){


                            @Override
                            public void actionPerformed(ActionEvent e) {
                                textArea.append("This is my first text");
                               // textArea.setText(null);

                                counter++;
                                textArea.setText(Integer.toString(counter));
                            }
                        }


                );
                 btnClearText.addActionListener(
                 new ActionListener(){


                @Override
                public void actionPerformed(ActionEvent e) {

                    counter = 0;
                    textArea.setText(Integer.toString(counter));



                }
            }


    );





                add(btnAddText,BorderLayout.SOUTH);
                add(btnClearText,BorderLayout.EAST);
                add(textArea, BorderLayout.CENTER);

                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                setVisible(true);

            }
        }





