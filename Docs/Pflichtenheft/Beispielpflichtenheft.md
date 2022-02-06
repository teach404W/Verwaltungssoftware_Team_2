# Kapitelübersicht

1. Beschreibung der Anwendung
2. Beschreibung der Funktionen
   1. mind. 4 Methoden abläufe gerne mithilfe von Diagrammen (PAP, Struktogramm, Sequenzdiagramm, Anwendungsfalldiagramm, Aktivitätdiagramm )
3. Diagramme - Dokumentation
   1. Objektdiagramm
   2. Klassendiagramm
   3. Methoden aus 2.
      1. Sequenzdiagramm
      2. (optional) PAP, Struktogramm

## 1. Beschreibung der Anwendung

### **Grobbeschreibung** 
Wir implementieren eine Notenverwaltng für Schüler. In dieser Anwendung sollen Nutzer ihre Fächer (inkl. unterschiedlicher Jahre) verwalten können. Dabei sollen neben der Noten auch der zugehörige Fachlehrer und das Jahr gespeichert werden. 

### **Menüführung**
Die Menüfuhrung ist rein Textuell. Beim Start der Anwendung gibt es eine Passwortabfrage und danach kann der Nutzer wählen zwischen:
- Fach anlegen
- Note für Fach eintragen
  - (erst Auswahl für ein Fach und Jahr, dann eintragen)
- Note für Fach anzeigen
- abmelden

## 2. Beschreibung des Funktionsablaufes

### **Menü anzeigen**
#### **Beschreibung Funktion Menü anzeigen**
Nach der Anmeldung wählt der Benutzer die Option Fach danach wird er nach einen Namen, einem Jahr und einem Passwort gefragt. Diese gibt er über die Konsole ein.
Anschließend erscheint ein Menü indem die Benutzer zwichen den Folgenden Punkte wählen können:
- Fach anlegen
- Note anlegen
- Noten / Fach anzeigen
- abmelden


### **Fach anlegen()**
#### **Beschreibung Funktion Fach anlegen**
Nach der Anmeldung kann der Benutzer den Menüpunkt "Fach anlegen" auswählen. In dieser Funktion wird er nach einem Fachnamen gefragt. Dieses Fach wird anschließend generiert und in das Array Faecher[] der Klasse Schueler gelegt.

**Besonderheiten**
Es können maximal 10 Fächer angelegt werden. Danach erfolgt eine Ausgabe: "Maximialanzahl der Fächer erreicht".


#### **Diagramm (Aktivitätsdiagramm) Funktion Fach anlegen**

![your-UML-diagram-name](https://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/teach404W/agileProjekt_2_Java/main/Docs/Pflichtenheft/Diagramme/AnwendungsFall_Fach_anlegen.iuml)

### **Note anlegen()**
TOFILL

#### **Beschreibung METHODE**
TOFILL

#### **Diagramm METHODE**
TOFILL



## 3. Diagramm Dokumentation


### **Klassendiagramm**

![your-UML-diagram-name](https://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/teach404W/agileProjekt_2_Java/main/Docs/Pflichtenheft/Diagramme/Klassendiagramm.iuml)


### **Objektdiagramm**
TOFILL

