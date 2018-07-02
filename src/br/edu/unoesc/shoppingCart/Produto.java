package br.edu.unoesc.shoppingCart;

public class Produto {
    
    private String nome;
    private Double vlrUnitario;
    private DepartamentoProduto deptoProduto;

    public Produto(String nome, Double vlrUnitario, DepartamentoProduto deptoProduto) {
        this.nome = nome;
        this.vlrUnitario = vlrUnitario;
        this.deptoProduto = deptoProduto;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getVlrUnitario() {
        return vlrUnitario;
    }

    public void setVlrUnitario(Double vlrUnitario) {
        this.vlrUnitario = vlrUnitario;
    }

    public DepartamentoProduto getDeptoProduto() {
        return deptoProduto;
    }

    public void setDeptoProduto(DepartamentoProduto deptoProduto) {
        this.deptoProduto = deptoProduto;
    }
   
    @Override
    public String toString() {
        return "Produto: " + this.nome + "    Valor Unitário: " + this.vlrUnitario + "    Departamento: " + this.deptoProduto;
    }
}