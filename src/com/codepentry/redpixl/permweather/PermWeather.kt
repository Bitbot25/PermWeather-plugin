package com.codepentry.redpixl.permweather

import org.bukkit.plugin.java.JavaPlugin

class PermWeather : JavaPlugin() {
    override fun onEnable() {
        val lobby2com = getCommand("lobby2")
        if (lobby2com == null)
            return
        lobby2com.setExecutor(Lobby2Com())

        val permDayCom = getCommand("permday")
        if (permDayCom == null)
            return
        permDayCom.setExecutor(PermDayCom())

        val permWeatherHelpCom = getCommand("permweather")
        if (permWeatherHelpCom == null)
            return
        permWeatherHelpCom.setExecutor(PermWeatherHelpCom())

        val permNightCom = getCommand("permnight")
        if (permNightCom == null)
            return
        permNightCom.setExecutor(PermNightCom())

        val permRainCom = getCommand("permrain")
        if (permRainCom == null)
            return
        permRainCom.setExecutor(PermRainCom())


    }
}


