package fr.en0ri4n.plugin.scoreboard;

import org.bukkit.Bukkit;
import org.bukkit.scoreboard.Scoreboard;

@SuppressWarnings("ConstantConditions")
public abstract class GlobalScoreboard extends BaseScoreboard
{
    public void registerScoreboard()
    {
        Scoreboard scoreboard = Bukkit.getScoreboardManager().getMainScoreboard();

        registerObjectives(scoreboard);

        updateScoreboard();
    }

    protected abstract void registerObjectives(Scoreboard scoreboard);

    @Override
    public void updateScoreboard()
    {
        Scoreboard scoreboard = Bukkit.getScoreboardManager().getMainScoreboard();

        updateMainScoreboard(scoreboard);
    }

    public abstract void updateMainScoreboard(Scoreboard scoreboard);
}
