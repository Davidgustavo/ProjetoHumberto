package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;

@CronapiMetaData(type = "blockly")
@CronappSecurity
public class AtualizaTela {

	public static final int TIMEOUT = 300;

	/**
	 *
	 * @return Var
	 */
	// AtualizaTela
	public static Var Executar() throws Exception {
		return new Callable<Var>() {

			public Var call() throws Exception {
				cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.util.executeJavascriptNoReturn"),
						Var.valueOf("location.reload();"));
				return Var.VAR_NULL;
			}
		}.call();
	}

}
