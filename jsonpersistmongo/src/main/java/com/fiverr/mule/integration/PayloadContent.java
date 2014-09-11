package com.fiverr.mule.integration;


public class PayloadContent {
	
	private String applications;
	private String command;
	private DBContent dbContent;
	public String getApplications() {
		return applications;
	}
	public void setApplications(String applications) {
		this.applications = applications;
	}
	public String getCommand() {
		return command;
	}
	public void setCommand(String command) {
		this.command = command;
	}
	public DBContent getDbContent() {
		return dbContent;
	}
	public void setDbContent(DBContent dbContent) {
		this.dbContent = dbContent;
	}
	

}
