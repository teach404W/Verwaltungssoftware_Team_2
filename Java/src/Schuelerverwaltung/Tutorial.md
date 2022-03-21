# Tutorial

In diesem Tutorial werden wir die verwendeten und die neugelernten Sachen vorstellen und erklären

# GUI

In unserem Projekt haben wir folgende UI's verwendet:

- `JFrame`: JFrame ist das Fenster, das geöffnet wird,  wenn das Projekt gestartet wird.
  #
- `JLabel`: JLabel kann entweder ein Text oder ein Bild sein | JLabel.setText("String") oder JLabel.setIcon(Icon)
  #
- `JPanel`: JPanel ist ein Menü. Alle Objekte (Zum Beispiel JLabel) in diesem JPanel werden sortiert. Das heißt der Benutzer kann ihre größe mit setBounds() nicht ändern. Der Benutzer muss die Schriftgröße ändern, damit die Größe vom Objekt geändert wird.
  #
- `JTextField`: JTextField ist eine Texteingabe. Sie ist in unserem Projekt das Textfeld, beidem der Benutzer einen Namen und ein Passwort eingeben kann
  #
- `JButton`: Mit JButton kann der Benutzer funktionen starten. Damit braucht der Benutzer actionListener und ActionCommand. 
  #
- `JTextArea`: JTextArea ist ein großes Textfeld. 
  # 

## `GUI -> erstellen`
#
  Um GUI zu machen muss man zuerst das Objekt defenieren. Zum Beipsiel : JPanel menu;\
   Danach muss man das Objekt instanziieren. Zum Beipsiel menu = new JPanel()
## `GUI -> Eigenschaften`
#
Alle UI'S haben fast die gleichen Eigenschaften.
##    `JFrame`
  > ### `setExtendedState(JFrame.MAXIMIZED_BOTH)` 

  > Das Fenster wird beim starten auf full-screen gesettet

   #
  > ### `setUndecorated(true)` | `setUndecorated(false)` 

  > true: Das Fenster bedeckt die Taskleiste | false: Das Fenster bedeckt die Taskleiste nicht

#
##    `JLabel`
 > ### `setBounds(x-Position, y-Position, x-Breite, y-Länge)` 

  > x-Position 0 ist die linke 


Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
