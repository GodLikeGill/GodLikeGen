package me.jatinsingh.glgen;

import java.util.List;
import java.util.stream.Collectors;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	public void onEnable() {
		
		if(getConfig().getName() != "config.yml") {
			getConfig().options().copyDefaults(true);
			saveDefaultConfig();
		}
	}
	
	public String color(String s) {
		return ChatColor.translateAlternateColorCodes('&', s);
	}
	
	public List<String> color(List<String> lore){
	    return lore.stream().map(this::color).collect(Collectors.toList());
	}
}