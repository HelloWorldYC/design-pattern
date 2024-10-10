package myc.command_pattern;

import myc.command_pattern.command.impl.CeilingFanOffCommand;
import myc.command_pattern.command.impl.CeilingFanOnCommand;
import myc.command_pattern.command.impl.GarageDoorDownCommand;
import myc.command_pattern.command.impl.GarageDoorUpCommand;
import myc.command_pattern.command.impl.LightOffCommand;
import myc.command_pattern.command.impl.LightOnCommand;
import myc.command_pattern.command.impl.StereoOffCommand;
import myc.command_pattern.command.impl.StereoOnWithCDCommand;
import myc.command_pattern.invoker.RemoteControl;
import myc.command_pattern.receiver.CeilingFan;
import myc.command_pattern.receiver.GarageDoor;
import myc.command_pattern.receiver.Light;
import myc.command_pattern.receiver.Stereo;

/**
 * 测试遥控器
 */
public class RemoteLoader {
    public static void main(String[] args) {
        // 调用者
        RemoteControl remoteControl = new RemoteControl();

        // 接收者
        Light livingRoomLight = new Light("Living Room Light");
        Light kitchenLight = new Light("Kitchen Light");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor("");
        Stereo stereo = new Stereo("Living Room");

        // 命令
        LightOnCommand livingRoomLightOnCommand = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOffCommand = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOnCommand = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOffCommand = new LightOffCommand(kitchenLight);
        CeilingFanOnCommand ceilingFanOnCommand = new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);
        GarageDoorUpCommand garageDoorUpCommand = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDownCommand = new GarageDoorDownCommand(garageDoor);
        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        // 调用者设置命令
        remoteControl.setCommand(0, livingRoomLightOnCommand, livingRoomLightOffCommand);
        remoteControl.setCommand(1, kitchenLightOnCommand, kitchenLightOffCommand);
        remoteControl.setCommand(2, ceilingFanOnCommand, ceilingFanOffCommand);
        remoteControl.setCommand(3, garageDoorUpCommand, garageDoorDownCommand);
        remoteControl.setCommand(4, stereoOnWithCDCommand, stereoOffCommand);

        System.out.println(remoteControl);

        // 模拟测试
        remoteControl.onButtonWasPressed(0);
        remoteControl.offButtonWasPressed(0);
        remoteControl.onButtonWasPressed(1);
        remoteControl.offButtonWasPressed(1);
        remoteControl.onButtonWasPressed(2);
        remoteControl.offButtonWasPressed(2);
        remoteControl.onButtonWasPressed(3);
        remoteControl.offButtonWasPressed(3);
        remoteControl.onButtonWasPressed(4);
        remoteControl.offButtonWasPressed(4);
    }
}
