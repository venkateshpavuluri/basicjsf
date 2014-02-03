/**
 * 
 */
package hello.BasicJsf;

import javax.faces.bean.ManagedBean;

/**
 * @author venkateshp
 *
 */
@ManagedBean(name="message",eager=true)
public class Message {
public String message="hello Message";

/**
 * @return the message
 */
public String getMessage() {
	return message;
}

/**
 * @param message the message to set
 */
public void setMessage(String message) {
	this.message = message;
}


}
