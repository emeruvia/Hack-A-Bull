package fgcu.hackabull;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


/**
 * A simple {@link Fragment} subclass.
 */
public class MapContainerFragment extends Fragment implements OnMapReadyCallback {

    GoogleMap map;

    public MapContainerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_map_container, container, false);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        SupportMapFragment mapFragment = (SupportMapFragment)
                getChildFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map = googleMap;
        map.setMapType(GoogleMap.MAP_TYPE_HYBRID);
        //TODO UPdate this part with the locations of the different places
        LatLng usf = new LatLng(28.0587713, -82.4154902);
        LatLng temp1 = new LatLng(28.0596917, -82.4159253);
        LatLng temp2 = new LatLng(28.0613838,-82.4201508);
        LatLng temp3 = new LatLng(28.0546556, -82.413537);
        LatLng temp4 = new LatLng(28.0654595, -82.4096904);
        LatLng temp5 = new LatLng(28.0631987, -82.4113806);
//        MarkerOptions options = new MarkerOptions();
//        options.position(usf).title("Current Position");
//        map.addMarker(options);
//        map.moveCamera(CameraUpdateFactory.newLatLngZoom(usf, 20 ));
        map.addMarker(new MarkerOptions().position(usf).title("Current Location").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        map.addMarker(new MarkerOptions().position(temp1).title("Handyman Location").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        map.addMarker(new MarkerOptions().position(temp2).title("Handyman Location").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        map.addMarker(new MarkerOptions().position(temp3).title("Needs Assistance").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        map.addMarker(new MarkerOptions().position(temp4).title("Needs Assitance").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(usf, 15));
    }
}
