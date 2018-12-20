package uk.me.desiderio.shiftt.ui.model;

import com.google.android.gms.maps.model.LatLng;

import java.util.List;

import uk.me.desiderio.shiftt.ui.neighbourhood.ShifttMapFragment;

/**
 * View data object to be shown at the {@link ShifttMapFragment}
 */
public class MapItem {

    public String name;
    public List<LatLng> coordinates;

    public MapItem(String name, List<LatLng> coordinates) {
        this.name = name;
        this.coordinates = coordinates;
    }
}
