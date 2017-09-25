package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;


import java.math.BigDecimal;
import io.swagger.model.Error;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2017-09-25T14:14:26.423Z")
public class AdditionsApiServiceImpl extends AdditionsApiService {
      @Override
      public Response additionsGet(Double number1,Double number2,SecurityContext securityContext)
      throws NotFoundException {
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, ""+(number1+number2))).build();
  }
}
