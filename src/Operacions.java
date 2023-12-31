import java.sql.*;
import java.time.LocalDate;
import java.util.*;

/**
 *                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
 *
 * @author Claudia
 */
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
public class Operacions {

    //Atributos 
    public Connection conexion;

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
        //Necesito crear una consulta sql para meter los datos introducidos. NOMBRES DE TABLAS (workbench) VALUES(los míos)
        String cadeaSql = "INSERT INTO Empregado(Nome,Apelido_1,Apelido_2,NSS,Rua,Numero_rua,Piso,CP, Localidade,Data_nacemento,Salario,Sexo, NSS_Supervisa, Num_departamento_pertenece"
                + " VALUES nome,apelido1apelido2,NSS, rua, numeroRua,piso,cp,localidade,dataNacemento,salario,sexo,nssSupervisa,numDepartamentoPertenece ";
//
//        String nome = empregado.getNome();
//        String apelido1 = empregado.getApelido1();
//        String apelido2 = empregado.getApelido2();
//        String NSS = empregado.getNSS();
//        String rua = empregado.getRua();
//        int numeroRua = empregado.getNumeroRua();
//        String piso = empregado.getPiso();
//        char cp = empregado.getCp();
//        String localidade = empregado.getLocalidade();
//        Date dataNacemento = empregado.getDataNacemento();
//        double salario = empregado.getSalario();
//        char sexo = empregado.getSexo();
//        String nssSupervisa = empregado.getNssSupervisa();
//        int numDepartamentoPertenece = empregado.getNumDepartamentoPertenece();
//
//       
//        int resultado;
        //prepara la plantilla de la consulta 
        //Lo metemos en un try 
        PreparedStatement engade = conexion.prepareStatement(cadeaSql);
        engade.setString(1, empregado.getNome());
        engade.setString(2, empregado.getApelido1());
        engade.setString(3, empregado.getApelido2());
        engade.setString(4, empregado.getNSS());
        engade.setString(5, empregado.getRua());
        engade.setInt(6, empregado.getNumeroRua());
        engade.setString(7, empregado.getPiso());
        engade.setString(8, empregado.getCp());
        engade.setString(9, empregado.getLocalidade());
        engade.setDate(10, Date.valueOf(empregado.getDataNacemento()));
        engade.setDouble(11, empregado.getSalario());
        engade.setString(12, empregado.getSexo());
        engade.setString(13, empregado.getNssSupervisa());
        engade.setInt(14, empregado.getNumDepartamentoPertenece());

        int resultado = engade.executeUpdate();
        return resultado;
    }

//Actualizar datos empregado 
//Introducir novos proxectos 
    public int addProxecto(Proxecto proxecto) throws Exception {

        String insertSQL = "INSERT INTO proxecto (num_proxecto, nombre_proxecto, lugar, num_departamento) VALUES (?, ?, ?, ?)";

        PreparedStatement statement = conexion.prepareStatement(insertSQL);
        statement.setInt(1, proxecto.getNumProxecto());
        statement.setString(2, proxecto.getNomeProxecto());
        statement.setString(3, proxecto.getLugar());
        statement.setInt(4, proxecto.getNumDepartamentoControla());

        int resultado = statement.executeUpdate();

        System.out.println("Proxecto insertado con éxito.");
        return resultado;

//        int numProxecto = proxecto.getNumProxecto();
//        String nomeProxecto = proxecto.getNomeProxecto();
//        String lugar = proxecto.getLugar();
//        int numDepartamentoControla = proxecto.getNumDepartamentoControla();
//        //Creamos la cadena SQL 
//        String cadeaSql = "INSERT INTO Proxecto (Num_proxecto, Nome_proxecto, Lugar, Num_departamento) VALUES (?, ?";
//        int resultado;
////Preparamos la plantilla 
//        try (PreparedStatement engadeP = conexion.prepareStatement(cadeaSql)) {
//
//            //Los añadimos 
//            engadeP.setInt(1, numProxecto);
//            engadeP.setString(2, nomeProxecto);
//            engadeP.setString(3, lugar);
//            engadeP.setInt(4, numDepartamentoControla);
//            resultado = engadeP.executeUpdate();
//        }
//        return resultado;
    }

    //Añadir departamento
    public int addDepartamento(Departamento departamento) throws SQLException {
        //Preparo la consulta 
        String insertSQL = "INSERT INTO departamento (num_departamento, nombre_departamento, NSS_dirixe, data_direccion) VALUES (?, ?, ?, ?)";
        //Preparo la plantilla con la consulta
        PreparedStatement statement = conexion.prepareStatement(insertSQL);
        statement.setInt(1, departamento.getNumDepartamento());
        statement.setString(2, departamento.getNomeDepartamento());
        statement.setString(3, departamento.getNssDirige());
        statement.setInt(4, Date.valueOf(departamento.getDataDireccion()));

        int resultado = statement.executeUpdate();

        System.out.println("Departamento insertado con éxito.");
        return resultado;
    }

    //Modificar empregado
    public int updateEmpregado(Empregado empregado) throws SQLException {
        String updateSQL = "UPDATE empregado SET nome = ?, apellido1 = ?, apellido2 = ?, rua = ?, numero_rua = ?, piso = ?, CP = ?, localidade = ?, data_nacemento = ?, salario = ?, sexo = ?, NSS_supervisor = ?, num_departamento = ? WHERE NSS = ?";

        PreparedStatement statement = conexion.prepareStatement(updateSQL);
        statement.setString(1, empregado.getNome());
        statement.setString(2, empregado.getApelido1());
        statement.setString(3, empregado.getApelido2());
        statement.setString(4, empregado.getRua());
        statement.setInt(5, empregado.getNumeroRua());
        statement.setString(6, empregado.getPiso());
        statement.setString(7, empregado.getCp());
        statement.setString(8, empregado.getLocalidade());
        statement.setDate(9, Date.valueOf(empregado.getDataNacemento()));
        statement.setDouble(10, empregado.getSalario());
        statement.setString(11, empregado.getSexo());
        statement.setString(12, empregado.getNssSupervisa());
        statement.setInt(13, empregado.getNumDepartamentoPertenece());
        statement.setString(14, empregado.getNSS());

        int resultado = statement.executeUpdate();

        System.out.println("Empleado modificado correctamente.");
        return resultado;
    }

    //metodo para modificar un proxecto
    public int updateProxecto(Proxecto proxecto) throws SQLException {

        String insertSQL = "UPDATE proxecto nome_proxecto = ?, lugar=?, num_departamento=? WHERE num_proxecto = ?";

        PreparedStatement statement = conexion.prepareStatement(insertSQL);
        statement.setString(1, proxecto.getNomeProxecto());
        statement.setString(2, proxecto.getLugar());
        statement.setInt(3, proxecto.getNumDepartamentoControla());
        statement.setInt(4, proxecto.getNumProxecto());

        int resultado = statement.executeUpdate();

        System.out.println("Proxecto insertado correctamente.");
        return resultado;
    }

//Modificar departamento
    public int updateDepartamento(Departamento departamento) throws SQLException {
        String updateSQL = "UPDATE departamento SET nombre_departamento = ?, NSS_dirixe = ?, data_direccion = ? WHERE num_departamento = ?";

        PreparedStatement statement = conexion.prepareStatement(updateSQL);
        statement.setString(1, departamento.getNomeDepartamento());
        statement.setString(2, departamento.getNssDirige());
        statement.setDate(3, Date.valueOf(departamento.getDataDireccion()));
        statement.setInt(4, departamento.getNumDepartamento());

        int resultado = statement.executeUpdate();

        System.out.println("Departamento modificado correctamente.");
        return resultado;
    }
    //Eliminar empregado 

    public int deleteEmpregado(String NSS) throws SQLException {
        String deleteSQL = "DELETE FROM empregado WHERE NSS = ?";

        PreparedStatement statement = conexion.prepareStatement(deleteSQL);
        statement.setString(1, NSS);

        int resultado = statement.executeUpdate();

        return resultado;
    }

    //metodo para eliminar un proxecto
    public int deleteProxecto(int num_proxecto) throws SQLException {
        String deleteSQL = "DELETE FROM proxecto WHERE num_proxecto = ?";

        PreparedStatement statement = conexion.prepareStatement(deleteSQL);
        statement.setInt(1, num_proxecto);

        int resultado = statement.executeUpdate();

        return resultado;
    }

    //Eliminar departamento 
    public int eliminarDepartamento(int num_departamento) throws SQLException {
        String deleteSQL = "DELETE FROM departamento WHERE num_departamento = ?";

        PreparedStatement statement = conexion.prepareStatement(deleteSQL);
        statement.setInt(1, num_departamento);

        int resultado = statement.executeUpdate();

        return resultado;
    }

    //Crear tabla 
    public void crearTablaLugar() throws SQLException {
        Statement statement = conexion.createStatement();

        String createTableSQL = "CREATE TABLE IF NOT EXISTS Lugar ("
                + "LugarID INT AUTO_INCREMENT PRIMARY KEY,"
                + "Lugar VARCHAR(255) NOT NULL,"
                + "Num_departamento INT NOT NULL,"
                + "FOREIGN KEY (Num_departamento) REFERENCES departamento(num_departamento)"
                + ")";

        statement.executeUpdate(createTableSQL);

        System.out.println("Tabla 'Lugar' creada correctamente.");
    }

}
