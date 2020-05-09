package lab1;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.xml.internal.bind.v2.model.core.TypeRef;
import jdk.internal.org.objectweb.asm.TypeReference;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class pregunta2 {

    public void listraPersonas(){
        ObjectMapper objectMapper = new ObjectMapper();
        //Path path = Paths.get(this.getClass().getResource("/personas.json").toURI());
        ListaPErsonas personas2 = null;

        try {
            personas2 = objectMapper.readValue(this.getClass().getResource("/personas.json"), ListaPErsonas.class);
            for (Persona personas: personas2.listaper) {
                String impreso = personas.getNombre() + " " + personas.getApellido()+ " " + personas.getGenero()+ " " + personas.getEmail()+ " "
                        + personas.getFecha_nacimiento() + " " +  personas.getPeso() + " " + personas.getDireccion_ip();
                System.out.println(impreso);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void crearPersonas(){
        Scanner sc = new Scanner(System.in);
        Persona persona = new Persona();
        System.out.print("Nombre: ");
        persona.setNombre(sc.nextLine());
        System.out.print("Apellido: ");
        persona.setApellido(sc.nextLine());
        System.out.print("Email: ");
        persona.setEmail(sc.nextLine());
        System.out.print("Peso: ");
        persona.setPeso(Double.parseDouble(sc.nextLine()));
        System.out.print("Fecha de Nacimiento: ");
        persona.setFecha_nacimiento(sc.nextLine());
        System.out.print("Genero: F o M? ");
        if (sc.nextLine().equalsIgnoreCase("f")){
            persona.setGenero("F");
        }else{
            persona.setGenero("M");
        }
        System.out.print("Direccion IP: ");
        persona.setDireccion_ip(sc.nextLine());


        try {

            ObjectMapper mapper = new ObjectMapper();

            mapper.writeValue(Paths.get("personas.json").toFile(), persona);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }



}
