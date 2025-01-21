package ca.noae.leashed.Listeners;

import ca.noae.leashed.Leashed;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

import java.util.logging.Level;

public class PlayerQuitListener implements Listener {
    private final Leashed plugin;

    public PlayerQuitListener(Leashed plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerQuitEvent(PlayerQuitEvent event) {
        plugin.getLogger().log(Level.SEVERE, "playerquitevent cancelled");
        plugin.getLogger().log(Level.SEVERE, event.getReason().toString());
    }
}
