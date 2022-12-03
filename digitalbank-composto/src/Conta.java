public class Conta {
    double saldo; // saldo e denominado atributo.
    int agencia; // atributo.
    int numero; // atributo.
    String titular; // atributo.

    // criação de um método
    // usa o void para método vazio
    //sem nenhum retorno
    // método para deposito
    public void deposita(double valor){
        // usado this para usar apenas do objeto que foi invocado
        this.saldo += valor;
    }
    // método para saque
    public boolean saca(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        } else{
            return false;
        }

    }
    // método para transferência
    public boolean transfere(double valor, Conta destino){
        if(this.saldo >= valor){
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }
        return false;
    }
}
