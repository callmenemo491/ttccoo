package p108g5;

/* renamed from: g5.i0 */
/* loaded from: classes.dex */
public final class C2273i0 implements p088f4.InterfaceC2014i {

    /* renamed from: b0 */
    public static final p108g5.C2273i0 f10376b0 = null;

    /* renamed from: c0 */
    public static final p088f4.InterfaceC2014i.a<p108g5.C2273i0> f10377c0 = null;

    /* renamed from: Y */
    public final int f10378Y;

    /* renamed from: Z */
    public final p108g5.C2271h0[] f10379Z;

    /* renamed from: a0 */
    public int f10380a0;

    static {
            g5.i0 r0 = new g5.i0
            r1 = 0
            g5.h0[] r1 = new p108g5.C2271h0[r1]
            r0.<init>(r1)
            p108g5.C2273i0.f10376b0 = r0
            k1.c r0 = p179k1.C3644c.f16092n0
            p108g5.C2273i0.f10377c0 = r0
            return
    }

    public C2273i0(p108g5.C2271h0... r1) {
            r0 = this;
            r0.<init>()
            r0.f10379Z = r1
            int r1 = r1.length
            r0.f10378Y = r1
            return
    }

    /* renamed from: a */
    public int m6019a(p108g5.C2271h0 r3) {
            r2 = this;
            r0 = 0
        L1:
            int r1 = r2.f10378Y
            if (r0 >= r1) goto Lf
            g5.h0[] r1 = r2.f10379Z
            r1 = r1[r0]
            if (r1 != r3) goto Lc
            return r0
        Lc:
            int r0 = r0 + 1
            goto L1
        Lf:
            r3 = -1
            return r3
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L25
            java.lang.Class<g5.i0> r2 = p108g5.C2273i0.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L25
        L10:
            g5.i0 r5 = (p108g5.C2273i0) r5
            int r2 = r4.f10378Y
            int r3 = r5.f10378Y
            if (r2 != r3) goto L23
            g5.h0[] r2 = r4.f10379Z
            g5.h0[] r5 = r5.f10379Z
            boolean r5 = java.util.Arrays.equals(r2, r5)
            if (r5 == 0) goto L23
            goto L24
        L23:
            r0 = 0
        L24:
            return r0
        L25:
            return r1
    }

    public int hashCode() {
            r1 = this;
            int r0 = r1.f10380a0
            if (r0 != 0) goto Lc
            g5.h0[] r0 = r1.f10379Z
            int r0 = java.util.Arrays.hashCode(r0)
            r1.f10380a0 = r0
        Lc:
            int r0 = r1.f10380a0
            return r0
    }
}
