import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Trip {

    private String source;
    private String destination;
    private int numOfTickets;
    private boolean internal;
    private short flavor;
    private int[] date = new int[3];
    private int index;
    public Trip(String s){
        StringTokenizer st = new StringTokenizer(s,"-");
        setSource(st.toString());
        st.nextToken();
        setDestination(st.toString());
        st.nextToken();
        setNumOfTickets(Integer.parseInt(st.toString()));
        st.nextToken();
        setInternal(st.toString()=="1"?true:false);
        st.nextToken();
        setFlavor(Short.parseShort(st.toString()));
        int arr[]=new int[3];
        arr[0]=Integer.parseInt(st.nextToken());
        arr[1]=Integer.parseInt(st.nextToken());
        arr[2]=Integer.parseInt(st.nextToken());
        setDate(arr);
        st.nextToken();
        setIndex(Integer.parseInt(st.toString()));
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }


    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public int getNumOfTickets() {
        return numOfTickets;
    }

    public void setNumOfTickets(int numOfTickets) {
        this.numOfTickets = numOfTickets;
    }

    public boolean isInternal() {
        return internal;
    }

    public void setInternal(boolean internal) {
        this.internal = internal;
    }

    public short getFlavor() {
        return flavor;
    }

    public void setFlavor(short flavor) {
        this.flavor = flavor;
    }

    public int[] getDate() {
        return date;
    }

    public void setDate(int[] date) {
        this.date = date;
    }
}
