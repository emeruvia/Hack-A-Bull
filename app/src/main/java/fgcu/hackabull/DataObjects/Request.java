package fgcu.hackabull.DataObjects;

/**
 * Created by jeffr on 3/25/2018.
 */

public class Request {
    private String typeOfHelp;
    private String date;
    private String time;
    private String location;

    public Request(String typeOfHelp,String date, String time, String location){
        this.typeOfHelp = typeOfHelp;
        this.date = date;
        this.time= time;
        this.location = location;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTypeOfHelp() {
        return typeOfHelp;
    }

    public void setTypeOfHelp(String typeOfHelp) {
        this.typeOfHelp = typeOfHelp;
    }
}
