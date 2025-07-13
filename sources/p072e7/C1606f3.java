package p072e7;

/* renamed from: e7.f3 */
/* loaded from: classes.dex */
public final class C1606f3 extends p072e7.AbstractC1783x5<p072e7.C1606f3, p072e7.C1596e3> implements p072e7.InterfaceC1570b7 {
    private static final p072e7.C1606f3 zzb = null;
    private int zze;
    private java.lang.String zzf;
    private java.lang.String zzg;

    static {
            e7.f3 r0 = new e7.f3
            r0.<init>()
            p072e7.C1606f3.zzb = r0
            java.lang.Class<e7.f3> r1 = p072e7.C1606f3.class
            p072e7.AbstractC1783x5.m4486c(r1, r0)
            return
    }

    public C1606f3() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.zzf = r0
            r1.zzg = r0
            return
    }

    /* renamed from: i */
    public static p072e7.C1596e3 m4189i() {
            e7.f3 r0 = p072e7.C1606f3.zzb
            e7.v5 r0 = r0.m4490f()
            e7.e3 r0 = (p072e7.C1596e3) r0
            return r0
    }

    /* renamed from: l */
    public static /* synthetic */ p072e7.C1606f3 m4190l() {
            e7.f3 r0 = p072e7.C1606f3.zzb
            return r0
    }

    /* renamed from: n */
    public static /* synthetic */ void m4191n(p072e7.C1606f3 r1, java.lang.String r2) {
            java.util.Objects.requireNonNull(r2)
            int r0 = r1.zze
            r0 = r0 | 1
            r1.zze = r0
            r1.zzf = r2
            return
    }

    @Override // p072e7.AbstractC1783x5
    /* renamed from: e */
    public final java.lang.Object mo4118e(int r3, java.lang.Object r4, java.lang.Object r5) {
            r2 = this;
            int r3 = r3 + (-1)
            r4 = 1
            if (r3 == 0) goto L3b
            r5 = 3
            r0 = 2
            if (r3 == r0) goto L22
            if (r3 == r5) goto L1c
            r4 = 4
            r5 = 0
            if (r3 == r4) goto L16
            r4 = 5
            if (r3 == r4) goto L13
            return r5
        L13:
            e7.f3 r3 = p072e7.C1606f3.zzb
            return r3
        L16:
            e7.e3 r3 = new e7.e3
            r3.<init>(r5)
            return r3
        L1c:
            e7.f3 r3 = new e7.f3
            r3.<init>()
            return r3
        L22:
            java.lang.Object[] r3 = new java.lang.Object[r5]
            r5 = 0
            java.lang.String r1 = "zze"
            r3[r5] = r1
            java.lang.String r5 = "zzf"
            r3[r4] = r5
            java.lang.String r4 = "zzg"
            r3[r0] = r4
            e7.f3 r4 = p072e7.C1606f3.zzb
            e7.k7 r5 = new e7.k7
            java.lang.String r0 = "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001"
            r5.<init>(r4, r0, r3)
            return r5
        L3b:
            java.lang.Byte r3 = java.lang.Byte.valueOf(r4)
            return r3
    }
}
