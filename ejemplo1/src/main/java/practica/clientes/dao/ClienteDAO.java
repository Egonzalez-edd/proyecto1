/* ESTA CLASE sera nuestra capa de extraccion VA A BUSCAR A LOS CLIENTES EN UNA Lista
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.clientes.dao;

import java.util.ArrayList;
import java.util.List;
import practica.clientes.modelo.Cliente;

/**
 *
 * @author dais_
 */
public class ClienteDAO 
{
    public static List<Cliente> getCliente()
    {
        List<Cliente> lista = new ArrayList();
        Cliente cliente = new Cliente(1,"Eduardo", "Gonzalez Alvarez", 30 );
        Cliente cliente1 = new Cliente(2,"julio", "Perez Perez", 80 );
        Cliente cliente2 = new Cliente(3,"Nayeli", "Lopez perez", 30 );
        Cliente cliente3 = new Cliente(4,"Naomi", "Solano Carranza", 22 );
          lista.add(cliente);
          lista.add(cliente1);
          lista.add(cliente2);
          lista.add(cliente3);
          return lista;
    }
}
