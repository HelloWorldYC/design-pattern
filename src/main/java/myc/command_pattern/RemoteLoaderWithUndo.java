package myc.command_pattern;

import myc.command_pattern.command.Command;
import myc.command_pattern.command.impl.CeilingFanHighCommand;
import myc.command_pattern.command.impl.CeilingFanLowCommand;
import myc.command_pattern.command.impl.CeilingFanMediumCommand;
import myc.command_pattern.command.impl.CeilingFanOffCommand;
import myc.command_pattern.command.impl.CeilingFanOnCommand;
import myc.command_pattern.command.impl.GarageDoorDownCommand;
import myc.command_pattern.command.impl.GarageDoorUpCommand;
import myc.command_pattern.command.impl.LightOffCommand;
import myc.command_pattern.command.impl.LightOnCommand;
import myc.command_pattern.command.impl.MacroCommand;
import myc.command_pattern.command.impl.StereoOffCommand;
import myc.command_pattern.command.impl.StereoOnWithCDCommand;
import myc.command_pattern.invoker.RemoteControl;
import myc.command_pattern.invoker.RemoteControlWithUndo;
import myc.command_pattern.receiver.CeilingFan;
import myc.command_pattern.receiver.GarageDoor;
import myc.command_pattern.receiver.Light;
import myc.command_pattern.receiver.Stereo;

/**
 * 测试遥控器
 */
public class RemoteLoaderWithUndo {
    public static void main(String[] args) {
        // 调用者
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        // 接收者
        Light livingRoomLight = new Light("Living Room Light");
        CeilingFan ceilingFan = new CeilingFan("Living Room Ceiling Fan");

        // 命令
        LightOnCommand livingRoomLightOnCommand = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOffCommand = new LightOffCommand(livingRoomLight);
        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
        CeilingFanMediumCommand ceilingFanMediumCommand = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanLowCommand ceilingFanLowCommand = new CeilingFanLowCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);
        // 宏命令
        Command[] partyOn = {livingRoomLightOnCommand, ceilingFanHighCommand};
        Command[] partyOff = {livingRoomLightOffCommand, ceilingFanOffCommand};
        MacroCommand partyOnCommand = new MacroCommand(partyOn);
        MacroCommand partyOffCommand = new MacroCommand(partyOff);

        // 调用者设置命令
        remoteControl.setCommand(0, livingRoomLightOnCommand, livingRoomLightOffCommand);
        remoteControl.setCommand(1, ceilingFanHighCommand, ceilingFanOffCommand);
        remoteControl.setCommand(2, ceilingFanMediumCommand, ceilingFanOffCommand);
        remoteControl.setCommand(3, ceilingFanLowCommand, ceilingFanOffCommand);
        remoteControl.setCommand(5, partyOnCommand, partyOffCommand);

        System.out.println(remoteControl);

        // 模拟测试电灯
        remoteControl.onButtonWasPressed(0);
        remoteControl.offButtonWasPressed(0);
        remoteControl.undoButtonWasPressed();
        remoteControl.onButtonWasPressed(0);
        remoteControl.offButtonWasPressed(0);
        remoteControl.undoButtonWasPressed();

        // 模拟测试吊扇
        remoteControl.onButtonWasPressed(1);
        remoteControl.offButtonWasPressed(1);
        remoteControl.undoButtonWasPressed();
        remoteControl.onButtonWasPressed(2);
        remoteControl.onButtonWasPressed(3);
        remoteControl.undoButtonWasPressed();
        remoteControl.onButtonWasPressed(3);
        remoteControl.offButtonWasPressed(3);
        remoteControl.undoButtonWasPressed();

        // 模拟测试宏命令
        System.out.println("---- Pushing Macro On ----");
        remoteControl.onButtonWasPressed(5);
        System.out.println("---- Pushing Macro Off ----");
        remoteControl.offButtonWasPressed(5);
    }
}
