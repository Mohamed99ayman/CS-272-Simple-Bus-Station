import java.util.List;
import java.util.ArrayList;

public class Manager extends User {

    void addTrips(String tr){
    trips.add(new Trip(tr));
    }

    void RemoveTrip(List trips,int index){
    trips.remove(index);
    }

    void assignDrivers(){


    }

}
