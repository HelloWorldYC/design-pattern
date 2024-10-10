package myc.command_pattern.command.impl;

import myc.command_pattern.command.Command;
import myc.command_pattern.receiver.Light;

/**
 * 开灯命令
 */
public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
