package myc.command_pattern.receiver;

/**
 * 接收者，车库门
 */
public class GarageDoor {
    private String description;

    public GarageDoor() {}

    public GarageDoor(String description) {
        this.description = description;
    }

    public void up(){
        System.out.println(description + "garage Door is up");
    }

    public void down(){
        System.out.println(description + "garage Door is down");
    }

    public void stop(){}
    public void lightOn(){}
    public void lightOff(){}
}
