package com.deadhead.state_pattern.specifications;

public interface MusicPlayer {
    void play();

    void pause();

    void setCurrentState(State state);

    State getCurrentState();

    State getPausedState();

    State getPlayingState();

}
