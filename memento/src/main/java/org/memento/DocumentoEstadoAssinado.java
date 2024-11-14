package org.memento;

public class DocumentoEstadoAssinado implements DocumentoEstado {

    private DocumentoEstadoAssinado() {
    }

    private static DocumentoEstadoAssinado instance = new DocumentoEstadoAssinado();

    public static DocumentoEstadoAssinado getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Documento Assinado";
    }
}
