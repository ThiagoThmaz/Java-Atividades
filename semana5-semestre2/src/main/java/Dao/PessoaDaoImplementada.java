package Dao;

import br.com.fiap.entities.Pessoa;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PessoaDaoImplementada implements PessoaDao {

    private final Connection connection;

    public PessoaDaoImplementada(Connection connection) {
        this.connection = connection;
    }

    //TODO: Refatorar na próxima aula
    @Override
    public void create(Pessoa pessoa) throws SQLException {
        String sql = "INSERT INTO PESSOA_1TDSPJ(id,name,idade) VALUES (?, ?, ?)";
        PreparedStatement pstmt = connection.prepareStatement(sql);
        pstmt.setLong(1, pessoa.getId());
        pstmt.setString(2, pessoa.getNome());
        pstmt.setInt(3,pessoa.getIdade());
        pstmt.executeUpdate();
    }


    List<Pessoa> result = new ArrayList<>();

    @Override
    public List<Pessoa> read() throws SQLException {
        String sql = "select * from pessoa_1tdspj";
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()){
            long id = rs.getLong("id");
            String name = rs.getString("name");
            int idade = rs.getInt("idade");
            result.add(new Pessoa(id,name,idade));
        }

        return result;

    }

    @Override
    public void update(Pessoa pessoa) throws SQLException {
        String sql = "UPDATE pessoa_1tdspj SET name = ?, idade = ? WHERE id = ?";
        PreparedStatement psmp = connection.prepareStatement(sql);
        psmp.setString(1, pessoa.getNome());
        psmp.setInt(2, pessoa.getIdade());
        psmp.setLong(3, pessoa.getId());

        psmp.executeUpdate();
    }

    @Override
    public void delete(Long id) throws SQLException {
        String sql = "DELETE FROM pessoa_1tdspj WHERE id = ?";
        PreparedStatement pstmt = connection.prepareStatement(sql);
        pstmt.setLong(1, id);

        pstmt.executeUpdate();
    }
}
