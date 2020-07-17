package net.lishaoy.singleton;

public class CountClient {

    public static void main(String[] args) {

        SessionCount sessionCount = SessionCount.getInstance();

        sessionCount.plus();

        sessionCount.showMessage();

        sessionCount.plus();

        sessionCount.showMessage();

        sessionCount.decrease();

        sessionCount.showMessage();


    }



}
