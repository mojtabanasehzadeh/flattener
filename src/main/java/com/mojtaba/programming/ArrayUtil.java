package com.mojtaba.programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Moji on 11-Mar-18.
 * mojtaba.nasehzadeh@gmail.com
 */
public class ArrayUtil {

    /**
     * Flattens an array of arbitrarily nested arrays of integers into a flat array of
     * integers using java 8.
     *
     * @param array
     * @return
     */
    public static Stream<Object> flattenByStreams(Object[] array) {
        return Arrays.stream(array)
                .flatMap(o -> o instanceof Object[] ? flattenByStreams((Object[]) o) : Stream.of(o));
    }

    /**
     * Flattens an array of arbitrarily nested arrays of integers into a flat array of
     * integers. e.g. [[1,2,[3]],4] -> [1,2,3,4].
     *
     * @param array
     * @return
     */
    public static List<Integer> flatten(Object[] array) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] instanceof Integer)
                result.add((Integer) array[i]);
            if (array[i] instanceof Object[])
                result.addAll(flatten((Object[]) array[i]));
        }
        return result;
    }


}
