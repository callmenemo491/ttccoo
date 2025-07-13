package io.tacocrypto.app.p156ui.balance;

/* renamed from: io.tacocrypto.app.ui.balance.d */
/* loaded from: classes.dex */
public enum EnumC3214d extends java.lang.Enum<io.tacocrypto.app.p156ui.balance.EnumC3214d> {

    /* renamed from: Y */
    public static final io.tacocrypto.app.p156ui.balance.EnumC3214d f14269Y = null;

    /* renamed from: Z */
    public static final io.tacocrypto.app.p156ui.balance.EnumC3214d f14270Z = null;

    /* renamed from: a0 */
    public static final io.tacocrypto.app.p156ui.balance.EnumC3214d f14271a0 = null;

    /* renamed from: b0 */
    public static final /* synthetic */ io.tacocrypto.app.p156ui.balance.EnumC3214d[] f14272b0 = null;

    static {
            io.tacocrypto.app.ui.balance.d r0 = new io.tacocrypto.app.ui.balance.d
            java.lang.String r1 = "DAY_24H"
            r2 = 0
            r0.<init>(r1, r2)
            io.tacocrypto.app.p156ui.balance.EnumC3214d.f14269Y = r0
            io.tacocrypto.app.ui.balance.d r1 = new io.tacocrypto.app.ui.balance.d
            java.lang.String r3 = "WEEK_7D"
            r4 = 1
            r1.<init>(r3, r4)
            io.tacocrypto.app.p156ui.balance.EnumC3214d.f14270Z = r1
            io.tacocrypto.app.ui.balance.d r3 = new io.tacocrypto.app.ui.balance.d
            java.lang.String r5 = "MONTH_30D"
            r6 = 2
            r3.<init>(r5, r6)
            io.tacocrypto.app.p156ui.balance.EnumC3214d.f14271a0 = r3
            r5 = 3
            io.tacocrypto.app.ui.balance.d[] r5 = new io.tacocrypto.app.p156ui.balance.EnumC3214d[r5]
            r5[r2] = r0
            r5[r4] = r1
            r5[r6] = r3
            io.tacocrypto.app.p156ui.balance.EnumC3214d.f14272b0 = r5
            return
    }

    EnumC3214d(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static io.tacocrypto.app.p156ui.balance.EnumC3214d valueOf(java.lang.String r1) {
            java.lang.Class<io.tacocrypto.app.ui.balance.d> r0 = io.tacocrypto.app.p156ui.balance.EnumC3214d.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            io.tacocrypto.app.ui.balance.d r1 = (io.tacocrypto.app.p156ui.balance.EnumC3214d) r1
            return r1
    }

    public static io.tacocrypto.app.p156ui.balance.EnumC3214d[] values() {
            io.tacocrypto.app.ui.balance.d[] r0 = io.tacocrypto.app.p156ui.balance.EnumC3214d.f14272b0
            java.lang.Object r0 = r0.clone()
            io.tacocrypto.app.ui.balance.d[] r0 = (io.tacocrypto.app.p156ui.balance.EnumC3214d[]) r0
            return r0
    }

    /* renamed from: e */
    public final int m7724e() {
            r3 = this;
            int r0 = r3.ordinal()
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L14
            if (r0 == r2) goto L15
            if (r0 != r1) goto Le
            r1 = 3
            goto L15
        Le:
            e7.y7 r0 = new e7.y7
            r0.<init>(r1)
            throw r0
        L14:
            r1 = 1
        L15:
            return r1
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
            java.lang.String r0 = "30d"
            goto L1a
        Lf:
            e7.y7 r0 = new e7.y7
            r0.<init>(r1)
            throw r0
        L15:
            java.lang.String r0 = "7d"
            goto L1a
        L18:
            java.lang.String r0 = "24h"
        L1a:
            return r0
    }
}
