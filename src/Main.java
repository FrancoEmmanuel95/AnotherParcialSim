import java.util.ArrayList;
import java.util.List;
import Model.*;
import Service.AirportService;
import Service.PlanesService;

public class Main {
    public static void main(String[] args) {
        List<Airport> airports = new ArrayList<>();
        List<Airport> filteredAirports = new ArrayList<>();
        AirportService aService = new AirportService();
        GenericClass GClass = new GenericClass();
        PlanesService PService = new PlanesService();

        airports = aService.openFile("archi.json");
        filteredAirports=aService.filterCapacity(31, airports);
        GClass= PService.tagsPlanes(filteredAirports);
        GClass.showList();
    }
}