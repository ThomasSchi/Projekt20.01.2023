import java.util.ArrayList;
public class Lagerbestand {
    private int Sollbestand;
    private int Istbestand;
        ArrayList<Autos> availableCars;
        ArrayList<Autos> rentedCars;

        public Lagerbestand() {
            availableCars = new ArrayList<>();
            rentedCars = new ArrayList<>();
        }

        public void addCar(Autos car) {
            if(car.getVerfuegbarkeit()==true){
                availableCars.add(car);
            }else{
                rentedCars.add(car);
            }
        }

        public void removeCar(ArrayList<Autos> cars, Autos auto) {
            for (Autos car:cars
                 ) {
                if (auto.getId() == car.getId()) {
                    cars.remove(car);
                    break;
                }
            }
        }

        public ArrayList<Autos> checkAvailability() {
            return availableCars;
        }

        public ArrayList<Autos> checkRentedCars() {
            return rentedCars;
        }


}
