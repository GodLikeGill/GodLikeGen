package me.jatinsingh.glgen.GenBucket;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import me.jatinsingh.glgen.Main;

public class Obsidian {
	
private Main plugin;
	
	public Obsidian(Main plugin) {
		this.plugin = plugin;
	}
	
	public void CobbleGen() {
		
		ItemStack obsidiangb = new ItemStack(Material.LAVA_BUCKET, 1);
		ItemMeta obsidiangbmeta = obsidiangb.getItemMeta();
		obsidiangbmeta.setDisplayName(plugin.color(plugin.getConfig().getString("GenBuckets.Obsidian.Display_Name")));
		obsidiangbmeta.setLore(plugin.color(plugin.getConfig().getStringList("GenBuckets.Obsidian.Display_Name")));
		obsidiangb.setItemMeta(obsidiangbmeta);
		
		if(plugin.getConfig().getBoolean(("GenBuckets.Obsidian.Enchant_Effect"))) {
			obsidiangbmeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			obsidiangb.setItemMeta(obsidiangbmeta);
			obsidiangb.addUnsafeEnchantment(Enchantment.DURABILITY, 1);
		}
	}
}