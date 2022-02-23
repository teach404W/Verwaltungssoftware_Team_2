import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.event.KeyListener;



public class GUI{


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
    static JLabel sec_Image;

    static JPanel saveButton;
    static JButton eSaveButton;
    static JLabel iSaveButton;

    static JPanel search_Box;
    static JButton searchB1;
    static JButton searchB2;
    static JButton searchB3;
    static JButton searchB4;
    static JButton backB;

    static JButton option_1;
    static JButton option_2;
    static JButton option_3;
    static JButton option_4;
    static JButton option_5;
    static JButton option_6;

    static JLabel option_1_Image;
    static JLabel option_2_Image;
    static JLabel option_3_Image;
    static JLabel option_4_Image;
    static JLabel option_5_Image;
    static JLabel option_6_Image;


    static JPanel sync_Box;
    static JButton sync_1;
    static JButton sync_2;
    static JButton sync_3;
    static JTextArea sync_Text;



    Texts texts = new Texts();
ArraysList arraysList = new ArraysList();
DataStore dataStore = new DataStore();
Input input = new Input();

    public GUI() throws Exception {

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


sync_Box = new JPanel();
sync_Box.setForeground(new Color(255, 255, 255));
sync_Box.setFont(new Font("Times new Roman", Font.PLAIN, 60));
sync_Box.setBounds(900, 500, 250, 145);
sync_Box.setBackground(Color.black);
sync_Box.setVisible(false);
sync_Box.setFocusable(false);
sync_Box.setOpaque(false);
sync_Box.setBorder(new LineBorder(Color.white));

sync_1 = new JButton("Ja");
sync_1.setForeground(new Color(0, 255, 25));
sync_1.setFont(new Font("Times new Roman", Font.PLAIN, 30));
sync_1.setBounds(920, 550, 100, 30);
sync_1.setBackground(Color.BLACK);
sync_1.setVisible(false);
sync_1.setFocusable(false);
sync_1.setActionCommand("LoadData");
sync_1.setBorder(new LineBorder(new Color(0,255,25)));


sync_2 = new JButton("Nein");
sync_2.setForeground(new Color(255,0,25));
sync_2.setFont(new Font("Times new Roman", Font.PLAIN, 30));
sync_2.setBounds(1032, 550, 100, 30);
sync_2.setBackground(Color.BLACK);
sync_2.setVisible(false);
sync_2.setFocusable(false);
sync_2.setActionCommand("NoData");
sync_2.setBorder(new LineBorder(new Color(255,0,25)));

sync_3 = new JButton("Daten löschen");
sync_3.setForeground(new Color(255,0,120));
sync_3.setFont(new Font("Times new Roman", Font.PLAIN, 30));
sync_3.setBounds(1020, 1210, 212, 30);
sync_3.setBackground(Color.BLACK);
sync_3.setVisible(true);
sync_3.setFocusable(false);
sync_3.setActionCommand("DeleteData");
sync_3.setBorder(new LineBorder(new Color(255,0,120)));


sync_Text = new JTextArea("           Willst du die \n gespeicherten Daten laden?");
sync_Text.setForeground(new Color(255, 255, 255));
sync_Text.setFont(new Font("Times new Roman", Font.PLAIN, 22));
sync_Text.setBounds(900, 505, 250, 100);
sync_Text.setBackground(new Color(39,43,49));
sync_Text.setOpaque(false);
sync_Text.setVisible(false);
sync_Text.setFocusable(false);
sync_Text.setLineWrap(true);

frame.add(sync_Box);
frame.add(sync_1);
frame.add(sync_2);
frame.add(sync_3);
frame.add(sync_Text);

search_Box = new JPanel();
search_Box.setForeground(new Color(255, 255, 255));
search_Box.setFont(new Font("Times new Roman", Font.PLAIN, 60));
search_Box.setBounds(800, 300, 250, 320);
search_Box.setBackground(Color.black);
search_Box.setVisible(false);
search_Box.setFocusable(false);
search_Box.setBorder(new LineBorder(Color.white));



backB = new JButton("<");
backB.setForeground(new Color(255, 0, 25));
backB.setFont(new Font("Times new Roman", Font.PLAIN, 45));
backB.setBounds(50, 80, 140, 50);
backB.setBackground(Color.BLACK);
backB.setVisible(false);
backB.setFocusable(false);
backB.setActionCommand("backB_0");
backB.setBorder(new LineBorder(Color.red));


searchB1 = new JButton("           ");
searchB1.setForeground(new Color(255, 255, 255));
searchB1.setFont(new Font("Times new Roman", Font.PLAIN, 45));
searchB1.setBounds(825, 325, 200, 50);
searchB1.setBackground(new Color(39,43,49));
searchB1.setVisible(false);
searchB1.setFocusable(false);
searchB1.setActionCommand("SearchB1");
searchB1.setBorder(new LineBorder(Color.white));

option_1 = new JButton("       Karte anlegen  ");
option_1.setForeground(new Color(255, 255, 255));
option_1.setFont(new Font("Times new Roman", Font.PLAIN, 40));
option_1.setBounds(400, 125, 350, 50);
option_1.setBackground(new Color(39,43,49));
option_1.setVisible(false);
option_1.setFocusable(false);
option_1.setOpaque(false);
option_1.setActionCommand("option_1");
option_1.setBorder(new LineBorder(Color.white));

option_1_Image = new JLabel();
option_1_Image.setForeground(new Color(255, 255, 255));
option_1_Image.setFont(new Font("Times new Roman", Font.PLAIN, 40));
option_1_Image.setBounds(400, 125, 50, 50);
option_1_Image.setBackground(new Color(39,43,49));
option_1_Image.setVisible(false);
option_1_Image.setFocusable(false);

option_1_Image.setIcon(new ImageIcon(new ImageIcon("Java\\src\\Schuelerverwaltung\\Images\\Menü\\Add.png").getImage().getScaledInstance(50, 45,Image.SCALE_AREA_AVERAGING)));


option_2 = new JButton("      Meine Karten  ");
option_2.setForeground(new Color(255, 255, 255));
option_2.setFont(new Font("Times new Roman", Font.PLAIN, 40));
option_2.setBounds(400, 200, 350, 50);
option_2.setBackground(new Color(39,43,49));
option_2.setVisible(false);
option_2.setFocusable(false);
option_2.setOpaque(false);
option_2.setActionCommand("Meine Karten");
option_2.setBorder(new LineBorder(Color.white));


option_2_Image = new JLabel();
option_2_Image.setForeground(new Color(255, 255, 255));
option_2_Image.setFont(new Font("Times new Roman", Font.PLAIN, 40));
option_2_Image.setBounds(403, 200, 50, 50);
option_2_Image.setBackground(new Color(39,43,49));
option_2_Image.setVisible(false);
option_2_Image.setFocusable(false);
option_2_Image.setIcon(new ImageIcon(new ImageIcon("Java\\src\\Schuelerverwaltung\\Images\\Menü\\Karten.png").getImage().getScaledInstance(50, 38,
Image.SCALE_AREA_AVERAGING)));

option_3 = new JButton("      Karte bearbeiten  ");
option_3.setForeground(new Color(255, 255, 255));
option_3.setFont(new Font("Times new Roman", Font.PLAIN, 40));
option_3.setBounds(400, 275, 350, 50);
option_3.setBackground(new Color(39,43,49));
option_3.setVisible(false);
option_3.setFocusable(false);
option_3.setOpaque(false);
option_3.setActionCommand("Karte bearbeiten");
option_3.setBorder(new LineBorder(Color.white));

option_3_Image = new JLabel();
option_3_Image.setForeground(new Color(255, 255, 255));
option_3_Image.setFont(new Font("Times new Roman", Font.PLAIN, 40));
option_3_Image.setBounds(403, 275, 50, 50);
option_3_Image.setBackground(new Color(39,43,49));
option_3_Image.setVisible(false);
option_3_Image.setFocusable(false);
option_3_Image.setIcon(new ImageIcon(new ImageIcon("Java\\src\\Schuelerverwaltung\\Images\\Menü\\Karte bearbeiten.png").getImage().getScaledInstance(45, 40,
Image.SCALE_AREA_AVERAGING)));


option_4 = new JButton("    Karte Löschen  ");
option_4.setForeground(new Color(255, 255, 255));
option_4.setFont(new Font("Times new Roman", Font.PLAIN, 40));
option_4.setBounds(400, 350, 350, 50);
option_4.setBackground(new Color(39,43,49));
option_4.setForeground(new Color(255,165,35));
option_4.setVisible(false);
option_4.setFocusable(false);
option_4.setOpaque(false);
option_4.setActionCommand("Karte Löschen");
option_4.setBorder(new LineBorder(Color.white));

option_4_Image = new JLabel();
option_4_Image.setForeground(new Color(255, 255, 255));
option_4_Image.setFont(new Font("Times new Roman", Font.PLAIN, 40));
option_4_Image.setBounds(410, 350, 50, 50);
option_4_Image.setBackground(new Color(39,43,49));
option_4_Image.setVisible(false);
option_4_Image.setFocusable(false);
option_4_Image.setIcon(new ImageIcon(new ImageIcon("Java\\src\\Schuelerverwaltung\\Images\\Menü\\Remove.png").getImage().getScaledInstance(36, 40,
Image.SCALE_AREA_AVERAGING)));


option_5 = new JButton("      Zufällige Karte machen  ");
option_5.setForeground(new Color(255, 255, 255));
option_5.setFont(new Font("Times new Roman", Font.PLAIN, 28));
option_5.setBounds(400, 425, 350, 50);
option_5.setBackground(new Color(39,43,49));
option_5.setForeground(new Color(255,0,100));
option_5.setVisible(false);
option_5.setFocusable(false);
option_5.setOpaque(false);
option_5.setActionCommand("Zufällige Karte machen");
option_5.setBorder(new LineBorder(Color.white));

option_5_Image = new JLabel();
option_5_Image.setForeground(new Color(255, 255, 255));
option_5_Image.setFont(new Font("Times new Roman", Font.PLAIN, 40));
option_5_Image.setBounds(410, 425, 50, 50);
option_5_Image.setBackground(new Color(39,43,49));
option_5_Image.setVisible(false);
option_5_Image.setFocusable(false);
option_5_Image.setIcon(new ImageIcon(new ImageIcon("Java\\src\\Schuelerverwaltung\\Images\\Menü\\Würfel2.png").getImage().getScaledInstance(36, 40,
Image.SCALE_AREA_AVERAGING)));

option_6 = new JButton("    Abmelden  ");
option_6.setForeground(new Color(255, 255, 255));
option_6.setFont(new Font("Times new Roman", Font.PLAIN, 40));
option_6.setBounds(400, 500, 350, 50);
option_6.setBackground(new Color(39,43,49));
option_6.setForeground(new Color(255,0,25));
option_6.setVisible(false);
option_6.setFocusable(false);
option_6.setOpaque(false);
option_6.setActionCommand("Abmelden");
option_6.setBorder(new LineBorder(Color.white));

option_6_Image = new JLabel();
option_6_Image.setForeground(new Color(255, 255, 255));
option_6_Image.setFont(new Font("Times new Roman", Font.PLAIN, 40));
option_6_Image.setBounds(410, 500, 50, 50);
option_6_Image.setBackground(new Color(39,43,49));
option_6_Image.setVisible(false);
option_6_Image.setFocusable(false);
option_6_Image.setIcon(new ImageIcon(new ImageIcon("Java\\src\\Schuelerverwaltung\\Images\\Menü\\Abmelden.png").getImage().getScaledInstance(36, 40,
Image.SCALE_AREA_AVERAGING)));

frame.add(option_1_Image);
frame.add(option_2_Image);
frame.add(option_3_Image);
frame.add(option_4_Image);
frame.add(option_5_Image);
frame.add(option_6_Image);

frame.add(option_1);
frame.add(option_2);
frame.add(option_3);
frame.add(option_4);
frame.add(option_5);
frame.add(option_6);
searchB2 = new JButton("           ");
searchB2.setForeground(new Color(255, 255, 255));
searchB2.setFont(new Font("Times new Roman", Font.PLAIN, 45));
searchB2.setBounds(825, 400, 200, 50);
searchB2.setBackground(new Color(39,43,49));
searchB2.setVisible(false);
searchB2.setFocusable(false);
searchB2.setActionCommand("SearchB2");
searchB2.setBorder(new LineBorder(Color.white));

searchB3 = new JButton("           ");
searchB3.setForeground(new Color(255, 255, 255));
searchB3.setFont(new Font("Times new Roman", Font.PLAIN, 45));
searchB3.setBounds(825, 475, 200, 50);
searchB3.setBackground(new Color(39,43,49));
searchB3.setVisible(false);
searchB3.setFocusable(false);
searchB3.setActionCommand("searchB3");
searchB3.setBorder(new LineBorder(Color.white));


searchB4 = new JButton("           ");
searchB4.setForeground(new Color(255, 255, 255));
searchB4.setFont(new Font("Times new Roman", Font.PLAIN, 45));
searchB4.setBounds(825, 550, 200, 50);
searchB4.setBackground(new Color(39,43,49));
searchB4.setVisible(false);
searchB4.setFocusable(false);
searchB4.setActionCommand("searchB4");
searchB4.setBorder(new LineBorder(Color.white));

frame.add(searchB1);
frame.add(searchB2);
frame.add(searchB3);
frame.add(searchB4);

frame.add(backB);

            l = new JLabel();
            l.setForeground(Color.white);
            l.setFont(new Font("Times new Roman", Font.PLAIN, 30));
            l.setBounds(380, 0, 400, 0);
            l.setSize(600, 500);
            l.setBackground(Color.black);
            l.setVisible(true);
            l.setFocusable(false);




            //frame.add(startname);

            l2 = new JLabel("Loading");
            l2.setForeground(Color.white);
            l2.setFont(new Font("Times new Roman", Font.PLAIN, 30));
            l2.setBounds(530, 200, 400, 0);
            l2.setSize(400, 500);
            l2.setBackground(Color.black);
            l2.setVisible(true);
            l2.setFocusable(false);



            infoText = new JLabel("Anmeldung: Name eingeben (4-20 Charakter)");
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


eRandomButton = new JButton();
eRandomButton.setForeground(new Color(255, 255, 255));
eRandomButton.setFont(new Font("Times new Roman", Font.PLAIN, 60));
eRandomButton.setBounds(0, 0, 0, 0);
eRandomButton.setBackground(null);
eRandomButton.setVisible(true);
eRandomButton.setFocusable(false);
eRandomButton.setOpaque(false);
eRandomButton.setActionCommand("RandomName");
eRandomButton.setBorder(new LineBorder(Color.black));
    
iRandomButton = new JLabel();
iRandomButton.setForeground(Color.white);
iRandomButton.setFont(new Font("Times new Roman", Font.PLAIN, 50));
iRandomButton.setSize(80, 80);
iRandomButton.setVisible(true);
iRandomButton.setFocusable(false);
iRandomButton.setOpaque(false);
iRandomButton.setIcon(new ImageIcon(new ImageIcon("Java\\src\\Schuelerverwaltung\\Images\\Menü\\Würfel.png").getImage().getScaledInstance(50, 45,Image.SCALE_AREA_AVERAGING)));
iRandomButton.setBorder(new LineBorder(Color.black));


sec_Image= new JLabel();
sec_Image.setForeground(Color.white);
sec_Image.setFont(new Font("Times new Roman", Font.PLAIN, 50));
sec_Image.setBounds(290, 300, 60, 60);
sec_Image.setVisible(false);
sec_Image.setFocusable(false);
sec_Image.setOpaque(false);
sec_Image.setBorder(new LineBorder(Color.black));

frame.add(sec_Image);

saveButton = new JPanel();
saveButton.setForeground(new Color(255, 255, 255));
saveButton.setFont(new Font("Times new Roman", Font.PLAIN, 60));
saveButton.setBounds(15, 720, 60, 60);
saveButton.setBackground(Color.black);
saveButton.setVisible(false);
saveButton.setFocusable(false);
saveButton.setOpaque(false);
//confirmButton.addActionListener(this);
//randomButton.setActionCommand("ConfirmName");

eSaveButton = new JButton();
eSaveButton.setForeground(new Color(255, 255, 255));
eSaveButton.setFont(new Font("Times new Roman", Font.PLAIN, 60));
eSaveButton.setBounds(0, 0, 100, 100);
eSaveButton.setBackground(null);
eSaveButton.setVisible(true);
eSaveButton.setFocusable(false);
eSaveButton.setOpaque(false);
eSaveButton.setActionCommand("SaveData");
eSaveButton.setBorder(new LineBorder(Color.black));

iSaveButton = new JLabel();
iSaveButton.setForeground(Color.white);
iSaveButton.setFont(new Font("Times new Roman", Font.PLAIN, 50));
iSaveButton.setSize(80, 80);
iSaveButton.setVisible(true);
iSaveButton.setFocusable(false);
iSaveButton.setOpaque(false);
iSaveButton.setIcon(new ImageIcon(new ImageIcon("Java\\src\\Schuelerverwaltung\\Images\\Others\\Save.png").getImage().getScaledInstance(50, 45,Image.SCALE_AREA_AVERAGING)));
iSaveButton.setBorder(new LineBorder(Color.black));
    

frame.add(saveButton);
saveButton.add(eSaveButton);
eSaveButton.add(iSaveButton);

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

         /*   l.setVisible(false);

            texarea.setVisible(true);
            confirmButton.setVisible(true);
            randomButton.setVisible(false);
            infoText.setVisible(true);
            */


Thread.sleep(1000);
//loading();


//while (texarea.isVisible() == true && dataStore.angemeldet == true){
    }





    

}
