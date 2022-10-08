package tridentlight.tridentlight;
import de.tr7zw.nbtapi.NBTItem;
import org.bukkit.craftbukkit.v1_18_R2.entity.CraftTrident;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityShootBowEvent;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.inventory.ItemStack;

public class TridentListener implements Listener {
    @EventHandler
    public void onPlayerAttacked(ProjectileHitEvent e) {
        if (e.getEntity().getType().equals(EntityType.TRIDENT) ){
            ItemStack nmsTrident = ((CraftTrident) e.getEntity()).getItem();
            NBTItem item = new NBTItem(nmsTrident);
            if (item.getKeys().contains("tridentlight")){
                e.getEntity().getWorld().strikeLightningEffect(e.getEntity().getLocation());
            }

        }

    }
}
