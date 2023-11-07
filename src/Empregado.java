
import java.util.Date;


/**
 *
 * @author Claudia 
 */
public class Empregado {
    private String nome; 
    private String apelido1; 
    private String apelido2; 
    private String NSS; 
    private String rua; 
    private int numeroRua; 
    private String piso; 
    private String cp; 
    private String localidade; 
    private Date dataNacemento; 
    private double salario; 
    private String sexo; 
    private String nssSupervisa; 
    private int numDepartamentoPertenece; 

    //Constructor parametrizado 
    public Empregado(String nome, String apelido1, String apelido2, String NSS, String rua, int numeroRua, String piso, String cp, String localidade, Date dataNacemento, double salario, String sexo, String nssSupervisa, int numDepartamentoPertenece) {
        this.nome = nome;
        this.apelido1 = apelido1;
        this.apelido2 = apelido2;
        this.NSS = NSS;
        this.rua = rua;
        this.numeroRua = numeroRua;
        this.piso = piso;
        this.cp = cp;
        this.localidade = localidade;
        this.dataNacemento = dataNacemento;
        this.salario = salario;
        this.sexo = sexo;
        this.nssSupervisa = nssSupervisa;
        this.numDepartamentoPertenece = numDepartamentoPertenece;
    }
    
    //Getters y setters 

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido1() {
        return apelido1;
    }

    public void setApelido1(String apelido1) {
        this.apelido1 = apelido1;
    }

    public String getApelido2() {
        return apelido2;
    }

    public void setApelido2(String apelido2) {
        this.apelido2 = apelido2;
    }

    public String getNSS() {
        return NSS;
    }

    public void setNSS(String NSS) {
        this.NSS = NSS;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumeroRua() {
        return numeroRua;
    }

    public void setNumeroRua(int numeroRua) {
        this.numeroRua = numeroRua;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public Date getDataNacemento() {
        return dataNacemento;
    }

    public void setDataNacemento(Date dataNacemento) {
        this.dataNacemento = dataNacemento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNssSupervisa() {
        return nssSupervisa;
    }

    public void setNssSupervisa(String nssSupervisa) {
        this.nssSupervisa = nssSupervisa;
    }

    public int getNumDepartamentoPertenece() {
        return numDepartamentoPertenece;
    }

    public void setNumDepartamentoPertenece(int numDepartamentoPertenece) {
        this.numDepartamentoPertenece = numDepartamentoPertenece;
    }

    //ToString()
    @Override
    public String toString() {
        return "Empregado" + "\nnome=" + nome + ", apelido1=" + apelido1 + ", apelido2=" + apelido2 + ", NSS=" + NSS + ", rua=" + rua + ", numeroRua=" + numeroRua + ", piso=" + piso + ", cp=" + cp + ", localidade=" + localidade + ", dataNacemento=" + dataNacemento + ", salario=" + salario + ", sexo=" + sexo + ", nssSupervisa=" + nssSupervisa + ", numDepartamentoPertenece=" + numDepartamentoPertenece + '}';
    }
    
    
}
