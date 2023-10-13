public class Perro{

    //Atributos:
    private String nombre;
    private String propietario;
    private int edad;
    private String raza;
    private double peso;
    private int energia;


    //Constructor:
    public Perro(String dato1, String dato2, int dato3, String dato4, double dato5, int dato6){
        //Asignación de datos
        nombre = dato1;
        propietario = dato2;
        edad = dato3;
        raza = dato4;
        peso = dato5;
        energia = dato6;
    }
  
    //Metodos getters
    public String getNombre(){
        return nombre;
    }

    public String getPropietario(){
        return propietario;
    }

    public int getEdad(){
        return edad;
    }

    public String getRaza(){
        return raza;
    }

    public double getPeso(){
        return peso;
    }

    public int getEnergia(){
        return energia;
    }
   

    //Metodos setters
    public void setNombre(String dato){
        nombre = dato;
    }

    public void setPropietario(String dato){
        propietario = dato;
    }

    public void setEdad(int dato){
        edad = dato;
    }

    public void setRaza(String dato){
        raza = dato;
    }

    public void setPeso(double dato){
        peso = dato;
    }

    public void setEnergia(int dato){
        energia = dato;
    }


    //Metodos/funciones
    public void imprimirDetalle(){
        System.out.println("|----------------------------|");
        System.out.println("|Nombre: "+nombre);
        System.out.println("|Propietario: "+propietario);
        System.out.println("|Edad: "+edad+" meses ("+((double ) edad/12 )+" años)");
        System.out.println("|Raza: "+raza);
        System.out.println("|Peso: "+peso+" Kg");
        System.out.println("|Energia: "+energia+"%");
        System.out.println("|----------------------------|");
    }

    public void comer(int gramos){
        peso = peso + ((double) gramos/1000);
        if (peso > 100){
            System.out.println("No está criando vacas...");
            peso = 100;
        }
        energia = energia + (gramos/100);
        if(energia > 100){
            energia = 100;
            System.out.println("Tu perro tiene demasiada energia, te sugeriría que dieras una caminata con el.");
        }
    }

    public void caminar(int metros){
        double auxiliar;
        auxiliar = peso;
        peso = peso - ((double) metros/5000);
        
        if (peso > 30){
            energia = energia - (metros/400);
            if(energia < 1){
                energia = 0;
                System.out.println("Tu perro bajo de: "+auxiliar+"kg a: "+peso+"kg");
                System.out.println("Energía actual: "+energia+"%");
                System.out.println("Tu perro tiene muy poca energía, dejalo descansar.");
            }else if(energia >= 25){
                System.out.println("Tu perro bajo de: "+auxiliar+"kg a: "+peso+"kg");
                System.out.println("Energía actual: "+energia+"%");
                System.out.println("Tu perro aun le queda energia, pero seria mejor darle de comer.");
            }else if(energia >= 50){
                System.out.println("Tu perro bajo de: "+auxiliar+"kg a: "+peso+"kg");
                System.out.println("Energía actual: "+energia+"%");
                System.out.println("Tu perro le resta suficiente energia para seguir caminando.");
            }else if(energia >= 75){
                System.out.println("Tu perro bajo de: "+auxiliar+"kg a: "+peso+"kg");
                System.out.println("Energía actual: "+energia+"%");
                System.out.println("Disfruta de una larga caminata con tu perro, está rebosante de energía.");
            }
        }else{
            energia = energia - (metros/300);
            if(energia < 1){
                energia = 0;
                System.out.println("Tu perro bajo de: "+auxiliar+"kg a: "+peso+"kg");
                System.out.println("Energía actual: "+energia+"%");
                System.out.println("Tu perro tiene muy poca energía, dejalo descansar.");
            }else if(energia >= 25){
                System.out.println("Tu perro bajo de: "+auxiliar+"kg a: "+peso+"kg");
                System.out.println("Energía actual: "+energia+"%");
                System.out.println("Tu perro aun le queda energia, pero seria mejor darle de comer.");
            }else if(energia >= 50){
                System.out.println("Tu perro bajo de: "+auxiliar+"kg a: "+peso+"kg");
                System.out.println("Energía actual: "+energia+"%");
                System.out.println("Tu perro le resta suficiente energia para seguir caminando.");
            }else if(energia >= 75){
                System.out.println("Tu perro bajo de: "+auxiliar+"kg a: "+peso+"kg");
                System.out.println("Energía actual: "+energia+"%");
                System.out.println("Disfruta de una larga caminata con tu perro, está rebosante de energía.");
            }
        }
    }

    public void ladrar(int minutos){
        energia = energia - (minutos/60);
        if(energia < 1){
            energia = 0;
            System.out.println("Energía actual: "+energia+"%");
            System.out.println("Tu perro ha ladrado demasiado, intenta hacerlo descansar.");
        }else{
            System.out.println("Energía actual: "+energia+"%");
            System.out.println("Tu perro es muy cansonsito y se ha agotado un poco...");
        }
    }

    public void morder(int mordidas){
        energia = energia - (mordidas/100);
        if(energia < 1){
            energia = 0;
            System.out.println("Energía actual: "+energia+"%");
            System.out.println("Tu perro ha moridido demasiado, intenta hacerlo descansar.");
        }else{
            System.out.println("Energía actual: "+energia+"%");
            System.out.println("Tu perro es muy mordelon y se ha agotado un poco...");
        }
    }

    public void dormir(int horas){
        energia = energia + (horas/1);
        if(energia >100){
            energia = 100;
        }
        System.out.println("Tu perro ha dormido "+horas+" horas, actualmente tiene "+energia+"% de energia");
    }
    
    public void hacerpupi(int masa){
        peso = peso - ((double) masa/100);

        System.out.println("Tu perro hizo un poposito de "+masa+" gramos");
        System.out.println("Este es su peso actual: "+peso);
    }

    public void jugar (int tiempo){
        energia = energia - (tiempo/60);
        if(energia < 1){
            energia = 0;
            System.out.println("Energía actual: "+energia+"%");
            System.out.println("Tu perro ha jugado demasiado, intenta hacerlo descansar.");
        }else{
            System.out.println("Energía actual: "+energia+"%");
            System.out.println("Tu perro ha disfrutado del juego, pero está un poco cansado.");
        }
    }



}