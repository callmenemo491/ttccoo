package p185k7;

/* renamed from: k7.i5 */
/* loaded from: classes.dex */
public abstract class AbstractC3842i5 implements java.lang.Iterable<java.lang.Byte>, java.io.Serializable {

    /* renamed from: Z */
    public static final p185k7.AbstractC3842i5 f16678Z = null;

    /* renamed from: Y */
    public int f16679Y;

    static {
            k7.f5 r0 = new k7.f5
            byte[] r1 = p185k7.C3871k6.f16723b
            r0.<init>(r1)
            p185k7.AbstractC3842i5.f16678Z = r0
            int r0 = p185k7.C3744b5.f16532a
            return
    }

    public AbstractC3842i5() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f16679Y = r0
            return
    }

    /* renamed from: q */
    public static int m8661q(int r3, int r4, int r5) {
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

    /* renamed from: u */
    public static p185k7.AbstractC3842i5 m8662u(byte[] r3, int r4, int r5) {
            int r0 = r4 + r5
            int r1 = r3.length
            m8661q(r4, r0, r1)
            k7.f5 r0 = new k7.f5
            byte[] r1 = new byte[r5]
            r2 = 0
            java.lang.System.arraycopy(r3, r4, r1, r2, r5)
            r0.<init>(r1)
            return r0
    }

    /* renamed from: a */
    public abstract byte mo8518a(int r1);

    /* renamed from: e */
    public abstract byte mo8519e(int r1);

    public abstract boolean equals(java.lang.Object r1);

    /* renamed from: h */
    public abstract int mo8520h();

    public final int hashCode() {
            r2 = this;
            int r0 = r2.f16679Y
            if (r0 != 0) goto L12
            int r0 = r2.mo8520h()
            r1 = 0
            int r0 = r2.mo8531i(r0, r1, r0)
            if (r0 != 0) goto L10
            r0 = 1
        L10:
            r2.f16679Y = r0
        L12:
            return r0
    }

    /* renamed from: i */
    public abstract int mo8531i(int r1, int r2, int r3);

    @Override // java.lang.Iterable
    public final /* bridge */ /* synthetic */ java.util.Iterator<java.lang.Byte> iterator() {
            r1 = this;
            k7.d5 r0 = new k7.d5
            r0.<init>(r1)
            return r0
    }

    /* renamed from: l */
    public abstract p185k7.AbstractC3842i5 mo8532l(int r1, int r2);

    /* renamed from: m */
    public abstract java.lang.String mo8533m(java.nio.charset.Charset r1);

    /* renamed from: n */
    public abstract void mo8534n(p367v1.C6488b r1);

    /* renamed from: p */
    public abstract boolean mo8535p();

    public final java.lang.String toString() {
            r5 = this;
            java.util.Locale r0 = java.util.Locale.ROOT
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            int r2 = java.lang.System.identityHashCode(r5)
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            r3 = 0
            r1[r3] = r2
            int r2 = r5.mo8520h()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4 = 1
            r1[r4] = r2
            int r2 = r5.mo8520h()
            r4 = 50
            if (r2 > r4) goto L28
            java.lang.String r2 = p185k7.C3828h5.m8584M(r5)
            goto L3c
        L28:
            r2 = 47
            k7.i5 r2 = r5.mo8532l(r3, r2)
            java.lang.String r2 = p185k7.C3828h5.m8584M(r2)
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
}
