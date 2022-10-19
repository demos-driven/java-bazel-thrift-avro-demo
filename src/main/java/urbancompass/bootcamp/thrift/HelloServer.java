package urbancompass.bootcamp.thrift;

import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TTransportException;
import urbancompass.bootcamp.gencode.thrift.HelloService;

public class HelloServer {

    public static final String HOST = "localhost";
    public static final int PORT = 5001;

    public static void main(String[] args) throws TTransportException {
        new HelloServer().run();
    }

    public void run() throws TTransportException {
        System.out.println("Hello TSimpleServer start...");

        HelloService.Processor<HelloService.Iface> tprocessor =
                new HelloService.Processor<HelloService.Iface>(new HelloServiceImpl());
        TServerSocket serverTransport = new TServerSocket(PORT);

        TServer.Args tArgs = new TServer.Args(serverTransport);
        tArgs.processor(tprocessor);
        tArgs.protocolFactory(new TCompactProtocol.Factory());

        TServer server = new TSimpleServer(tArgs);
        server.serve();
    }
}
