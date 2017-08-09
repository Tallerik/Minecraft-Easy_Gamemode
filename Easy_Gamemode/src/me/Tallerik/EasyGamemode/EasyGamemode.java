package me.Tallerik.EasyGamemode;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
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
		Player player = (Player) sender;
		if(cmd.getName().equalsIgnoreCase("easygamemode"))
		{			
			if(args.length == 0)
			{
				player.sendMessage(prefix + " §fEasyGamemode version: §6" + getDescription().getVersion() + ".");
				player.sendMessage(prefix + " §fBenutze §6 /easygamemode help §fum die Befehle einzusehen. ");
			}
			else
			{
				player.sendMessage(prefix + " §2/c§b  Kreativemodus");
				player.sendMessage(prefix + " §2/s§b  Überlebensmodus");
				player.sendMessage(prefix + " §2/h§b  Hardcoremodus");
				player.sendMessage(prefix + " §2/sp§b Spectatormodus");
			}
		}
		if(cmd.getName().equalsIgnoreCase("s"))
		{
			if(sender.hasPermission("EasyGM.s") || sender.hasPermission("EasyGM.cmd"))
			{
				player.setGameMode(GameMode.SURVIVAL);
				sender.sendMessage(prefix + "§bDu bist nun im Überlebensmodus!");
			}
			else
			{
				sender.sendMessage(prefix + "§cDu hasst dazu keine Rechte");
			}
		}
		if(cmd.getName().equalsIgnoreCase("c"))
		{
			if(sender.hasPermission("EasyGM.c") || sender.hasPermission("EasyGM.cmd"))
			{
				player.setGameMode(GameMode.CREATIVE);
				sender.sendMessage(prefix + "§bDu bist nun im Kreativmodus!");
			}
			else
			{
				sender.sendMessage(prefix + "§cDu hasst dazu keine Rechte");
			}
		}
		if(cmd.getName().equalsIgnoreCase("h"))
		{
			if(sender.hasPermission("EasyGM.s") || sender.hasPermission("EasyGM.cmd"))
			{
				player.setGameMode(GameMode.ADVENTURE);
				sender.sendMessage(prefix + "§bDu bist nun im HardCoremodus!");
			}
			else
			{
				sender.sendMessage(prefix + "§cDu hasst dazu keine Rechte");
			}
		}
		if(cmd.getName().equalsIgnoreCase("sp"))
		{
			if(sender.hasPermission("EasyGM.s") || sender.hasPermission("EasyGM.cmd"))
			{
				player.setGameMode(GameMode.SPECTATOR);
				sender.sendMessage(prefix + "§bDu bist nun im Spectatormodus!");
			}
			else
			{
				sender.sendMessage(prefix + "§cDu hasst dazu keine Rechte");
			}
		}
		return true;
	}
}




