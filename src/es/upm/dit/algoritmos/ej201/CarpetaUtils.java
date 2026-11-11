package es.upm.dit.algoritmos.ej201;

import java.util.List;

public class CarpetaUtils {

	public static double calcularPesoTotal(Carpeta inicio) {
		if (inicio == null) {
			return 0.0;
			}
		
	    double pesoTotalMB = 0.0;
	    List <Archivo> archivosCarpeta = inicio.getArchivos();
	    List <Carpeta> subcarpetasCarpeta = inicio.getSubcarpetas();
	    
	    if (inicio.getArchivos() != null) {
	    for (Archivo a : archivosCarpeta) {
	        pesoTotalMB += a.getPesoMB();
	        }
	    }
	    
	    if (inicio.getSubcarpetas() != null) {
	    for( Carpeta s : subcarpetasCarpeta) {
	    	pesoTotalMB += calcularPesoTotal(s);
	    	}
	    }
	    
	    return pesoTotalMB;
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	 /*   if (inicio == null) return 0.0; // Protección contra null

	    double pesoTotal = 0.0;

	    // Sumar peso de archivos directos
	    if (inicio.getArchivos() != null) {
	        for (Archivo a : inicio.getArchivos()) {
	            pesoTotal += a.getPesoMB();
	        }
	    }

	    // Sumar peso de subcarpetas (Paso recursivo)
	    if (inicio.getSubcarpetas() != null) {
	        for (Carpeta sub : inicio.getSubcarpetas()) {
	            pesoTotal += calcularPesoTotal(sub);
	        }
	    }

	    return pesoTotal;
	}
}
*/