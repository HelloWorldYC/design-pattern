package myc.proxy_pattern.remote_proxy.machine;

import lombok.Getter;
import myc.proxy_pattern.remote_proxy.machine.remote.GumballMachineRemote;
import myc.proxy_pattern.remote_proxy.state.State;
import myc.proxy_pattern.remote_proxy.state.impl.HasQuarterState;
import myc.proxy_pattern.remote_proxy.state.impl.NoQuarterState;
import myc.proxy_pattern.remote_proxy.state.impl.SoldOutState;
import myc.proxy_pattern.remote_proxy.state.impl.SoldState;
import myc.proxy_pattern.remote_proxy.state.impl.WinnerState;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * 实际提供服务的对象
 */
@Getter
public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {
    private State soldOutState;
    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;
    private State winnerState;

    private String location;
    private State state = soldOutState;
    private int count = 0;

    public GumballMachine(int numberGumballs) throws RemoteException {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = noQuarterState;
        }
    }

    public GumballMachine(String location, int count) throws RemoteException {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
        this.location = location;
        this.count = count;
        if (count > 0) {
            state = noQuarterState;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void releaseBall() {
        System.out.println("A gumball comes rolling out the slot");
        if (count != 0) {
            count = count - 1;
        }
    }

    public void refill(int count) {
        this.count = count;
        state = noQuarterState;
    }

    @Override
    public String toString() {
        return "\nthe gumball number is " + count;
    }
}
