package com.example.bethouse.domain.repository;

import com.example.bethouse.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    @Query(nativeQuery = true, value = "SELECT " +
            "bet_user.user_id AS user_id, " +
            "bet_user.name AS name, " +
            "bet_user.dob AS dob, " +
            "bet_user.cpf AS cpf, " +
            "bet_user.email AS email, " +
            "bet_user.created_at AS created_at, "+
            "wallet.value AS value " +
            "FROM bet_user " +
            "LEFT JOIN wallet ON bet_user.user_id = wallet.user_id " +
            "WHERE bet_user.user_id = :id")
    User findUserTeste(Integer id);
}
