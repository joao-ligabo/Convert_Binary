package com.joao_ligabo.binary.converter.util;

import com.joao_ligabo.binary.converter.model.CharacterData;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Scanner;

@Getter
@Setter
public class UserMenu {

    private String responseUser;
    private Scanner input = new Scanner(System.in);

    public void menu() {

        System.out.print("""
            
            ╔══════════════════════════════════════════════════╗
            ║                 BINARY CONVERTER                 ║
            ╠══════════════════════════════════════════════════╣
            ║                                                  ║
            ║  Type a word:                                    ║
            ║                                                  ║
            ║  > """);


        responseUser = input.nextLine();
    }

    public void showResult(List<CharacterData> characterData) {

        System.out.println("""
            
            ╔══════════════════════════════════════════════╗
            ║              BINARY CONVERTER                ║
            ╠══════════════════════════════════════════════╣
            ║                                              ║
              INPUT: %-39s                                
            ║                                              ║
            ╠══════════════════════════════════════════════╣
            ║                                              ║
            ║  CHARACTER       ASCII       BINARY          ║
            ║  ─────────       ─────       ──────          ║
            ║                                              ║
            """.formatted(responseUser));

        for (CharacterData data : characterData) {
            System.out.printf(
                    "║  %-14s %-11d %-15s  ║%n",
                    data.getCharacter(),
                    data.getASCII(),
                    data.getBinary()
            );
        }

        System.out.println("""
            ║                                              ║
            ╚══════════════════════════════════════════════╝
            """);
    }
}

