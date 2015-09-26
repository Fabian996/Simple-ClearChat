package de.Fabian.SClearChat.MessagesConfig;

public class ConfigReloader 
{
	  public static void reloadMessage()
	  {
	    ConfigLoader.reloadMessages();
	    MessageHandler.reload();
	  }
}
