public class Conta {

    public  String nome;
    public String cpf;
    public int idade;
    public int numConta;
    public double saldo;
    public boolean status;
    public String tipo;

    public Conta(String nome, String cpf, int i, int idade, int numConta, double saldo, boolean status, String tipo) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.numConta = numConta;
        this.saldo = saldo;
        this.status = status;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", idade=" + idade +
                ", numConta=" + numConta +
                ", saldo=" + saldo +
                '}';
    }

    public Conta(String nome, String cpf, int idade, int numConta, double saldo, boolean status) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.numConta = numConta;
        this.saldo = saldo;
        this.status = status;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void abrirConta(String t) {
        setTipo(t);
        setStatus(true);
        if (t == "cc") {
            this.saldo =  50;
        } else if (t == "cp") {
            this.saldo =  150;
        }
    }

    public void fecharConta() {
        if (this.saldo> 0) {
            System.out.println("impossível fechar conta com dinheiro");
        } else if (this.getSaldo() < 0) {
            System.out.println("impossível fechar com débito");
        } else {
            setStatus(false);
            System.out.println("Conta fechada com sucesso");
        }
    }

    public void depositar(float v) {
        if (status == true) {

            this.setSaldo(this.getSaldo() + v);
            System.out.println("depósito realizado com sucesso");
        } else {
            System.out.println("Impossível depositar com a conta fechada");
        }
    }

    public void sacar(double v) {
        if (status == true) {
            if ((this.saldo - v) >= 0) {
                setSaldo(getSaldo()- v);
                System.out.println("Saque de "+ v +" \nNovo saldo: "+saldo);
            } else {
                System.out.println("Não é possível sacar, saldo insuficiente");
            }
        }else {
            System.out.println("Impossível sacar com a conta inativa");
        }

    }


    public void pagarMensalidade() {
        int v =0;
        if (tipo=="cc") {
            v = 12;
        }
        else if (tipo == "cp") {
            v =20;
        }
        if (status == true) {
            if(saldo > 0) {
                setSaldo(getSaldo() - v);
            }else {
                System.out.println("Impossível pagar");
            }
        }
    }
}


