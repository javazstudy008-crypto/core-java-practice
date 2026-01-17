package com.brainworks.oops.polymorph;

public class NewChild extends NewParent{
    @Override
    public void write(){
        System.out.println("Child is writing...");
    }

    public void play(){
        System.out.println("Child is playing");
    }

    public static Object charging(){
        System.out.println("This is child class charging method");
        return " ";
    }

    public static void main(String[] args) {
        NewParent np = new NewChild();  //Object decides not reference
        np.read();                      //parent read method
        np.write();                     //Child object hence child write class called
        np.charging();                  //Method hiding
//        np.play();
    }
}
