package cn.qfys521.notmushroomontheend;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.plugin.Plugin;

public class Listeners implements Listener {
    @EventHandler
    public void playerSetupMushroomEvent(BlockPlaceEvent event) {
        Player player = event.getPlayer();
        Plugin plugin = Bukkit.getServer().getPluginManager().getPlugin("NotMushroomOnTheEnd");

        if (!plugin.getConfig().getBoolean("enable")) {
            return;
        }
        if (plugin.getConfig().getBoolean(player.getName())
                || player.getWorld().getEnvironment() != World.Environment.THE_END) {
            return;
        }
        if (event.getBlock().getType() == Material.BROWN_MUSHROOM
                || event.getBlock().getType() == Material.RED_MUSHROOM) {
            event.setCancelled(true);
            player.sendMessage(" [§cWarn§r]  > §5 you are not allow to place a mushroom here.§r");
        }
    }
}