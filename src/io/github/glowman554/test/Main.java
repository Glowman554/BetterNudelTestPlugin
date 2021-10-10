package io.github.glowman554.test;

import io.github.glowman554.nudel.discord.Discord;
import io.github.glowman554.nudel.plugin.Plugin;
import io.github.glowman554.test.commands.TestCommand;

public class Main implements Plugin
{

	@Override
	public void on_load() throws Exception
	{
		System.out.println("Hello plugin world!");
		Discord.discord.commandManager.addCommand("test", new TestCommand());
	}

}
