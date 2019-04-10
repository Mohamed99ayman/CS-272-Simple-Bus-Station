import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
public class Passenger extends User {

    List<Integer>ticketsindex=new ArrayList<Integer>();


    public Passenger(String s){
        StringTokenizer st = new StringTokenizer(s,"-");
        st.nextToken();
        st.nextToken();
        st.nextToken();
        setFirstName(st.toString());
        st.nextToken();
        setLasttName(st.toString());
        st.nextToken();
        setGender(st.toString()=="1"?true:false);
        st.nextToken();
        setAge(Integer.parseInt(st.toString()));
        while (st.hasMoreElements()){
            ticketsindex.add(Integer.parseInt(st.toString()));
        }
    }
    List<Integer>bookedtrips=new ArrayList<Integer>();


   public void BookTrip(int index){
    bookedtrips.add(index);
   }
   public void BuyTicket(int index){
    ticketsindex.add(index);
   }

    public void CancelBookedTicket( int index){
    bookedtrips.remove(new Integer(index));
    }

    public List<Integer> ViewBookedTrips( ){
        return bookedtrips;
    }

    public List<Integer> ViewTickets( ){
       return ticketsindex;
    }

}
