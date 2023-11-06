
/**
 *
 * @author node
 */
//Abro conexion
//CierroConexion 

/*
EXERCICIO 2: 
MÉTODOS 
b) Mediante NetBeans deberemos actualizar os datos de un empregado, introducir novos proxectos e
consultar os datos dos empregados, dos departamentos e dos proxectos e sacalos por pantalla.

Exercicio 3. Execución de sentenzas de descrición de datos (DDL) dende a linguaxe Java
Crea un programa en java cun método que cree unha táboa na base de datos BDEmpresa en MySQL, para
gardar os lugares onde está situado un departamento (un departamento pode estar situado en máis dun lugar).
A táboa chámase Lugar e ten dous campos: Lugar que almacena o nome do lugar e Num_dep
 */
import java.sql.*;
import java.util.*;
import java.util.Date;

public class Operacions {

    //Atributos 
    private Connection conexion;

    public Connection getConnection() {
        return conexion;
    }

    //Abro la conexión 
    public void abrirConexion() throws SQLException, Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/bdempresa";
        String username = "root";
        String password = "Abc123.,";
        conexion = DriverManager.getConnection(url, username, password);
    }

    //Cierro la conexión 
    public void cerrarConexion() throws Exception {
        conexion.close();
    }

    //Añadir empleado
    public int addEmpregado(Empregado empregado) throws Exception {

        String nome = empregado.getNome();
        String apelido1 = empregado.getApelido1();
        String apelido2 = empregado.getApelido2();
        String NSS = empregado.getNSS();
        String rua = empregado.getRua();
        int numeroRua = empregado.getNumeroRua();
        String piso = empregado.getPiso();
        char cp = empregado.getCp();
        String localidade = empregado.getLocalidade();
        Date dataNacemento = empregado.getDataNacemento();
        double salario = empregado.getSalario();
        char sexo = empregado.getSexo();
        String nssSupervisa = empregado.getNssSupervisa();
        int numDepartamentoPertenece = empregado.getNumDepartamentoPertenece();

        //Necesito crear una consulta sql para meter los datos introducidos. NOMBRES DE TABLAS (workbench) VALUES(los míos)
        String cadeaSql = "INSERT INTO Empregado(Nome,Apelido_1,Apelido_2,NSS,Rua,Numero_rua,Piso,CP, Localidade,Data_nacemento,Salario,Sexo, NSS_Supervisa, Num_departamento_pertenece"
                + " VALUES nome,apelido1apelido2,NSS, rua, numeroRua,piso,cp,localidade,dataNacemento,salario,sexo,nssSupervisa,numDepartamentoPertenece ";

        int resultado;
        //prepara la plantilla de la consulta 
        //Lo metemos en un try 
        try (PreparedStatement engade = conexion.prepareStatement(cadeaSql)) {
            engade.setString(1, nome);
            engade.setString(2, apelido1);
            engade.setString(3, apelido2);
            engade.setString(4, NSS);
            engade.setString(5, rua);
            //int numero rua 
            engade.setInt(6, numeroRua);
            engade.setString(7, piso);

            engade.setString(8, String.valueOf(cp));
            engade.setString(9, localidade);
            engade.setDate(10, Date.valueOf(dataNacemento));
            engade.setDouble(11, salario);
            engade.setString(12, String.valueOf(sexo));
            engade.setString(13, nssSupervisa);
            engade.setInt(14, numDepartamentoPertenece);
            //
            resultado = engade.executeUpdate();
        }
        return resultado;
    }
//Actualizar datos empregado 

//Introducir novos proxectos 
    public int addProxecto(Proxecto proxecto) throws Exception {
        int numProxecto = proxecto.getNumProxecto();
        String nomeProxecto = proxecto.getNomeProxecto();
        String lugar = proxecto.getLugar();
        int numDepartamentoControla = proxecto.getNumDepartamentoControla();
        //Creamos la cadena SQL 
        String cadeaSql = "INSERT INTO Proxecto (Num_proxecto, Nome_proxecto, Lugar, Num_departamento) VALUES (numProxecto, nomeProxecto, lugar, numDepartamentoControla";
        int resultado;
//Preparamos la plantilla 
        try (PreparedStatement engadeP = conexion.prepareStatement(cadeaSql)) {

            //Los añadimos 
            engadeP.setInt(1, numProxecto);
            engadeP.setString(2, nomeProxecto);
            engadeP.setString(3, lugar);
            engadeP.setInt(4, numDepartamentoControla);
            resultado = engadeP.executeUpdate();
        }
        return resultado;
    }

//consultar datos dos empregados 
//
}
