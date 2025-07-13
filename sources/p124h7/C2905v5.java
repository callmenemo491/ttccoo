package p124h7;

/* renamed from: h7.v5 */
/* loaded from: classes.dex */
public final class C2905v5 extends p124h7.AbstractC2970yg<p124h7.C2905v5, p124h7.C2887u5> implements p124h7.InterfaceC2953y {
    private static final p124h7.C2905v5 zzb = null;
    private int zze;
    private int zzf;
    private p124h7.AbstractC2574cg zzg;

    static {
            h7.v5 r0 = new h7.v5
            r0.<init>()
            p124h7.C2905v5.zzb = r0
            java.lang.Class<h7.v5> r1 = p124h7.C2905v5.class
            p124h7.AbstractC2970yg.m7329d(r1, r0)
            return
    }

    public C2905v5() {
            r1 = this;
            r1.<init>()
            h7.cg r0 = p124h7.AbstractC2574cg.f11427Z
            r1.zzg = r0
            return
    }

    /* renamed from: A */
    public static /* synthetic */ void m7203A(p124h7.C2905v5 r0, p124h7.AbstractC2574cg r1) {
            r0.zzg = r1
            return
    }

    /* renamed from: r */
    public static p124h7.C2887u5 m7204r() {
            h7.v5 r0 = p124h7.C2905v5.zzb
            h7.vg r0 = r0.m7336i()
            h7.u5 r0 = (p124h7.C2887u5) r0
            return r0
    }

    /* renamed from: s */
    public static /* synthetic */ p124h7.C2905v5 m7205s() {
            h7.v5 r0 = p124h7.C2905v5.zzb
            return r0
    }

    /* renamed from: u */
    public static p124h7.C2905v5 m7206u() {
            h7.v5 r0 = p124h7.C2905v5.zzb
            return r0
    }

    /* renamed from: y */
    public static void m7207y(p124h7.C2905v5 r1, p124h7.EnumC2923w5 r2) {
            java.util.Objects.requireNonNull(r2)
            h7.w5 r0 = p124h7.EnumC2923w5.f11986e0
            if (r2 == r0) goto Lc
            int r2 = r2.f11988Y
            r1.zze = r2
            return
        Lc:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Can't get the number of an unknown enum value."
            r1.<init>(r2)
            throw r1
    }

    /* renamed from: z */
    public static /* synthetic */ void m7208z(p124h7.C2905v5 r0, p124h7.EnumC2977z5 r1) {
            int r1 = r1.m7353a()
            r0.zzf = r1
            return
    }

    @Override // p124h7.AbstractC2970yg
    /* renamed from: h */
    public final java.lang.Object mo6484h(int r3, java.lang.Object r4, java.lang.Object r5) {
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
            h7.v5 r3 = p124h7.C2905v5.zzb
            return r3
        L16:
            h7.u5 r3 = new h7.u5
            r3.<init>(r5)
            return r3
        L1c:
            h7.v5 r3 = new h7.v5
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
            h7.v5 r4 = p124h7.C2905v5.zzb
            h7.h0 r5 = new h7.h0
            java.lang.String r0 = "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n"
            r5.<init>(r4, r0, r3)
            return r5
        L3b:
            java.lang.Byte r3 = java.lang.Byte.valueOf(r4)
            return r3
    }

    /* renamed from: v */
    public final p124h7.EnumC2923w5 m7209v() {
            r2 = this;
            int r0 = r2.zze
            if (r0 == 0) goto L1e
            r1 = 2
            if (r0 == r1) goto L1b
            r1 = 3
            if (r0 == r1) goto L18
            r1 = 4
            if (r0 == r1) goto L15
            r1 = 5
            if (r0 == r1) goto L12
            r0 = 0
            goto L20
        L12:
            h7.w5 r0 = p124h7.EnumC2923w5.f11985d0
            goto L20
        L15:
            h7.w5 r0 = p124h7.EnumC2923w5.f11984c0
            goto L20
        L18:
            h7.w5 r0 = p124h7.EnumC2923w5.f11983b0
            goto L20
        L1b:
            h7.w5 r0 = p124h7.EnumC2923w5.f11982a0
            goto L20
        L1e:
            h7.w5 r0 = p124h7.EnumC2923w5.f11981Z
        L20:
            if (r0 != 0) goto L24
            h7.w5 r0 = p124h7.EnumC2923w5.f11986e0
        L24:
            return r0
    }

    /* renamed from: w */
    public final p124h7.EnumC2977z5 m7210w() {
            r1 = this;
            int r0 = r1.zzf
            h7.z5 r0 = p124h7.EnumC2977z5.m7352e(r0)
            if (r0 != 0) goto La
            h7.z5 r0 = p124h7.EnumC2977z5.f12058f0
        La:
            return r0
    }

    /* renamed from: x */
    public final p124h7.AbstractC2574cg m7211x() {
            r1 = this;
            h7.cg r0 = r1.zzg
            return r0
    }
}
