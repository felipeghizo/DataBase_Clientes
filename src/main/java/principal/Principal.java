
package principal;

import dao.Conexao;
import visualizacao.visualizacaoMenu;


public class Principal {

    public static void main(String[] args) {

        Conexao conexao = new Conexao();
        conexao.getConexao();
        
        visualizacaoMenu menu = new visualizacaoMenu();
        menu.setVisible(true);
        
    }
}