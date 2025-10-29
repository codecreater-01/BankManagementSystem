import java.awt.*;
import java.awt.event.*;
public class personal_detail implements ActionListener{
    Button b0;
    Label l1,l2,l3,l4,l5,l6;
    public personal_detail(){
        Frame f=new Frame("Personal detail");
        Font a=new Font("Arial",Font.BOLD,32);
        Font b=new Font("Arial",Font.BOLD, 28);
        Font c=new Font("Arial",Font.BOLD,20);
        Font d=new Font("Arial",Font.BOLD,15);
        b0=new Button("MAIN MENU!!!");
        b0.setBounds(20, 45, 130, 50);
        b0.setFont(d);
        l1=new Label("PERSONAL DETAIL");
        l1.setBounds(500,0,300,100);
        l1.setFont(a);
        l2=new Label("1.CUSTOMER'S NAME:===>"+sqld.name);
        l2.setBounds(200,100,1000,100);
        l2.setFont(b);
        l3=new Label("2.ACCOUNT NUMBER:===>"+sqld.accno);
        l3.setBounds(200,200,1000,100);
        l3.setFont(b);
        l4=new Label("3.DATE OF BIRTH:===>"+sqld.DOB);
        l4.setBounds(200,300,1000,100);
        l4.setFont(b);
        l5=new Label("4.ADDRESS:===>"+sqld.add);
        l5.setBounds(200,400,1000,100);
        l5.setFont(b);
        b0.addActionListener(this);
        f.add(b0);
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(l5);
        l1.setForeground(Color.WHITE);
        l2.setForeground(Color.WHITE);
        l3.setForeground(Color.WHITE);
        l4.setForeground(Color.WHITE);
        l5.setForeground(Color.WHITE);
        b0.setForeground(Color.WHITE);
        b0.setBackground(Color.BLACK);
        f.setBackground(Color.BLACK);
        f.setSize(1500,1500);
        f.setLayout(null);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b0){
            Bank back=new Bank();
        }
    
    }
    public static void main(String[] args) {
        personal_detail obj=new personal_detail();
    }
}
