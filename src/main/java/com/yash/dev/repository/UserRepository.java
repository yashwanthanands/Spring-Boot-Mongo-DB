package com.yash.dev.repository;

import com.yash.dev.document.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Yashwanth Anand S
 **/

public interface UserRepository extends MongoRepository<Users, Integer> {
}
