package study.qa.cards.data;

public class UnionPayCard extends Card implements ICard {

    public UnionPayCard() {
        super(PaymentSystem.UNION_PAY);
    }

    protected boolean isCountryValidForThisCard(Country country) {
        return country == Country.CN || country == Country.RU;
    }
}
