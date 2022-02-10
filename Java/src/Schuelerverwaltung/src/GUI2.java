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
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.html.HTMLDocument.BlockElement;


public class GUI2 implements ActionListener{

    static JFrame frame;
    static double v;
    static double r;
    static JLabel l;
    static JLabel l2;
    static JLabel infoText;
    static JPanel panel1;
    static JTextField texarea;
    static JButton confirmButton;
    static JPanel randomButton;
    static JButton eRandomButton;
    static JLabel iRandomButton;
    static JPanel search_Box;
    static JButton searchB1;
    static JButton searchB2;
    static JButton searchB3;
    static JButton searchB4;
    Texts texts = new Texts();
ArraysList arraysList = new ArraysList();


    public GUI2() throws Exception {


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




            panel1 = new JPanel();
            panel1.setBounds(800, 200, 350, 100);
            panel1.setBackground(Color.black);


search_Box = new JPanel();
search_Box.setForeground(new Color(255, 255, 255));
search_Box.setFont(new Font("Times new Roman", Font.PLAIN, 60));
search_Box.setBounds(800, 300, 250, 320);
search_Box.setBackground(Color.black);
search_Box.setVisible(false);
search_Box.setFocusable(false);
search_Box.setBorder(new LineBorder(Color.white));


searchB1 = new JButton("           ");
searchB1.setForeground(new Color(255, 255, 255));
searchB1.setFont(new Font("Times new Roman", Font.PLAIN, 45));
searchB1.setBounds(0, 0, 0, 0);
searchB1.setBackground(new Color(39,43,49));
searchB1.setVisible(false);
searchB1.setFocusable(false);
searchB1.setActionCommand("SearchB1");
searchB1.setBorder(new LineBorder(Color.white));
searchB1.addActionListener(this);


searchB2 = new JButton("           ");
searchB2.setForeground(new Color(255, 255, 255));
searchB2.setFont(new Font("Times new Roman", Font.PLAIN, 45));
searchB2.setBounds(0, 0, 0, 0);
searchB2.setBackground(new Color(39,43,49));
searchB2.setVisible(false);
searchB2.setFocusable(false);
searchB2.setActionCommand("SearchB2");
searchB2.setBorder(new LineBorder(Color.white));
searchB2.addActionListener(this);

searchB3 = new JButton("           ");
searchB3.setForeground(new Color(255, 255, 255));
searchB3.setFont(new Font("Times new Roman", Font.PLAIN, 45));
searchB3.setBounds(0, 0, 0, 0);
searchB3.setBackground(new Color(39,43,49));
searchB3.setVisible(false);
searchB3.setFocusable(false);
searchB3.setActionCommand("searchB3");
searchB3.setBorder(new LineBorder(Color.white));
searchB3.addActionListener(this);

searchB4 = new JButton("           ");
searchB4.setForeground(new Color(255, 255, 255));
searchB4.setFont(new Font("Times new Roman", Font.PLAIN, 45));
searchB4.setBounds(0, 0, 0, 0);
searchB4.setBackground(new Color(39,43,49));
searchB4.setVisible(false);
searchB4.setFocusable(false);
searchB4.setActionCommand("searchB4");
searchB4.setBorder(new LineBorder(Color.white));
searchB4.addActionListener(this);

search_Box.add(searchB1);
search_Box.add(searchB2);
search_Box.add(searchB3);
search_Box.add(searchB4);

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
            l2.setVisible(false);
            l2.setFocusable(false);



            infoText = new JLabel("Name eingeben (0-20 Character)");
            infoText.setForeground(new Color(80,80,80));
            infoText.setFont(new Font("Times new Roman", Font.PLAIN, 18));
            infoText.setBounds(420, 324, 400, 0);
            infoText.setSize(400, 100);
            infoText.setOpaque(false);
            infoText.setVisible(false);
            infoText.setFocusable(false);

            texarea = new JTextField(10);
texarea.setBounds(420,300,300,60);
texarea.setVisible(false);
texarea.setBackground(Color.BLACK);
texarea.setForeground(Color.WHITE);
texarea.setFont(new Font("Arial",Font.BOLD,18));
texarea.setBorder(new LineBorder(Color.white));



confirmButton = new JButton("/");
confirmButton.setForeground(new Color(255, 255, 255));
confirmButton.setFont(new Font("Times new Roman", Font.PLAIN, 60));
confirmButton.setBounds(730, 300, 60, 60);
confirmButton.setBackground(Color.black);
confirmButton.setVisible(false);
confirmButton.setFocusable(false);
//confirmButton.addActionListener(this);
confirmButton.setActionCommand("ConfirmName");
confirmButton.setBorder(new LineBorder(Color.white));


randomButton = new JPanel();
randomButton.setForeground(new Color(255, 255, 255));
randomButton.setFont(new Font("Times new Roman", Font.PLAIN, 60));
randomButton.setBounds(350, 300, 60, 60);
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
eRandomButton.setActionCommand("RandomName");
eRandomButton.setBorder(new LineBorder(Color.black));
eRandomButton.addActionListener(this);

           




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
            frame.add(infoText);
            frame.add(search_Box);

            frame.add(l);
            frame.add(panel1);
            frame.setVisible(true);


            

Thread.sleep(1000);
loading();


while (texarea.isVisible() == true){
    if (texarea.getText().length() >= 1){
        int d = 0;
        int d2 = 0;
        if (searchB1.getText() == null) {
            searchB1.setVisible(false);
            searchB2.setVisible(false);
            searchB3.setVisible(false);
            searchB4.setVisible(false);
        }

    search_Box.setVisible(true);
    for (int a = 0; a< arraysList.testArray.length;a++){


        if (texarea.getText().toString().equals(arraysList.testArray[a])){
            searchB1.setVisible(true);
            searchB1.setText(arraysList.testArray[a]);
            search_Box.setBounds(800, 300, 250, 320);
         //   searchB3.setVisible(false);
            searchB4.setVisible(false);

            if (searchB2.getText().toString() != searchB1.getText().toString()) searchB2.setVisible(true); 
            if (searchB2.getText().toString() == searchB1.getText().toString()){
                searchB2.setVisible(true);
                search_Box.setBounds(800, 300, 250, 320);
                d = 0;
                for (int z = 0; z< arraysList.testArray.length;z++){
                if (!searchB1.getText().toString().equals(arraysList.testArray[z])){   
                    d++;
                  if (texarea.getText().length() > 1)
                    if (texarea.getText().toString().charAt(0) == arraysList.testArray[z].charAt(0) && texarea.getText().toString().charAt(1) == arraysList.testArray[z].charAt(1) && !searchB1.getText().toString().equals(arraysList.testArray[z])){   
                        if (!texarea.getText().toString().equals(arraysList.testArray[z]))            
                        searchB2.setVisible(true);
                        searchB2.setText(arraysList.testArray[z]);
                        search_Box.setBounds(800, 300, 250, 320);
                        break;
                    }
                
                }
                }
            }  


            break;
        }

        if (texarea.getText().toString().charAt(0) == arraysList.testArray[a].charAt(0)){
        if (!texarea.getText().toString().equals(arraysList.testArray[a])){           
                searchB1.setVisible(true);
                searchB1.setText(arraysList.testArray[a]);
                search_Box.setBounds(800, 300, 250, 320);
            }
            
        }

        try {
            if (Integer.parseInt(texarea.getText().toString()) == a && Integer.parseInt(texarea.getText().toString()) <8){
                searchB1.setVisible(true);
                searchB1.setText(arraysList.testArray[a]);
                search_Box.setBounds(800, 300, 250, 320);
                searchB2.setVisible(false);
                searchB3.setVisible(false);
                searchB4.setVisible(false);
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        


                if (!searchB1.getText().toString().equals(arraysList.testArray[a])){   
                    d++;

                    if (texarea.getText().length() < 1){
                        searchB3.setVisible(false);
                    }
                  if (texarea.getText().length() > 1)
                    if (texarea.getText().toString().charAt(0) == arraysList.testArray[d].charAt(0) && texarea.getText().toString().charAt(1) == arraysList.testArray[d].charAt(1) && !searchB1.getText().toString().equals(arraysList.testArray[d])){   
                        if (!texarea.getText().toString().equals(arraysList.testArray[a]))            
                        searchB2.setVisible(true);
                        searchB2.setText(arraysList.testArray[d]);
                        search_Box.setBounds(800, 300, 250, 320);
                    }
                
                    
                }


                if (!searchB1.getText().toString().equals(arraysList.testArray[a]) && !searchB2.getText().toString().equals(arraysList.testArray[a])){   
                    d2++;

                    if (texarea.getText().length() < 2){
                        searchB3.setVisible(false);
                    }
                    for (int z = 0; z< arraysList.testArray.length;z++){
                  if (texarea.getText().length() > 2)
                    if (texarea.getText().toString().charAt(0) == arraysList.testArray[z].charAt(0) && texarea.getText().toString().charAt(1) == arraysList.testArray[z].charAt(1) && texarea.getText().toString().charAt(2) == arraysList.testArray[z].charAt(2)  && !searchB1.getText().toString().equals(arraysList.testArray[z]) && !searchB2.getText().toString().equals(arraysList.testArray[z])){   
                        if (!texarea.getText().toString().equals(arraysList.testArray[z]))       
                             
                        searchB3.setVisible(true);
                        searchB3.setText(arraysList.testArray[z]);
                        search_Box.setBounds(800, 300, 250, 320);
                        System.out.println(arraysList.testArray[z]);
                        break;
                    }
                
                    
                    
                }
            }

        }



    }



    else{
        search_Box.setVisible(false);

    }
    Thread.sleep(1000);

    
}
    }

   static public void loading() throws InterruptedException{
    int t1 = 12;
    Texts texts = new Texts();
        for (int i = 1; i<61;i++){
            Thread.sleep(t1);
            l.setIcon(new ImageIcon(new ImageIcon("Java\\src\\Schuelerverwaltung\\Images\\Loading\\" + i + ".png").getImage().getScaledInstance(500, 300, Image.SCALE_AREA_AVERAGING)));


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

        int t2 = 0;
        Thread.sleep(2000);

        for (int c = 60; c<99;c+=2){
            Thread.sleep(t2);
            l.setIcon(new ImageIcon(new ImageIcon("Java\\src\\Schuelerverwaltung\\Images\\Loading\\" + c + ".png").getImage().getScaledInstance(500, 300, Image.SCALE_AREA_AVERAGING)));

            if (c > 85){

                t2 = 22;
            }
           
            }


            for (int t = 0; t <5;t++){
                for (int i = 1; i<61;i+=3){
                    Thread.sleep(0);
                    l.setIcon(new ImageIcon(new ImageIcon("Java\\src\\Schuelerverwaltung\\Images\\Loading\\" + i + ".png").getImage().getScaledInstance(500, 300, Image.SCALE_AREA_AVERAGING)));
                   
                }
            
                for (int c = 60; c<99;c+=3){
                    Thread.sleep(0);
                    l.setIcon(new ImageIcon(new ImageIcon("Java\\src\\Schuelerverwaltung\\Images\\Loading\\" + c + ".png").getImage().getScaledInstance(500, 300, Image.SCALE_AREA_AVERAGING)));
        
                   
                    }
            }


            l.setVisible(false);

texarea.setVisible(true);
confirmButton.setVisible(true);
randomButton.setVisible(true);
infoText.setVisible(true);


    }


    
    public void actionPerformed(java.awt.event.ActionEvent e) {

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


               
               x = (int) (Math.random() * 100); //  x Wird neu generiert (0-100)
               if (x < 60) texarea.setText(texarea.getText() + x); //  60%, dass der Name eine Zufällige Zahl am Ende bekommt
               return;
           }

        };
    }


    
    
}
