package p124h7;

/* renamed from: h7.s6 */
/* loaded from: classes.dex */
public final class C2852s6 extends p124h7.AbstractC2970yg<p124h7.C2852s6, p124h7.C2798p6> implements p124h7.InterfaceC2953y {
    private static final p124h7.C2852s6 zzb = null;
    private int zze;
    private p124h7.InterfaceC2557c<p124h7.C2834r6> zzf;

    static {
            h7.s6 r0 = new h7.s6
            r0.<init>()
            p124h7.C2852s6.zzb = r0
            java.lang.Class<h7.s6> r1 = p124h7.C2852s6.class
            p124h7.AbstractC2970yg.m7329d(r1, r0)
            return
    }

    public C2852s6() {
            r1 = this;
            r1.<init>()
            h7.g0<java.lang.Object> r0 = p124h7.C2630g0.f11535b0
            r1.zzf = r0
            return
    }

    /* renamed from: A */
    public static void m7128A(p124h7.C2852s6 r2, p124h7.C2834r6 r3) {
            java.util.Objects.requireNonNull(r3)
            h7.c<h7.r6> r0 = r2.zzf
            boolean r1 = r0.mo6520c()
            if (r1 != 0) goto L1b
            int r1 = r0.size()
            if (r1 != 0) goto L14
            r1 = 10
            goto L15
        L14:
            int r1 = r1 + r1
        L15:
            h7.c r0 = r0.mo6521k(r1)
            r2.zzf = r0
        L1b:
            h7.c<h7.r6> r2 = r2.zzf
            r2.add(r3)
            return
    }

    /* renamed from: u */
    public static p124h7.C2798p6 m7129u() {
            h7.s6 r0 = p124h7.C2852s6.zzb
            h7.vg r0 = r0.m7336i()
            h7.p6 r0 = (p124h7.C2798p6) r0
            return r0
    }

    /* renamed from: w */
    public static /* synthetic */ p124h7.C2852s6 m7130w() {
            h7.s6 r0 = p124h7.C2852s6.zzb
            return r0
    }

    /* renamed from: x */
    public static p124h7.C2852s6 m7131x(byte[] r1, p124h7.C2754mg r2) {
            h7.s6 r0 = p124h7.C2852s6.zzb
            h7.yg r1 = p124h7.AbstractC2970yg.m7333n(r0, r1, r2)
            h7.s6 r1 = (p124h7.C2852s6) r1
            return r1
    }

    /* renamed from: z */
    public static /* synthetic */ void m7132z(p124h7.C2852s6 r0, int r1) {
            r0.zze = r1
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
            h7.s6 r3 = p124h7.C2852s6.zzb
            return r3
        L16:
            h7.p6 r3 = new h7.p6
            r3.<init>(r5)
            return r3
        L1c:
            h7.s6 r3 = new h7.s6
            r3.<init>()
            return r3
        L22:
            java.lang.Object[] r3 = new java.lang.Object[r5]
            r5 = 0
            java.lang.String r1 = "zze"
            r3[r5] = r1
            java.lang.String r5 = "zzf"
            r3[r4] = r5
            java.lang.Class<h7.r6> r4 = p124h7.C2834r6.class
            r3[r0] = r4
            h7.s6 r4 = p124h7.C2852s6.zzb
            h7.h0 r5 = new h7.h0
            java.lang.String r0 = "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b"
            r5.<init>(r4, r0, r3)
            return r5
        L3b:
            java.lang.Byte r3 = java.lang.Byte.valueOf(r4)
            return r3
    }

    /* renamed from: r */
    public final int m7133r() {
            r1 = this;
            h7.c<h7.r6> r0 = r1.zzf
            int r0 = r0.size()
            return r0
    }

    /* renamed from: s */
    public final int m7134s() {
            r1 = this;
            int r0 = r1.zze
            return r0
    }

    /* renamed from: v */
    public final p124h7.C2834r6 m7135v(int r2) {
            r1 = this;
            h7.c<h7.r6> r0 = r1.zzf
            java.lang.Object r2 = r0.get(r2)
            h7.r6 r2 = (p124h7.C2834r6) r2
            return r2
    }

    /* renamed from: y */
    public final java.util.List<p124h7.C2834r6> m7136y() {
            r1 = this;
            h7.c<h7.r6> r0 = r1.zzf
            return r0
    }
}
