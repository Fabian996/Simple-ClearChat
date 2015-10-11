package de.Fabian.SClearChat.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import de.Fabian.SClearChat.MessagesConfig.ConfigReloader;
import de.Fabian.SClearChat.MessagesConfig.MessageHandler;

public class ChatReload implements CommandExecutor 
{
	  public boolean onCommand(CommandSender sender, Command cmd, String commandLable, String[] args)
	  {
	    if ((sender instanceof Player)) {
	      Player player = (Player)sender;

	      if (commandLable.equalsIgnoreCase("crl"))
	        if ((player.hasPermission("clearchat.rl")) ||  (player.hasPermission("clearchat.*"))) {
	          ConfigReloader.reloadMessage();
	          player.sendMessage(MessageHandler.getMessage("re-loaded"));
	        } 
	      }
	    else {
	      sender.sendMessage(MessageHandler.getMessage("console-use-command"));
	    }
	    return false;
	  }
}
