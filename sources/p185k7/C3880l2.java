package p185k7;

/* renamed from: k7.l2 */
/* loaded from: classes.dex */
public final class C3880l2 extends p185k7.AbstractC3773d6<p185k7.C3880l2, p185k7.C3867k2> implements p185k7.InterfaceC3816g7 {
    private static final p185k7.C3880l2 zza = null;
    private int zze;
    private java.lang.String zzf;
    private java.lang.String zzg;

    static {
            k7.l2 r0 = new k7.l2
            r0.<init>()
            p185k7.C3880l2.zza = r0
            java.lang.Class<k7.l2> r1 = p185k7.C3880l2.class
            p185k7.AbstractC3773d6.m8491l(r1, r0)
            return
    }

    public C3880l2() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.zzf = r0
            r1.zzg = r0
            return
    }

    /* renamed from: s */
    public static /* synthetic */ p185k7.C3880l2 m8788s() {
            k7.l2 r0 = p185k7.C3880l2.zza
            return r0
    }

    @Override // p185k7.AbstractC3773d6
    /* renamed from: r */
    public final java.lang.Object mo8189r(int r3, java.lang.Object r4, java.lang.Object r5) {
            r2 = this;
            int r3 = r3 + (-1)
            r4 = 1
            if (r3 == 0) goto L3b
            r5 = 0
            r0 = 3
            r1 = 2
            if (r3 == r1) goto L23
            if (r3 == r0) goto L1d
            r4 = 4
            if (r3 == r4) goto L17
            r4 = 5
            if (r3 == r4) goto L14
            r3 = 0
            return r3
        L14:
            k7.l2 r3 = p185k7.C3880l2.zza
            return r3
        L17:
            k7.k2 r3 = new k7.k2
            r3.<init>(r5)
            return r3
        L1d:
            k7.l2 r3 = new k7.l2
            r3.<init>()
            return r3
        L23:
            java.lang.Object[] r3 = new java.lang.Object[r0]
            java.lang.String r0 = "zze"
            r3[r5] = r0
            java.lang.String r5 = "zzf"
            r3[r4] = r5
            java.lang.String r4 = "zzg"
            r3[r1] = r4
            k7.l2 r4 = p185k7.C3880l2.zza
            k7.p7 r5 = new k7.p7
            java.lang.String r0 = "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001"
            r5.<init>(r4, r0, r3)
            return r5
        L3b:
            java.lang.Byte r3 = java.lang.Byte.valueOf(r4)
            return r3
    }

    /* renamed from: t */
    public final java.lang.String m8789t() {
            r1 = this;
            java.lang.String r0 = r1.zzf
            return r0
    }

    /* renamed from: u */
    public final java.lang.String m8790u() {
            r1 = this;
            java.lang.String r0 = r1.zzg
            return r0
    }
}
