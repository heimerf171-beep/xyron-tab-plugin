package de.xyron.tab.commands;

import de.xyron.tab.XyronTabPlugin;
import de.xyron.tab.managers.TeamManager;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TeamCommand implements CommandExecutor {
    private final XyronTabPlugin plugin;
    private final TeamManager teamManager;

    public TeamCommand(XyronTabPlugin plugin, TeamManager teamManager) {
        this.plugin = plugin;
        this.teamManager = teamManager;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Nur Spieler können diesen Befehl nutzen!");
            return true;
        }

        Player player = (Player) sender;

        if (args.length == 0) {
            player.sendMessage("§c/team <create|invite|accept|leave|delete|rename|list>");
            return true;
        }

        switch (args[0].toLowerCase()) {
            case "create":
                if (args.length < 2) {
                    player.sendMessage("§c/team create <teamname>");
                    return true;
                }
                String teamName = args[1];
                teamManager.createTeam(teamName, player.getUniqueId());
                player.sendMessage("§aTeam '" + teamName + "' erfolgreich erstellt!");
                break;
            case "list":
                player.sendMessage("§bTeams werden geladen...");
                break;
            default:
                player.sendMessage("§cUnbekannter Subbefehl!");
        }
        return true;
    }
}
