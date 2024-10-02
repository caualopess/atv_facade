public class Combo {
    private Burguer comboBurguer;
    private Bebida comboBebida;
    private Sobremesa comboSobremesa;

    public void setComboBurguer(Burguer comboBurguer) {
        this.comboBurguer = comboBurguer;
    }

    public void setComboBebida(Bebida comboBebida) {
        this.comboBebida = comboBebida;
    }

    public void setComboSobremesa(Sobremesa comboSobremesa) {
        this.comboSobremesa = comboSobremesa;
    }

    public void CriarCombo(int tipo) {
        if (tipo == 1){
            Burguer burguer = new Burguer();

            burguer.setDescricao("Master Hamburguer");
            burguer.setPreco(19.99);

            burguer.setGramas(150);

            Bebida bebida = new Bebida();

            bebida.setDescricao("Coca-cola");
            bebida.setPreco(8.00);

            bebida.setMl(500);

            Sobremesa sobremesa = new Sobremesa();

            sobremesa.setDescricao("Casquinha");
            sobremesa.setPreco(3.50);

            sobremesa.setTamanho("Médio");

            this.setComboBurguer(burguer);
            this.setComboBebida(bebida);
            this.setComboSobremesa(sobremesa);
        }
        if (tipo == 2) {
            Burguer burguer = new Burguer();

            burguer.setDescricao("Super Hamburguer");
            burguer.setPreco(29.99);

            burguer.setGramas(350);

            Bebida bebida = new Bebida();

            bebida.setDescricao("Suco de laranja natural");
            bebida.setPreco(12.00);

            bebida.setMl(750);

            Sobremesa sobremesa = new Sobremesa();

            sobremesa.setDescricao("Sundae");
            sobremesa.setPreco(12.00);

            sobremesa.setTamanho("Grande");

            this.setComboBurguer(burguer);
            this.setComboBebida(bebida);
            this.setComboSobremesa(sobremesa);
        }
    }

    @Override
    public String toString() {
        return comboBurguer + "\n" + comboBebida + "\n" + comboSobremesa;
    }
}
