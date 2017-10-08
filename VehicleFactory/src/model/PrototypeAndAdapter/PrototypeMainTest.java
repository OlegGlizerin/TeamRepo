package model.PrototypeAndAdapter;

public class PrototypeMainTest {
    public PrototypeMainTest() {
        startTest();
    }

    public void startTest() {
        PrototypeRepository.addPrototype(new PrototypeA());
        PrototypeRepository.addPrototype(new PrototypeB());

        IPrototype proto = PrototypeRepository.createPrototype("ProtoA");
        if(proto!= null){
            proto.execute();
        }
        proto = PrototypeRepository.createPrototype("PrototypeB");
        if(proto != null){
            proto.execute();
        }

    }
}
