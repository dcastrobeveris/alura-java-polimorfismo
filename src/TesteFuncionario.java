
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario diego = new Funcionario();
		diego.setNome("Diego Barcellos");
		diego.setCpf("123456789-13");
		diego.setSalario(2700);
		
		System.out.println(diego.getNome());
		System.out.println(diego.getBonifacacao());
		
		//diego.salario = 300.0;

	}

}
