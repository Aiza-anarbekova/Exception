package com.compan;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("выберите что то из фигур :" +
                    "\n" + "параллелепипед,конус, сфера, цилиндр ");
            switch (scanner.nextLine().toLowerCase(Locale.ROOT)) {
                case "параллелепипед":

                    try {
                        System.out.println("введите длину");
                        int dlina = scanner.nextInt();
                        if (dlina < 0) {
                            throw new MyException("введите положительное число");
                        }
                        if (dlina > 20) {
                            throw new MyException("20 дан чон сан бербениз");
                        }

                        System.out.println("введите ширину ");
                        int shirina = scanner.nextInt();

                        if (shirina < 0) {
                            throw new MyException("введите положительное число");
                        }
                        if (shirina > 20) {
                            throw new MyException("20 дан чон сан бербениз");
                        }

                        System.out.println("введите высоту ");
                        int vysota = scanner.nextInt();
                        if (vysota < 0) {
                            throw new MyException("введите положительное число");
                        }
                        if (vysota > 20) {
                            throw new MyException("20 дан чон сан бербениз");
                        }

                    } catch (MyException myException) {
                        System.out.println(myException.getMessage());

                    } catch (InputMismatchException exception) {
                        System.out.println(" введите цифры");
                    }
                    break;
                case "цилиндр":
                    try {
                        System.out.println(" введите радиус");
                        int radius= scanner.nextInt();
                        if (radius<0){
                            throw  new MyException("введите положительное число");
                        }
                        if (radius>20){
                            throw new MyException("20 дан чон сан бербениз");
                        }

                        System.out.println("введите высоту");
                        int vysota= scanner.nextInt();
                        if (vysota<0){
                            throw  new MyException("введите положительное число");}
                       if (vysota>20){
                           throw new MyException("20 дан чон сан бербениз");
                       }

                    } catch (MyException myException){
                        System.out.println(myException.getMessage());
                    }
                default:
                    System.out.println("выберите правильную фигуру");

            }

        }
    }
}