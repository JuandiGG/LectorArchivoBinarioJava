import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream ficheroBinarioLectura=null;
		FileOutputStream ficheroBinarioEscritura=null;
		BufferedOutputStream bos=null;
		BufferedInputStream bis=null;
		byte[] capturaDatosFichero=new byte[1000];
		int i=0;
		int numBytesLeidos=0;
		
		try {
			ficheroBinarioEscritura = new FileOutputStream("./info/datos.bin");
			bos = new BufferedOutputStream(ficheroBinarioEscritura);
			
			for(i=100;i<200;i++)
			{
				try {
					bos.write(i);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			try {
				bos.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				ficheroBinarioEscritura.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			ficheroBinarioLectura = new FileInputStream("./info/datos.bin");
			bis=new BufferedInputStream(ficheroBinarioLectura);
			
			try {
				numBytesLeidos = bis.read(capturaDatosFichero);
				for (i=0; i<capturaDatosFichero.length; i++ )
				{
					System.out.println("El byte en la posicion "+i+" : "+capturaDatosFichero[i]);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
