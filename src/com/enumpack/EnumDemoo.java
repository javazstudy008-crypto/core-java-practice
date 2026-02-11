package com.enumpack;

public class EnumDemoo {
    enum VEGETABLES{
        KANDA, AALOO, TAMATAR;

        enum FRUITS{
            GRAPES, APPLE, PEACH
        }
    }
    public static void main(String[] args) {
        System.out.println(MONTHS.DECEMBER);
        System.out.println(MONTHS.DECEMBER);
        System.out.println(MONTHS.DECEMBER);
        System.out.println(VEGETABLES.AALOO);
        System.out.println(VEGETABLES.FRUITS.APPLE);
        EnumDemo.anyMethod();
        EnumDemo.MONDAY.getCount();
    }


}


enum MONTHS{
    JANUARY, FEBRUARY, MAY, JUNE, DECEMBER;
}

enum ERROR_CODE{
    SUCCESS(200), FAILURE(500);
    final int code;
    ERROR_CODE(int code){
        this.code=code;
    }
}

