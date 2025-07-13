package p185k7;

/* renamed from: k7.b3 */
/* loaded from: classes.dex */
public final class C3742b3 extends p185k7.AbstractC3773d6<p185k7.C3742b3, p185k7.C3728a3> implements p185k7.InterfaceC3816g7 {
    private static final p185k7.C3742b3 zza = null;
    private p185k7.InterfaceC3857j6<p185k7.C3770d3> zze;

    static {
            k7.b3 r0 = new k7.b3
            r0.<init>()
            p185k7.C3742b3.zza = r0
            java.lang.Class<k7.b3> r1 = p185k7.C3742b3.class
            p185k7.AbstractC3773d6.m8491l(r1, r0)
            return
    }

    public C3742b3() {
            r1 = this;
            r1.<init>()
            k7.o7<java.lang.Object> r0 = p185k7.C3924o7.f16809b0
            r1.zze = r0
            return
    }

    /* renamed from: s */
    public static p185k7.C3728a3 m8219s() {
            k7.b3 r0 = p185k7.C3742b3.zza
            k7.a6 r0 = r0.m8500n()
            k7.a3 r0 = (p185k7.C3728a3) r0
            return r0
    }

    /* renamed from: t */
    public static /* synthetic */ p185k7.C3742b3 m8220t() {
            k7.b3 r0 = p185k7.C3742b3.zza
            return r0
    }

    /* renamed from: w */
    public static /* synthetic */ void m8221w(p185k7.C3742b3 r2, p185k7.C3770d3 r3) {
            k7.j6<k7.d3> r0 = r2.zze
            boolean r1 = r0.mo8199c()
            if (r1 != 0) goto Le
            k7.j6 r0 = p185k7.AbstractC3773d6.m8489j(r0)
            r2.zze = r0
        Le:
            k7.j6<k7.d3> r2 = r2.zze
            r2.add(r3)
            return
    }

    @Override // p185k7.AbstractC3773d6
    /* renamed from: r */
    public final java.lang.Object mo8189r(int r2, java.lang.Object r3, java.lang.Object r4) {
            r1 = this;
            int r2 = r2 + (-1)
            r3 = 1
            if (r2 == 0) goto L37
            r4 = 2
            if (r2 == r4) goto L22
            r3 = 3
            if (r2 == r3) goto L1c
            r3 = 4
            r4 = 0
            if (r2 == r3) goto L16
            r3 = 5
            if (r2 == r3) goto L13
            return r4
        L13:
            k7.b3 r2 = p185k7.C3742b3.zza
            return r2
        L16:
            k7.a3 r2 = new k7.a3
            r2.<init>(r4)
            return r2
        L1c:
            k7.b3 r2 = new k7.b3
            r2.<init>()
            return r2
        L22:
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r4 = 0
            java.lang.String r0 = "zze"
            r2[r4] = r0
            java.lang.Class<k7.d3> r4 = p185k7.C3770d3.class
            r2[r3] = r4
            k7.b3 r3 = p185k7.C3742b3.zza
            k7.p7 r4 = new k7.p7
            java.lang.String r0 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b"
            r4.<init>(r3, r0, r2)
            return r4
        L37:
            java.lang.Byte r2 = java.lang.Byte.valueOf(r3)
            return r2
    }

    /* renamed from: u */
    public final p185k7.C3770d3 m8222u() {
            r2 = this;
            k7.j6<k7.d3> r0 = r2.zze
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            k7.d3 r0 = (p185k7.C3770d3) r0
            return r0
    }

    /* renamed from: v */
    public final java.util.List<p185k7.C3770d3> m8223v() {
            r1 = this;
            k7.j6<k7.d3> r0 = r1.zze
            return r0
    }
}
