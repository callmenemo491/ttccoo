package p072e7;

/* renamed from: e7.q3 */
/* loaded from: classes.dex */
public final class C1716q3 extends p072e7.AbstractC1783x5<p072e7.C1716q3, p072e7.C1762v2> implements p072e7.InterfaceC1570b7 {
    private static final p072e7.C1716q3 zzb = null;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private byte zzi;

    static {
            e7.q3 r0 = new e7.q3
            r0.<init>()
            p072e7.C1716q3.zzb = r0
            java.lang.Class<e7.q3> r1 = p072e7.C1716q3.class
            p072e7.AbstractC1783x5.m4486c(r1, r0)
            return
    }

    public C1716q3() {
            r1 = this;
            r1.<init>()
            r0 = 2
            r1.zzi = r0
            return
    }

    /* renamed from: i */
    public static /* synthetic */ p072e7.C1716q3 m4417i() {
            e7.q3 r0 = p072e7.C1716q3.zzb
            return r0
    }

    @Override // p072e7.AbstractC1783x5
    /* renamed from: e */
    public final java.lang.Object mo4118e(int r6, java.lang.Object r7, java.lang.Object r8) {
            r5 = this;
            int r6 = r6 + (-1)
            if (r6 == 0) goto L4d
            r8 = 1
            r0 = 5
            r1 = 4
            r2 = 2
            r3 = 3
            r4 = 0
            if (r6 == r2) goto L28
            if (r6 == r3) goto L22
            if (r6 == r1) goto L1c
            if (r6 == r0) goto L19
            if (r7 != 0) goto L15
            r8 = 0
        L15:
            r5.zzi = r8
            r6 = 0
            return r6
        L19:
            e7.q3 r6 = p072e7.C1716q3.zzb
            return r6
        L1c:
            e7.v2 r6 = new e7.v2
            r6.<init>(r3)
            return r6
        L22:
            e7.q3 r6 = new e7.q3
            r6.<init>()
            return r6
        L28:
            r6 = 6
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r7 = "zze"
            r6[r4] = r7
            java.lang.String r7 = "zzf"
            r6[r8] = r7
            e7.b6 r7 = p072e7.C1654k1.f7674a
            r6[r2] = r7
            java.lang.String r7 = "zzg"
            r6[r3] = r7
            java.lang.String r7 = "zzh"
            r6[r1] = r7
            e7.b6 r7 = p072e7.C1645j2.f7657a
            r6[r0] = r7
            e7.q3 r7 = p072e7.C1716q3.zzb
            e7.k7 r8 = new e7.k7
            java.lang.String r0 = "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001\u150c\u0000\u0002\u1004\u0001\u0003\u100c\u0002"
            r8.<init>(r7, r0, r6)
            return r8
        L4d:
            byte r6 = r5.zzi
            java.lang.Byte r6 = java.lang.Byte.valueOf(r6)
            return r6
    }
}
