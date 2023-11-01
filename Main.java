public class Main{
    public static void main(String args[]){
        Btree a = new Btree();
        
        a.add(50);
        a.add(30);
        a.add(70);
        a.add(40);
        a.add(10);
        a.add(80);
        a.add(60);
        a.add(90);

        //Imprime as folhas da arvore
        a.show();

        /*1) Receba um valor como parâmetro e retorne como resposta um valor booleano, sendo
        Verdadeiro, quando o valor está armazenado na árvore e Falso, quando esse valor não
        está armazenado. */
        System.out.println(a.contains(90));

        /*2) Receba um valor inteiro como parâmetro e imprima os valores armazenados na árvore
        que sejam menores que esse valor (tente fazer um método que se aproveite da estrutura
        de armazenamento da árvore binária para evitar que ele tenha de visitar todos os nós).*/
        a.menorValorQue(60);

        //3) Retorne a quanƟdade de nós folha
        System.out.println(a.quantidade());

        //4) Retorne o maior valor armazenado 
        System.out.println(a.maior());

        //5) Retorne o menor valor armazenado 
        System.out.println(a.menor());

        /*6) Escreva os métodos para a classe Btree e classe Bnode, que imprima os nós que
        estejam armazenados em um determinado nível da árvore binária. Para isso, seus
        métodos devem receber um valor inteiro como parâmetro, que corresponde ao nível
        desejado. */
        a.imprimirNivel(3);

        /*7) Escreva os métodos para a classe Btree e classe Bnode que retornem a soma dos
        valores dos nós que não sejam folha. */
        System.out.println(a.soma());
        
        /*8) Uma árvore estritamente binária possui nós com 2 ou 0 filhos e nenhum nó com 1
        filho. Construa um método isEstritamenteBinaria() para a classe Btree e classe Bnode,
        que retorna verdadeiro se ela for estritamente binária ou falso, se ela não for.*/
        System.out.println("Ela é estritamente binária?: "+ a.isEstritamenteBinaria());

        /*9) Uma árvore degenerada é uma árvore binária que possui apenas um nó por nível.
        Construa um método isDegenerada() para a classe Btree e classe Bnode que retornem
        verdadeiro, se a árvore for degenerada ou falso, se ela não for.*/
        System.out.println("Ela é degenerada?: "+ a.isDegenerada());

        /*10) Construa os métodos para a classe Btree e Bnode, que apresentem os valores dos nós
        da árvore binária, no formato dos parêntesis aninhados.*/
        a.showNota();
    }
}
