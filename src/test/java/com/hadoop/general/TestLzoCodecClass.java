package com.hadoop.general;

import com.hadoop.compression.lzo.LzoCodec;
import com.hadoop.compression.lzo.LzopCodec;
import junit.framework.TestCase;

/**
 * Created with IntelliJ IDEA.
 * User: vanja
 * Date: 1/26/13
 * Time: 14:15
 * To change this template use File | Settings | File Templates.
 */
public class TestLzoCodecClass extends TestCase {
    public void testClassPath() throws Exception {
        LzoCodec codec = new LzopCodec();
    }
}
