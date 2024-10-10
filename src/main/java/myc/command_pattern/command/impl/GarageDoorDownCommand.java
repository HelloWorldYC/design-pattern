package myc.command_pattern.command.impl;

import myc.command_pattern.command.Command;
import myc.command_pattern.receiver.GarageDoor;

/**
 * 开车库门命令
 */
public class GarageDoorDownCommand implements Command {
    private GarageDoor garageDoor;

    public GarageDoorDownCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.down();
    }

    @Override
    public void undo() {
        garageDoor.up();
    }
}
