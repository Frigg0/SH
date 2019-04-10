package com.frg0.sh.models.charactersCards;

import com.frg0.sh.models.specialCapacities.SpecialCapacity;
import com.frg0.sh.models.victoryConditions.VictoryCondition;

public class CharacterCard {
    // Variables declaration
    private int idEnum;
    private String characterName;
    private CharacterTypeEnum characterTypeEnum;
    private int characterLife;
    private VictoryCondition victoryCondition;
    private String victoryConditionDescription;
    private SpecialCapacity specialCapacity;
    private String specialCapacityDescription;
    private CharacterNameEnum characterNameEnum;


    // Constructors
    public CharacterCard(int id, String characterName, CharacterTypeEnum characterTypeEnum, int characterLife, VictoryCondition victoryCondition, String victoryConditionDescription, SpecialCapacity specialCapacity, String specialCapacityDescription) {
        this.idEnum = id;
        this.characterName = characterName;
        this.characterTypeEnum = characterTypeEnum;
        this.characterLife = characterLife;
        this.victoryCondition = victoryCondition;
        this.victoryConditionDescription = victoryConditionDescription;
        this.specialCapacity = specialCapacity;
        this.specialCapacityDescription = specialCapacityDescription;
    }

    public CharacterCard() {
        // empty constructor on purpose
    }

    // toString
    @Override
    public String toString() {
        return "CharacterCard{" +
                "idEnum=" + idEnum +
                ", characterName='" + characterName + '\'' +
                ", characterTypeEnum=" + characterTypeEnum +
                ", characterLife=" + characterLife +
                ", victoryCondition=" + victoryCondition +
                ", victoryConditionDescription='" + victoryConditionDescription + '\'' +
                ", specialCapacity=" + specialCapacity +
                ", specialCapacityDescription='" + specialCapacityDescription + '\'' +
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
    public int getIdEnum() {
        return idEnum;
    }

    public String getCharacterName() {
        return characterName;
    }

    public CharacterTypeEnum getCharacterTypeEnum() {
        return characterTypeEnum;
    }

    public int getCharacterLife() {
        return characterLife;
    }

    public VictoryCondition getVictoryCondition() {
        return victoryCondition;
    }

    public String getVictoryConditionDescription() {
        return victoryConditionDescription;
    }

    public SpecialCapacity getSpecialCapacity() {
        return specialCapacity;
    }

    public String getSpecialCapacityDescription() {
        return specialCapacityDescription;
    }
}