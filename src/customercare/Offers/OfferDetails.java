/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customercare.Offers;

/**
 *
 * @author Shahrear
 */
public class OfferDetails {
    private String taka;
    private String mb;
    private String title;
    private String description;
    private byte[] image;
    private int balance;

    public OfferDetails(byte[] image,String taka, String mb, String title, String description) {
        this.taka = taka;
        this.mb = mb;
        this.title = title;
        this.description = description;
        this.image = image;
    }
//    public OfferDetails(int balance)
//    {
//        this.balance=balance;
//    }

    public String getTaka() {
        return taka;
    }

    public String getMb() {
        return mb;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public byte[] getImage() {
        return image;
    }
    
    
}
