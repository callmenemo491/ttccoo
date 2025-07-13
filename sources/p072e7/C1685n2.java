package p072e7;

/* renamed from: e7.n2 */
/* loaded from: classes.dex */
public final class C1685n2 extends p072e7.AbstractC1783x5<p072e7.C1685n2, p072e7.C1675m2> implements p072e7.InterfaceC1570b7 {
    private static final p072e7.InterfaceC1589d6<java.lang.Integer, p072e7.EnumC1635i2> zzb = null;
    private static final p072e7.C1685n2 zze = null;
    private int zzf;
    private p072e7.C1725r2 zzg;
    private p072e7.C1736s3 zzh;
    private p072e7.InterfaceC1609f6<p072e7.C1706p3> zzi;
    private p072e7.InterfaceC1579c6 zzj;

    static {
            y.e r0 = new y.e
            r1 = 15
            r0.<init>(r1)
            p072e7.C1685n2.zzb = r0
            e7.n2 r0 = new e7.n2
            r0.<init>()
            p072e7.C1685n2.zze = r0
            java.lang.Class<e7.n2> r1 = p072e7.C1685n2.class
            p072e7.AbstractC1783x5.m4486c(r1, r0)
            return
    }

    public C1685n2() {
            r1 = this;
            r1.<init>()
            e7.j7<java.lang.Object> r0 = p072e7.C1650j7.f7663b0
            r1.zzi = r0
            e7.y5 r0 = p072e7.C1792y5.f7844b0
            r1.zzj = r0
            return
    }

    /* renamed from: i */
    public static p072e7.C1675m2 m4352i() {
            e7.n2 r0 = p072e7.C1685n2.zze
            e7.v5 r0 = r0.m4490f()
            e7.m2 r0 = (p072e7.C1675m2) r0
            return r0
    }

    /* renamed from: l */
    public static /* synthetic */ p072e7.C1685n2 m4353l() {
            e7.n2 r0 = p072e7.C1685n2.zze
            return r0
    }

    /* renamed from: n */
    public static /* synthetic */ void m4354n(p072e7.C1685n2 r0, p072e7.C1725r2 r1) {
            java.util.Objects.requireNonNull(r1)
            r0.zzg = r1
            int r1 = r0.zzf
            r1 = r1 | 1
            r0.zzf = r1
            return
    }

    /* renamed from: o */
    public static void m4355o(p072e7.C1685n2 r2, java.lang.Iterable r3) {
            e7.c6 r0 = r2.zzj
            r1 = r0
            e7.b5 r1 = (p072e7.AbstractC1568b5) r1
            boolean r1 = r1.f7494Y
            if (r1 != 0) goto L19
            e7.y5 r0 = (p072e7.C1792y5) r0
            int r1 = r0.f7846a0
            if (r1 != 0) goto L12
            r1 = 10
            goto L13
        L12:
            int r1 = r1 + r1
        L13:
            e7.c6 r0 = r0.m4496h(r1)
            r2.zzj = r0
        L19:
            java.util.Iterator r3 = r3.iterator()
        L1d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L33
            java.lang.Object r0 = r3.next()
            e7.i2 r0 = (p072e7.EnumC1635i2) r0
            e7.c6 r1 = r2.zzj
            int r0 = r0.f7634Y
            e7.y5 r1 = (p072e7.C1792y5) r1
            r1.m4497i(r0)
            goto L1d
        L33:
            return
    }

    @Override // p072e7.AbstractC1783x5
    /* renamed from: e */
    public final java.lang.Object mo4118e(int r6, java.lang.Object r7, java.lang.Object r8) {
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
            e7.n2 r6 = p072e7.C1685n2.zze
            return r6
        L16:
            e7.m2 r6 = new e7.m2
            r6.<init>(r7)
            return r6
        L1c:
            e7.n2 r6 = new e7.n2
            r6.<init>()
            return r6
        L22:
            r6 = 7
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r3 = 0
            java.lang.String r4 = "zzf"
            r6[r3] = r4
            java.lang.String r3 = "zzg"
            r6[r7] = r3
            java.lang.String r7 = "zzh"
            r6[r2] = r7
            java.lang.String r7 = "zzi"
            r6[r1] = r7
            java.lang.Class<e7.p3> r7 = p072e7.C1706p3.class
            r6[r0] = r7
            java.lang.String r7 = "zzj"
            r6[r8] = r7
            r7 = 6
            e7.b6 r8 = p072e7.C1625h2.f7580a
            r6[r7] = r8
            e7.n2 r7 = p072e7.C1685n2.zze
            e7.k7 r8 = new e7.k7
            java.lang.String r0 = "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001\u1009\u0000\u0002\u1009\u0001\u0003\u001b\u0004\u001e"
            r8.<init>(r7, r0, r6)
            return r8
        L4d:
            java.lang.Byte r6 = java.lang.Byte.valueOf(r7)
            return r6
    }
}
