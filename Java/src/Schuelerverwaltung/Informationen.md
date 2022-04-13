# Informationen

Hier sind alle Aktzeptanz Kriterien, die das Projekt beinhalten muss.

# Modellierung


- `Pflichtenheft`: Docs\Pflichtenheft\Pflichtenheft.md





# Implementation 


 ### `Sichtbarkeit von Methoden und Variablen` 

  > ### `Public:` SystemController, Input, Texts

  > ### `Private:` SystemController

  > ### `Protected:` ArraysList, GUI, Karte
  
  > ### `Package:` App, DataStore, GUI, SystemController, Texts, User

   ### `Abstrakte Klassen` 

> ### Abstrakte Klasse: `ArraysList`
> ### Subklasse: `GUI`

   ### `Beziehung zwischen Klassen` 
  > ### `Assoziation:` Kare `--` DataStore

  > ### `Aggregation:` Karte `o--` User

  > ### `Komposition:` 

    > SystemController "1" *-- "0..10" User 
    > GUI "1" *-- "0..10" Texts
    > GUI "1" *-- "0..10" Input
    > GUI "1" *-- "0..10" ArraysList
    > App "1" *-- "0..10" SystemController
    > SystemController "1" *-- "0..10" GUI
    > GUI "1" *-- "0..10" DataStore
    > SystemController "1" *-- "0..10" Karte

   ### `Rekursion:` 
   > ### `showOptions()` -> SystemController`[L.2038]`

   ### `Arrays:` 
   > ### `ArraysList(+2D), DataStore, GUI, SystemColnroller, Texts`

   ### `Polymorphie:` 
   > ### `Beispiel: clearBox()`
   > SystemController`[590-592]` <-> GUI`[870-872]`


   ### `Extras(optional):` 
   > `GUI` in der Klasse `GUI`\
   > `Speicher` in der Klasse `SystemController` \
   -> Save[`L.2163]` - Load`[L.2188]` - noData`[L.2250]` - Delete`[L.2277]`
