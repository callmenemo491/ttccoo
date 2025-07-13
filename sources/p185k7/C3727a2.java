package p185k7;

/* renamed from: k7.a2 */
/* loaded from: classes.dex */
public final class C3727a2 extends p185k7.AbstractC3773d6<p185k7.C3727a2, p185k7.C4061z1> implements p185k7.InterfaceC3816g7 {
    private static final p185k7.C3727a2 zza = null;
    private int zze;
    private int zzf;
    private java.lang.String zzg;
    private p185k7.C3996u1 zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    static {
            k7.a2 r0 = new k7.a2
            r0.<init>()
            p185k7.C3727a2.zza = r0
            java.lang.Class<k7.a2> r1 = p185k7.C3727a2.class
            p185k7.AbstractC3773d6.m8491l(r1, r0)
            return
    }

    public C3727a2() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.zzg = r0
            return
    }

    /* renamed from: u */
    public static p185k7.C4061z1 m8183u() {
            k7.a2 r0 = p185k7.C3727a2.zza
            k7.a6 r0 = r0.m8500n()
            k7.z1 r0 = (p185k7.C4061z1) r0
            return r0
    }

    /* renamed from: v */
    public static /* synthetic */ p185k7.C3727a2 m8184v() {
            k7.a2 r0 = p185k7.C3727a2.zza
            return r0
    }

    /* renamed from: x */
    public static /* synthetic */ void m8185x(p185k7.C3727a2 r1, java.lang.String r2) {
            int r0 = r1.zze
            r0 = r0 | 2
            r1.zze = r0
            r1.zzg = r2
            return
    }

    /* renamed from: A */
    public final boolean m8186A() {
            r1 = this;
            boolean r0 = r1.zzk
            return r0
    }

    /* renamed from: B */
    public final boolean m8187B() {
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

    /* renamed from: C */
    public final boolean m8188C() {
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
            k7.a2 r6 = p185k7.C3727a2.zza
            return r6
        L16:
            k7.z1 r6 = new k7.z1
            r6.<init>(r7)
            return r6
        L1c:
            k7.a2 r6 = new k7.a2
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
            k7.a2 r7 = p185k7.C3727a2.zza
            k7.p7 r8 = new k7.p7
            java.lang.String r0 = "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1008\u0001\u0003\u1009\u0002\u0004\u1007\u0003\u0005\u1007\u0004\u0006\u1007\u0005"
            r8.<init>(r7, r0, r6)
            return r8
        L4d:
            java.lang.Byte r6 = java.lang.Byte.valueOf(r7)
            return r6
    }

    /* renamed from: s */
    public final int m8190s() {
            r1 = this;
            int r0 = r1.zzf
            return r0
    }

    /* renamed from: t */
    public final p185k7.C3996u1 m8191t() {
            r1 = this;
            k7.u1 r0 = r1.zzh
            if (r0 != 0) goto L8
            k7.u1 r0 = p185k7.C3996u1.m9022t()
        L8:
            return r0
    }

    /* renamed from: w */
    public final java.lang.String m8192w() {
            r1 = this;
            java.lang.String r0 = r1.zzg
            return r0
    }

    /* renamed from: y */
    public final boolean m8193y() {
            r1 = this;
            boolean r0 = r1.zzi
            return r0
    }

    /* renamed from: z */
    public final boolean m8194z() {
            r1 = this;
            boolean r0 = r1.zzj
            return r0
    }
}
