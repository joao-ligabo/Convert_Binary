package com.joao_ligabo.binary.converter.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CharacterData {

    private char character;
    private int ASCII;
    private String binary;

    @Override
    public String toString() {
        return "Character of Word: " + character + ", ASCII: " + ASCII + ", binary: " + binary;
    }

}
