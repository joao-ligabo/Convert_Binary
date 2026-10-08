package com.joao_ligabo.binary.converter.service;

import com.joao_ligabo.binary.converter.model.CharacterData;
import com.joao_ligabo.binary.converter.util.UserMenu;

import java.util.ArrayList;
import java.util.List;

public class BinaryConverter{

    private String textUser;
    private int quantityChar;

    public List<CharacterData> converter(String dataUser){

        textUser = dataUser;
        quantityChar = textUser.length();

        List<CharacterData> listCharacterData = new ArrayList<>();


        for (int i = 0; i < quantityChar; i++) {
            char charWord = textUser.charAt(i);
            int ascii = (int) charWord;
            String binary = Integer.toBinaryString(ascii);

            CharacterData characterData = new CharacterData(charWord, ascii, binary);

            listCharacterData.add(characterData);

        }

        return listCharacterData;

    }
}
