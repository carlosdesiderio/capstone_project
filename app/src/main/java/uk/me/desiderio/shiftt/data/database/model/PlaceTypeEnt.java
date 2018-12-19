package uk.me.desiderio.shiftt.data.database.model;

import com.twitter.sdk.android.core.models.Place;

import androidx.room.Ignore;
import uk.me.desiderio.shiftt.data.network.model.PlaceType;

/**
 * Room entity class for the {@link PlaceType} Network data object
 */
public class PlaceTypeEnt {

    public int code;
    public String name;

    public PlaceTypeEnt(int code, String name) {
        this.code = code;
        this.name = name;
    }

    @Ignore
    public PlaceTypeEnt(PlaceType placeType) {
        this.code = placeType.code;
        this.name = placeType.name;
    }

    @Ignore
    public PlaceType getSeed() {
        return new PlaceType(code, name);
    }
}
