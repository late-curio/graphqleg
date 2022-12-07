package latecurio.graphqleg;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

@Controller
public class PlayerController {

    @QueryMapping
    public Player playerById(@Argument String id) {
        return Player.getById(id);
    }

    @SchemaMapping
    public Group group(Player player) {
        return Group.getById(player.getGroupId());
    }
}
