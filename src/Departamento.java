
import java.util.Date;



/**
 *
 * @author Claudia 
 */
public class Departamento {
    private int numDepartamento; 
    private String nomeDepartamento; 
    private String nssDirige; 
    private Date dataDireccion; 

    //Constructor parametrizado 
    public Departamento(int numDepartamento, String nomeDepartamento, String nssDirige, Date dataDireccion) {
        this.numDepartamento = numDepartamento;
        this.nomeDepartamento = nomeDepartamento;
        this.nssDirige = nssDirige;
        this.dataDireccion = dataDireccion;
    }

    
    //Getters y setters
    public int getNumDepartamento() {
        return numDepartamento;
    }

    public void setNumDepartamento(int numDepartamento) {
        this.numDepartamento = numDepartamento;
    }

    public String getNomeDepartamento() {
        return nomeDepartamento;
    }

    public void setNomeDepartamento(String nomeDepartamento) {
        this.nomeDepartamento = nomeDepartamento;
    }

    public String getNssDirige() {
        return nssDirige;
    }

    public void setNssDirige(String nssDirige) {
        this.nssDirige = nssDirige;
    }

    public Date getDataDireccion() {
        return dataDireccion;
    }

    public void setDataDireccion(Date dataDireccion) {
        this.dataDireccion = dataDireccion;
    }

    @Override
    public String toString() {
        return "DEPARTAMENTO" + "\nnumDepartamento: " + numDepartamento + "\nNome Departamento: " + nomeDepartamento + "\nNss Dirige: " + nssDirige + "\nData Direccion: " + dataDireccion;
    }
    
    
    
}
