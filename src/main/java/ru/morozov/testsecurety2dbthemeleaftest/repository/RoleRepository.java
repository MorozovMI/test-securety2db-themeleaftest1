package ru.morozov.testsecurety2dbthemeleaftest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.morozov.testsecurety2dbthemeleaftest.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);
}
