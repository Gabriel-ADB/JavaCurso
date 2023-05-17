

package Ejercicios;

 // @author Gabriel
import Entidades.Curso;
import Servicio.CursoService;





public class EjercicioCurso {

   
    public static void main(String[] args) {
        
        CursoService service = new CursoService();
        
        Curso cursito1 = new Curso();
        
        
        service.crearCurso(cursito1);
        service.GananciaSemanal(cursito1);
        service.verCurso(cursito1);
        
        
     
        
       
       
    }

}
