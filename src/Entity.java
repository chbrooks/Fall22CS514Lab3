import java.util.Date;

public class Entity {
    String name;

    public Entity() {
        this.name = "";
    }


    public Entity(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
