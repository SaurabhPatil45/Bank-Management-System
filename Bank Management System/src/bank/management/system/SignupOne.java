
package bank.management.system;



import java.awt.*;
import javax.swing.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;


public class SignupOne extends JFrame implements ActionListener{
    long random;
    JTextField nameTF,fnameTF,emailTF,addressTF,cityTF,stateTF,pinTF;
    JButton next;
    JRadioButton malebutton,femalebutton, otherbutton,marriedbutton,umbutton;
    JDateChooser chooser;

    public SignupOne() {
        setLayout(null);
        
        Random ran=new Random();
         random=Math.abs((ran.nextLong()%9000L)+1000L);
        
        JLabel formno=new JLabel("APPLICATION FORM NO. "+ random);
        formno.setFont(new Font("Raleway",Font.BOLD,38) );
        formno.setBounds(140,20,600,40);
        add(formno);
        
        JLabel personalDetails=new JLabel("Page 1: Personal Details ");
        personalDetails.setFont(new Font("Raleway",Font.BOLD,22) );
       personalDetails.setBounds(280,80,400,30);
        add(personalDetails);
        
        JLabel name=new JLabel("Name: ");
        name.setFont(new Font("Raleway",Font.BOLD,20) );
        name.setBounds(100,140,100,30);
        add(name);
        
         nameTF=new JTextField();
        nameTF.setFont(new Font("Raleway",Font.BOLD,20));
        nameTF.setBounds(300,140,400,30);
        add(nameTF);
        
         JLabel Fname=new JLabel("Fathers Name: ");
        Fname.setFont(new Font("Raleway",Font.BOLD,20) );
        Fname.setBounds(100,190,200,30);
        add(Fname);
        
         fnameTF=new JTextField();
        fnameTF.setFont(new Font("Raleway",Font.BOLD,20));
        fnameTF.setBounds(300,190,400,30);
        add(fnameTF);
        
         JLabel dob=new JLabel("Date of Birth: ");
        dob.setFont(new Font("Raleway",Font.BOLD,20) );
        dob.setBounds(100,240,200,30);
        add(dob);
        
         chooser=new JDateChooser();  //added jar file of jcalender and also imported onr class
        chooser.setBounds(300,240,400,30);
        add(chooser);
        
         JLabel gender=new JLabel("Gender: ");
        gender.setFont(new Font("Raleway",Font.BOLD,20) );
        gender.setBounds(100,290,100,30);
        add(gender);
        
        malebutton=new JRadioButton("Male");
        malebutton.setBounds(300,290,60,30);
        malebutton.setBackground(Color.white);
        add(malebutton);
        
         femalebutton=new JRadioButton("Female");
        femalebutton.setBounds(450,290,120,30);
        femalebutton.setBackground(Color.white);
        add(femalebutton);
        
        otherbutton=new JRadioButton("Other");
        otherbutton.setBounds(630,290,120,30);
        otherbutton.setBackground(Color.white);
        add(otherbutton);
        
        ButtonGroup buttonGroup=new ButtonGroup();  //to choose one button at a time
        buttonGroup.add(malebutton);
        buttonGroup.add(femalebutton);
        buttonGroup.add(otherbutton);
        
        
        
        
        
         JLabel email=new JLabel("Email Address: ");
        email.setFont(new Font("Raleway",Font.BOLD,20) );
        email.setBounds(100,340,200,30);
        add(email);
        
          emailTF=new JTextField();
        emailTF.setFont(new Font("Raleway",Font.BOLD,20));
        emailTF.setBounds(300,340,400,30);
        add(emailTF);
        
         JLabel mStatus=new JLabel("Marital Status: ");
        mStatus.setFont(new Font("Raleway",Font.BOLD,20) );
        mStatus.setBounds(100,390,200,30);
        add(mStatus);
        
         marriedbutton=new JRadioButton("Married");
        marriedbutton.setBounds(300,390,100,30);
        marriedbutton.setBackground(Color.white);
        add(marriedbutton);
        
         umbutton=new JRadioButton("Unmarried");
        umbutton.setBounds(450,390,120,30);
        umbutton.setBackground(Color.white);
        add(umbutton);
        
        ButtonGroup buttonGroup1=new ButtonGroup();  //to choose one button at a time
        buttonGroup1.add(marriedbutton);
        buttonGroup1.add(umbutton);
        
        
        
        
         JLabel address=new JLabel("Address: ");
        address.setFont(new Font("Raleway",Font.BOLD,20) );
        address.setBounds(100,440,200,30);
        add(address);
        
          addressTF=new JTextField();
        addressTF.setFont(new Font("Raleway",Font.BOLD,20));
        addressTF.setBounds(300,440,400,30);
        add(addressTF);
        
         JLabel city=new JLabel("City: ");
        city.setFont(new Font("Raleway",Font.BOLD,20) );
        city.setBounds(100,490,200,30);
        add(city);
        
          cityTF=new JTextField();
        cityTF.setFont(new Font("Raleway",Font.BOLD,20));
        cityTF.setBounds(300,490,400,30);
        add(cityTF);
        
         JLabel state=new JLabel("State: ");
        state.setFont(new Font("Raleway",Font.BOLD,20) );
        state.setBounds(100,540,200,30);
        add(state);
        
          stateTF=new JTextField();
        stateTF.setFont(new Font("Raleway",Font.BOLD,20));
        stateTF.setBounds(300,540,400,30);
        add(stateTF);
        
         JLabel pincode=new JLabel("PIN Code: ");
        pincode.setFont(new Font("Raleway",Font.BOLD,20) );
        pincode.setBounds(100,590,200,30);
        add(pincode);
        
          pinTF=new JTextField();
        pinTF.setFont(new Font("Raleway",Font.BOLD,20));
        pinTF.setBounds(300,590,400,30);
        add(pinTF);
        
        next=new JButton("Next");
        next.setBackground(Color.black);
        next.setForeground(Color.white);
        next.setFont(new Font("Raleway",Font.BOLD,15));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);
        
        
        
        
        setSize(850,800);
        setLocation(350,50);
        setVisible(true);
        getContentPane().setBackground(Color.white);
    }
    public void actionPerformed(ActionEvent ae){ //by using this we are taking values which are entered by user
            String formno=""+ random;
            String name=nameTF.getText();
            String fname=fnameTF.getText();
            String dob=((JTextField)chooser.getDateEditor().getUiComponent()).getText();
            String gender=null;
            if(malebutton.isSelected()){
            gender="Male";
            }
            else if(femalebutton.isSelected()){
            gender="Female";
            }
            else{
            gender="Other";
            }
            
            String email=emailTF.getText();
            String marital=null;
            if(marriedbutton.isSelected()){
            marital="Married";
            }
            else{
            marital="Unmarried";
            }
            
            String address=addressTF.getText();
            String city=cityTF.getText();
            String state=stateTF.getText();
            String pin=pinTF.getText();
            
            try {
                if(name.equals("")){
                JOptionPane.showMessageDialog(null, "Name is required");
                }
                else{
                Conn c=new Conn();
                String query="insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+state+"','"+pin+"')";
                c.s.executeUpdate(query);
                    setVisible(false);
                    new SignupTwo(formno).setVisible(true);
                
                }
                
                if(fname.equals("")){
                    JOptionPane.showMessageDialog(null, "Fathers name is required");
                
                }
                
            
        } catch (Exception e) {
                System.out.println(e);
        }
            
            
            
            
                    
        }
        
    
    
    
    
    public static void main(String[] args) {
        new SignupOne();
    }
    
}
