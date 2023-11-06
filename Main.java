
public class Main {
    public static void main(String[] args) {
        TaxiManager<Taxi> manager = new TaxiManager<>();

        Taxi taxi1 = new Taxi(1, false, new int[]{9, 2});
        Taxi taxi2 = new Taxi(2, true, new int[]{8, 9});
        Taxi taxi3 = new Taxi(3, true, new int[]{1, 5 });

        manager.addTaxi(taxi1);
        manager.addTaxi(taxi2);
        manager.addTaxi(taxi3);


        int passengerX = 0;
        int passengerY = 0;

        Taxi nearestTaxi = manager.callNearestTaxi(passengerX, passengerY);

        if (nearestTaxi != null) {
            System.out.println("The nearest taxi is Taxi " + nearestTaxi.getId());
            double distance = nearestTaxi.calculateDistance(passengerX, passengerY);
            double fare = nearestTaxi.calculateFare(distance);
            System.out.println("The fare for the ride is: " + fare);
        } else {
            System.out.println("No available taxis nearby");
        }

    }

}
