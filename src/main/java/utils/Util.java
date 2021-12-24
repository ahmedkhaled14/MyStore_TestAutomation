package utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {
    private static final String DataFormat = System.getProperty("DataFormat");

    public static String GenerateCurrentDateAndTime() {
        return new SimpleDateFormat(DataFormat).format(new Date());
    }

}
