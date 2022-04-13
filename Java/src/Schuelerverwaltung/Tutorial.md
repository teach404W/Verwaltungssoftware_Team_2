# Tutorial

In diesem Tutorial werden wir die verwendeten und die neugelernten Sachen vorstellen und erklären.

# GUI

In unserem Projekt haben wir folgende UI's verwendet:

- `JFrame`: JFrame ist das Fenster, das geöffnet wird,  wenn das Projekt gestartet wird.
  #

- `JPanel`: JPanel ist ein Menü. Alle Objekte (Zum Beispiel JLabel) in diesem JPanel werden sortiert. Das heißt der Benutzer kann ihre größe mit setBounds() nicht ändern. Der Benutzer muss die Schriftgröße ändern, damit die Größe vom Objekt geändert wird.
  #

- `JLabel`: JLabel kann entweder ein Text oder ein Bild sein | JLabel.setText("String") oder JLabel.setIcon(Icon).
  #

- `JButton`: Mit JButton kann der Benutzer funktionen starten. Damit braucht der Benutzer actionListener und ActionCommand. 
  #

- `JTextArea`: JTextArea ist ein großes Textfeld. 
  # 

- `JTextField`: JTextField ist eine Texteingabe. Sie ist in unserem Projekt das Textfeld, beidem der Benutzer einen Namen und ein Passwort eingeben kann.
  #


## `GUI -> erstellen`
#
  Um GUI zu machen muss man zuerst das Objekt deklarieren. Zum Beipsiel : JPanel menu;\
   Danach muss man das Objekt instanziieren. Zum Beipsiel menu = new JPanel();
## `GUI -> Eigenschaften`
#
Alle UI's haben fast die gleichen Eigenschaften.
##    `JFrame`
  > ### `setExtendedState(JFrame.MAXIMIZED_BOTH)` 

  > Das Fenster wird beim starten auf full-screen gesettet

   #
  > ### `setUndecorated(true)` | `setUndecorated(false)` 

  > true: Das Fenster bedeckt die Taskleiste | false: Das Fenster bedeckt die Taskleiste nicht

#

##    `(JPanel, JLabel, JButton, JTextArea, JTextField)`

> ### `setBackground(Color)` 

  > Background ist die Hintergrundsfarbe eines UI"s. Color(die Farbe) kann entweder eine Java Farbe, zum Beipsiel(Color.black), einen RGB(Rot, Grün, Blau) Wert zum Beispiel (0,0,0)-> Schwarz oder andere wie HSB Code sein. \
  `RGB:` RGB(Rot, Grün, Blau) ist eine Mischung aus die drei Farben. Die Werte müssen mindestens 0 und maximum 255 sein (0,0,0) ist ganz schwarz und (255,255,255) ist ganz weiß \
  `RGB(Beispiele):` \
  `->` (255,0,0) ist Rot \
  `->` (0,255,0) ist Grün \
  `->` (0,0,255) ist Blau \
  `->` (255,0,255) ist Rosa \
  `->` (0,255,255) ist Hellblau \
  `->` (255,255,0) ist Gelb

> ### `setBounds(x-Position, y-Position, Breite, Höhe)` 

  > Wenn x-Position und y-Position 0 sind, dann wird die Position oben links sein | Je mehr der Wert von Breite ist, desto breiter wird das Objekt sein. Das gleicht gilt für die Höhe.
#



