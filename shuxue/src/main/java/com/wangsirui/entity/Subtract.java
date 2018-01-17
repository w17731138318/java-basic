package com.wangsirui.entity;


/**
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-01-11 11:47
 * @see
 **/
public class Subtract {
	private Long id;

	private int numOne;

	private int numTwo;

	private String operator;

	private int answer;

	public Subtract(int numOne, int numTwo, String operator, int answer) {
		this.numOne = numOne;
		this.numTwo = numTwo;
		this.operator = operator;
		this.answer = answer;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getNumOne() {
		return numOne;
	}

	public void setNumOne(int numOne) {
		this.numOne = numOne;
	}

	public int getNumTwo() {
		return numTwo;
	}

	public void setNumTwo(int numTwo) {
		this.numTwo = numTwo;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public int getAnswer() {
		return answer;
	}

	public void setAnswer(int answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "Subtract{" +
				"id=" + id +
				", numOne=" + numOne +
				", numTwo=" + numTwo +
				", operator='" + operator + '\'' +
				", answer=" + answer +
				'}';
	}
}
