package pojo;


import lombok.Data;

@Data
public class AppWx {

    /*
    * 应用ID
    * */
    private String appId;

    /*
    * 应用名称
    * */
    private String appName;

    public AppWx(){}

    public AppWx(String appId, String appName) {
        this.appId = appId;
        this.appName = appName;
    }
}
