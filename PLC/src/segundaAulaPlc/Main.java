package segundaAulaPlc;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		Curso course;
		Aluno student;
		
		try {
			System.out.println("Bote nome do curso e codigo do curso");
			course = new Curso(input.readLine(),input.readLine());
			
			System.out.println("Bote nome do aluno e cpf do aluno e idade do aluno");			
			student = new Aluno(input.readLine(),input.readLine(),Integer.parseInt(input.readLine()),course);
			
			Curso teste = student.getCurso();
			
			System.out.println(teste.getNome());
			
			teste.setNome("AVLC");
			
			System.out.println(student.getCurso().getNome());
			
		}catch(Exception e) {
			student = null;
			course = null;
			if(e instanceof java.lang.NumberFormatException){
				System.out.println(e.toString());
			}

		}
		
	}

}
