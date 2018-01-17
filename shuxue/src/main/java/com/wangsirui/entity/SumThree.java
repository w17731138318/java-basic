package com.wangsirui.entity;


/**
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-01-11 10:22
 * @see
 **/
public class SumThree {
	private Long id;

	private int numOne;

	private int numTwo;

	private int numThree;

	private String operator;

	private int answer;

	public SumThree(int numOne, int numTwo, int numThree, String operator, int answer) {
		this.numOne = numOne;
		this.numTwo = numTwo;
		this.numThree = numThree;
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

	public int getNumThree() {
		return numThree;
	}

	public void setNumThree(int numThree) {
		this.numThree = numThree;
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
		return "SumThree{" +
				"id=" + id +
				", numOne=" + numOne +
				", numTwo=" + numTwo +
				", numThree=" + numThree +
				", operator='" + operator + '\'' +
				", answer=" + answer +
				'}';
	}
}
