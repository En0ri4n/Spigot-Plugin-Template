package fr.en0ri4n.plugin.runnables;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class TaskHelper
{
    private static JavaPlugin pluginInstance;

    public static void init(JavaPlugin plugin)
    {
        pluginInstance = plugin;
    }

    private static JavaPlugin getPlugin()
    {
        if(pluginInstance == null)
            throw new IllegalStateException("TaskHelper not initialized !");

        return pluginInstance;
    }

    public static int startScheduledTask(Runnable task, long period)
    {
        return Bukkit.getScheduler().scheduleSyncRepeatingTask(getPlugin(), task, 0L, period);
    }

    public static void runTaskLater(Runnable task, long delay)
    {
        Bukkit.getScheduler().runTaskLater(getPlugin(), task, delay);
    }

    public static void stopTask(int taskId)
    {
        Bukkit.getScheduler().cancelTask(taskId);
    }
}
