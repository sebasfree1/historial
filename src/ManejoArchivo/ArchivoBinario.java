/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManejoArchivo;
import Registro.Paciente;
import java.io.*;



import java.util.ArrayList;

/**
 *
 * @author INSTEBEHO
 */
public class ArchivoBinario implements Serializable{
    
    public static void main(String[] args) {
        
    }
    
    /**
     *
     * @return
     */
    public static ArrayList<Paciente> leerArchivo(){
       ObjectInputStream lector = null;
       ArrayList<Paciente> lista = new ArrayList<>();
       try{
           lector = new ObjectInputStream(new FileInputStream("C:/ArchivoPaciente/RegistroPaciente.txt"));
           lista= (ArrayList<Paciente>) lector.readObject();
       }catch(IOException | ClassNotFoundException ex){
           System.out.println(ex);
       }finally{
           try{
               if (lector  != null){
                   lector.close();
               }
           }catch(IOException err){   
           }
       }
        return lista;
    }
    
    public static void escribirArchivo(ArrayList<Paciente> lista){
        ObjectOutputStream escritor = null;
        try{
            escritor = new ObjectOutputStream(new FileOutputStream("C:/ArchivoPaciente/RegistroPaciente.txt"));
            escritor.writeObject(lista);
        }catch(IOException ex){
        } finally {
            try{
                if (escritor != null){
                escritor.close();
                }
            }catch (IOException err){
                
            }    
        }
    }


    
  }

