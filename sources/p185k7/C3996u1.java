package p185k7;

/* renamed from: k7.u1 */
/* loaded from: classes.dex */
public final class C3996u1 extends p185k7.AbstractC3773d6<p185k7.C3996u1, p185k7.C3983t1> implements p185k7.InterfaceC3816g7 {
    private static final p185k7.C3996u1 zza = null;
    private int zze;
    private p185k7.C3783e2 zzf;
    private p185k7.C4048y1 zzg;
    private boolean zzh;
    private java.lang.String zzi;

    static {
            k7.u1 r0 = new k7.u1
            r0.<init>()
            p185k7.C3996u1.zza = r0
            java.lang.Class<k7.u1> r1 = p185k7.C3996u1.class
            p185k7.AbstractC3773d6.m8491l(r1, r0)
            return
    }

    public C3996u1() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.zzi = r0
            return
    }

    /* renamed from: s */
    public static /* synthetic */ p185k7.C3996u1 m9021s() {
            k7.u1 r0 = p185k7.C3996u1.zza
            return r0
    }

    /* renamed from: t */
    public static p185k7.C3996u1 m9022t() {
            k7.u1 r0 = p185k7.C3996u1.zza
            return r0
    }

    /* renamed from: x */
    public static /* synthetic */ void m9023x(p185k7.C3996u1 r1, java.lang.String r2) {
            int r0 = r1.zze
            r0 = r0 | 8
            r1.zze = r0
            r1.zzi = r2
            return
    }

    /* renamed from: A */
    public final boolean m9024A() {
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

    /* renamed from: B */
    public final boolean m9025B() {
            r1 = this;
            int r0 = r1.zze
            r0 = r0 & 8
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    /* renamed from: C */
    public final boolean m9026C() {
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
    public final java.lang.Object mo8189r(int r5, java.lang.Object r6, java.lang.Object r7) {
            r4 = this;
            int r5 = r5 + (-1)
            r6 = 1
            if (r5 == 0) goto L43
            r7 = 5
            r0 = 4
            r1 = 3
            r2 = 2
            if (r5 == r2) goto L22
            if (r5 == r1) goto L1c
            r6 = 0
            if (r5 == r0) goto L16
            if (r5 == r7) goto L13
            return r6
        L13:
            k7.u1 r5 = p185k7.C3996u1.zza
            return r5
        L16:
            k7.t1 r5 = new k7.t1
            r5.<init>(r6)
            return r5
        L1c:
            k7.u1 r5 = new k7.u1
            r5.<init>()
            return r5
        L22:
            java.lang.Object[] r5 = new java.lang.Object[r7]
            r7 = 0
            java.lang.String r3 = "zze"
            r5[r7] = r3
            java.lang.String r7 = "zzf"
            r5[r6] = r7
            java.lang.String r6 = "zzg"
            r5[r2] = r6
            java.lang.String r6 = "zzh"
            r5[r1] = r6
            java.lang.String r6 = "zzi"
            r5[r0] = r6
            k7.u1 r6 = p185k7.C3996u1.zza
            k7.p7 r7 = new k7.p7
            java.lang.String r0 = "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001\u0003\u1007\u0002\u0004\u1008\u0003"
            r7.<init>(r6, r0, r5)
            return r7
        L43:
            java.lang.Byte r5 = java.lang.Byte.valueOf(r6)
            return r5
    }

    /* renamed from: u */
    public final p185k7.C4048y1 m9027u() {
            r1 = this;
            k7.y1 r0 = r1.zzg
            if (r0 != 0) goto L8
            k7.y1 r0 = p185k7.C4048y1.m9115t()
        L8:
            return r0
    }

    /* renamed from: v */
    public final p185k7.C3783e2 m9028v() {
            r1 = this;
            k7.e2 r0 = r1.zzf
            if (r0 != 0) goto L8
            k7.e2 r0 = p185k7.C3783e2.m8509u()
        L8:
            return r0
    }

    /* renamed from: w */
    public final java.lang.String m9029w() {
            r1 = this;
            java.lang.String r0 = r1.zzi
            return r0
    }

    /* renamed from: y */
    public final boolean m9030y() {
            r1 = this;
            boolean r0 = r1.zzh
            return r0
    }

    /* renamed from: z */
    public final boolean m9031z() {
            r1 = this;
            int r0 = r1.zze
            r0 = r0 & 4
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }
}
