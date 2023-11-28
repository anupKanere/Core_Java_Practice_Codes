package com.app;

/*
 * Default capacity of StringBuilder and StringBuffer is 16 
 * new capacity = (current capacity + 1 ) * 2;
 */
public class StringDemo {
	public static void main(String[] args) {

		System.out.println("-------------STRING----------");
		String s1 = new String("bhaskar");
		String s2 = s1.intern();
		System.out.println(s1 == s2); // false
		String s3 = "bhaskar";
		System.out.println(s2 == s3);// true

		System.out.println("-------------STRING BUILDER----------");
		final StringBuilder sb = new StringBuilder();
		sb.append("1234567890123456");
		System.out.println(sb);
		System.out.println("old capacity for 16 char " + sb.capacity() + " length : "+ sb.length());
		sb.append(1);//add num
		sb.append("Hi");//add string
		sb.append(false);//add boolean value
		System.out.println(sb);
		System.out.println("new Capacity after adding 17th  element : " + sb.capacity());
		StringBuilder sb1 = new StringBuilder("ANUP");
		System.out.println(sb1.capacity());
		

		System.out.println("-------------STRING BUFFER----------");
		StringBuffer sbuffer = new StringBuffer();
		sbuffer.append("1234567890123456");
		System.out.println(sbuffer);
		System.out.println("old capacity for 16 char " + sbuffer.capacity());
		sbuffer.append("1");
		System.out.println("new Capacity after adding 17th  element : " + sbuffer.capacity());
		
		
		StringBuffer sb12=new StringBuffer("saicharankumar");
		System.out.println(sb12);//saicharankumar
		sb12.delete(6,13);
		System.out.println(sb12);//saichar
		sb12.deleteCharAt(5);
		System.out.println(sb12);//saichr

	}
}
