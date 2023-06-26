package model;

import java.io.File;
import java.io.FileWriter;

public class Dados {
	
	public void escrever(String mensagem, File file) {
		FileWriter arquivo;
		try {
			arquivo = new FileWriter(file, true);
			arquivo.write(mensagem);
			arquivo.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
