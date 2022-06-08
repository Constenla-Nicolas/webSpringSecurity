// Call the dataTables jQuery plugin
$(document).ready(function() {
  let userlist="";
  var respuesta="";
  cargarUsuarios();
  
  $('#dataTable').DataTable();
  


  async function cargarUsuarios() {
     //fetch sirve para llamar a bdd, en este caso la de tomcat que es en la que corre la app con spring, get es para sacar datos, pull es para actualizar/carga datos
      const request = await fetch('usuarios', {
        method: 'GET',
        headers: {
          'Accept': 'application/json',
          'Content-Type': 'application/json'
        },
        
      });
      //guarda la respuesta del fetch hacia la url "personajes" en una constante, esa respuesta es de objeto personaje.java
       respuesta = await request.json();
      console.log(respuesta);

  //    let userlist ="";
      for(let user of respuesta){
      //atributo con codigo html y datos sacados de personajeController.java
      let userhtml='<tr ><td>'
      +user.iduser+ '</td><td>'
      +personaje.username+'</td><td>'
      +"Edinburgh"+'</td><td>'
      +"61"+'</td><td>'
      +"2011/04/25"+'</td><td>'
      +' <a href="#"   class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"></i></a></td></tr>'
      
      userlist+=userhtml;
    }
      //llama al documento html, mas especifico al tbody del objeto con id dataTable para cambar el outerHTML, lo iguala a la tabla de personajes
      document.querySelector('#dataTable tbody').outerHTML= userlist;
      console.log("macri gato");
      ReaccionarBtn();
  }

  function BorrarPersonaje(params) {
    
  }

  function ReaccionarBtn() {
      
  let btn =  document.getElementsByClassName("btn btn-danger btn-circle btn-sm");
  var arr = Array.prototype.slice.call(btn)

  for(var i in arr){
    arr[i].onclick= function() {
      console.log("apretaste un boton")
      BorrarPersonajes()
    }
    i++;
  }
 
  }

 

});
