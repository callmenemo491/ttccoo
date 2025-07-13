package one.block.eosiojava.models.signatureProvider;

/* loaded from: classes.dex */
public class BinaryAbi {

    @p189kb.InterfaceC4079b("abi")
    private java.lang.String abi;

    @p189kb.InterfaceC4079b("account_name")
    private java.lang.String accountName;

    public BinaryAbi(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.accountName = r1
            r0.abi = r2
            return
    }

    public java.lang.String getAbi() {
            r1 = this;
            java.lang.String r0 = r1.abi
            return r0
    }

    public java.lang.String getAccountName() {
            r1 = this;
            java.lang.String r0 = r1.accountName
            return r0
    }

    public void setAbi(java.lang.String r1) {
            r0 = this;
            r0.abi = r1
            return
    }

    public void setAccountName(java.lang.String r1) {
            r0 = this;
            r0.accountName = r1
            return
    }
}
