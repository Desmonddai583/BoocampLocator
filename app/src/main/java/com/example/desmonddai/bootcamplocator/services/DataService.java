package com.example.desmonddai.bootcamplocator.services;

import com.example.desmonddai.bootcamplocator.model.Devslopes;

import java.util.ArrayList;

/**
 * Created by desmonddai on 7/8/16.
 */
public class DataService {
    private static DataService instance = new DataService();

    public static DataService getInstance() {
        return instance;
    }

    private DataService() {
    }

    public ArrayList<Devslopes> getBootcampLocationsWithin10MilesOfZip(int zipcode) {
        //pretending we are downloading data from the server

        ArrayList<Devslopes> list = new ArrayList<>();
        list.add(new Devslopes(40.7088f,-73.8448f,"Downtown","762 Higuera Street, San Luis Obispo, CA 93401","slo"));
        list.add(new Devslopes(40.7087f,-73.8515f,"On The Campus","1 Grand Ave, San Luis Obispo, CA 93401","slo"));
        list.add(new Devslopes(40.7056f,-73.8487f,"East Side Tower","2494 Victoria Ave, San Luis Obispo, CA 93401","slo"));
        return list;
    }
}
