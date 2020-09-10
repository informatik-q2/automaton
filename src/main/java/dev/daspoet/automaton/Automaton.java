package dev.daspoet.automaton;

import lombok.Getter;

import java.util.Iterator;

@Getter
public class Automaton {

    private final State initialState; // initial State of the Automaton

    /*
    Automaton constructs a new Automaton wrapping its initial State.
     */
    public Automaton(State initialState) {
        this.initialState = initialState;
    }

    /*
    canAccept returns whether the given word is accepted by the Automaton.
     */
    public boolean canAccept(String word) {
        Iterator<Integer> iter = this.charIter(word);
        return this.initialState.traverse(iter);
    }

    /*
    charIter constructs an Iterator from a given string and returns it.
     */
    private Iterator<Integer> charIter(String word) {
        return word.chars().iterator();
    }
}
