package com.wangsirui.web;

import com.wangsirui.entity.*;
import com.wangsirui.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-01-11 10:17
 * @see
 **/
@RestController
@RequestMapping("/shuxue")
public class WebController {

	@Autowired
	private QuestionService service;
	@GetMapping("/add2")
	public List<SumTwo> getAdd(){
		//生成题目
		List<SumTwo> list = service.getAdd(10, 9, 20);
		return list;
	}
	@GetMapping("/add3")
	public List<SumThree> getAdd3(){
		//生成题目
		List<SumThree> list = service.getAdd3(10, 9, 20);
		return list;
	}
	@GetMapping("/jian")
	public List<Subtract> getJian(){
		//生成题目
		List<Subtract> list = service.getSubtractQuestion(10, 9, 20);
		return list;
	}
	@GetMapping("/jian2")
	public List<Subtract2> getJian2(){
		//生成题目
		List<Subtract2> list = service.getSubtract2Question(10, 9, 20);
		return list;
	}
	@GetMapping("/jianadd")
	public List<Subtract2> getJianadd(){
		//生成题目
		List<Subtract2> list = service.getJianadd(10, 9, 20);
		return list;
	}
	@GetMapping("/jianadd1")
	public List<Subtract2> getJianadd1(){
		//生成题目
		List<Subtract2> list = service.getJianadd1(10, 9, 20);
		return list;
	}
	@GetMapping("/line")
	public List<LineNum> getLine(){
		//生成题目
		List<LineNum> list = service.getLine(10);
		return list;
	}
}
