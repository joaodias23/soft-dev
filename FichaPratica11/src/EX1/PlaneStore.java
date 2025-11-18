package EX1;

import EX1.Avioes.Aviao;
import EX1.Avioes.AviaoCombate;
import EX1.Avioes.JatoParticular;

import java.util.ArrayList;

public class PlaneStore {
    private ArrayList<Aviao> catalogoAviao;
    private int total;

    public PlaneStore() {
        this.total = 0;
        this.catalogoAviao = new ArrayList<Aviao>();
    }

    public void adquirirAviao(Aviao voador){
        catalogoAviao.add(voador);
    }

    public void venderAviao(Aviao avinho){
        catalogoAviao.remove(avinho);
    }

    public int calcularTotal(Aviao avinho){
        for(Aviao aviao : catalogoAviao){
            total += aviao.getPreco();
        }
        return total;
    }

    public void listarCatalogo(){
        for(Aviao voador : catalogoAviao){
            if(voador instanceof JatoParticular){
                JatoParticular aviao = (JatoParticular) voador;
                aviao.exibirDetalhes();
            }

            if(voador instanceof AviaoCombate){
                AviaoCombate aviao = (AviaoCombate) voador;
                aviao.exibirDetalhes();
            }
        }
    }
}