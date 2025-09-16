//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//Задача 1
for (int i = 1; i<= 10; i++){
    System.out.println(i);
}

//Задача 2
for (int i = 10; i>=1; i--){
    System.out.println(i);
}

//Задача 3
for (int i = 0; i < 17; i = i + 2) {
    System.out.println(i);
}

//Задача 4
for (int i = 10; i >= -10; i--){
    System.out.println(i);
}


//Задача 5
for (int i = 1904; i <= 2096; i=i+4){
    System.out.println(i + " год является високосным");
}

//Задача 6
for (int i = 7; i <= 98; i=i+7) {
    System.out.println(i);
}

//Задача 7
for (int i = 1; i <= 512; i=i*2) {
    System.out.println(i);
}

//Задача 8
int money = 29000;
int totalMoney = 0;
for (int i = 1; i <= 12; i++){
    totalMoney += money;
    System.out.println("Месяц " + i + ", сумма накоплений равна " + totalMoney + " рублей");
}

//Задача 9
int money1 = 29000;
double totalMoney1 = 0;
for (int i = 1; i <= 12; i++){
    totalMoney1 = totalMoney1 + totalMoney1/100;
    totalMoney1 += money1;
    System.out.println("Месяц " + i + ", сумма накоплений равна " + totalMoney1 + " рублей");
}

//Задача 10
int number = 2;
for (int i = 1; i <= 10; i++) {

    System.out.println(number + "*" + i + "=" + number*i);
}

    }
}