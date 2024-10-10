package myc.command_pattern.command;

/**
 * 命令接口，所有命令都要实现这个接口
 */
public interface Command {
    /**
     * 执行命令
     */
    void execute();

    /**
     * 撤销命令
     */
    void undo();
}
