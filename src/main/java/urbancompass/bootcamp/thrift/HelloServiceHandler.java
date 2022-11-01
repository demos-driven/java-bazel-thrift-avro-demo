package urbancompass.bootcamp.thrift;

import org.apache.thrift.TException;

public class HelloServiceHandler implements HelloService.Iface {

    @Override
    public String greeting(String name) throws TException {
        return "Hi, " + name + " , welcome to Thrift serialization!";
    }
}
