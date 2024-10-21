package myc.facade_pattern.component;

import lombok.Data;

@Data
public class Projector {
    private DvdPlayer dvdPlayer;

    public void on() {}
    public void off() {}
    public void tvMode() {}
    public void wideScreenMode() {}
}
