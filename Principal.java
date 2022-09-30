public class Principal {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Lucas");
        cliente.setCpf("456.788.888-7");
        cliente.setIdade(24);

        System.out.println(cliente.getNome());
        System.out.println(cliente.getCpf());

        Cliente c2 = new Cliente( "Victor", "457.444.894-77");

        c2.escreverTexto();
        c2.escreverTexto("Texto 1");
        c2.escreverTexto("Texto x", "texto y");
        c2.escreverTexto("1");

        Cliente c4 = new Cliente();
        c4.setNome("David");
        c4.setCpf("86483649");
        c4.setIdade(21);

        Cliente c5 = new Cliente("David", "86483649", 21);

    }

}
