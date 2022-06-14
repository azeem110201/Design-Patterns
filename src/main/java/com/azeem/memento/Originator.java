package com.azeem.memento;

public class Originator {
    private StringBuffer text;
    private CareTaker careTaker;

    public Originator() {
        text = new StringBuffer("");
        careTaker = new CareTaker();
    }

    private Memento save() {
        return new Memento(text);
    }

    private void restore(Memento m) {
        this.text = m.getText();
        displayText();
    }

    public void undo() {
        restore(careTaker.getPreviousMemento());
    }

    public void redo() {
        restore(careTaker.getNextMemento());
    }

    public void addText(String text) {
        this.text.append(text);
        careTaker.addMemento(save());
        displayText();
    }

    public void backspace(int count) {
        if(count >= text.length()) {
            text.delete(0,text.length());
        }
        this.text.delete(text.length()-count, text.length());
        careTaker.addMemento(save());
        displayText();
    }

    private void displayText() {
        System.out.println(text);
    }
}
