import br.edu.unirn.model.Usuario


def usuario = new Usuario(email:"romulo.fagundes@gmail.com",id:1)

def usuario2 = new Usuario(id:1)

if(usuario == usuario2){
    println "É igual!"
}else{
    println "É diferente"
}
