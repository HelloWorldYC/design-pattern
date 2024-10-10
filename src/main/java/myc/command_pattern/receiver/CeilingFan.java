package myc.command_pattern.receiver;

/**
 * 接收者，吊扇
 */
public class CeilingFan {
    private String description;
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    private int speed;

    public CeilingFan() {}

    public CeilingFan(String description) {
        this.description = description;
        speed = OFF;
    }

    public void on(){
        System.out.println(description + "ceiling fan is on");
    }

    public void off(){
        speed = OFF;
        System.out.println(description + "ceiling fan is off");
    }

    public void high() {
        speed = HIGH;
        System.out.println(description + "ceiling fan speed is high");
    }

    public void medium() {
        speed = MEDIUM;
        System.out.println(description + "ceiling fan speed is medium");
    }

    public void low() {
        speed = LOW;
        System.out.println(description + "ceiling fan speed is low");
    }

    public int getSpeed() {
        return speed;
    }
}
