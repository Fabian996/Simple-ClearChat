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
	        if ((player.hasPermission("clearchat.cm")) ||  (player.hasPermission("clearchat.*"))) {
	        	Player target = Bukkit.getServer().getPlayer(args[0]);
                if (Muted) {
                    sender.sendMessage(MessageHandler.getMessage("chatmute-chat-enabled"));
                    target.sendMessage(MessageHandler.getMessage("chat-for-players-on"));
                    Bukkit.broadcastMessage(MessageHandler.getMessage("chatmute-chat-enabled").replace("%player%", target.getDisplayName()));
                    Muted = false;
                }
                else
                {
                    sender.sendMessage(MessageHandler.getMessage("chatmute-chat-disabled"));
                    target.sendMessage(MessageHandler.getMessage("chat-for-players-off"));
                    Bukkit.broadcastMessage(MessageHandler.getMessage("chatmute-chat-disabled").replace("%player%", target.getDisplayName()));
                    Muted = true;
                }
                return true;
	      }

	      }

	    }
		return false;	 
		}
	}
