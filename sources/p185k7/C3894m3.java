package p185k7;

/* renamed from: k7.m3 */
/* loaded from: classes.dex */
public final class C3894m3 extends p185k7.AbstractC3773d6<p185k7.C3894m3, p185k7.C3881l3> implements p185k7.InterfaceC3816g7 {
    private static final p185k7.C3894m3 zza = null;
    private int zze;
    private long zzf;
    private java.lang.String zzg;
    private java.lang.String zzh;
    private long zzi;
    private float zzj;
    private double zzk;

    static {
            k7.m3 r0 = new k7.m3
            r0.<init>()
            p185k7.C3894m3.zza = r0
            java.lang.Class<k7.m3> r1 = p185k7.C3894m3.class
            p185k7.AbstractC3773d6.m8491l(r1, r0)
            return
    }

    public C3894m3() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.zzg = r0
            r1.zzh = r0
            return
    }

    /* renamed from: A */
    public static /* synthetic */ void m8797A(p185k7.C3894m3 r1, java.lang.String r2) {
            java.util.Objects.requireNonNull(r2)
            int r0 = r1.zze
            r0 = r0 | 2
            r1.zze = r0
            r1.zzg = r2
            return
    }

    /* renamed from: B */
    public static /* synthetic */ void m8798B(p185k7.C3894m3 r1, java.lang.String r2) {
            java.util.Objects.requireNonNull(r2)
            int r0 = r1.zze
            r0 = r0 | 4
            r1.zze = r0
            r1.zzh = r2
            return
    }

    /* renamed from: C */
    public static /* synthetic */ void m8799C(p185k7.C3894m3 r1) {
            int r0 = r1.zze
            r0 = r0 & (-5)
            r1.zze = r0
            k7.m3 r0 = p185k7.C3894m3.zza
            java.lang.String r0 = r0.zzh
            r1.zzh = r0
            return
    }

    /* renamed from: D */
    public static /* synthetic */ void m8800D(p185k7.C3894m3 r1, long r2) {
            int r0 = r1.zze
            r0 = r0 | 8
            r1.zze = r0
            r1.zzi = r2
            return
    }

    /* renamed from: E */
    public static /* synthetic */ void m8801E(p185k7.C3894m3 r2) {
            int r0 = r2.zze
            r0 = r0 & (-9)
            r2.zze = r0
            r0 = 0
            r2.zzi = r0
            return
    }

    /* renamed from: F */
    public static /* synthetic */ void m8802F(p185k7.C3894m3 r1, double r2) {
            int r0 = r1.zze
            r0 = r0 | 32
            r1.zze = r0
            r1.zzk = r2
            return
    }

    /* renamed from: G */
    public static /* synthetic */ void m8803G(p185k7.C3894m3 r2) {
            int r0 = r2.zze
            r0 = r0 & (-33)
            r2.zze = r0
            r0 = 0
            r2.zzk = r0
            return
    }

    /* renamed from: v */
    public static p185k7.C3881l3 m8804v() {
            k7.m3 r0 = p185k7.C3894m3.zza
            k7.a6 r0 = r0.m8500n()
            k7.l3 r0 = (p185k7.C3881l3) r0
            return r0
    }

    /* renamed from: w */
    public static /* synthetic */ p185k7.C3894m3 m8805w() {
            k7.m3 r0 = p185k7.C3894m3.zza
            return r0
    }

    /* renamed from: z */
    public static /* synthetic */ void m8806z(p185k7.C3894m3 r1, long r2) {
            int r0 = r1.zze
            r0 = r0 | 1
            r1.zze = r0
            r1.zzf = r2
            return
    }

    /* renamed from: H */
    public final boolean m8807H() {
            r1 = this;
            int r0 = r1.zze
            r0 = r0 & 32
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    /* renamed from: I */
    public final boolean m8808I() {
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

    /* renamed from: J */
    public final boolean m8809J() {
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

    /* renamed from: K */
    public final boolean m8810K() {
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

    @Override // p185k7.AbstractC3773d6
    /* renamed from: r */
    public final java.lang.Object mo8189r(int r6, java.lang.Object r7, java.lang.Object r8) {
            r5 = this;
            int r6 = r6 + (-1)
            r7 = 1
            if (r6 == 0) goto L4d
            r8 = 5
            r0 = 4
            r1 = 3
            r2 = 2
            if (r6 == r2) goto L22
            if (r6 == r1) goto L1c
            r7 = 0
            if (r6 == r0) goto L16
            if (r6 == r8) goto L13
            return r7
        L13:
            k7.m3 r6 = p185k7.C3894m3.zza
            return r6
        L16:
            k7.l3 r6 = new k7.l3
            r6.<init>(r7)
            return r6
        L1c:
            k7.m3 r6 = new k7.m3
            r6.<init>()
            return r6
        L22:
            r6 = 7
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r3 = 0
            java.lang.String r4 = "zze"
            r6[r3] = r4
            java.lang.String r3 = "zzf"
            r6[r7] = r3
            java.lang.String r7 = "zzg"
            r6[r2] = r7
            java.lang.String r7 = "zzh"
            r6[r1] = r7
            java.lang.String r7 = "zzi"
            r6[r0] = r7
            java.lang.String r7 = "zzj"
            r6[r8] = r7
            r7 = 6
            java.lang.String r8 = "zzk"
            r6[r7] = r8
            k7.m3 r7 = p185k7.C3894m3.zza
            k7.p7 r8 = new k7.p7
            java.lang.String r0 = "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1002\u0003\u0005\u1001\u0004\u0006\u1000\u0005"
            r8.<init>(r7, r0, r6)
            return r8
        L4d:
            java.lang.Byte r6 = java.lang.Byte.valueOf(r7)
            return r6
    }

    /* renamed from: s */
    public final double m8811s() {
            r2 = this;
            double r0 = r2.zzk
            return r0
    }

    /* renamed from: t */
    public final long m8812t() {
            r2 = this;
            long r0 = r2.zzi
            return r0
    }

    /* renamed from: u */
    public final long m8813u() {
            r2 = this;
            long r0 = r2.zzf
            return r0
    }

    /* renamed from: x */
    public final java.lang.String m8814x() {
            r1 = this;
            java.lang.String r0 = r1.zzg
            return r0
    }

    /* renamed from: y */
    public final java.lang.String m8815y() {
            r1 = this;
            java.lang.String r0 = r1.zzh
            return r0
    }
}
