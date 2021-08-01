package HomePractice;

import HomePractice.FactoryMethod2.OS;

public class AbstractFactory {

    // Java Program to demonstrate the
// working of Abstract Factory Pattern

    enum CarType
    {
        MICRO, MINI, LUXURY
    }

    abstract  class Car
    {
        Car(CarType model, Location location)
        {
            this.model = model;
            this.location = location;
        }

        abstract void construct();

        CarType model = null;
        Location location = null;

        CarType getModel()
        {
            return model;
        }

        void setModel(CarType model)
        {
            this.model = model;
        }

        Location getLocation()
        {
            return location;
        }

        void setLocation(Location location)
        {
            this.location = location;
        }

        @Override
        public String toString()
        {
            return "CarModel - "+model + " located in "+location;
        }
    }

    class LuxuryCar extends Car
    {
        LuxuryCar(Location location)
        {
            super(CarType.LUXURY, location);
            construct();
        }
        @Override
        protected void construct()
        {
            System.out.println("Connecting to luxury car");
        }
    }

     class MicroCar extends Car
    {
        MicroCar(Location location)
        {
            super(CarType.MICRO, location);
            construct();
        }
        @Override
        protected void construct()
        {
            System.out.println("Connecting to Micro Car ");
        }
    }

     class MiniCar extends Car
    {
        MiniCar(Location location)
        {
            super(CarType.MINI,location );
            construct();
        }

        @Override
        void construct()
        {
            System.out.println("Connecting to Mini car");
        }
    }

    enum Location
    {
        DEFAULT, USA, INDIA
    }

    class INDIACarFactory
    {
          Car buildCar(CarType model)
        {
            Car car = null;
            switch (model)
            {
                case MICRO:
                    car = new MicroCar(Location.INDIA);
                    break;

                case MINI:
                    car = new MiniCar(Location.INDIA);
                    break;

                case LUXURY:
                    car = new LuxuryCar(Location.INDIA);
                    break;

                default:
                    break;

            }
            return car;
        }
    }

    class DefaultCarFactory
    {
        public  Car buildCar(CarType model)
        {
            Car car = null;
            switch (model)
            {
                case MICRO:
                    car = new MicroCar(Location.DEFAULT);
                    break;

                case MINI:
                    car = new MiniCar(Location.DEFAULT);
                    break;

                case LUXURY:
                    car = new LuxuryCar(Location.DEFAULT);
                    break;

                default:
                    break;

            }
            return car;
        }
    }


    class USACarFactory
    {
        public  Car buildCar(CarType model)
        {
            Car car = null;
            switch (model)
            {
                case MICRO:
                    car = new MicroCar(Location.USA);
                    break;

                case MINI:
                    car = new MiniCar(Location.USA);
                    break;

                case LUXURY:
                    car = new LuxuryCar(Location.USA);
                    break;

                default:
                    break;

            }
            return car;
        }
    }



    public class CarFactory
    {
        public CarFactory()
        {

        }
        public Car buildCar(CarType type)
        {
            Car car = null;
            // We can add any GPS Function here which
            // read location property somewhere from configuration
            // and use location specific car factory
            // Currently I'm just using INDIA as Location
            Location location = Location.INDIA;

            switch(location)
            {
                case USA:
                    car = new USACarFactory().buildCar(type);
                    break;

                case INDIA:
                    car = new INDIACarFactory().buildCar(type);
                    break;

                default:
                    car = new DefaultCarFactory().buildCar(type);

            }

            return car;

        }
    }



        public static void main(String[] args)

        {    //calling non-static class object inside static method
            CarFactory obj = new AbstractFactory().new CarFactory();



            System.out.println(obj.buildCar(CarType.MICRO));
            System.out.println(obj.buildCar(CarType.MINI));
            System.out.println(obj.buildCar(CarType.LUXURY));
        }
    }



