package main.java;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("helloworld")
public class HelloWorld {
    
    @GET
    public String showGreeting() {
        return "Hello World!";
    }

    @GET
    @Path("greet/{name}")
    public String greeting(@PathParam("name") String name) {
        return "Hello "+name;
    }

    @GET
    @Path("greetJson/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public Data greetUser(@PathParam("name") String name) {
        Data data = new Data();
        data.setName(name);
        return data;
    }


    @POST
    @Path("post")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public String processUserReq(//@FormParam("name") String name,
                          @FormParam("favNo") int favNo,
                          @FormParam("favColor") String favColor) {
        Data data = new Data();
        //data.setName(name);
        data.setFavNo(favNo);
        data.setFavColor(favColor);
        return data.toString();
    }
    
}
