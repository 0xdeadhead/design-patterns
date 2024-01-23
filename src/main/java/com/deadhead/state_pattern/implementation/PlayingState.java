package com.deadhead.state_pattern.implementation;

import com.deadhead.state_pattern.specifications.MusicPlayer;
import com.deadhead.state_pattern.specifications.State;

public class PlayingState implements State {

    @Override
    public void play(MusicPlayer player) {
        System.out.println("Already Playing");
    }

    @Override
    public void pause(MusicPlayer player) {
        System.out.println("Pausing Music.....");
        player.setCurrentState(player.getPausedState());
    }

}
