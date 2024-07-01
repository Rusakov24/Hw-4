public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int age = 23;

        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " то он совершенолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " то нодо немного подождать");

        }
        System.out.println("Задание 2");
        int temperature = 10;

        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов" + " нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов" + " можно идти без шапки");
        }

        System.out.println("Задание 3");

        int speed = 310;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }

        System.out.println("Задание 4");
        int humanAge = 13;
        if (humanAge >= 2 && humanAge <= 6) {
            System.out.println("Если возраст человека равен " + humanAge + ", то ему нужно ходить в детский сад.");
        } else if (humanAge >= 7 && humanAge <= 17) {
            System.out.println("Если возраст человека равен " + humanAge + ", то ему нужно ходить в школу");
        } else if (humanAge >= 18 && humanAge <= 24) {
            System.out.println("Если возраст человека равен " + humanAge + ", то место в универерситете.");
        } else {
            System.out.println("Если возраст человека равен " + humanAge + ", то ему пора ходить на работу.");
        }
        System.out.println("Задание 5");
        int childrenAge = 13;
        if ( childrenAge < 5 ) {
            System.out.println("Если возраст ребенка равен " + childrenAge + ", то он не может катиться на аттракционе.");
        } else if (childrenAge >= 5 && childrenAge <= 14) {
            System.out.println("Если возраст ребенка равен " + childrenAge + ", то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        } else if (childrenAge >14) {
            System.out.println("Если возраст ребенка равен " + childrenAge + ", то он может кататься без сопровождения взрослого.");
        }
        System.out.println("Задание 6");

                int totalCapacity = 102;
                int sittingCapacity = 60;
                int standingCapacity = totalCapacity - sittingCapacity;
                int passengers = 80;

                if (passengers < sittingCapacity) {
                    System.out.println("В вагоне есть сидячие места");
                } else if (passengers < totalCapacity) {
                    System.out.println("В вагоне есть только стоячие места");
                } else {
                    System.out.println("Вагон полностью заполнен");
                }
        System.out.println("Задание 7");
        int one = 25;
        int two = 22;
        int three = 23;
                if ( one > two && one > three ) {
            System.out.println("Наибольшее число: " + one);}
                else if (two > one && two > three) {
            System.out.println("Наибольшее число: " + two);}
                else {
                    System.out.println("Наибольшее число: " + three);
                }
            }
        }