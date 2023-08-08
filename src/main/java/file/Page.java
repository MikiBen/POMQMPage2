package file;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.util.List;

@Getter
public class Page {
    private @JsonProperty("pages") List<URLModel> urlModelList;

    public Page (List<URLModel> urlModelList){
    this.urlModelList = urlModelList;
    }

    public Page(){}

}
