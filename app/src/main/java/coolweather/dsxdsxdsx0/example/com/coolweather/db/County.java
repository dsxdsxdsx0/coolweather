package coolweather.dsxdsxdsx0.example.com.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by dsxdsxdsx0 on 2017/1/7.
 */
public class County extends DataSupport {

    private int id;

    private String countyName;//县名

    private String weatherId;//记录县所对应的天气id

    private String cityId;//记录当前县所属市的id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }
}
