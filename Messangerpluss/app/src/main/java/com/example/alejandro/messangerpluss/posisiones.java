package com.example.alejandro.messangerpluss;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;
/**
 * Created by BrendaMorales on 03/08/2016.
 */
public class posisiones {
    public static final LatLng manzanillo= new LatLng(19.2499700,-103.7271400);
    public static final PolylineOptions POLILINEA = new PolylineOptions()
            .add(new LatLng(19.1326808726334,-104.34267282485962))
            .add(new LatLng(41.40691, 2.16864))
            .add(new LatLng(41.40364, 2.16437));
}
    private void drawPolilyne(PolylineOptions options){
        Polyline polyline = mMap.addPolyline(options);
    }