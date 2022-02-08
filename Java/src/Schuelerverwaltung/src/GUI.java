import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
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


public class GUI {

    static JFrame frame;
    static double v;
    static double r;
    static JLabel l;
    static JPanel panel1;
    public static void main(String[] args) throws Exception {
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
            l.setBounds(540, 30, 400, 0);
            l.setSize(500, 500);
            l.setBackground(Color.black);
            l.setVisible(true);
            l.setFocusable(false);

            l.setIcon(new ImageIcon(new ImageIcon("Java\\src\\Schuelerverwaltung\\Images\\Loading\\42.png").getImage().getScaledInstance(300, 300, Image.SCALE_AREA_AVERAGING)));
            //frame.add(startname);

            frame.add(loading_);
            frame.add(l);
            frame.add(panel1);
            frame.setVisible(true);


loading();
    }


   static public void loading() throws InterruptedException{
        for (int i = 1; i<61;i++){
            Thread.sleep(0);
            l.setIcon(new ImageIcon(new ImageIcon("Java\\src\\Schuelerverwaltung\\Images\\Loading\\" + i + ".png").getImage().getScaledInstance(400, 300, Image.SCALE_AREA_AVERAGING)));

        }

        for (int i = 1; i<61;i++){
            Thread.sleep(0);
            l.setIcon(new ImageIcon(new ImageIcon("Java\\src\\Schuelerverwaltung\\Images\\Loading\\" + i + ".png").getImage().getScaledInstance(400, 300, Image.SCALE_AREA_AVERAGING)));

        }

        for (int i = 1; i<61;i++){
            Thread.sleep(0);
            l.setIcon(new ImageIcon(new ImageIcon("Java\\src\\Schuelerverwaltung\\Images\\Loading\\" + i + ".png").getImage().getScaledInstance(400, 300, Image.SCALE_AREA_AVERAGING)));

        }

        for (int i = 1; i<61;i++){
            Thread.sleep(0);
            l.setIcon(new ImageIcon(new ImageIcon("Java\\src\\Schuelerverwaltung\\Images\\Loading\\" + i + ".png").getImage().getScaledInstance(400, 300, Image.SCALE_AREA_AVERAGING)));

        }
    }
    
    
}
