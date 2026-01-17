package com.brainworks.oops.polymorph;

public class Frame {
    public static void main(String[] chetan) {          //datatype matter not variable
        Frame f = new Frame();
//        f.showResult();
        f.showResult(85, "Parag");
        f.showResult("Krunal");
        f.showResult("Parag", 85);
        main("chetan");
    }

    public static void main(String arg){                //it's like any other method
        System.out.println("inside main");
    }

    public void showResult(){
        System.out.println("Can't show much, I dont have any values");
    }

    public void showResult(String name){                 //method-overloading
        System.out.println(name + " Hello wait for your result");
    }

//    public String showResult(String name){            //Return type alone cannot differentiate methods; confusion, java won't allow
//            return name;
//    }
    public void showResult(int marks, String name){                 //method-overloading
        System.out.println(name + "got marks: " + marks);
    }

    public void showResult(String name, int a){                 //method-overloading
        System.out.println(name + "got marks: " + a);
    }
}
