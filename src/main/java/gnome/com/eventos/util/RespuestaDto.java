package gnome.com.eventos.util;


public class RespuestaDto<T> {
	
	private int codigo;
	private String mensaje;
	private  T resultado;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public T getResultado() {
		return resultado;
	}
	public void setResultado(T resultado) {
		this.resultado = resultado;
	}
	
	@Override
	public String toString() {
		return "RespuestaDto [codigo=" + codigo + ", mensaje=" + mensaje + ", resultado=" + resultado + "]";
	}

}
