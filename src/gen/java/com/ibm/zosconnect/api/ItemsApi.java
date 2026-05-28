package com.ibm.zosconnect.api;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.core.UriInfo;


import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.validation.constraints.*;
import javax.validation.Valid;

import javax.annotation.security.RolesAllowed;

import org.eclipse.microprofile.metrics.*;
import org.eclipse.microprofile.metrics.annotation.*;

@Path("/items")
@ApplicationScoped

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-05-28T22:00:29.837Z[UTC]")
public class ItemsApi {

    @Context
    private Application application;

    @Context
    private UriInfo uriInfo;

    @Context
    private HttpHeaders headers;

    @Context
    private SecurityContext securityContext;

    @Inject
    com.ibm.zosconnect.engine.Operation operation;

    @Inject
    MetricRegistry metricRegistry;

    @GET
    @Produces({ "application/json" })
    
    @SimplyTimed(name = "itemsGetTime", tags = { "method=GET"}, absolute = true)
    @Counted(name = "itemsGetCount", absolute = true)
    public Response itemsGet(@Context HttpServletRequest request, String body) {

        com.ibm.zosconnect.engine.OperationRequest opRequest = new com.ibm.zosconnect.engine.OperationRequest(request,
                                                                                                body,
                                                                                                headers,
                                                                                                uriInfo,
                                                                                                securityContext.getUserPrincipal(),
                                                                                                Thread.currentThread().getContextClassLoader(),
                                                                                                "/items");

        opRequest.setMetricRegistry(metricRegistry);

        com.ibm.zosconnect.engine.OperationResponse opResponse = operation.processOperation(opRequest);

        return Response.status(opResponse.getResponseStatus())
                        .entity(opResponse.getBean())
                        .replaceAll(opResponse.getHeaders())
                        .cookie(opResponse.getCookiesArray())
                        .build();
    }


    @DELETE
    @Path("/{itemId}")
    @Produces({ "application/json" })
    
    @SimplyTimed(name = "itemsItemIdDeleteTime", tags = { "method=DELETE"}, absolute = true)
    @Counted(name = "itemsItemIdDeleteCount", absolute = true)
    public Response itemsItemIdDelete(@Context HttpServletRequest request, String body) {

        com.ibm.zosconnect.engine.OperationRequest opRequest = new com.ibm.zosconnect.engine.OperationRequest(request,
                                                                                                body,
                                                                                                headers,
                                                                                                uriInfo,
                                                                                                securityContext.getUserPrincipal(),
                                                                                                Thread.currentThread().getContextClassLoader(),
                                                                                                "/items/{itemId}");

        opRequest.setMetricRegistry(metricRegistry);

        com.ibm.zosconnect.engine.OperationResponse opResponse = operation.processOperation(opRequest);

        return Response.status(opResponse.getResponseStatus())
                        .entity(opResponse.getBean())
                        .replaceAll(opResponse.getHeaders())
                        .cookie(opResponse.getCookiesArray())
                        .build();
    }


    @GET
    @Path("/{itemId}")
    @Produces({ "application/json" })
    
    @SimplyTimed(name = "itemsItemIdGetTime", tags = { "method=GET"}, absolute = true)
    @Counted(name = "itemsItemIdGetCount", absolute = true)
    public Response itemsItemIdGet(@Context HttpServletRequest request, String body) {

        com.ibm.zosconnect.engine.OperationRequest opRequest = new com.ibm.zosconnect.engine.OperationRequest(request,
                                                                                                body,
                                                                                                headers,
                                                                                                uriInfo,
                                                                                                securityContext.getUserPrincipal(),
                                                                                                Thread.currentThread().getContextClassLoader(),
                                                                                                "/items/{itemId}");

        opRequest.setMetricRegistry(metricRegistry);

        com.ibm.zosconnect.engine.OperationResponse opResponse = operation.processOperation(opRequest);

        return Response.status(opResponse.getResponseStatus())
                        .entity(opResponse.getBean())
                        .replaceAll(opResponse.getHeaders())
                        .cookie(opResponse.getCookiesArray())
                        .build();
    }


    @PATCH
    @Path("/{itemId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    
    @SimplyTimed(name = "itemsItemIdPatchTime", tags = { "method=PATCH"}, absolute = true)
    @Counted(name = "itemsItemIdPatchCount", absolute = true)
    public Response itemsItemIdPatch(@Context HttpServletRequest request, String body) {

        com.ibm.zosconnect.engine.OperationRequest opRequest = new com.ibm.zosconnect.engine.OperationRequest(request,
                                                                                                body,
                                                                                                headers,
                                                                                                uriInfo,
                                                                                                securityContext.getUserPrincipal(),
                                                                                                Thread.currentThread().getContextClassLoader(),
                                                                                                "/items/{itemId}");

        opRequest.setMetricRegistry(metricRegistry);

        com.ibm.zosconnect.engine.OperationResponse opResponse = operation.processOperation(opRequest);

        return Response.status(opResponse.getResponseStatus())
                        .entity(opResponse.getBean())
                        .replaceAll(opResponse.getHeaders())
                        .cookie(opResponse.getCookiesArray())
                        .build();
    }


    @PUT
    @Path("/{itemId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    
    @SimplyTimed(name = "itemsItemIdPutTime", tags = { "method=PUT"}, absolute = true)
    @Counted(name = "itemsItemIdPutCount", absolute = true)
    public Response itemsItemIdPut(@Context HttpServletRequest request, String body) {

        com.ibm.zosconnect.engine.OperationRequest opRequest = new com.ibm.zosconnect.engine.OperationRequest(request,
                                                                                                body,
                                                                                                headers,
                                                                                                uriInfo,
                                                                                                securityContext.getUserPrincipal(),
                                                                                                Thread.currentThread().getContextClassLoader(),
                                                                                                "/items/{itemId}");

        opRequest.setMetricRegistry(metricRegistry);

        com.ibm.zosconnect.engine.OperationResponse opResponse = operation.processOperation(opRequest);

        return Response.status(opResponse.getResponseStatus())
                        .entity(opResponse.getBean())
                        .replaceAll(opResponse.getHeaders())
                        .cookie(opResponse.getCookiesArray())
                        .build();
    }


    @POST
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    
    @SimplyTimed(name = "itemsPostTime", tags = { "method=POST"}, absolute = true)
    @Counted(name = "itemsPostCount", absolute = true)
    public Response itemsPost(@Context HttpServletRequest request, String body) {

        com.ibm.zosconnect.engine.OperationRequest opRequest = new com.ibm.zosconnect.engine.OperationRequest(request,
                                                                                                body,
                                                                                                headers,
                                                                                                uriInfo,
                                                                                                securityContext.getUserPrincipal(),
                                                                                                Thread.currentThread().getContextClassLoader(),
                                                                                                "/items");

        opRequest.setMetricRegistry(metricRegistry);

        com.ibm.zosconnect.engine.OperationResponse opResponse = operation.processOperation(opRequest);

        return Response.status(opResponse.getResponseStatus())
                        .entity(opResponse.getBean())
                        .replaceAll(opResponse.getHeaders())
                        .cookie(opResponse.getCookiesArray())
                        .build();
    }

}
