package myc.command_pattern.command.impl;

import myc.command_pattern.command.Command;
import myc.command_pattern.receiver.Light;

/**
 * 关灯命令
 */
public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
