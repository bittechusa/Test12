package com.string.play;

import org.junit.Test;

public class StringManupulation {
	@Test
	public void play()
	{
		String s="how are you";
		String s1=new String("how are you");
		s.charAt(4);
		System.out.println("How".compareTo("How"));
		System.out.println(s.concat(" doing"));
		s.contains("s1");
		s.endsWith("you");
		s.equals(s1);
		System.out.println(s.equals(s1));
		boolean b=s==s1;
		System.out.println(b);
		s.equalsIgnoreCase(s1);
		int i=s.hashCode();
		int i1=s1.hashCode();
		System.out.println(i);
		int x=s.indexOf('o');
		int x1=s.indexOf('a', x+1);
		s.isEmpty();
		int y=s.lastIndexOf('o');
		s.lastIndexOf('o', y-1);
		s.length();
		s.replace("how", "who");
		String q[]=s.split(" ");
		s.startsWith("how");
		System.out.println(s.substring(4));
		s.substring(4, 7);
		s.toLowerCase();
		s.toUpperCase();
		s.toString();
		s.valueOf(6);
		s.trim();
		StringBuffer sb=new StringBuffer("how are you");
		sb.append(" doing");
		System.out.println(s);
		System.out.println(sb);
		sb.toString().concat("dfg");
		System.out.println(sb.reverse());
		StringBuilder sd=new StringBuilder();
		int i11=Integer.parseInt("7");
		double d=Double.parseDouble("4.8");
		
		System.out.println((int)(Math.random()*1000)+1);
		
		
		
	
		
	}

}
