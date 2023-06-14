
package bank.management.system;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;


public class FastCash extends JFrame implements ActionListener{

    JButton deposite, withdraw,fcash,statement,pinchange,inquriy,exit;
    String pinnumber;
    public FastCash(String pinnumber)  {
        this.pinnumber=pinnumber;
        
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        
        JLabel text=new JLabel("Select withdrawl amount");
        text.setBounds(215,300,700,35);
        text.setForeground(Color.white);
        text.setFont(new Font("System",Font.BOLD,17));
        image.add(text); //to get text on the image
        
        
         deposite=new JButton("Rs 1000");
        deposite.setBounds(170,415,150,30);
        deposite.addActionListener(this);
        image.add(deposite);
        
         withdraw=new JButton("Rs 2000");
        withdraw.setBounds(355,415,150,30);
        withdraw.addActionListener(this);
        image.add(withdraw);
        
         fcash=new JButton("Rs 5000");
        fcash.setBounds(170,450,150,30);
        fcash.addActionListener(this);
        image.add(fcash);
        
         statement=new JButton("Rs 7000");
        statement.setBounds(355,450,150,30);
        statement.addActionListener(this);
        image.add(statement);
        
         pinchange=new JButton("Rs 9000");
        pinchange.setBounds(170,485,150,30);
        pinchange.addActionListener(this);
        image.add(pinchange);
        
        inquriy=new JButton("Rs 10000");
        inquriy.setBounds(355,485,150,30);
        inquriy.addActionListener(this);
        image.add(inquriy);
        
         exit=new JButton("Back");
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
            setVisible(false);
            new Transaction(pinnumber).setVisible(true);
        }
        else {
           String amount=((JButton)ae.getSource()).getText().substring(3);//to get text
           Conn c=new Conn();
            try {
                ResultSet rs=c.s.executeQuery("select * from bank where pin= '"+pinnumber+"'");
                int balance=0;
                while(rs.next()){
                if(rs.getString("type").equals("Deposite")){
                balance+=Integer.parseInt(rs.getString("amount"));
                }
                else{
                balance-=Integer.parseInt(rs.getString("amount"));
                }
                }
                
              if(ae.getSource()!=exit && balance<Integer.parseInt(amount)){
              JOptionPane.showMessageDialog(null, "Insufficient Balance");
              return;
              } 
              
              Date date=new Date();
              String query="insert into bank values ('"+pinnumber+"','"+date+"','withdrawl','"+amount+"')";
              c.s.executeUpdate(query);
              JOptionPane.showMessageDialog(null, "Rs "+ amount + " Debited Successfully");
              
                setVisible(false);
                new Transaction(pinnumber).setVisible(true);
           } catch (Exception e) {
                System.out.println(e);
            }
        }
        
    
    }
    
    
    public static void main(String[] args) {
        new FastCash("");
        
    }
    
}

