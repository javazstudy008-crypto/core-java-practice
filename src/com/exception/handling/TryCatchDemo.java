package com.exception.handling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TryCatchDemo {
    public static void main(String[] args) {
        try{                                    //try: try without catch ot finally
            System.out.println(10/0);
            String s = null;
            s.length();                 //null pointer exception
            try{
                FileReader fr = new FileReader("test.txt");
            } catch(FileNotFoundException e){
                System.out.println(e.getMessage());
            }
        }
        catch (ArithmeticException e){                //only catch: catch without try
            System.out.println("arithmatic exception, might have divided by zero");
            try{
                System.out.println(10/0);
            }catch(Exception er){
                er.printStackTrace();
            }

            try{
                FileReader fr = new FileReader("test.txt");
            } catch(FileNotFoundException er){
                System.out.println(er.getMessage());
            }
        }
        catch (NullPointerException e){
//         e.printStackTrace();
            System.out.println("don't keep your string null");
        }
        catch (Exception e){
            System.out.println("other exception");
        }

        System.out.println("this is execution after try catch");
    }
}
