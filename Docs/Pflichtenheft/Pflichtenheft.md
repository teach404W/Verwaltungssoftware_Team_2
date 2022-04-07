# Einleitung

Dies ist das Pflichtenheft zu unsewrem Projekt. In dieser Markdown Page beschreiben wir unsere Anwendung, ihren Ablauf und die Funktionen.

## Kapitelübersicht

- 1. `Beschreibung der Anwendung`
  - 1.1 Grobbeschreibung
  - 1.2 Menüführung
- 2. `Beschreibung des Funktionsabluafs`
  - 2.1 Beschreibung der Funktion
  - 2.2 Besonderheiten
- 3. `Diagramm Dokumentaion`
  - 3.1 Klassendiagramm
  - 3.2 Objektdiagramm
  - 3.3 Aktivitätsdiagramm
  - 3.4 Sequenzdiagrammm
## 1. Beschreibung der Anwendung

### **1.1 Grobbeschreibung** 

In unser Programm implimentieren wir Eine Spielekartenbibliothek. Diese dient zur Erstellung, Verwaltung, Organisation und Pack Openings von Spielkarten. Dabei haben die Karten Eigenschaften wie Name und Seltenheit(Gewöhnlich, Ungewöhnlich, Rare, Super Rare, Ultra Rare, Secret Rare, Episch, Insane, Legendär, Heroic, Secret), Elemente(Blitz, Cosmic, Erde, Feuer, Glitch, Gravitation, Magic, Wasser und Wind) Fähigkeiten(Premium, Ghost, Rage, Shredder, Bolt), Stats(Damage, HP und Agilität) und bekommen eine eigene ID. Die ID generieren wir mit der Funktion generateNumber() in der Klasse SystemController. L. 818 findet man die Funktion und auf der L. 1547 wird die ID generiert.

Die Stats haben eine wichtige Auswirkung auf die Karte. \
Unter `"Java\\src\\Schuelerverwaltung\\Images\\Karten"` findet man 3 Arten von Karten. `"Silver"`, `"Gold"` und `"Elite"`. Wenn die Stats der Karte mehr als `800` sind, dann bekommt die Karte die `"Gold"` Stufe. Das heißt, wenn die Stats(`Damage`, `HP` und `Agilität`) zusammen gerechnet mehr als `800` sind, dann wird die Karte `"Gold"` als Theme haben werden. Wenn die Stats mehr als `1600` sind, dann bekommt die Karte die `"Elite"` Stufe und das zeigt, dass die Karte wertvöllig ist.
Jede Stufe hat ihre eigene Unboxing Animation. Unter `"Java\\src\\Schuelerverwaltung\\Images"` findet man 3 Dateien. `"Umboxing_Silver"`, `"Unboxing_Gold` und `"Unboxing_Elite"`. In diesen Dateien sind die Animationen der Karte für jede Stufe

Fähigkeiten
 - **`Premium:`** Stats(`Damage`, `HP` und `Agilität`) sind `2x` besser
 - **`Ghost:`** Die Karte kann weniger als `0` HP haben(`1000` bis `-1000`)
 - **`Rage:`** Die Karte kann `500` extra Schaden haben (`1000` bis `1500`)
 - **`Shredder:`** Die Karte kann `1000` extra Schaden haben (`1000` bis `2000`)
 - **`Bolt:`** Die Karte kann `150` extra Agility haben (`100` bis `250`)
### **1.2 Menüführung**

Die Menüführung besteht aus `6` Tasten mit Bildern. Beim Starten des Projektes muss man einen `Namen` und ein `Passwort` eingeben. Man erstellt also entweder neue Daten(Konto), oder man kann die gespeicherten Daten in `DataStore` laden(dafür braucht man den gespeicherten `Namen` und das gespeicherte `Passwort`). Danach kann der Nutzer von den `6` Möglichkeiten eine auswählen:

> ###   **`Karte anlegen`**
    > - neue Karten erstellen
        (siehe Beschr. Funk.Abl. Karte anlegen)
  
> ### **`Meine Karten`**
   > - gespeicherte Karten anzeigen, filtern
        (siehe Beschr. Funk.Abl. Meine Karten)

> ### **`Karte bearbeiten`**
   > - Eigenschaften bearbeiten
        (siehe Beschr. Funk.Abl. Karte anlegen)

> ### **`Karte löschen`**    
   > - eine Karte löschen, die im DataStore (Papierkorb) noch gespieichert wird
        (siehe Beschr. Funk.Abl. Karte löschen)
  
> ### **`Zufällige Karte machen`**
   > - eine zufällige Karte generieren (Pack opening)
        (siehe Beschr. Funk.Abl. Zufällige Karte ziehen)
  
> ### **`Abmelden`**
   > - Der Nutzer wird abgemeldet

## 2. Beschreibung des Funktionsablaufs

### **2.1 Beschreibung der Funktionen**

- ## **`Karte anlegen`**
 
  - Für alle `Eigenschaften` hat der Nutzer auch einen Zufälligen `Generator`. Dieser Generator gibt der Eigenschaft einen zufälligen `Wert`, zum Beispiel: man kann einen Zufälligen Damage Wert mit dem Generator generieren.  
 
  - `Name`, `Seltenheit`, `Damage`, `HP`, `Agilität`, `Element` und `ID` (optional: `Fähigkeiten`) muss die Karte beinhalten.
  
  - Erst einen `Namen` anlegen. Der Name muss aus `4-20` Charakteren bestehen.
   
  - Danach muss man eine `Seltenheit` der Karte geben. Es gibt `11` bereitgestellten Seltenheiten (`Gewöhnlich`, `Ungewöhnlich`, `Rare`, `Super Rare`, `Ultra Rare`, `Secret Rare`, `Episch`, `Insane`, `Legendär`, `Heroic` und  `Secret`) und man muss eine davon auswählen.
  
  - Dann kommt der `Damage`, den die Karte haben soll, mindestens `0` und Maximum `(1000)`. Mit `Fähigkeiten` kann der Benutzer den Maximalen Wert mehren.
  
  - Danach die `Gesundheit` der Karte `(HP)`, die Karte darf eine Gesundheit zwischen `0` und `1000` haben. Mit der Fähigkeit `Ghost` kann die Karte `0` bis `-1000` Gesundheit haben
   
  - Die Karte muss auch ein `Element haben`, das Element muss der Nutzer auswählen. Es gibt `9` Elemente(`Blitz`, `Cosmic`, `Erde`, `Feuer`, `Glitch`, `Gravitation`, `Magic`, `Wasser` und `Wind`) 
  
  - Am Ende erstellt das System eine `ID` für die Karte automatisch, die `ID` besteht aus Zahlen (Sie beinhaltet keine Buchstaben).
   
  - Als Zusatz kann der Nutzer eine `Fähigkeit` für die Karte mit einer Auswahl festlegen(optional). Die Auswahl besteht aus `6` Fähigkeiten(`Premium`, `Ghost`, `Rage`, `Shredder` und `Bolt`) und der Nutzer darf nur eine Fähigkeit auswählen. 



- ## **`Meine Karten`**  
  - der Nutzer erhält eine Tabelle mit allen Karten, die im Konto erstellt sind und kann dann nach Karten Filtern. 

  > **Suchfilter** \
    > **`1 bis 10:`** Wird nach Karten-Index sortiert.\
    > **`10 bis 1:`** Wird nach Karten-Index sortiert.\
    > **`schwach zu stark:`** Wird nach Stärke sortiert. Schwach kommt zuerst\
    > **`stark zu schwach:`** Wird nach Stärke sortiert. Stark kommt zuerst



- ## **`Karte bearbeiten`**   
  - der Nutzer wählt eine Karte aus und bearbeitet ihre Eigenschaften(`Name`, `Seltenheit`, `Damage`, `HP`, `Agilität`, `Element` und `Fähigkeit` (`ID` der Karte wird nicht geändert))



- ## **`Karte löschen`**    
  - der Nutzer wählt eine verfügbare Karte aus und kann sie löschen   
  - wenn der Nutzer bestätigt, dann kontrollliert das `System`, ob die Karte existiert oder nicht
  - wenn das `System` die Karte findet, dann wird sie gelöscht. Findet das `System` keine Karte, dann wird die Funktion gestoppt.




- ## **`Zufällige Karte machen`**  
  - der zufällige `Generator` generiert eine ganze Karte mit zufälligen `Eigenschaftswerten` (zufälliger `Name`, zufällige `Seltenheit`, zufälliger `Damage` Wert, zufälliger `HP` Wert, zufälliger `Agilität` Wert, zufälliges `Element`, (`80%` eine `Fähigkeit`) und eine `ID`.



- ## **`Abmelden`**   
  - bei der Abmeldung wird Der Nutzer aus dem Konto abgemeldet und die `Daten` des Nutzers bleiben in DataStore (beim speichern)
  - Wenn der Nutzer das Projekt wieder startet, dann bekommt der Nutzer eine Auswahl mit 3 Möglichkeiten
    - Die erste Möglichkeit benötigt das gespeicherte `Passwort` und den gespeicherten `Namen`, dafür werden alle Kontodaten geladen(`Karten`, `Eigenschaften`, ...)
  
    - Die zweite Möglichkeit lädt die Daten nicht, so kann der Nutzer `<entweder ein neues Konto erstellen>`, oder `<das Projekt wieder starten>`, damit der Nutzer diese Auswahl wieder bekommt
  
    - Die dritte Möglichkeit löscht die gespeicherten `Kontodaten`, so muss der Nutzer ein neues Konto mit neuen Karten erstellen



### **2.2 Besonderheiten**

Unser Programm hat ein paar `Besonderheiten`, einmal, dass jede Karte, die erstellt wird, automatisch eine `ID` zugewiesen wird. Außerdem, dass man nach dem Karten erstellen, mit dem hinzugefügten Kartenpool, eine Art `Pack Opening` durchführen kann. Die gezogene Karte wird beim `annehmen` dem `Inventar` zugefügt (Anzahl der Exemplare einer Karte) und beim `ablehnen` gelöscht. 
Zusätzlich benutzt unser Programm eine `GUI`, welches mit `Bildern` und `Text` gestaltet wurde. Zuletzt noch, dass die Karten und Daten beim beenden des Programmes gespeichert werden können, wenn der Benutzer auf "Save" klickt.

## 3. Diagramm Dokumentation

### **3.1 Klassendiagramm**

![your-UML-diagram-name](https://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/teach404W/Verwaltungssoftware_Team_2/main/Docs/Pflichtenheft/Diagramme/Klassendiagramm.iuml)


### 3.2 Objektdiagramm

![your-UML-diagram-name](https://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/teach404W/Verwaltungssoftware_Team_2/main/Docs/Pflichtenheft/Diagramme/Objektdiagramm.iuml)

### 3.3 Aktivitätsdiagramm

![your-UML-diagram-name](https://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/teach404W/Verwaltungssoftware_Team_2/main/Docs/Pflichtenheft/Diagramme/Aktivitätsdiagramme.iuml)


### 3.4 Sequenzdiagramm

![your-UML-diagram-name](https://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/teach404W/Verwaltungssoftware_Team_2/main/Docs/Pflichtenheft/Diagramme/seque.iuml)