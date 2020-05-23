package com.codepentry.redpixl.permweather

import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

class Lobby2Com : CommandExecutor {
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        if (sender !is Player) {
            sender.sendMessage("&cYou must be a player to execute this command!")
            return false
        }
        val world = sender.server.getWorld("NewMap")
        if (world == null) {
            return false
        }
        sender.teleport(world.spawnLocation)

        return true
    }
}