package de.xyron.tab.listeners;

import de.xyron.tab.XyronTabPlugin;
import de.xyron.tab.managers.ScoreboardManager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerStatisticIncrementEvent;

public class ScoreboardListener implements Listener {
    private final XyronTabPlugin plugin;
    private final ScoreboardManager scoreboardManager;

    public ScoreboardListener(XyronTabPlugin plugin, ScoreboardManager scoreboardManager) {
        this.plugin = plugin;
        this.scoreboardManager = scoreboardManager;
    }

    @EventHandler
    public void onStatisticIncrement(PlayerStatisticIncrementEvent event) {
        scoreboardManager.updateScoreboard(event.getPlayer());
    }
}
