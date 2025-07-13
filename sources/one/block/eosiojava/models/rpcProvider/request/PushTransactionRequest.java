package one.block.eosiojava.models.rpcProvider.request;

/* loaded from: classes.dex */
public class PushTransactionRequest extends one.block.eosiojava.models.rpcProvider.request.SendTransactionRequest {
    public PushTransactionRequest(java.util.List<java.lang.String> r1, int r2, java.lang.String r3, java.lang.String r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    @Override // one.block.eosiojava.models.rpcProvider.request.SendTransactionRequest
    public int getCompression() {
            r1 = this;
            int r0 = super.getCompression()
            return r0
    }

    @Override // one.block.eosiojava.models.rpcProvider.request.SendTransactionRequest
    public java.lang.String getPackTrx() {
            r1 = this;
            java.lang.String r0 = super.getPackTrx()
            return r0
    }

    @Override // one.block.eosiojava.models.rpcProvider.request.SendTransactionRequest
    public java.lang.String getPackagedContextFreeData() {
            r1 = this;
            java.lang.String r0 = super.getPackagedContextFreeData()
            return r0
    }

    @Override // one.block.eosiojava.models.rpcProvider.request.SendTransactionRequest
    public java.util.List<java.lang.String> getSignatures() {
            r1 = this;
            java.util.List r0 = super.getSignatures()
            return r0
    }

    @Override // one.block.eosiojava.models.rpcProvider.request.SendTransactionRequest
    public void setCompression(int r1) {
            r0 = this;
            super.setCompression(r1)
            return
    }

    @Override // one.block.eosiojava.models.rpcProvider.request.SendTransactionRequest
    public void setPackTrx(java.lang.String r1) {
            r0 = this;
            super.setPackTrx(r1)
            return
    }

    @Override // one.block.eosiojava.models.rpcProvider.request.SendTransactionRequest
    public void setPackagedContextFreeData(java.lang.String r1) {
            r0 = this;
            super.setPackagedContextFreeData(r1)
            return
    }

    @Override // one.block.eosiojava.models.rpcProvider.request.SendTransactionRequest
    public void setSignatures(java.util.List<java.lang.String> r1) {
            r0 = this;
            super.setSignatures(r1)
            return
    }
}
