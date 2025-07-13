package one.block.eosiojava.models;

/* loaded from: classes.dex */
public class AbiEosSerializationObject {
    private java.lang.String abi;
    private java.lang.String contract;
    private java.lang.String hex;
    private java.lang.String json;
    private java.lang.String name;
    private java.lang.String type;

    public AbiEosSerializationObject(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.hex = r0
            r1.json = r0
            r1.contract = r2
            r1.name = r3
            r1.type = r4
            r1.abi = r5
            return
    }

    public java.lang.String getAbi() {
            r1 = this;
            java.lang.String r0 = r1.abi
            return r0
    }

    public java.lang.String getContract() {
            r1 = this;
            java.lang.String r0 = r1.contract
            return r0
    }

    public java.lang.String getHex() {
            r1 = this;
            java.lang.String r0 = r1.hex
            return r0
    }

    public java.lang.String getJson() {
            r1 = this;
            java.lang.String r0 = r1.json
            return r0
    }

    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public java.lang.String getType() {
            r1 = this;
            java.lang.String r0 = r1.type
            return r0
    }

    public void setHex(java.lang.String r1) {
            r0 = this;
            r0.hex = r1
            return
    }

    public void setJson(java.lang.String r1) {
            r0 = this;
            r0.json = r1
            return
    }
}
