package com.mojtaba.programming;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Moji on 11-Mar-18.
 * mojtaba.nasehzadeh@gmail.com
 */
public class ArrayUtilTest {

    @Test
    public void flattenByStreams() throws Exception {
        Object[] input = {1, 2, new Object[]{3}, 4};
        Integer[] expected = {1, 2, 3, 4};

        Object[] flatByStreams = ArrayUtil.flattenByStreams(input).toArray();
        assertArrayEquals(flatByStreams, expected);
    }

    @Test
    public void flatten() throws Exception {
        Object[] input = {1, 2, new Object[]{3}, 4};
        Integer[] expected = {1, 2, 3, 4};

        Object[] flat = ArrayUtil.flatten(input).toArray();
        assertArrayEquals(flat, expected);
    }

}