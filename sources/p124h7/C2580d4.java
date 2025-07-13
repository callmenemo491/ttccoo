package p124h7;

/* renamed from: h7.d4 */
/* loaded from: classes.dex */
public final class C2580d4 extends p124h7.AbstractC2970yg<p124h7.C2580d4, p124h7.C2562c4> implements p124h7.InterfaceC2953y {
    private static final p124h7.C2580d4 zzb = null;
    private int zze;
    private p124h7.C2652h4 zzf;
    private p124h7.C2546b6 zzg;

    static {
            h7.d4 r0 = new h7.d4
            r0.<init>()
            p124h7.C2580d4.zzb = r0
            java.lang.Class<h7.d4> r1 = p124h7.C2580d4.class
            p124h7.AbstractC2970yg.m7329d(r1, r0)
            return
    }

    public C2580d4() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: A */
    public static /* synthetic */ void m6568A(p124h7.C2580d4 r0, p124h7.C2546b6 r1) {
            java.util.Objects.requireNonNull(r1)
            r0.zzg = r1
            return
    }

    /* renamed from: s */
    public static p124h7.C2562c4 m6569s() {
            h7.d4 r0 = p124h7.C2580d4.zzb
            h7.vg r0 = r0.m7336i()
            h7.c4 r0 = (p124h7.C2562c4) r0
            return r0
    }

    /* renamed from: u */
    public static /* synthetic */ p124h7.C2580d4 m6570u() {
            h7.d4 r0 = p124h7.C2580d4.zzb
            return r0
    }

    /* renamed from: v */
    public static p124h7.C2580d4 m6571v(p124h7.AbstractC2574cg r1, p124h7.C2754mg r2) {
            h7.d4 r0 = p124h7.C2580d4.zzb
            h7.yg r1 = p124h7.AbstractC2970yg.m7332l(r0, r1, r2)
            h7.d4 r1 = (p124h7.C2580d4) r1
            return r1
    }

    /* renamed from: y */
    public static /* synthetic */ void m6572y(p124h7.C2580d4 r0, int r1) {
            r0.zze = r1
            return
    }

    /* renamed from: z */
    public static /* synthetic */ void m6573z(p124h7.C2580d4 r0, p124h7.C2652h4 r1) {
            java.util.Objects.requireNonNull(r1)
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
            h7.d4 r3 = p124h7.C2580d4.zzb
            return r3
        L16:
            h7.c4 r3 = new h7.c4
            r3.<init>(r5)
            return r3
        L1c:
            h7.d4 r3 = new h7.d4
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
            h7.d4 r4 = p124h7.C2580d4.zzb
            h7.h0 r5 = new h7.h0
            java.lang.String r0 = "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t"
            r5.<init>(r4, r0, r3)
            return r5
        L3b:
            java.lang.Byte r3 = java.lang.Byte.valueOf(r4)
            return r3
    }

    /* renamed from: r */
    public final int m6574r() {
            r1 = this;
            int r0 = r1.zze
            return r0
    }

    /* renamed from: w */
    public final p124h7.C2652h4 m6575w() {
            r1 = this;
            h7.h4 r0 = r1.zzf
            if (r0 != 0) goto L8
            h7.h4 r0 = p124h7.C2652h4.m6785v()
        L8:
            return r0
    }

    /* renamed from: x */
    public final p124h7.C2546b6 m6576x() {
            r1 = this;
            h7.b6 r0 = r1.zzg
            if (r0 != 0) goto L8
            h7.b6 r0 = p124h7.C2546b6.m6497v()
        L8:
            return r0
    }
}
