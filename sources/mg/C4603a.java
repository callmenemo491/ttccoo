package mg;

/* renamed from: mg.a */
/* loaded from: classes.dex */
public final class C4603a {
    private final java.lang.String account;
    private final java.util.List<java.lang.Object> authorization;
    private final java.util.Map<java.lang.String, java.lang.Object> data;

    @p189kb.InterfaceC4079b("hex_data")
    private final java.lang.String hexData;
    private final java.lang.String name;

    public C4603a(java.lang.String r2, java.util.List<java.lang.Object> r3, java.util.Map<java.lang.String, ? extends java.lang.Object> r4, java.lang.String r5, java.lang.String r6) {
            r1 = this;
            java.lang.String r0 = "account"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "authorization"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "hexData"
            p214m2.C4339q.m9706k(r5, r0)
            java.lang.String r0 = "name"
            p214m2.C4339q.m9706k(r6, r0)
            r1.<init>()
            r1.account = r2
            r1.authorization = r3
            r1.data = r4
            r1.hexData = r5
            r1.name = r6
            return
    }

    public static /* synthetic */ mg.C4603a copy$default(mg.C4603a r3, java.lang.String r4, java.util.List r5, java.util.Map r6, java.lang.String r7, java.lang.String r8, int r9, java.lang.Object r10) {
            r10 = r9 & 1
            if (r10 == 0) goto L6
            java.lang.String r4 = r3.account
        L6:
            r10 = r9 & 2
            if (r10 == 0) goto Lc
            java.util.List<java.lang.Object> r5 = r3.authorization
        Lc:
            r10 = r5
            r5 = r9 & 4
            if (r5 == 0) goto L13
            java.util.Map<java.lang.String, java.lang.Object> r6 = r3.data
        L13:
            r0 = r6
            r5 = r9 & 8
            if (r5 == 0) goto L1a
            java.lang.String r7 = r3.hexData
        L1a:
            r1 = r7
            r5 = r9 & 16
            if (r5 == 0) goto L21
            java.lang.String r8 = r3.name
        L21:
            r2 = r8
            r5 = r3
            r6 = r4
            r7 = r10
            r8 = r0
            r9 = r1
            r10 = r2
            mg.a r3 = r5.copy(r6, r7, r8, r9, r10)
            return r3
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.account
            return r0
    }

    public final java.util.List<java.lang.Object> component2() {
            r1 = this;
            java.util.List<java.lang.Object> r0 = r1.authorization
            return r0
    }

    public final java.util.Map<java.lang.String, java.lang.Object> component3() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.data
            return r0
    }

    public final java.lang.String component4() {
            r1 = this;
            java.lang.String r0 = r1.hexData
            return r0
    }

    public final java.lang.String component5() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public final mg.C4603a copy(java.lang.String r8, java.util.List<java.lang.Object> r9, java.util.Map<java.lang.String, ? extends java.lang.Object> r10, java.lang.String r11, java.lang.String r12) {
            r7 = this;
            java.lang.String r0 = "account"
            p214m2.C4339q.m9706k(r8, r0)
            java.lang.String r0 = "authorization"
            p214m2.C4339q.m9706k(r9, r0)
            java.lang.String r0 = "hexData"
            p214m2.C4339q.m9706k(r11, r0)
            java.lang.String r0 = "name"
            p214m2.C4339q.m9706k(r12, r0)
            mg.a r0 = new mg.a
            r1 = r0
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            return r0
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            java.lang.Class<mg.a> r1 = mg.C4603a.class
            if (r4 == 0) goto Ld
            java.lang.Class r2 = r4.getClass()
            goto Le
        Ld:
            r2 = 0
        Le:
            boolean r1 = p214m2.C4339q.m9702c(r1, r2)
            r2 = 0
            if (r1 != 0) goto L16
            return r2
        L16:
            java.lang.String r1 = "null cannot be cast to non-null type io.tacocrypto.app.ui.tools.transactions.model.Act"
            java.util.Objects.requireNonNull(r4, r1)
            mg.a r4 = (mg.C4603a) r4
            java.lang.String r1 = r3.hexData
            java.lang.String r4 = r4.hexData
            boolean r4 = p214m2.C4339q.m9702c(r1, r4)
            if (r4 != 0) goto L28
            return r2
        L28:
            return r0
    }

    public final java.lang.String getAccount() {
            r1 = this;
            java.lang.String r0 = r1.account
            return r0
    }

    public final java.lang.String getAssets() {
            r2 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.data
            if (r0 == 0) goto L11
            java.lang.String r1 = "asset_ids"
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L11
            java.lang.String r0 = r0.toString()
            goto L12
        L11:
            r0 = 0
        L12:
            return r0
    }

    public final java.util.List<java.lang.Object> getAuthorization() {
            r1 = this;
            java.util.List<java.lang.Object> r0 = r1.authorization
            return r0
    }

    public final java.lang.String getCurrency() {
            r4 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r4.data
            if (r0 == 0) goto L25
            java.lang.String r1 = "quantity"
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L25
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L25
            java.lang.String r1 = " "
            java.lang.String[] r1 = new java.lang.String[]{r1}
            r2 = 6
            r3 = 0
            java.util.List r0 = p362uh.C6467m.m13080k0(r0, r1, r3, r3, r2)
            java.lang.Object r0 = p062dh.C1473i.m4002N(r0)
            java.lang.String r0 = (java.lang.String) r0
            goto L26
        L25:
            r0 = 0
        L26:
            return r0
    }

    public final java.util.Map<java.lang.String, java.lang.Object> getData() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.data
            return r0
    }

    public final java.lang.String getFrom() {
            r2 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.data
            if (r0 == 0) goto L11
            java.lang.String r1 = "from"
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L11
            java.lang.String r0 = r0.toString()
            goto L12
        L11:
            r0 = 0
        L12:
            return r0
    }

    public final java.lang.String getHexData() {
            r1 = this;
            java.lang.String r0 = r1.hexData
            return r0
    }

    public final java.lang.String getImageURL() {
            r2 = this;
            java.lang.String r0 = r2.getCurrency()
            if (r0 == 0) goto Ld
            java.lang.String r1 = r2.account
            java.lang.String r0 = p097fd.C2139a.m5698b(r0, r1)
            goto Le
        Ld:
            r0 = 0
        Le:
            return r0
    }

    public final java.lang.String getMemo() {
            r2 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.data
            if (r0 == 0) goto L11
            java.lang.String r1 = "memo"
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L11
            java.lang.String r0 = r0.toString()
            goto L12
        L11:
            r0 = 0
        L12:
            return r0
    }

    public final java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public final java.lang.String getQuantity() {
            r2 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.data
            if (r0 == 0) goto L11
            java.lang.String r1 = "quantity"
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L11
            java.lang.String r0 = r0.toString()
            goto L12
        L11:
            r0 = 0
        L12:
            return r0
    }

    public final java.lang.String getTo() {
            r2 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.data
            if (r0 == 0) goto L11
            java.lang.String r1 = "to"
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L11
            java.lang.String r0 = r0.toString()
            goto L12
        L11:
            r0 = 0
        L12:
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.hexData
            int r0 = r0.hashCode()
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "Act(account="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.account
            r0.append(r1)
            java.lang.String r1 = ", authorization="
            r0.append(r1)
            java.util.List<java.lang.Object> r1 = r3.authorization
            r0.append(r1)
            java.lang.String r1 = ", data="
            r0.append(r1)
            java.util.Map<java.lang.String, java.lang.Object> r1 = r3.data
            r0.append(r1)
            java.lang.String r1 = ", hexData="
            r0.append(r1)
            java.lang.String r1 = r3.hexData
            r0.append(r1)
            java.lang.String r1 = ", name="
            r0.append(r1)
            java.lang.String r1 = r3.name
            r2 = 41
            java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
            return r0
    }
}
