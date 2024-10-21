package myc.facade_pattern.component;

import lombok.Data;

@Data
public class DvdPlayer {
    private Amplifier amplifier;

    public void on() {}
    public void off() {}
    public void eject() {}
    public void pause() {}
    public void play(String movie) {}
    public void setSurroundAudio() {}
    public void setTwoChannelAudio() {}
    public void stop() {}
}
