package ua.ithillel.java;

public class UserBank {
    public static void main(String[] args) {
        try {
            MoneyTransactionUtil.sendTo();
        } catch (NumberFormatException e) {
            System.out.println("The number entered is too large or missing.");
        } catch (AccountException ex) {
            System.out.println("Error with bank details. The card number of the sender and " +
                    "recipient may be the same.");
        } catch (MoneyValueException exc) {
            System.out.println("Error sending amount. Amount must be greater than 0." +
                    " Amount must not exceed the limit of 100,000.");
        }
    }
}
