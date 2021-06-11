package ui;

public interface TituloTrasnporte {
    public void carregar(double saldo);
    public void pagarViagem(double saldo);
    public boolean checkValidade();
    public boolean passarSaldo();

}
