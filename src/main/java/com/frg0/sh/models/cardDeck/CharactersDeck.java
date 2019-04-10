package com.frg0.sh.models.cardDeck;

import java.util.List;

public class CharactersDeck {
    // Variables declaration
    List<Character> charactersDeck;

    // TODO JSON Generic method

    // Constructors
    public CharactersDeck(List<Character> charactersDeck) {
        this.charactersDeck = charactersDeck;
    }

    public CharactersDeck() {
        // empty constructor on purpose
    }

    // toString
    @Override
    public String toString() {
        return "CharactersDeck{" +
                "charactersDeck=" + charactersDeck +
                '}';
    }

    // Override methods
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    // Getter and Setter
    public List<Character> getCharactersDeck() {
        return charactersDeck;
    }

    public void setCharactersDeck(List<Character> charactersDeck) {
        this.charactersDeck = charactersDeck;
    }
}
