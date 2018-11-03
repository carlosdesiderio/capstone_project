package uk.me.desiderio.shiftt.data.location;

import android.Manifest;

import uk.me.desiderio.shiftt.utils.PermissionManager;

/**
 * Stores list of permission to be handle by the {@link PermissionManager}
 */

public class LocationPermissionRequest {

    public static final String[] REQUIRED_PERMISIONS = {
            Manifest.permission.ACCESS_FINE_LOCATION,
            Manifest.permission.ACCESS_COARSE_LOCATION };
    public static final int LOCATION_REQUEST_CODE = 55;
}
