package com.codepentry.redpixl.permweather

import org.bukkit.ChatColor
import org.bukkit.GameRule
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

class PermRainCom : CommandExecutor {
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        if (sender !is Player) {
            sender.sendMessage("${ChatColor.DARK_AQUA} [PWeather] ${ChatColor.RED}You must be a player to execute this command!")
            return false
        }
        if (args.size != 1)

            return false

        val startStop = args[0]

        if (startStop != "disable" && startStop != "enable")

            return false

        if (startStop == "enable") {


            val currentworld = sender.world

            currentworld.setStorm(true)

            currentworld.setGameRule(GameRule.DO_WEATHER_CYCLE, false)

            sender.sendMessage("${ChatColor.DARK_AQUA}[PWeather] Enabled permanent rain!")

            return true
        }
        if (startStop == "disable") {
            val currentworld = sender.world

            currentworld.setGameRule(GameRule.DO_WEATHER_CYCLE, true)

            sender.sendMessage("${ChatColor.DARK_AQUA}[PWeather] Disabled permanent rain!")

            return true
        }
        return false
    }
}

