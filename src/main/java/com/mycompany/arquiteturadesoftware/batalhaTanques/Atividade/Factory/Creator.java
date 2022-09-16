package com.mycompany.arquiteturadesoftware.batalhaTanques.Atividade.Factory;

import com.mycompany.arquiteturadesoftware.DesignerPatters.Factory.factory.Carro;
import com.mycompany.arquiteturadesoftware.DesignerPatters.Factory.factory.ListaCarros;
import com.mycompany.arquiteturadesoftware.batalhaTanques.Exemplo.CoresRGB;

public interface Creator {
   public PrototipoTanque factoryMethod(ListaTanques tipoTanque);
}
