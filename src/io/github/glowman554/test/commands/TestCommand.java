package io.github.glowman554.test.commands;

import io.github.glowman554.nudel.discord.Discord;
import io.github.glowman554.nudel.discord.commands.Command;
import io.github.glowman554.nudel.discord.commands.CommandEvent;

public class TestCommand implements Command
{

	@Override
	public void execute(CommandEvent event) throws Exception
	{
		if (event.args.length != 0)
		{
			event.commandFail("Too many arguments!");
		}
		else
		{
			event.commandSuccess("Test success!");
		}	
	}

	@Override
	public String get_long_help()
	{
		return "Test the plugin loader!";
	}

	@Override
	public String get_permission()
	{
		return null;
	}

	@Override
	public String get_short_help()
	{
		return String.format("Use '%stest' to test the command loaded via a plugin!", Discord.discord.commandManager.prefix);
	}

	@Override
	public void on_register()
	{
	}

}
