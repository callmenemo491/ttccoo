package p185k7;

/* renamed from: k7.u2 */
/* loaded from: classes.dex */
public final class C3997u2 extends p185k7.AbstractC3773d6<p185k7.C3997u2, p185k7.C3984t2> implements p185k7.InterfaceC3816g7 {
    private static final p185k7.C3997u2 zza = null;
    private int zze;
    private p185k7.InterfaceC3857j6<p185k7.C4049y2> zzf;
    private java.lang.String zzg;
    private long zzh;
    private long zzi;
    private int zzj;

    static {
            k7.u2 r0 = new k7.u2
            r0.<init>()
            p185k7.C3997u2.zza = r0
            java.lang.Class<k7.u2> r1 = p185k7.C3997u2.class
            p185k7.AbstractC3773d6.m8491l(r1, r0)
            return
    }

    public C3997u2() {
            r1 = this;
            r1.<init>()
            k7.o7<java.lang.Object> r0 = p185k7.C3924o7.f16809b0
            r1.zzf = r0
            java.lang.String r0 = ""
            r1.zzg = r0
            return
    }

    /* renamed from: B */
    public static /* synthetic */ void m9032B(p185k7.C3997u2 r0, int r1, p185k7.C4049y2 r2) {
            java.util.Objects.requireNonNull(r2)
            r0.m9046M()
            k7.j6<k7.y2> r0 = r0.zzf
            r0.set(r1, r2)
            return
    }

    /* renamed from: C */
    public static /* synthetic */ void m9033C(p185k7.C3997u2 r0, p185k7.C4049y2 r1) {
            java.util.Objects.requireNonNull(r1)
            r0.m9046M()
            k7.j6<k7.y2> r0 = r0.zzf
            r0.add(r1)
            return
    }

    /* renamed from: D */
    public static /* synthetic */ void m9034D(p185k7.C3997u2 r0, java.lang.Iterable r1) {
            r0.m9046M()
            k7.j6<k7.y2> r0 = r0.zzf
            p185k7.AbstractC4064z4.m9159g(r1, r0)
            return
    }

    /* renamed from: E */
    public static void m9035E(p185k7.C3997u2 r1) {
            k7.o7<java.lang.Object> r0 = p185k7.C3924o7.f16809b0
            r1.zzf = r0
            return
    }

    /* renamed from: F */
    public static /* synthetic */ void m9036F(p185k7.C3997u2 r0, int r1) {
            r0.m9046M()
            k7.j6<k7.y2> r0 = r0.zzf
            r0.remove(r1)
            return
    }

    /* renamed from: G */
    public static /* synthetic */ void m9037G(p185k7.C3997u2 r1, java.lang.String r2) {
            java.util.Objects.requireNonNull(r2)
            int r0 = r1.zze
            r0 = r0 | 1
            r1.zze = r0
            r1.zzg = r2
            return
    }

    /* renamed from: H */
    public static /* synthetic */ void m9038H(p185k7.C3997u2 r1, long r2) {
            int r0 = r1.zze
            r0 = r0 | 2
            r1.zze = r0
            r1.zzh = r2
            return
    }

    /* renamed from: I */
    public static /* synthetic */ void m9039I(p185k7.C3997u2 r1, long r2) {
            int r0 = r1.zze
            r0 = r0 | 4
            r1.zze = r0
            r1.zzi = r2
            return
    }

    /* renamed from: w */
    public static p185k7.C3984t2 m9040w() {
            k7.u2 r0 = p185k7.C3997u2.zza
            k7.a6 r0 = r0.m8500n()
            k7.t2 r0 = (p185k7.C3984t2) r0
            return r0
    }

    /* renamed from: x */
    public static /* synthetic */ p185k7.C3997u2 m9041x() {
            k7.u2 r0 = p185k7.C3997u2.zza
            return r0
    }

    /* renamed from: A */
    public final java.util.List<p185k7.C4049y2> m9042A() {
            r1 = this;
            k7.j6<k7.y2> r0 = r1.zzf
            return r0
    }

    /* renamed from: J */
    public final boolean m9043J() {
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

    /* renamed from: K */
    public final boolean m9044K() {
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

    /* renamed from: L */
    public final boolean m9045L() {
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

    /* renamed from: M */
    public final void m9046M() {
            r2 = this;
            k7.j6<k7.y2> r0 = r2.zzf
            boolean r1 = r0.mo8199c()
            if (r1 != 0) goto Le
            k7.j6 r0 = p185k7.AbstractC3773d6.m8489j(r0)
            r2.zzf = r0
        Le:
            return
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
            k7.u2 r6 = p185k7.C3997u2.zza
            return r6
        L16:
            k7.t2 r6 = new k7.t2
            r6.<init>(r7)
            return r6
        L1c:
            k7.u2 r6 = new k7.u2
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
            java.lang.Class<k7.y2> r7 = p185k7.C4049y2.class
            r6[r2] = r7
            java.lang.String r7 = "zzg"
            r6[r1] = r7
            java.lang.String r7 = "zzh"
            r6[r0] = r7
            java.lang.String r7 = "zzi"
            r6[r8] = r7
            r7 = 6
            java.lang.String r8 = "zzj"
            r6[r7] = r8
            k7.u2 r7 = p185k7.C3997u2.zza
            k7.p7 r8 = new k7.p7
            java.lang.String r0 = "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002\u1008\u0000\u0003\u1002\u0001\u0004\u1002\u0002\u0005\u1004\u0003"
            r8.<init>(r7, r0, r6)
            return r8
        L4d:
            java.lang.Byte r6 = java.lang.Byte.valueOf(r7)
            return r6
    }

    /* renamed from: s */
    public final int m9047s() {
            r1 = this;
            int r0 = r1.zzj
            return r0
    }

    /* renamed from: t */
    public final int m9048t() {
            r1 = this;
            k7.j6<k7.y2> r0 = r1.zzf
            int r0 = r0.size()
            return r0
    }

    /* renamed from: u */
    public final long m9049u() {
            r2 = this;
            long r0 = r2.zzi
            return r0
    }

    /* renamed from: v */
    public final long m9050v() {
            r2 = this;
            long r0 = r2.zzh
            return r0
    }

    /* renamed from: y */
    public final p185k7.C4049y2 m9051y(int r2) {
            r1 = this;
            k7.j6<k7.y2> r0 = r1.zzf
            java.lang.Object r2 = r0.get(r2)
            k7.y2 r2 = (p185k7.C4049y2) r2
            return r2
    }

    /* renamed from: z */
    public final java.lang.String m9052z() {
            r1 = this;
            java.lang.String r0 = r1.zzg
            return r0
    }
}
