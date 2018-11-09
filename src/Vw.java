public abstract class Vw extends Car {


    private final int default_tyre_size = 17;

    public void changeTyreSize(int size) {
        this.tyre_size = size;
    }


    @Override
    public void drive(double distance) {

        if (vehicle_is_started) {

            //consumption affected only by tyre size by 5% for each increment above standard size

            consumption_delta = ((double) (tyre_size - default_tyre_size) / 20) * getFuel_consumption();
            fuel_used = (distance * (getFuel_consumption() + consumption_delta) / 100);
            setAvailable_fuel(getAvailableFuel() - fuel_used);

            System.out.println("We have driven " + distance + " kilometers");
            System.out.println("Fuel used for this trip " + fuel_used);

        } else System.err.println("Start the car man!");
    }


}
