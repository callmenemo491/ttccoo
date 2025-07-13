package one.block.eosiojavarpcprovider.error;

/* loaded from: classes.dex */
public class EosioJavaRpcProviderCallError extends one.block.eosiojava.error.rpcProvider.RpcProviderError {
    private one.block.eosiojava.models.rpcProvider.response.RPCResponseError rpcResponseError;

    public EosioJavaRpcProviderCallError() {
            r0 = this;
            r0.<init>()
            return
    }

    public EosioJavaRpcProviderCallError(java.lang.Exception r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public EosioJavaRpcProviderCallError(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public EosioJavaRpcProviderCallError(java.lang.String r1, java.lang.Exception r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public EosioJavaRpcProviderCallError(java.lang.String r1, java.lang.Exception r2, one.block.eosiojava.models.rpcProvider.response.RPCResponseError r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.rpcResponseError = r3
            return
    }

    public EosioJavaRpcProviderCallError(java.lang.String r1, one.block.eosiojava.models.rpcProvider.response.RPCResponseError r2) {
            r0 = this;
            r0.<init>(r1)
            r0.rpcResponseError = r2
            return
    }

    public one.block.eosiojava.models.rpcProvider.response.RPCResponseError getRpcResponseError() {
            r1 = this;
            one.block.eosiojava.models.rpcProvider.response.RPCResponseError r0 = r1.rpcResponseError
            return r0
    }

    public void setRpcResponseError(one.block.eosiojava.models.rpcProvider.response.RPCResponseError r1) {
            r0 = this;
            r0.rpcResponseError = r1
            return
    }
}
