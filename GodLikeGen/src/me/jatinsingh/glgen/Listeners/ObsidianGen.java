package me.jatinsingh.glgen.Listeners;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerBucketEmptyEvent;

import me.jatinsingh.glgen.Main;
import me.jatinsingh.glgen.GenBucket.Obsidian;

public class ObsidianGen {
	
	private Main plugin;
	private Obsidian obsidian;
	
	public ObsidianGen(Main plugin) {
		this.plugin = plugin;
		obsidian = new Obsidian(this.plugin);
	}
	
	@EventHandler
	public void onCobbleGen(PlayerBucketEmptyEvent e) {
		
		Material bucket = e.getBucket();
		if(bucket.equals(obsidian.ObsidianGen().getType())) {
			
			
		}
	}
}