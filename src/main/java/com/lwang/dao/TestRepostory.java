package com.lwang.dao;

import com.lwang.model.TestTwo;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * TestRepostory.class
 *
 * @author lwang
 * @date 2017/11/10.
 */
public interface TestRepostory extends MongoRepository<TestTwo, String> {


}
