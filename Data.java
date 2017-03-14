import java.util.ArrayList;
import java.awt.*;
import javax.swing.*;
public class Data extends JPanel{
    
    private ArrayList <Flight> Flights=new ArrayList();//Δημιουργια λίστας τύπου Flight

    Data() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void AddFlight(String DepartureAirport,String ArrivalAirport,String DateOfDeparture,String DateOfArrival,int Price ){
    Flight flight=new Flight(DepartureAirport,ArrivalAirport,DateOfDeparture,DateOfArrival,Price);
      Flights.add(flight);   
    }//κλείνει η AddFligt . 
    
    
    

    public Data (Graphics g){
        for (int i=0;i<Flights.size();i++){
    g.drawString(Flights.get(i).getDepartureAirport(), 50,50+i*10);
        }
    }
    
    public void PrintAvailableFlights(){//εκτυπωνει ολα τα βιβλια της βιβλιοθηκης
for (int i=0;i<Flights.size();i++)
Flights.get(i).PrintFlight();
    }//κλείνει την PrintAvailableFlights
    
    
}//κλείνει την Data

