package com.frg0.sh.services.characterCardService;

import com.frg0.sh.models.charactersCards.CharacterCard;
import com.frg0.sh.models.charactersCards.CharacterTypeEnum;
import org.springframework.stereotype.Service;

@Service
public class BuildingCharacterService {
    // TODO CREATE EACH CHARACTER

    private CharacterCard createMummyCard(){
        return new CharacterCard(1, "Momie", CharacterTypeEnum.SHADOW, 11, )
    }
}
