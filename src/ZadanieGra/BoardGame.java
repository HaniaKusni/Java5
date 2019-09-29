package ZadanieGra;

import java.math.BigDecimal;

public class BoardGame {
    public String name;
    public double rate;
    public BigDecimal price;
    public int minPlayers;
    public int maxPLayers;
    public String tags;
    public BoardGame(String name, double rate, BigDecimal price, int minPlayers, int maxPLayers, String tags) {
        this.name = name;
        this.rate = rate;
        this.price = price;
        this.minPlayers = minPlayers;
        this.maxPLayers = maxPLayers;
        this.tags = tags;
    }
}

