import java.lang.System;
import java.util.Scanner;
import java.io.*;
public class Main {
    public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
          PrintStream out = new PrintStream(System.out);
          Animal animal = new Dog();
          animal.info();
    }
}
class Animal {
    public void info() {
        System.out.print("Я родитель класса Dog");
    }
}
class Dog extends Animal {
    @Override
    public void info(){
        System.out.print("Я наследник класса Animal");
    }
}