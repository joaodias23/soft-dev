package EX4;

public class Imovel {
    private String rua;
    private int noPorta;
    private String cidade;
    private TipoHabitacao tipoHabitacao;
    private Acabamento acabamento;
    private int areaTotal;
    private int noQuartos;
    private int noBanheiros;
    private int areaPiscina;

    public Imovel(String rua, int noPorta, String cidade, TipoHabitacao tipoHabitacao,Acabamento acabamento, int areaTotal, int noQuartos, int noBanheiros, int areaPiscina){
        this.rua = rua;
        this.noPorta = noPorta;
        this.cidade = cidade;
        this.tipoHabitacao = tipoHabitacao;
        this.acabamento = acabamento;
        this.areaTotal = areaTotal;
        this.noQuartos = noQuartos;
        this.noBanheiros = noBanheiros;
        this.areaPiscina = areaPiscina;
    }

    public void exibirDetalhes() {
        System.out.println("\n------------------------ IMOVEL ------------------------");
        System.out.println("{ " + this.rua + " , " + this.noPorta + " , " + this.cidade + " , " + this.tipoHabitacao + " , " + this.acabamento + " , " + this.areaTotal + " , " + this.noQuartos + " , " + this.noBanheiros + " , " + this.areaPiscina + " }");
        System.out.println("-------------------------------------------------------");
    }

    public double calcularValor(){
        double valorFinal = 0;

        if(tipoHabitacao.equals(TipoHabitacao.APARTAMENTO)){
            for (int i = 0; i < this.areaTotal; i++){
                valorFinal += 1000;
            }

            if(acabamento.equals(Acabamento.PARA_RESTAURO)){
                valorFinal /= 2;
            } else if (acabamento.equals(Acabamento.USADA)){
                valorFinal *= 0.9;
            } else if (acabamento.equals(Acabamento.NOVA)){
                valorFinal = valorFinal;
            } else if (acabamento.equals(Acabamento.NOVA_COM_ALTO_ACABAMENTO)){
                valorFinal *= 1.25;
            }

            for (int i = 0; i < this.noQuartos; i++){
                valorFinal += 7500;
            }

            for (int i = 0; i < this.noBanheiros; i++){
                valorFinal += 10500;
            }

            for (int i = 0; i < this.areaPiscina; i++){
                valorFinal += 1000;
            }

            return valorFinal;

        } else if (tipoHabitacao.equals(TipoHabitacao.CASA)){
            for (int i = 0; i < this.areaTotal; i++){
                valorFinal += 3000;
            }

            if(acabamento.equals(Acabamento.PARA_RESTAURO)){
                valorFinal /= 2;
            } else if (acabamento.equals(Acabamento.USADA)){
                valorFinal *= 0.9;
            } else if (acabamento.equals(Acabamento.NOVA)){
                valorFinal = valorFinal;
            } else if (acabamento.equals(Acabamento.NOVA_COM_ALTO_ACABAMENTO)){
                valorFinal *= 1.25;
            }

            for (int i = 0; i < this.noQuartos; i++){
                valorFinal += 7500;
            }

            for (int i = 0; i < this.noBanheiros; i++){
                valorFinal += 10500;
            }

            for (int i = 0; i < this.areaPiscina; i++){
                valorFinal += 1000;
            }

            return valorFinal;

        } else if (tipoHabitacao.equals(TipoHabitacao.MANSAO)){
            for (int i = 0; i < this.areaTotal; i++){
                valorFinal += 5000;
            }

            if(acabamento.equals(Acabamento.PARA_RESTAURO)){
                valorFinal /= 2;
            } else if (acabamento.equals(Acabamento.USADA)){
                valorFinal *= 0.9;
            } else if (acabamento.equals(Acabamento.NOVA)){
                valorFinal = valorFinal;
            } else if (acabamento.equals(Acabamento.NOVA_COM_ALTO_ACABAMENTO)){
                valorFinal *= 1.25;
            }

            for (int i = 0; i < this.noQuartos; i++){
                valorFinal += 7500;
            }

            for (int i = 0; i < this.noBanheiros; i++){
                valorFinal += 10500;
            }

            for (int i = 0; i < this.areaPiscina; i++){
                valorFinal += 1000;
            }

            return valorFinal;

        }
        return valorFinal;
    }

    public void setAcabamento(Acabamento acabamento){
        this.acabamento = acabamento;
    }

    public Imovel compararImoveis(Imovel imovel){
        if(this.calcularValor() > imovel.calcularValor()){
            return this;
        } else {
            return imovel;
        }
    }
}
