public class CreditCard {

    int nomerScheta;     // поле номер счета
    int tekSummaNaSchete;// поле текущая сумма на счете

    CreditCard() {
    }

    //1. Добавьте метод, который позволяет начислять сумму на кредитную карточку.
    int nachislenie(int nachislenie) {
        this.tekSummaNaSchete += nachislenie;
        return tekSummaNaSchete;
    }

    //2.Добавьте метод, который позволяет снимать с карточки некоторую сумму.
    int snyatie(int snyatie) {
        this.tekSummaNaSchete -= snyatie;
        return tekSummaNaSchete;
    }

    //3.Добавьте метод, который выводит текущую информацию о карточке.
    void info() {
        System.out.println("Nomer Scheta:" + nomerScheta + "; Tek Summa na schete: " + tekSummaNaSchete);
    }
}
