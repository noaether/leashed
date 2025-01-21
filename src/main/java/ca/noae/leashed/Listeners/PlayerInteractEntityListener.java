package ca.noae.leashed.Listeners;

import ca.noae.leashed.Leashed;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;

import java.util.logging.Level;

public class PlayerInteractEntityListener implements Listener {
    private final Leashed plugin;

    public PlayerInteractEntityListener(Leashed plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerInteractEntityEvent(PlayerInteractEntityEvent event) {
        plugin.getLogger().log(Level.SEVERE, "playerinteractentityevent cancelled");
        event.setCancelled(true);
    }
}
