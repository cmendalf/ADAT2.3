

/**
 *
 * @author Claudia
 */
public class Empregado_Proxecto {
    private String nssEmpregado; 
    private int numProxecto; 
    private int horasSemanais; 

    //Constructor parametrizado 
    public Empregado_Proxecto(String nssEmpregado, int numProxecto, int horasSemanais) {
        this.nssEmpregado = nssEmpregado;
        this.numProxecto = numProxecto;
        this.horasSemanais = horasSemanais;
    }
    //Getters y setters
    public String getNssEmpregado() {
        return nssEmpregado;
    }

    public void setNssEmpregado(String nssEmpregado) {
        this.nssEmpregado = nssEmpregado;
    }

    public int getNumProxecto() {
        return numProxecto;
    }

    public void setNumProxecto(int numProxecto) {
        this.numProxecto = numProxecto;
    }

    public int getHorasSemanais() {
        return horasSemanais;
    }

    public void setHorasSemanais(int horasSemanais) {
        this.horasSemanais = horasSemanais;
    }

    @Override
    public String toString() {
        return "EMPREGADO PROXECTO: " + "\nNss Empregado: " + nssEmpregado + "\nNumero Proxecto: " + numProxecto + "\nHoras Semanais: " + horasSemanais;
    }
    
    
    
    
    
    
}
