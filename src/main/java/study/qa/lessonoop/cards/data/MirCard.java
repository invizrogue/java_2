package study.qa.lessonoop.cards.data;

public class MirCard extends Card implements ICard {

    public MirCard() {
        super(PaymentSystem.MIR);
    }

    protected boolean isCountryValidForThisCard(Country country) {
        return country == Country.RU;
    }
}
