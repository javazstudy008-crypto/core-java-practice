package com.brainworks;

import java.lang.reflect.Array;

public class Lecture5_String {
    public static void main(String[] args) {
        //== and equals()
//        String s1 = new String("Shubham");
//        String s2 = "Shubham";
//        String s3 = "Shubham";
//        String s4 = s1.intern();
//        System.out.println(s1==s2);     //false
//        System.out.println(s1==s3);     //false
//        System.out.println(s2==s3);     //true
//        System.out.println(s1==s4);        //true
//        System.out.println(s2==s4);         //false

//        System.out.println(s1.equals(s2));  //true


        //Methods of String class
//        String s = "Pawan";     //sequence of char
                  //01234
//        System.out.println(s.length());
//        char ch = s.charAt(5);      //a

//        System.out.println(ch);
//        System.out.println(s.toLowerCase());        //pawan
//        System.out.println(s.toUpperCase());        //PAWAN
//        String s2 = "paWan";            //'P' = 80, 'p' = 112 80-112= -32
//        System.out.println(s.equals(s2));           //false equals()--> case sensitive
//        System.out.println(s.equalsIgnoreCase(s2));     //true equalsIgnoreCase() --> not case sensitive
//        System.out.println(s.compareTo(s2));
//        s=s.concat(" Hello");
//        System.out.println(s);
//        System.out.println(s.substring(2));
//        System.out.println(s.substring(1, 6));
//        System.out.println(s.contains("n"));        //true
//        String str = "This is a shiny day";
//        System.out.println(str.contains("shiny"));      //false
//        System.out.println(s.startsWith("Pe"));             //false
//        System.out.println(str.startsWith("is"));         //false
//        System.out.println(str.endsWith("ny day"));         //true
//        System.out.println(s.indexOf("wan"));           //2
//        System.out.println(s.indexOf("an"));         //-1
//        System.out.println(s.lastIndexOf("a"));
//        System.out.println(s.replace('a', 'e'));        //Pewen
//        System.out.println(str.replace("shiny", "sunny"));      //This is a sunny day
//        String name1 = "     Kunal   ";
//        String name2 = "     Kunal       Kamra    ";
//        System.out.println(name1.trim());           //kunal
//        System.out.println(name2.trim());           //Kunal       Kamra
//        String str1 = "This is a shiny day";
//        String[] arr1= str1.split(" ");
//        for(int i=0; i<arr1.length; i++){
//            System.out.println(arr1[i] + " ");
//        }
//        String str = "s";           //String
//        String[] arr = {"This", "is", "a", "shiny", "day"};
//        System.out.println(str1.split("is"));
////        String[] arr = {"chetan", "kunal", "Harsh"};      //Array
//        String[] splitResult = str1.split("is");
//        System.out.println(splitResult);

//        String str = "";
//        String str2 = "    ";
//        String str3 = "name        ";
//        System.out.println(str.isBlank());      //true
//        System.out.println(str.isEmpty());      //true
//        System.out.println(str2.isBlank());     //true
//        System.out.println(str2.isEmpty());     //false
//        System.out.println(str3.isBlank());     //false
//        System.out.println(str3.isEmpty());     //false
//        System.out.println(str3.trim().isEmpty());      //false

        //StringBuffer and StringBuilder
        StringBuffer sb1 = new StringBuffer("Java");
        sb1.append(" world");
        System.out.println(sb1);
    }
}
