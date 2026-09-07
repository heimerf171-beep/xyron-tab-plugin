package de.xyron.tab.commands;

import de.xyron.tab.XyronTabPlugin;
import de.xyron.tab.managers.PlayerManager;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SettingsCommand implements CommandExecutor {
    private final XyronTabPlugin plugin;
    private final PlayerManager playerManager;

    public SettingsCommand(XyronTabPlugin plugin, PlayerManager playerManager) {
        this.plugin = plugin;
        this.playerManager = playerManager;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Nur Spieler können diesen Befehl nutzen!");
            return true;
        }

        Player player = (Player) sender;
        player.sendMessage("§bEinstellungen öffnen...");
        return true;
    }
}
