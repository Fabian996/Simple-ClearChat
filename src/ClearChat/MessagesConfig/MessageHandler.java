package de.Fabian.SClearChat.MessagesConfig;

import java.util.HashMap;
import de.Fabian.SClearChat.Main;
import org.bukkit.ChatColor;

public class MessageHandler {

	  private static HashMap<String, String> messages = new HashMap<String, String>();

	  public static void reload() {
	    messages.clear();
	    for (String key : Main.messages.getConfigurationSection("").getKeys(false)) {
	      messages.put(key, replaceColors(Main.messages.getString(key)));
	    }
	    System.out.println("[ClearChat] " + messages.size() + " messages loaded!");
	  }

	  public static String getMessage(String name) {
	    if (messages.containsKey(name)) {
	      if (name.equalsIgnoreCase("prefix")) {
	        return (String)messages.get(name);
	      }
	      return (String)messages.get("prefix") + (String)messages.get(name);
	    }

	    return "§c Messages not loaded!";
	  }

	  public static String getMessageWithNoPrefix(String name) {
	    if (messages.containsKey(name)) {
	      return (String)messages.get(name);
	    }
	    return "§c Messages not loaded!";
	  }

	  public static String replaceColors(String s)
	  {
	    return ChatColor.translateAlternateColorCodes('&', s);
	  }
}
