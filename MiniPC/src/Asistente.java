
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jeanp
 */
public class Asistente {
    
    static final String[] REGISTROSVALIDOS = {"AX", "BX", "CX", "DX"};
    static final String[] OPERADORESVALIDO = {"MOV", "LOAD", "ADD", "SUB", "STORE"}; 
    
    public static ArrayList<String[]> validarArchivo(String nombre) throws IOException{
        ArrayList<String[]> lista = convertirArchivoLista(nombre);
        if(lista!= null){
            validarLista(lista);
        }else{
            System.out.println("El archivo seleccionado no es valido");
        }
        System.out.println("Termino la validacion");
        return lista;
    }
    
    
    public static boolean validarLista(ArrayList<String[]> lista){
        System.out.println("Validando lista +++++++++++++++++++++++++");
        int tamanioLista = Arrays.asList(lista).size();
        System.out.println("Tamanio: " + tamanioLista);
        if(tamanioLista>90 || tamanioLista<1) return false;
        for(String [] str : lista){
            System.out.println("op: "+ str[0] + "    registro: "+ str[1] + " valor");
            boolean operadorValido = (Arrays.asList(OPERADORESVALIDO).contains(str[0].toUpperCase()));
            boolean registroValido = (Arrays.asList(REGISTROSVALIDOS).contains(str[1].toUpperCase()));
            boolean esEntero = true;
            if(str.length == 3){
                esEntero = esEntero(str[2]);
            }else{System.out.println("No hay valor");}
            if(!(operadorValido && registroValido && esEntero)){
                System.out.println("operacion invalida");
                return false;
            }
            
        }
        return true;
    }
    
    public static boolean esEntero(String strNum) {
    if (strNum == null) {
        return false;
    }
    try {
        int num = Integer.parseInt(strNum);
    } catch (NumberFormatException nfe) {
        return false;
    }
    return true;
}
    
    //lee el contenido del archivo y lo transforma a una lista de  de listas
    //con la siguiente estructura [[operador, registro, valor(opt)],...,...]
    public static ArrayList<String[]> convertirArchivoLista(String nombre) throws FileNotFoundException, IOException{
        List<String> lineasArchivo = new ArrayList<String>();  
        BufferedReader bf = new BufferedReader(new FileReader(nombre));
        String linea = bf.readLine();
       
        while (linea != null) {
            lineasArchivo.add(linea);
            linea = bf.readLine();
        }
        bf.close();
        
        String[] array = lineasArchivo.toArray(new String[0]);
        ArrayList<String[]> lista = new ArrayList<String[]>();
        
        for (String str : array) {
            System.out.println("entre al loop");
            System.out.println(str);//imprime la instruccion transformada a lista
            String[] instruccion = divideString(str);//agrega dicha lista a la lista de instrucciones
            if(instruccion == null) return null;
            String instruccionStr = Arrays.toString(instruccion);
            System.out.println(instruccionStr);
            lista.add(instruccion);
        }
        System.out.println(Arrays.deepToString(lista.toArray()));//imprime toda la lista de instrucciones
        if(lista.isEmpty()){
            System.out.println("La lista esta vacia");
            return null;
        }
        
        return lista;
    
    }
    
    //divide cada una de las lineas en listas
    //por espacio y coma
    //retorna nulo sino 
    public static String[] divideString(String input) {
        String[] dividido = null;
        String[] lista = input.split(",");
        System.out.println("Asistente.divideString()");
        if (lista.length == 2) {
            dividido = new String[3];
            String valor = lista[1].trim();
            String operadorYRegistro = lista[0].trim();
            
            String[] res = divideStringAux(operadorYRegistro);//dividir primer elemento
            if(res != null){
                dividido[0] = res[0];
                dividido[1] = res[1];
                dividido[2] = valor; // Value
            }else{
                dividido = null;
            }
        }
        else if(lista.length == 1){
            System.out.println("el largo es 1");
            dividido = new String[2];
            String operadorYRegistro = lista[0].trim();          
            String[] res = divideStringAux(operadorYRegistro);//dividir primer elemento
            if(res != null){
                dividido[0] = res[0];
                dividido[1] = res[1];
            }else{
                dividido = null;
            }
        }
        else dividido = null;
        
        return dividido;
    }
    
    //divide el primer elemento que se obtuvo
    //este elemento contiene ambos el operador y el registro
    //se divide en el espacio
    public static String[] divideStringAux(String operadorYRegistro){
        String[] res = new String[2];
        String[] operadorYRegistroLista = operadorYRegistro.split("\\s+");
        if (operadorYRegistroLista.length == 2) {
            res[0] = operadorYRegistroLista[0]; // Operador
            res[1] = operadorYRegistroLista[1]; // registro
            return res;
        }
        return null;
    }
}
