package p124h7;

/* renamed from: h7.f6 */
/* loaded from: classes.dex */
public final class C2618f6 extends p124h7.AbstractC2970yg<p124h7.C2618f6, p124h7.C2600e6> implements p124h7.InterfaceC2953y {
    private static final p124h7.C2618f6 zzb = null;
    private int zze;
    private int zzf;

    static {
            h7.f6 r0 = new h7.f6
            r0.<init>()
            p124h7.C2618f6.zzb = r0
            java.lang.Class<h7.f6> r1 = p124h7.C2618f6.class
            p124h7.AbstractC2970yg.m7329d(r1, r0)
            return
    }

    public C2618f6() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: u */
    public static p124h7.C2600e6 m6704u() {
            h7.f6 r0 = p124h7.C2618f6.zzb
            h7.vg r0 = r0.m7336i()
            h7.e6 r0 = (p124h7.C2600e6) r0
            return r0
    }

    /* renamed from: v */
    public static /* synthetic */ p124h7.C2618f6 m6705v() {
            h7.f6 r0 = p124h7.C2618f6.zzb
            return r0
    }

    /* renamed from: w */
    public static p124h7.C2618f6 m6706w() {
            h7.f6 r0 = p124h7.C2618f6.zzb
            return r0
    }

    /* renamed from: x */
    public static /* synthetic */ void m6707x(p124h7.C2618f6 r0, p124h7.EnumC2977z5 r1) {
            int r1 = r1.m7353a()
            r0.zze = r1
            return
    }

    /* renamed from: y */
    public static /* synthetic */ void m6708y(p124h7.C2618f6 r0, int r1) {
            r0.zzf = r1
            return
    }

    @Override // p124h7.AbstractC2970yg
    /* renamed from: h */
    public final java.lang.Object mo6484h(int r2, java.lang.Object r3, java.lang.Object r4) {
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
            h7.f6 r2 = p124h7.C2618f6.zzb
            return r2
        L16:
            h7.e6 r2 = new h7.e6
            r2.<init>(r4)
            return r2
        L1c:
            h7.f6 r2 = new h7.f6
            r2.<init>()
            return r2
        L22:
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r4 = 0
            java.lang.String r0 = "zze"
            r2[r4] = r0
            java.lang.String r4 = "zzf"
            r2[r3] = r4
            h7.f6 r3 = p124h7.C2618f6.zzb
            h7.h0 r4 = new h7.h0
            java.lang.String r0 = "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b"
            r4.<init>(r3, r0, r2)
            return r4
        L37:
            java.lang.Byte r2 = java.lang.Byte.valueOf(r3)
            return r2
    }

    /* renamed from: r */
    public final int m6709r() {
            r1 = this;
            int r0 = r1.zzf
            return r0
    }

    /* renamed from: s */
    public final p124h7.EnumC2977z5 m6710s() {
            r1 = this;
            int r0 = r1.zze
            h7.z5 r0 = p124h7.EnumC2977z5.m7352e(r0)
            if (r0 != 0) goto La
            h7.z5 r0 = p124h7.EnumC2977z5.f12058f0
        La:
            return r0
    }
}
