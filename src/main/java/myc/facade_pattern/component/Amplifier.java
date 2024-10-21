package myc.facade_pattern.component;

import lombok.Data;

@Data
public class Amplifier {
    private Tuner tuner;
    private DvdPlayer dvdPlayer;
    private CdPlayer cdPlayer;

    public void on() {}
    public void off() {}
    public void setCd() {}

    public void setDvd(DvdPlayer dvdPlayer) {
        this.dvdPlayer = dvdPlayer;
    }

    public void setStereoSound() {}
    public void setSurroundSound() {}
    public void setTuner() {}
    public void setVolume(int volume) {}
}
