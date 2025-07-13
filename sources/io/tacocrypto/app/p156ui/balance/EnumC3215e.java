package io.tacocrypto.app.p156ui.balance;

/* renamed from: io.tacocrypto.app.ui.balance.e */
/* loaded from: classes.dex */
public enum EnumC3215e extends java.lang.Enum<io.tacocrypto.app.p156ui.balance.EnumC3215e> {

    /* renamed from: Y */
    public static final io.tacocrypto.app.p156ui.balance.EnumC3215e f14273Y = null;

    /* renamed from: Z */
    public static final io.tacocrypto.app.p156ui.balance.EnumC3215e f14274Z = null;

    /* renamed from: a0 */
    public static final io.tacocrypto.app.p156ui.balance.EnumC3215e f14275a0 = null;

    /* renamed from: b0 */
    public static final /* synthetic */ io.tacocrypto.app.p156ui.balance.EnumC3215e[] f14276b0 = null;

    static {
            io.tacocrypto.app.ui.balance.e r0 = new io.tacocrypto.app.ui.balance.e
            java.lang.String r1 = "ALL"
            r2 = 0
            r0.<init>(r1, r2)
            io.tacocrypto.app.p156ui.balance.EnumC3215e.f14273Y = r0
            io.tacocrypto.app.ui.balance.e r1 = new io.tacocrypto.app.ui.balance.e
            java.lang.String r3 = "HIDE_NO_VALUE"
            r4 = 1
            r1.<init>(r3, r4)
            io.tacocrypto.app.p156ui.balance.EnumC3215e.f14274Z = r1
            io.tacocrypto.app.ui.balance.e r3 = new io.tacocrypto.app.ui.balance.e
            java.lang.String r5 = "HIDE_SIMPLEASSETS"
            r6 = 2
            r3.<init>(r5, r6)
            io.tacocrypto.app.p156ui.balance.EnumC3215e.f14275a0 = r3
            r5 = 3
            io.tacocrypto.app.ui.balance.e[] r5 = new io.tacocrypto.app.p156ui.balance.EnumC3215e[r5]
            r5[r2] = r0
            r5[r4] = r1
            r5[r6] = r3
            io.tacocrypto.app.p156ui.balance.EnumC3215e.f14276b0 = r5
            return
    }

    EnumC3215e(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static io.tacocrypto.app.p156ui.balance.EnumC3215e valueOf(java.lang.String r1) {
            java.lang.Class<io.tacocrypto.app.ui.balance.e> r0 = io.tacocrypto.app.p156ui.balance.EnumC3215e.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            io.tacocrypto.app.ui.balance.e r1 = (io.tacocrypto.app.p156ui.balance.EnumC3215e) r1
            return r1
    }

    public static io.tacocrypto.app.p156ui.balance.EnumC3215e[] values() {
            io.tacocrypto.app.ui.balance.e[] r0 = io.tacocrypto.app.p156ui.balance.EnumC3215e.f14276b0
            java.lang.Object r0 = r0.clone()
            io.tacocrypto.app.ui.balance.e[] r0 = (io.tacocrypto.app.p156ui.balance.EnumC3215e[]) r0
            return r0
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
            r2 = this;
            int r0 = r2.ordinal()
            if (r0 == 0) goto L18
            r1 = 1
            if (r0 == r1) goto L15
            r1 = 2
            if (r0 != r1) goto Lf
            java.lang.String r0 = "Hide simpleassets"
            goto L1a
        Lf:
            e7.y7 r0 = new e7.y7
            r0.<init>(r1)
            throw r0
        L15:
            java.lang.String r0 = "Hide no value"
            goto L1a
        L18:
            java.lang.String r0 = "All"
        L1a:
            return r0
    }
}
