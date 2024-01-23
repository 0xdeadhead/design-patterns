package com.deadhead.state_pattern.implementation;

import com.deadhead.state_pattern.specifications.MusicPlayer;
import com.deadhead.state_pattern.specifications.State;

public class PausedState implements State {

    @Override
    public void play(MusicPlayer player) {
        System.out.println("Starting Music....");
        player.setCurrentState(player.getPlayingState());
    }

    @Override
    public void pause(MusicPlayer player) {
        System.out.println("Already Paused");
    }

}
