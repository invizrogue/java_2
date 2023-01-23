package study.qa.cards.data;

public class VisaCard extends Card implements ICard {

    public VisaCard() {
        super(PaymentSystem.VISA);
    }

    protected boolean isCountryValidForThisCard(Country country) {
        return true;
    }
}
