package p185k7;

/* renamed from: k7.e2 */
/* loaded from: classes.dex */
public final class C3783e2 extends p185k7.AbstractC3773d6<p185k7.C3783e2, p185k7.C3741b2> implements p185k7.InterfaceC3816g7 {
    private static final p185k7.C3783e2 zza = null;
    private int zze;
    private int zzf;
    private java.lang.String zzg;
    private boolean zzh;
    private p185k7.InterfaceC3857j6<java.lang.String> zzi;

    static {
            k7.e2 r0 = new k7.e2
            r0.<init>()
            p185k7.C3783e2.zza = r0
            java.lang.Class<k7.e2> r1 = p185k7.C3783e2.class
            p185k7.AbstractC3773d6.m8491l(r1, r0)
            return
    }

    public C3783e2() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.zzg = r0
            k7.o7<java.lang.Object> r0 = p185k7.C3924o7.f16809b0
            r1.zzi = r0
            return
    }

    /* renamed from: t */
    public static /* synthetic */ p185k7.C3783e2 m8508t() {
            k7.e2 r0 = p185k7.C3783e2.zza
            return r0
    }

    /* renamed from: u */
    public static p185k7.C3783e2 m8509u() {
            k7.e2 r0 = p185k7.C3783e2.zza
            return r0
    }

    /* renamed from: A */
    public final boolean m8510A() {
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

    /* renamed from: B */
    public final int m8511B() {
            r1 = this;
            int r0 = r1.zzf
            int r0 = p185k7.C3769d2.m8369a(r0)
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
            if (r6 == 0) goto L48
            r8 = 0
            r0 = 5
            r1 = 4
            r2 = 3
            r3 = 2
            if (r6 == r3) goto L23
            if (r6 == r2) goto L1d
            if (r6 == r1) goto L17
            if (r6 == r0) goto L14
            r6 = 0
            return r6
        L14:
            k7.e2 r6 = p185k7.C3783e2.zza
            return r6
        L17:
            k7.b2 r6 = new k7.b2
            r6.<init>(r8)
            return r6
        L1d:
            k7.e2 r6 = new k7.e2
            r6.<init>()
            return r6
        L23:
            r6 = 6
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r4 = "zze"
            r6[r8] = r4
            java.lang.String r8 = "zzf"
            r6[r7] = r8
            k7.g6 r7 = p185k7.C3755c2.f16543a
            r6[r3] = r7
            java.lang.String r7 = "zzg"
            r6[r2] = r7
            java.lang.String r7 = "zzh"
            r6[r1] = r7
            java.lang.String r7 = "zzi"
            r6[r0] = r7
            k7.e2 r7 = p185k7.C3783e2.zza
            k7.p7 r8 = new k7.p7
            java.lang.String r0 = "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u100c\u0000\u0002\u1008\u0001\u0003\u1007\u0002\u0004\u001a"
            r8.<init>(r7, r0, r6)
            return r8
        L48:
            java.lang.Byte r6 = java.lang.Byte.valueOf(r7)
            return r6
    }

    /* renamed from: s */
    public final int m8512s() {
            r1 = this;
            k7.j6<java.lang.String> r0 = r1.zzi
            int r0 = r0.size()
            return r0
    }

    /* renamed from: v */
    public final java.lang.String m8513v() {
            r1 = this;
            java.lang.String r0 = r1.zzg
            return r0
    }

    /* renamed from: w */
    public final java.util.List<java.lang.String> m8514w() {
            r1 = this;
            k7.j6<java.lang.String> r0 = r1.zzi
            return r0
    }

    /* renamed from: x */
    public final boolean m8515x() {
            r1 = this;
            boolean r0 = r1.zzh
            return r0
    }

    /* renamed from: y */
    public final boolean m8516y() {
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

    /* renamed from: z */
    public final boolean m8517z() {
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
}
