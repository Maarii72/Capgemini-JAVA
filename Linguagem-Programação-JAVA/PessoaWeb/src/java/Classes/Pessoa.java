package Classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import utils.Conexao;

public class Pessoa {
    private int idPessoa;
    private String nomePessoa;
    private String email;
    
    public boolean IncluirPessoa(){
        String sql = "insert into pessoa";
               sql += " (nomepessoa, email) ";
               sql += " values(?,?); ";
        Connection con = Conexao.conectar();
        
        try{
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, this.nomePessoa);
            stm.setString(2, this.email);
            stm.execute();
        }
        catch (SQLException ex){
            System.out.println("Erro: " + ex.getMessage() +sql);
            return false;
        }
        return true;
    }
}
