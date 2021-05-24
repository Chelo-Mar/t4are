
/**
 * Write a description of class organizador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class organizador
{
    private double[] notas;
    private int   cantEst;
    private int   cantAprob;
    private int   cantRep;
    
    public String añadirNotas(int numEst , double nota){
        String reporte = "";
        if((numEst-1) >= 0 && (numEst-1) < notas.length){
            notas[numEst - 1] = nota;
            reporte ="Numero estudiante: "+ numEst + " Nota agregada: " + nota + " Nota añadida exitosamente.";
        }else{
            reporte = "El numero de estuadiante: " + numEst + " no se encuentra en el registro.";
        }
        return reporte;
    }
    public double promedioNotas(){
        double promedio = 0.0;
        for(double n : notas){
            promedio = promedio + n;
        }
        promedio = promedio / cantEst;
        return promedio;
    }

        private void contarAprobados(){
        int aprobados = 0;
        for(double n : notas){
            if(n > 51){
                aprobados++;
            }
        }
        cantAprob = aprobados;
    }
}
