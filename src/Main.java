public class Main {
    public static void main(String[] args) {
        System.out.println(" Задание 1 ");
        int age = 18;
        if (age >= 18) {
            System.out.println(" Поздравление пользователя с совершеннолетием ");
        }
        if (age < 18) {
            System.out.println(" Информационное сообщение, что возраст совершеннолетия ещё не наступил");
        }
        System.out.println(" Задание 2 ");
        int age1 = 25;
        if (age1 >= 7 && age1 < 18) {
            System.out.println(" Ребенок ходит в школу ");
        }
        if (age1 >= 18 && age1 < 24) {
            System.out.println(" Человек ходит в университет ");
        }
        if (age1 >= 24) {
            System.out.println(" Человек ходит на работу ");
        }
        System.out.println(" Задание 3 ");
        int vanPlace = 45;
        if (vanPlace >= 60) {
            System.out.println(" Сидячих мест нет ");
        }
        if (vanPlace <= 60) {
            System.out.println(" Седячие места есть ");
        }
        if (vanPlace < 102) {
            System.out.println(" Стоячие места есть ");
        }
        if (vanPlace >= 102) {
            System.out.println(" Все забито ");
        }
        System.out.println(" Задание 4 ");
        int age2 = 17;
        if (age2 >= 18) {
            System.out.println(" Поздравление пользователя с совершеннолетием ");
        } else {
            System.out.println(" Информационное сообщение, что возраст совершеннолетия ещё не наступил, и нужно немного подождать. ");
        }
        System.out.println(" Задание 5 ");
        int age3 = 12;
        if (age3 >= 7 && age3 < 18) {
            System.out.println(" Человек ходит в школу ");
        } else if (age3 >= 18 && age3 < 24) {
            System.out.println(" Человек ходит в университет  ");
        } else if (age3 >= 24)
            System.out.println(" Человек ходит на работу ");
        System.out.println(" Задание 6 ");
        int place = 101;
        if (place >= 60) {
            System.out.println(" Сидячих мест нет ");
        } else {
            System.out.println(" Сидячие места есть ");
        }
        if (place >= 102) {
            System.out.println(" Стоячих мест нет , все забито ");
        } else {
            System.out.println(" Стоячие места есть ");
        }
        System.out.println(" Задание 7 ");
        int aManOfYears = 19;
        boolean youDontGo = (aManOfYears >= 2 && aManOfYears <= 6);
        {
            if (youDontGo) {
                System.out.println(" Человек должен ходить в детский сад ");
            } else {
                System.out.println(" Человек не должен ходить в детский сад ");
            }
            boolean youDontGo1 = (aManOfYears >= 7 && aManOfYears <= 18);
            {
            }
            if (youDontGo1) {
                System.out.println(" Человек доложен ходить в школу ");
            } else {
                System.out.println(" Человек не должен ходить в школу ");
            }
            boolean youDontGo2 = (aManOfYears >= 18 && aManOfYears <= 24);
            if (youDontGo2) {
                System.out.println(" Человеку пора в университет ");
            } else {
                System.out.println(" Человеку еще рано в университет ");
            }
            boolean youDontGo3 = (aManOfYears > 24);
            if (youDontGo3) {
                System.out.println(" Человеку пора работать ");
            } else {
                System.out.println(" Человеку еще рано работать ");
            }
            System.out.println(" Задание 8 ");
            int ageOfTheChild = 10;
            boolean ifTheChild = (ageOfTheChild < 5);
            if (ifTheChild) {
                System.out.println(" Ребенок не может кататься на атракционе ");
            }
            boolean ifTheChild1 = (ageOfTheChild >= 5 && ageOfTheChild <= 14);
            if (ifTheChild1) {
                System.out.println("Ребенок может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя ");
            }
            boolean ifTheChild2 = (ageOfTheChild > 14);
            if (ifTheChild2) {
                System.out.println("Ребенок может кататься без сопровождения взрослого");
            }
            System.out.println(" Задание 9 ");
            int one = 10;
            int two = -12;
            int tree = 45;
            if (one > two) {
                if (one > tree) {
                    System.out.println(" Большее число " + one);
                } else if (tree > one) {
                    System.out.println(" Большее число " + tree);
                } else {
                    System.out.println(" Числа " + one + " и " + tree + " ровны ");
                }
            } else if (two > one) {
                if (two > tree) {
                    System.out.println(" Большее число " + two);
                } else if (tree > two) {
                    System.out.println(" Большее число " + tree);
                } else {
                    System.out.println(" Числа " + two + " и " + tree + " ровны ");
                }
            } else {
                if (one > tree) {
                    System.out.println(" Большее число " + one);
                } else if (tree > one) {
                    System.out.println(" Большее число " + tree);
                } else {
                    System.out.println(" Все числа ровны ");
                }
            }
        }
    }
}