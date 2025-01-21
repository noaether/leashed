package ca.noae.leashed.Listeners;

import ca.noae.leashed.Leashed;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

import java.util.logging.Level;

public class PlayerDeathListener implements Listener {
    private final Leashed plugin;

    public PlayerDeathListener(Leashed plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerDeathEvent(PlayerDeathEvent event) {
        plugin.getLogger().log(Level.SEVERE, "playerdeathevent cancelled");
       event.setCancelled(true);
    }
}
