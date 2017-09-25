package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.AdditionsApiService;
import io.swagger.api.factories.AdditionsApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import java.math.BigDecimal;
import io.swagger.model.Error;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;

@Path("/additions")

@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the additions API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2017-09-25T14:14:26.423Z")
public class AdditionsApi  {
   private final AdditionsApiService delegate = AdditionsApiServiceFactory.getAdditionsApi();

    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Number", notes = "Add it, you will like it. ", response = BigDecimal.class, tags={ "Numbers", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Added number", response = BigDecimal.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = BigDecimal.class) })
    public Response additionsGet( @NotNull  @QueryParam("number1") Double number1, @NotNull  @QueryParam("number2") Double number2,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.additionsGet(number1,number2,securityContext);
    }
}
