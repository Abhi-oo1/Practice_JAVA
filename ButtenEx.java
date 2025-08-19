import javax.swing.*;
import java.awt.event.*;
class ButtenEx{
    public static void main(String[] args) {
        JFrame  frame= new JFrame("My button Application");
        frame.setSize(400,400);
        JTextField t=new JTextField();
        t.setBounds(150, 30, 70, 20);
        frame.add(t);
        JTextField t2=new JTextField();
        t2.setBounds(150, 60, 70, 20);
        frame.add(t2);
        JLabel l = new JLabel("Result:");
        l.setBounds(150, 120, 100, 20);
        frame.add(l);
        JButton b1=new JButton("Sum");
        b1.setBounds(150, 90, 70, 20);
        frame.add(b1);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                try{
                    double n1=Double.parseDouble(t.getText());
                    double n2=Double.parseDouble(t2.getText());
                    double sum=n1+n2;
                    l.setText("Result: "+sum);
                }
                catch(NumberFormatException ex)
                {
                    l.setText("Invalid Inputs");
                }
            }
        });
        frame.setLayout(null);
        frame.setVisible(true);
    }
}