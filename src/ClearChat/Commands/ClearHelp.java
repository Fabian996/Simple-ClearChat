package de.Fabian.SClearChat.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ClearHelp implements CommandExecutor 
{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandlable, String[] args) {
		{
		    if ((sender instanceof Player)) {
		      Player player = (Player)sender;

		      if ((commandlable.equalsIgnoreCase("chelp")))
		      player.sendMessage(ChatColor.WHITE + "[" + ChatColor.GOLD + "ClearChat" + ChatColor.WHITE + "]" + ChatColor.YELLOW + " ======================================");
		      player.sendMessage(ChatColor.WHITE + "[" + ChatColor.GOLD + "ClearChat" + ChatColor.WHITE + "]" + ChatColor.YELLOW + " /cc -" + ChatColor.WHITE + " Clear the Server Chat");
		      player.sendMessage(ChatColor.WHITE + "[" + ChatColor.GOLD + "ClearChat" + ChatColor.WHITE + "]" + ChatColor.YELLOW + " /lcc -" + ChatColor.WHITE + " Clear the lokal Chat");
		      player.sendMessage(ChatColor.WHITE + "[" + ChatColor.GOLD + "ClearChat" + ChatColor.WHITE + "]" + ChatColor.YELLOW + " /crl -" + ChatColor.WHITE + " Reloaded messages.yml");
		      player.sendMessage(ChatColor.WHITE + "[" + ChatColor.GOLD + "ClearChat" + ChatColor.WHITE + "]" + ChatColor.YELLOW + " /cm -" + ChatColor.WHITE + " Muted a Player");
		      player.sendMessage(ChatColor.WHITE + "[" + ChatColor.GOLD + "ClearChat" + ChatColor.WHITE + "]" + ChatColor.YELLOW + " ======================================");
		      
		      
		      return true;
		    }
		    return false;
		}
	}
}
