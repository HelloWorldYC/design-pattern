package myc.state_pattern.improvement.state;

/**
 * 糖果机状态的通用接口，所有状态需要实现该接口
 */
public interface State {
    // 动作：投入25分钱
    void insertQuarter();

    // 动作：退回25分钱
    void ejectQuarter();

    // 转动手柄
    void turnCrank();

    // 发放糖果
    void dispense();
}
