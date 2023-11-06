import java.util.ArrayList;


class TaxiManager<T extends Taxi> {
    private ArrayList<T> taxis;

    public TaxiManager() {
        this.taxis = new ArrayList<>();
    }

    public void addTaxi(T taxi) {
        taxis.add(taxi);
    }

    public T callNearestTaxi(int x, int y) {
        T nearestTaxi = null;
        double minDistance = Double.MAX_VALUE;

        for (T taxi : taxis) {
            if (taxi.getAvailable()) {
                double distance = taxi.calculateDistance(x, y);
                if (distance < minDistance) {
                    minDistance = distance;
                    nearestTaxi = taxi;
                }
            }
        }

        if (nearestTaxi != null) {
            nearestTaxi.setAvailability(false);
        }

        return nearestTaxi;
    }
}