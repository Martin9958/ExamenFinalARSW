# ExamenFinalARSW 2018-2
Link Heroku : https://finalarswapp.herokuapp.com/

## Arquitectura Implementada:
La arquitectura implementada es un arquitectura de 2 niveles, donden en el Nodo 0 se encuentra la parte de modelo, controllers y servicios.
En primer lugar se codifico la parte dle modelo donde se establecieron 4 clases: Grados que es una interfaz que tiene como metodo el convertir unidades, esta interfaz la implementan las clases Fahrenheit y Celsius ya que cada una realiza un override de este metodo al realizar de diferentes maneras la manera de conversion como se puede ver a continuacion:

Clase Celsius:
@Override
    public double convertirgrados(double numero) {
        gradoEnCelsius = (numero-32)/(1.8);
        return gradoEnCelsius;
    }

Clase Fahrenheit:
@Override
    public double convertirgrados(double numero) {
        gradoEnFahrenheit = (numero*(1.8)) + 32;
        return gradoEnFahrenheit;
    }

Despues de esto establecemos la clase principal, la cual sera la que nosa permititra mandar los datos en mensajes tipos JSON, ya que ella es la que almacena y convierte los datos ingresados a las unidades descritas.
Para describir la parte de Servicios implementamos una interfaz que tenga como metodo:

        public interface temperaturaService {
            public Convertidor cambioDeTemperatura (String unidadinicial, double numero, String unidadfinal);
        }
        
y en la implementacion lo desarrollaremos de la siguiente manera:
        @Override
            public Convertidor cambioDeTemperatura(String unidadinicial, double numero, String unidadfinal) {
                double resultado = 0;
                c = new Convertidor(unidadinicial,numero,unidadfinal);
                resultado = c.convertirGrado();
                return c;
            }
            
Ya en la parte de controllador utilizaremos un GetMapping para publicar la informacion convertida, y por lo mismo inyectaremos la parte de servicios que creamos anteriormente.
En el otro Nodo de nuetsra arquitectura utilizamos un cliente JavaScript el cual con axios arrastra los datos recogidos y los muestra en pantalla, en el html, como el tiempo no alcanzo, la aplicacion oslo muestra el JSON de manera de cadena mostrando todos los dtaos al usuario.

## Limitaciones y Atributos de calidad
La aplicacion al mostrar los datos del JSON, no permite tener una latencia adecuada d elos datos, no tienen seguridad de los datos guardados, pero es una aplicacion escalable que puede crecer con el tiempo para soportar nuevas funcionalidades y presenta una modificabilidad adecuada.

