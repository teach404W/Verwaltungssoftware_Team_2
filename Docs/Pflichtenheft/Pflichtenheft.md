# Einleitung

Dies ist das Pflichtenheft zu unsewrem Projekt. In dieser Markdown Page beschreiben wir unsere Anwendung, ihren Ablauf und die Funktionen.

## Kapitelübersicht

- 1. Beschreibung der Anwendung
  - 1.1 Grobbeschreibung
  - 1.2 Menüführung
- 2. Beschreibung des Funktionsabluafs 
  - 2.1 Beschreibung der Funktion
  - 2.2 Besonderheiten
- 3. Diagramm Dokumentaion
  - 3.1 Klassendiagramm
## 1. Beschreibung der Anwendung

### **1.1 Grobbeschreibung** 

In unser Programm implimentieren wir Eine Spielekartenbibliothek. Diese dient zur Erstellung, Verwaltung, Organisation und Pack Openings von Spielkarten. Dabei haben die Karten Eigenschaften wie Name und Seltenheit(Gewöhnlich, Ungewöhnlich, Rare, Super Rare, Ultra Rare, Secret Rare, Episch, Insane, Legendär, Heroic, Secret), Elemente(Blitz, Cosmic, Erde, Feuer, Glitch, Gravitation, Magic, Wasser und Wind) Fähigkeiten(Premium, ..), Stats(Damage, HP und Agilität) und bekommen eine eigene ID. Die ID generieren wir mit der Funktion generateNumber() in der Klasse SystemController. L. 450 findet man die Funktion und auf der L. 633 wird die ID generiert.

Die Stats haben eine wichtige Auswirkung für die Karte.
unter "Java\\src\\Schuelerverwaltung\\Images\\Karten" findet man 3 Arten von Karten. "Silver", "Gold" und "Elite". Wenn die Stats der Karte mehr als 800 sind, dann bekommt die Karte die "Gold" Stufe. Das heißt, wenn die Stats(Damage, HP und Agilität) zusammen gerechnet mehr als 800 sind, dann wird die Karte "Gold" als Theme haben wird. Wenn die Stats mehr als 1500 sind, dann bekommt die Karte die "Elite" Stufe und das zeigt, dass die Karte wertvöllig ist.

TODO Ausführlicher -> Welche Fähigkeiten und Seltenheitsstufen gibt es z. B. Welche Stats gibt es und welche Auswirkung haben diese

Fähigkeiten
 -Premium: Stats(Damage, HP und Agilität) sind 2x besser
### **1.2 Menüführung**

Die Menüführung besteht aus 6 Tasten mit Bildern. Beim Starten des Projektes muss man einen Namen und ein Passwort eingeben. Man erstellt also entweder neue Daten(Konto), oder man kann die gespeicherten Daten in DataStore laden(dafür braucht man den gespeicherten Namen und das gespeicherte Passwort). Danach kann der Nutzer von den 6 Möglichkeiten eine auswählen:

- Karte anlegen 
    - neue Karten erstellen
        (siehe Beschr. Funk.Abl. Karte anlegen)
  
- Meine Karten
    - gespeicherte Karten anzeigen, filtern
        (siehe Beschr. Funk.Abl. Meine Karten)
  
- Karte bearbeiten
    - Eigenschaften bearbeiten
        (siehe Beschr. Funk.Abl. Karte anlegen)

- Karte löschen    
    - eine Karte löschen, die im Data Store (Papierkorb) noch gespieichert wird
        (siehe Beschr. Funk.Abl. Karte löschen)
  
- Zufällige Karte ziehen
    - eine angelegte Karte ziehen
        (siehe Beschr. Funk.Abl. Zufällige Karte ziehen)
  
- Abmelden
    - Der Nutzer wird abgemeldet

## 2. Beschreibung des Funktionsablaufs

### **2.1 Beschreibung der Funktionen**

- Karte anlegen 
 
  - Für alle Eigenschaften hat der Nutzer auch einen Zufälligen Generator. Dieser Generator gibt der Eigenschaft einen zufälligen Wert, zum Beispiel: man kann einen Zufälligen Damage Wert mit dem Generator generieren.  
 
  - Name, Seltenheit, Damage, HP, Agilität, Element und ID (optional: Fähigkeiten) muss die Karte beinhalten.
  
  - Erst einen Namen anlegen. Der Name muss aus 4-20 Charakteren bestehen.
   
  - Danach muss man eine Seltenheit der Karte geben. Es gibt 11 bereitgestellten Seltenheiten (Gewöhnlich, Ungewöhnlich, Rare, Super Rare, Ultra Rare, Secret Rare, Episch,     Insane, Legendär, Heroic, Secret) und man muss eine davon auswählen.
  
  - Dann kommt der Damage, den die Karte haben soll, mindestens 0 und Maximum (1000). 
  
  - Danach die Gesundheit der Karte (HP), die Karte darf eine Gesundheit zwischen 0 und 1000 haben.
   
  - Die Karte muss auch ein Element haben, das Element muss der Nutzer auswählen. Es gibt 9 Elemente(Blitz, Cosmic, Erde, Feuer, Glitch, Gravitation, Magic, Wasser und Wind) 
  
  - Am Ende erstellt das System eine ID für die Karte automatisch, die ID besteht aus Zahlen (Sie beinhaltet keine Buchstaben).
   
  - Als Zusatz kann der Nutzer eine Fähigkeit für die Karte mit einer Auswahl festlegen(optional). Die Auswahl besteht aus .. Fähigkeiten und der Nutzer darf nur eine Fähigkeit auswählen. 

- Meine Karten   
  - der Nutzer erhält eine Tabelle mit allen Karten, die im Konto erstellt sind und kann dann nach Karten Filtern
  
- Karte bearbeiten   
  - der Nutzer wählt eine Karte aus und bearbeitet ihre Eigenschaften(Name, Seltenheit, Damage, HP, Agilität, Element und Fähigkeit (ID der Karte wird nicht geändert))

- Karte löschen    
  - der Nutzer wählt eine verfügbare Karte aus und kann sie löschen   
  - die gelöschte Karte bleibt in DataStore und der Nutzer kann sie jederzeit wiederherstellen   
  - wenn der Nutzer eine Karte löscht, während in DataStore eine gelöschte Karte gespeichert ist, bekommt der Nutzer eine Warnung und muss zwischen "Ja" und "Nein" wählen. Wenn der Nutzer "Ja" auswählt, dann wird die gespeicherte Karte aus der DataStore entfernt. Wählt der Nutzer "Nein" aus, dann bleibt die gespeicherte Karte in DataStore und die Karte, die der Nutzer löschen wollte, bleibt im Konto.

- Zufällige Karte ziehen   
  - der zufällige Generator generiert eine ganze Karte mit zufälligen Eigenschaftswerten (zufälliger Name, zufällige Seltenheit, ...)

- Abmelden   
  - bei der Abmeldung wird Der Nutzer aus dem Konto abgemeldet und die Daten des Nutzers bleiben in DataStore 
  - Wenn der Nutzer das Projekt wieder startet, dann bekommt der Nutzer eine Auswahl mit 3 Möglichkeiten
    - Die erste Möglichkeit benötigt das gespeicherte Passwort und den gespeicherten Namen, dafür werden alle Kontodaten geladen(Karten, Eigenschaften, ...)
  
    - Die zweite Möglichkeit lädt die Daten nicht, so kann der Nutzer entweder ein neues Konto erstellen, oder das Projekt wieder starten, damit der Nutzer diese Auswahl wieder bekommt
  
    - Die dritte Möglichkeit löscht die gespeicherten Kontodaten, so muss der Nutzer ein neues Konto mit neuen Karten erstellen



### **2.2 Besonderheiten**

Unser Programm hat ein paar Besonderheiten, einmal das jede Karte, die erstellt wird, automatisch eine ID zugewiesen wird. Außerdem, dass man nach dem Karten erstellen, mit dem hinzugefügten Kartenpool, eine Art Pack Opening durchführen kann. Die gezogene Karte wird beim annehmen dem Inventar zugefügt (Anzahl der Exemplare einer Karte) und beim ablehnen gelöscht. 
Zusätzlich benutzt unser Programm eine GUI, welche mit Bildern und Text gestaltet wurde. Zuletzt noch, dass die Karten beim beenden des Programmes gespeichert werden.

## 3. Diagramm Dokumentation

### **3.1 Klassendiagramm**

![your-UML-diagram-name](https://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/teach404W/Verwaltungssoftware_Team_2/main/Docs/Pflichtenheft/Diagramme/Klassendiagramme.iuml)


TODO Diagramme fehlen: Sequenz, Objekt, Klassendiagramm.
TODO Aktualsieren und soweit abschließend wie möglich

### 3.2 Objektdiagramm

![your-UML-diagram-name](https://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/teach404W/Verwaltungssoftware_Team_2/main/Docs/Pflichtenheft/Diagramme/Objektdiagramm.iuml)
