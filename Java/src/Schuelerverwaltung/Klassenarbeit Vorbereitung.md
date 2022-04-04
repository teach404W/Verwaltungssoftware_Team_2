# Klassenarbeit

Hier werden alle Themen vor der Klassenarbeit erklärt.

## Sichtbarkeit von Methoden und Variablen

Es gibt 4 Sichtbarkeiten: Public, Private, Protected und Package

 > ### `Public` 

  > Public Sichbarkeit ist für alle Klassen in allen Paketen(Packages) sichtbar. Public Methoden und Variablen sind also für alles sichtbar.

 > ### `Private` 

  > Private Methoden und Variablen sind nur für die Klasse sichtbar, in der sie erstellt sind.\
  Das heißt, dass andere Klassen keinen zugriff haben können, sogar wenn eine andere Klasse diese Klasse extendet.\
   `Beispiel:`\
   private int seiten = 5; -> Klasse `Buch` \
   Wenn man `Buch.seiten` in einer anderen Klasse schreibt, dann bekommt man einen Fehler, der sagt `[The field Buch.seiten is not visible]`


 > ### `Protected` 

  > ..


 > ### `Package` 

<<<<<<< HEAD
## Polymorphie

Polymorphie beschreibt die Proritätenreinfolge einer Methode innerhalb einer Klasse. Wenn 2 Klassen eine gleichgenannte Methode haben, und zusätzlich dazu, eine Klasse von der anderen erbt, hat eine Klasse logischer Weise, 2 mal eine gleich genannte Methode. Welche wird nun ausgeführt, wenn man den Methodenanmen ausführt. Hier kommt Polymorphie ins Spiel. Die Klasse priorisiert  Methode der eigenen Klasse, vor der, der extendeten Klasse.

Hier ein Beispiel:
  public class Vogel{

    public void singen(){

      System.out.println("Tweet Tweet");

    }
  }

  public class Amsel extends Vogel{

    public void singen(){

      System.out.println("Kurr Kurr");

    }
  }

  Amsel a = new Amsel;

  a.singen();

  Ausgabe:
  "Kurr Kurr"

Hier wird Eine Klasse Vogel und Amsel deklariert, wobei Amsel, Vogel extendet. Beide haben die Funktion singen(), und bei der Ausgabe von der Funktion der Klasse Amsel, wird die der eigenen Klasse ausgegeben, da die Funktion, der der anderen Klasse gegenüber priorisiert.
=======
  > ..

 > ### `Arrays`

  > Unter einem Array in Java versteht man einen Container, der eine feste Anzahl von Werten eines einzelnen Typs enthält. Bei der Deklaration wird von Beginn an ein konkreter Datentyp für das Array bestimmt, der dann nicht mehr verändert werden kann. Wichig dabei ist, dass in einem Array immer bei 0 angefangen wird zu Zählen und das letzte nicht benutzt werden kann.\
  `Beispiel:`\
  Wenn man eine liste mit 10 plätzen für preise anlegen möchte, schreibt man: `int[] preise = new int[10];`. Hierbei können die stellen 0 - 10 im array benutzt und abgerufen werden.
>>>>>>> 510fbbccae771540d48a7a3bcec13e95b0aa899f
