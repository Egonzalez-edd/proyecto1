/*
 * Servicio encargdo de consultar, eliminar y dar de lata clientes.
 * Contiene los recuersos del api.
 * Eduardo Gonzalez.
 */
package practica.clientes.servicios;

import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import practica.clientes.dao.ClienteDAO;
import practica.clientes.modelo.Cliente;

/**
 *
 * @author dais_
 */
@Path ("clientes")
public class ClienteServicio 
{
    private static List<Cliente> lista = ClienteDAO.getCliente();
    
    @GET
    @Produces (MediaType.APPLICATION_JSON)
  public Response getClientes ()
  {
   return Response.ok(lista).build();
  }
  
  @DELETE
  @Path ("/{id}")
  @Produces (MediaType.APPLICATION_JSON)
  public Response borrarCliente(@PathParam("id") int id)
  {
    Cliente cliente = new Cliente();
    cliente.setId(id);
    if (lista.contains(cliente))
  {
    lista.remove(cliente);
            return Response.ok().build();
    }
        return Response.status(Response.Status.NOT_FOUND).build();
  }
  
  @POST
  @Produces (MediaType.APPLICATION_JSON)
  @Consumes (MediaType.APPLICATION_JSON)
  public Response guardarCliente(Cliente cliente)
  {
      lista.add(cliente);
      return Response.status(Response.Status.CREATED).entity(cliente).build();

    }
       
  }


