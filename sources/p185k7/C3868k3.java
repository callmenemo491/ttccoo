package p185k7;

/* renamed from: k7.k3 */
/* loaded from: classes.dex */
public final class C3868k3 extends p185k7.AbstractC3773d6<p185k7.C3868k3, p185k7.C3854j3> implements p185k7.InterfaceC3816g7 {
    private static final p185k7.C3868k3 zza = null;
    private int zze;
    private int zzf;
    private p185k7.InterfaceC3843i6 zzg;

    static {
            k7.k3 r0 = new k7.k3
            r0.<init>()
            p185k7.C3868k3.zza = r0
            java.lang.Class<k7.k3> r1 = p185k7.C3868k3.class
            p185k7.AbstractC3773d6.m8491l(r1, r0)
            return
    }

    public C3868k3() {
            r1 = this;
            r1.<init>()
            k7.u6 r0 = p185k7.C4001u6.f16892b0
            r1.zzg = r0
            return
    }

    /* renamed from: v */
    public static p185k7.C3854j3 m8754v() {
            k7.k3 r0 = p185k7.C3868k3.zza
            k7.a6 r0 = r0.m8500n()
            k7.j3 r0 = (p185k7.C3854j3) r0
            return r0
    }

    /* renamed from: w */
    public static /* synthetic */ p185k7.C3868k3 m8755w() {
            k7.k3 r0 = p185k7.C3868k3.zza
            return r0
    }

    /* renamed from: y */
    public static /* synthetic */ void m8756y(p185k7.C3868k3 r1, int r2) {
            int r0 = r1.zze
            r0 = r0 | 1
            r1.zze = r0
            r1.zzf = r2
            return
    }

    /* renamed from: z */
    public static void m8757z(p185k7.C3868k3 r2, java.lang.Iterable r3) {
            k7.i6 r0 = r2.zzg
            r1 = r0
            k7.a5 r1 = (p185k7.AbstractC3730a5) r1
            boolean r1 = r1.f16451Y
            if (r1 != 0) goto Lf
            k7.i6 r0 = p185k7.AbstractC3773d6.m8493q(r0)
            r2.zzg = r0
        Lf:
            k7.i6 r2 = r2.zzg
            p185k7.AbstractC4064z4.m9159g(r3, r2)
            return
    }

    /* renamed from: A */
    public final boolean m8758A() {
            r2 = this;
            int r0 = r2.zze
            r1 = 1
            r0 = r0 & r1
            if (r0 == 0) goto L7
            return r1
        L7:
            r0 = 0
            return r0
    }

    @Override // p185k7.AbstractC3773d6
    /* renamed from: r */
    public final java.lang.Object mo8189r(int r3, java.lang.Object r4, java.lang.Object r5) {
            r2 = this;
            int r3 = r3 + (-1)
            r4 = 1
            if (r3 == 0) goto L3b
            r5 = 3
            r0 = 2
            if (r3 == r0) goto L22
            if (r3 == r5) goto L1c
            r4 = 4
            r5 = 0
            if (r3 == r4) goto L16
            r4 = 5
            if (r3 == r4) goto L13
            return r5
        L13:
            k7.k3 r3 = p185k7.C3868k3.zza
            return r3
        L16:
            k7.j3 r3 = new k7.j3
            r3.<init>(r5)
            return r3
        L1c:
            k7.k3 r3 = new k7.k3
            r3.<init>()
            return r3
        L22:
            java.lang.Object[] r3 = new java.lang.Object[r5]
            r5 = 0
            java.lang.String r1 = "zze"
            r3[r5] = r1
            java.lang.String r5 = "zzf"
            r3[r4] = r5
            java.lang.String r4 = "zzg"
            r3[r0] = r4
            k7.k3 r4 = p185k7.C3868k3.zza
            k7.p7 r5 = new k7.p7
            java.lang.String r0 = "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u1004\u0000\u0002\u0014"
            r5.<init>(r4, r0, r3)
            return r5
        L3b:
            java.lang.Byte r3 = java.lang.Byte.valueOf(r4)
            return r3
    }

    /* renamed from: s */
    public final int m8759s() {
            r1 = this;
            k7.i6 r0 = r1.zzg
            k7.u6 r0 = (p185k7.C4001u6) r0
            int r0 = r0.size()
            return r0
    }

    /* renamed from: t */
    public final int m8760t() {
            r1 = this;
            int r0 = r1.zzf
            return r0
    }

    /* renamed from: u */
    public final long m8761u(int r4) {
            r3 = this;
            k7.i6 r0 = r3.zzg
            k7.u6 r0 = (p185k7.C4001u6) r0
            r0.m9061m(r4)
            long[] r0 = r0.f16893Z
            r1 = r0[r4]
            return r1
    }

    /* renamed from: x */
    public final java.util.List<java.lang.Long> m8762x() {
            r1 = this;
            k7.i6 r0 = r1.zzg
            return r0
    }
}
