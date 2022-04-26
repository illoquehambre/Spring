package paquete_01;

import org.springframework.context;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		//Creacion de objetos
		Empleado je =new JefeEmpleado();
		Empleado se =new SecretarioEmpleado();

		//Uso de objetos
		
		System.out.println(je.getTareas());
		System.out.println(se.getTareas());
		*/
		
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
	}

}
