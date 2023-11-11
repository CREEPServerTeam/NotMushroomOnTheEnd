package cn.qfys521.notmushroomontheend;

import org.bukkit.plugin.java.JavaPlugin;

public final class NotMushroomOnTheEnd extends JavaPlugin {
    public void onEnable() {
        getConfig();
        saveDefaultConfig();
        getLogger().info("Enabling...");
        getServer().getPluginManager().registerEvents(new Listeners(), this);
    }

    public void onDisable() {
        getLogger().info("Disabling...");
    }
}