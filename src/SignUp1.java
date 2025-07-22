import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class SignUp1 extends JFrame {
    JTextField nametf,fnametf,emailtf,addtf,citytf,statetf,pinctf;
    SignUp1(){
        setVisible(true);
        setLayout(null);
        ImageIcon icon= new ImageIcon(ClassLoader.getSystemResource("images/bank.jpg"));
        Image i= icon.getImage();
        setIconImage(i);
        setTitle("SIGN UP");
        // FORM NO.
        Random ran =new Random();
        JLabel formNo=new JLabel("APPLICATION FORM NO:"+Math.abs(ran.nextInt()%9000));
        formNo.setFont(new Font("Raleway",Font.BOLD,40));
        formNo.setBounds(140,10,600,40);
        add(formNo);
        //PERSONAL DETAILS
        JLabel pd=new JLabel("PAGE 1: PERSONAL DETAILS ");
        pd.setFont(new Font("Raleway",Font.BOLD,22));
        pd.setBounds(290,60,400,40);
        add(pd);

        JLabel name=new JLabel("Name: ");
        name.setFont(new Font("Raleway",Font.BOLD,16));
        name.setBounds(140,130,400,40);
        add(name);
        nametf= new JTextField();
        nametf.setFont(new Font("Osward",Font.BOLD,16));
        nametf.setBounds(280,130,350,30);
        add(nametf);

        JLabel fname =new JLabel("Father's Name: ");
        fname.setFont(new Font("Raleway",Font.BOLD,16));
        fname.setBounds(140,180,400,40);
        add(fname);
        fnametf= new JTextField();
        fnametf.setFont(new Font("Osward",Font.BOLD,16));
        fnametf.setBounds(280,180,350,30);
        add(fnametf);


        JLabel dob =new JLabel("Date of Birth: ");
        dob.setFont(new Font("Raleway",Font.BOLD,16));
        dob.setBounds(140,250,400,40);
        add(dob);
        JDateChooser date= new JDateChooser();
        date.setBounds(280,250,200,30);
        date.setForeground(Color.BLACK);
        add(date);

        JLabel gender =new JLabel("Gender: ");
        gender.setFont(new Font("Raleway",Font.BOLD,16));
        gender.setBounds(140,300,400,40);
        add(gender);
        JRadioButton female= new JRadioButton("Female");
        female.setBounds(280,300,100,40);
        add(female);
        JRadioButton male= new JRadioButton("Male");
        male.setBounds(400,300,100,40);
        add(male);
        ButtonGroup genders= new ButtonGroup();
        genders.add(male);
        genders.add(female);

        JLabel email =new JLabel("Email Address: ");
        email.setFont(new Font("Raleway",Font.BOLD,16));
        email.setBounds(140,350,400,40);
        add(email);
        emailtf= new JTextField();
        emailtf.setFont(new Font("Osward",Font.BOLD,16));
        emailtf.setBounds(280,350,350,30);
        add(emailtf);

        JLabel mar =new JLabel("Marital Status: ");
        mar.setFont(new Font("Raleway",Font.BOLD,16));
        mar.setBounds(140,400,400,40);
        add(mar);

        JRadioButton married= new JRadioButton("Married");
        married.setBounds(280,400,100,40);
        add(married);
        JRadioButton single =new JRadioButton("Single");
        single.setBounds(400,400,100,40);
        add(single);
        JRadioButton other =new JRadioButton("Other");
        other.setBounds(520,400,100,40);
        add(other);
        ButtonGroup marital = new ButtonGroup();
        marital.add(married);
        marital.add(single);
        marital.add(other);


        JLabel address =new JLabel("Address: ");
        address.setFont(new Font("Raleway",Font.BOLD,16));
        address.setBounds(140,450,400,40);
        add(address);
        addtf= new JTextField();
        addtf.setFont(new Font("Osward",Font.BOLD,16));
        addtf.setBounds(280,450,350,30);
        add(addtf);

        JLabel city =new JLabel("City: ");
        city.setFont(new Font("Raleway",Font.BOLD,16));
        city.setBounds(140,500,400,40);
        add(city);
        citytf= new JTextField();
        citytf.setFont(new Font("Osward",Font.BOLD,16));
        citytf.setBounds(280,500,350,30);
        add(citytf);

        JLabel state =new JLabel("State: ");
        state.setFont(new Font("Raleway",Font.BOLD,16));
        state.setBounds(140,550,400,40);
        add(state);
        statetf= new JTextField();
        statetf.setFont(new Font("Osward",Font.BOLD,16));
        statetf.setBounds(280,550,350,30);
        add(statetf);

        JLabel pincode =new JLabel("Pin Code: ");
        pincode.setFont(new Font("Raleway",Font.BOLD,16));
        pincode.setBounds(140,600,400,40);
        add(pincode);
        pinctf= new JTextField();
        pinctf.setFont(new Font("Osward",Font.BOLD,16));
        pinctf.setBounds(280,600,350,30);
        add(pinctf);

        JButton next= new JButton("Next");
        next.setBackground(Color.darkGray);
        next.setForeground(Color.white);
        next.setBounds(530,650,100,50);
        add(next);

        setSize(850,800);
        setLocation(350,10);
        setBackground(Color.white);

    }
    public static void main(String[] args) {
        new SignUp1();
    }
}
