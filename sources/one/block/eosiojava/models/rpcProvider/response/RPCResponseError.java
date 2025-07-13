package one.block.eosiojava.models.rpcProvider.response;

/* loaded from: classes.dex */
public class RPCResponseError {

    @p189kb.InterfaceC4079b("code")
    private java.math.BigInteger code;

    @p189kb.InterfaceC4079b("error")
    private one.block.eosiojava.models.rpcProvider.response.RpcError error;

    @p189kb.InterfaceC4079b("message")
    private java.lang.String message;

    public RPCResponseError() {
            r0 = this;
            r0.<init>()
            return
    }

    public java.math.BigInteger getCode() {
            r1 = this;
            java.math.BigInteger r0 = r1.code
            return r0
    }

    public one.block.eosiojava.models.rpcProvider.response.RpcError getError() {
            r1 = this;
            one.block.eosiojava.models.rpcProvider.response.RpcError r0 = r1.error
            return r0
    }

    public java.lang.String getMessage() {
            r1 = this;
            java.lang.String r0 = r1.message
            return r0
    }
}
