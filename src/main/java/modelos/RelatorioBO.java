
package modelos;

import dao.RelatorioDAO;

public class RelatorioBO {
    
        public void geraRelatorio(){
            RelatorioDAO dao = new RelatorioDAO();
        try {
            dao.geraRelatorio();
        } catch (Exception e) {
            throw new RuntimeException("Ops parece que ocorreu ao chamar o método que gera o relatório!" + e);
        }
    
    }
}
