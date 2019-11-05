package me.jatinsingh.glgen.Listeners;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBucketEmptyEvent;

import me.jatinsingh.glgen.Main;
import me.jatinsingh.glgen.GenBucket.Cobble;

public class CobbleGen implements Listener {
	
	private Main plugin;
	private Cobble cobble;
	
	public CobbleGen(Main plugin) {
		this.plugin = plugin;
		cobble = new Cobble(this.plugin);
	}
	
	@EventHandler
	public void onCobbleGen(PlayerBucketEmptyEvent e) {
		
		Material bucket = e.getBucket();
		if(bucket.equals(cobble.CobbleGen().getType())) {
			
			
		}
	}
}