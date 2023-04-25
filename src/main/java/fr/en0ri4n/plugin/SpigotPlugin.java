package fr.en0ri4n.plugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class SpigotPlugin extends JavaPlugin
{
    private static SpigotPlugin instance;

    @Override
    public void onEnable()
    {
        // Plugin startup logic
        instance = this;
    }

    @Override
    public void onDisable()
    {
        // Plugin shutdown logic
    }

    public static SpigotPlugin get()
    {
        return instance;
    }
}
