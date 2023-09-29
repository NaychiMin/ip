package commands;


import taskmanagement.Task;
import taskmanagement.Storage;
import taskmanagement.TaskList;
import userinputs.Ui;

import java.util.ArrayList;

public class Commands {
    public static final String DELETE_TASK_COMMAND = "delete ";
    public static final String MARK_TASK_COMMAND = "mark ";
    public static final String UNMARK_TASK_COMMAND = "unmark ";
    public static final String LIST_TASK_COMMAND = "list";
    public static final String EXIT_BOT_COMMAND = "bye";
    public static final String TODO_TASK_COMMAND = "todo";
    public static final String DEADLINE_TASK_COMMAND = "deadline";
    public static final String DEADLINE_DATE_COMMAND = "/by ";
    public static final String EVENT_TASK_COMMAND = "event";
    public static final String EVENT_TASK_START = "/from ";
    public static final String EVENT_TASK_END = "/to ";
    public static final String USER_HELP_COMMAND = "help";

    protected String input;
    public Commands(String input) {
        this.input = input;
    }

    public void execute(TaskList tasks, Ui ui, Storage storage) {}

    public boolean isExitCommand(String input) {
        return input.equalsIgnoreCase(Commands.EXIT_BOT_COMMAND);
    }
}