package com.frg0.sh.services.characterCardService;

import com.frg0.sh.models.cardDeck.CharactersDeck;
import com.frg0.sh.models.charactersCards.CharacterCard;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CharacterService {
    // TODO BUILD EACH TYPE OF CHARACTER DECK
    // TODO PICK CORRECT AMOUNT OF CHARACTER FROM EACH TYPE

    // Building characters type deck
    // Shadow deck
    public CharactersDeck constructShadowDeck(){
        return null;
    }

    // Stocking the current characters in game
    public Optional<List<CharacterCard>> getCurrentCharactersInGame(){
        // TODO populate this list

        return new Optional<>(new ArrayList<>());
    }
}
