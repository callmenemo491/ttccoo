package one.block.eosiojava.models.rpcProvider.request;

/* loaded from: classes.dex */
public class SendTransactionRequest {

    @p189kb.InterfaceC4079b("compression")
    private int compression;

    @p189kb.InterfaceC4079b("packed_trx")
    private java.lang.String packTrx;

    @p189kb.InterfaceC4079b("packed_context_free_data")
    private java.lang.String packagedContextFreeData;

    @p189kb.InterfaceC4079b("signatures")
    private java.util.List<java.lang.String> signatures;

    public SendTransactionRequest(java.util.List<java.lang.String> r1, int r2, java.lang.String r3, java.lang.String r4) {
            r0 = this;
            r0.<init>()
            r0.signatures = r1
            r0.compression = r2
            r0.packagedContextFreeData = r3
            r0.packTrx = r4
            return
    }

    public int getCompression() {
            r1 = this;
            int r0 = r1.compression
            return r0
    }

    public java.lang.String getPackTrx() {
            r1 = this;
            java.lang.String r0 = r1.packTrx
            return r0
    }

    public java.lang.String getPackagedContextFreeData() {
            r1 = this;
            java.lang.String r0 = r1.packagedContextFreeData
            return r0
    }

    public java.util.List<java.lang.String> getSignatures() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.signatures
            return r0
    }

    public void setCompression(int r1) {
            r0 = this;
            r0.compression = r1
            return
    }

    public void setPackTrx(java.lang.String r1) {
            r0 = this;
            r0.packTrx = r1
            return
    }

    public void setPackagedContextFreeData(java.lang.String r1) {
            r0 = this;
            r0.packagedContextFreeData = r1
            return
    }

    public void setSignatures(java.util.List<java.lang.String> r1) {
            r0 = this;
            r0.signatures = r1
            return
    }
}
