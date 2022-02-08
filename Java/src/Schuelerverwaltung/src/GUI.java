import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Locale;
import java.util.Random;
import java.awt.*;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.text.html.HTMLDocument.BlockElement;


public class GUI{

    static JFrame frame;
    static double v;
    static double r;
    static JLabel l;
    static JLabel l2;
    static JPanel panel1;
    static JTextField texarea;
    static JButton confirmButton;
    static JPanel randomButton;
    static JButton eRandomButton;
    static JLabel iRandomButton;



    public static void main(String[] args) throws Exception {
        Texts texts = new Texts();


                frame = new JFrame();
    
            frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
            frame.setUndecorated(false);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
            frame.setBackground(Color.black);
    

            JPanel startname = new JPanel();
            startname.setBackground(Color.BLACK);
            startname.setSize(400, 400);
            startname.setFont(new Font("Times new Roman", Font.PLAIN, 35));
            startname.setForeground(Color.WHITE);
            startname.setVisible(true);


            JLabel loading_ = new JLabel();
            loading_.setBackground(Color.BLACK);
            loading_.setSize(200, 200);
            loading_.setFont(new Font("Times new Roman", Font.PLAIN, 40));
            loading_.setForeground(Color.WHITE);
            loading_.setVisible(true);



            panel1 = new JPanel();
            panel1.setBounds(800, 200, 350, 100);
            panel1.setBackground(Color.black);

            l = new JLabel();
            l.setForeground(Color.white);
            l.setFont(new Font("Times new Roman", Font.PLAIN, 30));
            l.setBounds(420, 0, 400, 0);
            l.setSize(600, 500);
            l.setBackground(Color.black);
            l.setVisible(true);
            l.setFocusable(false);




            //frame.add(startname);

            l2 = new JLabel("Loading");
            l2.setForeground(Color.white);
            l2.setFont(new Font("Times new Roman", Font.PLAIN, 30));
            l2.setBounds(420, 300, 400, 0);
            l2.setSize(400, 500);
            l2.setBackground(Color.black);
            l2.setVisible(true);
            l2.setFocusable(false);


            texarea = new JTextField(10);
texarea.setBounds(520,400,300,60);
texarea.setVisible(false);
texarea.setBackground(Color.BLACK);
texarea.setForeground(Color.WHITE);
texarea.setFont(new Font("Arial",Font.BOLD,18));
texarea.setBorder(new LineBorder(Color.white));



confirmButton = new JButton("/");
confirmButton.setForeground(new Color(255, 255, 255));
confirmButton.setFont(new Font("Times new Roman", Font.PLAIN, 60));
confirmButton.setBounds(830, 400, 60, 60);
confirmButton.setBackground(Color.black);
confirmButton.setVisible(false);
confirmButton.setFocusable(false);
//confirmButton.addActionListener(this);
confirmButton.setActionCommand("ConfirmName");
confirmButton.setBorder(new LineBorder(Color.white));


randomButton = new JPanel();
randomButton.setForeground(new Color(255, 255, 255));
randomButton.setFont(new Font("Times new Roman", Font.PLAIN, 60));
randomButton.setBounds(450, 400, 60, 60);
randomButton.setBackground(Color.black);
randomButton.setVisible(false);
randomButton.setFocusable(false);
randomButton.setOpaque(false);
//confirmButton.addActionListener(this);
//randomButton.setActionCommand("ConfirmName");
randomButton.setBorder(new LineBorder(Color.white));


javax.swing.JButton eRandomButton = new JButton();
 eRandomButton.setForeground(new Color(255, 255, 255));
 eRandomButton.setFont(new Font("Times new Roman", Font.PLAIN, 60));
 eRandomButton.setBounds(0, 0, 0, 0);
 eRandomButton.setBackground(null);
        eRandomButton.setVisible(true);
        eRandomButton.setFocusable(false);
        eRandomButton.setOpaque(false);
        eRandomButton.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand().equals("RandomName")){
                    int x = (int) (Math.random() * 100);
                    if (x > 50){
                         x = (int) (Math.random() * 100);
                        texarea.setText("");
                        for (int a = 1;a<4;a++){
                            texarea.setText(texarea.getText() + texts.randomNames[x]);
                             x = (int) (Math.random() * 100);

                        }
                        return;
                    }

                    if (x < 50){
                        x = (int) (Math.random() * 100);
                       texarea.setText("");
                       for (int a = 1;a<3;a++){
                           texarea.setText(texarea.getText() + texts.randomNames[x]);
                            x = (int) (Math.random() * 100);

                       }
                       return;
                   }

                };
                if (e.getActionCommand().equals("RandomNumber")) texarea.setText("Random: " + (int) ( Math.random() * 100));
            }

        });
        eRandomButton.setActionCommand("RandomName");
        eRandomButton.setBorder(new LineBorder(Color.black));


        iRandomButton = new JLabel();
        iRandomButton.setForeground(Color.white);
        iRandomButton.setFont(new Font("Times new Roman", Font.PLAIN, 50));
        iRandomButton.setSize(80, 80);
        iRandomButton.setVisible(true);
        iRandomButton.setFocusable(false);
        iRandomButton.setOpaque(false);
        iRandomButton.setIcon(new ImageIcon(new ImageIcon("Java\\src\\Schuelerverwaltung\\Images\\Others\\Würfel.png").getImage().getScaledInstance(50, 45,
                Image.SCALE_AREA_AVERAGING)));
                iRandomButton.setBorder(new LineBorder(Color.black));

            frame.add(l2);
            frame.add(texarea);
            frame.add(confirmButton);
            frame.add(randomButton);
            randomButton.add(eRandomButton);
            eRandomButton.add(iRandomButton);
            frame.add(randomButton);

            frame.add(loading_);
            frame.add(l);
            frame.add(panel1);
            frame.setVisible(true);

            
Thread.sleep(1000);
loading();
    }

   static public void loading() throws InterruptedException{
    int t1 = 12;
    Texts texts = new Texts();
        for (int i = 1; i<61;i++){
            Thread.sleep(t1);
            l.setIcon(new ImageIcon(new ImageIcon("Java\\src\\Schuelerverwaltung\\Images\\Loading\\" + i + ".png").getImage().getScaledInstance(450, 300, Image.SCALE_AREA_AVERAGING)));


            if (i == 15){
                l2.setText(texts.loadingtex[i]);
                t1 = 40;
            }

            if (i == 30){
                l2.setText(texts.loadingtex[i]);
                t1 = 2;
            }

            if (i < 60){
                l2.setText(texts.loadingtex[i]);

            }

            if (i > 60){
                t1 = 0;
            }
            
        }

        Thread.sleep(2000);

        for (int c = 60; c<99;c++){
            Thread.sleep(0);
            l.setIcon(new ImageIcon(new ImageIcon("Java\\src\\Schuelerverwaltung\\Images\\Loading\\" + c + ".png").getImage().getScaledInstance(450, 300, Image.SCALE_AREA_AVERAGING)));

           
            }


            for (int t = 0; t <5;t++){
                for (int i = 1; i<61;i+=3){
                    Thread.sleep(0);
                    l.setIcon(new ImageIcon(new ImageIcon("Java\\src\\Schuelerverwaltung\\Images\\Loading\\" + i + ".png").getImage().getScaledInstance(450, 300, Image.SCALE_AREA_AVERAGING)));
                   
                }
            
                for (int c = 60; c<99;c+=3){
                    Thread.sleep(0);
                    l.setIcon(new ImageIcon(new ImageIcon("Java\\src\\Schuelerverwaltung\\Images\\Loading\\" + c + ".png").getImage().getScaledInstance(450, 300, Image.SCALE_AREA_AVERAGING)));
        
                   
                    }
            }


            l.setVisible(false);

texarea.setVisible(true);
confirmButton.setVisible(true);
randomButton.setVisible(true);

    }


    

    
    
}
