package com.frg0.sh.services.gameService;

import com.frg0.sh.models.charactersCards.CharacterCard;
import com.frg0.sh.models.charactersCards.CharacterTypeEnum;
import com.frg0.sh.services.characterCardService.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class GameService {
    // Variables instantiation
    private final CharacterService characterService;

    @Autowired
    public GameService(CharacterService characterService) {
        this.characterService = characterService;
    }

    private int getCurrentShadowAlive(){
        Optional<List<CharacterCard>> optionalCharacterList = characterService.getCurrentCharactersInGame();

//        List<CharacterCard> filterCharacterCardList =

                optionalCharacterList.ifPresent(list -> list.stream()
                .filter(character -> character.getCharacterTypeEnum().equals(CharacterTypeEnum.SHADOW))
                .filter(Objects::nonNull)
                .collect(Collectors.toList())
                .size());
        return 0;
    }
}
