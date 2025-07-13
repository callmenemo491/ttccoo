package p124h7;

/* renamed from: h7.z3 */
/* loaded from: classes.dex */
public final class C2975z3 extends p124h7.AbstractC2970yg<p124h7.C2975z3, p124h7.C2957y3> implements p124h7.InterfaceC2953y {
    private static final p124h7.C2975z3 zzb = null;
    private int zze;
    private p124h7.C2544b4 zzf;

    static {
            h7.z3 r0 = new h7.z3
            r0.<init>()
            p124h7.C2975z3.zzb = r0
            java.lang.Class<h7.z3> r1 = p124h7.C2975z3.class
            p124h7.AbstractC2970yg.m7329d(r1, r0)
            return
    }

    public C2975z3() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: s */
    public static p124h7.C2957y3 m7340s() {
            h7.z3 r0 = p124h7.C2975z3.zzb
            h7.vg r0 = r0.m7336i()
            h7.y3 r0 = (p124h7.C2957y3) r0
            return r0
    }

    /* renamed from: u */
    public static /* synthetic */ p124h7.C2975z3 m7341u() {
            h7.z3 r0 = p124h7.C2975z3.zzb
            return r0
    }

    /* renamed from: v */
    public static p124h7.C2975z3 m7342v(p124h7.AbstractC2574cg r1, p124h7.C2754mg r2) {
            h7.z3 r0 = p124h7.C2975z3.zzb
            h7.yg r1 = p124h7.AbstractC2970yg.m7332l(r0, r1, r2)
            h7.z3 r1 = (p124h7.C2975z3) r1
            return r1
    }

    /* renamed from: x */
    public static /* synthetic */ void m7343x(p124h7.C2975z3 r1) {
            r0 = 32
            r1.zze = r0
            return
    }

    /* renamed from: y */
    public static /* synthetic */ void m7344y(p124h7.C2975z3 r0, p124h7.C2544b4 r1) {
            java.util.Objects.requireNonNull(r1)
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
            h7.z3 r2 = p124h7.C2975z3.zzb
            return r2
        L16:
            h7.y3 r2 = new h7.y3
            r2.<init>(r4)
            return r2
        L1c:
            h7.z3 r2 = new h7.z3
            r2.<init>()
            return r2
        L22:
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r4 = 0
            java.lang.String r0 = "zze"
            r2[r4] = r0
            java.lang.String r4 = "zzf"
            r2[r3] = r4
            h7.z3 r3 = p124h7.C2975z3.zzb
            h7.h0 r4 = new h7.h0
            java.lang.String r0 = "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t"
            r4.<init>(r3, r0, r2)
            return r4
        L37:
            java.lang.Byte r2 = java.lang.Byte.valueOf(r3)
            return r2
    }

    /* renamed from: r */
    public final int m7345r() {
            r1 = this;
            int r0 = r1.zze
            return r0
    }

    /* renamed from: w */
    public final p124h7.C2544b4 m7346w() {
            r1 = this;
            h7.b4 r0 = r1.zzf
            if (r0 != 0) goto L8
            h7.b4 r0 = p124h7.C2544b4.m6482v()
        L8:
            return r0
    }
}
