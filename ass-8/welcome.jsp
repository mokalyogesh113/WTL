<%@ page language="java" contentType="text/html; 
charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <%@ taglib uri="/struts-tags" prefix="s" %> Welcome:
        <s:property value="name" /> web.xml
        <?xml version="1.0" encoding="UTF-8"?> <web-app>
            <filter> <filter-name>struts2</filter-name>
                <filterclass>org.apache.struts2.dispatcher.ng.filter.StrutsPrepareAnd
                    ExecuteFilter</filt erclass>
            </filter> <filter-mapping>
                <filter-name>struts2</filter-name>
                <url-pattern>/*</url-pattern> </filter-mapping>
        </web-app>