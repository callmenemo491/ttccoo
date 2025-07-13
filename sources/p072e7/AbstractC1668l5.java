package p072e7;

/* renamed from: e7.l5 */
/* loaded from: classes.dex */
public abstract class AbstractC1668l5 extends p367v1.C6488b {

    /* renamed from: a0 */
    public static final java.util.logging.Logger f7685a0 = null;

    /* renamed from: b0 */
    public static final boolean f7686b0 = false;

    /* renamed from: Z */
    public p072e7.C1678m5 f7687Z;

    static {
            java.lang.Class<e7.l5> r0 = p072e7.AbstractC1668l5.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            p072e7.AbstractC1668l5.f7685a0 = r0
            boolean r0 = p072e7.C1651j8.f7670e
            p072e7.AbstractC1668l5.f7686b0 = r0
            return
    }

    public AbstractC1668l5() {
            r1 = this;
            r0 = 18
            r1.<init>(r0)
            return
    }

    public /* synthetic */ AbstractC1668l5(p036c6.C0906q0 r1) {
            r0 = this;
            r1 = 18
            r0.<init>(r1)
            return
    }

    /* renamed from: E */
    public static int m4325E(p072e7.AbstractC1638i5 r1) {
            int r1 = r1.mo4195h()
            int r0 = m4331m(r1)
            int r0 = r0 + r1
            return r0
    }

    @java.lang.Deprecated
    /* renamed from: F */
    public static int m4326F(int r2, p072e7.InterfaceC1560a7 r3, p072e7.InterfaceC1670l7 r4) {
            int r2 = r2 << 3
            int r2 = m4331m(r2)
            int r2 = r2 + r2
            e7.a5 r3 = (p072e7.AbstractC1558a5) r3
            int r0 = r3.mo4120a()
            r1 = -1
            if (r0 != r1) goto L17
            int r0 = r4.mo4168e(r3)
            r3.mo4121b(r0)
        L17:
            int r2 = r2 + r0
            return r2
    }

    /* renamed from: G */
    public static int m4327G(int r0) {
            if (r0 < 0) goto L7
            int r0 = m4331m(r0)
            return r0
        L7:
            r0 = 10
            return r0
    }

    /* renamed from: H */
    public static int m4328H(p072e7.InterfaceC1560a7 r2, p072e7.InterfaceC1670l7 r3) {
            e7.a5 r2 = (p072e7.AbstractC1558a5) r2
            int r0 = r2.mo4120a()
            r1 = -1
            if (r0 != r1) goto L10
            int r0 = r3.mo4168e(r2)
            r2.mo4121b(r0)
        L10:
            int r2 = m4331m(r0)
            int r2 = r2 + r0
            return r2
    }

    /* renamed from: I */
    public static int m4329I(java.lang.String r1) {
            int r1 = p072e7.C1681m8.m4350c(r1)     // Catch: p072e7.C1671l8 -> L5
            goto Lc
        L5:
            java.nio.charset.Charset r0 = p072e7.C1619g6.f7568a
            byte[] r1 = r1.getBytes(r0)
            int r1 = r1.length
        Lc:
            int r0 = m4331m(r1)
            int r0 = r0 + r1
            return r0
    }

    /* renamed from: J */
    public static int m4330J(int r0) {
            int r0 = r0 << 3
            int r0 = m4331m(r0)
            return r0
    }

    /* renamed from: m */
    public static int m4331m(int r1) {
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
    public static int m4332n(long r7) {
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
    public abstract void mo4272A(int r1, int r2);

    /* renamed from: B */
    public abstract void mo4273B(int r1);

    /* renamed from: C */
    public abstract void mo4274C(int r1, long r2);

    /* renamed from: D */
    public abstract void mo4275D(long r1);

    /* renamed from: o */
    public abstract void mo4279o(byte r1);

    /* renamed from: p */
    public abstract void mo4280p(int r1, boolean r2);

    /* renamed from: q */
    public abstract void mo4281q(int r1, p072e7.AbstractC1638i5 r2);

    /* renamed from: r */
    public abstract void mo4282r(int r1, int r2);

    /* renamed from: t */
    public abstract void mo4283t(int r1);

    /* renamed from: u */
    public abstract void mo4284u(int r1, long r2);

    /* renamed from: v */
    public abstract void mo4285v(long r1);

    /* renamed from: w */
    public abstract void mo4286w(int r1, int r2);

    /* renamed from: x */
    public abstract void mo4287x(int r1);

    /* renamed from: y */
    public abstract void mo4288y(int r1, java.lang.String r2);

    /* renamed from: z */
    public abstract void mo4289z(int r1, int r2);
}
