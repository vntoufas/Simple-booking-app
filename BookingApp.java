
import javax.swing.*;

public class BookingApp {

    
    public static void main(String[] args) {
       
       Data dat=new Data();
       
       dat.AddFlight("Athens","Samos","10/11/2015 5:00 A.M.","10/11/2015 5:43 A.M.",250);
       dat.AddFlight("Athens","Crete","11/11/2015 5:05 A.M.","11/11/2015 5:49 A.M.",150);
       dat.AddFlight("Athens","Salonica","12/11/2015 5:10 A.M.","12/11/2015 5:35 A.M.",50);
        //DepartureAirport,ArrivalAirport,DateOfDeparture,DateOfArrival,Price 
    dat.PrintAvailableFlights();//εκτύπωση για δικό μου check στο output του ΙDE
    
    JFrame application = new JFrame();
    application.setSize(640, 480);
    application.setVisible(true);
    application.setTitle("AirSpotting");
    application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    application.add(dat);
    }//κλείνει η main
}//κλείνει η class
