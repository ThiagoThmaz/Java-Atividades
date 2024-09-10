package Dao;

import br.com.fiap.entities.Pessoa;

import java.sql.SQLException;
import java.util.List;

public interface PessoaDao {

    //TODO: Criar assinatura para Create
    void create(Pessoa pessoa) throws SQLException;

    //TODO: Criar assinatura para Read
    List<Pessoa> read() throws SQLException;

    //TODO: Criar assinatura para Update
    void update(Pessoa pessoa) throws SQLException;

    //TODO: Criar assinatura para Delete
    void delete(Long id) throws SQLException;
}
