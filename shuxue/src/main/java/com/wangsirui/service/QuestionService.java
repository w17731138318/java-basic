package com.wangsirui.service;

import com.wangsirui.entity.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-01-11 10:21
 * @see
 **/
@Service
public class QuestionService {

	public List<SumTwo> getAdd(int num, int min, int max) {
		List<SumTwo> list = new ArrayList<>();
		SumTwo question = null;
		int result = 0;
		int numOne = 0;
		int numTwo = 0;
		for (int i = 0; i < num; i++) {
			result = getResult(min, max);
			numOne = getResult(0, result);
			numTwo = result - numOne;
			question = new SumTwo(numOne, numTwo, "+", result);
			list.add(question);
		}
		return list;
	}

	public List<SumThree> getAdd3(int num, int min, int max) {
		List<SumThree> list = new ArrayList<>();
		SumThree question = null;
		int result = 0;
		int numOne = 0;
		int numTwo = 0;
		int numThree = 0;
		for (int i = 0; i < num; i++) {
			result = getResult(min, max);
			numOne = getResult(0, result);
			numTwo = getResult(0, result - numOne);
			numThree = result - numOne - numTwo;
			question = new SumThree(numOne, numTwo, numThree, "+", result);
			list.add(question);
		}
		return list;
	}

	public List<Subtract> getSubtractQuestion(int num, int min, int max) {
		List<Subtract> list = new ArrayList<>();
		Subtract question = null;
		int result = 0;
		int numOne = 0;
		int numTwo = 0;
		for (int i = 0; i < num; i++) {
			numOne = getResult(min, max);
			numTwo = getResult(0, numOne);
			result = numOne - numTwo;
			question = new Subtract(numOne, numTwo, "-", result);
			list.add(question);
		}
		return list;
	}

	public List<Subtract2> getSubtract2Question(int num, int min, int max) {
		List<Subtract2> list = new ArrayList<>();
		Subtract2 question = null;
		int result = 0;
		int numOne = 0;
		int numTwo = 0;
		int numThree = 0;
		for (int i = 0; i < num; i++) {
			numOne = getResult(min, max);
			numTwo = getResult(0, numOne);
			numThree = getResult(0, numOne - numTwo);
			result = numOne - numTwo - numThree;
			question = new Subtract2(numOne, numTwo, numThree, "-", result);
			list.add(question);
		}
		return list;
	}

	public List<Subtract2> getJianadd(int num, int min, int max) {
		List<Subtract2> list = new ArrayList<>();
		Subtract2 question = null;
		int result = 0;
		int numOne = 0;
		int numTwo = 0;
		int numThree = 0;
		for (int i = 0; i < num; i++) {
			numOne = getResult(min, max);
			numTwo = getResult(0, numOne);
			numThree = getResult(0, max - numOne + numTwo);
			result = numOne - numTwo + numThree;
			question = new Subtract2(numOne, numTwo, numThree, "-", result);
			list.add(question);
		}
		return list;
	}

	public List<Subtract2> getJianadd1(int num, int min, int max) {
		List<Subtract2> list = new ArrayList<>();
		Subtract2 question = null;
		int result = 0;
		int numOne = 0;
		int numTwo = 0;
		int numThree = 0;
		for (int i = 0; i < num; i++) {
			numOne = getResult(min, max);
			numTwo = getResult(0, max - numOne);
			numThree = getResult(0, numOne + numTwo);
			result = numOne + numTwo - numThree;
			question = new Subtract2(numOne, numTwo, numThree, "-", result);
			list.add(question);
		}
		return list;
	}

	public List<LineNum> getLine(int num) {
		List<LineNum> list = new ArrayList<>();
		LineNum question = null;
		int headNum = 0;
		int oneNum = 0;
		int twoNum = 0;
		int endNum = 0;
		for (int i = 0; i < num; i++) {
			headNum = getResult(1, 5);
			oneNum = headNum + getResult(1, 5);
			twoNum = oneNum + getResult(1, 10);
			endNum = twoNum + getResult(1, 5);
			question = new LineNum(headNum, endNum, oneNum, twoNum);
			list.add(question);
		}
		return list;
	}

	public int getResult(int min, int max) {
		if (max == 0) {
			return 0;
		}
		Random random = new Random();
		return random.nextInt(max) % (max - min + 1) + min;
	}


}
