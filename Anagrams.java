/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
//import java.lang.*;
import java.util.Arrays.*;
/**
 *
 * @author Esha
 */
public class Anagrams {
    
    public static ArrayList<String> AnagramList(String s1, String s2){
        
       ArrayList<String> answerAnagram = new ArrayList<>();
        
        if (s1.length() == 0){
            answerAnagram.add(s1);
            return answerAnagram;
        }else{
        
        for (int i = 0; i<s1.length(); i++){
            
            String before = s1.substring(0,i);
            String after = s1.substring(i+1, s1.length());
            String current = s1.charAt(i) + s2;

            answerAnagram.add(current + before + after );
            //c = word.charAt(i) +"";
            AnagramList(before + after, current);
        }
        
        }
            return answerAnagram;
        
        }
       public void AnagramString(String s1, String s2){
        
        if (s1.length() == 0){
            System.out.println(s2);
        }
        
        for (int i = 0; i<s1.length(); i++){
            
            String before = s1.substring(0,i);
            String after = s1.substring(i+1, s1.length());
            String current = s1.charAt(i) + s2;

            AnagramString(before + after, current);
        
        }

}
       
        public ArrayList<String> Anagram(String s1, String s2){
        
            ArrayList<String> answerAnagram = new ArrayList<>();
            
        if (s1.length() == 0){
            answerAnagram.add(s1);
            return answerAnagram;
        }
        
        for (int i = 0; i<s1.length(); i++){
            
            String before = s1.substring(0,i);
            String after = s1.substring(i+1, s1.length());
            String current = s1.charAt(i) + s2;
            
            Anagram(before + after, current);
            answerAnagram.add(current+before+after);
        }
         return answerAnagram;

}
}
