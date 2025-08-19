import javax.swing.*;
class login {
    public static void main(String[] args) {
        JFrame F=new JFrame("Login Page");
        F.setSize(500,300);
        JLabel l=new JLabel("LOGIN");
        l.setBounds(200, 30, 50, 20);
        F.add(l);
        JLabel U=new JLabel("Username ");
        U.setBounds(120, 70, 80, 20);
        F.add(U);
        JTextField ut=new JTextField();
        ut.setBounds(220, 70, 150, 20);
        F.add(ut);
        JLabel P=new JLabel("Password ");
        P.setBounds(120, 100, 80, 20);
        F.add(P);
        JTextField pt=new JTextField();
        pt.setBounds(220, 100, 150, 20);
        F.add(pt);
        JButton B=new JButton("Login");
        B.setBounds(250, 130, 80, 20);
        F.add(B);
        F.setLayout(null);
        F.setVisible(true);
    }
}