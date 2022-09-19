package me.infinitemist.plugintemplate.commands;

import me.infinitemist.plugintemplate.Main;
import me.infinitemist.plugintemplate.utils.Permissions;
import org.bukkit.command.CommandSender;



public class CommandReload extends CommandDefault {
    private final Main plugin;

    public CommandReload(Main plugin) {

        this.plugin = plugin;
    }

    //change command prefix/plugin name to new plugin
    @Override
    public String getCommandStart() {
        return "plugintemplate reload";
    }

    @Override
    public String getHelp(CommandSender target) {
        if (target.hasPermission(Permissions.RELOAD))
            return "/reload - reload configs";
        return null;
    }

    @Override
    public void execute(CommandSender sender, String[] args) {
        if (sender.hasPermission(Permissions.RELOAD))
            Main.getConfigManager().reloadConfig();

    }
}
