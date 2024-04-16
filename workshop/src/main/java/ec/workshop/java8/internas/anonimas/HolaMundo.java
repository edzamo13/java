/**
 * EJEMPLO DE CLASES AN�NIMAS
 */
package ec.workshop.java8.internas.anonimas;

/**
 * @author Openwebinars
 *
 */
public class HolaMundo {
	
	interface HelloWorld {
        public void greet();
        public void greetSomeone(String someone);
    }
	
	public void sayHello() {
		
		//Clase local
		class EnglishGreeting implements HelloWorld {
			String name = "world";

			@Override
			public void greet() {
				greetSomeone("world");
				
			}

			@Override
			public void greetSomeone(String someone) {
				name = someone;
				System.out.println("Hello " + name);
				
			}
		}
		//Instanciaci�n de la clase local
		HelloWorld englishGreeting = new EnglishGreeting();
		
		//Clase an�nima: definici�n + instanciaci�n
		HelloWorld frenchGreeting = new HelloWorld() {
            String name = "tout le monde";
            
            @Override
            public void greet() {
                greetSomeone("tout le monde");
            }
            
            @Override
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Salut " + name);
            }
        };
        
        
        
        
        //Clase an�nima que no se asigna a ninguna referencia.
        //Saludo en espa�ol
        new HelloWorld() {
			
			String name = "mundo";
			
			@Override
            public void greet() {
                greetSomeone("mundo");
            }
			
			@Override
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hola, " + name);
            }
        	
        }.greet();
        
        englishGreeting.greet();
        frenchGreeting.greetSomeone("Jean");
		
		
		
		
	}
	

	public static void main(String[] args) {
		new HolaMundo().sayHello();   
	}

}
