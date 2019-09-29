package ZadanieGra;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class BoardGameGenerator {

    private static List<BoardGame> games = Arrays.asList(
            new BoardGame("Terraforming Mars",8.38,new BigDecimal("123.49"),
                    1,5,"fantasy, adventure"),
            new BoardGame("Terraforming Mars",8.38,new BigDecimal("123.49"),
                    1,5,"fantasy, adventure"),
            new BoardGame("Codenames",7.82,new BigDecimal("64.95"),
                    2,8,"family, mystery"),
            new BoardGame("Puerto rico",8.07,new BigDecimal("149.99"),
                    2,5,"criminal, fantasy"),
            new BoardGame("Terra mystica",8.26,new BigDecimal("252.99"),
                    2,5,"sci-fi, mystery"),
            new BoardGame("Scythe",8.3,new BigDecimal("314.95"),
                    1,5,"family"),
            new BoardGame("Power Grid",7.92,new BigDecimal("145"),
                    2,6,"adventure, family"),
            new BoardGame("7 wonders duel",8.15,new BigDecimal("109"),
                    2,2,"cryminal, fantasy"),
            new BoardGame("Dominion Intrique",7.77,new BigDecimal("159"),
                    2,4,"sci-fi, cards"),
            new BoardGame("Patchwork",7.77,new BigDecimal("75"),
                    2,2,"adventure, cryminal"),
            new BoardGame("The castles of Burgundy",8.12,new BigDecimal("129.95"),
                    2,4,"family, mystery")
    );
    public static List<BoardGame> getGames(){
        return games;
    }
}
