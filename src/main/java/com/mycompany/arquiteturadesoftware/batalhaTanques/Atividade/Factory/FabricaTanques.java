package com.mycompany.arquiteturadesoftware.batalhaTanques.Atividade.Factory;

public class FabricaTanques implements Creator{
    @Override
    public PrototipoTanque factoryMethod(ListaTanques tipoTanque) {
        PrototipoTanque criaTanque = null;
        switch (tipoTanque){
            case TANQUEBRASIL -> criaTanque = new TanqueBrasil(CoresTanques.YELLO,CoresTanques.BLUE,10.3F, 10.3F);
            case TANQUEFRANCA -> criaTanque = new TanqueFranca(CoresTanques.BLUE,CoresTanques.WHITE,8.3F, 8.3F);
            case TANQUEESPANHA -> criaTanque = new TanqueEspanha(CoresTanques.RED,CoresTanques.WHITE,6.3F, 6.3F);
      }
        return criaTanque;
    }

}
