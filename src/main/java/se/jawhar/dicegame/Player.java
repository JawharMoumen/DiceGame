package se.jawhar.dicegame;

public class Player {

    private String playerName;                    //Privat variabel som lagrar spelarens namn

    public Player(String playerName) {            // Konstruktor som tar emot spelarens namn som parameter
        this.playerName = playerName;             // Tilldelar namnet till till PlayerName variablen

    }

    public String getplayerName() {               // Getter, för att hämta spelarens namn
        return playerName;                        // få tillgång till Privat attribut PlayerName
    }
}

