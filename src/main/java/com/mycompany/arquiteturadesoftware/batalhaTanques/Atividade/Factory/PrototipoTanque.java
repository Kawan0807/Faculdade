package com.mycompany.arquiteturadesoftware.batalhaTanques.Atividade.Factory;

import com.mycompany.arquiteturadesoftware.batalhaTanques.Exemplo.CoresRGB;

public interface PrototipoTanque {

    void atirar();

    void setCorTanques(CoresTanques corTanques);
    void setCorCanhao(CoresTanques corCanhao);

    CoresTanques getCorTanque();
    CoresTanques getcorCanhao();

    void setX(float x);
    void setY(float y);

    float getX();
    float getY();
}
