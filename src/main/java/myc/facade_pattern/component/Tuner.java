package myc.facade_pattern.component;

import lombok.Data;

@Data
public class Tuner {
    private Amplifier amplifier;

    public void on() {}
    public void off() {}
    public void setAm() {}
    public void setFm() {}
    public void setFrequency() {}
}
