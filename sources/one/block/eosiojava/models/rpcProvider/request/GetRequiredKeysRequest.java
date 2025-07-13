package one.block.eosiojava.models.rpcProvider.request;

/* loaded from: classes.dex */
public class GetRequiredKeysRequest {

    @p189kb.InterfaceC4079b("available_keys")
    private java.util.List<java.lang.String> availableKeys;

    @p189kb.InterfaceC4079b("transaction")
    private one.block.eosiojava.models.rpcProvider.Transaction transaction;

    public GetRequiredKeysRequest(java.util.List<java.lang.String> r1, one.block.eosiojava.models.rpcProvider.Transaction r2) {
            r0 = this;
            r0.<init>()
            r0.availableKeys = r1
            r0.transaction = r2
            return
    }

    public java.util.List<java.lang.String> getAvailableKeys() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.availableKeys
            return r0
    }

    public one.block.eosiojava.models.rpcProvider.Transaction getTransaction() {
            r1 = this;
            one.block.eosiojava.models.rpcProvider.Transaction r0 = r1.transaction
            return r0
    }

    public void setAvailableKeys(java.util.List<java.lang.String> r1) {
            r0 = this;
            r0.availableKeys = r1
            return
    }

    public void setTransaction(one.block.eosiojava.models.rpcProvider.Transaction r1) {
            r0 = this;
            r0.transaction = r1
            return
    }
}
