package com.mycompany.arquiteturadesoftware.batalhaTanques.Exemplo;

public interface Cor {
    void setCorTanques(CoresRGB corTanques);
    void setCorCanhao(CoresRGB corCanhao);

    CoresRGB getCorTanque();
    CoresRGB getcorCanhao();
}
