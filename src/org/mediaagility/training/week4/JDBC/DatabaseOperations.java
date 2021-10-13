package org.mediaagility.training.week4.JDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

public class DatabaseOperations {
    private static Map<Integer, ModelCity> cityData = new HashMap<>();

    public static void main(String[] args) {
        DatabaseConnector connection = DatabaseConnector.getInstance();
        String query = "select * from city";
        Connection conn = connection.getConnector();
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                setCityData(rs.getInt(1), rs.getString(2),
                        rs.getString(3),rs.getString(4),
                        Long.parseLong(String.valueOf(rs.getInt(5))));
            }

            for(Map.Entry<Integer, ModelCity> entry : cityData.entrySet()){
                String value = entry.getValue().getCityName()+" "+entry.getValue().getCountryCode()+
                        " "+entry.getValue().getDistrictName()+" "+entry.getValue().getCityPopulation();
                System.out.println("Key = "+entry.getKey() +" ----> Value = "+value);
            }

            System.out.println(cityData.size());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            try {
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

    private static void setCityData(int cityID, String cityName,String countryCode,
                                    String districtName, long cityPopulation){
        if(!cityData.containsKey(cityID)){
            ModelCity modelCity = new ModelCity();
            modelCity.setCityName(cityName);
            modelCity.setCountryCode(countryCode);
            modelCity.setDistrictName(districtName);
            modelCity.setCityPopulation(cityPopulation);

            cityData.put(cityID,modelCity);
        }
    }
}
