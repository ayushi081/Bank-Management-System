package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.sql.*;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {
    JRadioButton r1,r2,r3,r4;
    JButton next;
    Random ran=new Random();
    long first4=(ran.nextLong() % 9000L) + 1000L;
    String first= " " + Math.abs(first4);
    JTextField textName,textfname,textemail ,textms,textadd ,textcity,textpin,textstate;
    JDateChooser dateChooser;


    Signup()
    {
        super("Application Form");
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        JLabel label1=new JLabel("APPLICATION FORM NO:" + first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Raleway",Font.BOLD,38));
        add(label1);

        JLabel label2=new JLabel("Page 1");
        label2.setFont(new Font("Raleway",Font.BOLD,22));
        label2.setBounds(330,70,600,30);
        add(label2);

        JLabel label3=new JLabel("Personal Details");
        label3.setFont(new Font("Raleway",Font.BOLD,22));
        label3.setBounds(290,90,600,30);
        add(label3);

        JLabel labelname=new JLabel("Name:");
        labelname.setFont(new Font("Raleway",Font.BOLD,20));
        labelname.setBounds(100,150,100,30);
        add(labelname);

        textName=new JTextField();
        textName.setFont(new Font("Raleway",Font.BOLD,14));
        textName.setBounds(300,150,400,30);
        add(textName);

        JLabel labelfname =new JLabel("Father's Name:");
        labelfname.setFont(new Font("Raleway",Font.BOLD,20));
        labelfname.setBounds(100,200,200,30);
        add(labelfname);

        textfname=new JTextField();
        textfname.setFont(new Font("Raleway",Font.BOLD,14));
        textfname.setBounds(300,200,400,30);
        add(textfname);

        JLabel dob=new JLabel("Date Of Birth");
        dob.setBounds(100,300,200,30);
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        add(dob);

        dateChooser=new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,300,400,30);
        add(dateChooser);

        JLabel labelG=new JLabel("Gender:");
        labelG.setFont(new Font("Raleway",Font.BOLD,20));
        labelG.setBounds(100,250,200,30);
        add(labelG);

        r1=new JRadioButton("Male");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBounds(300,250,60,30);
        r1.setBackground(new Color(222,255,228));
        add(r1);

        r2=new JRadioButton("Female");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBounds(450,250,90,30);
        r2.setBackground(new Color(222,255,228));
        add(r2);

ButtonGroup buttonGroup=new ButtonGroup();
buttonGroup.add(r1);
buttonGroup.add(r2);
JLabel labelemail=new JLabel("E-mail address:");
labelemail.setBounds(100,350,200,30);
labelemail.setFont(new Font("Raleway",Font.BOLD,20));
add(labelemail);

textemail=new JTextField();
textemail.setFont(new Font("Raleway",Font.BOLD,14));
textemail.setBounds(300,350,400,30);
add(textemail);

JLabel labelmarried=new JLabel("Married Status:");
labelmarried.setBounds(100,400,200,30);
labelmarried.setFont(new Font("Raleway",Font.BOLD,20));
add(labelmarried);

r3=new JRadioButton("Married");
r3.setFont(new Font("Raleway",Font.BOLD,14));
r3.setBounds(300,400,100,30);
        r3.setBackground(new Color(222,255,228));
add(r3);

        r4=new JRadioButton("Unmarried");
        r4.setFont(new Font("Raleway",Font.BOLD,14));
        r4.setBounds(450,400,200,30);
        r4.setBackground(new Color(222,255,228));
        add(r4);

        ButtonGroup buttonGroup1=new ButtonGroup();
        buttonGroup1.add(r3);
        buttonGroup1.add(r4);

        JLabel labeladdress=new JLabel("Address:");
        labeladdress.setBounds(100,450,200,30);
        labeladdress.setFont(new Font("Raleway",Font.BOLD,20));
        add(labeladdress);

        textadd=new JTextField();
        textadd.setFont(new Font("Raleway",Font.BOLD,14));
        textadd.setBounds(300,450,400,30);
        add(textadd);

        JLabel labelcity=new JLabel("City:");
        labelcity.setBounds(100,500,200,30);
        labelcity.setFont(new Font("Raleway",Font.BOLD,20));
        add(labelcity);

        textcity=new JTextField();
        textcity.setFont(new Font("Raleway",Font.BOLD,14));
        textcity.setBounds(300,500,400,30);
        add(textcity);

        JLabel labelpin=new JLabel("Pin Code:");
        labelpin.setBounds(100,550,200,30);
        labelpin.setFont(new Font("Raleway",Font.BOLD,20));
        add(labelpin);

        textpin=new JTextField();
        textpin.setFont(new Font("Raleway",Font.BOLD,14));
        textpin.setBounds(300,550,400,30);
        add(textpin);

        JLabel labelstate=new JLabel("State:");
        labelstate.setBounds(100,600,200,30);
        labelstate.setFont(new Font("Raleway",Font.BOLD,20));
        add(labelstate);

        textstate=new JTextField();
        textstate.setFont(new Font("Raleway",Font.BOLD,14));
        textstate.setBounds(300,600,400,30);
        add(textstate);

next=new JButton("Next:");
next.setFont(new Font("Raleway",Font.BOLD,14));
next.setBounds(620,650,80,30);
next.setBackground(Color.BLACK);
next.setForeground(Color.WHITE);
next.addActionListener(this);
add(next);



        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
     String formno=first;
     String name=textName.getText();
     String fname=textfname.getText();
     String dob=((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
     String gender=null;
     if(r1.isSelected())
     {
         gender="Male";
     }
     else if(r2.isSelected())
     {
         gender="Female";
     }
     String email=textemail.getText();
     String marital=null;
     if(r3.isSelected())
     {
         marital="Married";
     }
     else if(r4.isSelected())
     {
         marital="Unmarried";
     }
     String address= textadd.getText();
     String city=textcity.getText();
     String pincode=textpin.getText();
     String state=textstate.getText();
     try
     {
         if(textName.getText().equals(""))
         {
             JOptionPane.showMessageDialog(null,"Fill all the details");
         }
         else {
             Con con1= new Con();
             String q="insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
             con1.statement.executeUpdate(q);
             new Signup2(formno);
             setVisible(false);
         }
     }catch(Exception E)
     {
         E.printStackTrace();
     }

    }

    public static void main(String args[])
    {
        new Signup();
    }
}
