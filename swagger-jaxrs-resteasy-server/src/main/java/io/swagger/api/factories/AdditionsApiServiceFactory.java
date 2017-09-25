package io.swagger.api.factories;

import io.swagger.api.AdditionsApiService;
import io.swagger.api.impl.AdditionsApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2017-09-25T14:14:26.423Z")
public class AdditionsApiServiceFactory {

   private final static AdditionsApiService service = new AdditionsApiServiceImpl();

   public static AdditionsApiService getAdditionsApi()
   {
      return service;
   }
}
