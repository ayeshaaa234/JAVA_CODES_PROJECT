class Taxi {
    private int id;
    private boolean availability;
    private int[] location;

    public Taxi(int id, boolean availability, int[] location) {
        this.id = id;
        this.availability = availability;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLocation(int[] location) {
        this.location = location;
    }

    public boolean getAvailable() {
        return availability;
    }

    public int[] getLocation() {
        return location;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public double calculateDistance(int x, int y) {
        int X = x - location[0];
        int Y = y - location[1];
        return Math.sqrt(X * X + Y * Y);
    }

        public double calculateFare(double distance) {
            final double farePerKilometer = 2.0;
            return farePerKilometer * distance;
        }

}

