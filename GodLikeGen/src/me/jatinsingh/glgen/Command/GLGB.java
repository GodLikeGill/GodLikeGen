package me.jatinsingh.glgen.Command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.jatinsingh.glgen.Main;

public class GLGB implements CommandExecutor {
	
	public String cmd1 = "glgb";
	
	private Main plugin;
	
	public GLGB(Main plugin) {
		this.plugin = plugin;
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		
		if(cmd.getName().equalsIgnoreCase(cmd1)) {
			if(sender instanceof Player) {
				Player player = (Player) sender;
				
				if(args.length == 0) {
					player.sendMessage(plugin.color(""
							+ "&m&4" + "---------------------------------"
							+ "&r&c" + "          GodLikeGen             "
							+ "&r&c" + " Gen Bucket plugin by Jatinsingh "
							+ "&m&4" + "---------------------------------"));
				}
				
				if(args.length == 1) {
					
				}
				
				if(args.length == 2) {
					
				}
			}
		}
		return true;
	}
}