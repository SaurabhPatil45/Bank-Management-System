
package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;


public class SignupThree extends JFrame implements ActionListener{
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit,cancel;
    String formno;

    public SignupThree(String formno) {
        this.formno=formno;
        
        setLayout(null);
        
        JLabel label=new JLabel("Page 3 : Account Details");
        label.setFont(new Font("Raleway",Font.BOLD,22));
        label.setBounds(280,40,400,40);
        add(label);
        
        
        
         JLabel type=new JLabel(" Account Type:");
        type.setFont(new Font("Raleway",Font.BOLD,22));
        type.setBounds(100,140,200,30);
        add(type);
        
       r1=new JRadioButton("Saving Account");
       r1.setFont(new Font("Raleway",Font.BOLD,16));
       r1.setBackground(Color.white);
       r1.setBounds(100,180,150,20);
       add(r1);
       
       r2=new JRadioButton("Fixed Deposite Account");
       r2.setFont(new Font("Raleway",Font.BOLD,16));
       r2.setBackground(Color.white);
       r2.setBounds(400,180,250,20);
       add(r2);
       
       r3=new JRadioButton("Currrent Account");
       r3.setFont(new Font("Raleway",Font.BOLD,16));
       r3.setBackground(Color.white);
       r3.setBounds(100,220,170,20);
       add(r3);
       
       r4=new JRadioButton("Recurring Deposite Account");
       r4.setFont(new Font("Raleway",Font.BOLD,16));
       r4.setBackground(Color.white);
       r4.setBounds(400,220,250,20);
       add(r4);
       
       ButtonGroup group=new ButtonGroup();
       group.add(r1);
       group.add(r2);
       group.add(r3);
       group.add(r4);
       
       
       
       
       
       
        JLabel card=new JLabel(" Card Number:");
        card.setFont(new Font("Raleway",Font.BOLD,22));
        card.setBounds(100,300,200,30);
        add(card);
        
        
        JLabel number=new JLabel(" XXXX-XXXX-XXXX-4154");
        number.setFont(new Font("Raleway",Font.BOLD,22));
        number.setBounds(330,300,300,30);
        add(number);
        
        JLabel cdetail=new JLabel(" Your 16 Digit Card Number");
       cdetail.setFont(new Font("Raleway",Font.BOLD,12));
        cdetail.setBounds(100,330,300,20);
        add(cdetail);
        
        
        
        
        
        
        
        
         JLabel pin=new JLabel(" PIN:");
        pin.setFont(new Font("Raleway",Font.BOLD,22));
        pin.setBounds(100,370,200,30);
        add(pin);
        
        
        JLabel pnumber=new JLabel(" XXXX");
        pnumber.setFont(new Font("Raleway",Font.BOLD,22));
        pnumber.setBounds(330,370,300,30);
        add(pnumber);
        
        JLabel pdetail=new JLabel(" Your 4 Digit PIN");
       pdetail.setFont(new Font("Raleway",Font.BOLD,12));
        pdetail.setBounds(100,400,300,20);
        add(pdetail);
        
        
        
        
        
        
        JLabel service=new JLabel(" Services Required:");
        service.setFont(new Font("Raleway",Font.BOLD,22));
        service.setBounds(100,450,400,22);
        add(service);
        
        c1=new JCheckBox("ATM Card");
        c1.setBackground(Color.white);
        c1.setFont(new Font("Raleway",Font.BOLD,16));
        c1.setBounds(100,500,200,30);
        add(c1);
        
        c2=new JCheckBox("Internet Banking");
        c2.setBackground(Color.white);
        c2.setFont(new Font("Raleway",Font.BOLD,16));
        c2.setBounds(350,500,200,30);
        add(c2);
        
        c3=new JCheckBox("Mobile Banking");
        c3.setBackground(Color.white);
        c3.setFont(new Font("Raleway",Font.BOLD,16));
        c3.setBounds(100,550,200,30);
        add(c3);
        
        c4=new JCheckBox("Email and SMS Alerts");
        c4.setBackground(Color.white);
        c4.setFont(new Font("Raleway",Font.BOLD,16));
        c4.setBounds(350,500,200,30);
        add(c4);
        
        c5=new JCheckBox("Cheque Book");
        c5.setBackground(Color.white);
        c5.setFont(new Font("Raleway",Font.BOLD,16));
        c5.setBounds(100,600,200,30);
        add(c5);
        
        c6=new JCheckBox("E-Statement");
        c6.setBackground(Color.white);
        c6.setFont(new Font("Raleway",Font.BOLD,16));
        c6.setBounds(350,600,200,30);
        add(c6);
        
        c7=new JCheckBox("I hereby declares that the above entered details are correct to the best of my knowledge. ");
        c7.setBackground(Color.white);
        c7.setFont(new Font("Raleway",Font.BOLD,12));
        c7.setBounds(100,680,600,30);
        add(c7);
        
        
        submit=new JButton("Submit");
        submit.setBackground(Color.black);
        submit.setForeground(Color.white);
        submit.setFont(new Font("Raleway",Font.BOLD,14));
        submit.setBounds(250,720,100,30);
        submit.addActionListener(this);
        add(submit);
        
        cancel=new JButton("Cancel");
        cancel.setBackground(Color.black);
        cancel.setForeground(Color.white);
        cancel.setFont(new Font("Raleway",Font.BOLD,14));
        cancel.setBounds(420,720,100,30);
        cancel.addActionListener(this);
        add(cancel);
        
        
        
        getContentPane().setBackground(Color.white);
        
        
        
        
        
       
        
        
        
        
        
        setSize(850,820);
        setLocation(350,0);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==submit){
          String accountType=null;
          if(r1.isSelected()){
          accountType="Saving Account";
          }
          else if(r2.isSelected()){
          accountType="Fixed Deposite Account";
          }
          else if(r3.isSelected()){
          accountType="Current Account";
            }
          else if(r4.isSelected()){
          accountType="Reccuring Deposite Account";
          
          }
          
          Random random=new Random();
          String cardNumber=""+Math.abs((random.nextLong()%90000000L)+5060948000000000L);
        
          String pin=""+Math.abs((random.nextLong()%9000L)+1000L);
          
          
          String facility="";
          if(c1.isSelected()){
          facility+=" ATM Card";
          }
          else if(c2.isSelected()){
          facility+=" Internet Banking";
          }
          else if(c3.isSelected()){
          facility+=" Mobile Banking";
          }
          else if(c4.isSelected()){
          facility+=" Email and SMS Alerts";
          }
          else if(c5.isSelected()){
              facility+=" Cheque Book";
          
          }
          else if(c6.isSelected()){
              facility+=" E-Statement";
          
          }
          
          
            try {
                if(accountType.equals("")){
                JOptionPane.showMessageDialog(null, "Account Type is Required");
                }
                else{
                Conn conn=new Conn();
                String query="insert into signupThree values ('"+formno+"','"+accountType+"','"+cardNumber+"','"+pin+"','"+facility+"')";
                String qurey2="insert into login values ('"+formno+"','"+cardNumber+"','"+pin+"') ";
                conn.s.executeUpdate(query);
                conn.s.executeUpdate(qurey2);
                
                JOptionPane.showMessageDialog(null, "Card number: "+cardNumber+ "\n PIN: "+ pin);
                    setVisible(false);
                    new Deposite(pin).setVisible(false);
                
                
                }
                
                
            } catch (Exception e) {
                System.out.println(e);
            }
          
          
        }else if(ae.getSource()==cancel){
            setVisible(false);
            new Login().setVisible(true);
            
        
        }
    
    }
    
    
    public static void main(String[] args) {
        new SignupThree("");
    }
    
}
