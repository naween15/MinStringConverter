package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        StringBuilder sourceString=new StringBuilder();
        StringBuilder targetString=new StringBuilder();
        System.out.println("enter first string");
        sourceString.append(scanner.nextLine());
        System.out.println("enter target string");
        targetString.append(scanner.nextLine());
        StringChecker stringChecker=new StringChecker();
        Boolean status=stringChecker.checklength(sourceString,targetString);
        if (status) {
            int count=stringChecker.countSimilar(sourceString,targetString);
            System.out.println("the minimum number of operation required to convert "+sourceString+" to "+targetString+" is "+(count));
        }
        else{
            int count=stringChecker.countDissimilar(sourceString,targetString);
            System.out.println("the minimum number of operation required to convert "+sourceString+" to "+targetString+" is "+(count));

        }


    }
}
