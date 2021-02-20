package br.maua.enumeracoes;

public enum Status {
    PLATINADO{
        
        @Override
        public String toString() {
            return "Platinado";
        }
    }, NAO_INICIADO{
        @Override
    public String toString() {
        return "Nao Iniciado";
    }
}, TERMINADO{
        @Override
        public String toString() {
            return "Terminado";
        }
    }, JOGANDO{
        @Override
        public String toString() {
            return "Jogando";
        }
    }, NAO_ACABADO{
        @Override
        public String toString() {
            return "Nao Acabado";
        }
    }, ABANDONADO{
        @Override
        public String toString() {
            return "Abandonado";
        };
}}