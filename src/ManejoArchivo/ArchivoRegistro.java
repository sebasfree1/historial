package ManejoArchivo;

import Registro.Paciente;
import java.io.*;
import java.util.ArrayList;

public class ArchivoRegistro {

    public static String gueardarPacieente(Paciente paciente) {
        FileWriter archivo = null;
        PrintWriter escritor = null;
        String respuesta;
        try {
            archivo = new FileWriter("C:/ArchivoPaciente/RegistroPaciente.txt");
            escritor = new PrintWriter(archivo);
            escritor.print(paciente.getIdentificacion() + ";");
            escritor.print(paciente.getNombre() + ";");
            escritor.print(paciente.getGenero() + ";");
            escritor.print(paciente.getTiposangre() + ";");
            escritor.print(paciente.getDescripcion() + ";");
            respuesta = "Guardado Corretamente";
        } catch (Exception error) {
            System.out.print(error.getMessage());
            respuesta = "No pudo guardar: " + error.getMessage();
        } finally {
            if (escritor != null) {
                escritor.close();
            }
        }
        return respuesta;
    }

    public static String guardarlistaPacinte(ArrayList<Paciente> lista) {
        FileWriter archivo = null;
        PrintWriter escritor = null;
        String respuesta;
        try {
            archivo = new FileWriter("C:/ArchivoPaciente/RegistroPaciente.txt");
            escritor = new PrintWriter(archivo);
            for (Paciente paciente : lista) {
                escritor.print(paciente.getIdentificacion() + ";");
                escritor.print(paciente.getNombre() + ";");
                escritor.print(paciente.getGenero() + ";");
                escritor.print(paciente.getTiposangre() + ";");
                escritor.print(paciente.getDescripcion() + ";");

            }
            respuesta = "Guardado Corretamente";
        } catch (IOException error) {
            System.out.print(error.getMessage());
            respuesta = "No pudo Guardar" + error.getMessage();
        } finally {
            if (escritor != null) {
                escritor.close();
            }
        }
        return respuesta;
    }

    public static ArrayList<Paciente> leerArchivo() {
        File file;
        FileReader fileReader = null;
        BufferedReader lector;
        ArrayList<Paciente> lista = new ArrayList<>();

        try {
            file = new File("C:/ArchivoPaciente/RegistroPaciente.txt");
            fileReader = new FileReader(file);
            lector = new BufferedReader(fileReader);
            String linea, valores[];
            Paciente paciente;
            while ((linea = lector.readLine()) != null) {
                try {
                    valores = linea.split(";");
                    paciente = new Paciente();
                    paciente.setIdentificacion(Integer.parseInt(valores[0]));
                    paciente.setNombre(valores[1]);
                    paciente.setGenero(valores[2]);
                    paciente.setTiposangre(valores[3]);
                    paciente.setDescripcion(valores[4]);
                    lista.add(paciente);
                } catch (NumberFormatException error) {
                }
            }
        } catch (IOException error) {
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException error) {}
            }
        }

        
        return lista;
    }
}


