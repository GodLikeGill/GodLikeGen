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
	
	public ItemStack VerticalCobbleGen() {
		
		ItemStack vercobblegb = new ItemStack(Material.LAVA_BUCKET, 1);
		ItemMeta vercobblegbmeta = vercobblegb.getItemMeta();
		vercobblegbmeta.setDisplayName(plugin.color(plugin.getConfig().getString("GenBuckets.CobbleStone.Vertical.Display_Name")));
		vercobblegbmeta.setLore(plugin.color(plugin.getConfig().getStringList("GenBuckets.CobbleStone.Vertical.Display_Name")));
		vercobblegb.setItemMeta(vercobblegbmeta);
		
		if(plugin.getConfig().getBoolean(("GenBuckets.CobbleStone.Vertical.Enchant_Effect"))) {
			vercobblegbmeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			vercobblegb.setItemMeta(vercobblegbmeta);
			vercobblegb.addUnsafeEnchantment(Enchantment.DURABILITY, 1);
		}
		return vercobblegb;
	}
	
	public ItemStack HorizontalCobbleGen() {
		
		ItemStack horcobblegb = new ItemStack(Material.LAVA_BUCKET, 1);
		ItemMeta horcobblegbmeta = horcobblegb.getItemMeta();
		horcobblegbmeta.setDisplayName(plugin.color(plugin.getConfig().getString("GenBuckets.CobbleStone.Horizontal.Display_Name")));
		horcobblegbmeta.setLore(plugin.color(plugin.getConfig().getStringList("GenBuckets.CobbleStone.Horizontal.Display_Name")));
		horcobblegb.setItemMeta(horcobblegbmeta);
		
		if(plugin.getConfig().getBoolean(("GenBuckets.CobbleStone.Horizontal.Enchant_Effect"))) {
			horcobblegbmeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			horcobblegb.setItemMeta(horcobblegbmeta);
			horcobblegb.addUnsafeEnchantment(Enchantment.DURABILITY, 1);
		}
		return horcobblegb;
	}
	
}