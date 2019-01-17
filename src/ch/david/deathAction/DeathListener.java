package ch.david.deathAction;

import org.bukkit.GameMode;
import org.bukkit.Statistic;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.PlayerDeathEvent;


public class DeathListener implements Listener {

    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent e){
        Player deadPlayer =  e.getEntity();
        int deathCount = deadPlayer.getStatistic(Statistic.DEATHS);

        if(deathCount > 3){
            deadPlayer.setGameMode(GameMode.SPECTATOR);
        }
    }

}
