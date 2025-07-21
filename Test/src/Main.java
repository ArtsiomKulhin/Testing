import java.lang.System;
import java.util.Scanner;
import java.io.*;
public class Main {
    public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
          PrintStream out = new PrintStream(System.out);
          lambda<Integer> operation;
          operation = (x,y)->x*y;
          out.print(operation.calculate(100,450));
    }
}
interface lambda<T> {
    T calculate(T x, T y);
}