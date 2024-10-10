package myc.command_pattern;

import myc.command_pattern.command.impl.GarageDoorDownCommand;
import myc.command_pattern.command.impl.LightOnCommand;
import myc.command_pattern.invoker.SimpleRemoteControl;
import myc.command_pattern.receiver.GarageDoor;
import myc.command_pattern.receiver.Light;

/**
 * 测试
 */
public class RemoteControlTest {
    public static void main(String[] args) {
        // 遥控器是调用者
        SimpleRemoteControl remote = new SimpleRemoteControl();
        // 灯是接收者
        Light light = new Light();
        // 开灯命令，传入接收者
        LightOnCommand command = new LightOnCommand(light);
        // 调用者要设置命令
        remote.setCommand(command);
        // 模拟开灯
        remote.buttonWasPressed();

        GarageDoor garageDoor = new GarageDoor();
        GarageDoorDownCommand garageOpen = new GarageDoorDownCommand(garageDoor);
        remote.setCommand(garageOpen);
        remote.buttonWasPressed();
    }
}
