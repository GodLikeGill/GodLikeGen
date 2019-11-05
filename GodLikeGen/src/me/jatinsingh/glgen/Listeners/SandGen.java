package me.jatinsingh.glgen.Listeners;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerBucketEmptyEvent;

import me.jatinsingh.glgen.Main;
import me.jatinsingh.glgen.GenBucket.Sand;

public class SandGen {
	
	private Main plugin;
	private Sand sand;
	
	public SandGen(Main plugin) {
		this.plugin = plugin;
		sand = new Sand(this.plugin);
	}
	
	@EventHandler
	public void onSandGen(PlayerBucketEmptyEvent e) {
		
		Material bucket = e.getBucket();
		if(bucket.equals(sand.SandGen().getType())) {
			
			
		}
	}
}