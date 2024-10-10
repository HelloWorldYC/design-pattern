package myc.command_pattern.command.impl;

import myc.command_pattern.command.Command;
import myc.command_pattern.receiver.GarageDoor;

/**
 * 开车库门命令
 */
public class GarageDoorUpCommand implements Command {
    private GarageDoor garageDoor;

    public GarageDoorUpCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }

    @Override
    public void undo() {
        garageDoor.down();
    }
}
