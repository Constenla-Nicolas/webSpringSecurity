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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController{
    @Autowired
    private DaoImp uDao;
    

    @RequestMapping(value = "api/prueba/{id}")
    public Usuario getUsuario(@PathVariable int id){
        Usuario user = new Usuario();
        user.setId(id);
        user.setUsername("pablo");
        user.setEmail("email");
        user.setPass("12345");
        
         return user;
    } 

    @RequestMapping(value = "api/usuarios", method = RequestMethod.GET)
    public List<Usuario> getUsuarios(){
        
        return uDao.getUsuarios();
    } 
    @RequestMapping(value = "api/usuarios", method = RequestMethod.DELETE)
    public void deleteUsuarios(int id){
        uDao.delete(id);
      
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
