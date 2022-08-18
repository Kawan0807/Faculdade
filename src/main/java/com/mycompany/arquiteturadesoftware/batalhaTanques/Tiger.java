package com.mycompany.arquiteturadesoftware.batalhaTanques;

public class Tiger implements Posicao, Cor, Canhao{
    private CoresRGB corTanque,corCanhao;
    private float x,y;

    @Override
    public void atirar() {

    }

    @Override
    public void setCorTanques(CoresRGB corTanques) {
       this.corTanque = corTanques;
    }

    @Override
    public void setCorCanhao(CoresRGB corCanhao) {
        this.corCanhao = corCanhao;

    }

    @Override
    public CoresRGB getCorTanque() {
        return this.corTanque;
    }

    @Override
    public CoresRGB getcorCanhao() {
        return this.corTanque;
    }

    @Override
    public void setX(float x) {
        this.x=x;
    }

    @Override
    public void setY(float y) {

    }

    @Override
    public float getX() {
        return this.x;
    }

    @Override
    public float getY() {
       return this.y;
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "corTanque=" + corTanque +
                ", corCanhao=" + corCanhao +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
