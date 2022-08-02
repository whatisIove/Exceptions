package ua.ithillel.java;

import java.util.Objects;
import java.util.Scanner;

public class MoneyTransactionUtil {

    public static double sumTransfer;
    public static long card;
    public static long cardToSend;

    private MoneyTransactionUtil() {
    }

    static void sendTo() throws AccountException, MoneyValueException {
        MoneyTransactionUtil mtu = new MoneyTransactionUtil();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your card number:");
        card = Long.parseLong(sc.nextLine());
        System.out.println("Enter recipient's card number");
        cardToSend = Long.parseLong(sc.nextLine());
        System.out.println("Enter amount of money");
        sumTransfer = Integer.parseInt(sc.next());
        if (Objects.equals(card, cardToSend)) {
            throw new AccountException();

        }
        if ((sumTransfer <= 0) | (sumTransfer > 100000)) {
            throw new MoneyValueException();
        } else
            System.out.println("From card: " + card + " to card: " + cardToSend +
                    " amount transferred: " + sumTransfer + '$');
    }

    public long getCard() {
        return card;
    }

    public void setCard(long card) {
        MoneyTransactionUtil.card = card;
    }

    public long getCardToSend() {
        return cardToSend;
    }

    public void setCardToSend(long cardToSend) {
        MoneyTransactionUtil.cardToSend = cardToSend;
    }

    public double getSumTransfer() {
        return sumTransfer;
    }

    public void setSumTransfer(double sumTransfer) {
        MoneyTransactionUtil.sumTransfer = sumTransfer;
    }
}
