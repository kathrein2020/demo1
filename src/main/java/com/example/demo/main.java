package com.example.demo;

public class main {

    public static void main(String[] args) {
        int a = 10;
        int b = 10;

        String str = "qwe";
//        if (a > b) {
//            System.out.println("a big");
//        }
//
//        else if (a==b)
//        {
//            System.out.println("equal");
//        }
//
//        else {
//            System.out.println("b is big");


//            switch (a) {
//                case 20:
//                    System.out.println("a is 20");
//                    break;
//                case 10:
//                    System.out.println("a is 10");
//                    break;
//                default:
//                    System.out.println("a is no 10 or 20");
//            }


        int variable = switch (str) {
            case  "qwe", "abc" -> 3;
            default -> 0;
        };
        System.out.println(variable);

    }
}
