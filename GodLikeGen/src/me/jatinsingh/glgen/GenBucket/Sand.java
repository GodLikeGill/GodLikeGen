package me.jatinsingh.glgen.GenBucket;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import me.jatinsingh.glgen.Main;

public class Sand {
	
private Main plugin;
	
	public Sand(Main plugin) {
		this.plugin = plugin;
	}
	
	public void CobbleGen() {
		
		ItemStack sandgb = new ItemStack(Material.LAVA_BUCKET, 1);
		ItemMeta sandgbmeta = sandgb.getItemMeta();
		sandgbmeta.setDisplayName(plugin.color(plugin.getConfig().getString("GenBuckets.Sand.Display_Name")));
		sandgbmeta.setLore(plugin.color(plugin.getConfig().getStringList("GenBuckets.Sand.Display_Name")));
		sandgb.setItemMeta(sandgbmeta);
		
		if(plugin.getConfig().getBoolean(("GenBuckets.Sand.Enchant_Effect"))) {
			sandgbmeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			sandgb.setItemMeta(sandgbmeta);
			sandgb.addUnsafeEnchantment(Enchantment.DURABILITY, 1);
		}
	}
}