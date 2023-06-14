

package bank.management.system;



import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class SignupTwo extends JFrame implements ActionListener{
   
    JTextField pan,adhar;
    JButton next;
    JRadioButton syes,sno,eyes,eno;
    
    JComboBox religionJCB,catagoryJCB,incomeJCB,educationJCB,occupationJCB;
    String formno;

    public SignupTwo(String formno) {
        setLayout(null);
        this.formno=formno;
       
        
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
        JLabel additionalDetails=new JLabel("Page 2: Additional Details ");
        additionalDetails.setFont(new Font("Raleway",Font.BOLD,22) );
       additionalDetails.setBounds(280,80,400,30);
        add(additionalDetails);
        
        JLabel religion=new JLabel("Religion: ");
        religion.setFont(new Font("Raleway",Font.BOLD,20) );
        religion.setBounds(100,140,100,30);
        add(religion);
        
        String valReligion[]={"Hindu","Muslim","sikh","Other"};
        religionJCB=new JComboBox(valReligion);
        religionJCB.setFont(new Font("Raleway",Font.PLAIN,20));
        religionJCB.setBounds(300,140,400,30);
        religionJCB.setBackground(Color.white);
        add(religionJCB);
        
        
        
         JLabel category=new JLabel("Category: ");
        category.setFont(new Font("Raleway",Font.BOLD,20) );
        category.setBounds(100,190,200,30);
        add(category);
        
        String valCatagory[]={"General","OBC","SC","ST","Other"};
         catagoryJCB=new JComboBox(valCatagory);        
        catagoryJCB.setFont(new Font("Raleway",Font.PLAIN,20));
        catagoryJCB.setBounds(300,190,400,30);
        add(catagoryJCB);
        
        
        
        
         JLabel income=new JLabel("Income: ");
        income.setFont(new Font("Raleway",Font.BOLD,20) );
        income.setBounds(100,240,200,30);
        add(income);
        
        String valIncome[]={"Null","<1,50,000","< 2,50,000","< 5,00,000","<10,00,000"};
         incomeJCB=new JComboBox(valIncome);
        incomeJCB.setFont(new Font("Raleway",Font.PLAIN,20) );
        incomeJCB.setBounds(300,240,400,30);
        incomeJCB.setBackground(Color.white);
        add(incomeJCB);
        
        
        
        
        
        
        
         JLabel education=new JLabel("Educationl ");
        education.setFont(new Font("Raleway",Font.BOLD,20) );
        education.setBounds(100,290,120,30);
        add(education);
        
         JLabel qualification=new JLabel("Qualification: ");
       qualification.setFont(new Font("Raleway",Font.BOLD,20) );
       qualification.setBounds(100,315,200,30);
        add(qualification);
        
        String valeducation[]={"Non-Graduation","Graduation","Post-Graduation","Others"};
        educationJCB=new JComboBox(valeducation);
       educationJCB.setFont(new Font("Raleway",Font.PLAIN,20));
       educationJCB.setBackground(Color.white);
        educationJCB.setBounds(300,305,400,30);
        add(educationJCB);
        
        
        
        
        
        
        
        
        
         JLabel occupation=new JLabel("Occupation: ");
       occupation.setFont(new Font("Raleway",Font.BOLD,20) );
        occupation.setBounds(100,390,200,30);
        add(occupation);
        
         String valoccupation[]={"Employee","Bussiness-Man","Farmer","Student","Other"};
         occupationJCB=new JComboBox(valoccupation);
       occupationJCB.setFont(new Font("Raleway",Font.PLAIN,20));
       occupationJCB.setBackground(Color.white);
        occupationJCB.setBounds(300,390,400,30);
        add(occupationJCB);
        
        
        
        
        
        
         JLabel pannumber=new JLabel("PAN Number: ");
        pannumber.setFont(new Font("Raleway",Font.BOLD,20) );
        pannumber.setBounds(100,440,200,30);
        add(pannumber);
        
          pan=new JTextField();
        pan.setFont(new Font("Raleway",Font.BOLD,20));
        pan.setBounds(300,440,400,30);
        add(pan);
        
         JLabel adharno=new JLabel("Aadhar Number: ");
        adharno.setFont(new Font("Raleway",Font.BOLD,20) );
        adharno.setBounds(100,490,200,30);
        add(adharno);
        
          adhar=new JTextField();
        adhar.setFont(new Font("Raleway",Font.BOLD,20));
        adhar.setBounds(300,490,400,30);
        add(adhar);
        
         JLabel scitizen=new JLabel("Senior Citizen: ");
        scitizen.setFont(new Font("Raleway",Font.BOLD,20) );
        scitizen.setBounds(100,540,200,30);
        add(scitizen);
        
          syes=new JRadioButton("Yes");
          syes.setBounds(300,540,100,30);
          syes.setBackground(Color.WHITE);
          add(syes);
          
          sno=new JRadioButton("No");
          sno.setBounds(500,540,100,30);
          sno.setBackground(Color.white);
          add(sno);
          
          ButtonGroup group=new ButtonGroup();
          group.add(syes);
          group.add(sno);
          
          
        
         JLabel exAccount=new JLabel("Exisiting Account: ");
        exAccount.setFont(new Font("Raleway",Font.BOLD,20) );
        exAccount.setBounds(100,590,200,30);
        add(exAccount);
        
         eyes=new JRadioButton("Yes");
          eyes.setBounds(300,590,100,30);
          eyes.setBackground(Color.WHITE);
          add(eyes);
          
          eno=new JRadioButton("No");
          eno.setBounds(500,590,100,30);
          eno.setBackground(Color.white);
          add(eno);
          
          ButtonGroup group1=new ButtonGroup();
          group1.add(eyes);
          group1.add(eno);
        
          
        
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
           
            String religion=(String)religionJCB.getSelectedItem();
            String catagory=(String)catagoryJCB.getSelectedItem();
            String income=(String)incomeJCB.getSelectedItem();
            String education=(String)educationJCB.getSelectedItem();
            String occupation=(String)occupationJCB.getSelectedItem();
            
            String seniorcitizen=null;
            if(syes.isSelected()){
            seniorcitizen="Yes";
            }
            else if(sno.isSelected()){
            seniorcitizen="No";
            }
            
          
            String existingAccount=null;
            if(eyes.isSelected()){
            existingAccount="Yes";
            }
            else{
            existingAccount="No";
            }
            
            String span=pan.getText();
            String saadhar=adhar.getText();
                       
            try {
                
                Conn c=new Conn();
                String query="insert into signuptwo values('"+formno+"','"+religion+"','"+catagory+"','"+income+"','"+education+"','"+occupation+"','"+span+"','"+saadhar+"','"+seniorcitizen+"','"+existingAccount+"')";
                c.s.executeUpdate(query);
                
                setVisible(false);
                new SignupThree(formno).setVisible(true);
                
                
                
               
                }
                
            
         catch (Exception e) {
                System.out.println(e);
        }
            }
            
  
            
    public static void main(String[] args) {
        new SignupTwo("");
    }        
                    
        }
        
    
    
    
    
    
    
