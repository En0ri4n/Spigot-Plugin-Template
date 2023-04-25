package fr.en0ri4n.spigotutilitiesplugin.runnables.utils;

import fr.en0ri4n.spigotutilitiesplugin.SpigotUtilitiesPlugin;
import org.bukkit.Bukkit;

public class TaskHelper
{
    public static int startScheduledTask(Runnable task, long period)
    {
        return Bukkit.getScheduler().scheduleSyncRepeatingTask(SpigotUtilitiesPlugin.get(), task, 0L, period);
    }

    public static void cancelTask(int taskId)
    {
        Bukkit.getScheduler().cancelTask(taskId);
    }

    public static void runTaskLater(Runnable task, long delay)
    {
        Bukkit.getScheduler().runTaskLater(SpigotUtilitiesPlugin.get(), task, delay);
    }

    public static void stopTask(int taskId)
    {
        Bukkit.getScheduler().cancelTask(taskId);
    }
}
