package myc.command_pattern.receiver;

/**
 * 接收者，音响
 */
public class Stereo {
    private String description;

    public Stereo(){}

    public Stereo(String description) {
        this.description = description;
    }

    public void on(){
        System.out.println(description + " stereo is on");
    }

    public void off(){
        System.out.println(description + " stereo is off");
    }

    public void setCd(){
        System.out.println(description + " stereo is set for CD input");
    }

    public void setDvd(){
        System.out.println(description + " stereo is set for DVD input");
    }

    public void setRadio(){
        System.out.println(description + " stereo is set for Radio input");
    }
    public void setVolume(int volume){
        System.out.println(description + " stereo volume set to " + volume);
    }
}
