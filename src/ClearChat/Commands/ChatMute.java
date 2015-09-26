package de.Fabian.SClearChat.Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import de.Fabian.SClearChat.MessagesConfig.MessageHandler;

public class ChatMute implements CommandExecutor {

	public static boolean Muted;

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandlable, String[] args)
	  {
	    if ((sender instanceof Player)) {
	      Player player = (Player)sender;

	      if (commandlable.equalsIgnoreCase("cm")) {
	        if ((player.hasPermission("clearchat.cm"))) {
	          if (Muted) {
	            player.sendMessage(MessageHandler.getMessage("chat-for-players-on"));
	            Bukkit.broadcastMessage(MessageHandler.getMessage("chatmute-chat-enabled").replace("%player%", player.getDisplayName()));
	            Muted = false;
	          }
	          else
	          {
	            player.sendMessage(MessageHandler.getMessage("chat-for-players-off"));
	            Bukkit.broadcastMessage(MessageHandler.getMessage("chatmute-chat-disabled").replace("%player%", player.getDisplayName()));
	            Muted = true;
	          }
	          return true;
	        }
	       
	    } 
	    else {
	      sender.sendMessage(MessageHandler.getMessage("console-use-command"));
	    }

	  }
		return false;
	}
}
