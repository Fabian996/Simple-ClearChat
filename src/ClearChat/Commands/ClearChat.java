package de.Fabian.SClearChat.Commands;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.Fabian.SClearChat.Main;
import de.Fabian.SClearChat.MessagesConfig.MessageHandler;

public class ClearChat implements CommandExecutor
{
	  public final Logger logger = Logger.getLogger("Minecraft");
	  
	  
	  @SuppressWarnings("unused")
	  private Main plugin;

	  public void ChatSystemCommands(Main plugin)
	  {
	    this.plugin = plugin;
	  }

	  public boolean onCommand(CommandSender sender, Command cmd, String commandLable, String[] args) {
	    if ((sender instanceof Player)) {
	      Player player = (Player)sender;

	      if (commandLable.equalsIgnoreCase("cc"))
	        if ((player.hasPermission("clearchat.cc")) ||  (player.hasPermission("clearchat.*"))) {
	            for (Player p : Bukkit.getOnlinePlayers())
	            {
	              for (int x = 0; x < 120; x++) {
	                player.sendMessage(" ");
	              }
	              Bukkit.broadcastMessage(MessageHandler.getMessage("clear-chat").replace("%player%", player.getName()));
	        	}
	        }

	  }
		return false;
	}
}
