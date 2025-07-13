package p185k7;

/* renamed from: k7.s3 */
/* loaded from: classes.dex */
public final class C3972s3 extends p185k7.AbstractC3773d6<p185k7.C3972s3, p185k7.C3867k2> implements p185k7.InterfaceC3816g7 {
    private static final p185k7.C3972s3 zza = null;
    private int zze;
    private int zzf;
    private p185k7.InterfaceC3857j6<p185k7.C3972s3> zzg;
    private java.lang.String zzh;
    private java.lang.String zzi;
    private boolean zzj;
    private double zzk;

    static {
            k7.s3 r0 = new k7.s3
            r0.<init>()
            p185k7.C3972s3.zza = r0
            java.lang.Class<k7.s3> r1 = p185k7.C3972s3.class
            p185k7.AbstractC3773d6.m8491l(r1, r0)
            return
    }

    public C3972s3() {
            r1 = this;
            r1.<init>()
            k7.o7<java.lang.Object> r0 = p185k7.C3924o7.f16809b0
            r1.zzg = r0
            java.lang.String r0 = ""
            r1.zzh = r0
            r1.zzi = r0
            return
    }

    /* renamed from: t */
    public static /* synthetic */ p185k7.C3972s3 m8950t() {
            k7.s3 r0 = p185k7.C3972s3.zza
            return r0
    }

    /* renamed from: A */
    public final boolean m8951A() {
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

    /* renamed from: B */
    public final int m8952B() {
            r1 = this;
            int r0 = r1.zzf
            int r0 = p185k7.C3959r3.m8918a(r0)
            if (r0 != 0) goto L9
            r0 = 1
        L9:
            return r0
    }

    @Override // p185k7.AbstractC3773d6
    /* renamed from: r */
    public final java.lang.Object mo8189r(int r6, java.lang.Object r7, java.lang.Object r8) {
            r5 = this;
            int r6 = r6 + (-1)
            r7 = 1
            if (r6 == 0) goto L59
            r8 = 5
            r0 = 4
            r1 = 3
            r2 = 2
            if (r6 == r2) goto L22
            if (r6 == r1) goto L1c
            if (r6 == r0) goto L16
            if (r6 == r8) goto L13
            r6 = 0
            return r6
        L13:
            k7.s3 r6 = p185k7.C3972s3.zza
            return r6
        L16:
            k7.k2 r6 = new k7.k2
            r6.<init>(r7)
            return r6
        L1c:
            k7.s3 r6 = new k7.s3
            r6.<init>()
            return r6
        L22:
            r6 = 9
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r3 = 0
            java.lang.String r4 = "zze"
            r6[r3] = r4
            java.lang.String r3 = "zzf"
            r6[r7] = r3
            k7.g6 r7 = p185k7.C3946q3.f16842a
            r6[r2] = r7
            java.lang.String r7 = "zzg"
            r6[r1] = r7
            java.lang.Class<k7.s3> r7 = p185k7.C3972s3.class
            r6[r0] = r7
            java.lang.String r7 = "zzh"
            r6[r8] = r7
            r7 = 6
            java.lang.String r8 = "zzi"
            r6[r7] = r8
            r7 = 7
            java.lang.String r8 = "zzj"
            r6[r7] = r8
            r7 = 8
            java.lang.String r8 = "zzk"
            r6[r7] = r8
            k7.s3 r7 = p185k7.C3972s3.zza
            k7.p7 r8 = new k7.p7
            java.lang.String r0 = "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u100c\u0000\u0002\u001b\u0003\u1008\u0001\u0004\u1008\u0002\u0005\u1007\u0003\u0006\u1000\u0004"
            r8.<init>(r7, r0, r6)
            return r8
        L59:
            java.lang.Byte r6 = java.lang.Byte.valueOf(r7)
            return r6
    }

    /* renamed from: s */
    public final double m8953s() {
            r2 = this;
            double r0 = r2.zzk
            return r0
    }

    /* renamed from: u */
    public final java.lang.String m8954u() {
            r1 = this;
            java.lang.String r0 = r1.zzh
            return r0
    }

    /* renamed from: v */
    public final java.lang.String m8955v() {
            r1 = this;
            java.lang.String r0 = r1.zzi
            return r0
    }

    /* renamed from: w */
    public final java.util.List<p185k7.C3972s3> m8956w() {
            r1 = this;
            k7.j6<k7.s3> r0 = r1.zzg
            return r0
    }

    /* renamed from: x */
    public final boolean m8957x() {
            r1 = this;
            boolean r0 = r1.zzj
            return r0
    }

    /* renamed from: y */
    public final boolean m8958y() {
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

    /* renamed from: z */
    public final boolean m8959z() {
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
}
