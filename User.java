import java.util.ArrayList;
import java.util.List;

public abstract class User {

    private String userName;
    private String password;
    private String firstName;
    private String lasttName;
    List <Trip> trips=new ArrayList<Trip>();
    Fileuse f=new Fileuse();

    public void setTrips() {
            String x[]=new String[20];
            int r=0;
            while (x[r]!=null){
                trips.add(new Trip(x[r]));
            }
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLasttName() {
        return lasttName;
    }

    public void setLasttName(String lasttName) {
        this.lasttName = lasttName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int[] getDate() {
        return date;
    }

    public void setDate(int[] date) {
        this.date = date;
    }

    private int age;
    private boolean gender;
    private int date[]=new int[3];

    public void ViewAllTrips(List trips){

    }
}
