package ru.morozov.testsecurety2dbthemeleaftest.service;


import ru.morozov.testsecurety2dbthemeleaftest.dto.UserDto;
import ru.morozov.testsecurety2dbthemeleaftest.entity.User;

import java.util.List;


public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}
