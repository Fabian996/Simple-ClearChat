package de.Fabian.SClearChat;


import java.io.IOException;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;
import de.Fabian.SClearChat.Commands.ChatMute;
import de.Fabian.SClearChat.Commands.ChatReload;
import de.Fabian.SClearChat.Commands.ClearChat;
import de.Fabian.SClearChat.Commands.ClearHelp;
import de.Fabian.SClearChat.Commands.ClearPrivateChat;
import de.Fabian.SClearChat.Listener.ChatMuteListener;
import de.Fabian.SClearChat.MessagesConfig.ConfigLoader;
import de.Fabian.SClearChat.MessagesConfig.MessageHandler;

public class Main extends JavaPlugin 
{
	public static Main instance;
	public static String version = "ClearChat - Version ";
	public static FileConfiguration messages;
	public static String prefix;
	public static String GC_gecleart;
	
	public void onEnable()
	{
	    System.out.println("[ClearChat] =================================");
	    System.out.println("[ClearChat] Author: Fabian996");
	    System.out.println("[ClearChat] Version: v" + getDescription().getVersion());
	    System.out.println("[ClearChat] Status: Aktiviert");
	    System.out.println("[ClearChat] =================================");
	    
	    new ConfigLoader().load();
	    MessageHandler.reload();
	    
	    instance = this;
	    version += getDescription().getVersion();
	    
	    getCommand("cc").setExecutor(new ClearChat());
	    
	    getCommand("chelp").setExecutor(new ClearHelp());
	    
	    getCommand("cm").setExecutor(new ChatMute());
	    
	    getCommand("lcc").setExecutor(new ClearPrivateChat());
	    
	    getCommand("crl").setExecutor(new ChatReload());
	    
	    getServer().getPluginManager().registerEvents(new ChatMuteListener(), this);
	    

	}
	public void onDisable()
	{
	    System.out.println("[ClearChat] =================================");
	    System.out.println("[ClearChat] Author: Fabian996");
	    System.out.println("[ClearChat] Version: v" + getDescription().getVersion());
	    System.out.println("[ClearChat] Status: Deaktiviert");
	    System.out.println("[ClearChat] =================================");
	}
	
	public static void saveMessages()
	{
	    try {
	        System.out.println("[ClearChat] Loading Messages.");
	        messages.save("plugins/ClearChat/messages.yml");
	      } catch (IOException e) {
	        e.printStackTrace();
	      }
	}
}
