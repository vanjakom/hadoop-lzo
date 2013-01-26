package com.hadoop.general;

import junit.framework.TestCase;

/**
 * Created with IntelliJ IDEA.
 * User: vanja
 * Date: 1/26/13
 * Time: 14:15
 * To change this template use File | Settings | File Templates.
 */
public class TestLibraryPathSet extends TestCase {
    public void testLibraryPathSet() throws Exception {
        String libraryPath = System.getProperty("java.library.path");

        System.out.println("Library path: " + libraryPath);

        assertNotNull(libraryPath);
        assertNotSame(libraryPath, "");
    }
}
