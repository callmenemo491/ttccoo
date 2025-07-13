package one.block.eosiojava.models.rpcProvider.response;

/* loaded from: classes.dex */
public class PushTransactionResponse extends one.block.eosiojava.models.rpcProvider.response.SendTransactionResponse {
    public PushTransactionResponse() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // one.block.eosiojava.models.rpcProvider.response.SendTransactionResponse
    public <T> T getActionValueAtIndex(int r1, java.lang.Class<T> r2) {
            r0 = this;
            java.lang.Object r1 = super.getActionValueAtIndex(r1, r2)
            return r1
    }

    @Override // one.block.eosiojava.models.rpcProvider.response.SendTransactionResponse
    public java.util.ArrayList<java.lang.Object> getActionValues() {
            r1 = this;
            java.util.ArrayList r0 = super.getActionValues()
            return r0
    }

    @Override // one.block.eosiojava.models.rpcProvider.response.SendTransactionResponse
    public java.util.Map getProcessed() {
            r1 = this;
            java.util.Map r0 = super.getProcessed()
            return r0
    }

    @Override // one.block.eosiojava.models.rpcProvider.response.SendTransactionResponse
    public java.lang.String getTransactionId() {
            r1 = this;
            java.lang.String r0 = super.getTransactionId()
            return r0
    }
}
