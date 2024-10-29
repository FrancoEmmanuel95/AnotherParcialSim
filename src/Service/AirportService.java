package Service;

import Model.Airport;
import Model.InsufficientCapacityException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AirportService {
    ObjectMapper mapper = new ObjectMapper();
    List<Airport> airports = new ArrayList<>();

    public List openFile(String filePath){

        try{
            airports = mapper.readValue(new File(filePath), new TypeReference<List<Airport>>(){});
        }catch(IOException e){
            e.printStackTrace();
        }
        return airports;
    }
    public List filterCapacity(Integer capMin,List<Airport> airports){
        List<Airport> filteredList = new ArrayList<>();

        for ( Airport a:airports){
            try{
                if(a.getCapacidad()>capMin){
                    filteredList.add(a);
                }
                else{
                    throw new InsufficientCapacityException(a.getCapacidad());
                }

            }catch(InsufficientCapacityException e){
                System.out.println("la capacidad del aeropuerto es insuficiente : ("+a.getCapacidad()+").");
            }
        }
        return filteredList;
    }
}
