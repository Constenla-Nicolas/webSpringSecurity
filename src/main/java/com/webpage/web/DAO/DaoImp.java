package com.webpage.web.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.webpage.web.Modelos.Usuario;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
@Transactional

public class DaoImp implements UserDao{
    @PersistenceContext
    private EntityManager eManager;//hace la conexion con la bdd
  
    //hace literalmente la consulta sql
    @Override
    public List<Usuario> getUsuarios() {
        String query="FROM Usuario"; //este "Usuario" es la clase Usuario.java, adentro de la clase se indica a que tabla sql va la consulta

        return eManager.createQuery(query).getResultList();
       
      
    }
    
}
