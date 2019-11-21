package com.tutorial.core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) throws IOException{
        final BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		final int noOfTemp = Integer.parseInt(br.readLine());
		if (noOfTemp != 0) {
			final String[] sTemp = br.readLine().split(" ");
			final int[] temp = new int[sTemp.length];
			for (int i = 0; i < sTemp.length; i++) {
				temp[i] = Integer.parseInt(sTemp[i]);
			}
			int minDiff = Math.abs(temp[0] - 0);
			int minTemp = temp[0];
			for (final int cTemp : temp) {
				if (Math.abs(cTemp - 0) < minDiff) {
					minDiff = Math.abs(cTemp - 0);
					minTemp = cTemp;
				}
				else if(Math.abs(cTemp - 0) ==minDiff) {
					minDiff = Math.abs(cTemp - 0);
					minTemp = minTemp>cTemp?minTemp:cTemp;
				}
			}
			System.out.println(minTemp);
		} else {
			System.out.println(0);
		}

	}
        
    
}