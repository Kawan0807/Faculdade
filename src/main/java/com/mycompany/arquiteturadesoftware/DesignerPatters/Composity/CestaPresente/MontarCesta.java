package com.mycompany.arquiteturadesoftware.DesignerPatters.Composity.CestaPresente;

import com.mycompany.arquiteturadesoftware.DesignerPatters.Composity.CestaComposity.Componente;
import com.mycompany.arquiteturadesoftware.DesignerPatters.Composity.CestaComposity.Composity;
import com.mycompany.arquiteturadesoftware.DesignerPatters.Composity.CestaComposity.Leaf;

public class MontarCesta {
    public static void main(String[] args) {
        Composity cesta = new Composity("Cesta de presentes");

        Componente prod1 = new Leaf("Café", 18.98);
        Componente prod2 = new Leaf("Leite", 5.37);

        Componente prod3 = new Leaf("Bom cereja", 7.12);
        Componente prod4 = new Leaf("Bombom licor", 5.99);

        Composity caixa1 = new Composity("Caixa de bombons");

        caixa1.adicionar(prod3);
        caixa1.adicionar(prod4);

        cesta.adicionar(caixa1);
        cesta.adicionar(prod1);
        cesta.adicionar(prod2);

    }
}
