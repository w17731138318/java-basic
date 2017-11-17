package com.mongodb.repository;

import com.mongodb.entity.App;
import org.bson.types.ObjectId;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.Date;
import java.util.IntSummaryStatistics;
import java.util.List;

/**
 * Created by Administrator on 2017/11/16.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AppRepositoryTest {
	@Autowired
	private AppRepository appRepository;

	@Test
	public void appRepositorySaveTest() {
		App app = new App("bbb", "APP名字1", null);
		app.setCreateTime(new Date());
		appRepository.save(app);
	}

	@Test
	public void appRepositoryFindAllTest() {
		List<App> all = appRepository.findAll();

//		new Thread(new Runnable() {
//			@Override
//			public void run() {
//				System.out.println("Before Java8, too much code for too little to do");
//			}
//		}).start();

		new Thread(() -> System.out.println("lambda使用")).start();

		//获取数字的个数、最小值、最大值、总和以及平均值
//		List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
//		IntSummaryStatistics stats = primes.stream().mapToInt((x) -> x).summaryStatistics();
//		System.out.println("Highest prime number in List : " + stats.getMax());
//		System.out.println("Lowest prime number in List : " + stats.getMin());
//		System.out.println("Sum of all prime numbers : " + stats.getSum());
//		System.out.println("Average of all prime numbers : " + stats.getAverage());
//		all.stream().forEach(e -> {
//			System.out.println(e);
//		});
		all.stream().forEach(System.out::println);
	}

	@Test
	public void appRepositoryFindOneByApiKeyTest() {
		App app = appRepository.findOneByApiKey("bbb");
		System.out.println(app);
	}

	@Test
	public void appRepositoryFindByApiKeyTest() {
		List<App> list = appRepository.findByApiKey("bbb");
		list.stream().forEach(System.out::println);
	}

	@Test
	public void appRepositoryFindOneTest() {
		App app = appRepository.findOne(new ObjectId("5a0d6196daced4182887422f"));
		System.out.println(app);
	}

	@Test
	public void appRepositoryUpdateTest() {
		App app = appRepository.findOne(new ObjectId("5a0d50eddaced418f8a7e5a8"));
		app.setAppname("APP名字222");
		appRepository.save(app);
		System.out.println(app);
	}
}