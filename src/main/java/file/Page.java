package file;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Page {
    private @JsonProperty("pages") List<URLModel> urlModelList;

    public List<URLModel> getUrlModelList() {
        return urlModelList;
    }

    public Page (List<URLModel> urlModelList){
    this.urlModelList = urlModelList;
    }

    public Page(){

    }
}
