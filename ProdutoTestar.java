public class ProdutoTestar{
    public static void main(String [] args){
        //const padrão
        Produto p1 = new Produto();
        p1.nome = "Caneta preta";
        p1.marca = "Bic";
        p1.valor = 1.89f;
        //const 2
        Produto p2 = new Produto("Caneta vermelha","Faber");
        p2.valor = 1.90f; 
        //const 3
        Produto p3 = new Produto("Borracha", "Mercur", 3.50f);

        //objeto p1
        System.out.println("Nome: " + p1.nome + ", Marca: " + p1.marca + ", Valor: " + p1.valor);

         //objeto p2
         System.out.println("Nome: " + p2.nome + ", Marca: " + p2.marca + ", Valor: " + p2.valor);

          //objeto p3
        System.out.println("Nome: " + p3.nome + ", Marca: " + p3.marca + ", Valor: " + p3.valor);
    }
}