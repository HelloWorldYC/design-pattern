package myc.proxy_pattern.remote_proxy;

import myc.proxy_pattern.remote_proxy.machine.GumballMonitor;
import myc.proxy_pattern.remote_proxy.machine.remote.GumballMachineRemote;
import java.rmi.Naming;


public class GumballMonitorTestDrive {
    public static void main(String[] args) {
        String[] location = {
                "rmi://127.0.0.1/gumballmachine"
        };

        GumballMonitor[] monitor = new GumballMonitor[location.length];

        for (int i = 0; i < location.length; i++) {
            try {
                // 这里的 machine 实际上是代理
                GumballMachineRemote machine = (GumballMachineRemote) Naming.lookup(location[i]);
                monitor[i] = new GumballMonitor(machine);
                System.out.println(monitor[i]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < monitor.length; i++) {
            monitor[i].report();
        }
    }
}
