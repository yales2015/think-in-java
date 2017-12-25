package EnumTest;

/**
 * Created by yy on 2017/12/25.
 */
public enum Ozwitch{
    WEST("Miss Gulch,aka the wicked witch of the west"),
    NORTH("Glinda,the good witch of the North"),
    EAST("Wicked Witch of the east,wearer of the Rubby Slipper"),
    SOUTH("Good by inference,but missing");
    private String description;
    private Ozwitch(String description){
        this.description=description;
    }
    public String getDescription(){
        return description;
    }

    public static void main(String[] args) {
        for (Ozwitch witch:Ozwitch.values()) {
            System.out.println(witch+":"+witch.getDescription());
        }
    }
}
