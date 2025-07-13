package one.block.eosiojava.models.signatureProvider;

/* loaded from: classes.dex */
public class EosioTransactionSignatureRequest {
    private java.util.List<one.block.eosiojava.models.signatureProvider.BinaryAbi> abis;
    private java.lang.String chainId;
    private boolean isModifiable;
    private java.lang.String serializedContextFreeData;
    private java.lang.String serializedTransaction;
    private java.util.List<java.lang.String> signingPublicKeys;

    public EosioTransactionSignatureRequest(java.lang.String r8, java.util.List<java.lang.String> r9, java.lang.String r10, java.util.List<one.block.eosiojava.models.signatureProvider.BinaryAbi> r11, boolean r12) {
            r7 = this;
            java.lang.String r6 = ""
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public EosioTransactionSignatureRequest(java.lang.String r1, java.util.List<java.lang.String> r2, java.lang.String r3, java.util.List<one.block.eosiojava.models.signatureProvider.BinaryAbi> r4, boolean r5, java.lang.String r6) {
            r0 = this;
            r0.<init>()
            r0.serializedTransaction = r1
            r0.signingPublicKeys = r2
            r0.chainId = r3
            r0.abis = r4
            r0.isModifiable = r5
            r0.setSerializedContextFreeData(r6)
            return
    }

    public java.util.List<one.block.eosiojava.models.signatureProvider.BinaryAbi> getAbis() {
            r1 = this;
            java.util.List<one.block.eosiojava.models.signatureProvider.BinaryAbi> r0 = r1.abis
            return r0
    }

    public java.lang.String getChainId() {
            r1 = this;
            java.lang.String r0 = r1.chainId
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

    public java.util.List<java.lang.String> getSigningPublicKeys() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.signingPublicKeys
            return r0
    }

    public boolean isModifiable() {
            r1 = this;
            boolean r0 = r1.isModifiable
            return r0
    }

    public void setAbis(java.util.List<one.block.eosiojava.models.signatureProvider.BinaryAbi> r1) {
            r0 = this;
            r0.abis = r1
            return
    }

    public void setChainId(java.lang.String r1) {
            r0 = this;
            r0.chainId = r1
            return
    }

    public void setModifiable(boolean r1) {
            r0 = this;
            r0.isModifiable = r1
            return
    }

    public void setSerializedContextFreeData(java.lang.String r3) {
            r2 = this;
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L15
            r3 = 32
            byte[] r0 = new byte[r3]
            xj.d r1 = p421xj.C7089e.f27429a
            r1 = 0
            byte[] r3 = p421xj.C7089e.m14195b(r0, r1, r3)
            java.lang.String r3 = p400wj.C6892e.m13958a(r3)
        L15:
            r2.serializedContextFreeData = r3
            return
    }

    public void setSerializedTransaction(java.lang.String r1) {
            r0 = this;
            r0.serializedTransaction = r1
            return
    }

    public void setSigningPublicKeys(java.util.List<java.lang.String> r1) {
            r0 = this;
            r0.signingPublicKeys = r1
            return
    }
}
