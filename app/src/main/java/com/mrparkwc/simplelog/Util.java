package com.mrparkwc.simplelog;

/**
 * Created by ParkWoocheol on 2017. 7. 31..
 */

public class Util {

    /**
     * InComplete Function.
     *
     * @param object
     * @return
     */
    public static boolean isValidPrintDataType(Object object) {
        return object instanceof String || object instanceof Boolean || object instanceof Integer || object instanceof Double
                || object instanceof Long || object instanceof Float || object instanceof Short || object instanceof Character;
    }

}
