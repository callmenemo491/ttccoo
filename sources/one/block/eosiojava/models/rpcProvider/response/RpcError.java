package one.block.eosiojava.models.rpcProvider.response;

/* loaded from: classes.dex */
public class RpcError {

    @p189kb.InterfaceC4079b("code")
    private java.math.BigInteger code;

    @p189kb.InterfaceC4079b("details")
    private java.util.List<one.block.eosiojava.models.rpcProvider.response.Detail> details;

    @p189kb.InterfaceC4079b("name")
    private java.lang.String name;

    @p189kb.InterfaceC4079b("what")
    private java.lang.String what;

    public RpcError() {
            r0 = this;
            r0.<init>()
            return
    }

    public java.math.BigInteger getCode() {
            r1 = this;
            java.math.BigInteger r0 = r1.code
            return r0
    }

    public java.util.List<one.block.eosiojava.models.rpcProvider.response.Detail> getDetails() {
            r1 = this;
            java.util.List<one.block.eosiojava.models.rpcProvider.response.Detail> r0 = r1.details
            return r0
    }

    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public java.lang.String getWhat() {
            r1 = this;
            java.lang.String r0 = r1.what
            return r0
    }
}
