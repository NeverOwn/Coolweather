package com.coolweather.android.gosn;

/**
 * Created by dell- on 2018/4/24.
 */
import com.google.gson.annotations.SerializedName;
public class Forecast {
    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature {

        public String max;

        public String min;

    }

    public class More {

        @SerializedName("txt_d")
        public String info;

    }
}
