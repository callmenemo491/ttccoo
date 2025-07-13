package p124h7;

/* renamed from: h7.m6 */
/* loaded from: classes.dex */
public final class C2744m6 extends p124h7.AbstractC2970yg<p124h7.C2744m6, p124h7.C2726l6> implements p124h7.InterfaceC2953y {
    private static final p124h7.C2744m6 zzb = null;
    private java.lang.String zze;
    private p124h7.AbstractC2574cg zzf;
    private int zzg;

    static {
            h7.m6 r0 = new h7.m6
            r0.<init>()
            p124h7.C2744m6.zzb = r0
            java.lang.Class<h7.m6> r1 = p124h7.C2744m6.class
            p124h7.AbstractC2970yg.m7329d(r1, r0)
            return
    }

    public C2744m6() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.zze = r0
            h7.cg r0 = p124h7.AbstractC2574cg.f11427Z
            r1.zzf = r0
            return
    }

    /* renamed from: A */
    public static /* synthetic */ void m6973A(p124h7.C2744m6 r0, p124h7.EnumC2583d7 r1) {
            int r1 = r1.m6591a()
            r0.zzg = r1
            return
    }

    /* renamed from: r */
    public static p124h7.C2726l6 m6974r() {
            h7.m6 r0 = p124h7.C2744m6.zzb
            h7.vg r0 = r0.m7336i()
            h7.l6 r0 = (p124h7.C2726l6) r0
            return r0
    }

    /* renamed from: s */
    public static /* synthetic */ p124h7.C2744m6 m6975s() {
            h7.m6 r0 = p124h7.C2744m6.zzb
            return r0
    }

    /* renamed from: u */
    public static p124h7.C2744m6 m6976u() {
            h7.m6 r0 = p124h7.C2744m6.zzb
            return r0
    }

    /* renamed from: y */
    public static /* synthetic */ void m6977y(p124h7.C2744m6 r0, java.lang.String r1) {
            java.util.Objects.requireNonNull(r1)
            r0.zze = r1
            return
    }

    /* renamed from: z */
    public static /* synthetic */ void m6978z(p124h7.C2744m6 r0, p124h7.AbstractC2574cg r1) {
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
            h7.m6 r3 = p124h7.C2744m6.zzb
            return r3
        L16:
            h7.l6 r3 = new h7.l6
            r3.<init>(r5)
            return r3
        L1c:
            h7.m6 r3 = new h7.m6
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
            h7.m6 r4 = p124h7.C2744m6.zzb
            h7.h0 r5 = new h7.h0
            java.lang.String r0 = "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\n\u0003\f"
            r5.<init>(r4, r0, r3)
            return r5
        L3b:
            java.lang.Byte r3 = java.lang.Byte.valueOf(r4)
            return r3
    }

    /* renamed from: v */
    public final p124h7.EnumC2583d7 m6979v() {
            r1 = this;
            int r0 = r1.zzg
            h7.d7 r0 = p124h7.EnumC2583d7.m6590e(r0)
            if (r0 != 0) goto La
            h7.d7 r0 = p124h7.EnumC2583d7.f11446e0
        La:
            return r0
    }

    /* renamed from: w */
    public final p124h7.AbstractC2574cg m6980w() {
            r1 = this;
            h7.cg r0 = r1.zzf
            return r0
    }

    /* renamed from: x */
    public final java.lang.String m6981x() {
            r1 = this;
            java.lang.String r0 = r1.zze
            return r0
    }
}
