import java.util.*;

class WrongClassOfCard extends Exception {
    public WrongClassOfCard(String s) {
        super("Invalid card class: " + s);
    }
}

abstract class BaseCustomer {
    protected String id;
    protected String name;
    protected int points = 0;

    public BaseCustomer(String id, String name) {
        this.id = id;
        this.name = name;
        this.points = points;
    }

    abstract public void addPoints(int recievePoints);

    public int getPoint() {
        return points;
    }
}

class LoyalCustomer extends BaseCustomer {
    private String cardClass;

    public LoyalCustomer(String id, String name, String cardClass) throws WrongClassOfCard {
        super(id, name);

        String inputCardClass = cardClass.toLowerCase();        
        switch (inputCardClass) {
            case "gold":
            case "silver":
            case "diamond":
                this.cardClass = inputCardClass;
                break;

            default:
                throw new WrongClassOfCard(cardClass);
        }
    }

    public void addPoints(int recievePoints) {
        int newPoints = points + recievePoints, coefficient = 0;

        switch (cardClass) {
            case "gold":
                coefficient = 2;
                break;
            case "silver":
                coefficient = 3;
                break;
            case "diamond":
                coefficient = 4;
                break;
        }

        points += recievePoints + (newPoints / 10000) * coefficient;
    }  
}

class CasualCustomer extends BaseCustomer {
    private int monthsOutOfDate = 0;

    public CasualCustomer(String id, String name, int monthsOutOfDate) {
        super(id, name);
        this.monthsOutOfDate = monthsOutOfDate;
    }

    public void addPoints(int recievePoints) {
        int newPoints = points + recievePoints;
        points += recievePoints + (newPoints / 10000) * (((monthsOutOfDate > 12) && (newPoints >= 100)) ? 2 : 1);
    }    
}

class CustomerManager {
    private List<BaseCustomer> customerList = new ArrayList<>();

    public CustomerManager() {}

    public void add(BaseCustomer x) {
        customerList.add(x);
    }

    public List<BaseCustomer> getList() {
        return customerList;
    }
}

public class HomeWork11 {
    public static void main(String[] args) {
        CustomerManager manager = new CustomerManager();

        try {
            BaseCustomer test = new LoyalCustomer("aa", "dsaf", "daf");
        } catch (WrongClassOfCard e) {
            System.err.println("Error: " + e.getMessage());
        }

        try {
            BaseCustomer one = new LoyalCustomer("dafa", "dsafare", "gold");
            BaseCustomer two = new LoyalCustomer("dapofreqw", "Drewrq", "SILVER");
            BaseCustomer three = new LoyalCustomer("ewqr", "ewqr", "diaMOND");
            BaseCustomer four = new CasualCustomer("dafa", "eer", 34);
            BaseCustomer five = new CasualCustomer("wer", "dav", 3);

            manager.add(one); manager.add(two); manager.add(three); manager.add(four); manager.add(five);

            for (BaseCustomer x : manager.getList()) {
                x.addPoints(500000);
                System.out.println(x.getPoint());
            }
        } catch (WrongClassOfCard e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
