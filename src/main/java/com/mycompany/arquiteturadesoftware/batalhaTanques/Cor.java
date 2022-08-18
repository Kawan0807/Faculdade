package com.mycompany.arquiteturadesoftware.batalhaTanques;

public interface Cor {
    void setCorTanques(CoresRGB corTanques);
    void setCorCanhao(CoresRGB corCanhao);

    CoresRGB getCorTanque();
    CoresRGB getcorCanhao();
}
