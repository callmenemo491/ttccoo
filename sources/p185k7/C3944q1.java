package p185k7;

/* renamed from: k7.q1 */
/* loaded from: classes.dex */
public final class C3944q1 extends p185k7.AbstractC3773d6<p185k7.C3944q1, p185k7.C3931p1> implements p185k7.InterfaceC3816g7 {
    private static final p185k7.C3944q1 zza = null;
    private int zze;
    private int zzf;
    private p185k7.InterfaceC3857j6<p185k7.C3727a2> zzg;
    private p185k7.InterfaceC3857j6<p185k7.C3970s1> zzh;
    private boolean zzi;
    private boolean zzj;

    static {
            k7.q1 r0 = new k7.q1
            r0.<init>()
            p185k7.C3944q1.zza = r0
            java.lang.Class<k7.q1> r1 = p185k7.C3944q1.class
            p185k7.AbstractC3773d6.m8491l(r1, r0)
            return
    }

    public C3944q1() {
            r1 = this;
            r1.<init>()
            k7.o7<java.lang.Object> r0 = p185k7.C3924o7.f16809b0
            r1.zzg = r0
            r1.zzh = r0
            return
    }

    /* renamed from: A */
    public static /* synthetic */ void m8883A(p185k7.C3944q1 r2, int r3, p185k7.C3727a2 r4) {
            k7.j6<k7.a2> r0 = r2.zzg
            boolean r1 = r0.mo8199c()
            if (r1 != 0) goto Le
            k7.j6 r0 = p185k7.AbstractC3773d6.m8489j(r0)
            r2.zzg = r0
        Le:
            k7.j6<k7.a2> r2 = r2.zzg
            r2.set(r3, r4)
            return
    }

    /* renamed from: B */
    public static /* synthetic */ void m8884B(p185k7.C3944q1 r2, int r3, p185k7.C3970s1 r4) {
            k7.j6<k7.s1> r0 = r2.zzh
            boolean r1 = r0.mo8199c()
            if (r1 != 0) goto Le
            k7.j6 r0 = p185k7.AbstractC3773d6.m8489j(r0)
            r2.zzh = r0
        Le:
            k7.j6<k7.s1> r2 = r2.zzh
            r2.set(r3, r4)
            return
    }

    /* renamed from: v */
    public static /* synthetic */ p185k7.C3944q1 m8885v() {
            k7.q1 r0 = p185k7.C3944q1.zza
            return r0
    }

    /* renamed from: C */
    public final boolean m8886C() {
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
            k7.q1 r6 = p185k7.C3944q1.zza
            return r6
        L16:
            k7.p1 r6 = new k7.p1
            r6.<init>(r7)
            return r6
        L1c:
            k7.q1 r6 = new k7.q1
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
            java.lang.Class<k7.a2> r7 = p185k7.C3727a2.class
            r6[r1] = r7
            java.lang.String r7 = "zzh"
            r6[r0] = r7
            java.lang.Class<k7.s1> r7 = p185k7.C3970s1.class
            r6[r8] = r7
            r7 = 6
            java.lang.String r8 = "zzi"
            r6[r7] = r8
            r7 = 7
            java.lang.String r8 = "zzj"
            r6[r7] = r8
            k7.q1 r7 = p185k7.C3944q1.zza
            k7.p7 r8 = new k7.p7
            java.lang.String r0 = "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001\u1004\u0000\u0002\u001b\u0003\u001b\u0004\u1007\u0001\u0005\u1007\u0002"
            r8.<init>(r7, r0, r6)
            return r8
        L53:
            java.lang.Byte r6 = java.lang.Byte.valueOf(r7)
            return r6
    }

    /* renamed from: s */
    public final int m8887s() {
            r1 = this;
            int r0 = r1.zzf
            return r0
    }

    /* renamed from: t */
    public final int m8888t() {
            r1 = this;
            k7.j6<k7.s1> r0 = r1.zzh
            int r0 = r0.size()
            return r0
    }

    /* renamed from: u */
    public final int m8889u() {
            r1 = this;
            k7.j6<k7.a2> r0 = r1.zzg
            int r0 = r0.size()
            return r0
    }

    /* renamed from: w */
    public final p185k7.C3970s1 m8890w(int r2) {
            r1 = this;
            k7.j6<k7.s1> r0 = r1.zzh
            java.lang.Object r2 = r0.get(r2)
            k7.s1 r2 = (p185k7.C3970s1) r2
            return r2
    }

    /* renamed from: x */
    public final p185k7.C3727a2 m8891x(int r2) {
            r1 = this;
            k7.j6<k7.a2> r0 = r1.zzg
            java.lang.Object r2 = r0.get(r2)
            k7.a2 r2 = (p185k7.C3727a2) r2
            return r2
    }

    /* renamed from: y */
    public final java.util.List<p185k7.C3970s1> m8892y() {
            r1 = this;
            k7.j6<k7.s1> r0 = r1.zzh
            return r0
    }

    /* renamed from: z */
    public final java.util.List<p185k7.C3727a2> m8893z() {
            r1 = this;
            k7.j6<k7.a2> r0 = r1.zzg
            return r0
    }
}
