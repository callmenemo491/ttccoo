package p124h7;

/* renamed from: h7.cg */
/* loaded from: classes.dex */
public abstract class AbstractC2574cg implements java.lang.Iterable<java.lang.Byte>, java.io.Serializable {

    /* renamed from: Z */
    public static final p124h7.AbstractC2574cg f11427Z = null;

    /* renamed from: Y */
    public int f11428Y;

    static {
            h7.bg r0 = new h7.bg
            byte[] r1 = p124h7.C2575d.f11430b
            r0.<init>(r1)
            p124h7.AbstractC2574cg.f11427Z = r0
            int r0 = p124h7.C2897uf.f11947a
            return
    }

    public AbstractC2574cg() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f11428Y = r0
            return
    }

    /* renamed from: A */
    public static p124h7.AbstractC2574cg m6534A(byte[] r3, int r4, int r5) {
            int r0 = r4 + r5
            int r1 = r3.length
            m6535w(r4, r0, r1)
            h7.bg r0 = new h7.bg
            byte[] r1 = new byte[r5]
            r2 = 0
            java.lang.System.arraycopy(r3, r4, r1, r2, r5)
            r0.<init>(r1)
            return r0
    }

    /* renamed from: w */
    public static int m6535w(int r3, int r4, int r5) {
            int r0 = r4 - r3
            r1 = r3 | r4
            r1 = r1 | r0
            int r2 = r5 - r4
            r1 = r1 | r2
            if (r1 >= 0) goto L4c
            if (r3 < 0) goto L2e
            if (r4 >= r3) goto L1e
            java.lang.IndexOutOfBoundsException r5 = new java.lang.IndexOutOfBoundsException
            r0 = 66
            java.lang.String r1 = "Beginning index larger than ending index: "
            java.lang.String r2 = ", "
            java.lang.String r3 = p304r4.C5785f.m12134a(r0, r1, r3, r2, r4)
            r5.<init>(r3)
            throw r5
        L1e:
            java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
            r0 = 37
            java.lang.String r1 = "End index: "
            java.lang.String r2 = " >= "
            java.lang.String r4 = p304r4.C5785f.m12134a(r0, r1, r4, r2, r5)
            r3.<init>(r4)
            throw r3
        L2e:
            java.lang.IndexOutOfBoundsException r4 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r0 = 32
            r5.<init>(r0)
            java.lang.String r0 = "Beginning index: "
            r5.append(r0)
            r5.append(r3)
            java.lang.String r3 = " < 0"
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r4.<init>(r3)
            throw r4
        L4c:
            return r0
    }

    /* renamed from: z */
    public static p124h7.AbstractC2574cg m6536z(byte[] r2) {
            int r0 = r2.length
            r1 = 0
            h7.cg r2 = m6534A(r2, r1, r0)
            return r2
    }

    /* renamed from: C */
    public final byte[] m6537C() {
            r3 = this;
            int r0 = r3.mo6474h()
            if (r0 != 0) goto L9
            byte[] r0 = p124h7.C2575d.f11430b
            return r0
        L9:
            byte[] r1 = new byte[r0]
            r2 = 0
            r3.mo6475i(r1, r2, r2, r0)
            return r1
    }

    /* renamed from: a */
    public abstract byte mo6472a(int r1);

    /* renamed from: e */
    public abstract byte mo6473e(int r1);

    public abstract boolean equals(java.lang.Object r1);

    /* renamed from: h */
    public abstract int mo6474h();

    public final int hashCode() {
            r2 = this;
            int r0 = r2.f11428Y
            if (r0 != 0) goto L12
            int r0 = r2.mo6474h()
            r1 = 0
            int r0 = r2.mo6513l(r0, r1, r0)
            if (r0 != 0) goto L10
            r0 = 1
        L10:
            r2.f11428Y = r0
        L12:
            return r0
    }

    /* renamed from: i */
    public abstract void mo6475i(byte[] r1, int r2, int r3, int r4);

    @Override // java.lang.Iterable
    public final /* bridge */ /* synthetic */ java.util.Iterator<java.lang.Byte> iterator() {
            r1 = this;
            h7.yf r0 = new h7.yf
            r0.<init>(r1)
            return r0
    }

    /* renamed from: l */
    public abstract int mo6513l(int r1, int r2, int r3);

    /* renamed from: m */
    public abstract p124h7.AbstractC2574cg mo6514m(int r1, int r2);

    /* renamed from: n */
    public abstract p124h7.C2592dg mo6515n();

    /* renamed from: p */
    public abstract java.lang.String mo6516p(java.nio.charset.Charset r1);

    /* renamed from: q */
    public abstract void mo6517q(p124h7.AbstractC2951xf r1);

    public final java.lang.String toString() {
            r5 = this;
            java.util.Locale r0 = java.util.Locale.ROOT
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            int r2 = java.lang.System.identityHashCode(r5)
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            r3 = 0
            r1[r3] = r2
            int r2 = r5.mo6474h()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4 = 1
            r1[r4] = r2
            int r2 = r5.mo6474h()
            r4 = 50
            if (r2 > r4) goto L28
            java.lang.String r2 = p036c6.C0906q0.m2615c(r5)
            goto L3c
        L28:
            r2 = 47
            h7.cg r2 = r5.mo6514m(r3, r2)
            java.lang.String r2 = p036c6.C0906q0.m2615c(r2)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "..."
            java.lang.String r2 = r2.concat(r3)
        L3c:
            r3 = 2
            r1[r3] = r2
            java.lang.String r2 = "<ByteString@%s size=%d contents=\"%s\">"
            java.lang.String r0 = java.lang.String.format(r0, r2, r1)
            return r0
    }

    /* renamed from: u */
    public abstract boolean mo6518u();
}
