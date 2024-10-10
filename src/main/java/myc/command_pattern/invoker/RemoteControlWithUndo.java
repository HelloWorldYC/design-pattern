package myc.command_pattern.invoker;

import myc.command_pattern.command.Command;
import myc.command_pattern.command.impl.NoCommand;

/**
 * 调用者，较完整地实现一个遥控器，支持撤销功能
 */
public class RemoteControlWithUndo {
    // 遥控器上的开与关按钮，每个按钮对应一个命令
    Command[] onCommands;
    Command[] offCommands;
    // 记录上一个命令
    Command undoCommand;

    public RemoteControlWithUndo() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }

        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPressed(int slot) {
        undoCommand = onCommands[slot];
        onCommands[slot].execute();
    }

    public void offButtonWasPressed(int slot) {
        undoCommand = offCommands[slot];
        offCommands[slot].execute();
    }

    public void undoButtonWasPressed() {
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n------ Remote Control ------\n");

        for (int i = 0; i < onCommands.length; i++) {
            stringBuffer.append("[slot " + i + "] " + onCommands[i].getClass().getName() + "    " + offCommands[i].getClass().getName() + "\n");
        }

        return stringBuffer.toString();
    }
}
