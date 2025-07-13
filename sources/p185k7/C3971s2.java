package p185k7;

/* renamed from: k7.s2 */
/* loaded from: classes.dex */
public final class C3971s2 extends p185k7.AbstractC3773d6<p185k7.C3971s2, p185k7.C3958r2> implements p185k7.InterfaceC3816g7 {
    private static final p185k7.C3971s2 zza = null;
    private int zze;
    private int zzf;
    private long zzg;

    static {
            k7.s2 r0 = new k7.s2
            r0.<init>()
            p185k7.C3971s2.zza = r0
            java.lang.Class<k7.s2> r1 = p185k7.C3971s2.class
            p185k7.AbstractC3773d6.m8491l(r1, r0)
            return
    }

    public C3971s2() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: u */
    public static p185k7.C3958r2 m8942u() {
            k7.s2 r0 = p185k7.C3971s2.zza
            k7.a6 r0 = r0.m8500n()
            k7.r2 r0 = (p185k7.C3958r2) r0
            return r0
    }

    /* renamed from: v */
    public static /* synthetic */ p185k7.C3971s2 m8943v() {
            k7.s2 r0 = p185k7.C3971s2.zza
            return r0
    }

    /* renamed from: w */
    public static /* synthetic */ void m8944w(p185k7.C3971s2 r1, int r2) {
            int r0 = r1.zze
            r0 = r0 | 1
            r1.zze = r0
            r1.zzf = r2
            return
    }

    /* renamed from: x */
    public static /* synthetic */ void m8945x(p185k7.C3971s2 r1, long r2) {
            int r0 = r1.zze
            r0 = r0 | 2
            r1.zze = r0
            r1.zzg = r2
            return
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
            k7.s2 r3 = p185k7.C3971s2.zza
            return r3
        L16:
            k7.r2 r3 = new k7.r2
            r3.<init>(r5)
            return r3
        L1c:
            k7.s2 r3 = new k7.s2
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
            k7.s2 r4 = p185k7.C3971s2.zza
            k7.p7 r5 = new k7.p7
            java.lang.String r0 = "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1002\u0001"
            r5.<init>(r4, r0, r3)
            return r5
        L3b:
            java.lang.Byte r3 = java.lang.Byte.valueOf(r4)
            return r3
    }

    /* renamed from: s */
    public final int m8946s() {
            r1 = this;
            int r0 = r1.zzf
            return r0
    }

    /* renamed from: t */
    public final long m8947t() {
            r2 = this;
            long r0 = r2.zzg
            return r0
    }

    /* renamed from: y */
    public final boolean m8948y() {
            r1 = this;
            int r0 = r1.zze
            r0 = r0 & 2
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    /* renamed from: z */
    public final boolean m8949z() {
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
}
