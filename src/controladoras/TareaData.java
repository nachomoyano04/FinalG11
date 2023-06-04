/*
 * 
 * 
 */

package controladoras;

import java.sql.Connection;


public class TareaData {
    private Connection con = null;

    public TareaData() {
        con = Conexion.getConexion();
    }

}
