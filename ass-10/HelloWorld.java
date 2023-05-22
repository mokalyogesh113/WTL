packagecom.ibytecode.business;
importjavax.ejb.Remote;
@Remote
publicinterfaceHelloWorld {
    publicStringsayHello();
}
HelloWorldBean.java packagecom.ibytecode.businesslogic;
importcom.ibytecode.business.HelloWorld;
importjavax.ejb.Stateless;
@Stateless
publicclassHelloWorldBeanimplementsHelloWorld {
    publicHelloWorldBean() {}
    publicStringsayHello() {
        return "HelloWorld!!!";
    }
}