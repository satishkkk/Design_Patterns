package com.satish.commandserver;
import javax.swing.*;

import java.awt.event.*;
import java.awt.*;
import java.io.*;
import java.net.*;

public class L1 implements ActionListener{
    private JTextArea ta;
    private JTextField tf;
    private PrintWriter nos;

    public L1(JTextArea ta, JTextField tf, PrintWriter nos) {
        this.ta = ta;
        this.tf = tf;
        this.nos = nos;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String str = tf.getText();
        nos.println(str);
        tf.setText("");
        if(str.equals("End")) {
            nos.close();
            System.exit(0);
        }
    }
}