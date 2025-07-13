package p185k7;

/* renamed from: k7.y2 */
/* loaded from: classes.dex */
public final class C4049y2 extends p185k7.AbstractC3773d6<p185k7.C4049y2, p185k7.C4036x2> implements p185k7.InterfaceC3816g7 {
    private static final p185k7.C4049y2 zza = null;
    private int zze;
    private java.lang.String zzf;
    private java.lang.String zzg;
    private long zzh;
    private float zzi;
    private double zzj;
    private p185k7.InterfaceC3857j6<p185k7.C4049y2> zzk;

    static {
            k7.y2 r0 = new k7.y2
            r0.<init>()
            p185k7.C4049y2.zza = r0
            java.lang.Class<k7.y2> r1 = p185k7.C4049y2.class
            p185k7.AbstractC3773d6.m8491l(r1, r0)
            return
    }

    public C4049y2() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.zzf = r0
            r1.zzg = r0
            k7.o7<java.lang.Object> r0 = p185k7.C3924o7.f16809b0
            r1.zzk = r0
            return
    }

    /* renamed from: B */
    public static /* synthetic */ void m9126B(p185k7.C4049y2 r1, java.lang.String r2) {
            java.util.Objects.requireNonNull(r2)
            int r0 = r1.zze
            r0 = r0 | 1
            r1.zze = r0
            r1.zzf = r2
            return
    }

    /* renamed from: C */
    public static /* synthetic */ void m9127C(p185k7.C4049y2 r1, java.lang.String r2) {
            java.util.Objects.requireNonNull(r2)
            int r0 = r1.zze
            r0 = r0 | 2
            r1.zze = r0
            r1.zzg = r2
            return
    }

    /* renamed from: D */
    public static /* synthetic */ void m9128D(p185k7.C4049y2 r1) {
            int r0 = r1.zze
            r0 = r0 & (-3)
            r1.zze = r0
            k7.y2 r0 = p185k7.C4049y2.zza
            java.lang.String r0 = r0.zzg
            r1.zzg = r0
            return
    }

    /* renamed from: E */
    public static /* synthetic */ void m9129E(p185k7.C4049y2 r1, long r2) {
            int r0 = r1.zze
            r0 = r0 | 4
            r1.zze = r0
            r1.zzh = r2
            return
    }

    /* renamed from: F */
    public static /* synthetic */ void m9130F(p185k7.C4049y2 r2) {
            int r0 = r2.zze
            r0 = r0 & (-5)
            r2.zze = r0
            r0 = 0
            r2.zzh = r0
            return
    }

    /* renamed from: G */
    public static /* synthetic */ void m9131G(p185k7.C4049y2 r1, double r2) {
            int r0 = r1.zze
            r0 = r0 | 16
            r1.zze = r0
            r1.zzj = r2
            return
    }

    /* renamed from: H */
    public static /* synthetic */ void m9132H(p185k7.C4049y2 r2) {
            int r0 = r2.zze
            r0 = r0 & (-17)
            r2.zze = r0
            r0 = 0
            r2.zzj = r0
            return
    }

    /* renamed from: I */
    public static void m9133I(p185k7.C4049y2 r2, p185k7.C4049y2 r3) {
            k7.j6<k7.y2> r0 = r2.zzk
            boolean r1 = r0.mo8199c()
            if (r1 != 0) goto Le
            k7.j6 r0 = p185k7.AbstractC3773d6.m8489j(r0)
            r2.zzk = r0
        Le:
            k7.j6<k7.y2> r2 = r2.zzk
            r2.add(r3)
            return
    }

    /* renamed from: J */
    public static void m9134J(p185k7.C4049y2 r2, java.lang.Iterable r3) {
            k7.j6<k7.y2> r0 = r2.zzk
            boolean r1 = r0.mo8199c()
            if (r1 != 0) goto Le
            k7.j6 r0 = p185k7.AbstractC3773d6.m8489j(r0)
            r2.zzk = r0
        Le:
            k7.j6<k7.y2> r2 = r2.zzk
            p185k7.AbstractC4064z4.m9159g(r3, r2)
            return
    }

    /* renamed from: K */
    public static void m9135K(p185k7.C4049y2 r1) {
            k7.o7<java.lang.Object> r0 = p185k7.C3924o7.f16809b0
            r1.zzk = r0
            return
    }

    /* renamed from: w */
    public static p185k7.C4036x2 m9136w() {
            k7.y2 r0 = p185k7.C4049y2.zza
            k7.a6 r0 = r0.m8500n()
            k7.x2 r0 = (p185k7.C4036x2) r0
            return r0
    }

    /* renamed from: x */
    public static /* synthetic */ p185k7.C4049y2 m9137x() {
            k7.y2 r0 = p185k7.C4049y2.zza
            return r0
    }

    /* renamed from: A */
    public final java.util.List<p185k7.C4049y2> m9138A() {
            r1 = this;
            k7.j6<k7.y2> r0 = r1.zzk
            return r0
    }

    /* renamed from: L */
    public final boolean m9139L() {
            r1 = this;
            int r0 = r1.zze
            r0 = r0 & 16
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    /* renamed from: M */
    public final boolean m9140M() {
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

    /* renamed from: N */
    public final boolean m9141N() {
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

    /* renamed from: O */
    public final boolean m9142O() {
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

    /* renamed from: P */
    public final boolean m9143P() {
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

    @Override // p185k7.AbstractC3773d6
    /* renamed from: r */
    public final java.lang.Object mo8189r(int r6, java.lang.Object r7, java.lang.Object r8) {
            r5 = this;
            int r6 = r6 + (-1)
            r7 = 1
            if (r6 == 0) goto L53
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
            k7.y2 r6 = p185k7.C4049y2.zza
            return r6
        L16:
            k7.x2 r6 = new k7.x2
            r6.<init>(r7)
            return r6
        L1c:
            k7.y2 r6 = new k7.y2
            r6.<init>()
            return r6
        L22:
            r6 = 8
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
            r7 = 7
            java.lang.Class<k7.y2> r8 = p185k7.C4049y2.class
            r6[r7] = r8
            k7.y2 r7 = p185k7.C4049y2.zza
            k7.p7 r8 = new k7.p7
            java.lang.String r0 = "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1002\u0002\u0004\u1001\u0003\u0005\u1000\u0004\u0006\u001b"
            r8.<init>(r7, r0, r6)
            return r8
        L53:
            java.lang.Byte r6 = java.lang.Byte.valueOf(r7)
            return r6
    }

    /* renamed from: s */
    public final double m9144s() {
            r2 = this;
            double r0 = r2.zzj
            return r0
    }

    /* renamed from: t */
    public final float m9145t() {
            r1 = this;
            float r0 = r1.zzi
            return r0
    }

    /* renamed from: u */
    public final int m9146u() {
            r1 = this;
            k7.j6<k7.y2> r0 = r1.zzk
            int r0 = r0.size()
            return r0
    }

    /* renamed from: v */
    public final long m9147v() {
            r2 = this;
            long r0 = r2.zzh
            return r0
    }

    /* renamed from: y */
    public final java.lang.String m9148y() {
            r1 = this;
            java.lang.String r0 = r1.zzf
            return r0
    }

    /* renamed from: z */
    public final java.lang.String m9149z() {
            r1 = this;
            java.lang.String r0 = r1.zzg
            return r0
    }
}
