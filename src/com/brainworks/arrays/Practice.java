package com.brainworks.arrays;

public class Practice {
    public static void main(String[] args) {
        Data d = new Data("Data-1", "123");
        System.out.println(d.id);
        System.out.println(d.name);
        System.out.println(d.getData(12));
    }
}

class Data<E,V>{
    E id;

    V name;

    Data(E id, V name){
        this.id=id;
        this.name = name;
    }

    public E getData(E id){
        return id;
    }
}