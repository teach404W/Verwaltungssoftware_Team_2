import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Random;
import java.awt.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

public class SystemController extends GUI implements ActionListener {

   private Random r1;

   protected boolean loadingValues[] = new boolean[9];

   private Byte cardIndex = -1;
   private Byte d;

   private int loading_height = 300;
   private int loading_width = 500;
   private int passwordNumbers;
   private int r2;
   private int rd2;
   private int warnWait;

   private String passwordController;


    Karte[] karten = new Karte[10];

    SystemController() throws Exception {
        frame.addKeyListener(input);
        sync[0].addActionListener(this);
        sync[1].addActionListener(this);
        sync[2].addActionListener(this);
        backB.addActionListener(this);
        searchB1.addActionListener(this);
        option[0].addActionListener(this);
        option[1].addActionListener(this);
        option[2].addActionListener(this);
        option[3].addActionListener(this);
        option[4].addActionListener(this);
        option[5].addActionListener(this);
        searchB2.addActionListener(this);
        searchB3.addActionListener(this);
        searchB4.addActionListener(this);
        confirmButton.addActionListener(this);
        eRandomButton.addActionListener(this);
        eSaveButton.addActionListener(this);
        Thread.sleep(1000);
        loading(true, true, (byte) 1, (byte) 12, (byte) 22, (byte) 2, (byte) 34, (byte) 4);
        l.setVisible(false);
        l2.setVisible(false);

        sync();

        while (user.angemeldet == true) {
            if (confirmButton.getActionCommand() == "ConfirmCardRarity") {
                if (texarea.getText().length() < 1) {
                    sec_Image.setVisible(false);
                }
                if (texarea.getText().length() > 0) {
                    for (String r : arraysList.rar) {
                        System.out.println(r);
                        sec_Image.setIcon(
                                new ImageIcon(new ImageIcon("Java\\src\\Schuelerverwaltung\\Images\\Seltenheiten\\"
                                        + texarea.getText().toString() + ".png").getImage()
                                        .getScaledInstance(50, 45, Image.SCALE_AREA_AVERAGING)));
                        sec_Image.setVisible(true);
                        break;
                    }

                }
            }

            if (loadingValues[0] == true) {
                loadingValues[0] = false;
                l.setBounds(0, 0, 200, 200);
                l.setVisible(true);
                loading_width = 50;
                loading_height = 30;
                loading(true, true, (byte) 1, (byte) 50, (byte) 50, (byte) 50, (byte) 50, (byte) 5);

            }

            if (loadingValues[1] == true) {
                loadingValues[1] = false;
                l.setBounds(380, 0, 600, 500);
                l.setVisible(true);
                loading_width = 500;
                loading_height = 300;
                l2.setVisible(true);
                l2.setText("Karte wird hergestellt");
                loading(false, true, (byte) 0, (byte) 50, (byte) 50, (byte) 50, (byte) 50, (byte) 3);
                l2.setVisible(false);
                showOptions(true, 0);
                loadingValues[3] = true;
                warn(2000, "Karte - Warn", "Karte wurde \nerfolgreich angelegt", "Save-System", "Java\\src\\Schuelerverwaltung\\Images\\Others\\Save.png");

            }

            if (loadingValues[2] == true) {
                l.setBounds(380, 0, 600, 500);
                l.setVisible(true);
                loading_width = 500;
                loading_height = 300;
                l2.setVisible(true);
                l2.setText("Wird abgemeldet");
                loading(false, true, (byte) 0, (byte) 50, (byte) 50, (byte) 50, (byte) 50, (byte) 3);
                System.exit(0);
                frame.setVisible(false);

            }

            if (loadingValues[3] == true) {
                loadingValues[3] = false;
                Thread.sleep(warnWait);
                infoPanel.setVisible(false);
                infoN.setVisible(false);
                infoD.setVisible(false);
                infoMes.setVisible(false);
                infoI.setVisible(false);

            }

            if (texarea.getText().length() >= 1 && confirmButton.getActionCommand() == "Löschen Abfrage" || confirmButton.getActionCommand() == "show edit panel") {
                   
                int v = 1;

                if (searchB1.getText() == null) {
                    searchB1.setVisible(false);
                    searchB2.setVisible(false);
                    searchB3.setVisible(false);
                    searchB4.setVisible(false);
                }

                search_Box.setVisible(true);
                for (int a = 0; a < arraysList.search_Results.length; a++) {

                    for (int z = 0; z < arraysList.search_Results[a].length(); z++) {
                        if (texarea.getText().length() > 0) {
                            try {
                                if (texarea.getText().charAt(v) == arraysList.search_Results[a].charAt(z)) {
                                    searchB1.setVisible(true);
                                    searchB1.setText(arraysList.search_Results[a]);
                                    v++;

                                    if (texarea.getText().charAt(v) == arraysList.search_Results[a].charAt(z + 1)) {
                                        searchB1.setVisible(true);
                                        searchB1.setText(arraysList.search_Results[a]);
                                        v++;
                                    }

                                    if (texarea.getText().charAt(v) == arraysList.search_Results[a].charAt(z + 2)) {
                                        searchB1.setVisible(true);
                                        searchB1.setText(arraysList.search_Results[a]);
                                        v++;

                                    }

                                    if (texarea.getText().charAt(v) == arraysList.search_Results[a].charAt(z + 3)) {
                                        searchB1.setVisible(true);
                                        searchB1.setText(arraysList.search_Results[a]);
                                        v++;
                                    }

                                    if (texarea.getText().charAt(v) == arraysList.search_Results[a].charAt(z + 4)) {
                                        searchB1.setVisible(true);
                                        searchB1.setText(arraysList.search_Results[a]);
                                        v++;
                                    }

                                    break;
                                }

                            } catch (Exception e) {
                                // TODO: handle exception
                            }
                        }
                    }

                    try {

                        if (texarea.getText().toString().equals(arraysList.search_Results[a])) {
                            searchB1.setVisible(true);
                            searchB1.setText(arraysList.search_Results[a]);
                            search_Box.setBounds(800, 300, 250, 320);
                            // searchB3.setVisible(false);
                            // searchB4.setVisible(false);

                            if (searchB2.getText().toString() != searchB1.getText().toString())
                                searchB2.setVisible(true);
                            if (searchB2.getText().toString() == searchB1.getText().toString()) {
                                searchB2.setVisible(true);
                                search_Box.setBounds(800, 300, 250, 320);
                                d = 0;
                                for (int z = 0; z < arraysList.search_Results.length; z++) {
                                    if (!searchB1.getText().toString().equals(arraysList.search_Results[z])) {
                                        d++;
                                        if (texarea.getText().length() > 1)
                                            if (texarea.getText().toString().charAt(0) == arraysList.search_Results[z]
                                                    .charAt(0)
                                                    && texarea.getText().toString()
                                                            .charAt(1) == arraysList.search_Results[z].charAt(1)
                                                    && !searchB1.getText().toString()
                                                            .equals(arraysList.search_Results[z])) {
                                                if (!texarea.getText().toString().equals(arraysList.search_Results[z]))
                                                    searchB2.setVisible(true);
                                                searchB2.setText(arraysList.search_Results[z]);
                                                search_Box.setBounds(800, 300, 250, 320);
                                                break;
                                            }

                                    }
                                }
                            }

                            break;

                        }

                    } catch (Exception e) {
                        // TODO: handle exception
                    }
                    try {
                        if (Integer.parseInt(texarea.getText().toString()) == a
                                && Integer.parseInt(texarea.getText().toString()) < 8) {
                            searchB1.setVisible(true);
                            searchB1.setText(arraysList.search_Results[a]);
                            search_Box.setBounds(800, 300, 250, 320);
                            searchB2.setVisible(false);
                            searchB3.setVisible(false);
                            searchB4.setVisible(false);
                        }
                    } catch (Exception e) {
                        // TODO: handle exception
                    }

                }

            }

            else {
                /*
                 * search_Box.setVisible(false);
                 * searchB1.setVisible(false);
                 * searchB2.setVisible(false);
                 * searchB3.setVisible(false);
                 * searchB4.setVisible(false);
                 */

            }
            Thread.sleep(1000);

        }
    }

    public void loading(boolean progress, boolean rotation, byte loadingTime, byte lt1, byte lt2, byte lt3, byte lt4, byte rotations) throws InterruptedException {

        int t1 = lt1;
        if (progress == true) {
            Texts texts = new Texts();
            for (int i = 1; i < 61; i += loadingTime) {
                Thread.sleep(t1);
                super.l.setIcon(
                        new ImageIcon(new ImageIcon("Java\\src\\Schuelerverwaltung\\Images\\Loading\\" + i + ".png")
                                .getImage()
                                .getScaledInstance(loading_width, loading_height, Image.SCALE_AREA_AVERAGING)));

                if (i == 15) {
                    t1 = lt2;
                }

                if (i == 30) {
                    t1 = lt3;
                }

                if (i < 60) {
                    l2.setText(texts.setTex(texts.loadingtex, i));

                }

                if (i > 60) {
                    t1 = lt4;
                }

            }

            int t2 = 0;
            Thread.sleep(2000);

            for (int c = 60; c < 99; c += loadingTime + 1) {
                Thread.sleep(t2);
                l.setIcon(new ImageIcon(new ImageIcon("Java\\src\\Schuelerverwaltung\\Images\\Loading\\" + c + ".png")
                        .getImage().getScaledInstance(loading_width, loading_height, Image.SCALE_AREA_AVERAGING)));

                if (c > 85) {

                    t2 = 22;
                }

            }

        }

        if (rotation == true) {
            for (int t = 0; t < rotations; t++) {
                for (int i = 1; i < 61; i += loadingTime + 2) {
                    Thread.sleep(0);
                    l.setIcon(
                            new ImageIcon(new ImageIcon("Java\\src\\Schuelerverwaltung\\Images\\Loading\\" + i + ".png")
                                    .getImage()
                                    .getScaledInstance(loading_width, loading_height, Image.SCALE_AREA_AVERAGING)));

                }

                for (int c = 60; c < 99; c += loadingTime + 2) {
                    Thread.sleep(0);
                    l.setIcon(
                            new ImageIcon(new ImageIcon("Java\\src\\Schuelerverwaltung\\Images\\Loading\\" + c + ".png")
                                    .getImage()
                                    .getScaledInstance(loading_width, loading_height, Image.SCALE_AREA_AVERAGING)));

                }
            }

        }

        l.setVisible(false);

    }

    public void clearBox() {
        box2.removeAll();
    }

    public void addToBox(int i) {
        if (i == 1) {
            JLabel ei;

            for (int e = 0; e < arraysList.rar.length; e++) {

                javax.swing.JButton wahlOption = new JButton();
                wahlOption.setForeground(new Color(80, 0, 255));
                wahlOption.setFont(new Font("Times new Roman", Font.PLAIN, 60));
                wahlOption.setBounds(0, 0, 0, 0);
                wahlOption.setBackground(Color.black);
                wahlOption.setVisible(true);
                wahlOption.setFocusable(false);
                wahlOption.addActionListener(this);
                wahlOption.setActionCommand(arraysList.rar[e]);
                wahlOption.setBorder(new LineBorder(Color.white));

                ei = new JLabel();
                ei.setFont(new Font("Times new Roman", Font.PLAIN, 30));
                ei.setIcon(new ImageIcon(new ImageIcon(
                        "Java\\src\\Schuelerverwaltung\\Images\\Seltenheiten\\" + arraysList.rar[e] + ".png")
                        .getImage().getScaledInstance(100, 95, Image.SCALE_AREA_AVERAGING)));
                ei.setSize(600, 600);
                ei.setBackground(Color.white);
                ei.setVisible(true);
                ei.setFocusable(false);
                ei.setBorder(new LineBorder(Color.white));

                box2.add(wahlOption);
                wahlOption.add(ei);

            }
        }

        if (i == 2) {
            JLabel ei;

            for (int e = 0; e < arraysList.elemente.length; e++) {

                javax.swing.JButton wahlOption = new JButton();
                wahlOption.setForeground(new Color(80, 0, 255));
                wahlOption.setFont(new Font("Times new Roman", Font.PLAIN, 60));
                wahlOption.setBounds(0, 0, 0, 0);
                wahlOption.setBackground(Color.black);
                wahlOption.setVisible(true);
                wahlOption.setFocusable(false);
                wahlOption.addActionListener(this);
                wahlOption.setActionCommand(arraysList.elemente[e]);
                wahlOption.setBorder(new LineBorder(Color.white));

                ei = new JLabel();
                ei.setFont(new Font("Times new Roman", Font.PLAIN, 30));
                ei.setIcon(new ImageIcon(new ImageIcon(
                        "Java\\src\\Schuelerverwaltung\\Images\\Elemente\\" + arraysList.elemente[e] + ".png")
                        .getImage().getScaledInstance(100, 95, Image.SCALE_AREA_AVERAGING)));
                ei.setSize(600, 600);
                ei.setBackground(Color.white);
                ei.setVisible(true);
                ei.setFocusable(false);
                ei.setBorder(new LineBorder(Color.white));

                box2.add(wahlOption);
                wahlOption.add(ei);

            }
        }

        if (i == 3) {
            JLabel ei;

            for (int e = 0; e < arraysList.skills.length; e++) {

                javax.swing.JButton wahlOption = new JButton();
                wahlOption.setForeground(new Color(80, 0, 255));
                wahlOption.setFont(new Font("Times new Roman", Font.PLAIN, 60));
                wahlOption.setBounds(0, 0, 0, 0);
                wahlOption.setBackground(Color.black);
                wahlOption.setVisible(true);
                wahlOption.setFocusable(false);
                wahlOption.addActionListener(this);
                wahlOption.setActionCommand(arraysList.skills[e]);
                wahlOption.setBorder(new LineBorder(Color.white));

                ei = new JLabel();
                ei.setFont(new Font("Times new Roman", Font.PLAIN, 30));
                ei.setIcon(new ImageIcon(new ImageIcon(
                        "Java\\src\\Schuelerverwaltung\\Images\\Fähigkeiten\\" + arraysList.skills[e] + ".png")
                        .getImage().getScaledInstance(100, 95, Image.SCALE_AREA_AVERAGING)));
                ei.setSize(600, 600);
                ei.setBackground(Color.white);
                ei.setVisible(true);
                ei.setFocusable(false);
                ei.setBorder(new LineBorder(Color.white));

                box2.add(wahlOption);
                wahlOption.add(ei);

            }
        }

    }

    private void ret() {
        if (confirmButton.getActionCommand().equals("ConfirmName")) {
            randomName();
        }
    }

    public String randomName() {
        int x = (int) (Math.random() * 100);
        if (x > 50) {
            x = (int) (Math.random() * 100);
            texarea.setText("");
            for (int a = 1; a < 3; a++) {
                texarea.setText(texarea.getText() + texts.randomNames[x]);
                x = (int) (Math.random() * 100);

            }
            return texarea.getText();
        }

        if (x < 50) {
            x = (int) (Math.random() * 100);
            texarea.setText("");
            for (int a = 1; a < 2; a++) {
                texarea.setText(texarea.getText() + texts.randomNames[x]);
                x = (int) (Math.random() * 100);

            }

            x = (int) (Math.random() * 100); // x Wird neu generiert (0-100)
            if (x < 60)
                texarea.setText(texarea.getText() + x); // 60%, dass der Name eine Zufällige Zahl am Ende bekommt
            return texarea.getText();
        }
        return null;
    }

    private void anmelden() {
        option[5].setActionCommand("Abmelden");
        if (texarea.getText().length() > 4 && texarea.getText().length() < 16) {

            if (texarea.getText().charAt(0) == '0' && user.password < 1) {
                infoText.setText("0 darf nicht am Anfang stehen");
                warn(2000, "Anmelden - Warn", "0 darf nicht am Anfang \nstehen", "Anmelden-System", "");
                loadingValues[3] = true;
                return;
            }
            try {
                if (user.password < 10000) {

                    passwordController = texarea.getText().toString();

                    passwordController = passwordController.replaceAll("\\D+", "");

                    passwordNumbers = Integer.parseInt(passwordController);
                    if (passwordNumbers > 10000) {
                        dataStore.password = passwordNumbers;
                        user.password = passwordNumbers;
                        warn(4000, "Konto - Warn", "Name: " + user.name + "\nPassword: " + user.password, "Anmelden-System", "");
                        loadingValues[3] = true;
                        infoText.setText("Erfolgreich angemeldet");
                        randomButton.setVisible(false);
                        texarea.setVisible(false);
                        confirmButton.setVisible(false);
                        search_Box.setVisible(false);
                        infoText.setVisible(false);
                        dataStore.angemeldet = true;
                        user.angemeldet = true;
                        showOptions(true, 0);
                    }
                }

                if (user.password > 10000) {
                    if (user.password == Integer.parseInt(texarea.getText().toString())) {
                        infoText.setText("Erfolgreich angemeldet");
                        randomButton.setVisible(false);
                        texarea.setVisible(false);
                        confirmButton.setVisible(false);
                        search_Box.setVisible(false);
                        infoText.setVisible(false);
                        dataStore.angemeldet = true;
                        user.angemeldet = true;
                        showOptions(true, 0);
                    }

                    if (user.password != Integer.parseInt(texarea.getText().toString())) {
                      //  infoText.setText("Password: Falsch");
                            warn(2000, "Anmelden - Warn", "Passwort: Falsch", "Anmelden-System", "");
                            loadingValues[3] = true;
                        
                    }

                }
            } catch (Exception d) {
                System.err.println("");
            }
        }else {
            if (texarea.getText().length() < 4){
                warn(2000, "Anmelden - Warn", "Passwort ist kurz", "Anmelden-System", "");
                loadingValues[3] = true;
            }

            if (texarea.getText().length() > 16){
                warn(2000, "Anmelden - Warn", "Passwort ist lang", "Anmelden-System", "");
                loadingValues[3] = true;
            }
        }
    }

    public String generateObject(String[] a) {
        Random rd = new Random();
        rd2 = rd.nextInt(a.length);
        if (texarea.getText().equals(a[rd2])) {
            for (int i = 0; i < 15; i++) {
                rd2 = rd.nextInt(a.length);
                if (!texarea.getText().equals(a[rd2])) {
                    break;
                }
            }
        }

        return a[rd2];
    }

    public int generateNumber(int i, int v) {
        int x = i + (int) (Math.random() * (v));

        return x;
    }

    private void confirmName() {
        if (user.name != null) {

            if (!texarea.getText().toString().equals(user.name)) {
                //infoText.setText("Name: Falsch");
                warn(2000, "Anmelden - Warn", "Name: Falsch", "Anmelden-System", "");
                loadingValues[3] = true;

            }

            if (texarea.getText().toString().equals(user.name)) {
                infoText.setText("Passwort eingeben (5-10 Charakter)");
                confirmButton.setActionCommand("ConfirmPassword");
                eRandomButton.setActionCommand("GenerateNumber");
                texarea.setText(null);
                if (user.password < 10000) {
                    randomButton.setVisible(true);
                }
            }
        }

        if (texarea.getText().length() > 3 && texarea.getText().length() < 21) {
            if (user.name == null) {
                dataStore.name = texarea.getText().toString();
                user.name = texarea.getText().toString();
                infoText.setText("Passwort eingeben (5-10 Charakter)");
                confirmButton.setActionCommand("ConfirmPassword");
                eRandomButton.setActionCommand("GenerateNumber");
                texarea.setText(null);
                if (user.password < 10000) {
                    randomButton.setVisible(true);
                }
            } else{
                if (texarea.getText().length() < 4){
                    warn(2000, "Anmelden - Warn", "Name ist kurz", "Anmelden-System", "");
                    loadingValues[3] = true;
                }

                if (texarea.getText().length() > 20){
                    warn(2000, "Anmelden - Warn", "Name ist lang", "Anmelden-System", "");
                    loadingValues[3] = true;
                }

            }
        }

    }

    public void confirmCardName() {
        if (cardIndex < 0 && texarea.getText().length() > 3 && texarea.getText().length() < 21) {
            dataStore.temp_KarteName = texarea.getText();
            texarea.setText(null);
            eRandomButton.setActionCommand("GenerateRarity");
            confirmButton.setActionCommand("ConfirmCardRarity");
            showOptions(false, 0);
            infoText.setText("Seltenheit Auswählen");
            addToBox(1);
            box2.setVisible(true);
            texarea.setEditable(false);
            loadingValues[0] = true;

        }

        if (cardIndex >= 0 && texarea.getText().length() > 3 && texarea.getText().length() < 21) {
            dataStore.temp_KarteName = texarea.getText();
            texarea.setText(karten[cardIndex].karte_Seltenheit);
            eRandomButton.setActionCommand("GenerateRarity");
            confirmButton.setActionCommand("ConfirmCardRarity");
            showOptions(false, 0);
            infoText.setText("Seltenheit Ändern");
            addToBox(1);
            box2.setVisible(true);
            texarea.setEditable(false);
            sec_Image.setVisible(true);
            sec_Image.setIcon(new ImageIcon(new ImageIcon(
                    "Java\\src\\Schuelerverwaltung\\Images\\Seltenheiten\\" + texarea.getText() + ".png")
                    .getImage().getScaledInstance(50, 45, Image.SCALE_AREA_AVERAGING)));
            loadingValues[0] = true;

        }

    }

    public void confirmCardRarity() {
        if (cardIndex < 0 && texarea.getText().length() > 2 && texarea.getText().length() < 16) {
            dataStore.temp_KarteSeltenheit = texarea.getText();
            texarea.setText(null);
            eRandomButton.setActionCommand("GenerateDamage");
            confirmButton.setActionCommand("ConfirmCardDamage");
            infoText.setText("Damage eingeben (0-1000)");
            texarea.setEditable(true);
            l2.setVisible(false);
            box2.setVisible(false);
            sec_Image.setVisible(false);
            sec_Image.setIcon(null);
            clearBox();
        }

        if (cardIndex >= 0 && texarea.getText().length() > 2 && texarea.getText().length() < 16) {
            dataStore.temp_KarteSeltenheit = texarea.getText();
            texarea.setText(karten[cardIndex].karte_Damage);
            eRandomButton.setActionCommand("GenerateDamage");
            confirmButton.setActionCommand("ConfirmCardDamage");
            infoText.setText("Damage Ändern (0-1000)");
            texarea.setEditable(true);
            l2.setVisible(false);
            box2.setVisible(false);
            sec_Image.setVisible(false);
            sec_Image.setIcon(null);
            clearBox();
        }
    }

    public void confirmCardDamage() {
        if (cardIndex < 0 && texarea.getText().length() > 0 && Integer.parseInt(texarea.getText()) >= 0
                && Integer.parseInt(texarea.getText()) < 1001) {
            dataStore.temp_KarteDamage = texarea.getText();
            texarea.setText(null);
            eRandomButton.setActionCommand("GenerateDamage");
            confirmButton.setActionCommand("ConfirmCardHP");
            infoText.setText("HP eingeben (0-1000)");
        }

        if (cardIndex >= 0 && texarea.getText().length() > 0 && Integer.parseInt(texarea.getText()) >= 0
                && Integer.parseInt(texarea.getText()) < 1001) {
                    if (karten[cardIndex].karte_Ability == null) {
                        dataStore.temp_KarteDamage = texarea.getText();
                        texarea.setText(karten[cardIndex].karte_HP);
                        eRandomButton.setActionCommand("GenerateDamage");
                        confirmButton.setActionCommand("ConfirmCardHP");
                        infoText.setText("HP eingeben (0-1000)");
            
                    }
            if (karten[cardIndex].karte_Ability != null) {
                System.out.println(karten[cardIndex].karte_Ability);
                if (karten[cardIndex].karte_Ability.equals("Ghost")) {
                    dataStore.temp_KarteDamage = texarea.getText();
                    texarea.setText(karten[cardIndex].karte_HP);
                    eRandomButton.setActionCommand("GenerateDamage");
                    confirmButton.setActionCommand("ConfirmCardHP");
                    infoText.setText("HP Ändern (-1000-1000)");
                } else {
                    if (texarea.getText().length() > 0 && Integer.parseInt(texarea.getText()) >= 0
                            && Integer.parseInt(texarea.getText()) < 1001) {
                        dataStore.temp_KarteDamage = texarea.getText();
                        texarea.setText(karten[cardIndex].karte_HP);
                        eRandomButton.setActionCommand("GenerateDamage");
                        confirmButton.setActionCommand("ConfirmCardHP");
                        infoText.setText("HP eingeben (0-1000)");
                    }
                }

            }
        }


    }

    public void confirmCardHP() {
        if (cardIndex < 0 && texarea.getText().length() > 0 && Integer.parseInt(texarea.getText()) >= 0
                && Integer.parseInt(texarea.getText()) < 1001) {
            dataStore.temp_KarteHP = texarea.getText();
            texarea.setText(null);
            eRandomButton.setActionCommand("GenerateAgility");
            confirmButton.setActionCommand("ConfirmCardAgility");
            infoText.setText("Agilität eingeben (0-100)");
        }

        if (cardIndex >= 0) {
            if (karten[cardIndex].karte_Ability != null) {
                if (karten[cardIndex].karte_Ability.equals("Ghost")) {
                    if (texarea.getText().length() > 0 && Integer.parseInt(texarea.getText()) >= -1000
                            && Integer.parseInt(texarea.getText()) < 1001) {
                        dataStore.temp_KarteHP = texarea.getText();
                        texarea.setText(karten[cardIndex].karte_Agility);
                        eRandomButton.setActionCommand("GenerateAgility");
                        confirmButton.setActionCommand("ConfirmCardAgility");
                        infoText.setText("Agilität eingeben (0-100)");
                    }

                } else {
                    if (texarea.getText().length() > 0 && Integer.parseInt(texarea.getText()) >= 0
                            && Integer.parseInt(texarea.getText()) < 1001) {
                        dataStore.temp_KarteHP = texarea.getText();
                        texarea.setText(karten[cardIndex].karte_Agility);
                        eRandomButton.setActionCommand("GenerateAgility");
                        confirmButton.setActionCommand("ConfirmCardAgility");
                        infoText.setText("Agilität eingeben (0-100)");
                    }
                }
            }

            if (karten[cardIndex].karte_Ability == null) {
                if (texarea.getText().length() > 0 && Integer.parseInt(texarea.getText()) >= 0
                        && Integer.parseInt(texarea.getText()) < 1001) {
                    dataStore.temp_KarteHP = texarea.getText();
                    texarea.setText(karten[cardIndex].karte_Agility);
                    eRandomButton.setActionCommand("GenerateAgility");
                    confirmButton.setActionCommand("ConfirmCardAgility");
                    infoText.setText("Agilität eingeben (0-100)");
                }
            }

        }
    }

    public void confirmCardAgility() {
        if (cardIndex < 0 && texarea.getText().length() > 0 && Integer.parseInt(texarea.getText()) >= 0
                && Integer.parseInt(texarea.getText()) < 101) {
            dataStore.temp_KarteAgility = texarea.getText();
            texarea.setText(null);
            eRandomButton.setActionCommand("GenerateElement");
            confirmButton.setActionCommand("ConfirmCardElement");
            infoText.setText("Element auswählen");
            clearBox();
            addToBox(2);
            box2.setVisible(true);
            texarea.setEditable(false);
            sec_Image.setVisible(true);
        }

        if (cardIndex >= 0 && texarea.getText().length() > 0 && Integer.parseInt(texarea.getText()) >= 0
                && Integer.parseInt(texarea.getText()) < 101) {
            dataStore.temp_KarteAgility = texarea.getText();
            texarea.setText(karten[cardIndex].karte_Element);
            sec_Image.setIcon(new ImageIcon(new ImageIcon(
                    "Java\\src\\Schuelerverwaltung\\Images\\Elemente\\" + texarea.getText() + ".png").getImage()
                    .getScaledInstance(50, 45, Image.SCALE_AREA_AVERAGING)));
            sec_Image.setVisible(true);
            eRandomButton.setActionCommand("GenerateElement");
            confirmButton.setActionCommand("ConfirmCardElement");
            infoText.setText("Element Ändern");
            clearBox();
            addToBox(2);
            box2.setVisible(true);
            texarea.setEditable(false);
            sec_Image.setVisible(true);
        }

    }

    public void confirmCardElement() {
        if (cardIndex < 0 && texarea.getText().length() > 3) {
            dataStore.temp_KarteElement = texarea.getText();
            texarea.setText(null);
            eRandomButton.setActionCommand("GenerateAbility");
            confirmButton.setActionCommand("ConfirmCardAbility");
            infoText.setText("(optional) Ability auswählen");
            clearBox();
            box2.setVisible(false);
            addToBox(3);
            box2.setVisible(true);
            sec_Image.setIcon(null);
            descriptionBox.setVisible(true);
        }

        if (cardIndex >= 0 && texarea.getText().length() > 3) {
            dataStore.temp_KarteElement = texarea.getText();
            if (karten[cardIndex].karte_Ability != null) {
                texarea.setText(karten[cardIndex].karte_Ability);
                sec_Image.setIcon(new ImageIcon(new ImageIcon(
                        "Java\\src\\Schuelerverwaltung\\Images\\Fähigkeiten\\" + texarea.getText() + ".png")
                        .getImage().getScaledInstance(50, 45, Image.SCALE_AREA_AVERAGING)));
                sec_Image.setVisible(true);
            }
            eRandomButton.setActionCommand("GenerateAbility");
            confirmButton.setActionCommand("ConfirmCardAbility");
            infoText.setText("(optional) Ability auswählen");
            clearBox();
            box2.setVisible(false);
            addToBox(3);
            box2.setVisible(true);
            descriptionBox.setVisible(true);
        }

    }

    // String s = "Bewertung: 4"
    // s = s.replaceAll("\\D+","");

    // int n = Integer.parseInt(s);

    public void confirmCardAbility() {
        if (cardIndex < 0) {
            dataStore.temp_KarteAbility = texarea.getText();
            texarea.setText(null);
            eRandomButton.setActionCommand("RandomName");
            confirmButton.setActionCommand("option[0]");
            infoText.setVisible(false);
            backB.setVisible(false);
            texarea.setVisible(false);
            confirmButton.setVisible(false);
            randomButton.setVisible(false);
            l2.setVisible(false);
            clearBox();
            box2.setVisible(false);
            sec_Image.setVisible(false);
            sec_Image.setIcon(null);
            descriptionBox.setVisible(false);
            loadingValues[1] = true;

            checkCards();
           

        }

        if (cardIndex >= 0) {
            dataStore.temp_KarteAbility = texarea.getText();

            texarea.setText(null);
            eRandomButton.setActionCommand("RandomName");
            confirmButton.setActionCommand("option[0]");
            infoText.setVisible(false);
            backB.setVisible(false);
            texarea.setVisible(false);
            confirmButton.setVisible(false);
            randomButton.setVisible(false);
            l2.setVisible(false);
            clearBox();
            box2.setVisible(false);
            sec_Image.setVisible(false);
            sec_Image.setIcon(null);
            descriptionBox.setVisible(false);
            loadingValues[1] = true;

            karten[cardIndex].karte_Name = dataStore.temp_KarteName;
            karten[cardIndex].karte_Seltenheit = dataStore.temp_KarteSeltenheit;
            karten[cardIndex].karte_Damage = dataStore.temp_KarteDamage;
            karten[cardIndex].karte_HP = dataStore.temp_KarteHP;
            karten[cardIndex].karte_Agility = dataStore.temp_KarteAgility;
            karten[cardIndex].karte_Element = dataStore.temp_KarteElement;
            karten[cardIndex].karte_Ability = dataStore.temp_KarteAbility;

            arraysList.search_Results[cardIndex + 1] = dataStore.temp_KarteName;

            if (karten[cardIndex].karte_Ability != null && Integer.parseInt(karten[cardIndex].karte_HP) < 0) {
                if (!karten[cardIndex].karte_Ability.equals("Ghost")) {
                    loadingValues[3] = true;
                    warn(3000, "HP - Warn", "HP:" + karten[cardIndex].karte_HP + " > " + Math.abs(Integer.parseInt(karten[cardIndex].karte_HP)), "Info", "Java\\src\\Schuelerverwaltung\\Images\\Fähigkeiten\\" + karten[cardIndex].karte_Ability + ".png");
                    karten[cardIndex].karte_HP = "" + Math.abs(Integer.parseInt(karten[cardIndex].karte_HP));
                }
            }

            dataStore.clearSavedTempCard();
            cardIndex = -1;

        }

    }

    public void instanceCard() {
        for (int v21 = 0; v21 < 9; v21++) {
            if (v21 == 0) {
                if (karten[0] == null) {
                    karten[0] = new Karte();
                    System.out.println(v21);
                    return;
                }
            }

            if (v21 > 0 && karten[v21] == null && karten[v21 - 1] != null) {
                karten[v21] = new Karte();
                System.out.println(v21);
                return;
            }
        }

    }

    public void checkCards() {
        instanceCard();
        if (karten[0].karte_Name.equals("N/A")) {
            createCard(0);
            return;
        }
        if (karten[1].karte_Name.equals("N/A")) {
            createCard(1);
            return;
        }

        if (karten[2].karte_Name.equals("N/A")) {
            createCard(2);
            return;
        }

        if (karten[3].karte_Name.equals("N/A")) {
            createCard(3);
            return;
        }

        if (karten[4].karte_Name.equals("N/A")) {
            createCard(4);
            return;
        }

        if (karten[5].karte_Name.equals("N/A")) {
            createCard(5);
            return;
        }

        if (karten[6].karte_Name.equals("N/A")) {
            createCard(6);
            return;
        }

        if (karten[7].karte_Name.equals("N/A")) {
            createCard(7);
            return;
        }

        if (karten[8].karte_Name.equals("N/A")) {
            createCard(8);
            return;
        }

        if (karten[9].karte_Name.equals("N/A")) {
            createCard(9);
            return;
        }
    }

    public void createCard(int i) {

        karten[i].karte_Name = dataStore.temp_KarteName;
        karten[i].karte_Seltenheit = dataStore.temp_KarteSeltenheit;
        karten[i].karte_Damage = dataStore.temp_KarteDamage;
        karten[i].karte_HP = dataStore.temp_KarteHP;
        karten[i].karte_Agility = dataStore.temp_KarteAgility;
        karten[i].karte_Element = dataStore.temp_KarteElement;
        karten[i].karte_Ability = dataStore.temp_KarteAbility;
        karten[i].karte_ID = dataStore.temp_KarteID;
        karten[i].karte_ID = "" + generateNumber(10000, 1000000);

        arraysList.search_Results[i + 1] = dataStore.temp_KarteName;

        dataStore.clearSavedTempCard();

       
    }

    public void option1_1() {
        if (cardIndex < 0) {
            if (karten[9] == null) {
                texarea.setText(null);
                texarea.setVisible(true);
                texarea.setEditable(true);
                confirmButton.setVisible(true);
                randomButton.setVisible(true);
                eRandomButton.setActionCommand("RandomName");
                confirmButton.setActionCommand("ConfirmCardName");
                sec_Image.setVisible(false);
                showOptions(false, 0);
                infoText.setVisible(true);
                infoText.setText("Name eingeben (4-20 Charakter)");
                backB.setVisible(true);
                texarea.setText(dataStore.temp_KarteName);
                box2.setVisible(false);
                clearBox();

                dataStore.clearSavedTempCard();
            }
        }

        if (cardIndex >= 0) {
            texarea.setText(karten[cardIndex].karte_Name);
            texarea.setVisible(true);
            texarea.setEditable(true);
            confirmButton.setVisible(true);
            randomButton.setVisible(true);
            eRandomButton.setActionCommand("RandomName");
            confirmButton.setActionCommand("ConfirmCardName");
            sec_Image.setVisible(false);
            showOptions(false, 0);
            infoText.setVisible(true);
            infoText.setText("Name Bearbeiten (4-20 Charakter)");
            backB.setVisible(true);
            box2.setVisible(false);
            clearBox();

        }

    }

    public void showCardInfo(int card){
        if (karten[card] != null){
            cardInfoText[0].setFont(new Font("Comic Sans MS", Font.BOLD, 35 - karten[card].karte_Name.length()));
            cardInfoText[1].setFont(new Font("Comic Sans MS", Font.PLAIN, 36 - karten[card].karte_Seltenheit.length()));
            cardInfoText[2].setFont(new Font("Comic Sans MS", Font.PLAIN, 40 - karten[card].karte_Name.length()));
            cardInfoText[3].setFont(new Font("Comic Sans MS", Font.PLAIN, 40 - karten[card].karte_Name.length()));
            cardInfoText[4].setFont(new Font("Comic Sans MS", Font.PLAIN, 40 - karten[card].karte_Name.length()));
            cardInfoText[5].setFont(new Font("Comic Sans MS", Font.PLAIN, 40 - karten[card].karte_Element.length()));
            cardInfoText[6].setFont(new Font("Comic Sans MS", Font.PLAIN, 40 - karten[card].karte_Ability.length()));
            cardInfoText[7].setFont(new Font("Comic Sans MS", Font.ITALIC, 40 - karten[card].karte_ID.length()));



            cardInfoMenu.setVisible(true);
            cardInfoImage.setVisible(true);
            cardInfoText[0].setVisible(true);
            cardInfoText[1].setVisible(true);
            cardInfoText[2].setVisible(true);
            cardInfoText[3].setVisible(true);
            cardInfoText[4].setVisible(true);
            cardInfoText[5].setVisible(true);
            cardInfoText[6].setVisible(true);
            cardInfoText[7].setVisible(true);
            cardInfoText[0].setText(karten[card].karte_Name);
            cardInfoText[1].setText(karten[card].karte_Seltenheit);
            cardInfoText[2].setText(karten[card].karte_Damage);
            cardInfoText[3].setText(karten[card].karte_HP);
            cardInfoText[4].setText(karten[card].karte_Agility);
            cardInfoText[5].setText(karten[card].karte_Element);
            cardInfoText[6].setText(karten[card].karte_Ability);
            cardInfoText[7].setText("                    " + karten[card].karte_ID);

            for (int i = 0; i<arraysList.rar.length; i++){
                if (cardInfoText[1].getText().equals(arraysList.rar[i])){
                    cardInfoText[1].setForeground(arraysList.rar_colors[i]);
                    cardInfoText[1].setIcon(new ImageIcon(new ImageIcon("Java\\src\\Schuelerverwaltung\\Images\\Seltenheiten\\" + cardInfoText[1].getText() + ".png").getImage().getScaledInstance(36, 36, Image.SCALE_AREA_AVERAGING)));
                }
            }

            for (int i = 0; i<arraysList.elemente.length; i++){
                if (cardInfoText[5].getText().equals(arraysList.elemente[i])){
                    cardInfoText[5].setForeground(arraysList.elemente_colors[i]);
                    cardInfoText[5].setIcon(new ImageIcon(new ImageIcon("Java\\src\\Schuelerverwaltung\\Images\\Elemente\\" + cardInfoText[5].getText() + ".png").getImage().getScaledInstance(36, 36, Image.SCALE_AREA_AVERAGING)));
                }
            }

            for (int i = 0; i<arraysList.skills.length; i++){
                if (cardInfoText[6].getText().equals(arraysList.skills[i])){
                    cardInfoText[6].setForeground(arraysList.skills_colors[i]);
                    cardInfoText[6].setIcon(new ImageIcon(new ImageIcon("Java\\src\\Schuelerverwaltung\\Images\\Fähigkeiten\\" + cardInfoText[6].getText() + ".png").getImage().getScaledInstance(36, 36, Image.SCALE_AREA_AVERAGING)));
                }
            }

            if (Integer.parseInt(cardInfoText[2].getText()) + Integer.parseInt(cardInfoText[3].getText()) + Integer.parseInt(cardInfoText[4].getText()) < 800){
                cardInfoImage.setIcon(new ImageIcon(new ImageIcon("Java\\src\\Schuelerverwaltung\\Images\\Karten\\Silver.jpg").getImage().getScaledInstance(350, 220, Image.SCALE_AREA_AVERAGING)));
                cardInfoText[2].setForeground(new Color(200,200,200));
                cardInfoText[3].setForeground(new Color(200,200,200));
                cardInfoText[4].setForeground(new Color(200,200,200));
            }    
            
            if (Integer.parseInt(cardInfoText[2].getText()) + Integer.parseInt(cardInfoText[3].getText()) + Integer.parseInt(cardInfoText[4].getText()) > 800){
                cardInfoImage.setIcon(new ImageIcon(new ImageIcon("Java\\src\\Schuelerverwaltung\\Images\\Karten\\Gold.png").getImage().getScaledInstance(350, 220, Image.SCALE_AREA_AVERAGING)));
                cardInfoText[2].setForeground(new Color(255,200,0));
                cardInfoText[3].setForeground(new Color(255,200,0));
                cardInfoText[4].setForeground(new Color(150,0,0));
            }    
            
            if (Integer.parseInt(cardInfoText[2].getText()) + Integer.parseInt(cardInfoText[3].getText()) + Integer.parseInt(cardInfoText[4].getText()) > 1600){
                cardInfoImage.setIcon(new ImageIcon(new ImageIcon("Java\\src\\Schuelerverwaltung\\Images\\Karten\\Elite.png").getImage().getScaledInstance(350, 220, Image.SCALE_AREA_AVERAGING)));
                cardInfoText[2].setForeground(new Color(25,255,255));
                cardInfoText[3].setForeground(new Color(255,25,255));
                cardInfoText[4].setForeground(new Color(255,255,255));
            }

        }  
    }

    public void showcards(){
        showOptions(false,0);
        cardsMenu.removeAll();
        cardsMenu.setVisible(true);
        if (karten[0] != null && !karten[0].karte_Name.equals("N/A")){
            showCardsButtons[0] = new JButton(karten[0].karte_Name);
            showCardsButtons[0].addActionListener(this);
            showCardsButtons[0].setActionCommand("Karte1");
            showCardsButtons[0].setForeground(new Color(255, 255, 255));
            showCardsButtons[0].setBounds(0, 0, 200, 200); 
            showCardsButtons[0].setBorder(new LineBorder(new Color(255,255,255)));
            showCardsButtons[0].setBackground(Color.BLACK);
            showCardsButtons[0].setFont(new Font("Times new Roman", Font.PLAIN, 70)); 
            showCardsButtons[0].setBorder(new LineBorder(new Color(255,255,255)));
            cardsMenu.add(showCardsButtons[0]);

        }
       
        if (karten[1] != null && !karten[1].karte_Name.equals("N/A")){
        showCardsButtons[1] = new JButton(karten[1].karte_Name);
        showCardsButtons[1].addActionListener(this);
        showCardsButtons[1].setActionCommand("Karte2");
        showCardsButtons[1].setForeground(new Color(255,255,255));
        showCardsButtons[1].setBounds(0, 0, 200, 200); 
        showCardsButtons[1].setBorder(new LineBorder(new Color(255,255,255)));
        showCardsButtons[1].setBackground(Color.BLACK);
        showCardsButtons[1].setFont(new Font("Times new Roman", Font.PLAIN, 70)); 
        showCardsButtons[1].setBorder(new LineBorder(new Color(255,255,255)));
        }
        if (karten[2] != null && !karten[2].karte_Name.equals("N/A")){
        showCardsButtons[2] = new JButton(karten[2].karte_Name);
        showCardsButtons[2].addActionListener(this);
        showCardsButtons[2].setActionCommand("Karte3");
        showCardsButtons[2].setForeground(new Color(255,255,255));
        showCardsButtons[2].setBounds(0, 0, 200, 200); 
        showCardsButtons[2].setBorder(new LineBorder(new Color(255,255,255)));
        showCardsButtons[2].setBackground(Color.BLACK);
        showCardsButtons[2].setFont(new Font("Times new Roman", Font.PLAIN, 70)); 
        showCardsButtons[2].setBorder(new LineBorder(new Color(255,255,255)));
        }
        if (karten[3] != null && !karten[3].karte_Name.equals("N/A")){
        showCardsButtons[3] = new JButton(karten[3].karte_Name);
        showCardsButtons[3].setForeground(new Color(255,255,255));
        showCardsButtons[3].setBounds(0, 0, 200, 200); 
        showCardsButtons[3].setBorder(new LineBorder(new Color(255,255,255)));
        showCardsButtons[3].setBackground(Color.BLACK);
        showCardsButtons[3].setFont(new Font("Times new Roman", Font.PLAIN, 70)); 
        showCardsButtons[3].setBorder(new LineBorder(new Color(255,255,255)));
        }
        if (karten[4] != null && !karten[4].karte_Name.equals("N/A")){
        showCardsButtons[4] = new JButton(karten[4].karte_Name);
        showCardsButtons[4].setForeground(new Color(255,255,255));
        showCardsButtons[4].setBounds(0, 0, 200, 200); 
        showCardsButtons[4].setBorder(new LineBorder(new Color(255,255,255)));
        showCardsButtons[4].setBackground(Color.BLACK);
        showCardsButtons[4].setFont(new Font("Times new Roman", Font.PLAIN, 70)); 
        showCardsButtons[4].setBorder(new LineBorder(new Color(255,255,255)));
        }
        if (karten[5] != null && !karten[5].karte_Name.equals("N/A")){
        showCardsButtons[5] = new JButton(karten[5].karte_Name);
        showCardsButtons[5].setForeground(new Color(255,255,255));
        showCardsButtons[5].setBounds(0, 0, 200, 200); 
        showCardsButtons[5].setBorder(new LineBorder(new Color(255,255,255)));
        showCardsButtons[5].setBackground(Color.BLACK);
        showCardsButtons[5].setFont(new Font("Times new Roman", Font.PLAIN, 70)); 
        showCardsButtons[5].setBorder(new LineBorder(new Color(255,255,255)));
        }
        if (karten[6] != null && !karten[6].karte_Name.equals("N/A")){
        showCardsButtons[6] = new JButton(karten[6].karte_Name);
        showCardsButtons[6].setForeground(new Color(255,255,255));
        showCardsButtons[6].setBounds(0, 0, 200, 200); 
        showCardsButtons[6].setBorder(new LineBorder(new Color(255,255,255)));
        showCardsButtons[6].setBackground(Color.BLACK);
        showCardsButtons[6].setFont(new Font("Times new Roman", Font.PLAIN, 70)); 
        showCardsButtons[6].setBorder(new LineBorder(new Color(255,255,255)));
        }
        if (karten[7] != null && !karten[7].karte_Name.equals("N/A")){
        showCardsButtons[7] = new JButton(karten[7].karte_Name);
        showCardsButtons[7].setForeground(new Color(255,255,255));
        showCardsButtons[7].setBounds(0, 0, 200, 200); 
        showCardsButtons[7].setBorder(new LineBorder(new Color(255,255,255)));
        showCardsButtons[7].setBackground(Color.BLACK);
        showCardsButtons[7].setFont(new Font("Times new Roman", Font.PLAIN, 70)); 
        showCardsButtons[7].setBorder(new LineBorder(new Color(255,255,255)));
        cardsMenu.add(showCardsButtons[7]);
        }
        if (karten[8] != null && !karten[8].karte_Name.equals("N/A")){
        showCardsButtons[8] = new JButton(karten[8].karte_Name);
        showCardsButtons[8].setForeground(new Color(255,255,255));
        showCardsButtons[8].setBounds(0, 0, 200, 200); 
        showCardsButtons[8].setBorder(new LineBorder(new Color(255,255,255)));
        showCardsButtons[8].setBackground(Color.BLACK);
        showCardsButtons[8].setFont(new Font("Times new Roman", Font.PLAIN, 70)); 
        showCardsButtons[8].setBorder(new LineBorder(new Color(255,255,255)));
        cardsMenu.add(showCardsButtons[8]);
        }
        if (karten[9] != null && !karten[9].karte_Name.equals("N/A")){
        showCardsButtons[9] = new JButton(karten[9].karte_Name);
        showCardsButtons[9].setForeground(new Color(255,255,255));
        showCardsButtons[9].setBounds(0, 0, 200, 200); 
        showCardsButtons[9].setBorder(new LineBorder(new Color(255,255,255)));
        showCardsButtons[9].setBackground(Color.BLACK);
        showCardsButtons[9].setFont(new Font("Times new Roman", Font.PLAIN, 70)); 
        showCardsButtons[9].setBorder(new LineBorder(new Color(255,255,255)));
        cardsMenu.add(showCardsButtons[9]);
        }
        if (showCardsButtons[0] != null){
            cardsMenu.add(showCardsButtons[0]);
            showCardsButtons[0].setVisible(true);

        }

        if (showCardsButtons[1] != null){
            cardsMenu.add(showCardsButtons[1]);
            showCardsButtons[1].setVisible(true);

        }

        if (showCardsButtons[2] != null){
            cardsMenu.add(showCardsButtons[2]);
            showCardsButtons[2].setVisible(true);

        }
       
        /*
        showCardsButtons[3].setVisible(true);
        showCardsButtons[4].setVisible(true);
        showCardsButtons[5].setVisible(true);
        showCardsButtons[6].setVisible(true);
        showCardsButtons[7].setVisible(true);
        showCardsButtons[8].setVisible(true);
        showCardsButtons[9].setVisible(true);
        */
        
    }


    public void karteBearbeiten() {

        texarea.setVisible(true);
        texarea.setText(null);
        texarea.setEditable(true);

        confirmButton.setVisible(true);
        showOptions(false, 0);
        search_Box.setVisible(true);
        searchB1.setVisible(true);

        confirmButton.setActionCommand("show edit panel");
    }

    public void showEditPanel() {
        for (Byte i = 0; i < 10; i++) {
            if (karten[i] != null && karten[i].karte_Name.equals(texarea.getText())) {
                cardIndex = i;
                option1_1();
                break;
            }
        }

    }

    protected void showOptions(boolean b, int n) {
        if (n >= 0 && n < 6){
            option[n].setVisible(b);
            optionI[n].setVisible(b);
            option[n].setVisible(b);
            optionI[n].setVisible(b);
            option[n].setVisible(b);
            optionI[n].setVisible(b);
            option[n].setVisible(b);
            optionI[n].setVisible(b);
            option[n].setVisible(b);
            optionI[n].setVisible(b);
            option[n].setVisible(b);
            optionI[n].setVisible(b);
            n++;
            showOptions(b, n);
        }else {
            return;
        }

    }

    public void viewMenu() {
        texarea.setText(null);
        texarea.setVisible(false);
        confirmButton.setVisible(false);
        randomButton.setVisible(false);
        showOptions(true, 0);
        infoText.setText("Erfolgreich angemeldet");
        confirmButton.setActionCommand("");
        eRandomButton.setActionCommand("");
        backB.setVisible(false);
        box2.setVisible(false);
        clearBox();
        dataStore.clearSavedTempCard();
    }

    public void karteLöschen() {
        texarea.setVisible(true);
        texarea.setText(null);
        texarea.setEditable(true);

        confirmButton.setVisible(true);
        showOptions(false, 0);
        search_Box.setVisible(true);
        searchB1.setVisible(true);

        confirmButton.setActionCommand("Löschen Abfrage");

    }

    public void löschenAbfrage() {

        String löschendeKarte = texarea.getText();
        texarea.setVisible(false);
        texarea.setText(null);

        confirmButton.setVisible(false);
        showOptions(false, 0);
        search_Box.setVisible(false);
        searchB1.setVisible(false);

        for (int c = 0; c < 9; c++) {
            if (karten[c] != null && karten[c].karte_Name.equals(löschendeKarte)) {
                karten[c] = null;
                arraysList.search_Results[c + 1] = "";
            }
            löschendeKarte = null;

        }

        showOptions(true, 0);

    }

    public void saveCards() {
        for (int i = 0; i < 9; i++) {
            if (karten[i] != null) {
                dataStore.karten[i] = new Karte();
                dataStore.karten[i].karte_Name = karten[i].karte_Name;
                dataStore.karten[i].karte_Seltenheit = karten[i].karte_Seltenheit;
                dataStore.karten[i].karte_Damage = karten[i].karte_Damage;
                dataStore.karten[i].karte_HP = karten[i].karte_HP;
                dataStore.karten[i].karte_Agility = karten[i].karte_Agility;
                dataStore.karten[i].karte_Element = karten[i].karte_Element;
                dataStore.karten[i].karte_Ability = karten[i].karte_Ability;
                dataStore.karten[i].karte_ID = karten[i].karte_ID;
                System.out.println(dataStore.karten[i].karte_Ability);
            }
        }
    }

    public void saveData() {
        try {
            saveButton.setVisible(true);

            FileOutputStream f = new FileOutputStream("ver.dat");
            BufferedOutputStream b = new BufferedOutputStream(f);
            ObjectOutputStream o = new ObjectOutputStream(b);

            dataStore.name = user.name;
            dataStore.password = user.password;
            dataStore.angemeldet = user.angemeldet;
            dataStore.ver = true;

            saveCards();

            o.writeObject(dataStore);
            o.close();

            System.out.println(dataStore.name);
            System.out.println(dataStore.password);
        } catch (IOException d) {
            d.printStackTrace();
        }
    }

    private void abmelden() {
        showOptions(false, 0);
        loadingValues[2] = true;

    }

    public void actionPerformed(java.awt.event.ActionEvent e) {

        if (e.getSource() == eRandomButton) {

            if (e.getActionCommand().equals("RandomName")) {
                texarea.setText(randomName());
            }
            ;

            if (e.getActionCommand().equals("GenerateNumber")) {
                r1 = new Random();
                r2 = r1.nextInt(1000000);
                texarea.setText("" + generateNumber(10000, r2));
            }

            if (e.getActionCommand().equals("GenerateRarity")) {
                texarea.setText(generateObject(arraysList.rar));
                try {
                    sec_Image.setVisible(true);
                    sec_Image.setIcon(new ImageIcon(new ImageIcon(
                            "Java\\src\\Schuelerverwaltung\\Images\\Seltenheiten\\" + texarea.getText() + ".png")
                            .getImage().getScaledInstance(50, 45, Image.SCALE_AREA_AVERAGING)));

                } catch (Exception x) {
                    System.out.println(x.getStackTrace());
                }
            }

            if (e.getActionCommand().equals("GenerateDamage")) {
                r1 = new Random();
                r2 = r1.nextInt(1000);
                texarea.setText("" + generateNumber(r2, 1));
            }

            if (e.getActionCommand().equals("GenerateAgility")) {
                r1 = new Random();
                r2 = r1.nextInt(100);
                texarea.setText("" + generateNumber(r2, 1));
            }

            if (e.getActionCommand().equals("GenerateElement")) {
                texarea.setText(generateObject(arraysList.elemente));
                try {
                    sec_Image.setVisible(true);
                    sec_Image.setIcon(new ImageIcon(new ImageIcon(
                            "Java\\src\\Schuelerverwaltung\\Images\\Elemente\\" + texarea.getText() + ".png").getImage()
                            .getScaledInstance(50, 45, Image.SCALE_AREA_AVERAGING)));

                } catch (Exception x) {
                    System.out.println(x.getStackTrace());
                }
            }

            if (e.getActionCommand().equals("GenerateAbility")) {
                texarea.setText(generateObject(arraysList.skills));
                descriptionBox.setText(arraysList.skills_Beschreibung[rd2]);
                try {
                    sec_Image.setVisible(true);
                    sec_Image.setIcon(new ImageIcon(new ImageIcon(
                            "Java\\src\\Schuelerverwaltung\\Images\\Fähigkeiten\\" + texarea.getText() + ".png")
                            .getImage().getScaledInstance(50, 45, Image.SCALE_AREA_AVERAGING)));

                } catch (Exception x) {
                    System.out.println(x.getStackTrace());
                }
            }

        }

        if (e.getSource() == confirmButton) {

            if (e.getActionCommand().equals("ConfirmName")) {
                confirmName();
            }

            if (e.getActionCommand().equals("ConfirmPassword")) {
                anmelden();
            }

            if (e.getActionCommand().equals("ConfirmCardName")) {
                confirmCardName();
            }

            if (e.getActionCommand().equals("ConfirmCardRarity")) {
                confirmCardRarity();
            }

            if (e.getActionCommand().equals("ConfirmCardDamage")) {
                confirmCardDamage();
            }

            if (e.getActionCommand().equals("ConfirmCardHP")) {
                confirmCardHP();
            }

            if (e.getActionCommand().equals("ConfirmCardAgility")) {
                confirmCardAgility();
            }

            if (e.getActionCommand().equals("ConfirmCardElement")) {
                confirmCardElement();
            }

            if (e.getActionCommand().equals("ConfirmCardAbility")) {
                confirmCardAbility();
            }

        }

        if (e.getActionCommand().equals("Meine Karten")){
            showcards();
        }

        for (int c = 0; c<10; c++){
            if (e.getActionCommand().equals("Karte" + c)){
                System.out.println(c);
                c-=1;
                if (c<0){
                    c = 0;
                }
                showCardInfo(c);
                break;
        }

        }
       /* 
        if (e.getActionCommand().equals("Karte1")){
            System.out.println("K1");
            cardInfoText[0].setFont(new Font("Times new Roman", Font.PLAIN, 35 - karten[0].karte_Name.length()));
            cardInfoText[1].setFont(new Font("Times new Roman", Font.PLAIN, 36 - karten[0].karte_Seltenheit.length()));
            cardInfoText[2].setFont(new Font("Times new Roman", Font.PLAIN, 40 - karten[0].karte_Name.length()));
            cardInfoText[3].setFont(new Font("Times new Roman", Font.PLAIN, 40 - karten[0].karte_Name.length()));
            cardInfoText[4].setFont(new Font("Times new Roman", Font.PLAIN, 40 - karten[0].karte_Name.length()));
            cardInfoText[5].setFont(new Font("Times new Roman", Font.PLAIN, 40 - karten[0].karte_Element.length()));
            cardInfoText[6].setFont(new Font("Times new Roman", Font.PLAIN, 40 - karten[0].karte_Ability.length()));
            cardInfoText[7].setFont(new Font("Times new Roman", Font.PLAIN, 40 - karten[0].karte_ID.length()));



            cardInfoMenu.setVisible(true);
            cardInfoImage.setVisible(true);
            cardInfoText[0].setVisible(true);
            cardInfoText[1].setVisible(true);
            cardInfoText[2].setVisible(true);
            cardInfoText[3].setVisible(true);
            cardInfoText[4].setVisible(true);
            cardInfoText[5].setVisible(true);
            cardInfoText[6].setVisible(true);
            cardInfoText[7].setVisible(true);
            cardInfoText[0].setText(karten[0].karte_Name);
            cardInfoText[1].setText(karten[0].karte_Seltenheit);
            cardInfoText[2].setText(karten[0].karte_Damage);
            cardInfoText[3].setText(karten[0].karte_HP);
            cardInfoText[4].setText(karten[0].karte_Agility);
            cardInfoText[5].setText(karten[0].karte_Element);
            cardInfoText[6].setText(karten[0].karte_Ability);
            cardInfoText[7].setText(karten[0].karte_ID);

            for (int i = 0; i<arraysList.rar.length; i++){
                System.out.println(arraysList.rar[i]);
                if (cardInfoText[1].getText().equals(arraysList.rar[i])){
                    cardInfoText[1].setForeground(arraysList.rar_colors[i]);
                    cardInfoText[1].setIcon(new ImageIcon(new ImageIcon("Java\\src\\Schuelerverwaltung\\Images\\Seltenheiten\\" + cardInfoText[1].getText() + ".png").getImage().getScaledInstance(36, 36, Image.SCALE_AREA_AVERAGING)));

                }
            }

            if (Integer.parseInt(cardInfoText[2].getText()) + Integer.parseInt(cardInfoText[3].getText()) + Integer.parseInt(cardInfoText[4].getText()) < 800){
                cardInfoImage.setIcon(new ImageIcon(new ImageIcon("Java\\src\\Schuelerverwaltung\\Images\\Karten\\Silver.png").getImage().getScaledInstance(350, 220, Image.SCALE_AREA_AVERAGING)));
                cardInfoText[2].setForeground(new Color(200,200,200));
                cardInfoText[3].setForeground(new Color(200,200,200));
                cardInfoText[4].setForeground(new Color(200,200,200));

            }    
            
            if (Integer.parseInt(cardInfoText[2].getText()) + Integer.parseInt(cardInfoText[3].getText()) + Integer.parseInt(cardInfoText[4].getText()) > 800){
                cardInfoImage.setIcon(new ImageIcon(new ImageIcon("Java\\src\\Schuelerverwaltung\\Images\\Karten\\Gold.png").getImage().getScaledInstance(350, 220, Image.SCALE_AREA_AVERAGING)));
                cardInfoText[2].setForeground(new Color(255,200,0));
                cardInfoText[3].setForeground(new Color(255,200,0));
                cardInfoText[4].setForeground(new Color(150,0,0));
            }    
            
            if (Integer.parseInt(cardInfoText[2].getText()) + Integer.parseInt(cardInfoText[3].getText()) + Integer.parseInt(cardInfoText[4].getText()) > 1600){
                cardInfoImage.setIcon(new ImageIcon(new ImageIcon("Java\\src\\Schuelerverwaltung\\Images\\Karten\\Elite.png").getImage().getScaledInstance(350, 220, Image.SCALE_AREA_AVERAGING)));
                cardInfoText[2].setForeground(new Color(25,255,255));
                cardInfoText[3].setForeground(new Color(255,25,255));
                cardInfoText[4].setForeground(new Color(255,255,255));
            }

    }

    
        if (e.getActionCommand().equals("Karte2")){
            System.out.println("K1");
            cardInfoText[0].setText(dataStore.karten[0].karte_Name);
            cardInfoText[1].setText(dataStore.karten[0].karte_Seltenheit);
            cardInfoText[2].setText(dataStore.karten[0].karte_Damage);
            cardInfoText[3].setText(dataStore.karten[0].karte_HP);
            cardInfoText[4].setText(dataStore.karten[0].karte_Agility);
            cardInfoText[5].setText(dataStore.karten[0].karte_Element);
            cardInfoText[6].setText(dataStore.karten[0].karte_Ability);
            cardInfoText[7].setText(dataStore.karten[0].karte_ID);
        }
        if (e.getActionCommand().equals("Karte3")){
            System.out.println("K1");
            cardInfoText[0].setText(dataStore.karten[0].karte_Name);
            cardInfoText[1].setText(dataStore.karten[0].karte_Seltenheit);
            cardInfoText[2].setText(dataStore.karten[0].karte_Damage);
            cardInfoText[3].setText(dataStore.karten[0].karte_HP);
            cardInfoText[4].setText(dataStore.karten[0].karte_Agility);
            cardInfoText[5].setText(dataStore.karten[0].karte_Element);
            cardInfoText[6].setText(dataStore.karten[0].karte_Ability);
            cardInfoText[7].setText(dataStore.karten[0].karte_ID);
        }
        if (e.getActionCommand().equals("Karte4")){
            System.out.println("K1");
            cardInfoText[0].setText(dataStore.karten[0].karte_Name);
            cardInfoText[1].setText(dataStore.karten[0].karte_Seltenheit);
            cardInfoText[2].setText(dataStore.karten[0].karte_Damage);
            cardInfoText[3].setText(dataStore.karten[0].karte_HP);
            cardInfoText[4].setText(dataStore.karten[0].karte_Agility);
            cardInfoText[5].setText(dataStore.karten[0].karte_Element);
            cardInfoText[6].setText(dataStore.karten[0].karte_Ability);
            cardInfoText[7].setText(dataStore.karten[0].karte_ID);
        }
        if (e.getActionCommand().equals("Karte5")){
            System.out.println("K1");
            cardInfoText[0].setText(dataStore.karten[0].karte_Name);
            cardInfoText[1].setText(dataStore.karten[0].karte_Seltenheit);
            cardInfoText[2].setText(dataStore.karten[0].karte_Damage);
            cardInfoText[3].setText(dataStore.karten[0].karte_HP);
            cardInfoText[4].setText(dataStore.karten[0].karte_Agility);
            cardInfoText[5].setText(dataStore.karten[0].karte_Element);
            cardInfoText[6].setText(dataStore.karten[0].karte_Ability);
            cardInfoText[7].setText(dataStore.karten[0].karte_ID);
        }
        if (e.getActionCommand().equals("Karte6")){
            System.out.println("K1");
            cardInfoText[0].setText(dataStore.karten[0].karte_Name);
            cardInfoText[1].setText(dataStore.karten[0].karte_Seltenheit);
            cardInfoText[2].setText(dataStore.karten[0].karte_Damage);
            cardInfoText[3].setText(dataStore.karten[0].karte_HP);
            cardInfoText[4].setText(dataStore.karten[0].karte_Agility);
            cardInfoText[5].setText(dataStore.karten[0].karte_Element);
            cardInfoText[6].setText(dataStore.karten[0].karte_Ability);
            cardInfoText[7].setText(dataStore.karten[0].karte_ID);
        }
        if (e.getActionCommand().equals("Karte7")){
            System.out.println("K1");
            cardInfoText[0].setText(dataStore.karten[0].karte_Name);
            cardInfoText[1].setText(dataStore.karten[0].karte_Seltenheit);
            cardInfoText[2].setText(dataStore.karten[0].karte_Damage);
            cardInfoText[3].setText(dataStore.karten[0].karte_HP);
            cardInfoText[4].setText(dataStore.karten[0].karte_Agility);
            cardInfoText[5].setText(dataStore.karten[0].karte_Element);
            cardInfoText[6].setText(dataStore.karten[0].karte_Ability);
            cardInfoText[7].setText(dataStore.karten[0].karte_ID);
        }
        if (e.getActionCommand().equals("Karte8")){
            System.out.println("K1");
            cardInfoText[0].setText(dataStore.karten[0].karte_Name);
            cardInfoText[1].setText(dataStore.karten[0].karte_Seltenheit);
            cardInfoText[2].setText(dataStore.karten[0].karte_Damage);
            cardInfoText[3].setText(dataStore.karten[0].karte_HP);
            cardInfoText[4].setText(dataStore.karten[0].karte_Agility);
            cardInfoText[5].setText(dataStore.karten[0].karte_Element);
            cardInfoText[6].setText(dataStore.karten[0].karte_Ability);
            cardInfoText[7].setText(dataStore.karten[0].karte_ID);
        }
        if (e.getActionCommand().equals("Karte9")){
            System.out.println("K1");
            cardInfoText[0].setText(dataStore.karten[0].karte_Name);
            cardInfoText[1].setText(dataStore.karten[0].karte_Seltenheit);
            cardInfoText[2].setText(dataStore.karten[0].karte_Damage);
            cardInfoText[3].setText(dataStore.karten[0].karte_HP);
            cardInfoText[4].setText(dataStore.karten[0].karte_Agility);
            cardInfoText[5].setText(dataStore.karten[0].karte_Element);
            cardInfoText[6].setText(dataStore.karten[0].karte_Ability);
            cardInfoText[7].setText(dataStore.karten[0].karte_ID);
        }
        if (e.getActionCommand().equals("Karte10")){
            System.out.println("K1");
            cardInfoText[0].setText(dataStore.karten[0].karte_Name);
            cardInfoText[1].setText(dataStore.karten[0].karte_Seltenheit);
            cardInfoText[2].setText(dataStore.karten[0].karte_Damage);
            cardInfoText[3].setText(dataStore.karten[0].karte_HP);
            cardInfoText[4].setText(dataStore.karten[0].karte_Agility);
            cardInfoText[5].setText(dataStore.karten[0].karte_Element);
            cardInfoText[6].setText(dataStore.karten[0].karte_Ability);
            cardInfoText[7].setText(dataStore.karten[0].karte_ID);
        }

        */


        if (e.getActionCommand().equals("Abmelden")) {
            abmelden();
        }

        if (e.getSource() == backB || e.getSource() == option[0]) {

            if (e.getActionCommand().equals("option[0]")) {
                option1_1();
            }

        }

        if (e.getActionCommand().equals("backB_0")) {
            viewMenu();
        }

        if (e.getActionCommand().equals("SearchB1")) {
            texarea.setText(searchB1.getText());
        }

        for (String v : arraysList.rar) {
            if (e.getActionCommand().equals(v)) {
                texarea.setText(v);
                sec_Image.setVisible(true);
                sec_Image.setIcon(new ImageIcon(
                        new ImageIcon("Java\\src\\Schuelerverwaltung\\Images\\Seltenheiten\\" + v + ".png").getImage()
                                .getScaledInstance(50, 45, Image.SCALE_AREA_AVERAGING)));
                break;
            }
        }

        for (String v : arraysList.elemente) {
            if (e.getActionCommand().equals(v)) {
                texarea.setText(v);
                sec_Image.setVisible(true);
                sec_Image.setIcon(
                        new ImageIcon(new ImageIcon("Java\\src\\Schuelerverwaltung\\Images\\Elemente\\" + v + ".png")
                                .getImage().getScaledInstance(50, 45, Image.SCALE_AREA_AVERAGING)));
                break;
            }
        }

        for (String v : arraysList.skills) {
            if (e.getActionCommand().equals(v)) {
                texarea.setText(v);
                for (int i = 0; i< arraysList.skills.length; i++){
                    if (texarea.getText().equals(arraysList.skills[i])){
                        rd2 = i;
                    }
                }
                descriptionBox.setText(arraysList.skills_Beschreibung[rd2]);
                sec_Image.setVisible(true);
                sec_Image.setIcon(
                        new ImageIcon(new ImageIcon("Java\\src\\Schuelerverwaltung\\Images\\Fähigkeiten\\" + v + ".png")
                                .getImage().getScaledInstance(50, 45, Image.SCALE_AREA_AVERAGING)));
                break;
            }
        }

        if (e.getActionCommand().equals("SaveData")) {
            saveData();
        }

        if (e.getActionCommand().equals("LoadData")) {
            try {

                texarea.setVisible(true);
                confirmButton.setVisible(true);
                infoText.setVisible(true);
                infoText.setText("Name eingeben (4-20 Charakter)");
                FileInputStream f2 = new FileInputStream("ver.dat");
                BufferedInputStream b2 = new BufferedInputStream(f2);
                ObjectInputStream obj2 = new ObjectInputStream(b2);

                DataStore dataStore = (DataStore) obj2.readObject();

                user.name = dataStore.name;
                user.password = dataStore.password;
                user.angemeldet = dataStore.angemeldet;
                dataStore.ver = true;

                for (int i = 0; i < 9; i++) {
                    karten[i] = dataStore.karten[i];

                }

                for (int i = 0; i < 9; i++) {
                    if (!dataStore.karten[i].karte_Name.equals("N/A")) {
                        arraysList.search_Results[i + 1] = dataStore.karten[i].karte_Name;
                    }
                }

                System.out.println("Name:" + dataStore.karten[0].karte_Name);
                System.out.println("Name:" + dataStore.karten[1].karte_Name);
                System.out.println("Name:" + dataStore.karten[2].karte_Name);
                System.out.println("Seltenheit:" + dataStore.karten[0].karte_Seltenheit);
                System.out.println("Damage:" + dataStore.karten[0].karte_Damage);
                System.out.println("HP:" + dataStore.karten[0].karte_HP);
                System.out.println("Agility:" + dataStore.karten[0].karte_Agility);
                System.out.println("Element:" + dataStore.karten[0].karte_Element);
                System.out.println("Ability:" + dataStore.karten[0].karte_Ability);
                System.out.println("ID:" + dataStore.karten[0].karte_ID);

                obj2.close();

                System.out.println(user.name);
                System.out.println(user.password);
                System.out.println(user.angemeldet);

                sync_Box.setVisible(false);
                sync[0].setVisible(false);
                sync[1].setVisible(false);
                sync[2].setVisible(false);
                sync_Text.setVisible(false);

                saveButton.setVisible(true);

            } catch (IOException d) {
                d.printStackTrace();
            } catch (ClassNotFoundException d2) {
                d2.printStackTrace();
            }
        }

        if (e.getActionCommand().equals("NoData")) {
            try {

                texarea.setVisible(true);
                confirmButton.setVisible(true);
                randomButton.setVisible(true);
                infoText.setVisible(true);
                infoText.setText("Name eingeben (4-20 Charakter)");
                FileInputStream f2 = new FileInputStream("ver.dat");
                BufferedInputStream b2 = new BufferedInputStream(f2);
                ObjectInputStream obj2 = new ObjectInputStream(b2);

                obj2.close();

                sync_Box.setVisible(false);
                sync[0].setVisible(false);
                sync[1].setVisible(false);
                sync[2].setVisible(false);
                sync_Text.setVisible(false);
                saveButton.setVisible(true);
                randomButton.setVisible(true);

            } catch (IOException d) {
                d.printStackTrace();
            }
        }

        if (e.getActionCommand().equals("DeleteData")) {
            try {

                texarea.setVisible(true);
                confirmButton.setVisible(true);
                randomButton.setVisible(true);
                infoText.setVisible(true);
                infoText.setText("Name eingeben (4-20 Charakter)");
                FileOutputStream f = new FileOutputStream("ver.dat");
                BufferedOutputStream b = new BufferedOutputStream(f);
                ObjectOutputStream o = new ObjectOutputStream(b);

                dataStore.name = null;
                dataStore.password = 0;
                dataStore.angemeldet = false;
                dataStore.ver = false;

                o.writeObject(dataStore);
                o.close();

                sync_Box.setVisible(false);
                sync[0].setVisible(false);
                sync[1].setVisible(false);
                sync[2].setVisible(false);
                sync_Text.setVisible(false);
                saveButton.setVisible(true);
                randomButton.setVisible(true);

            } catch (IOException d) {
                d.printStackTrace();
            }

        }

        if (e.getActionCommand().equals("Karte bearbeiten")) {
            karteBearbeiten();
        }

        if (e.getActionCommand().equals("show edit panel")) {
            showEditPanel();
        }

        if (e.getActionCommand().equals("Karte Löschen")) {
            karteLöschen();
        }

        if (e.getActionCommand().equals("Löschen Abfrage")) {
            löschenAbfrage();
        }

    }

    public void sync() throws Exception {
        try {

            saveButton.setVisible(true);

            FileInputStream f2 = new FileInputStream("ver.dat");
            BufferedInputStream b2 = new BufferedInputStream(f2);
            ObjectInputStream obj2 = new ObjectInputStream(b2);

            DataStore dataStore = (DataStore) obj2.readObject();

            if (dataStore.ver == true) {
                System.out.println("Do you want to restore the data?");
                sync_Box.setBounds(1000, 1100, 250, 145);
                sync[0].setBounds(1020, 1170, 100, 30);
                sync[1].setBounds(1132, 1170, 100, 30);
                sync[2].setBounds(1020, 1210, 212, 30);
                sync_Text.setBounds(1000, 1105, 250, 100);

                Thread.sleep(80);

                sync_Box.setVisible(true);
                sync[0].setVisible(true);
                sync[1].setVisible(true);
                sync_Text.setVisible(true);

                for (int v = 0; v < 460; v++) {
                    Thread.sleep(1);
                    sync_Box.setBounds(1000, 1100 - v, 250, 145);
                    sync[0].setBounds(1020, 1170 - v, 100, 30);
                    sync[1].setBounds(1132, 1170 - v, 100, 30);
                    sync[2].setBounds(1020, 1210 - v, 212, 30);
                    sync_Text.setBounds(1000, 1105 - v, 250, 100);
                }
                sync_Box.setVisible(true);
                sync[0].setVisible(true);
                sync[1].setVisible(true);
                sync_Text.setVisible(true);
            } else {
                texarea.setVisible(true);
                confirmButton.setVisible(true);
                infoText.setVisible(true);
            }

            obj2.close();

        } catch (IOException d) {
            d.printStackTrace();
        } catch (ClassNotFoundException d2) {
            d2.printStackTrace();
        }
    }

    public void warn(int a, String n, String d, String dif, String i){

        warnWait = a;

        infoN.setText(n);
        infoD.setText(d);
        infoMes.setText(dif);
        infoI.setIcon(new ImageIcon(new ImageIcon(i).getImage().getScaledInstance(105, 100, Image.SCALE_AREA_AVERAGING)));
                

        infoPanel.setBounds(1007, 580, 265, 120);
        infoI.setBounds(1010, 580, 265, 120);
        infoN.setBounds(1120, 550, 265, 120);
        infoD.setBounds(1120, 640, 120, 120);
        infoMes.setBounds(1220, 625, 265, 120);

        if (i.equals("")){
            infoPanel.setBounds(1007, 580, 265, 80);
            infoI.setBounds(910, 580, 565, 120);
            infoN.setBounds(1020, 540, 565, 120);
            infoD.setBounds(1020, 613, 460, 120);
            infoMes.setBounds(1160, 588, 565, 120);
        }

        infoPanel.setVisible(true);
        infoI.setVisible(true);
        infoN.setVisible(true);
        infoD.setVisible(true);
        infoMes.setVisible(true);

    }
}