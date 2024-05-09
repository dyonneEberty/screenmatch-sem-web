package br.com.alura.screenmatch.model;

public enum Categoria {

    // Limitação de valores:
    ACAO("Action"),
    ROMANCE("Romance"),
    COMEDIA("Comedy"),
    DRAMA("Drama"),
    CRIME("Crime");

    // Adiciona uma correpondência ao enum
    private String categoriaOmdb;

    // Construtor de correspondência
    Categoria(String categoriaOmdb){
        this.categoriaOmdb = categoriaOmdb;
    }

    // Método statico auxiliar c/ Match dinâmico
    public static Categoria fromString(String text) {
        for (Categoria categoria : Categoria.values()) {
            if (categoria.categoriaOmdb.equalsIgnoreCase(text)) {
                return categoria;
            }
        }
        throw new IllegalArgumentException("Nenhuma categoria encrontrada para a série!");
    }
}
