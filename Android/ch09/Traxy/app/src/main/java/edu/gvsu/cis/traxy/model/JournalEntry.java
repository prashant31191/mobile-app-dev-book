package edu.gvsu.cis.traxy.model;

/**
 * Created by dulimarh on 8/1/17.
 */

public class JournalEntry {
    String caption, date;
    double lat, lng;
    int type;
    String url, thumbnailUrl;

    public String getCaption() {
        return caption;
    }

    public String getDate() {
        return date;
    }

    public double getLat() {
        return lat;
    }

    public double getLng() {
        return lng;
    }

    public int getType() {
        return type;
    }

    public String getUrl() {
        return url;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }
}