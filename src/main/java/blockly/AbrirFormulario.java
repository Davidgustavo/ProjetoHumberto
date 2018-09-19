package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;

@CronapiMetaData(type = "blockly")
@CronappSecurity
public class AbrirFormulario {

	public static final int TIMEOUT = 300;

	/**
	 *
	 * @return Var
	 */
	// AbrirFormulario
	public static Var Curriculo() throws Exception {
		return new Callable<Var>() {

			public Var call() throws Exception {
				cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeView"),
						Var.valueOf("#/home/logged/funcionariocv"),
						cronapi.list.Operations.newList(Var.valueOf("param0", Var.valueOf("a"))));
				return Var.VAR_NULL;
			}
		}.call();
	}

	/**
	 */
	// Descreva esta função...
	public static void Certificado() throws Exception {
		new Callable<Var>() {

			public Var call() throws Exception {
				cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeView"),
						Var.valueOf("#/home/logged/certificacaocv"),
						cronapi.list.Operations.newList(Var.valueOf("param0", Var.valueOf("a"))));
				return Var.VAR_NULL;
			}
		}.call();
	}

	/**
	 */
	// Descreva esta função...
	public static void Curso() throws Exception {
		new Callable<Var>() {

			public Var call() throws Exception {
				cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeView"),
						Var.valueOf("#/home/logged/cursocv"),
						cronapi.list.Operations.newList(Var.valueOf("param0", Var.valueOf("a"))));
				return Var.VAR_NULL;
			}
		}.call();
	}

	/**
	 */
	// Descreva esta função...
	public static void Forma_C3_A7_C3_A3o() throws Exception {
		new Callable<Var>() {

			public Var call() throws Exception {
				cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeView"),
						Var.valueOf("#/home/logged/formacaocv"),
						cronapi.list.Operations.newList(Var.valueOf("param0", Var.valueOf("a"))));
				return Var.VAR_NULL;
			}
		}.call();
	}

	/**
	 */
	// Descreva esta função...
	public static void Habilidade() throws Exception {
		new Callable<Var>() {

			public Var call() throws Exception {
				cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeView"),
						Var.valueOf("#/home/logged/habilidadescv"),
						cronapi.list.Operations.newList(Var.valueOf("param0", Var.valueOf("a"))));
				return Var.VAR_NULL;
			}
		}.call();
	}

	/**
	 */
	// Descreva esta função...
	public static void Historico() throws Exception {
		new Callable<Var>() {

			public Var call() throws Exception {
				cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeView"),
						Var.valueOf("#/home/logged/historicocv"),
						cronapi.list.Operations.newList(Var.valueOf("param0", Var.valueOf("a"))));
				return Var.VAR_NULL;
			}
		}.call();
	}

	/**
	 */
	// Descreva esta função...
	public static void Idioma() throws Exception {
		new Callable<Var>() {

			public Var call() throws Exception {
				cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeView"),
						Var.valueOf("#/home/logged/idiomacv"),
						cronapi.list.Operations.newList(Var.valueOf("param0", Var.valueOf("a"))));
				return Var.VAR_NULL;
			}
		}.call();
	}

	/**
	 */
	// Descreva esta função...
	public static void Rh() throws Exception {
		new Callable<Var>() {

			public Var call() throws Exception {
				cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeView"),
						Var.valueOf("index.html"),
						cronapi.list.Operations.newList(Var.valueOf("param0", Var.valueOf("a"))));
				return Var.VAR_NULL;
			}
		}.call();
	}

}
