package one.block.eosiojava.models.rpcProvider;

/* loaded from: classes.dex */
public class Action implements java.io.Serializable {

    @p189kb.InterfaceC4079b("account")
    private java.lang.String account;

    @p189kb.InterfaceC4079b("authorization")
    private java.util.List<one.block.eosiojava.models.rpcProvider.Authorization> authorization;

    @p189kb.InterfaceC4079b("data")
    private java.lang.String data;

    @p189kb.InterfaceC4079b("isContextFree")
    private boolean isContextFree;

    @p189kb.InterfaceC4079b("name")
    private java.lang.String name;
    private transient java.lang.Object returnValue;

    public Action(java.lang.String r7, java.lang.String r8, java.util.List<one.block.eosiojava.models.rpcProvider.Authorization> r9, java.lang.String r10) {
            r6 = this;
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public Action(java.lang.String r1, java.lang.String r2, java.util.List<one.block.eosiojava.models.rpcProvider.Authorization> r3, java.lang.String r4, boolean r5) {
            r0 = this;
            r0.<init>()
            r0.account = r1
            r0.name = r2
            r0.authorization = r3
            r0.data = r4
            r0.isContextFree = r5
            return
    }

    public java.lang.String getAccount() {
            r1 = this;
            java.lang.String r0 = r1.account
            return r0
    }

    public java.util.List<one.block.eosiojava.models.rpcProvider.Authorization> getAuthorization() {
            r1 = this;
            java.util.List<one.block.eosiojava.models.rpcProvider.Authorization> r0 = r1.authorization
            return r0
    }

    public java.lang.String getData() {
            r1 = this;
            java.lang.String r0 = r1.data
            return r0
    }

    public boolean getIsContextFree() {
            r1 = this;
            boolean r0 = r1.isContextFree
            return r0
    }

    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public java.lang.Object getReturnValue() {
            r1 = this;
            java.lang.Object r0 = r1.returnValue
            return r0
    }

    public boolean hasData() {
            r1 = this;
            java.lang.String r0 = r1.data
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            return r0
    }

    public void setAccount(java.lang.String r1) {
            r0 = this;
            r0.account = r1
            return
    }

    public void setAuthorization(java.util.List<one.block.eosiojava.models.rpcProvider.Authorization> r1) {
            r0 = this;
            r0.authorization = r1
            return
    }

    public void setData(java.lang.String r1) {
            r0 = this;
            r0.data = r1
            return
    }

    public void setIsContextFree(boolean r1) {
            r0 = this;
            r0.isContextFree = r1
            return
    }

    public void setName(java.lang.String r1) {
            r0 = this;
            r0.name = r1
            return
    }

    public void setReturnValue(java.lang.Object r1) {
            r0 = this;
            r0.returnValue = r1
            return
    }
}
