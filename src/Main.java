import java.util.Scanner;

public class Main {

    private CadastraGeral cd = new CadastraGeral();
    private static Scanner input = new Scanner(System.in).useDelimiter("\\n");
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        Main main = new Main();
        main.incializar();
        main.processar();
    }    

    public void incializar(){
        //Inicializando 5 eletronicos
        HomeTheater h1 = new HomeTheater(197, "Sony", 299.99, 100);
        HomeTheater h2 = new HomeTheater(190, "Samsung", 599.99, 120);
        HomeTheater h3 = new HomeTheater(192, "Apple", 999.99, 120);
        HomeTheater h4 = new HomeTheater(195, "Apple", 1499.99, 150,20);
        HomeTheater h5 = new HomeTheater(199, "AKG", 1999.99, 200,10);
        
        //Cadastrando
        cd.cadastra(h1);
        cd.cadastra(h2);
        cd.cadastra(h3);
        cd.cadastra(h4);
        cd.cadastra(h5);

        //Inicializando vendas
        Venda v1 = new Venda(9936, "Morgana", h1);
        Venda v2 = new Venda(9941, "Cibele", h1);
        Venda v3 = new Venda(1987, "John Lennon", h2);
        Venda v4 = new Venda(1981, "Paul McCartney", h3);
        cd.cadastra(v1);
        cd.cadastra(v2);
        cd.cadastra(v3);
        cd.cadastra(v4);
    }

    public void processar(){
        int opcao;
        do{
            System.out.println("|-----------------------------------------------|");
            System.out.println("|              Menu de Opcoes                   |");
            System.out.println("|-----------------------------------------------|");
            System.out.println("|1. Mostrar informacoes de vendas ja cadastradas|");
            System.out.println("|2. Pesquisar venda por codigo                  |");
            System.out.println("|3. Pesquisar venda pela marca                  |");
            System.out.println("|4. Cadastrar novo eletronico                   |");
            System.out.println("|5. Cadastrar nova venda                        |");
            System.out.println("|6. Sair                                        |");
            System.out.println("|-----------------------------------------------|");  
            System.out.print("Digite sua opcao: ");
            opcao = in.nextInt();
            switch(opcao){
                case 1: 
                    String pesquisaTudo = cd.pesquisaTudo();
                    if (pesquisaTudo == null){
                        System.out.println("Não exitem vendas ou produtos cadastrados.");
                    }
                    else{
                        System.out.println(pesquisaTudo);
                    }
                break;
                case 2:
                    System.out.println("Codigo da Venda: ");
                    int codigo = in.nextInt();
                    String pesquisaCodigo = cd.pesquisa(codigo);
                    if (pesquisaCodigo == null){
                        System.out.println("Não existem vendas com esse código.");
                    }
                    else{
                        System.out.println(pesquisaCodigo);
                    } 
                break;
                case 3: 
                    //pesquisa venda marca
                    System.out.println("Marca do Produto: ");
                    String marcaProdutoVenda = input.next();
                    String pesquisaMarca = cd.pesquisa(TratamentoString.toTitle(marcaProdutoVenda));
                    if (pesquisaMarca == null){
                        System.out.println("Não existem produtos com essa marca.");
                    }
                    else{
                        System.out.println(pesquisaMarca);
                    }
                break;
                case 4: 
                    //cadastra novo eletronico
                    System.out.println("Tipo do Produto: ");
                    String tipoProduto = input.next();
                    System.out.println("Codigo do Produto: ");
                    int codigoNovoEletronico = in.nextInt();
                    System.out.println("Marca do Produto: ");
                    String marca = input.next();
                    System.out.println("Preco do Produto: ");
                    double preco = in.nextDouble();
                    Produtos produto = new Produtos(TratamentoString.toTitle(tipoProduto), codigoNovoEletronico, TratamentoString.toTitle(marca), preco);
                    cd.cadastra(produto);
                break;
                case 5: 
                    //cadastra nova venda
                    System.out.print("Codigo da Venda: ");
                    int codigoVenda = in.nextInt();
                    System.out.print("Nome do comprador: ");
                    String comprador = input.next();
                    System.out.print("Tipo do Produto: ");
                    String tipoProduto2 = input.next();
                    System.out.print("Codigo do Produto: ");
                    int codigo2 = in.nextInt();
                    System.out.print("Marca do Produto: ");
                    String marca2 = input.next();
                    System.out.print("Preco do Produto: ");
                    double preco2 = in.nextDouble();
                    
                    Produtos produto2 = new Produtos(TratamentoString.toTitle(tipoProduto2), codigo2, TratamentoString.toTitle(marca2), preco2);
                    cd.cadastra(produto2);

                    Venda venda = new Venda(codigoVenda, TratamentoString.toTitle(comprador), produto2);
                    cd.cadastra(venda);
                break;
                case 6: 
                    System.out.println("Obrigado por utilizar o sistema!");
                    System.out.println("Até mais.");
                break;
            }
        }while(opcao != 6);
        input.close();
        in.close();
    }
}
