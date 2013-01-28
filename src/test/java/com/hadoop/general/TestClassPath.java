package com.hadoop.general;

import junit.framework.TestCase;

import java.net.URL;
import java.net.URLClassLoader;

/**
 * Created with IntelliJ IDEA.
 * User: vanja
 * Date: 1/26/13
 * Time: 14:15
 * To change this template use File | Settings | File Templates.
 */
public class TestClassPath extends TestCase {
    public void testClassPath() throws Exception {
        System.out.println("Classpath: " + getClasspathString());
    }

    public String getClasspathString() {
        StringBuffer classpath = new StringBuffer();
        ClassLoader applicationClassLoader = this.getClass().getClassLoader();
        if (applicationClassLoader == null) {
            applicationClassLoader = ClassLoader.getSystemClassLoader();
        }
        URL[] urls = ((URLClassLoader) applicationClassLoader).getURLs();
        for (int i = 0; i < urls.length; i++) {
            classpath.append(urls[i].getFile()).append("\r\n");
        }

        return classpath.toString();
    }
}
