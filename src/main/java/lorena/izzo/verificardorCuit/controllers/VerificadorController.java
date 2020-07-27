package lorena.izzo.verificardorCuit.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lorena.izzo.verificardorCuit.dtos.Cuit;



@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("cuit")
public class VerificadorController {
	
	@PostMapping("/")
	public ResponseEntity verificarRiesgo(@RequestBody Cuit cuit) {
		try {
			String respuesta = "Es CUIT ingresado "+cuit.getNumero()+" es ";
			
			if(cuit.verificado()) {
				respuesta = respuesta + "CORRECTO";
			}
			else {
				respuesta = respuesta + "INCORRECTO";
			}
			
			return ResponseEntity.ok(respuesta);
		}
		catch(Exception e) {
			return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body("Errores en el envio de info: " + e);
		}
		
	}
	
	@GetMapping("/")
	public ResponseEntity info() {
		
		return ResponseEntity.ok("Sistema para la verificacion de CUIT, ingrese un numero de CUIT en JSON y recibira la respuesta. {numero: String}");
		
	}
	



}
