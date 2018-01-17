package com.wangsirui.entity;

/**
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-01-11 14:45
 * @see
 **/
public class LineNum {

	private int headNum;
	private int endNum;
	private int oneNum;
	private int twoNum;

	public LineNum(int headNum, int endNum, int oneNum, int twoNum) {
		this.headNum = headNum;
		this.endNum = endNum;
		this.oneNum = oneNum;
		this.twoNum = twoNum;
	}

	public int getHeadNum() {
		return headNum;
	}

	public void setHeadNum(int headNum) {
		this.headNum = headNum;
	}

	public int getEndNum() {
		return endNum;
	}

	public void setEndNum(int endNum) {
		this.endNum = endNum;
	}

	public int getOneNum() {
		return oneNum;
	}

	public void setOneNum(int oneNum) {
		this.oneNum = oneNum;
	}

	public int getTwoNum() {
		return twoNum;
	}

	public void setTwoNum(int twoNum) {
		this.twoNum = twoNum;
	}

	@Override
	public String toString() {
		return "LineNum{" +
				"headNum=" + headNum +
				", endNum=" + endNum +
				", oneNum=" + oneNum +
				", twoNum=" + twoNum +
				'}';
	}
}
