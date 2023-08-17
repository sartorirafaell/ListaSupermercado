
package listasupermercado.model;

import listasupermercado.view.janelaSupermercado;

public class Produto {
    private int codigo;
    private String produtoNome;
    private int unidades;

    public Produto(int codigo, String produtoNome, int unidades) {
        this.codigo = codigo;
        this.produtoNome = produtoNome;
        this.unidades = unidades;
    }
    
    public boolean cadastrarProduto(Produto produto){
        
        return true;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getProdutoNome() {
        return produtoNome;
    }

    public void setProdutoNome(String produtoNome) {
        this.produtoNome = produtoNome;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }
    
    
}
