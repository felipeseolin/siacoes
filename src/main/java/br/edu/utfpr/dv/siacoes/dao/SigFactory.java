package br.edu.utfpr.dv.siacoes.dao;

public class SigFactory {

    public static final String SIGET = "SIGET";
    public static final String SIGES = "SIGES";
    public static final String SIGAC = "SIGAC";

    public static ISigConfig getSigConfig(String tipo) throws Exception {
        tipo = tipo.toUpperCase();
        switch (tipo) {
            case SigFactory.SIGET:
                return new SigetConfigDAO();
            case SigFactory.SIGES:
                return new SigesConfigDAO();
            case SigFactory.SIGAC:
                return new SigacConfigDAO();
            default:
                throw new Exception();
        }
    }
}
