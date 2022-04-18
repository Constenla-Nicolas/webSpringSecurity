package com.webpage.web.Controladores;
 

 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.webpage.web.DAO.DaoImp;
import com.webpage.web.DAO.UserDao;
import com.webpage.web.Modelos.Usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController{
    @Autowired
    private UserDao uDao;
    

    @RequestMapping(value = "prueba/{id}")
    public Usuario getUsuario(@PathVariable int id){
        Usuario user = new Usuario(id);
        
        user.setUsername("pablo");
        user.setEmail("email");
        user.setPassword("12345");
        
        return user;
    } 

    @RequestMapping(value = "usuarios")
    public List<Usuario> getUsuarios(){
        return uDao.getUsuarios();
      
    } 
    
    // @RequestMapping(value = "prueba")
    // public Usuario editaUsuario(){
    //     Usuario user = new Usuario();
    //     user.setUsername("pablo");
    //     user.setEmail("email");
    //     user.setPassword("12345");
        
    //     return user;
    // }
    
    // @RequestMapping(value = "prueba")
    // public Usuario eliminaUsuario(){
    //     Usuario user = new Usuario();
    //     user.setUsername("pablo");
    //     user.setEmail("email");
    //     user.setPassword("12345");
        
    //     return user;
    // }
    // @RequestMapping(value = "prueba")
    // public Usuario buscarUsuario(){
    //     Usuario user = new Usuario();
    //     user.setUsername("pablo");
    //     user.setEmail("email");
    //     user.setPassword("12345");
        
    //     return user;
    // }
    
     
    
}
