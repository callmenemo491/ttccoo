package p124h7;

/* renamed from: h7.ig */
/* loaded from: classes.dex */
public abstract class AbstractC2682ig extends p124h7.AbstractC2951xf {

    /* renamed from: c */
    public static final java.util.logging.Logger f11658c = null;

    /* renamed from: d */
    public static final boolean f11659d = false;

    /* renamed from: b */
    public p124h7.C2700jg f11660b;

    static {
            java.lang.Class<h7.ig> r0 = p124h7.AbstractC2682ig.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            p124h7.AbstractC2682ig.f11658c = r0
            boolean r0 = p124h7.C2577d1.f11437e
            p124h7.AbstractC2682ig.f11659d = r0
            return
    }

    public AbstractC2682ig() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public /* synthetic */ AbstractC2682ig(p124h7.C2939x3 r1) {
            r0 = this;
            r1 = 0
            r0.<init>(r1)
            return
    }

    /* renamed from: A */
    public static int m6835A(p124h7.AbstractC2574cg r1) {
            int r1 = r1.mo6474h()
            int r0 = m6841h(r1)
            int r0 = r0 + r1
            return r0
    }

    @java.lang.Deprecated
    /* renamed from: B */
    public static int m6836B(int r2, p124h7.InterfaceC2935x r3, p124h7.InterfaceC2666i0 r4) {
            int r2 = r2 << 3
            int r2 = m6841h(r2)
            int r2 = r2 + r2
            h7.sf r3 = (p124h7.AbstractC2861sf) r3
            int r0 = r3.mo7139a()
            r1 = -1
            if (r0 != r1) goto L17
            int r0 = r4.mo6442e(r3)
            r3.mo7140b(r0)
        L17:
            int r2 = r2 + r0
            return r2
    }

    /* renamed from: C */
    public static int m6837C(int r0) {
            if (r0 < 0) goto L7
            int r0 = m6841h(r0)
            return r0
        L7:
            r0 = 10
            return r0
    }

    /* renamed from: e */
    public static int m6838e(p124h7.InterfaceC2935x r2, p124h7.InterfaceC2666i0 r3) {
            h7.sf r2 = (p124h7.AbstractC2861sf) r2
            int r0 = r2.mo7139a()
            r1 = -1
            if (r0 != r1) goto L10
            int r0 = r3.mo6442e(r2)
            r2.mo7140b(r0)
        L10:
            int r2 = m6841h(r0)
            int r2 = r2 + r0
            return r2
    }

    /* renamed from: f */
    public static int m6839f(java.lang.String r1) {
            int r1 = p124h7.C2631g1.m6744c(r1)     // Catch: p124h7.C2613f1 -> L5
            goto Lc
        L5:
            java.nio.charset.Charset r0 = p124h7.C2575d.f11429a
            byte[] r1 = r1.getBytes(r0)
            int r1 = r1.length
        Lc:
            int r0 = m6841h(r1)
            int r0 = r0 + r1
            return r0
    }

    /* renamed from: g */
    public static int m6840g(int r0) {
            int r0 = r0 << 3
            int r0 = m6841h(r0)
            return r0
    }

    /* renamed from: h */
    public static int m6841h(int r1) {
            r0 = r1 & (-128(0xffffffffffffff80, float:NaN))
            if (r0 != 0) goto L6
            r1 = 1
            return r1
        L6:
            r0 = r1 & (-16384(0xffffffffffffc000, float:NaN))
            if (r0 != 0) goto Lc
            r1 = 2
            return r1
        Lc:
            r0 = -2097152(0xffffffffffe00000, float:NaN)
            r0 = r0 & r1
            if (r0 != 0) goto L13
            r1 = 3
            return r1
        L13:
            r0 = -268435456(0xfffffffff0000000, float:-1.5845633E29)
            r1 = r1 & r0
            if (r1 != 0) goto L1a
            r1 = 4
            return r1
        L1a:
            r1 = 5
            return r1
    }

    /* renamed from: i */
    public static int m6842i(long r7) {
            r0 = -128(0xffffffffffffff80, double:NaN)
            long r0 = r0 & r7
            r2 = 1
            r3 = 0
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 != 0) goto Lb
            return r2
        Lb:
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 >= 0) goto L12
            r7 = 10
            return r7
        L12:
            r0 = -34359738368(0xfffffff800000000, double:NaN)
            long r0 = r0 & r7
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 == 0) goto L21
            r0 = 28
            long r7 = r7 >>> r0
            r0 = 6
            goto L22
        L21:
            r0 = 2
        L22:
            r5 = -2097152(0xffffffffffe00000, double:NaN)
            long r5 = r5 & r7
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 == 0) goto L2f
            int r0 = r0 + 2
            r1 = 14
            long r7 = r7 >>> r1
        L2f:
            r5 = -16384(0xffffffffffffc000, double:NaN)
            long r7 = r7 & r5
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 == 0) goto L37
            int r0 = r0 + r2
        L37:
            return r0
    }

    /* renamed from: j */
    public final void m6843j(java.lang.String r7, p124h7.C2613f1 r8) {
            r6 = this;
            java.util.logging.Logger r0 = p124h7.AbstractC2682ig.f11658c
            java.util.logging.Level r1 = java.util.logging.Level.WARNING
            java.lang.String r2 = "com.google.protobuf.CodedOutputStream"
            java.lang.String r3 = "inefficientWriteStringNoTag"
            java.lang.String r4 = "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!"
            r5 = r8
            r0.logp(r1, r2, r3, r4, r5)
            java.nio.charset.Charset r8 = p124h7.C2575d.f11429a
            byte[] r7 = r7.getBytes(r8)
            int r8 = r7.length     // Catch: p124h7.C2646gg -> L1d java.lang.IndexOutOfBoundsException -> L1f
            r6.mo6737x(r8)     // Catch: p124h7.C2646gg -> L1d java.lang.IndexOutOfBoundsException -> L1f
            r0 = 0
            r6.mo6723d(r7, r0, r8)     // Catch: p124h7.C2646gg -> L1d java.lang.IndexOutOfBoundsException -> L1f
            return
        L1d:
            r7 = move-exception
            throw r7
        L1f:
            r7 = move-exception
            h7.gg r8 = new h7.gg
            r8.<init>(r7)
            throw r8
    }

    /* renamed from: k */
    public abstract void mo6724k(byte r1);

    /* renamed from: l */
    public abstract void mo6725l(int r1, boolean r2);

    /* renamed from: m */
    public abstract void mo6726m(int r1, p124h7.AbstractC2574cg r2);

    /* renamed from: n */
    public abstract void mo6727n(int r1, int r2);

    /* renamed from: o */
    public abstract void mo6728o(int r1);

    /* renamed from: p */
    public abstract void mo6729p(int r1, long r2);

    /* renamed from: q */
    public abstract void mo6730q(long r1);

    /* renamed from: r */
    public abstract void mo6731r(int r1, int r2);

    /* renamed from: s */
    public abstract void mo6732s(int r1);

    /* renamed from: t */
    public abstract void mo6733t(int r1, p124h7.InterfaceC2935x r2, p124h7.InterfaceC2666i0 r3);

    /* renamed from: u */
    public abstract void mo6734u(int r1, java.lang.String r2);

    /* renamed from: v */
    public abstract void mo6735v(int r1, int r2);

    /* renamed from: w */
    public abstract void mo6736w(int r1, int r2);

    /* renamed from: x */
    public abstract void mo6737x(int r1);

    /* renamed from: y */
    public abstract void mo6738y(int r1, long r2);

    /* renamed from: z */
    public abstract void mo6739z(long r1);
}
