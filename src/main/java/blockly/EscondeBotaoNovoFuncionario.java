package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;

@CronapiMetaData(type = "blockly")
@CronappSecurity
public class EscondeBotaoNovoFuncionario {

	public static final int TIMEOUT = 300;

	/**
	 */
	// Descreva esta função...
	public static void Cadastro() throws Exception {
		new Callable<Var>() {

			public Var call() throws Exception {
				return Var.VAR_NULL;
			}
		}.call();
	}

}
