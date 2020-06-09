package schmidt.pedro.ProjetoExemploGradle.model;

public class Aluno {
    private double nota1;
    private double nota2;

    public Aluno() {
    }

    public Aluno(double nota1, double nota2) {
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double calcularMedia() {
        return (this.nota1 + this.nota2) /2;
    }

    @Override
    public String toString() {
        return  "\nnota 1: " + nota1 +
                "\nnota 2: " + nota2 +
                "\nMédia: " + this.calcularMedia();
    }
}
