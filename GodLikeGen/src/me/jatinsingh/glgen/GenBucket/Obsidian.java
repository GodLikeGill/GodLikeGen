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
	
	public ItemStack VerticalObsidianGen() {
		
		ItemStack verobsidiangb = new ItemStack(Material.LAVA_BUCKET, 1);
		ItemMeta verobsidiangbmeta = verobsidiangb.getItemMeta();
		verobsidiangbmeta.setDisplayName(plugin.color(plugin.getConfig().getString("GenBuckets.Obsidian.Vertical.Display_Name")));
		verobsidiangbmeta.setLore(plugin.color(plugin.getConfig().getStringList("GenBuckets.Obsidian.Vertical.Lore")));
		verobsidiangb.setItemMeta(verobsidiangbmeta);
		
		if(plugin.getConfig().getBoolean(("GenBuckets.Obsidian.Vertical.Enchant_Effect"))) {
			verobsidiangbmeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			verobsidiangb.setItemMeta(verobsidiangbmeta);
			verobsidiangb.addUnsafeEnchantment(Enchantment.DURABILITY, 1);
		}
		return verobsidiangb;
	}
	
	public ItemStack HorizontalObsidianGen() {
		
		ItemStack horobsidiangb = new ItemStack(Material.LAVA_BUCKET, 1);
		ItemMeta horobsidiangbmeta = horobsidiangb.getItemMeta();
		horobsidiangbmeta.setDisplayName(plugin.color(plugin.getConfig().getString("GenBuckets.Obsidian.Horizontal.Display_Name")));
		horobsidiangbmeta.setLore(plugin.color(plugin.getConfig().getStringList("GenBuckets.Obsidian.Horizontal.Lore")));
		horobsidiangb.setItemMeta(horobsidiangbmeta);
		
		if(plugin.getConfig().getBoolean(("GenBuckets.Obsidian.Horizontal.Enchant_Effect"))) {
			horobsidiangbmeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			horobsidiangb.setItemMeta(horobsidiangbmeta);
			horobsidiangb.addUnsafeEnchantment(Enchantment.DURABILITY, 1);
		}
		return horobsidiangb;
	}
}