package study.qa.lessonoop.cards.data;

public class MasterCard extends Card implements ICard {

    public MasterCard() {
        super(PaymentSystem.MASTERCARD);
    }

    protected boolean isCountryValidForThisCard(Country country) {
        return true;
    }
}
