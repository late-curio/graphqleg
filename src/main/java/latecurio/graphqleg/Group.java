package latecurio.graphqleg;

import java.util.Arrays;
import java.util.List;

public class Group {
    private String id;
    private String name;

    public Group(String id, String name) {
        this.id = id;
        this.name = name;
    }

    private static List<Group> groups = Arrays.asList(
            new Group("fbl", "Forbidden Lands"),
            new Group("ep", "Eclipse Phase"),
            new Group("dg", "Delta Green")
    );

    public static Group getById(String id) {
        for (Group group : groups) {
            if(group.id.equals(id)) {
                return group;
            }
        }
        return null;
    }

    public String getId() {
        return id;
    }
}
