package id.ac.polinema.quiz2;

public class BikeRide extends Ride{

    public CarRide(String rideId, Passenger passenger, double distanceKm){
         super(rideId, passenger, distanceKm);
    }
    public double calculateFare(){
        return getDistanceKm() * 2500;
    }
}
