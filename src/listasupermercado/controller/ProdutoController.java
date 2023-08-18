
package listasupermercado.controller;


import javax.swing.JOptionPane;
import listasupermercado.model.Produto;


public class ProdutoController {
 
     public boolean cadastrarProduto(int codigo, String produtoNome, int unidades) {
         String codigoStr = String.valueOf(codigo); // Converter o código para uma string
         String unidadeStr = String.valueOf(unidades); // Converter a unidade para uma string
         
    if (!codigoStr.isEmpty() && validarCodigo(codigoStr) && !produtoNome.equals("") && validarNome(produtoNome) && !unidadeStr.isEmpty() && validarUnidade(unidadeStr)) {
      
        Produto produto = new Produto(codigo, produtoNome, unidades);
        
        return produto.cadastrarProduto(produto);
    }
    else {
        JOptionPane.showMessageDialog(null, "Complete corretamente todos os campos");
        return false;
    }
    
}

public boolean validarCodigo(String codigo) {
    for (int i = 0; i < codigo.length(); i++) {
        if (!Character.isDigit(codigo.charAt(i))) {
            JOptionPane.showMessageDialog(null, "Insira um código apenas com números inteiros");
            return false;
        }
    }
    return true;
}

public boolean validarNome(String produtoNome) {
    for (int i = 0; i < produtoNome.length(); i++) {
        if (Character.isDigit(produtoNome.charAt(i))) {
            JOptionPane.showMessageDialog(null, "Insira um nome sem números");
            return false;
        }
    }
    return true;
}

public boolean validarUnidade(String unidade) {
    for (int i = 0; i < unidade.length(); i++) {
        if (!Character.isDigit(unidade.charAt(i))) {
            JOptionPane.showMessageDialog(null, "Insira um código apenas com números inteiros");
            return false;
        }
    }
    return true;
}
}
