import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileGenerator{
  
    public static void main(String[] args){
        //Datos de entrada
        int[] input = {2, 1, 3};

        //Genera archivo de entrada
        generateInputFile(input);

        //Ejecuta la solución y redirige la entrada y salida mediante comandos en la línea de comandos:
        //java NombreCLase < in.txt > out.txt
    }

    public static void generateInputFile(int[] input){
        try{
            FileWriter fileWriter = new FileWriter("in.txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);

            //Escribir los datos de entrada en el archivo
            for (int i : input){
                printWriter.println(i);
            }
            printWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void generateOutputFile(boolean output){
        try{
            FileWriter fileWriter = new FileWriter("out.txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);

            //Escribe el resultado en el archivo de salida
            printWriter.println(output);
            printWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
