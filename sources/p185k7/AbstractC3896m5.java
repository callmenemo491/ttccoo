package p185k7;

/* renamed from: k7.m5 */
/* loaded from: classes.dex */
public abstract class AbstractC3896m5 extends p367v1.C6488b {

    /* renamed from: a0 */
    public static final java.util.logging.Logger f16745a0 = null;

    /* renamed from: b0 */
    public static final boolean f16746b0 = false;

    /* renamed from: Z */
    public p185k7.C3909n5 f16747Z;

    static {
            java.lang.Class<k7.m5> r0 = p185k7.AbstractC3896m5.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            p185k7.AbstractC3896m5.f16745a0 = r0
            boolean r0 = p185k7.C3859j8.f16710e
            p185k7.AbstractC3896m5.f16746b0 = r0
            return
    }

    public AbstractC3896m5() {
            r1 = this;
            r0 = 25
            r1.<init>(r0)
            return
    }

    public /* synthetic */ AbstractC3896m5(p185k7.C3828h5 r1) {
            r0 = this;
            r1 = 25
            r0.<init>(r1)
            return
    }

    /* renamed from: E */
    public static int m8818E(p185k7.AbstractC3842i5 r1) {
            int r1 = r1.mo8520h()
            int r0 = m8824m(r1)
            int r0 = r0 + r1
            return r0
    }

    @java.lang.Deprecated
    /* renamed from: F */
    public static int m8819F(int r2, p185k7.InterfaceC3802f7 r3, p185k7.InterfaceC3950q7 r4) {
            int r2 = r2 << 3
            int r2 = m8824m(r2)
            int r2 = r2 + r2
            k7.z4 r3 = (p185k7.AbstractC4064z4) r3
            int r0 = r3.mo8497f()
            r1 = -1
            if (r0 != r1) goto L17
            int r0 = r4.mo8686e(r3)
            r3.mo8498h(r0)
        L17:
            int r2 = r2 + r0
            return r2
    }

    /* renamed from: G */
    public static int m8820G(int r0) {
            if (r0 < 0) goto L7
            int r0 = m8824m(r0)
            return r0
        L7:
            r0 = 10
            return r0
    }

    /* renamed from: H */
    public static int m8821H(p185k7.InterfaceC3802f7 r2, p185k7.InterfaceC3950q7 r3) {
            k7.z4 r2 = (p185k7.AbstractC4064z4) r2
            int r0 = r2.mo8497f()
            r1 = -1
            if (r0 != r1) goto L10
            int r0 = r3.mo8686e(r2)
            r2.mo8498h(r0)
        L10:
            int r2 = m8824m(r0)
            int r2 = r2 + r0
            return r2
    }

    /* renamed from: I */
    public static int m8822I(java.lang.String r1) {
            int r1 = p185k7.C3899m8.m8832c(r1)     // Catch: p185k7.C3886l8 -> L5
            goto Lc
        L5:
            java.nio.charset.Charset r0 = p185k7.C3871k6.f16722a
            byte[] r1 = r1.getBytes(r0)
            int r1 = r1.length
        Lc:
            int r0 = m8824m(r1)
            int r0 = r0 + r1
            return r0
    }

    /* renamed from: J */
    public static int m8823J(int r0) {
            int r0 = r0 << 3
            int r0 = m8824m(r0)
            return r0
    }

    /* renamed from: m */
    public static int m8824m(int r1) {
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

    /* renamed from: n */
    public static int m8825n(long r7) {
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

    /* renamed from: A */
    public abstract void mo8763A(int r1, int r2);

    /* renamed from: B */
    public abstract void mo8764B(int r1);

    /* renamed from: C */
    public abstract void mo8765C(int r1, long r2);

    /* renamed from: D */
    public abstract void mo8766D(long r1);

    /* renamed from: o */
    public abstract void mo8770o(byte r1);

    /* renamed from: p */
    public abstract void mo8771p(int r1, boolean r2);

    /* renamed from: q */
    public abstract void mo8772q(int r1, p185k7.AbstractC3842i5 r2);

    /* renamed from: r */
    public abstract void mo8773r(int r1, int r2);

    /* renamed from: t */
    public abstract void mo8774t(int r1);

    /* renamed from: u */
    public abstract void mo8775u(int r1, long r2);

    /* renamed from: v */
    public abstract void mo8776v(long r1);

    /* renamed from: w */
    public abstract void mo8777w(int r1, int r2);

    /* renamed from: x */
    public abstract void mo8778x(int r1);

    /* renamed from: y */
    public abstract void mo8779y(int r1, java.lang.String r2);

    /* renamed from: z */
    public abstract void mo8780z(int r1, int r2);
}
