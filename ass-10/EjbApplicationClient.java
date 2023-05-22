packagecom.ibytecode.client;
importjavax.naming.Context;
importjavax.naming.NamingException;
importcom.ibytecode.business.HelloWorld;
importcom.ibytecode.businesslogic.HelloWorldB ean;
importcom.ibytecode.clientutility.ClientUtility;
publicclassEJBApplicationClient {
    publicstaticvoidmain(String[] args) {
        HelloWorldbean = doLookup();
        System.out.println(bean.sayHello()); // 4.Callbusin
        esslogic
    }
    privatestaticHelloWorlddoLookup() {
        Contextcontext = null;
        HelloWorldbean = null;
        try {
            context = ClientUtility.getInitialContext();
            StringlookupName = getLookupName();
            bean = (HelloWorld) context.lookup(looku pName);
        } catch (NamingExceptione) {
            e.printStackTrace();
        }
        returnbean;
    }
    privatestaticStringgetLookupName() {
        StringappName = "";
        StringmoduleName = "HelloWorldSessionBean";
        StringdistinctName = "";
        StringbeanName = HelloWorldBean.class.getSimpleN ame();
        finalStringinterfaceName = HelloWorld.class.getNam e();
        Stringname = "ejb:" + appName + "/" + moduleName
            + "/ 
              "+ distinctName+"
                / "+beanName+" !"+interfaceName; returnname; 
    }
}