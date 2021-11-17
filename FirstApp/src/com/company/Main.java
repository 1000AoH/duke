package com.company;

public class Main {
    public int number;

    public static void main(String[] args) {
//        Main object = new Main();
//        object.a() ;
//        System.out.println(object.number);
//        System.out.println(object.bmi(74,1.74));
//        String b = "";
//        System.out.println(b.isEmpty());
//        double x = Double.MAX_VALUE;
//        float y = Float.MAX_VALUE;
//        System.out.println(x);
//        System.out.println(y);
//        System.out.println(x-y);
//
//        Person info = new Person();
//        info.display("Dzung",1996,"Vietnam");
//
//        object.a();
        final Double PI =  Math.PI;
        System.out.println(PI);

        Person.display("Dzung", 1996, "Vietnam");

        Month x = Month.APR;
        System.out.println(x);

    }
    public void a(){
        System.out.println(5);

    }


    public double bmi(double weight, double height){
        return  weight/height/height;
    }
}
