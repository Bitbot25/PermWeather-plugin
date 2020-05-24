package com.codepentry.redpixl.permweather

import org.bukkit.ChatColor
import org.bukkit.GameRule
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

class PermWeatherHelpCom : CommandExecutor {
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        if (sender !is Player) {
            sender.sendMessage("${ChatColor.DARK_AQUA} [PWeather] ${ChatColor.RED}You must be a player to execute this command!")
            return false
        }
        if (args.size != 1) {
            return false
        }
        val currentWorld = sender.world

        if (args[0] == "help") {

            sender.sendMessage("${ChatColor.RESET}-------${ChatColor.DARK_AQUA}PermWeather${ChatColor.RESET}-------")
            sender.sendMessage("${ChatColor.DARK_AQUA}By \"Bitbot25\"")
            sender.sendMessage("${ChatColor.DARK_AQUA}Version: 1.4")
            sender.sendMessage("${ChatColor.DARK_AQUA}Commands:")
            sender.sendMessage("${ChatColor.DARK_AQUA}/permday ${ChatColor.GRAY}<enable:disable>")
            sender.sendMessage("${ChatColor.DARK_AQUA}/permnight ${ChatColor.GRAY}<enable:disable>")
            sender.sendMessage("${ChatColor.DARK_AQUA}/permweather enabled")
            sender.sendMessage("${ChatColor.DARK_AQUA}/permweather help")
            return true

        } else if (args[0] == "enabled") {
            val doDaylightCycle = currentWorld.getGameRuleValue(GameRule.DO_DAYLIGHT_CYCLE)!! // false
            val doWeatherCycle = currentWorld.getGameRuleValue(GameRule.DO_WEATHER_CYCLE)!!   // true
            val permWeatherEnabled = if (!doDaylightCycle || !doWeatherCycle)
                "enabled"
            else
                "disabled"
            sender.sendMessage("${ChatColor.DARK_AQUA}[PWeather] Permanent weather is ${permWeatherEnabled}")
            return true
        } else {
            return false
        }
    }
}