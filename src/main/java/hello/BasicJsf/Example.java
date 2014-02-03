/**
 * 
 */
package hello.BasicJsf;

import java.io.Serializable;
import java.util.Enumeration;
import java.util.Properties;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.component.html.HtmlInputText;
import javax.faces.event.ActionEvent;


/**
 * @author venkateshp
 *
 */
@ManagedBean (name="basicExp",eager=true)

public class Example implements Serializable {
	
	private String  userName;
	private String password;
	private String userDetails;
	private String[] active;
	private String ok; 
	private String[] many;
	private String menu;
	private String param;
	
	private String messagepage="2";
	
	
	
	
	
	
	/**
	 * @return the messagepage
	 */
	public String getMessagepage() {
		return messagepage;
	}
	/**
	 * @param messagepage the messagepage to set
	 */
	public void setMessagepage(String messagepage) {
		this.messagepage = messagepage;
	}
	/**
	 * @return the param
	 */
	public String getParam() {
		return param;
	}
	/**
	 * @param param the param to set
	 */
	public void setParam(String param) {
		this.param = param;
	}
	/**
	 * @return the menu
	 */
	public String getMenu() {
		return menu;
	}
	/**
	 * @param menu the menu to set
	 */
	public void setMenu(String menu) {
		this.menu = menu;
	}
	/**
	 * @return the many
	 */
	public String[] getMany() {
		return many;
	}
	/**
	 * @param many the many to set
	 */
	public void setMany(String[] many) {
		this.many = many;
	}
	/**
	 * @return the ok
	 */
	public String getOk() {
		return ok;
	}
	/**
	 * @param ok the ok to set
	 */
	public void setOk(String ok) {
		this.ok = ok;
	}
	/**
	 * @return the active
	 */
	public String[] getActive() {
		return active;
	}
	/**
	 * @param active the active to set
	 */
	public void setActive(String[] active) {
		this.active = active;
	}
	@ManagedProperty(value="#{message}")
	public Message messageBean;
	
	@ManagedProperty(value="#{param.pageId}")
	private String pageId;
	public String message;
	
	public String data="1";
	
	public void attributeListener(ActionEvent event)
	{
		data=(String)event.getComponent().getAttributes().get("username");
	}
	/**
	 * @return the data
	 */
	public String getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(String data) {
		this.data = data;
	}
	public String showPage()
	{
		System.out.println("param name iss=="+param);
		System.out.println("pageId isss=="+pageId+"==userName iss==="+userName.toString());
		String page=null;
		if(pageId==null)
		{
			page="home";
		}
		else if(pageId.equals("1"))
		{
			page="page1";
		}
		else if (pageId.equals("2")) {
			page="page2";
			
		}
		
		Properties properties=System.getProperties();
	//	System.out.println(properties.getProperty("java.vm.vendor"));
		
		
		return page;
			
	}
	public String getMessage()
	{
		if(messageBean!=null)
		{
			message=messageBean.getMessage();
		}
		return message;
	}
	
	public void setMessageBean(Message messageBean)
	
	{
		this.messageBean=messageBean;
	}
	/**
	 * @return the pageId
	 */
	public String getPageId() {
		return pageId;
	}
	/**
	 * @param pageId the pageId to set
	 */
	public void setPageId(String pageId) {
		this.pageId = pageId;
	}
	/**
	 * @return the userName
	 */
	/**
	 * @return the userName
	 */

	/**
	 * @return the messageBean
	 */
	public Message getMessageBean() {
		return messageBean;
	}
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
		this.userName = userName;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the userDetails
	 */
	public String getUserDetails() {
		return userDetails;
	}
	/**
	 * @param userDetails the userDetails to set
	 */
	public void setUserDetails(String userDetails) {
		this.userDetails = userDetails;
	}




	

}
