package p124h7;

/* renamed from: h7.j6 */
/* loaded from: classes.dex */
public final class C2690j6 extends p124h7.AbstractC2970yg<p124h7.C2690j6, p124h7.C2654h6> implements p124h7.InterfaceC2953y {
    private static final p124h7.C2690j6 zzb = null;
    private java.lang.String zze;
    private p124h7.AbstractC2574cg zzf;
    private int zzg;

    static {
            h7.j6 r0 = new h7.j6
            r0.<init>()
            p124h7.C2690j6.zzb = r0
            java.lang.Class<h7.j6> r1 = p124h7.C2690j6.class
            p124h7.AbstractC2970yg.m7329d(r1, r0)
            return
    }

    public C2690j6() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.zze = r0
            h7.cg r0 = p124h7.AbstractC2574cg.f11427Z
            r1.zzf = r0
            return
    }

    /* renamed from: A */
    public static void m6853A(p124h7.C2690j6 r1, p124h7.EnumC2672i6 r2) {
            java.util.Objects.requireNonNull(r2)
            h7.i6 r0 = p124h7.EnumC2672i6.f11622e0
            if (r2 == r0) goto Lc
            int r2 = r2.f11624Y
            r1.zzg = r2
            return
        Lc:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Can't get the number of an unknown enum value."
            r1.<init>(r2)
            throw r1
    }

    /* renamed from: r */
    public static p124h7.C2654h6 m6854r() {
            h7.j6 r0 = p124h7.C2690j6.zzb
            h7.vg r0 = r0.m7336i()
            h7.h6 r0 = (p124h7.C2654h6) r0
            return r0
    }

    /* renamed from: u */
    public static /* synthetic */ p124h7.C2690j6 m6855u() {
            h7.j6 r0 = p124h7.C2690j6.zzb
            return r0
    }

    /* renamed from: v */
    public static p124h7.C2690j6 m6856v() {
            h7.j6 r0 = p124h7.C2690j6.zzb
            return r0
    }

    /* renamed from: y */
    public static /* synthetic */ void m6857y(p124h7.C2690j6 r0, java.lang.String r1) {
            r0.zze = r1
            return
    }

    /* renamed from: z */
    public static /* synthetic */ void m6858z(p124h7.C2690j6 r0, p124h7.AbstractC2574cg r1) {
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
            h7.j6 r3 = p124h7.C2690j6.zzb
            return r3
        L16:
            h7.h6 r3 = new h7.h6
            r3.<init>(r5)
            return r3
        L1c:
            h7.j6 r3 = new h7.j6
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
            h7.j6 r4 = p124h7.C2690j6.zzb
            h7.h0 r5 = new h7.h0
            java.lang.String r0 = "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\n\u0003\f"
            r5.<init>(r4, r0, r3)
            return r5
        L3b:
            java.lang.Byte r3 = java.lang.Byte.valueOf(r4)
            return r3
    }

    /* renamed from: s */
    public final p124h7.EnumC2672i6 m6859s() {
            r2 = this;
            int r0 = r2.zzg
            if (r0 == 0) goto L1e
            r1 = 1
            if (r0 == r1) goto L1b
            r1 = 2
            if (r0 == r1) goto L18
            r1 = 3
            if (r0 == r1) goto L15
            r1 = 4
            if (r0 == r1) goto L12
            r0 = 0
            goto L20
        L12:
            h7.i6 r0 = p124h7.EnumC2672i6.f11621d0
            goto L20
        L15:
            h7.i6 r0 = p124h7.EnumC2672i6.f11620c0
            goto L20
        L18:
            h7.i6 r0 = p124h7.EnumC2672i6.f11619b0
            goto L20
        L1b:
            h7.i6 r0 = p124h7.EnumC2672i6.f11618a0
            goto L20
        L1e:
            h7.i6 r0 = p124h7.EnumC2672i6.f11617Z
        L20:
            if (r0 != 0) goto L24
            h7.i6 r0 = p124h7.EnumC2672i6.f11622e0
        L24:
            return r0
    }

    /* renamed from: w */
    public final p124h7.AbstractC2574cg m6860w() {
            r1 = this;
            h7.cg r0 = r1.zzf
            return r0
    }

    /* renamed from: x */
    public final java.lang.String m6861x() {
            r1 = this;
            java.lang.String r0 = r1.zze
            return r0
    }
}
