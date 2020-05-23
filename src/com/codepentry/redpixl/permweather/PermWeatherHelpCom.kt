package com.codepentry.redpixl.permweather

import org.bukkit.ChatColor
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender

class PermWeatherHelpCom : CommandExecutor {
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {

        if (args.size != 1) {
            return false
        }

        return if (args[0] == "help") {

            sender.sendMessage("${ChatColor.RESET}-------${ChatColor.DARK_AQUA}PermWeather${ChatColor.RESET}-------")
            sender.sendMessage("${ChatColor.DARK_AQUA}By \"Bitbot25\"")
            sender.sendMessage("${ChatColor.DARK_AQUA}Version: 1.1")
            sender.sendMessage("${ChatColor.DARK_AQUA}Commands:")
            sender.sendMessage("${ChatColor.DARK_AQUA}/tempday ${ChatColor.GRAY}start:stop")
            sender.sendMessage("${ChatColor.DARK_AQUA}/tempnight ${ChatColor.GRAY}start:stop")
            true
        } else {
            false
        }
    }
}