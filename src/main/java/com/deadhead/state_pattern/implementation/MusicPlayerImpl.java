package com.deadhead.state_pattern.implementation;

import com.deadhead.state_pattern.specifications.MusicPlayer;
import com.deadhead.state_pattern.specifications.State;

public class MusicPlayerImpl implements MusicPlayer {

    private State playingState;
    private State pausedState;
    private State currentState;

    @Override
    public void play() {
        this.currentState.play(this);
    }

    @Override
    public void pause() {
        this.currentState.pause(this);
    }

    public State getPlayingState() {
        return playingState;
    }

    public void setPlayingState(State playingState) {
        this.playingState = playingState;
    }

    public State getPausedState() {
        return pausedState;
    }

    public void setPausedState(State pausedState) {
        this.pausedState = pausedState;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public MusicPlayerImpl(State playingState, State pausedState, State currentState) {
        this.playingState = playingState;
        this.pausedState = pausedState;
        this.currentState = currentState;
    }

}
