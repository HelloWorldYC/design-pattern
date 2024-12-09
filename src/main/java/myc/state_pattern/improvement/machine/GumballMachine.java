package myc.state_pattern.improvement.machine;

import lombok.Getter;
import myc.state_pattern.improvement.state.State;
import myc.state_pattern.improvement.state.impl.HasQuarterState;
import myc.state_pattern.improvement.state.impl.NoQuarterState;
import myc.state_pattern.improvement.state.impl.SoldOutState;
import myc.state_pattern.improvement.state.impl.SoldState;
import myc.state_pattern.improvement.state.impl.WinnerState;

@Getter
public class GumballMachine {
    private State soldOutState;
    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;
    private State winnerState;

    private State state = soldOutState;
    private int count = 0;

    public GumballMachine(int numberGumballs) {
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
