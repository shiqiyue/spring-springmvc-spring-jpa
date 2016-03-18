package cn.wuwenyao.test.hhhh;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.jar.JarFile;

import org.apache.shiro.codec.Hex;
import org.slf4j.spi.LocationAwareLogger;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException, URISyntaxException
    {
    	
    	final URL loc = LocationAwareLogger.class.getProtectionDomain().getCodeSource().getLocation();
        System. out.println( "Found jar file at " + loc );
         final JarFile jarFile = new JarFile( new File( loc.toURI()));
        System. out.println( "The version is " +
         jarFile.getManifest().getMainAttributes().getValue( "Specification-Version"));

    }
}
