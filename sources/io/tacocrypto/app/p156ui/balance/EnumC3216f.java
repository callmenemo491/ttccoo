package io.tacocrypto.app.p156ui.balance;

/* renamed from: io.tacocrypto.app.ui.balance.f */
/* loaded from: classes.dex */
public enum EnumC3216f extends java.lang.Enum<io.tacocrypto.app.p156ui.balance.EnumC3216f> {

    /* renamed from: Y */
    public static final io.tacocrypto.app.p156ui.balance.EnumC3216f f14277Y = null;

    /* renamed from: Z */
    public static final io.tacocrypto.app.p156ui.balance.EnumC3216f f14278Z = null;

    /* renamed from: a0 */
    public static final io.tacocrypto.app.p156ui.balance.EnumC3216f f14279a0 = null;

    /* renamed from: b0 */
    public static final io.tacocrypto.app.p156ui.balance.EnumC3216f f14280b0 = null;

    /* renamed from: c0 */
    public static final io.tacocrypto.app.p156ui.balance.EnumC3216f f14281c0 = null;

    /* renamed from: d0 */
    public static final io.tacocrypto.app.p156ui.balance.EnumC3216f f14282d0 = null;

    /* renamed from: e0 */
    public static final /* synthetic */ io.tacocrypto.app.p156ui.balance.EnumC3216f[] f14283e0 = null;

    static {
            io.tacocrypto.app.ui.balance.f r0 = new io.tacocrypto.app.ui.balance.f
            java.lang.String r1 = "AMOUNT_ASC"
            r2 = 0
            r0.<init>(r1, r2)
            io.tacocrypto.app.p156ui.balance.EnumC3216f.f14277Y = r0
            io.tacocrypto.app.ui.balance.f r1 = new io.tacocrypto.app.ui.balance.f
            java.lang.String r3 = "AMOUNT_DESC"
            r4 = 1
            r1.<init>(r3, r4)
            io.tacocrypto.app.p156ui.balance.EnumC3216f.f14278Z = r1
            io.tacocrypto.app.ui.balance.f r3 = new io.tacocrypto.app.ui.balance.f
            java.lang.String r5 = "PRICE_WAX_ASC"
            r6 = 2
            r3.<init>(r5, r6)
            io.tacocrypto.app.p156ui.balance.EnumC3216f.f14279a0 = r3
            io.tacocrypto.app.ui.balance.f r5 = new io.tacocrypto.app.ui.balance.f
            java.lang.String r7 = "PRICE_WAX_DESC"
            r8 = 3
            r5.<init>(r7, r8)
            io.tacocrypto.app.p156ui.balance.EnumC3216f.f14280b0 = r5
            io.tacocrypto.app.ui.balance.f r7 = new io.tacocrypto.app.ui.balance.f
            java.lang.String r9 = "CONTRACT"
            r10 = 4
            r7.<init>(r9, r10)
            io.tacocrypto.app.p156ui.balance.EnumC3216f.f14281c0 = r7
            io.tacocrypto.app.ui.balance.f r9 = new io.tacocrypto.app.ui.balance.f
            java.lang.String r11 = "SYMBOL"
            r12 = 5
            r9.<init>(r11, r12)
            io.tacocrypto.app.p156ui.balance.EnumC3216f.f14282d0 = r9
            r11 = 6
            io.tacocrypto.app.ui.balance.f[] r11 = new io.tacocrypto.app.p156ui.balance.EnumC3216f[r11]
            r11[r2] = r0
            r11[r4] = r1
            r11[r6] = r3
            r11[r8] = r5
            r11[r10] = r7
            r11[r12] = r9
            io.tacocrypto.app.p156ui.balance.EnumC3216f.f14283e0 = r11
            return
    }

    EnumC3216f(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static io.tacocrypto.app.p156ui.balance.EnumC3216f valueOf(java.lang.String r1) {
            java.lang.Class<io.tacocrypto.app.ui.balance.f> r0 = io.tacocrypto.app.p156ui.balance.EnumC3216f.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            io.tacocrypto.app.ui.balance.f r1 = (io.tacocrypto.app.p156ui.balance.EnumC3216f) r1
            return r1
    }

    public static io.tacocrypto.app.p156ui.balance.EnumC3216f[] values() {
            io.tacocrypto.app.ui.balance.f[] r0 = io.tacocrypto.app.p156ui.balance.EnumC3216f.f14283e0
            java.lang.Object r0 = r0.clone()
            io.tacocrypto.app.ui.balance.f[] r0 = (io.tacocrypto.app.p156ui.balance.EnumC3216f[]) r0
            return r0
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = "Sort by "
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            int r1 = r4.ordinal()
            if (r1 == 0) goto L30
            r2 = 1
            if (r1 == r2) goto L2d
            r2 = 2
            if (r1 == r2) goto L2a
            r3 = 3
            if (r1 == r3) goto L27
            r3 = 4
            if (r1 == r3) goto L24
            r3 = 5
            if (r1 != r3) goto L1e
            java.lang.String r1 = "Symbol"
            goto L32
        L1e:
            e7.y7 r0 = new e7.y7
            r0.<init>(r2)
            throw r0
        L24:
            java.lang.String r1 = "Contract"
            goto L32
        L27:
            java.lang.String r1 = "Price in WAX desc."
            goto L32
        L2a:
            java.lang.String r1 = "Price in WAX asc."
            goto L32
        L2d:
            java.lang.String r1 = "Amount desc."
            goto L32
        L30:
            java.lang.String r1 = "Amount asc."
        L32:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
