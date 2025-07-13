package p124h7;

/* renamed from: h7.v6 */
/* loaded from: classes.dex */
public final class C2906v6 extends p124h7.AbstractC2970yg<p124h7.C2906v6, p124h7.C2888u6> implements p124h7.InterfaceC2953y {
    private static final p124h7.C2906v6 zzb = null;
    private java.lang.String zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
            h7.v6 r0 = new h7.v6
            r0.<init>()
            p124h7.C2906v6.zzb = r0
            java.lang.Class<h7.v6> r1 = p124h7.C2906v6.class
            p124h7.AbstractC2970yg.m7329d(r1, r0)
            return
    }

    public C2906v6() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.zze = r0
            return
    }

    /* renamed from: s */
    public static p124h7.C2888u6 m7212s() {
            h7.v6 r0 = p124h7.C2906v6.zzb
            h7.vg r0 = r0.m7336i()
            h7.u6 r0 = (p124h7.C2888u6) r0
            return r0
    }

    /* renamed from: u */
    public static /* synthetic */ p124h7.C2906v6 m7213u() {
            h7.v6 r0 = p124h7.C2906v6.zzb
            return r0
    }

    /* renamed from: v */
    public static /* synthetic */ void m7214v(p124h7.C2906v6 r0, java.lang.String r1) {
            java.util.Objects.requireNonNull(r1)
            r0.zze = r1
            return
    }

    /* renamed from: w */
    public static /* synthetic */ void m7215w(p124h7.C2906v6 r0, p124h7.EnumC2583d7 r1) {
            int r1 = r1.m6591a()
            r0.zzh = r1
            return
    }

    /* renamed from: x */
    public static /* synthetic */ void m7216x(p124h7.C2906v6 r0, p124h7.EnumC2708k6 r1) {
            int r1 = r1.m6948a()
            r0.zzf = r1
            return
    }

    /* renamed from: y */
    public static /* synthetic */ void m7217y(p124h7.C2906v6 r0, int r1) {
            r0.zzg = r1
            return
    }

    @Override // p124h7.AbstractC2970yg
    /* renamed from: h */
    public final java.lang.Object mo6484h(int r4, java.lang.Object r5, java.lang.Object r6) {
            r3 = this;
            int r4 = r4 + (-1)
            r5 = 1
            if (r4 == 0) goto L3f
            r6 = 4
            r0 = 3
            r1 = 2
            if (r4 == r1) goto L22
            if (r4 == r0) goto L1c
            r5 = 0
            if (r4 == r6) goto L16
            r6 = 5
            if (r4 == r6) goto L13
            return r5
        L13:
            h7.v6 r4 = p124h7.C2906v6.zzb
            return r4
        L16:
            h7.u6 r4 = new h7.u6
            r4.<init>(r5)
            return r4
        L1c:
            h7.v6 r4 = new h7.v6
            r4.<init>()
            return r4
        L22:
            java.lang.Object[] r4 = new java.lang.Object[r6]
            r6 = 0
            java.lang.String r2 = "zze"
            r4[r6] = r2
            java.lang.String r6 = "zzf"
            r4[r5] = r6
            java.lang.String r5 = "zzg"
            r4[r1] = r5
            java.lang.String r5 = "zzh"
            r4[r0] = r5
            h7.v6 r5 = p124h7.C2906v6.zzb
            h7.h0 r6 = new h7.h0
            java.lang.String r0 = "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0208\u0002\f\u0003\u000b\u0004\f"
            r6.<init>(r5, r0, r4)
            return r6
        L3f:
            java.lang.Byte r4 = java.lang.Byte.valueOf(r5)
            return r4
    }

    /* renamed from: r */
    public final int m7218r() {
            r1 = this;
            int r0 = r1.zzg
            return r0
    }
}
