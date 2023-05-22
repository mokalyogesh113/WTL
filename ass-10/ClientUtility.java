packagecom.ibytecode.clientutility;
importjava.util.Properties;
importjavax.naming.Context;
importjavax.naming.InitialContext;
importjavax.naming.NamingException;
publicclassClientUtility {
    privatestaticContextinitialContext;
    privatestaticfinalStringPKG_INTERFACES = "org.jboss.ejb.client.naming";
    publicstaticContextgetInitialContext() throwsNamingException {
        if (initialContext == null) {
            Propertiesproperties = newProperties();
            properties.put(Context.URL_PKG_PREFIXES, PKG_INTERFACES);
            initialContext = newInitialContext(properties);
        }
        returninitialConte xt;
    }
}