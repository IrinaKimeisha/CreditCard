public class Main {
    public static void main(String[] args) {
//Создайте класс CreditCard c полями номер счета, текущая сумма на счету.
//1.Добавьте метод, который позволяет начислять сумму на кредитную карточку.
//2.Добавьте метод, который позволяет снимать с карточки некоторую сумму.
//3.Добавьте метод, который выводит текущую информацию о карточке.
/*4.Напишите программу, которая создает три объекта класса CreditCard;
у которых заданы номер счета и начальная сумма
Тестовый сценарий для проверки:
Положите деньги на первые две карточки и снимите с третьей.
Выведите на экран текущее состояние всех трех карточек.*/

        CreditCard first = new CreditCard();
        first.nomerScheta = 123;
        first.tekSummaNaSchete = 1000;
        first.info();
        first.nachislenie(1000);


        CreditCard second = new CreditCard();
        second.nomerScheta = 456;
        second.tekSummaNaSchete = 2000;
        second.info();
        second.nachislenie(2000);


        CreditCard third = new CreditCard();
        third.nomerScheta = 789;
        third.tekSummaNaSchete = 3000;
        third.info();
        third.snyatie(1500);

        System.out.println("izmeneniya:");

        first.info();
        second.info();
        third.info();

    }
}