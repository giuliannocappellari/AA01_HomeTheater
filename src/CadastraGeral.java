import java.util.ArrayList;
import java.util.List;

public class CadastraGeral {
    private List<Produtos> produtos = new ArrayList<Produtos>();
    private List<Venda> vendas = new ArrayList<Venda>();

    public CadastraGeral(){}

    public void cadastra(Produtos produto){
        produtos.add(produto);
    }

    public void cadastra(Venda venda){
        vendas.add(venda);
    }

    public String pesquisa(String marca){
        ArrayList<String> pesquisa = new ArrayList<String>(); 
            for (Venda venda : vendas){
                Produtos produto = venda.getProduto();
                String marcaProduto = produto.getMarca();
                if (marcaProduto.equals(marca)){
                    pesquisa.add(venda.toString());
                }
            }
        if (pesquisa.size() == 0){
            return null;
        }
        return pesquisa.toString().replace("[", "").replace("]", "").replace(",", "");
    }

    public String pesquisaTudo(){
        if (vendas.size() == 0){
            return null;
        }
        ArrayList<String> pesquisa = new ArrayList<String>(); 
            for (Venda venda : vendas){
                pesquisa.add(venda.toString());
            }
        return pesquisa.toString().replace("[", "").replace("]", "").replace(",", "");
    }

    public String pesquisa(int codigo){
        for (Venda venda : vendas){
            if (venda.getCodigo() == codigo){
                return venda.toString();
            }
        }
        return null;
    }
}
