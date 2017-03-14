public class Flight {
 
    private String DepartureAirport;
    private String ArrivalAirport;
    private String DateOfDeparture;
    private String DateOfArrival;
    private int Price;

    public Flight(){
    DepartureAirport=null;
    ArrivalAirport=null;
    DateOfDeparture=null;
    DateOfArrival=null;
    Price=0;}
    
    public Flight(String DepartureAirport,String ArrivalAirport,String DateOfDeparture,String DateOfArrival,int Price ){
    this.DateOfDeparture=DateOfDeparture;
    this.DateOfArrival=DateOfArrival;
    this.DepartureAirport=DepartureAirport;
    this.ArrivalAirport=ArrivalAirport;
    this.Price=Price;}
    
    public void PrintFlight(){System.out.println(DepartureAirport+" "+ArrivalAirport+" "+DateOfDeparture+" "+DateOfArrival+" "+Price+" ");}
    
    public void setDepartureAirport(String DepartureAirport) {this.DepartureAirport = DepartureAirport;}
    public void setArrivalAirport(String ArrivalAirport) {this.ArrivalAirport = ArrivalAirport;}
    public void setDateOfDeparture(String DateOfDeparture) {this.DateOfDeparture = DateOfDeparture;}
    public void setDateOfArrival(String DateOfArrival) {this.DateOfArrival = DateOfArrival;}
    public void setPrice(int Price) {this.Price = Price;}
    
    public String getDepartureAirport() {return DepartureAirport;}
    public String getArrivalAirport() {return ArrivalAirport;}
    public String getDateOfDeparture() { return DateOfDeparture;}
    public String getDateOfArrival() {return DateOfArrival;}
    public int getPrice() {return Price;}
    
    
}
