package com.zulu.MOOC_JAVA;
import java.util.Scanner;


public class MOOC {
     static void main() {
         //MAD LIBS GAME THAT'LL FOCUS ON READING DIFFERENT TYPES OF INPUT FROM THE USER
       Scanner scanner = new Scanner(System.in);

       String adj1;
       String noun1;
       String verb1;
       String adj2;
       String verb2;

         System.out.print("Type an adjective:");
         adj1 = scanner.nextLine();
         System.out.print("Type a noun:");
         noun1 = scanner.nextLine();
         System.out.print("Type a verb:");
         verb1 = scanner.nextLine();
         System.out.print("Type an adjective:");
         adj2 = scanner.nextLine();
         System.out.print("Type a verb:");
         verb2 = scanner.nextLine();

         System.out.println("It was a" +adj1+ " day. No one knew where "+noun1+" was but that didn't stop the fun.\nPerhaps he was "+verb1+"? Who cares?\nI was "+adj2+". I really wanted us to "+verb2+".");
         scanner.close();
     }
    }


