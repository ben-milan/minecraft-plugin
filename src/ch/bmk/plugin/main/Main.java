package ch.bmk.plugin.main;




import org.bukkit.Bukkit;
import org.bukkit.WorldBorder;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import ch.bmk.plugin.commands.ChatClear;
import ch.bmk.plugin.commands.GameModeCommand;
import ch.bmk.plugin.commands.WorldBorderCommand;





public class Main extends JavaPlugin implements Listener{


	
	private static Main m;

	@Override
	public void onEnable() {
		
		
		
		
		m = this;
		
		WorldBorder wb = Bukkit.getWorld("world").getWorldBorder();
		wb.setCenter(0, 0);
		wb.setSize(50);
		wb.setDamageAmount(0.1);
		
		Bukkit.getConsoleSender().sendMessage("§aDas Plugin für Varo wurde erfolgreich geladen!");
		
		getCommand("cc").setExecutor(new ChatClear());
		getCommand("gm").setExecutor(new GameModeCommand());
		getCommand("start").setExecutor(new WorldBorderCommand());
	}
	
	@Override
	public void onDisable() {
		Bukkit.getConsoleSender().sendMessage("§cDas Plugin wurde erfolgreich deaktiviert!");
		
	}
	
	public static Main getinstance() {
		return m;
		
	}
	
}
	
	