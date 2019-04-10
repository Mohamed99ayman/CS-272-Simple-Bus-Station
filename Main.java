public class Main {


    Fileuse f = new Fileuse();
    String Names[] = new String[20];
    public static void main(String[] args) {



    }
    public Boolean check(String userName,String pass){
        int i=0;
        Names=f.readPassengersFile();
        while (Names[i]!=null){
            if(Names[i++].contains(userName+"-"+pass)){
                return true;
            }
        }
        return false;
    }
}
