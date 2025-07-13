package one.block.eosiojava.models.signatureProvider;

/* renamed from: one.block.eosiojava.models.signatureProvider.EosioTransactionSignatureResponse */
/* loaded from: classes.dex */
public class C5328x49c37d4a {
    private one.block.eosiojava.error.signatureProvider.SignatureProviderError error;
    private java.lang.String serializedContextFreeData;
    private java.lang.String serializedTransaction;
    private java.util.List<java.lang.String> signatures;

    public C5328x49c37d4a(java.lang.String r1, java.lang.String r2, java.util.List<java.lang.String> r3, one.block.eosiojava.error.signatureProvider.SignatureProviderError r4) {
            r0 = this;
            r0.<init>()
            r0.serializedTransaction = r1
            r0.serializedContextFreeData = r2
            r0.signatures = r3
            r0.error = r4
            return
    }

    public C5328x49c37d4a(java.lang.String r2, java.util.List<java.lang.String> r3, one.block.eosiojava.error.signatureProvider.SignatureProviderError r4) {
            r1 = this;
            java.lang.String r0 = ""
            r1.<init>(r2, r0, r3, r4)
            return
    }

    public one.block.eosiojava.error.signatureProvider.SignatureProviderError getError() {
            r1 = this;
            one.block.eosiojava.error.signatureProvider.SignatureProviderError r0 = r1.error
            return r0
    }

    public java.lang.String getSerializedContextFreeData() {
            r1 = this;
            java.lang.String r0 = r1.serializedContextFreeData
            return r0
    }

    public java.lang.String getSerializedTransaction() {
            r1 = this;
            java.lang.String r0 = r1.serializedTransaction
            return r0
    }

    public java.util.List<java.lang.String> getSignatures() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.signatures
            return r0
    }
}
