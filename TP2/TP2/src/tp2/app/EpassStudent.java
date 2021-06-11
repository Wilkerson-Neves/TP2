package app;

import ui.TituloTrasnporte;

import java.time.LocalDate;

public class EpassStudent extends Epass implements TituloTrasnporte {
    private int ano;
    private String escola;
    private Zona[] zonas;

    /*implementação de classes Titulo trasporte*/

    @Override
    public void carregar(double saldo) {
        System.out.println("Saldo atual "+getSaldo());
        if (saldo < 0) {
            System.out.println("Valor invalido");
        }else{
                this.setSaldo(getSaldo()+saldo);
                this.setDataCarrega(LocalDate.now());
                this.setDataValida(getDataCarrega().plusDays(30));
            System.out.println(getSaldo());
            };
        }


    @Override
    public void pagarViagem(double saldo) {
        int precoFixo = 20;
        System.out.println(getSaldo());
        if(getSaldo() < 20){
            System.out.println("O saldo não permite a viagem");
        }
        else {
            setSaldo(getSaldo()-20);
            System.out.println(getSaldo());
        }

    }

    @Override
    public boolean checkValidade() {
        return false;
    }

    @Override
    public boolean passarSaldo() {
        return false;
    }

    /*getter e setter*/

    public int getAno() {
        return ano;
    }

    public String getEscola() {
        return escola;
    }

    public Zona[] getZonas() {
        return zonas;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    public void addZona(String nome){

    }
    public void addZ(Zona zonaViagem){

    }

        /*
        * construtor
        * */

    public EpassStudent(double saldo, double precoViagem, LocalDate dataCarrega, LocalDate dataValida, int ano, String escola) {
        super(saldo, precoViagem, dataCarrega, dataValida);
        this.ano = ano;
        this.escola = escola;
    }

    public EpassStudent(double saldo, double precoViagem, LocalDate dataCarrega, LocalDate dataValida,EpassStudent outro) {
        super(saldo, precoViagem, dataCarrega, dataValida);

    }

}
