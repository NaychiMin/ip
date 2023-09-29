package userinputs;

import commands.*;

public class Parser {
    public static Commands parse(String input) {
        if (input.startsWith(Commands.MARK_TASK_COMMAND)) {
            return new MarkTaskCommand(input);
        } else if (input.startsWith(Commands.UNMARK_TASK_COMMAND)) {
            return new UnmarkTaskCommand(input);
        } else if (input.startsWith(Commands.DELETE_TASK_COMMAND)){
            return new DeleteTaskCommand(input);
        } else if(input.equals(Commands.LIST_TASK_COMMAND)) {
            return new ListTaskCommand(input);
        } else if (input.startsWith(Commands.USER_HELP_COMMAND)){
            return new HelpTaskCommand(input);
        } else if (input.startsWith(Commands.EXIT_BOT_COMMAND)){
            return new Commands(input);
        } else if (input.startsWith(Commands.USER_FIND_COMMAND)){
            return new FindTaskCommand(input);
        } else {
            return new AddTaskCommand(input);
        }
    }

}
