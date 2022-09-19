package me.infinitemist.plugintemplate.commands;

import me.infinitemist.plugintemplate.Main;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/*
 *
 * Example of implemented command
 *
 */
public class CommandExample extends CommandDefault {
    private final Main plugin;

    public CommandExample(Main plugin) {
        this.plugin = plugin;
    }

    @Override
    public String getCommandStart() {
        return "plugintemplate example";
    }

    @Override
    public String getHelp(CommandSender target) {
        return null;
    }

    @Override
    public void execute(CommandSender sender, String[] args) {
        Player player = (Player) sender;

        if(player == null) {
            // Command was triggered from console
            return;
        }
        if(!sender.hasPermission("plugintemplate.example")){
            // The player (Sender) doesn't have the required permissions, notify them
            return;
        }


    }
}
