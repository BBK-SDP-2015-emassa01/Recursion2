/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Esha
 */
public class Anagram {
    
	public void anag(String s1, String s2)	{
		if(s1.length() == 0)	{
			System.out.println(s2);
		}
		for(int i = 0; i < s1.length(); i++)	{
                    String before = s1.substring(0, i);
                    String after  = s1.substring(i+1, s1.length());
                    String current = s1.charAt(i) + s2;
                    
			anag( before + after, current);
		}
	}
	public static void main(String[] args)	{
		Anagram ana = new Anagram();
		ana.anag("dog", "");
	}
}
