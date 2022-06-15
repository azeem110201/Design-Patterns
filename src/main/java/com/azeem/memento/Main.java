package com.azeem.memento;

public class Main {
    public static void main(String[] args) {
        Originator textEditor = new Originator();

        textEditor.addText("Hello ");
        textEditor.addText("World ");
        textEditor.addText("This is ");
        textEditor.addText("Azeem");

        textEditor.backspace(7);
        textEditor.undo();
        textEditor.undo();
        textEditor.undo();
        textEditor.redo();
        textEditor.addText("Abdul");
    }
}
