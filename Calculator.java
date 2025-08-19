import javax.swing.*;
import java.awt.event.*;
class Calculator {
    public static void main(String[] args) {
        JFrame F=new JFrame("Calulator");
        F.setSize(700,300);
        JLabel l1=new JLabel("Calulator");
        l1.setBounds(350, 30, 90, 20);
        F.add(l1);
        JLabel U=new JLabel("Enter Number");
        U.setBounds(270, 70, 120, 20);
        F.add(U);
        JTextField ut=new JTextField();
        ut.setBounds(370, 70, 80, 20);
        F.add(ut);
        JLabel P=new JLabel("Enter Number");
        P.setBounds(270, 100, 120, 20);
        F.add(P);
        JTextField pt=new JTextField();
        pt.setBounds(370, 100, 80, 20);
        F.add(pt);
        JButton Add=new JButton("Add");
        Add.setBounds(270, 130, 80, 20);
        F.add(Add);
        JButton Sub=new JButton("sub");
        Sub.setBounds(370, 130, 80, 20);
        F.add(Sub);
        JLabel l = new JLabel("Result:");
        l.setBounds(270, 150, 100, 20);
        F.add(l);
        Add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                try{
                    double n1=Double.parseDouble(ut.getText());
                    double n2=Double.parseDouble(pt.getText());
                    double sum=n1+n2;
                    l.setText("Result: "+sum);
                }
                catch(NumberFormatException ex)
                {
                    l.setText("Invalid Inputs");
                }
            }
        });
        Sub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                try{
                    double n1=Double.parseDouble(ut.getText());
                    double n2=Double.parseDouble(pt.getText());
                    double Sub=n1-n2;
                    l.setText("Result: "+Sub);
                }
                catch(NumberFormatException ex)
                {
                    l.setText("Invalid Inputs");
                }
            }
        });
        F.setLayout(null);
        F.setVisible(true);
    }
}