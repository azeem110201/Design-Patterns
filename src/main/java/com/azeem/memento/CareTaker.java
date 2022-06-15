package com.azeem.memento;

import java.util.ArrayList;

public class CareTaker {
    private ArrayList<Memento> backup;
    private int currState = -1;



    public CareTaker() {
        backup = new ArrayList<>();
    }

    public void addMemento(Memento m) {
        this.backup.add(m);
        currState = this.backup.size() - 1;
    }

    private Memento getMemento(int index) {
        return backup.get(index);
    }

    public Memento getPreviousMemento() {
        if(currState>0) {
            return getMemento(--currState);
        }
        return getMemento(0);
    }

    public Memento getNextMemento() {
        if(currState < backup.size() - 1) {
            return getMemento(++currState);
        }
        currState = backup.size() - 1;
        return getMemento(currState);
    }

}
