package tech.project.onefeed.models.data;

import org.springframework.data.repository.CrudRepository;
import tech.project.onefeed.models.User;

public interface UserRepository extends CrudRepository<User, Integer> {

    User findByUsername(String username);
 
 }