package com.mycompany.arquiteturadesoftware.ado1.Q2Ex;

public enum Impostos {
    IP1{
        @Override
        public Strategy instance() {
            return new IP1();
        }
    },
    IP2{
        @Override
        public Strategy instance() {
            return new IP2();
        }
    },
    IP3{
        @Override
        public Strategy instance() {
            return new IP3();
        }
    };
    public abstract Strategy instance();
}
