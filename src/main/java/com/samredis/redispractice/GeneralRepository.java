package com.samredis.redispractice;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneralRepository extends CrudRepository<Object, String> {
}
