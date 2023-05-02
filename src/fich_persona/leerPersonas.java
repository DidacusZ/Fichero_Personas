package fich_persona;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class leerPersonas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * // carpeta/ ver carpeta de trabajo String sCarpAct =
		 * System.getProperty("user.dir"); File carpeta = new File(sCarpAct); String[]
		 * listado = carpeta.list(); if (listado == null || listado.length == 0) {
		 * System.out.println("No hay elementos dentro de la carpeta actual"); return; }
		 * else { for (int i=0; i< listado.length; i++) {
		 * System.out.println(listado[i]); } }
		 */

		File fichero = null;// direccion
		FileReader fr = null;// abre
		BufferedReader br = null;// guarda

		List<Persona> personasBD = new ArrayList();
		String array[] = new String[4];

		try {

			fichero = new File("personas.txt"); // direccion (el inicial es le directorio donde esta todo)
			fr = new FileReader(fichero); // abre
			br = new BufferedReader(fr); // pasamos el reader

			String linea;

			while ((linea = br.readLine()) != null) {

				Persona per = new Persona();
				array = linea.split(";");

				System.out.println(linea);

				System.out.println(array[0]);
				System.out.println(array[1]);
				System.out.println(array[2]);
				System.out.println(array[3]);

				per.setNombre(array[0]);
				per.setApellidos(array[1]);
				per.setEdad(0);
				per.setFechaNacimiento(array[3]);
				// personasBD.add(new Persona
				// (array[0],array[1],Integer.parseInt(array[2]),array[3]));

				personasBD.add(per);

			}



				
				System.out.println(personasBD.toString());
				


		}

		catch (FileNotFoundException fnge) {
			System.out.println("error  fichero no encontrado " + fnge);
		}

		catch (IOException ioex) {
			System.out.println("error linea" + ioex);
		}

		finally {

			try {
				if (null != fr) {
					fr.close();// SIEMPRE
				}
			}

			catch (IOException ioex) {
				System.out.println("errorr linea" + ioex);
			}
		}

	}

}
