package tridentlight.tridentlight;

import de.tr7zw.nbtinjector.NBTInjector;
import org.bukkit.plugin.java.JavaPlugin;

public final class TridentLight extends JavaPlugin {
    @Override
    public void onLoad() {
        NBTInjector.inject();

    }
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new TridentListener(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
