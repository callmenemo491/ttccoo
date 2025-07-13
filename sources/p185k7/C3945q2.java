package p185k7;

/* renamed from: k7.q2 */
/* loaded from: classes.dex */
public final class C3945q2 extends p185k7.AbstractC3773d6<p185k7.C3945q2, p185k7.C3932p2> implements p185k7.InterfaceC3816g7 {
    private static final p185k7.C3945q2 zza = null;
    private int zze;
    private int zzf;
    private p185k7.C3840i3 zzg;
    private p185k7.C3840i3 zzh;
    private boolean zzi;

    static {
            k7.q2 r0 = new k7.q2
            r0.<init>()
            p185k7.C3945q2.zza = r0
            java.lang.Class<k7.q2> r1 = p185k7.C3945q2.class
            p185k7.AbstractC3773d6.m8491l(r1, r0)
            return
    }

    public C3945q2() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: A */
    public static /* synthetic */ void m8894A(p185k7.C3945q2 r1, boolean r2) {
            int r0 = r1.zze
            r0 = r0 | 8
            r1.zze = r0
            r1.zzi = r2
            return
    }

    /* renamed from: t */
    public static p185k7.C3932p2 m8895t() {
            k7.q2 r0 = p185k7.C3945q2.zza
            k7.a6 r0 = r0.m8500n()
            k7.p2 r0 = (p185k7.C3932p2) r0
            return r0
    }

    /* renamed from: u */
    public static /* synthetic */ p185k7.C3945q2 m8896u() {
            k7.q2 r0 = p185k7.C3945q2.zza
            return r0
    }

    /* renamed from: x */
    public static /* synthetic */ void m8897x(p185k7.C3945q2 r1, int r2) {
            int r0 = r1.zze
            r0 = r0 | 1
            r1.zze = r0
            r1.zzf = r2
            return
    }

    /* renamed from: y */
    public static /* synthetic */ void m8898y(p185k7.C3945q2 r0, p185k7.C3840i3 r1) {
            r0.zzg = r1
            int r1 = r0.zze
            r1 = r1 | 2
            r0.zze = r1
            return
    }

    /* renamed from: z */
    public static /* synthetic */ void m8899z(p185k7.C3945q2 r0, p185k7.C3840i3 r1) {
            r0.zzh = r1
            int r1 = r0.zze
            r1 = r1 | 4
            r0.zze = r1
            return
    }

    /* renamed from: B */
    public final boolean m8900B() {
            r1 = this;
            boolean r0 = r1.zzi
            return r0
    }

    /* renamed from: C */
    public final boolean m8901C() {
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

    /* renamed from: D */
    public final boolean m8902D() {
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

    /* renamed from: E */
    public final boolean m8903E() {
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
            k7.q2 r5 = p185k7.C3945q2.zza
            return r5
        L16:
            k7.p2 r5 = new k7.p2
            r5.<init>(r6)
            return r5
        L1c:
            k7.q2 r5 = new k7.q2
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
            k7.q2 r6 = p185k7.C3945q2.zza
            k7.p7 r7 = new k7.p7
            java.lang.String r0 = "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1009\u0001\u0003\u1009\u0002\u0004\u1007\u0003"
            r7.<init>(r6, r0, r5)
            return r7
        L43:
            java.lang.Byte r5 = java.lang.Byte.valueOf(r6)
            return r5
    }

    /* renamed from: s */
    public final int m8904s() {
            r1 = this;
            int r0 = r1.zzf
            return r0
    }

    /* renamed from: v */
    public final p185k7.C3840i3 m8905v() {
            r1 = this;
            k7.i3 r0 = r1.zzg
            if (r0 != 0) goto L8
            k7.i3 r0 = p185k7.C3840i3.m8649z()
        L8:
            return r0
    }

    /* renamed from: w */
    public final p185k7.C3840i3 m8906w() {
            r1 = this;
            k7.i3 r0 = r1.zzh
            if (r0 != 0) goto L8
            k7.i3 r0 = p185k7.C3840i3.m8649z()
        L8:
            return r0
    }
}
