package myc.facade_pattern.facade;

import lombok.Data;
import myc.facade_pattern.component.Amplifier;
import myc.facade_pattern.component.CdPlayer;
import myc.facade_pattern.component.DvdPlayer;
import myc.facade_pattern.component.PopcornPopper;
import myc.facade_pattern.component.Projector;
import myc.facade_pattern.component.Screen;
import myc.facade_pattern.component.TheaterLights;
import myc.facade_pattern.component.Tuner;

/**
 * 家庭影院外观，只提供了简化的接口，没有封闭原来组件的功能
 */
@Data
public class HomeTheaterFacade {
    private Amplifier amplifier;
    private Tuner tuner;
    private DvdPlayer dvdPlayer;
    private CdPlayer cdPlayer;
    private Projector projector;
    private TheaterLights theaterLights;
    private Screen screen;
    private PopcornPopper popcornPopper;

    public HomeTheaterFacade(Amplifier amplifier, Tuner tuner, DvdPlayer dvdPlayer, CdPlayer cdPlayer,
                             Projector projector, Screen screen, TheaterLights theaterLights, PopcornPopper popcornPopper) {
        this.amplifier = amplifier;
        this.tuner = tuner;
        this.dvdPlayer = dvdPlayer;
        this.cdPlayer = cdPlayer;
        this.projector = projector;
        this.screen = screen;
        this.theaterLights = theaterLights;
        this.popcornPopper = popcornPopper;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie");
        popcornPopper.on();
        popcornPopper.pop();
        theaterLights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amplifier.on();
        amplifier.setDvd(dvdPlayer);
        amplifier.setSurroundSound();
        amplifier.setVolume(5);
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        popcornPopper.off();
        theaterLights.on();
        screen.up();
        projector.off();
        amplifier.off();
        dvdPlayer.stop();
        dvdPlayer.eject();
        dvdPlayer.off();
    }
}
