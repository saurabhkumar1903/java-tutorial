package com.tutorial.core;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class StringPool implements Closeable {

    /**
     * Java String Pool example
     * @param args
     */
    public static void main(String[] args) {
        final String s1 = "Cat";
        final String s2 = "Cat";
        final String s3 = new String("Cat");
        
        System.out.println("s1 == s2 :"+(s1==s2));
        System.out.println("s1 == s3 :"+(s1==s3));
        final List<String> list=Arrays.asList("a","b");
        System.out.println(s3.intern());
    }
    
    
   //method with variable arguments
    public static int sumArray(int i, int...js ){
        int sum = i;
        for(final int x : js){
            sum+=x;
        }
        return sum;
    }

    //method with same implementation as sum with array as argument
    public static int sumArray(int i, int j,int[] js ){
        int sum = i;
        for(final int x : js){
            sum+=x;
        }
        return sum;
    }


	@Override
	public void close() throws IOException {
		// TODO Auto-generated method stub
		
	}

}