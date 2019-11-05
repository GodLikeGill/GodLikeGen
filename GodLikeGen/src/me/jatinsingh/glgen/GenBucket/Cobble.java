package me.jatinsingh.glgen.GenBucket;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import me.jatinsingh.glgen.Main;

public class Cobble {
	
	private Main plugin;
	
	public Cobble(Main plugin) {
		this.plugin = plugin;
	}
	
	public ItemStack CobbleGen() {
		
		ItemStack cobblegb = new ItemStack(Material.LAVA_BUCKET, 1);
		ItemMeta cobblegbmeta = cobblegb.getItemMeta();
		cobblegbmeta.setDisplayName(plugin.color(plugin.getConfig().getString("GenBuckets.CobbleStone.Display_Name")));
		cobblegbmeta.setLore(plugin.color(plugin.getConfig().getStringList("GenBuckets.CobbleStone.Display_Name")));
		cobblegb.setItemMeta(cobblegbmeta);
		
		if(plugin.getConfig().getBoolean(("GenBuckets.CobbleStone.Enchant_Effect"))) {
			cobblegbmeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			cobblegb.setItemMeta(cobblegbmeta);
			cobblegb.addUnsafeEnchantment(Enchantment.DURABILITY, 1);
		}
		
		return cobblegb;
	}
}