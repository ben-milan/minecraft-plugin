package ch.bmk.plugin.commands;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GameModeCommand implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		if(sender instanceof Player) {
			Player p = (Player) sender;
			if(p.hasPermission("plugin.gm")) {
				if(args.length == 1) {
					
					if(args[0].equalsIgnoreCase("c")) {
						p.setGameMode(GameMode.CREATIVE);				
						p.sendMessage("§aDu bist nun im Gamemode §6Creative§a!");
					} else
						if(args[0].equalsIgnoreCase("s")) {
							p.setGameMode(GameMode.SURVIVAL);
							p.sendMessage("§aDu bist nun im Gamemode §6Survival§a!");
						} else
							if(args[0].equalsIgnoreCase("a")) {
								p.setGameMode(GameMode.ADVENTURE);
								p.sendMessage("§aDu bist nun im Gamemode §6Adventure§a!");
							} else
								if(args[0].equalsIgnoreCase("sp")) {
									p.setGameMode(GameMode.SPECTATOR);
									p.sendMessage("§aDu bist nun im Gamemode §6Spectator§a!");
								} else
									p.sendMessage("§aBitte benutze §6/gm <C/S/A/SP>§a!");
					
				} else
					p.sendMessage("§aBitte benutze §6/gm <C/S/A/SP>§a!");
			} else
				p.sendMessage("§cDazu hast du keine Rechte!");
		}
	return false;
		
	}

}
