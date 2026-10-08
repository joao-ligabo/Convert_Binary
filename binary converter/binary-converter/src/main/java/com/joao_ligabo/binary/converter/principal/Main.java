package com.joao_ligabo.binary.converter.principal;

import com.joao_ligabo.binary.converter.model.CharacterData;
import com.joao_ligabo.binary.converter.service.BinaryConverter;
import com.joao_ligabo.binary.converter.util.UserMenu;

import java.util.List;

public class Main {

    public Main(){
        UserMenu userMenu = new UserMenu();
        BinaryConverter binaryConverter = new BinaryConverter();

        userMenu.menu();

        List<CharacterData> result = binaryConverter.converter(
                userMenu.getResponseUser()
        );

        userMenu.showResult(result);

    }
}
