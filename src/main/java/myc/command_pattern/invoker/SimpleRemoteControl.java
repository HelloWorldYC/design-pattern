package myc.command_pattern.invoker;

import myc.command_pattern.command.Command;

/**
 * 调用者，遥控器的一个简单实现
 */
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl(){}

    public void setCommand(Command command) {
        this.slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
