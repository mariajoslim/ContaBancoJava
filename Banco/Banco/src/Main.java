public class Main {
    public static void main(String[] args) {
       Conta p1 = new Conta("Maria","016987548",25,3098,26,00, true, "cc");
        Conta p2 = new Conta("Mario","012569874", 30, 3145, 2965,00,false,"cp");


        System.out.println();
        p1.fecharConta();


        System.out.println();
        p1.sacar(150f);


        System.out.println();
        p1.fecharConta();


        System.out.println();
        p1.abrirConta("cc");
        p1.depositar(100);
        p1.sacar(49f);

        System.out.println();



        System.out.println();
        p2.sacar(60.5f);
        p2.fecharConta();

        System.out.println();
        p1.sacar(0.50f);
        System.out.println("Saldo de p1: "+ p1.getSaldo());

        System.out.println();
        p2.sacar(10f);
        System.out.println("Saldo de p2: "+ p2.getSaldo());
    }

}
