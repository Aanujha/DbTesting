package com.example.dbtesting.repo;

import com.example.dbtesting.model.User;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface UserRepo extends JpaRepository<User,Long> {


    @Query("select u from User u")
    List<User> userlist(Pageable pageable);

    Optional<User> findByEmail(String username);
}
