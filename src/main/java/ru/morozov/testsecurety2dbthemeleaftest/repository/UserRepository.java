package ru.morozov.testsecurety2dbthemeleaftest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.morozov.testsecurety2dbthemeleaftest.entity.User;

public interface UserRepository extends JpaRepository<User,Long> {

    User findByEmail(String email);
}
