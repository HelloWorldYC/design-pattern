package myc.command_pattern.command.impl;

import myc.command_pattern.command.Command;

/**
 * 空命令
 */
public class NoCommand implements Command {
    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
