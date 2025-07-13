package p185k7;

/* renamed from: k7.p3 */
/* loaded from: classes.dex */
public final class C3933p3 extends p185k7.AbstractC3773d6<p185k7.C3933p3, p185k7.C4009v1> implements p185k7.InterfaceC3816g7 {
    private static final p185k7.C3933p3 zza = null;
    private int zze;
    private p185k7.InterfaceC3857j6<p185k7.C3972s3> zzf;
    private p185k7.C3907n3 zzg;

    static {
            k7.p3 r0 = new k7.p3
            r0.<init>()
            p185k7.C3933p3.zza = r0
            java.lang.Class<k7.p3> r1 = p185k7.C3933p3.class
            p185k7.AbstractC3773d6.m8491l(r1, r0)
            return
    }

    public C3933p3() {
            r1 = this;
            r1.<init>()
            k7.o7<java.lang.Object> r0 = p185k7.C3924o7.f16809b0
            r1.zzf = r0
            return
    }

    /* renamed from: t */
    public static /* synthetic */ p185k7.C3933p3 m8874t() {
            k7.p3 r0 = p185k7.C3933p3.zza
            return r0
    }

    @Override // p185k7.AbstractC3773d6
    /* renamed from: r */
    public final java.lang.Object mo8189r(int r4, java.lang.Object r5, java.lang.Object r6) {
            r3 = this;
            int r4 = r4 + (-1)
            r5 = 1
            if (r4 == 0) goto L3f
            r6 = 4
            r0 = 3
            r1 = 2
            if (r4 == r1) goto L22
            if (r4 == r0) goto L1c
            if (r4 == r6) goto L16
            r5 = 5
            if (r4 == r5) goto L13
            r4 = 0
            return r4
        L13:
            k7.p3 r4 = p185k7.C3933p3.zza
            return r4
        L16:
            k7.v1 r4 = new k7.v1
            r4.<init>(r1)
            return r4
        L1c:
            k7.p3 r4 = new k7.p3
            r4.<init>()
            return r4
        L22:
            java.lang.Object[] r4 = new java.lang.Object[r6]
            r6 = 0
            java.lang.String r2 = "zze"
            r4[r6] = r2
            java.lang.String r6 = "zzf"
            r4[r5] = r6
            java.lang.Class<k7.s3> r5 = p185k7.C3972s3.class
            r4[r1] = r5
            java.lang.String r5 = "zzg"
            r4[r0] = r5
            k7.p3 r5 = p185k7.C3933p3.zza
            k7.p7 r6 = new k7.p7
            java.lang.String r0 = "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u1009\u0000"
            r6.<init>(r5, r0, r4)
            return r6
        L3f:
            java.lang.Byte r4 = java.lang.Byte.valueOf(r5)
            return r4
    }

    /* renamed from: s */
    public final p185k7.C3907n3 m8875s() {
            r1 = this;
            k7.n3 r0 = r1.zzg
            if (r0 != 0) goto L8
            k7.n3 r0 = p185k7.C3907n3.m8837u()
        L8:
            return r0
    }

    /* renamed from: u */
    public final java.util.List<p185k7.C3972s3> m8876u() {
            r1 = this;
            k7.j6<k7.s3> r0 = r1.zzf
            return r0
    }
}
