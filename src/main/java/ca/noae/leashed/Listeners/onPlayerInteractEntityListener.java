package ca.noae.leashed.Listeners;

import ca.noae.leashed.Leashed;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;

public class onPlayerInteractEntityListener implements Listener {
    private final Leashed plugin;

    public onPlayerInteractEntityListener(Leashed plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerInteractEntityEvent(PlayerInteractEntityEvent event) {

    }
}
