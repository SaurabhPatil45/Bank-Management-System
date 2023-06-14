
package bank.management.system;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Transaction extends JFrame implements ActionListener{

    JButton deposite, withdraw,fcash,statement,pinchange,inquriy,exit;
    String pinnumber;
    public Transaction(String pinnumber)  {
        this.pinnumber=pinnumber;
        
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        
        JLabel text=new JLabel("Please select your Transaction");
        text.setBounds(215,300,700,35);
        text.setForeground(Color.white);
        text.setFont(new Font("System",Font.BOLD,17));
        image.add(text); //to get text on the image
        
        
         deposite=new JButton("Deposite");
        deposite.setBounds(170,415,150,30);
        deposite.addActionListener(this);
        image.add(deposite);
        
         withdraw=new JButton("Cash Withdrawl");
        withdraw.setBounds(355,415,150,30);
        withdraw.addActionListener(this);
        image.add(withdraw);
        
         fcash=new JButton("Fast Cash");
        fcash.setBounds(170,450,150,30);
        fcash.addActionListener(this);
        image.add(fcash);
        
         statement=new JButton("Mini Statement");
        statement.setBounds(355,450,150,30);
        statement.addActionListener(this);
        image.add(statement);
        
         pinchange=new JButton("PIN Change");
        pinchange.setBounds(170,485,150,30);
        pinchange.addActionListener(this);
        image.add(pinchange);
        
        inquriy=new JButton("Balance Inquriy");
        inquriy.setBounds(355,485,150,30);
        inquriy.addActionListener(this);
        image.add(inquriy);
        
         exit=new JButton("Exit");
        exit.setBounds(355,520,150,30);
        exit.addActionListener(this);
        image.add(exit);
        
        
        
        
        
        setSize(900,900);
        setLocation(300,0);
       // setUndecorated(true);
        setVisible(true);
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==exit){
        System.exit(0);//to close frame
        }
        else if(ae.getSource()==deposite){
            setVisible(false);
            new Deposite(pinnumber).setVisible(true);
        }
        else if(ae.getSource()==withdraw){
            setVisible(false);
            new Withdraw(pinnumber).setVisible(true);
        }
        else if(ae.getSource()==fcash){
            setVisible(false);
            new FastCash(pinnumber).setVisible(true);
        }
        else if(ae.getSource()==pinchange){
            setVisible(false);
            new PinChange(pinnumber).setVisible(true);
        
        }
        else if(ae.getSource()==inquriy){
            setVisible(false);
            new BalanceEnquiry(pinnumber).setVisible(true);
        }
        else if(ae.getSource()==statement){
            
            new MiniStatement(pinnumber).setVisible(true);
        }
    
    }
    
    
    public static void main(String[] args) {
        new Transaction("");
        
    }
    
}
