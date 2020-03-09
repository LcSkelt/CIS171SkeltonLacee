/*
Author: Lacee Skelton
Application: Currency Conversion
Date: 03/08/2020
 */
package skelton_currencyconversion;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;

public class skelton_currencyconversion extends Frame implements ItemListener, ActionListener
{
    //iniatialized all the GUI components
    JComboBox convertFrom, convertTo;
    JTextField txtFrom, txtTo;
    JButton compute, exit;
    JLabel from, to;
    JLabel lblFrom, lblTo;
    JPanel mainPanel = new JPanel();

    double input = 0;
    double result = 0;

    public skelton_currencyconversion() {
        //add all the GUI components
        super("Currency Converter");
        setSize(420,300);
        setLayout(null);
        setBackground(Color.lightGray);

        lblFrom = new JLabel("From:");
        lblFrom.setBounds(30,45,250,30);
        lblFrom.setForeground(Color.RED);
        add(lblFrom);

        convertFrom = new JComboBox();
        convertFrom.setBounds(30,70,150,30);
        convertFrom.addItem("US Dollar");
        
       
        add(convertFrom);

        lblTo = new JLabel("To:");
        lblTo.setBounds(230,45,250,30);
        lblTo.setForeground(Color.RED);
        add(lblTo);

        convertTo = new JComboBox();
        convertTo.setBounds(230,70,150,30);
        convertTo.addItem("Canadian Dollar");
        add(convertTo);

        from = new JLabel("Enter Amount to Convert:");
        from.setBounds(50,110,300,30);
        add(from);

        txtFrom = new JTextField(15);
        txtFrom.setBounds(50,140,300,30);
        add(txtFrom);

        compute = new JButton("Compute");
        compute.setBounds(100,250,100,30);
        add(compute);

        to = new JLabel("Total Amount Converted:");
        to.setBounds(50,170,300,30);
        add(to);  

        txtTo = new JTextField(15);
        txtTo.setBounds(50,200,300,30);
        txtTo.setEditable(false);
        txtTo.setForeground(Color.RED);
        add(txtTo);

        exit = new JButton("Exit");
        exit.setBounds(210,250,100,30);
        add(exit);
       
        //register all the GUI components who will listen or invoke the methods
        convertFrom.addItemListener(this);
        convertTo.addItemListener(this);
        compute.addActionListener(this);
        txtFrom.addActionListener(this);
        exit.addActionListener(this);
       
        //this will close the applet window if the user clicked the close or exit button
        addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    exit();
                }
            });
    }
    //the exit method
    public void exit(){
        setVisible(false);
        dispose();
        System.exit(0);
    }
    //show or make the applet window frame visible
    public static void main(String args[]) {
        skelton_currencyconversion w = new skelton_currencyconversion();
        w.setVisible(true);
    }

    public void ConvertDollar() {
        
            result = (input);
            txtTo.setText(""+result);
        }

    
    public void actionPerformed(ActionEvent e) {

        input = Double.parseDouble(txtFrom.getText());
        String msg = txtFrom.getText();

        if(e.getSource()==compute)
        {
            if(convertFrom.getSelectedItem()=="Canadian Dollar")
            {
                ConvertDollar();                
            }
            
        //this will asked the user to exit or not
        else
        {
            //this will display a confirm dialog box
            int choice = JOptionPane.showConfirmDialog(null,"Do you really want to quit?","Exit",JOptionPane.YES_NO_OPTION);
            if(choice==0) {
                dispose();
                System.exit(0);
            }
        }
    }
}

    