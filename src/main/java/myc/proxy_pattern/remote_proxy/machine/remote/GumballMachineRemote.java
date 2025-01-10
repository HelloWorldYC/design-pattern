package myc.proxy_pattern.remote_proxy.machine.remote;

import myc.proxy_pattern.remote_proxy.state.State;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * 远程接口，所有支持的方法返回类型都必须是原语类型或可序列化类型
 */
public interface GumballMachineRemote extends Remote {
    int getCount() throws RemoteException;
    String getLocation() throws RemoteException;
    State getState() throws RemoteException;
}
