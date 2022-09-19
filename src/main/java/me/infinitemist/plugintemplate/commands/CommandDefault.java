package me.infinitemist.plugintemplate.commands;

import org.apache.commons.lang.StringUtils;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.util.StringUtil;

import java.util.ArrayList;
import java.util.List;

public abstract class CommandDefault {

    /**
     *
     * @param command The command to check for execution
     * @param args    The arguments to check
     * @return true if it can execute the command
     *
     */
    public boolean canExecute(Command command, String[] args) {
        String commandString = command.getName() + " " + StringUtils.join(args, " ");
        if(commandString.length() > getCommandStart().length()) {
            return commandString.toLowerCase().startsWith(getCommandStart().toLowerCase() + " ");
        }
        return commandString.toLowerCase().startsWith(getCommandStart().toLowerCase());
    }

    /**
     * Get the argument that comes after the base command that this command reacts to.
     *
     * @return The string that should be in front of the command for this class to act
     */
    public abstract String getCommandStart();

    public abstract String getHelp(CommandSender target);


    /**
     * Execute a (sub)command if the conditions are met.
     *
     * @param sender The commandSender that executed the command
     * @param args   The arguments that are given
     */
    public abstract void execute(CommandSender sender, String[] args);

    /**
     * Get a list of string to complete a command with (raw list, not matching ones not filtered out).
     *
     * @param toComplete The number of the argument that has to be completed
     * @param start      The already given start of the command
     * @param sender     The CommandSender that wants to tab complete
     * @return A collection with all the possibilities for argument to complete
     */
    public List<String> getTabCompleteList(int toComplete, String[] start, CommandSender sender) {
        return new ArrayList<>();
    }
}
