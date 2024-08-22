package ch.bmk.plugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.WorldBorder;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import ch.bmk.plugin.main.Main;

public class WorldBorderCommand implements CommandExecutor{
	
	int Start_CO = 31;
	int count;
	
	@Override
	public boolean onCommand( CommandSender sender,  Command cmd,  String label, String[] args) {
		
		if(sender instanceof Player) {
		Player p = (Player) sender;
		if(p.hasPermission("plugin.start")) {
		count = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getinstance(), new Runnable() {

			@Override
			public void run() {
				Start_CO = Start_CO -1;
				
				if(Start_CO == 30) {
					Bukkit.broadcastMessage("§a§lVaro §r§astartet in: §630 §r§aSekunden!");
				}else
					if(Start_CO == 20) {
					Bukkit.broadcastMessage("§a§lVaro §r§astartet in: §620 §r§aSekunden!");	
						
						
					}else
						if(Start_CO == 15) {
							Bukkit.broadcastMessage("§a§lVaro §r§astartet in: §615 §r§aSekunden!");	
								
								
						}else
							if(Start_CO == 10) {
								Bukkit.broadcastMessage("§a§lVaro §r§astartet in: §610 §r§aSekunden!");	
									
									
							}else
								if(Start_CO == 9) {
									Bukkit.broadcastMessage("§a§lVaro §r§astartet in: §69 §r§aSekunden!");	
										
										
								}else
									if(Start_CO == 8) {
										Bukkit.broadcastMessage("§a§lVaro §r§astartet in: §68 §r§aSekunden!");	
											
											
									}else
										if(Start_CO == 7) {
											Bukkit.broadcastMessage("§a§lVaro §r§astartet in: §67 §r§aSekunden!");	
												
												
										}else
											if(Start_CO == 6) {
												Bukkit.broadcastMessage("§a§lVaro §r§astartet in: §66 §r§aSekunden!");	
													
													
											}else
												if(Start_CO == 5) {
													Bukkit.broadcastMessage("§a§lVaro §r§astartet in: §65 §r§aSekunden!");	
														
														
												}else
													if(Start_CO == 4) {
														Bukkit.broadcastMessage("§a§lVaro §r§astartet in: §64 §r§aSekunden!");	
															
															
													}else
														if(Start_CO == 3) {
															Bukkit.broadcastMessage("§a§lVaro §r§astartet in: §63 §r§aSekunden!");	
																
																
														}else
															if(Start_CO == 2) {
																Bukkit.broadcastMessage("§a§lVaro §r§astartet in: §62 §r§aSekunden!");	
																	
																	
															}else
																if(Start_CO == 1) {
																	Bukkit.broadcastMessage("§a§lVaro §r§astartet in: §61 §r§aSekunden!");	
																		
																		
																}else
																	if(Start_CO == 0) {
																		WorldBorder wb = Bukkit.getWorld("world").getWorldBorder();
																		wb.setSize(2500, 10);
																		
																		for(Player OnP : Bukkit.getOnlinePlayers()) {
																			OnP.setGameMode(GameMode.SURVIVAL);
																			
																		}
																		
																		
																		Bukkit.broadcastMessage("§aLasst §r§6§lVaro §r§abeginnen!");
																		Bukkit.getScheduler().cancelTask(count);
						}
				
					}
		
				}, 0, 20);
		
		
			
			} else
				p.sendMessage("§cDazu hast du keine Rechte!");
			
	
		}
		return false;
	}
}