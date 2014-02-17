/**
 * 
 */
package hello.BasicJsf;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * @author Nag
 *
 */
@ManagedBean(name="userData",eager=true)
@SessionScoped
public class Validations implements Serializable {
	
	private String userName;

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		System.out.println("here set the user name ");
		this.userName = userName;
	}
	
	
	

}
