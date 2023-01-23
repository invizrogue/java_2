package study.qa.cards;

import study.qa.cards.data.*;

import static study.qa.cards.data.Country.*;

public class Main {
    public static void main(String[] args) {
        invoke(new MirCard(), US);
    }

    public static void invoke(Card card, Country country) { // Полиморфный метод - работает без изменения кода для разных объектов (в данном случае, для разных типов карт)
//        Card masterCard = new Card(); // Нельзя создавать объекты абстрактных классов, а тип переменной может быть абстрактного класса
        card.setBalance(100);
        card.payInCountry(country, 75);
        System.out.println("Текущий баланс: " + card.getBalance());
    }

}
