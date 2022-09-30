package com.mycompany.arquiteturadesoftware.batalhaTanques.Atividade.Factory;

public class TanqueFranca implements PrototipoTanque{

    private CoresTanques corTanque,corCanhao;
    private float x,y;

    public TanqueFranca(CoresTanques corTanque, CoresTanques corCanhao, float x, float y) {
        this.corTanque = corTanque;
        this.corCanhao = corCanhao;
        this.x = x;
        this.y = y;
    }

    public TanqueFranca() {
    }


    @Override
    public void atirar() {

    }

    @Override
    public void setCorTanques(CoresTanques corTanques) {
        this.corTanque = corTanques;
    }

    @Override
    public void setCorCanhao(CoresTanques corCanhao) {
        this.corCanhao = corCanhao;

    }
    @Override
    public CoresTanques getCorTanque() {
        return this.corTanque;
    }

    @Override
    public CoresTanques getcorCanhao() {
        return this.corCanhao;
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
