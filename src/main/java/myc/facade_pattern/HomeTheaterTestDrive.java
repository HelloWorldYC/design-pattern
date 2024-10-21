package myc.facade_pattern;

import myc.facade_pattern.component.Amplifier;
import myc.facade_pattern.component.CdPlayer;
import myc.facade_pattern.component.DvdPlayer;
import myc.facade_pattern.component.PopcornPopper;
import myc.facade_pattern.component.Projector;
import myc.facade_pattern.component.Screen;
import myc.facade_pattern.component.TheaterLights;
import myc.facade_pattern.component.Tuner;
import myc.facade_pattern.facade.HomeTheaterFacade;

public class HomeTheaterTestDrive {
    public static void main(String[] args) {
        Amplifier amplifier = new Amplifier();
        Tuner tuner = new Tuner();
        DvdPlayer dvdPlayer = new DvdPlayer();
        CdPlayer cdPlayer = new CdPlayer();
        Projector projector = new Projector();
        Screen screen = new Screen();
        PopcornPopper popcornPopper = new PopcornPopper();
        TheaterLights theaterLights = new TheaterLights();

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(amplifier, tuner, dvdPlayer, cdPlayer, projector, screen, theaterLights, popcornPopper);
        homeTheaterFacade.watchMovie("Raiders of the Lost Ark");
        homeTheaterFacade.endMovie();
    }
}
