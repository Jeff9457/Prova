package Itens;
public class Piloto extends Pessoa{
    private static String matricula;
    private static String breve;
    // breve = CNH de piloto
    
    public void Matricula(){

    }
    public static String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        Piloto.matricula = matricula;
    }

    public static void Breve(){

    }
    public String getBreve() {
        return breve;
    }
    public void setBreve(String string) {
        Piloto.breve = string;

    }
    
}
