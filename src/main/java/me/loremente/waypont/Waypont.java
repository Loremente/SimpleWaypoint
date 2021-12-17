package me.loremente.waypont;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Arrow;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Waypont extends JavaPlugin  implements Listener {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(this,this);
    }

    @EventHandler
    public void onInteract(PlayerInteractEvent e) {

        if (e.getAction().equals(Action.RIGHT_CLICK_AIR) || e.getAction().equals(Action.RIGHT_CLICK_BLOCK)){
            if (e.getPlayer().getItemInHand() != null && e.getPlayer().getItemInHand().getType().equals(Material.DIAMOND_HOE)) {
                Arrow arrow = e.getPlayer().launchProjectile(Arrow.class, e.getPlayer().getLocation().getDirection());
            }
        }

    }
}

