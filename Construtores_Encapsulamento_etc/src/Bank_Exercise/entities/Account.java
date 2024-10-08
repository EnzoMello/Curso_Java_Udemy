package Bank_Exercise.entities;

public class Account {
    // INICIANDO OS ATRIBUTOS QUE SERÃO USADOS NO PROGRAMA
    private int numberAccount;
    private String name;
    private double depositValue;

    /* INICIANDO MEUS CONSTRUTORES, NOTE QUE DIFERENTES TIPOS DE CONSTRUTORES SÃO USADOS PARA ADEQUAR A QUESTÃO DE ACORDO COM A ESCOLHA DO USUÁRIO
    -> CONSTRUTORES SERVEM PARA INICIAR OS ATRIBUTOS DE UMA INSTÂNCIA DE UMA CLASSE, PERMITINDO OU OBRIGANDO A PRESENÇA DELES ASSIM QUE A CLASSE É INSTANCIADA.
    */
    public Account(int numberAccount, String name){
        this.numberAccount = numberAccount;
        this.name = name;
    }

    public Account(int numberAccount, String name, double depositValue){
        this.numberAccount = numberAccount;
        this.name = name;
        deposit(depositValue);
    }

    /* FAÇO O ENCAPSULAMENTO PARA TER MAIOR SEGURANÇA DOS ATRIBUTOS DO MEU CÓDIGO. DESSE MODO, O ACESSO DOS ATRIBUTOS FICA RESTRITO
    -> get = Serve para acessar o atributo.
    -> set = Serve para modificar um atributo, por meio da palavra this. */
    public int getNumberAccount(){
        return numberAccount;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getDepositValue(){
        return depositValue;
    }

    public void deposit(double value){
        depositValue += value;
    }

    public void withdraw(double value){
        depositValue -= value + 5.0;
    }

    public String toString(){
        return "Account " + numberAccount + ", Holder: " + name + ", Balance: $ " + String.format("%.2f", depositValue);
    }
}
