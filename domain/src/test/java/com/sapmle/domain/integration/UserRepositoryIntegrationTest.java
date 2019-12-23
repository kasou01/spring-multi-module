package com.sapmle.domain.integration;

import com.sample.domain.entity.UserEntity;
import com.sample.domain.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.util.Assert;

import javax.persistence.EntityManager;
import javax.sql.DataSource;
import java.util.List;

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class UserRepositoryIntegrationTest {
    @Autowired private DataSource dataSource;
    @Autowired private JdbcTemplate jdbcTemplate;
    @Autowired private EntityManager entityManager;
    @Autowired private UserRepository userRepository;

    @Test
    public void whenCalledSave_thenCorrectNumberOfUsers() {
        userRepository.save(new UserEntity("Bob", "bob@domain.com"));
        List<UserEntity> users = (List<UserEntity>) userRepository.findAll();

        }
}