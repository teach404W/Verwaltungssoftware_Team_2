# Klassenarbeit

Hier werden alle Themen vor der Klassenarbeit erklärt.

## `Sichtbarkeit von Methoden und Variablen`

Es gibt 4 Sichtbarkeiten: Public, Private, Protected und Package

 > ### `Public` 

  > Public Sichbarkeit ist für alle Klassen in allen Paketen(Packages) sichtbar. Public Methoden und Variablen sind also für alles sichtbar.

 > ### `Private` 

  > Private Methoden und Variablen sind nur für die Klasse sichtbar, in der sie erstellt sind.\
  Das heißt, dass andere Klassen keinen zugriff haben können, sogar wenn eine andere Klasse diese Klasse extendet.\
   `Beispiel:`\
   private `int` seiten = 5; -> Klasse `Buch` \
   Wenn man `Buch.seiten` in einer anderen Klasse schreibt, dann bekommt man einen Fehler, der sagt `[The field Buch.seiten is not visible]`


 > ### `Protected` 

  > Variablen und Methoden mit der Sichtbarkeit `protected` sind sichtbar für das Paket, in dem sie initialisiert sind. Andere Klassen in anderen Paketen können zugriff auf diese Methoden und Variablen haben, wenn sie die Klasse extenden, in der die Objekte deklariert sind. So kann man Variablen und Methoden in anderen Paketen benutzen, wenn sie protected sind.


 > ### `Package` 

  > Variablen und Methoden mit der Sichbarkeit Package sind nur für das Paket sichtbar, in dem sie initialisiert sind. Vor dem Bezeichner steht keine Sichtbarkeit.\
   `Beispiel:`\
   `int` nummer = 5;\
   `void` function(){};
   

## `Abstakte Klassen`

  > `Abstrakte` Klassen sind Klassen, die als Oberklassen dienen und selbst nicht zur Bildung von Objekten herangezogen werden können. Sie werden oft verwendet, um Eigenschaften und Fähigkeiten einer allgemeinen Typgruppe zu definieren, deren abgeleitete Unterklassen diese dann weiter spezifizieren.\
[> Link <](https://javabeginners.de/Klassen_und_Interfaces/Abstrakte_Klassen.php)

## `Beziehung zwischen Klassen` 
### [> Link <](https://martin-thoma.com/ubersicht-der-pfeile-in-uml/) 

> **`<|--`** Die `Vererbung` ist einer der wichtigsten Sachen in der Objekt Orientierten Programmierung. Sie zeigt eine `"ist - eine"` Beziehung an.

>**`--`** `Assoziation` zeigt eine Verbindung an.\
`Beispiel: Auto -- Fahrer: Ein Auto hat einen Fahrer ; ein Fahrer hat ein Auto`


> **`o--`** `Aggregation` ist eine spezielle Assoziation. Sie zeigt eine "hat"-Beziehung an. Dabei ist die Richtung wichtig und sollte angezeigt werden.\
>`Beispiel:` Buchladen hat Bücher

> **`*--`** Die `Komposition` zeigt eine notwendige `"ist-Teil-von"` Beziehung an. Das Teil kann also nicht ohne das Ganze existieren.\
`Beispiel:` Buch hat Buchseiten (Buchseiten gibt es nicht ohne Buch)

## `Rekursion`

> `Rekursion:` Unter Rekursion versteht man in der Programmierung ein Verfahren, bei dem sich eine Methode selbst aufruft, sodass, ähnlich einer Endlosschleife, ein potentiell unendlicher Programmablauf entsteht.\
[> Link <](https://javabeginners.de/Grundlagen/Rekursion.php)

## `Polymorphie`

>Polymorphie beschreibt die Proritätenreinfolge einer Methode innerhalb einer Klasse. Wenn 2 Klassen eine gleichgenannte Methode haben, und zusätzlich dazu, eine Klasse von der anderen erbt, hat eine Klasse logischer Weise, 2 mal eine gleich genannte Methode. Welche wird nun ausgeführt, wenn man den Methodenanmen ausführt. Hier kommt Polymorphie ins Spiel. Die Klasse priorisiert  Methode der eigenen Klasse, vor der, der extendeten Klasse.

>Hier ein Beispiel:

    public class Vogel {

      public void singen() {

        System.out.println("Tweet Tweet");

      }
    }

    public class Amsel extends Vogel {

      public void singen() {

        System.out.println("Kurr Kurr");

      }
    }

    public class Programm {
    
      public static void main(String[] args){
    
          Amsel a = new Amsel();
      
          a.singen();
    
      }
    }

    Ausgabe:
    Kurr Kurr

>Hier wird Eine Klasse Vogel und Amsel deklariert, wobei Amsel, Vogel extendet. Beide haben die Funktion singen(), und bei der Ausgabe von der Funktion der Klasse Amsel, wird die der eigenen Klasse ausgegeben, da die Funktion, der der anderen Klasse gegenüber priorisiert.
> ..

 ## `Arrays`

> Unter einem Array in Java versteht man einen Container, der eine feste Anzahl von Werten eines einzelnen Typs enthält. Bei der Deklaration wird von Beginn an ein konkreter Datentyp für das Array bestimmt, der dann nicht mehr verändert werden kann. Wichig dabei ist, dass in einem Array immer bei 0 angefangen wird zu Zählen und das letzte nicht benutzt werden kann.
Man kann auch ganze klassen als Array erstellen.    
`Beispiel:`\
Wenn man eine liste mit 10 plätzen für preise anlegen möchte, schreibt man: `int[] preise = new int[10];`. Hierbei können die stellen 0 - 10 im array benutzt und abgerufen werden.\
Abgerufen kann es mit `System.out.println(preise[0]);`, dabei wird der preis des Arrays an erster Stelle abgerufen und Ausgegeben.
Wenn man klassen wie z.b. die klasse Karte als array mit 10 plätzen erstellen will, schreibt man: `Karte[] karten = new Karte[10];` und danach mit `karten[0] = new Karte();` initialisieren und deklarieren, das macht man dann 10 mal und setzt für die 0 jeweils die zahlen 1 - 10 ein.
Wenn man eine liste mit 10 plätzen für preise anlegen möchte, schreibt man: `int[] preise = new int[10;`. Hierbei können die stellen 0 - 10 im array benutzt und abgerufen werden.

### `Zweidimensionale Arrays`

> Zweidimensionale Arrays funktionieren wie normale Arrays. Nur ist es so, dass man bei diesen wie bei einem netz oder einem Schachbrett die Plätze zwei nummern oder Zahlen zum zuweisen haben. 
`Beispiel`\
Die zwei dimensionalen Arrays Macht man, indem mann zum beispiel `int[][] preise = new int[10][10];`, die erste zahl steht heir für die x achsen - plätze und die zweite Zahl steht für die y Plätze.

    public void YoMamma(){
        int[][] preis2 = new int[10][10];
        for(int i; i <= 10; i++){
        for(int j; j <= 10; j++){
            System.out.println(preis2[i][j]);
        }
    }

> Dabei würdn die Ints des Arrays nach und nach ausgegeben werden. Zuerst würde dabei die Oberste Spalte von Links nach Rechts und danach die anderen nach und nach auch ausgegeben werden.



## `Vererbung`

Als Vererbung versteht man die Möglichkeit die `Attribute` und `Methoden` einer `Oberklasse` an `Unterklassen` weiterzugeben, praktisch zu vererben. Wie bereits gesagt nennt man die verberbende Klasse dann `Oberklasse` und die erbende Klassen `Unterklasse`. 

Hier ein Beispiel:

    public class Vogel {

      public void singen() {

        System.out.println("Tweet Tweet");

      }
    }

    public class Amsel extends Vogel {

      private int beine = 2;

    }

    public class Programm {
    
      public static void main(String[] args){
    
          Amsel a = new Amsel();
      
          a.singen();
    
      }
    }

    Ausgabe:
    Tweet Tweet

Hier erbt die `UnterKlasse` Amsel von der `Oberklasse` Vogel. Auch wenn die Klasse Amsel keine eigenen Funktionen besitzt, kann die Funktion der geerbten Oberklasse verwendet werden und die Amsel singt. Diese Funktion kann man sehr gut verwenden, wenn man mehrere Klassen deklarieren muss, die die selben Attribute und Methoden verwenden. Dann erstellt man eine `Oberklasse`, in der diese sich wiederholenden Funktionen und Variablen befinden und lässt die anderen einfach erben. So erspart man sich Zeit und behält einen sauzbereren Code bei.
>




