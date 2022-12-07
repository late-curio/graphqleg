package latecurio.graphqleg;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Player {
    private String id;
    private String name;
    private String email;
    private int sessionCount;

    private String groupId;

    public Player(String id, String name, String email, int sessionCount, String groupId) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.sessionCount = sessionCount;
        this.groupId = groupId;
    }

    private final static List<Player> players = Arrays.asList(
            new Player("will", "Will", "will@somewhere.com", 100, "dg"),
            new Player("matt", "Matt", "matt@lexingtonfd.org", 100_000, "fbl"),
            new Player("tiffany", "Tiffany", "randomnpc@quest.com", 10, "ep")
    );

    public static Player getById(String id) {
        for (Player player : players) {
            if(player.id.equals(id)) {
                return player;
            }
        }
        return null;
    }

    public String getId() {
        return id;
    }

    public String getGroupId() {
        return groupId;
    }
}
