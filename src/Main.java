public class Main {

    public static void main(String[] args) {


// Car car = new Car();
// Car car = new Dacia(27, "oiqe0934hkkadsn");

        Car car = new Logan(27, "oiqe0934hkkadsn");

        car.start();

        car.shiftGear(1);

        car.drive(150);// drives 150 KMs

        car.shiftGear(2);

//        car.drive(20);
//
//        car.shiftGear(3);
//
//        car.drive(15);
//
//        car.shiftGear(4);
//
//        car.drive(15);
//
//        car.shiftGear(4);
//
//        car.drive(0.5);
//
//        car.shiftGear(5);
//
//        car.drive(10);
//
//        car.shiftGear(4);
//
//        car.drive(0.5);
//
//        car.shiftGear(3);
//
//        car.drive(0.1);
//
        car.stop();

        System.out.println("Available fuel is: " + car.getAvailableFuel());

        System.out.println("Factory fuel consumption:: " + car.getFuel_consumption());

        Duster dusty = new Duster(70, "00epava");

        dusty.changeTyreSize(22);


        Vehicles beetle = new Golf(50, "meisgolf");

        beetle.changeTyreSize(22);

        beetle.start();

        beetle.drive(200);

        beetle.stop();

        Car car2 = (Car) beetle; // not sure why this is working

        System.out.println("Golf available fuel: " + car2.getAvailableFuel());

        System.out.println("Golf fuel consumption " + car2.getFuel_consumption());


    }

}
