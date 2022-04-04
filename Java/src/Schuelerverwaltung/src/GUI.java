import java.awt.Color;
import java.awt.Font;
import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class GUI {

        JFrame frame;
        double v;
        double r;
        JLabel l;
        JLabel l2;
        JLabel infoText;
        JPanel panel1;
        JTextField texarea;
        JButton confirmButton;
        JPanel randomButton;
        JButton eRandomButton;
        JLabel iRandomButton;
        JLabel sec_Image;

        JPanel saveButton;
        JButton eSaveButton;
        JLabel iSaveButton;

        JPanel search_Box;
        JButton searchB1;
        JButton searchB2;
        JButton searchB3;
        JButton searchB4;
        JButton backB;

        JButton[] option = new JButton[6];
        JLabel[] optionI = new JLabel[6];
        JLabel[] randomCard = new JLabel[8];

        JPanel sync_Box;

        JButton[] sync = new JButton[3];
        JTextArea sync_Text;

        JPanel box2;
        JTextArea descriptionBox;

        Texts texts = new Texts();
        ArraysList arraysList = new ArraysList();
        DataStore dataStore = new DataStore();
        Input input = new Input(this);

        public GUI() throws Exception {

                frame = new JFrame(); // Öffnet ein Fenster beim Starten

                frame.setExtendedState(JFrame.MAXIMIZED_BOTH); // das Fenster(frame) wird beim starten auf full screen
                                                               // gesettet
                frame.setUndecorated(false);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                panel1 = new JPanel();
                panel1.setBounds(800, 200, 350, 100);
                panel1.setBackground(Color.black);

                // JFrame: JFrame ist das Fenster
                // JLabel: JLabel kann entweder ein Text oder ein Bild sein. Kann nur einen Satz
                // haben.
                // JButton: JButton kann der Nutzer Klicken, um Funktionen zu starten. Sie kann
                // auch einen Text haben.
                // JTextArea: JTextArea ist ein großes Textfeld. Kann auch mehrere Sätze haben

                sync_Box = new JPanel(); // setten von sync_Box
                sync_Box.setForeground(new Color(255, 255, 255)); //
                sync_Box.setFont(new Font("Times new Roman", Font.PLAIN, 60)); // Die Schriftart von sync_Box eingeben |
                                                                               // "Times
                                                                               // New Roman" ist die Schriftart und 60
                                                                               // ist die
                                                                               // Schriftgröße
                sync_Box.setBounds(900, 500, 250, 145); // Die Position von sync_Box setten (x Position, y Position, x
                                                        // Größe, y
                                                        // Größe) | Wenn die x und y Positionen 0 sind, dann wird
                                                        // sync_Box oben
                                                        // auf der linken Ecke sein
                // sync_Box.setBackground(Color.black); // Hintergrundsfarbe setten
                sync_Box.setVisible(false); // Sichtbarkeit setten | false = nicht sichtbar ; true = sichtbar
                sync_Box.setFocusable(false); // Textrand ändern | false = nicht sichtbar ; true = sichtbar
                sync_Box.setOpaque(false); // Hintergrundssichtbarkeit | false = nicht sichtbar ; true = sichtbar
                sync_Box.setBorder(new LineBorder(Color.white)); // Outline und die Farbe eingeben

                sync[0] = new JButton("Ja"); // definieren von sync[0] | der Text in den Klammern "Ja" ist der
                                             // Anfangstext
                                             // von sync[0] und kann später geändert werden
                sync[0].setForeground(new Color(0, 255, 25)); // mit rgb(rot, grün, blau) die Hintergrundsfarbe setten
                sync[0].setFont(new Font("Times new Roman", Font.PLAIN, 30)); // Die Schriftart von sync[0] eingeben |
                                                                              // Die
                                                                              // Schriftart ist "Times new Roman" und
                                                                              // die
                                                                              // Schriftgröße ist 30
                sync[0].setBounds(920, 550, 100, 30); // Die Position von sync_Box setten (x Position, y Position, x
                                                      // Größe, y
                                                      // Größe) | Wenn die x und y Positionen 0 sind, dann wird sync_Box
                                                      // oben
                                                      // auf der linken Ecke sein
                sync[0].setBackground(Color.BLACK); // Hintergrundsfarbe setten
                sync[0].setVisible(false); // Sichtbarkeit setten | false = nicht sichtbar ; true = sichtbar
                sync[0].setFocusable(false); // Textrand ändern | false = nicht sichtbar ; true = sichtbar
                sync[0].setActionCommand("LoadData"); // Actioncommand wird beim Klicken genommen und kann Funktionen
                                                      // starten.
                                                      // SystemController L. 848
                sync[0].setBorder(new LineBorder(new Color(0, 255, 25))); // Outline und die Farbe eingeben

                sync[1] = new JButton("Nein");
                sync[1].setForeground(new Color(255, 0, 25));
                sync[1].setFont(new Font("Times new Roman", Font.PLAIN, 30));
                sync[1].setBounds(1032, 550, 100, 30);
                sync[1].setBackground(Color.BLACK);
                sync[1].setVisible(false);
                sync[1].setFocusable(false);
                sync[1].setActionCommand("NoData");
                sync[1].setBorder(new LineBorder(new Color(255, 0, 25)));

                sync[2] = new JButton("Daten löschen");
                sync[2].setForeground(new Color(255, 0, 120));
                sync[2].setFont(new Font("Times new Roman", Font.PLAIN, 30));
                sync[2].setBounds(1020, 1210, 212, 30);
                sync[2].setBackground(Color.BLACK);
                sync[2].setVisible(true);
                sync[2].setFocusable(false);
                sync[2].setActionCommand("DeleteData");
                sync[2].setBorder(new LineBorder(new Color(255, 0, 120)));

                sync_Text = new JTextArea("           Willst du die \n gespeicherten Daten laden?"); // Text von
                                                                                                     // sync_Text
                                                                                                     // setten. \n ist
                                                                                                     // nextline
                sync_Text.setForeground(new Color(255, 255, 255)); // Textfarbe mit rgb(rot, grün, blau) setten
                sync_Text.setFont(new Font("Times new Roman", Font.PLAIN, 22)); // Schriftart eingebn | "Times New
                                                                                // Roman" ist
                                                                                // die Schriftart und 22 ist die
                                                                                // Schriftgröße
                sync_Text.setBounds(900, 505, 250, 100);
                sync_Text.setBackground(new Color(39, 43, 49));
                sync_Text.setOpaque(false);
                sync_Text.setVisible(false);
                sync_Text.setFocusable(false);
                sync_Text.setLineWrap(true);

                frame.add(sync_Box); //
                frame.add(sync[0]);
                frame.add(sync[1]);
                frame.add(sync[2]);
                frame.add(sync_Text);

                search_Box = new JPanel();
                search_Box.setForeground(new Color(255, 255, 255));
                search_Box.setFont(new Font("Times new Roman", Font.PLAIN, 60));
                search_Box.setBounds(800, 300, 250, 320);
                search_Box.setBackground(Color.black);
                search_Box.setVisible(false);
                search_Box.setFocusable(false);
                search_Box.setBorder(new LineBorder(Color.white));

                backB = new JButton("x");
                backB.setForeground(new Color(255, 0, 25));
                backB.setFont(new Font("Times new Roman", Font.PLAIN, 45));
                backB.setBounds(50, 80, 70, 50);
                backB.setBackground(Color.BLACK);
                backB.setVisible(false);
                backB.setFocusable(false);
                backB.setActionCommand("backB_0");
                backB.setBorder(new LineBorder(Color.red));

                searchB1 = new JButton("           ");
                searchB1.setForeground(new Color(255, 255, 255));
                searchB1.setFont(new Font("Times new Roman", Font.PLAIN, 45));
                searchB1.setBounds(825, 325, 200, 50);
                searchB1.setBackground(new Color(39, 43, 49));
                searchB1.setVisible(false);
                searchB1.setFocusable(false);
                searchB1.setActionCommand("SearchB1");
                searchB1.setBorder(new LineBorder(Color.white));

                option[0] = new JButton("       Karte anlegen  ");
                option[0].setForeground(new Color(255, 255, 255));
                option[0].setFont(new Font("Times new Roman", Font.PLAIN, 40));
                option[0].setBounds(400, 125, 350, 50);
                option[0].setBackground(new Color(39, 43, 49));
                option[0].setVisible(false);
                option[0].setFocusable(false);
                option[0].setOpaque(false);
                option[0].setActionCommand("option[0]");
                option[0].setBorder(new LineBorder(Color.white));

                optionI[0] = new JLabel();
                optionI[0].setForeground(new Color(255, 255, 255));
                optionI[0].setFont(new Font("Times new Roman", Font.PLAIN, 40));
                optionI[0].setBounds(400, 125, 50, 50);
                optionI[0].setBackground(new Color(39, 43, 49));
                optionI[0].setVisible(false);
                optionI[0].setFocusable(false);
                optionI[0].setIcon(new ImageIcon(new ImageIcon("Java\\src\\Schuelerverwaltung\\Images\\Menü\\Add.png")
                                .getImage().getScaledInstance(50, 45, Image.SCALE_AREA_AVERAGING)));

                frame.add(optionI[0]);

                option[1] = new JButton("      Meine Karten  ");
                option[1].setForeground(new Color(255, 255, 255));
                option[1].setFont(new Font("Times new Roman", Font.PLAIN, 40));
                option[1].setBounds(400, 200, 350, 50);
                option[1].setBackground(new Color(39, 43, 49));
                option[1].setVisible(false);
                option[1].setFocusable(false);
                option[1].setOpaque(false);
                option[1].setActionCommand("Meine Karten");
                option[1].setBorder(new LineBorder(Color.white));

                optionI[1] = new JLabel();
                optionI[1].setForeground(new Color(255, 255, 255));
                optionI[1].setFont(new Font("Times new Roman", Font.PLAIN, 40));
                optionI[1].setBounds(403, 200, 50, 50);
                optionI[1].setBackground(new Color(39, 43, 49));
                optionI[1].setVisible(false);
                optionI[1].setFocusable(false);
                optionI[1].setIcon(
                                new ImageIcon(new ImageIcon("Java\\src\\Schuelerverwaltung\\Images\\Menü\\Karten.png")
                                                .getImage().getScaledInstance(50, 38,
                                                                Image.SCALE_AREA_AVERAGING)));

                option[2] = new JButton("      Karte bearbeiten  ");
                option[2].setForeground(new Color(255, 255, 255));
                option[2].setFont(new Font("Times new Roman", Font.PLAIN, 40));
                option[2].setBounds(400, 275, 350, 50);
                option[2].setBackground(new Color(39, 43, 49));
                option[2].setVisible(false);
                option[2].setFocusable(false);
                option[2].setOpaque(false);
                option[2].setActionCommand("Karte bearbeiten");
                option[2].setBorder(new LineBorder(Color.white));

                optionI[2] = new JLabel();
                optionI[2].setForeground(new Color(255, 255, 255));
                optionI[2].setFont(new Font("Times new Roman", Font.PLAIN, 40));
                optionI[2].setBounds(403, 275, 50, 50);
                optionI[2].setBackground(new Color(39, 43, 49));
                optionI[2].setVisible(false);
                optionI[2].setFocusable(false);
                optionI[2].setIcon(
                                new ImageIcon(new ImageIcon(
                                                "Java\\src\\Schuelerverwaltung\\Images\\Menü\\Karte bearbeiten.png")
                                                .getImage().getScaledInstance(45, 40,
                                                                Image.SCALE_AREA_AVERAGING)));

                option[3] = new JButton("    Karte Löschen  ");
                option[3].setForeground(new Color(255, 255, 255));
                option[3].setFont(new Font("Times new Roman", Font.PLAIN, 40));
                option[3].setBounds(400, 350, 350, 50);
                option[3].setBackground(new Color(39, 43, 49));
                option[3].setForeground(new Color(255, 165, 35));
                option[3].setVisible(false);
                option[3].setFocusable(false);
                option[3].setOpaque(false);
                option[3].setActionCommand("Karte Löschen");
                option[3].setBorder(new LineBorder(Color.white));

                optionI[3] = new JLabel();
                optionI[3].setForeground(new Color(255, 255, 255));
                optionI[3].setFont(new Font("Times new Roman", Font.PLAIN, 40));
                optionI[3].setBounds(410, 350, 50, 50);
                optionI[3].setBackground(new Color(39, 43, 49));
                optionI[3].setVisible(false);
                optionI[3].setFocusable(false);
                optionI[3].setIcon(
                                new ImageIcon(new ImageIcon("Java\\src\\Schuelerverwaltung\\Images\\Menü\\Remove.png")
                                                .getImage().getScaledInstance(36, 40,
                                                                Image.SCALE_AREA_AVERAGING)));

                option[4] = new JButton("      Zufällige Karte machen  ");
                option[4].setForeground(new Color(255, 255, 255));
                option[4].setFont(new Font("Times new Roman", Font.PLAIN, 28));
                option[4].setBounds(400, 425, 350, 50);
                option[4].setBackground(new Color(39, 43, 49));
                option[4].setForeground(new Color(255, 0, 100));
                option[4].setVisible(false);
                option[4].setFocusable(false);
                option[4].setOpaque(false);
                option[4].setActionCommand("Zufällige Karte machen");
                option[4].setBorder(new LineBorder(Color.white));

                optionI[4] = new JLabel();
                optionI[4].setForeground(new Color(255, 255, 255));
                optionI[4].setFont(new Font("Times new Roman", Font.PLAIN, 40));
                optionI[4].setBounds(410, 425, 50, 50);
                optionI[4].setBackground(new Color(39, 43, 49));
                optionI[4].setVisible(false);
                optionI[4].setFocusable(false);
                optionI[4].setIcon(
                                new ImageIcon(new ImageIcon("Java\\src\\Schuelerverwaltung\\Images\\Menü\\Würfel2.png")
                                                .getImage().getScaledInstance(36, 40,
                                                                Image.SCALE_AREA_AVERAGING)));

                option[5] = new JButton("    Abmelden  ");
                option[5].setForeground(new Color(255, 255, 255));
                option[5].setFont(new Font("Times new Roman", Font.PLAIN, 40));
                option[5].setBounds(400, 500, 350, 50);
                option[5].setBackground(new Color(39, 43, 49));
                option[5].setForeground(new Color(255, 0, 25));
                option[5].setVisible(false);
                option[5].setFocusable(false);
                option[5].setOpaque(false);
                option[5].setActionCommand("Abmelden");
                option[5].setBorder(new LineBorder(Color.white));

                optionI[5] = new JLabel();
                optionI[5].setForeground(new Color(255, 255, 255));
                optionI[5].setFont(new Font("Times new Roman", Font.PLAIN, 40));
                optionI[5].setBounds(410, 500, 50, 50);
                optionI[5].setBackground(new Color(39, 43, 49));
                optionI[5].setVisible(false);
                optionI[5].setFocusable(false);
                optionI[5].setIcon(
                                new ImageIcon(new ImageIcon("Java\\src\\Schuelerverwaltung\\Images\\Menü\\Abmelden.png")
                                                .getImage().getScaledInstance(36, 40,
                                                                Image.SCALE_AREA_AVERAGING)));

                randomCard[0] = new JLabel("");
                randomCard[0].setForeground(new Color(255, 255, 255));
                randomCard[0].setFont(new Font("Times new Roman", Font.PLAIN, 30));
                randomCard[0].setBounds(900, 150, 300, 50);
                randomCard[0].setBackground(new Color(39, 43, 49));
                randomCard[0].setVisible(true);
                randomCard[0].setFocusable(false);
               
                randomCard[1] = new JLabel("");
                randomCard[1].setForeground(new Color(255, 255, 255));
                randomCard[1].setFont(new Font("Times new Roman", Font.PLAIN, 30));
                randomCard[1].setBounds(900, 220, 300, 50);
                randomCard[1].setBackground(new Color(39, 43, 49));
                randomCard[1].setVisible(true);
                randomCard[1].setFocusable(false);

                randomCard[2] = new JLabel("");
                randomCard[2].setForeground(new Color(255, 255, 255));
                randomCard[2].setFont(new Font("Times new Roman", Font.PLAIN, 30));
                randomCard[2].setBounds(900, 290, 300, 50);
                randomCard[2].setBackground(new Color(39, 43, 49));
                randomCard[2].setVisible(true);
                randomCard[2].setFocusable(false);
               

                randomCard[3] = new JLabel("");
                randomCard[3].setForeground(new Color(255, 255, 255));
                randomCard[3].setFont(new Font("Times new Roman", Font.PLAIN, 30));
                randomCard[3].setBounds(900, 360, 300, 50);
                randomCard[3].setBackground(new Color(39, 43, 49));
                randomCard[3].setVisible(true);
                randomCard[3].setFocusable(false);
               
                randomCard[4] = new JLabel("");
                randomCard[4].setForeground(new Color(255, 255, 255));
                randomCard[4].setFont(new Font("Times new Roman", Font.PLAIN, 30));
                randomCard[4].setBounds(900, 430, 300, 50);
                randomCard[4].setBackground(new Color(39, 43, 49));
                randomCard[4].setVisible(true);
                randomCard[4].setFocusable(false);

                randomCard[5] = new JLabel("");
                randomCard[5].setForeground(new Color(255, 255, 255));
                randomCard[5].setFont(new Font("Times new Roman", Font.PLAIN, 30));
                randomCard[5].setBounds(900, 500, 300, 50);
                randomCard[5].setBackground(new Color(39, 43, 49));
                randomCard[5].setVisible(true);
                randomCard[5].setFocusable(false);

                randomCard[6] = new JLabel("");
                randomCard[6].setForeground(new Color(255, 255, 255));
                randomCard[6].setFont(new Font("Times new Roman", Font.PLAIN, 30));
                randomCard[6].setBounds(900, 570, 300, 50);
                randomCard[6].setBackground(new Color(39, 43, 49));
                randomCard[6].setVisible(true);
                randomCard[6].setFocusable(false);

                randomCard[7] = new JLabel("");
                randomCard[7].setForeground(new Color(255, 255, 255));
                randomCard[7].setFont(new Font("Times new Roman", Font.PLAIN, 30));
                randomCard[7].setBounds(900, 640, 300, 50);
                randomCard[7].setBackground(new Color(39, 43, 49));
                randomCard[7].setVisible(true);
                randomCard[7].setFocusable(false);
               

                frame.add(randomCard[6]);
               

                frame.add(randomCard[7]);
               

                frame.add(randomCard[3]);
               

                frame.add(randomCard[4]);

                frame.add(randomCard[5]);



                frame.add(randomCard[2]);
               

                frame.add(randomCard[1]);

                frame.add(randomCard[0]);

                // frame.add(option[0]_Image);
                frame.add(optionI[1]);
                frame.add(optionI[2]);
                frame.add(optionI[3]);
                frame.add(optionI[4]);
                frame.add(optionI[5]);

                frame.add(option[0]);
                frame.add(option[1]);
                frame.add(option[2]);
                frame.add(option[3]);
                frame.add(option[4]);
                frame.add(option[5]);
                searchB2 = new JButton("           ");
                searchB2.setForeground(new Color(255, 255, 255));
                searchB2.setFont(new Font("Times new Roman", Font.PLAIN, 45));
                searchB2.setBounds(825, 400, 200, 50);
                searchB2.setBackground(new Color(39, 43, 49));
                searchB2.setVisible(false);
                searchB2.setFocusable(false);
                searchB2.setActionCommand("SearchB2");
                searchB2.setBorder(new LineBorder(Color.white));

                searchB3 = new JButton("           ");
                searchB3.setForeground(new Color(255, 255, 255));
                searchB3.setFont(new Font("Times new Roman", Font.PLAIN, 45));
                searchB3.setBounds(825, 475, 200, 50);
                searchB3.setBackground(new Color(39, 43, 49));
                searchB3.setVisible(false);
                searchB3.setFocusable(false);
                searchB3.setActionCommand("searchB3");
                searchB3.setBorder(new LineBorder(Color.white));

                searchB4 = new JButton("           ");
                searchB4.setForeground(new Color(255, 255, 255));
                searchB4.setFont(new Font("Times new Roman", Font.PLAIN, 45));
                searchB4.setBounds(825, 550, 200, 50);
                searchB4.setBackground(new Color(39, 43, 49));
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

                // frame.add(startname);

                l2 = new JLabel("Loading");
                l2.setForeground(Color.white);
                l2.setFont(new Font("Times new Roman", Font.PLAIN, 30));
                l2.setBounds(530, 200, 400, 0);
                l2.setSize(400, 500);
                l2.setBackground(Color.black);
                l2.setVisible(true);
                l2.setFocusable(false);

                infoText = new JLabel("Anmeldung: Name eingeben (4-20 Charakter)");
                infoText.setForeground(new Color(80, 80, 80));
                infoText.setFont(new Font("Times new Roman", Font.PLAIN, 18));
                infoText.setBounds(420, 324, 400, 0);
                infoText.setSize(400, 100);
                infoText.setOpaque(false);
                infoText.setVisible(false);
                infoText.setFocusable(false);

                texarea = new JTextField(10);
                texarea.setBounds(420, 300, 300, 60);
                texarea.setVisible(false);
                texarea.setBackground(Color.BLACK);
                texarea.setForeground(Color.WHITE);
                texarea.setFont(new Font("Arial", Font.BOLD, 18));
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
                // confirmButton.addActionListener(this);
                // randomButton.setActionCommand("ConfirmName");
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
                iRandomButton.setIcon(
                                new ImageIcon(new ImageIcon("Java\\src\\Schuelerverwaltung\\Images\\Others\\Würfel.png")
                                                .getImage().getScaledInstance(50, 45, Image.SCALE_AREA_AVERAGING)));
                iRandomButton.setBorder(new LineBorder(Color.black));

                sec_Image = new JLabel();
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
                // confirmButton.addActionListener(this);
                // randomButton.setActionCommand("ConfirmName");

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
                iSaveButton.setIcon(
                                new ImageIcon(new ImageIcon("Java\\src\\Schuelerverwaltung\\Images\\Others\\Save.png")
                                                .getImage().getScaledInstance(50, 45, Image.SCALE_AREA_AVERAGING)));
                iSaveButton.setBorder(new LineBorder(Color.black));

                box2 = new JPanel();
                box2.setForeground(new Color(60, 60, 60));
                box2.setFont(new Font("Times new Roman", Font.PLAIN, 30));
                box2.setBounds(200, 550, 700, 100);
                box2.setSize(850, 240);
                box2.setOpaque(false);
                box2.setVisible(false);
                box2.setFocusable(false);
                box2.setBorder(new LineBorder(Color.darkGray));

                descriptionBox = new JTextArea();
                descriptionBox.setForeground(new Color(60, 60, 60));
                descriptionBox.setFont(new Font("Times new Roman", Font.PLAIN, 30));
                descriptionBox.setBounds(200, 500, 700, 20);
                descriptionBox.setSize(850, 240);
                descriptionBox.setOpaque(false);
                descriptionBox.setVisible(false);
                descriptionBox.setFocusable(false);

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

                frame.add(box2);
                frame.add(descriptionBox);

                frame.add(l);
                frame.add(panel1);
                frame.setVisible(true);

                l.setVisible(false);

                texarea.setVisible(true);
                confirmButton.setVisible(true);
                randomButton.setVisible(false);
                infoText.setVisible(true);

                Thread.sleep(1000);
                // loading();

                // while (texarea.isVisible() == true && dataStore.angemeldet == true){
        }

}
