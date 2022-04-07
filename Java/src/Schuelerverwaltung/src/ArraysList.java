import java.awt.Color;

abstract class ArraysList {




       protected String search_Results[] = {
                        "   ",
                        "",
                        "",
                        "",
                        "",
                        "",
                        "",
                        "",
                        "",
                        "",
                        "",

        };
        
        

        protected String rar[] = {
                        "Gewöhnlich",
                        "Ungewöhnlich",
                        "Rare",
                        "Sehr Rare",
                        "Ultra Rare",
                        "Secret Rare",
                        "Episch",
                        "Insane",
                        "Legendär",
                        "Heroic",
                        "Secret",

        };

        protected String elemente[] = {
                        "Blitz",
                        "Cosmic",
                        "Erde",
                        "Feuer",
                        "Glitch",
                        "Gravitation",
                        "Magic",
                        "Wasser",
                        "Wind",
        };

        protected String skills[] = {
                "Keine",
                "Premium",
                "Ghost",
                "Rage",
                "Shredder",
                "Bolt",

        };

        protected String skills_Beschreibung[] = {
                "Keine Fähigkeit",
                "Stats(Damage, HP und Agilität) sind 2x besser",
                "Die Karte kann weniger als 0 HP haben (-1000 bis 1000)",
                "Die Karte kann 500 extra Schaden haben (1000 bis 1500)",
                "Die Karte kann 1000 extra Schaden haben (1000 bis 2000)",
                "Die Karte kann 150 extra Agility haben (100 bis 250)",

        };



        

        protected Color[] rar_colors = {
                        new Color(84, 84, 84), // Gewöhnlich
                        new Color(222, 222, 222), // Ungewöhnlich
                        new Color(214, 48, 48), // Rare
                        new Color(137, 32, 32), // Sehr Rare
                        new Color(45, 134, 196), // Ultra Rare
                        new Color(196, 45, 88), // Secret Rare
                        new Color(163, 147, 244), // Episch
                        new Color(66, 78, 222), // Insane
                        new Color(21, 201, 203), // Legendär
                        new Color(254, 154, 0), // Heroic
                        new Color(114, 232, 255), // Secret

        };

        protected Color[] elemente_colors = {
                new Color(243,152,98), // Blitz
                new Color(255,101,128), // Cosmic
                new Color(94,67,66), // Erde
                new Color(254,75,0), // Feuer
                new Color(7, 255, 255), // Glitch
                new Color(16, 191, 214), // Gravitation
                new Color(255, 80, 135), // Magic
                new Color(207, 215, 242), // Wasser
                new Color(79, 153, 211), // Wind

};


        protected Color[] skills_colors = {
                new Color(255,255,255), // Premium 
                new Color(255, 187, 113), // Premium 
                new Color(239, 133, 241), // Ghost
                new Color(255, 60, 80), // Rage
                new Color(111, 255, 185), // Shredder
                new Color(188, 41, 99), // Bolt

        };


                protected String[][] extra_Damage = new String[3][3];
                protected String[][] extra_Agility = new String[2][2];



         ArraysList() {
                extra_Damage[0][0] = "Rage";
                extra_Damage[0][1] = "1500";

                extra_Damage[1][1] = "Shredder";
                extra_Damage[1][2] = "2000";


                extra_Agility[0][0] = "Bolt";
                extra_Agility[0][1] = "250";


        }
}
