package myc.facade_pattern.component;

import lombok.Data;

@Data
public class CdPlayer {
    private Amplifier amplifier;

    public void on() {}
    public void off() {}
    public void eject() {}
    public void pause() {}
    public void play() {}
    public void stop() {}
}
