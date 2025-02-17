/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author doans
 */
public class Service {

    Setting setting;
    private int service_id;
    private String title;
    private double fee;
    private String description;
    private String img;
    private boolean status;
    RateStar ratestar;

    public Service() {
    }

    public Service(String img, String description) {
        this.img = img;
        this.description = description;
    }

    public RateStar getRatestar() {
        return ratestar;
    }

    public void setRatestar(RateStar ratestar) {
        this.ratestar = ratestar;
    }

    public Service(Setting setting, int service_id, String title, double fee, String description, String img) {
        this.setting = setting;
        this.service_id = service_id;
        this.title = title;
        this.fee = fee;
        this.description = description;
        this.img = img;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Setting getSetting() {
        return setting;
    }

    public void setSettingdetails(Setting setting) {
        this.setting = setting;
    }

    public int getService_id() {
        return service_id;
    }

    public void setService_id(int service_id) {
        this.service_id = service_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

}
