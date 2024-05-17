package br.com.alura.screenmatch.model;

public enum Categoria {

    // Limitação de valores:
    ACAO("Action", "Ação"),
    ROMANCE("Romance", "Romance"),
    COMEDIA("Comedy", "Comédia"),
    DRAMA("Drama", "Drama"),
    CRIME("Crime", "Crime"),
    ANIMACAO("Animation", "Animação");

    // Adiciona uma correpondência ao enum
    private String categoriaOmdb;

    private String categoriaPortugues;

    // Construtor de correspondência
    Categoria(String categoriaOmdb, String categoriaPortugues){

        this.categoriaOmdb = categoriaOmdb;
        this.categoriaPortugues = categoriaPortugues;
    }

    // Método statico auxiliar c/ Match dinâmica
    public static Categoria fromString(String text) {
        for (Categoria categoria : Categoria.values()) {
            if (categoria.categoriaOmdb.equalsIgnoreCase(text)) {
                return categoria;
            }
        }
        throw new IllegalArgumentException("Nenhuma categoria encrontrada para a série!");
    }

    public static Categoria fromPortugues(String text) {
        for (Categoria categoria : Categoria.values()) {
            if (categoria.categoriaPortugues.equalsIgnoreCase(text)) {
                return categoria;
            }
        }
        throw new IllegalArgumentException("Nenhuma categoria encrontrada para a série!");
    }
}
