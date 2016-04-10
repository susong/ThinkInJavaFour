package c8;

/**
 * Created by SuSong on 2014/12/28 0028.
 */

class AlertStatus {
    public void alert() {
        System.out.println("alert none");
    }
}

class GreenAlertStatus extends AlertStatus {
    public void alert() {
        System.out.println("alert green");
    }
}

class YellowAlertStatus extends AlertStatus {
    public void alert() {
        System.out.println("alert yellow");
    }
}

class RedAlertStatus extends AlertStatus {
    public void alert() {
        System.out.println("alert red");
    }
}

class Starship {
    AlertStatus status = new AlertStatus();

    public void changeStatus(AlertStatus status) {
        this.status = status;
    }

    public void performPlay() {
        status.alert();
    }
}

public class Exercise16 {
    public static void main(String[] args) {
        Starship starship = new Starship();
        starship.performPlay();
        starship.changeStatus(new GreenAlertStatus());
        starship.performPlay();
        starship.changeStatus(new YellowAlertStatus());
        starship.performPlay();
        starship.changeStatus(new RedAlertStatus());
        starship.performPlay();
    }
}
