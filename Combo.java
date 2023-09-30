public class Combo {

    private Burger burger = new Burger();
    private Sobremesa sobremesa = new Sobremesa();
    private Bebida bebida = new Bebida();

    public void CriarCombo(int tipo)  {
        switch (tipo) {
            case 1:
                burger.setGramas(400);
                burger.setDescricao("Burger Ameaça Fantasma");
                burger.setPreco(2.9);

                sobremesa.setTamanho("Pequeno");
                sobremesa.setDescricao("Milk Shake Ataque dos Clones");
                sobremesa.setPreco(12.9);

                bebida.setMl(10);
                bebida.setDescricao("Refrigerante A Vingança dos Sith");
                bebida.setPreco(2.7);
            break;
            case 2:
                burger.setGramas(140);
                burger.setDescricao("Burger Uma Nova Esperança");
                burger.setPreco(21.9);

                sobremesa.setTamanho("Grande");
                sobremesa.setDescricao("Milk Shake O Império Contra-Ataca");
                sobremesa.setPreco(13.2);

                bebida.setMl(22);
                bebida.setDescricao("Refrigerante O Retorno do Jedi");
                bebida.setPreco(56.63);
            break;
        }
    }

    @Override
    public String toString(){
        String retorno = "Hambúrguer -> Gramas: " + burger.getGramas() + ", Descrição: " + burger.getDescricao() + ", Preço: R$" + burger.getPreco();
        retorno += "\n Sobremesa -> Tamanho: " + sobremesa.getTamanho() + ", Descrição: " + sobremesa.getDescricao() + ", Preco: R$" + sobremesa.getPreco();
        retorno += "\n Bebida -> Ml: " + bebida.getMl() + ", Descrição: " + bebida.getDescricao() + ", Preço: R$" + bebida.getPreco();

        return retorno;
    }
}
