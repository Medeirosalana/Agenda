package classes;

import java.util.Scanner;

public class Contato {
    private String nome;
    private String fone;
    private String endereco;
    private String email;

    public Contato() {
    }

    public Contato(String nome, String fone) {
        this.nome = nome;
        this.fone = fone;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contato{" + "nome=" + nome + ", fone=" + fone + ", endereco=" + endereco + ", email=" + email + '}';
    }

    public static void salvar(Contato contato, int posicao){
        contatos[posicao] = contato;
    }
    public static void listarTudo() {
        int c = 0;
    for (Contato contato : contatos){
        if (contato != null){
        System.out.println(c + " - " + contato.toString());
        c++;
        }else{
            break;
            }
       
        }
    }
    
    public Contato listarPorId (int id){
    Contato contato = new Contato();
    contato = null;
    for (int i = 0; i< contatos.length; i++){
    if (id == i){
        contato = contatos[i];
        break;
    }
    }
    return contato;        
    }
      static Contato[] contatos = new Contato[10];
     
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int opcao = 1, c= 0;
        do {
            System.out.println("Escolha a opção: ");
            opcao = sc.nextInt();
            Contato contato = new Contato();
            switch (opcao){
                case 1:
                   
                    System.out.print("nome: ");
                    contato.setNome(sc.next());
                    System.out.print("Fone: ");
                    contato.setFone(sc.next());
                    System.out.print("Email: ");
                    contato.setEmail(sc.next());
                    System.out.print("Endereço: ");
                    contato.setEndereco(sc.next());
                    salvar(contato, c);
                    c++;
                    break;
                case 2:
                     listarTudo();
                    break;
                case 3: 
                    System.out.print("Digite uma id: ");
                    contato = contato.listarPorId(sc.nextInt());
                    if (contato == null){
                        System.out.println("Contato não encontrado");
                    }else{
                        System.out.println(contato.toString());
                    }
                default:
                    break;
            }
        } while (opcao != 0);
        System.out.println("Acabou!!!");
    }

    
    
}
