package one.block.eosiojava.models;

/* loaded from: classes.dex */
public class EOSIOName {
    private java.lang.String accountName;

    public EOSIOName(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.accountName = r1
            return
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            r3 = 1
            return r3
        L4:
            if (r3 == 0) goto L20
            java.lang.Class r0 = r2.getClass()
            java.lang.Class r1 = r3.getClass()
            if (r0 == r1) goto L11
            goto L20
        L11:
            one.block.eosiojava.models.EOSIOName r3 = (one.block.eosiojava.models.EOSIOName) r3
            java.lang.String r0 = r2.getAccountName()
            java.lang.String r3 = r3.getAccountName()
            boolean r3 = r0.equals(r3)
            return r3
        L20:
            r3 = 0
            return r3
    }

    public java.lang.String getAccountName() {
            r1 = this;
            java.lang.String r0 = r1.accountName
            return r0
    }

    public int hashCode() {
            r3 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = r3.getAccountName()
            r2 = 0
            r0[r2] = r1
            int r0 = java.util.Objects.hash(r0)
            return r0
    }

    public void setAccountName(java.lang.String r1) {
            r0 = this;
            r0.accountName = r1
            return
    }
}
