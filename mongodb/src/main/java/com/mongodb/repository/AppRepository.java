package com.mongodb.repository;

import com.mongodb.entity.App;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2017/11/16.
 */
@Repository
public interface AppRepository extends MongoRepository<App, ObjectId>
{
	App findOneByApiKey(String apiKey);
}