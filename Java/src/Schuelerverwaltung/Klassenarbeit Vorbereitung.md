# Klassenarbeit

Hier werden alle Themen vor der Klassenarbeit erklärt.

# Sichtbarkeit von Methoden und Variablen

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

  > ..

 > ### `Arrays`

  > Unter einem Array in Java versteht man einen Container, der eine feste Anzahl von Werten eines einzelnen Typs enthält. Bei der Deklaration wird von Beginn an ein konkreter Datentyp für das Array bestimmt, der dann nicht mehr verändert werden kann. Wichig dabei ist, dass in einem Array immer bei 0 angefangen wird zu Zählen und das letzte nicht benutzt werden kann.\
  `Beispiel:`\
  Wenn man eine liste mit 10 plätzen für preise anlegen möchte, schreibt man: `int[] preise = new int[10];`. Hierbei können die stellen 0 - 10 im array benutzt und abgerufen werden.
