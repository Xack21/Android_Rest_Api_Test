
package com.example.xack.recyclerview;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Book {

    @SerializedName("ID")
    @Expose
    private String iD;
    @SerializedName("Image")
    @Expose
    private String image;
    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("ISBN")
    @Expose
    private String iSBN;
    @SerializedName("Price")
    @Expose
    private String price;
    @SerializedName("Edition")
    @Expose
    private String edition;

    public String getID() {
        return iD;
    }

    public void setID(String iD) {
        this.iD = iD;
    }

    public String getImage() {

        String imgurl = "http://xack-io.000webhostapp.com/";

       imgurl = imgurl.concat(image);

        return imgurl;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getISBN() {
        String isb = "ISBN: ";
        isb = isb.concat(iSBN);
        return isb;
    }

    public void setISBN(String iSBN) {
        this.iSBN = iSBN;
    }

    public String getPrice() {
        String pr = "Price: ";
        pr = pr.concat(price);
        return pr;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getEdition() {
        String ed = "Edition: ";
        ed = ed.concat(edition);
        return ed;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

}
