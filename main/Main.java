

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void printname(String name){
        System.out.println(name);
    }
    public static void main(String[] args) {

       System.out.printf("Hello and welcome!");
      int[] marks={98,99,90};
       System.out.println(marks[2]);
       int[][]finalmarks={{97,98,95},{95,96,98}};
       System.out.println(finalmarks[0][0]);
   int[] marks=new int[4];
   marks[0]=90;
   marks[1]=89;
   marks[2]=97;
   marks[3]=98;
       System.out.println(marks[2]);
    String block="I am coding right now.";





       System.out.println(block);
       System.out.println(block.substring(0,3));
       System.out.println(block.length());
double blank=837.948636348D;
       System.out.println(blank);
       int num= 244;
       System.out.println(num++);
       System.out.println(num);
 System.out.println(Math.max(0x373ffd67213L,87329747));
 System.out.println(Math.min((long)874987875983L,(long)4789365898643L));
       Scanner sc = new Scanner(System.in);
       System.out.println("Input your age");
       int age = sc.nextInt();
       System.out.println(age);
       sc.close();
       Scanner sc = new Scanner(System.in);
       System.out.println("Input block no.");
       int block = sc.nextInt();
       System.out.println(block);
       sc.close();
       if (block<100)
           System.out.println("less than hundred");
       else
           System.out.println("more than hundred");
       for (int j=1; j <= 100; j++)
       {
           System.out.println(j);
       }
      don't use i++ in codes instead of i=i+1 as it can cause error sometimes
          int i=0;
       while(true){
           if(i==3){
               i=i+1;
               continue;
           }
           System.out.println(i);
       i=i+1;
       if(i>5){
           break;
       }}
       printname("Dhruv");
        exception handling
       int[] marks={97,98,99};
       try{
           System.out.println(marks[5]);
       }
       catch (Exception dothis){
           System.out.println(marks[2]);
       }
       System.out.println("the name of the student is Dhruv");




    }}
