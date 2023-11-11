package cn.qfys521.notmushroomontheend;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;

public class CommonCommands implements CommandExecutor {
    Plugin plugin = Bukkit.getServer().getPluginManager().getPlugin("NotMushroomOnTheEnd");
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        if (command.getName().equalsIgnoreCase("NotMushroomOnTheEnd")) {
            switch (args[0]){
                case "enable" -> {
                    plugin.getConfig().set("enable" , true);
                    sender.sendMessage("enabled! but you might reload this server or this plugin to enable it.");
                    return true;
                }
                case  "disable" -> {
                    plugin.getConfig().set("enable" , false);
                    sender.sendMessage("disabled! but you might reload this server or this plugin to enable it.");
                    return true;
                }
                default -> {
                    return false;
                }
            }
        }
    return true;
    }
}
