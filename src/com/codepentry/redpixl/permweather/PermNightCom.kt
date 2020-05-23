package com.codepentry.redpixl.permweather

import org.bukkit.ChatColor
import org.bukkit.GameRule
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

class PermNightCom : CommandExecutor {
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        if (sender !is Player) {
            sender.sendMessage("${ChatColor.DARK_AQUA} [PWeather] ${ChatColor.RED}You must be a player to execute this command!")
            return false
        }
        if (args.size != 1)

            return false

        val startStop = args[0]

        if (startStop != "stop" && startStop != "start")

            return false

        if (startStop == "start") {


            val currentworld = sender.world

            currentworld.setGameRule(GameRule.DO_DAYLIGHT_CYCLE, false)

            currentworld.time = 18000

            sender.sendMessage("${ChatColor.DARK_AQUA}[PWeather] Set a permanent Night!")

            return true
        }
        if (startStop == "stop") {
            val currentworld = sender.world

            currentworld.setGameRule(GameRule.DO_DAYLIGHT_CYCLE, true)

            sender.sendMessage("${ChatColor.DARK_AQUA}[PWeather] Disabled a permanent Night!")

            return true
        }
        return false
    }
}


