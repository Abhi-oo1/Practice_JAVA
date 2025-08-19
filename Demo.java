import javax.swing.*;
class Demo
	{
	public static void main(String[] args)
	{
		JFrame a=new JFrame("Word Finder");
		a.setSize(300,150);
        JLabel l=new JLabel("Word: ");
        l.setBounds(30,30 , 50, 20);
        a.add(l);
        JTextField t=new JTextField();
        t.setBounds(80, 30, 150, 20);
        a.add(t);
        JButton button=new JButton("Find Word");
        button.setBounds(75,70 , 150, 30);
        a.add(button);
        a.setLayout(null);
		a.setVisible(true);
		System.out.println("Task Completed");
	}
}
		