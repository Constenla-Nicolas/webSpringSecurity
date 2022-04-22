// Call the dataTables jQuery plugin
$(document).ready(function() {
  let userlist="";
  var respuesta="";
  cargarusuarios();
  
  $('#dataTable').DataTable();
  


  async function cargarusuarios() {
     //fetch sirve para llamar a bdd, en este caso la de tomcat que es en la que corre la app con spring, get es para sacar datos, pull es para actualizar/carga datos
      const request = await fetch('api/usuarios', {
        method: 'GET',
        headers: {
          'Accept': 'application/json',
          'Content-Type': 'application/json'
        },
        
      });
      //guarda la respuesta del fetch hacia la url "usuarios" en una constante, esa respuesta es de objeto Usuario.java
       respuesta = await request.json();
      console.log(respuesta);

  //    let userlist ="";
      for(let usuario of respuesta){
      //atributo con codigo html y datos sacados de UsuarioController.java
      let usuariohtml='<tr ><td>'
      +usuario.id+ '</td><td>'
      +usuario.username+'</td><td>'
      +"Edinburgh"+'</td><td>'
      +"61"+'</td><td>'
      +"2011/04/25"+'</td><td>'
      +' <a href="#"   class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"></i></a></td></tr>'
      
      userlist+=usuariohtml;
    }
      //llama al documento html, mas especifico al tbody del objeto con id dataTable para cambar el outerHTML, lo iguala a la tabla de usuarios
      document.querySelector('#dataTable tbody').outerHTML= userlist;
      console.log("macri gato");
      ReaccionarBtn();
  }
  function ReaccionarBtn() {
      
  let btn =  document.getElementsByClassName("btn btn-danger btn-circle btn-sm");
  var arr = Array.prototype.slice.call(btn)

  for(var i in arr){
    arr[i].onclick= function() {
      //codigo aca
    }
    i++;
  }
 
  }

 

});
