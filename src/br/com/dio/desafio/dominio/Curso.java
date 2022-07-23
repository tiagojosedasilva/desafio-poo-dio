package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

    //Atributos
    private int cargaHoraria;

    //Métodos

    @Override
    public double calcularXp() {
        return XP_PARAO * cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }


}
