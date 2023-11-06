

/**
 *
 * @author Claudia 
 */
public class Proxecto {
    private int numProxecto; 
    private String nomeProxecto; 
    private String lugar; 
    private int numDepartamentoControla; 

    //Constructor parametrizado 
    public Proxecto(int numProxecto, String nomeProxecto, String lugar, int numDepartamentoControla) {
        this.numProxecto = numProxecto;
        this.nomeProxecto = nomeProxecto;
        this.lugar = lugar;
        this.numDepartamentoControla = numDepartamentoControla;
    }

    //Getters y setters
    public int getNumProxecto() {
        return numProxecto;
    }

    public void setNumProxecto(int numProxecto) {
        this.numProxecto = numProxecto;
    }

    public String getNomeProxecto() {
        return nomeProxecto;
    }

    public void setNomeProxecto(String nomeProxecto) {
        this.nomeProxecto = nomeProxecto;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getNumDepartamentoControla() {
        return numDepartamentoControla;
    }

    public void setNumDepartamentoControla(int numDepartamentoControla) {
        this.numDepartamentoControla = numDepartamentoControla;
    }
    
    //ToString(); 

    @Override
    public String toString() {
        return "PROXECTO" + "\nnumProxecto: " + numProxecto + "\nNome Proxecto: " + nomeProxecto + "\nLugar: " + lugar + "\nNumero Departamento Controla: " + numDepartamentoControla;
    }
    
    
    
    
    
}
