package Service;

import Model.Airport;
import Model.GenericClass;
import Model.Planes;
import Model.Tag;

import java.util.List;

public class PlanesService {

public GenericClass tagsPlanes(List<Airport> airports){
    GenericClass planesTags = new GenericClass();

    for(Airport airport : airports){
        for(String tag:airport.getEtiquetas()){
            planesTags.add(new Tag (tag));
        }
        for(Planes plane:airport.getAviones()){
            planesTags.add(plane);
        }
    }
    return planesTags;
}
}
