package ca.noae.leashed.Listeners;

import ca.noae.leashed.Leashed;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

import java.util.logging.Level;

public class PlayerMoveListener implements Listener {
    private final Leashed plugin;

    public PlayerMoveListener(Leashed plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerMoveEvent(PlayerMoveEvent event) {
        plugin.getLogger().log(Level.SEVERE, "playermoveevent cancelled");
        event.setCancelled(true);
    }
}
