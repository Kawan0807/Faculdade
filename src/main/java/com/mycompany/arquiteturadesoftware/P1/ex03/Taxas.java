package com.mycompany.arquiteturadesoftware.P1.ex03;


public enum Taxas {
    BancoX{
        @Override
        public Strategy instance() {
            return new BancoX();
        }
    },
    BancoY{
        @Override
        public Strategy instance() {
            return new BancoY();
        }
    },
    BancoZ{
        @Override
        public Strategy instance() {
            return new BancoZ();
        }
    };
    public abstract Strategy instance();
}
