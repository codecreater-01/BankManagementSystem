import java.awt.*;
import java.awt.event.*;
public class login implements ActionListener{
    Font a,b1,c,d;
    Label l,l0,l1,l2,l3;
    TextField t,t1;
    Button b;
    static int pin1;
    static String str;

    public login(){
        Frame f=new Frame("LOGIN!!!");
        a=new Font("Arial",Font.BOLD,32);
        b1=new Font("Arial",Font.BOLD,28);
        c=new Font("Arial",Font.BOLD,20);
        d=new Font("Arial",Font.BOLD,15);
        l0=new Label("LOGIN");
        l0.setFont(a);
        l=new Label("ACCOUNT NUMBER::");
        l1=new Label("PIN ::");
        l3=new Label();
        t=new TextField();
        t1=new TextField();
        b=new Button("SUBMIT");
        l0.setBounds(650,5,500,100);
        l.setBounds(300,150,300,100);
        l1.setBounds(300,225,300,100);
        t.setBounds(610,175,150,35);
        t1.setBounds(610,250,150,35);
        b.setBounds(550,350,130,50);
        l3.setBounds(450,420,400,50);
        l1.setFont(b1);
        l.setFont(b1);
        l3.setFont(c);
        t.setFont(b1);
        b.setFont(d);
        t1.setFont(b1);
        b.addActionListener(this);
        f.add(l0);
        f.add(l);
        f.add(l1);
        f.add(t);
        f.add(t1);
        f.add(b);
        f.add(l3);
        l0.setForeground(Color.WHITE);l3.setForeground(Color.WHITE);
        l.setForeground(Color.WHITE);
        l1.setForeground(Color.WHITE);
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        f.setBackground(Color.BLACK);
        f.setSize(1500,1500);
        f.setLayout(null);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b){
            str=t1.getText();
            int n=Integer.parseInt(str);
            System.out.println(n);
            pin1=sqld.pin;
            if(n==pin1){
                l3.setText("SUCCESSFULLY LOGGED IN "+sqld.pin);
                Bank next=new Bank();
            }
            else{
                l3.setText("INCORRECT PIN.PLEASE RETRY "+sqld.pin);
            }
        }
    }
    public static void main(String[] args){
        sqld db=new sqld();
        
    }    
}
