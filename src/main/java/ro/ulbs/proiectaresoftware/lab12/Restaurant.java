package ro.ulbs.proiectaresoftware.lab12;

public class Restaurant {

    private static final Restaurant restaurant;
    private  long usedWater; //ml
    private int waterUsage = 1000;

    static {
        restaurant = new Restaurant();
    }

    private Restaurant() {
        this.usedWater = 0;
    }

    public static Restaurant getRestaurant() {
        return restaurant;
    }

    public synchronized void washHands() {
        for(int i = 0; i < waterUsage; i++) {
            this.usedWater++;
        }
    }
    public synchronized void washDishes() {
        for(int i = 0; i < waterUsage; i++) {
                this.usedWater++;
        }
    }

    public long getUsedWater() {
        return usedWater;
    }
}
