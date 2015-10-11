package de.Fabian.SClearChat.Commands;

import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.Fabian.SClearChat.MessagesConfig.MessageHandler;

public class ClearPrivateChat implements CommandExecutor 
	{
	public final Logger logger = Logger.getLogger("Minecraft");

	public boolean onCommand(CommandSender sender, Command cmd, String commandLable, String[] args) {
		if ((sender instanceof Player)) {
		 Player player = (Player)sender;

		 if (commandLable.equalsIgnoreCase("lcc"))
		 if ((player.hasPermission("clearchat.lcc")) ||  (player.hasPermission("clearchat.*")))
		 {
		    for(int i = 0; i <= 100; i++) 
		    { player.sendMessage("");}
		      player.sendMessage(ChatColor.WHITE + "[" + ChatColor.GOLD + "ClearChat" + ChatColor.WHITE + "] " + ChatColor.DARK_GREEN +  "Du hast deinen eignen Chat gelöscht");
		 }		       
		 else 
		 {sender.sendMessage(MessageHandler.getMessage("console-use-command"));}
		}
		return false;	
     }	    
}
