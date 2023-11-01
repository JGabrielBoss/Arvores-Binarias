public class Bnode{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int x;
    private Bnode esq, dir;
    
    public Bnode(int v){
        x=v;
        esq = dir = null;
    }
    
    public void add(int v){
        if(v<x){
            if(esq!=null){
                esq.add(v);
            }
            else{
                esq = new Bnode(v);
            }
        }
        else{
            if(dir!=null){
                dir.add(v);
            }
            else{
                dir = new Bnode(v);
            }
        }
    }
    
    public void show(){
      //Da esquerda para direita ela vai printar de forma CRESCENTE
      //Da direita para esquerda ela vai printar de forma DECRESCENTE
        System.out.println(x);
        if(esq!=null){
          esq.show();
        } 
        if(dir!=null){
          dir.show();
        } 
    }

    public boolean contains(int valor){
      //Verifica se o primeiro valor é igual ao parâmetro
      if(valor == x){
        return true;
      }
      //Condição se o valor é menor que o valor da folha
      if(valor<x){
            //Se sim, comparamos se é igual ao valor da folha
            if(valor == x){
                return true;
            }
            //Se a esquerda não for nula, chama recursivamente a folha esquerda.
            if(esq != null){
                return esq.contains(valor);
            }
            //Não achou nenhum valor.
            else{
                return false;
            }
        }
      else{
            //Comparamos se é igual ao valor da folha da direita.
            if(valor == x){
                return true;
            }
            //Se a direita não for nula, chama recursivamente a folha direita.
            if(dir != null){
                return dir.contains(valor);
            }
            else{
              //Não achou nenhum valor.
                return false;
            }
        }
    }

    public void menorValorQue(int valor) {
        // Verifica se o valor atual é menor que o valor fornecido
        if (x < valor) {
            // Se for menor, significa que todos os valores na subárvore esquerda 
            //também são menores que o valor fornecido, então podemos imprimir todos eles.
            if (esq != null) {
                esq.menorValorQue(valor);
            }
            // Em seguida, imprimimos o valor atual.
            System.out.println(x);
            // Em seguida, verificamos a subárvore direita, mas não precisamos imprimir nada,
            // pois os valores na subárvore direita serão maiores que o valor fornecido.
            if (dir != null) {
                dir.menorValorQue(valor);
            }
        }
        // Se o valor atual não for menor que o valor fornecido, verificamos apenas a subárvore esquerda,
        // pois os valores na subárvore direita serão maiores que o valor fornecido.
        else if (esq != null) {
            esq.menorValorQue(valor);
        }
    }

    public int quantidade(){
        //Conta o primeiro nó
        int count = 1;
      
        if(esq!=null){
          count = esq.quantidade() + count;
        }
      
        if(dir!=null){
          count = dir.quantidade() + count;
        }
      
        return count;
    }

    public int maior(){
        int maior = x;
        if(esq != null){
            int maiorEsq = esq.maior();
            if (maiorEsq > maior){
                maior = maiorEsq;
            }
        }
        if(dir != null){
            int maiorDir = dir.maior();
            if(maiorDir > maior){
                maior = maiorDir;
            }
        }
        return maior;
    }
  
    public int menor(){
      int menor = x;
      if(esq != null){
          int menorEsq = esq.menor();
          if (menorEsq < menor){
              menor = menorEsq;
          }
      }
      if(dir != null){
          int menorDir = dir.menor();
          if (menorDir < menor){
              menor = menorDir;
          }
      }
      return menor;
    }

    public void imprimirNivel(int nivelDesejado, int nivelAtual){
      if (nivelAtual == nivelDesejado) {
          // Imprime o valor do nó se estiver no nível desejado.
            System.out.println("Nivel "+ nivelDesejado +" = "+ x); 
        }
      else{
        //Chama recursivamente se não for o nivel
        if(esq != null){
          esq.imprimirNivel(nivelDesejado, nivelAtual + 1);
        }
        if(dir != null){
          dir.imprimirNivel(nivelDesejado, nivelAtual + 1);
        }
      }
    }

    public int soma(){
        int soma = 0;
        
        if(esq != null || dir != null){ 
            soma = x + soma;
            if(esq != null){
                soma += esq.soma(); 
            }
            if(dir != null){
                soma += dir.soma();
            }
        }
        return soma;
    }

    public boolean isEstritamenteBinaria(){
      if(esq != null && dir != null){
        esq.isEstritamenteBinaria();
        dir.isEstritamenteBinaria();
      }
      if(esq != null && dir == null){
        return false;
      }
      if(esq == null && dir != null){
        return false;
      }
      return true;
    }

    public boolean isDegenerada(){
      if(esq != null && dir != null){
        esq.isDegenerada();
        dir.isDegenerada();
      }
      if(esq != null && dir == null){
        return true;
      }
      if(esq == null && dir != null){
        return true;
      }
      return false;
    }

    public void showNota(){
      System.out.print("("+x);

      if(esq != null){
        esq.showNota();
      }
      else{
        System.out.print("()");
      }
      if(dir != null){
        dir.showNota();
      }
      else{
        System.out.print("()");
      }
      System.out.print(")");
    }

    public int altura(){
      
      int alturaEsq = 0;
      int alturaDir = 0;
      
      if(esq != null){
        alturaEsq = esq.altura();
      }

      if(dir != null){
        alturaDir = dir.altura();
      }

      if(alturaEsq > alturaDir){
        return alturaEsq + 1;
      }
      else{
        return alturaDir + 1;
      }
    }

    public int maiorCaminho(){
      
      int caminhoEsq = 0;
      int caminhoDir = 0;
      
      if(esq != null){
        System.out.println("Esq: "+x);
        caminhoEsq = 1 +  esq.maiorCaminho();
      }

      if(dir != null){
        System.out.println("Dir: "+x);
        caminhoDir = 1 + dir.maiorCaminho();
      }
      
      int caminhoAtual = caminhoEsq + caminhoDir;

      if (caminhoAtual >= caminhoEsq && caminhoAtual >= caminhoDir) {
        return caminhoAtual;
    } else if (caminhoEsq >= caminhoAtual && caminhoEsq >= caminhoDir) {
        return caminhoEsq;
    } else {
        return caminhoDir;
    }
    }

}