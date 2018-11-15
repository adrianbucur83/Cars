

public abstract class Car implements Vehicles {

    public static final int MAX_GEARS = 6;
    boolean vehicle_is_started;
    double consumption_delta = 0;
    int tyre_size;
    String chassis_number;
    double fuel_used;
    private int current_gear = 0;
    private double available_fuel;
    String newidea;

    void setAvailable_fuel(double available_fuel) {
        this.available_fuel = available_fuel;
    }

    public void shiftGear(int gear) {
        if ((gear > 6) | (gear < 0)) {
            System.err.println("Invalid Gear");
        } else
            current_gear = gear;

    }


    double getAvailableFuel() {
        return available_fuel;
    }

    @Override
    public void start() {
        System.out.println("We started the vehicle!");
        this.vehicle_is_started = true;
        fuel_used = 0; //reset how much fuel we used
    }

    public void stop() {
        System.out.println("We stopped the vehicle!");
        this.vehicle_is_started = false;

    }


    @Override
    public void drive(double distance) {

        if (vehicle_is_started) {

            //this is how much we are actually burning, depending on the gear we are in. 10% more for each gear shift down

            consumption_delta = ((double) (MAX_GEARS - current_gear) / 10) * getFuel_consumption();
            fuel_used = (distance * (getFuel_consumption() + consumption_delta) / 100);
            available_fuel -= fuel_used;

            System.out.println("We have driven " + distance + " kilometers");
            System.out.println("Fuel used for this trip " + fuel_used);

        } else System.err.println("Start the car man!");
    }
}
