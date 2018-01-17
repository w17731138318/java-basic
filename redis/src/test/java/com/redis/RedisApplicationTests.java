package com.redis;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Set;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisApplicationTests {

	@Autowired
	private StringRedisTemplate stringRedisTemplate;

	@Test
	public void contextLoads() {
		// 保存字符串
//		stringRedisTemplate.opsForValue().set("aaa", "111");
//		stringRedisTemplate.opsForZSet().add("aaa1","AAA1",20);
//		stringRedisTemplate.opsForZSet().add("aaa1","AAA2",30);
//		stringRedisTemplate.opsForZSet().add("aaa1","AAA3",40);
		Set<String> sets = stringRedisTemplate.opsForZSet().range("aaa1", 1, -2);
		Set<String> aaa1 = stringRedisTemplate.opsForZSet().rangeByScore("aaa1", 19, 41);
		sets.stream().forEach(e->{
			System.out.println(e);
		});
		aaa1.stream().forEach(e->{
			System.out.println(e);
		});
		Assert.assertEquals("111", stringRedisTemplate.opsForValue().get("aaa"));
	}

}
