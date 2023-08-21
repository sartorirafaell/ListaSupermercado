
package listasupermercado.controller;



import javax.swing.JOptionPane;
import listasupermercado.model.Produto;


public class ProdutoController {
    private int codigo;
    private String produtoNome;
    private int unidades;

    public ProdutoController(int codigo, String produtoNome, int unidades) {
        this.codigo = codigo;
        this.produtoNome = produtoNome;
        this.unidades = unidades;
    }

    public ProdutoController() {
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
           
 
  public boolean cadastrarProduto(int codigo, String produtoNome, int unidades) {
        if (codigo <= 0 || unidades <= 0 || produtoNome.isEmpty()) {
            // Validação de entrada falhou
            return false;
        }
        
        if(validarCodigo(codigo)  && validarUnidade(unidades)) {
             Produto produto = new Produto(codigo, produtoNome, unidades);
        return produto.cadastrarProduto(codigo, produtoNome, unidades);
        }
        else{
        
         return false;
        }
   
    }

    public boolean validarCodigo(int codigo) {
        String cod = String.valueOf(codigo);
        return cod.matches("\\d+"); // Usar uma expressão regular para verificar se é um número
    }


    public boolean validarUnidade(int unidades) {
        String un = String.valueOf(unidades);
        return un.matches("\\d+"); // Usar uma expressão regular para verificar se é um número
    }
    
    public boolean excluirProduto(int codigo){
          this.codigo = codigo;
          return true;
      }
    
}



