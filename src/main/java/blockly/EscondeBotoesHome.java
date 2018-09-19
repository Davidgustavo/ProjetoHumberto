package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;

@CronapiMetaData(type = "blockly")
@CronappSecurity
public class EscondeBotoesHome {

	public static final int TIMEOUT = 300;

	/**
	 *
	 * @return Var
	 */
	// Descreva esta função...
	public static Var fa_C3_A7a_algo() throws Exception {
		return new Callable<Var>() {

			public Var call() throws Exception {
				return Var.VAR_NULL;
			}
		}.call();
	}

}
