package it.exolab.dao;

import org.apache.ibatis.session.SqlSession;

import it.exolab.mapper.UtenteMapper;
import it.exolab.model.Utente;
import it.exolab.util.MyBatisUtils;

public class UtenteDao implements UtenteMapper{

	public void insert(Utente utente) {
		SqlSession session = MyBatisUtils.getSqlSessionFactory().openSession();
		UtenteMapper mapper = session.getMapper(UtenteMapper.class);
		mapper.insert(utente);
		session.commit();
		session.close();
	}
	
}
