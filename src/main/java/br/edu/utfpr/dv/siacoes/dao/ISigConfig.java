package br.edu.utfpr.dv.siacoes.dao;

import br.edu.utfpr.dv.siacoes.model.SigacConfig;
import br.edu.utfpr.dv.siacoes.model.SigesConfig;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface ISigConfig {

    Object findByDepartment(int idDepartment) throws SQLException;
    int save(int idUser, Object config) throws SQLException;

}
