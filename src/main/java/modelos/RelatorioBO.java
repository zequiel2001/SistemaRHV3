
package modelos;

import dao.RelatorioDAO;

public class RelatorioBO {
    
        public void geraRelatorio(){
            RelatorioDAO dao = new RelatorioDAO();
        try {
            dao.geraRelatorio();
        } catch (Exception e) {
            throw new RuntimeException("Oops looks like it occurred when calling the method that generates the report!" + e);
        }
    
    }
}
