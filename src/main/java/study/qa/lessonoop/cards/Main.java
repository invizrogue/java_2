package study.qa.lessonoop.cards;

import study.qa.lessonoop.cards.data.*;
import study.qa.lessonoop.cards.data.Card;
import study.qa.lessonoop.cards.data.Country;
import study.qa.lessonoop.cards.data.MirCard;

public class Main {
    public static void main(String[] args) {
        invoke(new MirCard(), Country.RU);
    }

    public static void invoke(Card card, Country country) { // Полиморфный метод - работает без изменения кода для разных объектов (в данном случае, для разных типов карт)
//        Card masterCard = new Card(); // Нельзя создавать объекты абстрактных классов, а тип переменной может быть абстрактного класса
        card.setBalance(100);
        card.payInCountry(country, 75);
        System.out.println("Текущий баланс: " + card.getBalance());
    }

}
