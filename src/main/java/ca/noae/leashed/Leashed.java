package ca.noae.leashed;

import ca.noae.leashed.Listeners.PlayerDeathListener;
import ca.noae.leashed.Listeners.PlayerInteractEntityListener;
import ca.noae.leashed.Listeners.PlayerMoveListener;
import ca.noae.leashed.Listeners.PlayerQuitListener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public final class Leashed extends JavaPlugin {

    @Override
    public void onEnable() {
        PlayerDeathListener pDeath = new PlayerDeathListener(this);
        PlayerInteractEntityListener pInteractEntity = new PlayerInteractEntityListener(this);
        PlayerMoveListener pMove = new PlayerMoveListener(this);
        PlayerQuitListener pQuit = new PlayerQuitListener(this);

        PluginManager pluginManager = getServer().getPluginManager();
            pluginManager.registerEvents(pDeath, this);
            pluginManager.registerEvents(pInteractEntity, this);
            pluginManager.registerEvents(pMove, this);
            pluginManager.registerEvents(pQuit, this);
            
        this.getLogger().log(Level.INFO, "Leashed enabled");
    }

    @Override
    public void onDisable() {
        this.getLogger().log(Level.INFO, "Leashed disabled");
        this.getLogger().log(Level.INFO, "noae (c) 2024-2025");
    }
}
