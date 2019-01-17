package ch.david.deathAction;

import org.bukkit.GameMode;
import org.bukkit.Statistic;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.plugin.java.JavaPlugin;


public class DeathListener implements Listener {

    JavaPlugin m_plugin;

    public DeathListener(JavaPlugin plugin){
        m_plugin = plugin;
    }

    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent e){
        int maxDeathCount = m_plugin.getConfig().getInt("Max_Death_Count");

        Player deadPlayer =  e.getEntity();
        int deathCount = deadPlayer.getStatistic(Statistic.DEATHS);

        System.out.println("The player " + deadPlayer.getDisplayName() + " died " + deathCount + " times");

        if(deathCount > maxDeathCount){
            deadPlayer.sendMessage("Du bist mehr als " + maxDeathCount + " mal gestorben und wirst in den Spectatos-Modus gesetzt.");
            deadPlayer.setGameMode(GameMode.SPECTATOR);
        }
    }

}
