/**
 * 
 */
package model;

/**
 * @author JAVA - LEANDRO MARQUES
 *
 */
public class Telefone {
	
	private Long idTelefone;
	private String numeroTelefone;
	private String tipoTelefone;
	private Long usuarioTelefone;
	
	public Long getIdTelefone() {
		return idTelefone;
	}
	public void setIdTelefone(Long idTelefone) {
		this.idTelefone = idTelefone;
	}
	public String getNumeroTelefone() {
		return numeroTelefone;
	}
	public void setNumeroTelefone(String numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
	}
	public String getTipoTelefone() {
		return tipoTelefone;
	}
	public void setTipoTelefone(String tipoTelefone) {
		this.tipoTelefone = tipoTelefone;
	}
	public Long getUsuarioTelefone() {
		return usuarioTelefone;
	}
	public void setUsuarioTelefone(Long usuarioTelefone) {
		this.usuarioTelefone = usuarioTelefone;
	}
	@Override
	public String toString() {
		return "Telefone [idTelefone=" + idTelefone + ", numeroTelefone=" + numeroTelefone + ", tipoTelefone="
				+ tipoTelefone + ", usuarioTelefone=" + usuarioTelefone + "]";
	}
	
	

}
