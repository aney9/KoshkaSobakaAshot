import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите собака или кошка?\n1. Собака\n2. Кошка\n3. Выйти");
        int vybor = sc.nextInt();
        boolean pravda = true;
        while (pravda) {
            switch (vybor) {
                case 1:
                    System.out.println("Выберите действие с собака\n1. Кормить\n2. Звук собака\n3. Играть с собака");
                    int vybor1 = sc.nextInt();
                    switch (vybor1) {
                        case 1:
                            dog.eat();
                            break;
                        case 2:
                            dog.sound();
                            break;
                        case 3:
                            dog.play();
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Выберите действие с кошка\n1. Кормить\n2. Звук кошка\n3. Играть с кошка");
                    int vybor2 = sc.nextInt();
                    switch (vybor2) {
                        case 1:
                            cat.eat();
                            break;
                        case 2:
                            cat.sound();
                            break;
                        case 3:
                            cat.play();
                            break;
                    }
                    break;
                case 3:
                    pravda = false;
            }
        }
    }

    public static class Dog implements Pet {
        @Override
        public void eat() {
            System.out.println("Собака нужна кармит педигри а потом в шаурма");
        }

        @Override
        public void sound() {
            System.out.println("ГАВ ГАВ ГАВ ГАВ");
        }

        public void play() {
            System.out.println("С собака нужна гулят инагда точне утрам и вечерам");
        }
    }

    public static class Cat implements Pet {
        @Override
        public void eat() {
            System.out.println("Кошку нужна кормит вискасам");
        }

        @Override
        public void sound() {
            System.out.println("МЯУ МЯУ МЯУ МЯУ");
        }

        public void play() {
            System.out.println("Купи кошке мышку или когтеточку");
        }
    }
}