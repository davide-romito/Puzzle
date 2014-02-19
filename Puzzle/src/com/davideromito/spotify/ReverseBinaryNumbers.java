package com.davideromito.spotify;

/**
 * Write a program for reversing numbers in binary. For instance, the binary
 * representation of 13 is 1101, and reversing it gives 1011, which corresponds
 * to number 11. {@link http://labs.spotify.com/puzzles/}
 * 
 * @author Davide Romito
 * 
 */
public class ReverseBinaryNumbers {

	/**
	 * Calculates the reversing number in binary
	 * 
	 * @param number
	 *            an integer
	 * @return an integer that is the binary reverse of the input
	 */
	public int reverse(int number) {
		char[] cArr = Integer.toBinaryString(number).toCharArray();
		int value = 0;
		for (int j = cArr.length - 1; j >= 0; j--) {
			value += Integer.valueOf(String.valueOf(cArr[j])) * Math.pow(2, j);
		}
		return value;
	}
}
