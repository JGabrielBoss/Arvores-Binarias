public class Btree{
    private Bnode raiz;
    
    public Btree(){
        raiz = null;
    }
    
    public void add(int v){
        if(raiz!=null){
            raiz.add(v);
        }
        else{
            raiz = new Bnode(v);
        }
    }
    
    public void show(){
        if(raiz!=null) raiz.show();
    }

    public boolean contains(int valor){
    if(raiz != null) {
      return raiz.contains(valor);
    } 
    else {
      return false;
    }
  }
  
    public void menorValorQue(int valor){
      if(raiz != null){
        raiz.menorValorQue(valor);
      }
    }

    public int quantidade(){
      if(raiz != null){
        return raiz.quantidade();
      }
      else{
        return 0;
      }
    }

    public int maior(){
      if(raiz != null){
        return raiz.maior();
      }
      else{
        return -99999;
      }
    }
  
    public int menor(){
      if(raiz != null){
        return raiz.menor();
      }
      else{
        return -99999;
      }
    }
  
    public void imprimirNivel(int nivel){
      if(raiz != null){
        raiz.imprimirNivel(nivel, 1);
      }
    }

    public int soma(){
        if(raiz != null){
          return raiz.soma();
        }
        else{
          return 0;
        }
      }

    public boolean isEstritamenteBinaria(){
      if(raiz != null) {
        return raiz.isEstritamenteBinaria();
      } 
      else {
        return true;
      }
    }

    public boolean isDegenerada(){
      if(raiz != null) {
        return raiz.isDegenerada();
      } 
      else {
        return false;
      }
    }

    public void showNota(){
      raiz.showNota();
    }
}