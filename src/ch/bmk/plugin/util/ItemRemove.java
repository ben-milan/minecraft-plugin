package ch.bmk.plugin.util;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;

public class ItemRemove implements Listener{

	@EventHandler
	public void onJoin(PlayerJoinEvent e, Player p) {
		
		
		
		
		if(p.getWorld().getName().equalsIgnoreCase("world_nether")) {
				
			
					for(ItemStack itemstack : p.getInventory().getContents()) {
					
					if(itemstack != null && itemstack.getType() == Material.COMPASS) {
						p.getInventory().remove(itemstack);
						p.updateInventory();
						p.sendMessage("Nether?");
						break;
					}
					
				}
				
		}
	}
	
}
