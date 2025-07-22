import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
    JButton b1,signup,clear;
    JTextField cardtf;
    JPasswordField pintf;

    Login()
    {
        setLayout(null);
        setTitle("ATM");
        //window icon
        ImageIcon icon= new ImageIcon(ClassLoader.getSystemResource("images/bank.jpg"));
        Image i= icon.getImage();
        setIconImage(i);
        //LOGO
        ImageIcon atm= new ImageIcon(ClassLoader.getSystemResource("images/2830284.png"));
        Image atm1=atm.getImage().getScaledInstance(100,100, Image.SCALE_SMOOTH);
        ImageIcon atm3= new ImageIcon(atm1);
        // cannot add image directly to frame use Imageicon
        JLabel label= new JLabel(atm3);
        label.setBounds(70,10,100,100);
        add(label);

        //adding text
        JLabel intro= new JLabel("Welcome to ATM");
        add(intro);
        intro.setBounds(200,60,400,40);
        intro.setFont(new Font("Osward",Font.BOLD,16));

        //card and pin

        JLabel cardNumber= new JLabel("Enter Card Number:");
        add(cardNumber);
        cardNumber.setBounds(150,150,400,40);
        cardNumber.setFont(new Font("Raleway",Font.BOLD,16));

        //pin
        JLabel pin= new JLabel("Enter PIN:");
        add(pin);
        pin.setBounds(150,200,400,40);
        pin.setFont(new Font("Raleway",Font.BOLD,16));

        //card and pin textfield
        cardtf=new JTextField();
        cardtf.setBounds(310,160,250,30);
        cardtf.setFont(new Font("Raleway",Font.BOLD,14));
        add(cardtf);
        pintf =new JPasswordField();
        pintf.setFont(new Font("Raleway",Font.BOLD,14));
        pintf.setBounds(310,210,250,30);
        add(pintf);

        //buttons
        b1=new JButton("LOGIN");
        b1.setBounds(310,260,100,30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.white);
        b1.addActionListener(this );
        add(b1);

        clear=new JButton("CLEAR");
        clear.setBounds(440,260,100,30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.white);
        clear.addActionListener(this);
        add(clear);

        signup=new JButton("SIGNUP");
        signup.setBounds(310,300,230,30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.white);
        signup.addActionListener(this);
        add(signup);

        //not defined locally to use in action listener

        //frame
        getContentPane().setBackground(Color.white);
        setSize(800,400);
        setVisible(true);
        setLocation(350,200);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==clear)
        {
            pintf.setText("");
            cardtf.setText("");
        } else if (e.getSource()==b1) {
            
        } else if (e.getSource()==signup) {
            
        }
    }
    public static void main(String[] args) {
        new Login();
    }
}