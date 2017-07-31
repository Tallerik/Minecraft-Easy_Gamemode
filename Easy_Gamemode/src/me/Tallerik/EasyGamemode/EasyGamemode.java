package me.Tallerik.EasyGamemode;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class EasyGamemode extends JavaPlugin
{
	String prefix = "§8[§eEasy§aGamemode§8]";
	private ConsoleCommandSender console = getServer().getConsoleSender();
	public void onEnable()
	{
		
		console.sendMessage("§aEasyGamemode geladen");
	}

	
	public boolean onCommand(CommandSender  sender, Command cmd, String label, String[] args)
	{
		if(cmd.getName().equalsIgnoreCase("s"))
		{
			if(sender.hasPermission("EasyGM.s") && sender.hasPermission("EasyGM.cmd"))
			{
				Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "gamemode 0 " + sender.getName());
				sender.sendMessage(prefix + "§bDu bist nun im Überlebensmodus!");
			}
			else
			{
				sender.sendMessage(prefix + "§cDu hasst dazu keine Rechte");
			}
		}
		if(cmd.getName().equalsIgnoreCase("c"))
		{
			if(sender.hasPermission("EasyGM.c") && sender.hasPermission("EasyGM.cmd"))
			{
				Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "gamemode 1 " + sender.getName());
				sender.sendMessage(prefix + "§bDu bist nun im Kreativmodus!");
			}
			else
			{
				sender.sendMessage(prefix + "§cDu hasst dazu keine Rechte");
			}
		}
		return true;
	}
}




