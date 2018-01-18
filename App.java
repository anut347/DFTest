package main.java.DFTest;

import org.wildfly.swarm.Swarm;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.ClassLoaderAsset;
import org.wildfly.swarm.jaxrs.*;

/**
 * Hello world!
 *
 */
public class App  {
    public static void main( String[] args ) throws Exception {
    //public static void main( String[] args ) {
        Swarm swarm = new Swarm();
 
        JAXRSArchive deployment = ShrinkWrap.create(JAXRSArchive.class);
        // WARArchive deployment = ShrinkWrap.create( WARArchive.class );
        
        // Add Beans and other Java classes
        deployment.addClass(HelloWorld.class);
 
        // Add Web resources
        deployment.addAsWebResource(new ClassLoaderAsset("index.xhtml", App.class.getClassLoader()), "index.xhtml");
        deployment.addAsWebInfResource(new ClassLoaderAsset("WEB-INF/web.xml", App.class.getClassLoader()), "web.xml");
        //deployment.addAsWebResource(new ClassLoaderAsset("index.html", Application.class.getClassLoader()), "index.html");
        //deployment.addAsWebInfResource(new ClassLoaderAsset("WEB-INF/template.xhtml", Main.class.getClassLoader()), "template.xhtml");        
        
        swarm.start();
        swarm.deploy(deployment);
    }
}
