package fr.en0ri4n.plugin;

import fr.en0ri4n.plugin.utils.ColorAPI;
import fr.en0ri4n.plugin.utils.ItemFactory;
import fr.en0ri4n.plugin.utils.PersistentDataHelper;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.persistence.PersistentDataType;
import org.bukkit.plugin.java.JavaPlugin;

public final class SpigotPlugin extends JavaPlugin
{
    private static SpigotPlugin instance;

    @Override
    public void onEnable()
    {
        // Plugin startup logic
        instance = this;

        ItemStack itemStack = ItemFactory.create(Material.DIAMOND).name(ColorAPI.process("<GRADIENT:2C08BA>D I A M O N D S</GRADIENT:028A97>")).amount(5).unbreakable().enchant(Enchantment.ARROW_DAMAGE, 10).build();
        PersistentDataHelper.ITEMSTACK.addData(itemStack, PersistentDataType.STRING, "test", "test");
        Bukkit.getOnlinePlayers().forEach(player -> player.getInventory().addItem(itemStack));
    }

    @Override
    public void onDisable()
    {
        // Plugin shutdown logic
    }

    public static SpigotPlugin get()
    {
        return instance;
    }
}
