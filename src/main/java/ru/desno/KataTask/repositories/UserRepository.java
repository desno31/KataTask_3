package ru.desno.KataTask.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.desno.KataTask.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
