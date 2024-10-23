package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener {
    JComboBox combobox , combobox2, combobox3, comboboxx,combobox4;
    JTextField pannumber, aadharnumber;
    String formno;
    JButton next;
    JRadioButton r1,r2,e1,e2;
    Signup2(String formno)
    {
        super("APPLICATION FORM");
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);

        this.formno=formno;
        JLabel l1=new JLabel("Page 2:-");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(300,30,600,40);
        add(l1);

        JLabel l2=new JLabel("Additional Details");
        l2.setBounds(300,60,600,40);
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        add(l2);

        JLabel l3=new JLabel(("Religion:"));
        l3.setFont(new Font("Raleway",Font.BOLD,18));
        l3.setBounds(100,120,100,30);
        add(l3);

        String religion[]={"Hindu","Muslim","Sikh","Christian","Other"};
        combobox=new JComboBox(religion);
        combobox.setBackground(new Color(252,208,76));
        combobox.setFont(new Font("Raleway",Font.BOLD,14));
        combobox.setBounds(350,120,320,30);
        add(combobox);

        JLabel l4 = new JLabel("Category :");
        l4.setBounds(100,170,100,30);
        l4.setFont(new Font("Raleway",Font.BOLD,18));
        add(l4);

        String category[]={"General","OBC","SC","ST","Other"};
        combobox2=new JComboBox(category);
        combobox2.setBackground(new Color(252,208,76));
        combobox2.setFont(new Font("Raleway",Font.BOLD,14));
        combobox2.setBounds(350,170,320,30);
        add(combobox2);

        JLabel l5= new JLabel("Income :");
        l5.setBounds(100,220,100,30);
        l5.setFont(new Font("Raleway",Font.BOLD,18));
        add(l5);

        String income[]={"Null","<1,50,000","<2,50,000","5,00,000","Upto 10,00,000","Above 10,00,000"};
        combobox3=new JComboBox(income);
        combobox3.setBackground(new Color(252,208,76));
        combobox3.setFont(new Font("Raleway",Font.BOLD,14));
        combobox3.setBounds(350,220,320,30);
        add(combobox3);

        JLabel l6= new JLabel("Education Qualification :");
        l6.setBounds(100,270,220,30);
        l6.setFont(new Font("Raleway",Font.BOLD,18));
        add(l6);

        String education[]={"Non- Graduate","Graduate","Post-Graduate","Other"};
        comboboxx=new JComboBox(education);
        comboboxx.setBackground(new Color(252,208,76));
        comboboxx.setFont(new Font("Raleway",Font.BOLD,14));
        comboboxx.setBounds(350,270,320,30);
        add(comboboxx);

        JLabel l7= new JLabel("Occupation :");
        l7.setBounds(100,320,220,30);
        l7.setFont(new Font("Raleway",Font.BOLD,18));
        add(l7);

        String occupation[]={"Salaried","Self-Employed","Business","Student"};
        combobox4=new JComboBox(occupation);
        combobox4.setBackground(new Color(252,208,76));
        combobox4.setFont(new Font("Raleway",Font.BOLD,14));
        combobox4.setBounds(350,320,320,30);
        add(combobox4);

        JLabel l8= new JLabel("PAN Number :");
        l8.setBounds(100,370,150,30);
        l8.setFont(new Font("Raleway",Font.BOLD,18));
        add(l8);

        pannumber = new JTextField("");
        pannumber.setBounds(350,370,300,30);
        pannumber.setFont(new Font("Raleway",Font.BOLD,30));
        add(pannumber);

        JLabel l9= new JLabel("Aadhar Number :");
        l9.setBounds(100,420,150,30);
        l9.setFont(new Font("Raleway",Font.BOLD,18));
        add(l9);

        aadharnumber = new JTextField("");
        aadharnumber.setBounds(350,420,300,30);
        aadharnumber.setFont(new Font("Raleway",Font.BOLD,30));
        add(aadharnumber);

        JLabel l10= new JLabel("Senior Citizen :");
        l10.setBounds(100,470,150,30);
        l10.setFont(new Font("Raleway",Font.BOLD,18));
        add(l10);

        r1=new JRadioButton("Yes");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBounds(350,470,100,30);
        r1.setBackground(new Color(252,208,76));
        add(r1);
        r2=new JRadioButton("No");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBounds(450,470,100,30);
        r2.setBackground(new Color(252,208,76));
        add(r2);
        ButtonGroup buttengroup1=new ButtonGroup();
        buttengroup1.add(r1);
        buttengroup1.add(r2);

        JLabel l11= new JLabel("Existing Account:");
        l11.setBounds(100,520,180,30);
        l11.setFont(new Font("Raleway",Font.BOLD,18));
        add(l11);

        e1=new JRadioButton("Yes");
        e1.setBounds(350,520,100,30);
        e1.setFont(new Font("Raleway",Font.BOLD,14));
        e1.setBackground(new Color(252,208,76));
        add(e1);
        e2=new JRadioButton("No");
        e2.setFont(new Font("Raleway",Font.BOLD,14));
        e2.setBounds(450,520,100,30);
        e2.setBackground(new Color(252,208,76));
        add(e2);
        ButtonGroup buttengroup2=new ButtonGroup();
        buttengroup2.add(e1);
        buttengroup2.add(e2);

    JLabel l12=new JLabel("Form no.");
    l12.setFont(new Font("Raleway",Font.BOLD,14));
    l12.setBounds(650,10,100,30);
    add(l12);
    JLabel l13=new JLabel(formno);
    l13.setFont(new Font("Raleway",Font.BOLD,14));
    l13.setBounds(710,10,100,30);
    add(l13);

    next= new JButton(("Next"));
    next.setFont(new Font("Raleway",Font.BOLD,14));
    next.setBounds(570,640,100,30);
    next.setForeground(Color.BLACK);
    next.setBackground(Color.WHITE);
    next.addActionListener(this);
    add(next);



        setLayout(null);
        setSize(850,750);
        setVisible(true);
        setLocation(450,80);
        getContentPane().setBackground(new Color(252,208,76));




    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String rel= (String) combobox.getSelectedItem();
        String cate=(String) combobox2.getSelectedItem();
        String inc= (String) combobox3.getSelectedItem();
        String edu=(String) comboboxx.getSelectedItem();
        String occ=(String) combobox4.getSelectedItem();

        String pan=(String) pannumber.getText();
        String aadhar=(String) aadharnumber.getText();

        String scitizen=null;
        if(r1.isSelected())
        {
            scitizen="yes";
        }
        else if(r2.isSelected())
        {
            scitizen="No";
        }
        String eaccount=null;
        if(e1.isSelected())
        {
           eaccount="yes";
        }
        else if(e2.isSelected())
        {
            eaccount="No";
        }
  try{
      if(pannumber.getText().equals("")|| aadharnumber.getText().equals(""))
      {
          JOptionPane.showMessageDialog(null,"Fill all the fields");
      }else {
          Con c1=new Con();
          String q="insert into SIGNUPTWO values('"+formno+"','"+rel+"','"+cate+"','"+inc+"','"+edu+"','"+occ+"','"+pan+"','"+aadhar+"','"+scitizen+"','"+eaccount+"')";
          c1.statement.executeUpdate(q);
          new Signup3(formno); //after submitting successfully signup3 page will get open and make this signup2 form disappear for that signup2 setvisibility is false.
          setVisible(false);
      }

  }catch(Exception E)
  {
      E.printStackTrace();
  }

    }

    public static void main(String args[])
    {
        new Signup2("");
    }
}
