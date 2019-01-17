package ch.david.deathAction;

import org.bukkit.plugin.java.JavaPlugin;

public class DeathAction extends JavaPlugin {

    @Override
    public void onEnable(){
        getServer().getPluginManager().registerEvents(new DeathListener(), this);
        System.out.println("Activated DeathAction-plugin");
    }

    @Override
    public void onDisable(){
        System.out.println("Disabled DeathAction-plugin");
    }
}