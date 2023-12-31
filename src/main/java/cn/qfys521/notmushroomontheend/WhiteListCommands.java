package cn.qfys521.notmushroomontheend;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;

public class WhiteListCommands implements CommandExecutor {
    Plugin plugin = Bukkit.getServer().getPluginManager().getPlugin("NotMushroomOnTheEnd");

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length != 1) {
            sender.sendMessage("Your parameter input is incorrect. You entered " + args.length
                    + " parameters, but the command only accepts 1 parameter.");
            return false;
        }

        switch (command.getName()) {
            case "addMushWhitelist" -> {
                this.plugin.getConfig().set(args[0], true);
                sender.sendMessage("Added to the whitelist!");
                this.plugin.saveConfig();
                return true;
            }
            case "removeMushWhitelist" -> {
                this.plugin.getConfig().set(args[0], false);
                sender.sendMessage("Removed from the whitelist!");
                this.plugin.saveConfig();
                return true;
            }
            default -> {
                return false;
            }
        }
    }
}