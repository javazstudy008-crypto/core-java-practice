import com.brainworks.Lecture2;
import com.brainworks.Lecture3;

import java.util.Scanner;

class Demo{
    int roll;
    String name;
    Demo(int roll, String name){
        this.roll=roll;
        this.name=name;
    }


    public static void main(String[] args){
        Demo d1 = new Demo(12, "chetan");
        System.out.println(d1.name);
        System.out.println(d1.roll);
    }


}