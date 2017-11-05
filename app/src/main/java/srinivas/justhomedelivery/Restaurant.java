package srinivas.justhomedelivery;

/**
 * Created by suri on 05-11-2017.
 */

public class Restaurant {
    Integer imgdrawable;
    String resname, resdes, phone, hours, address,rating;

    Restaurant(int imgdrawable, String resname, String resdes, String rating, String phone, String hours,
               String address) {
        this.rating =rating;
        this.imgdrawable = imgdrawable;
        this.resname = resname;
        this.resdes = resdes;
        this.phone = phone;
        this.hours = hours;
        this.address = address;
    }

    public Integer getImgdrawable() {
        return imgdrawable;
    }

    public String getRating() {
        return rating;
    }

    public String getAddress() {
        return address;
    }

    public String getHours() {
        return hours;
    }

    public String getPhone() {
        return phone;
    }

    public String getResdes() {
        return resdes;
    }

    public String getResname() {
        return resname;
    }
}
