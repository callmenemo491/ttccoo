package p072e7;

/* renamed from: e7.i5 */
/* loaded from: classes.dex */
public abstract class AbstractC1638i5 implements java.lang.Iterable<java.lang.Byte>, java.io.Serializable {

    /* renamed from: Z */
    public static final p072e7.AbstractC1638i5 f7635Z = null;

    /* renamed from: Y */
    public int f7636Y;

    static {
            e7.h5 r0 = new e7.h5
            byte[] r1 = p072e7.C1619g6.f7569b
            r0.<init>(r1)
            p072e7.AbstractC1638i5.f7635Z = r0
            int r0 = p072e7.C1578c5.f7512a
            return
    }

    public AbstractC1638i5() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f7636Y = r0
            return
    }

    /* renamed from: q */
    public static int m4232q(int r3, int r4, int r5) {
            int r3 = r5 - r4
            r3 = r3 | r4
            if (r3 < 0) goto L6
            return r4
        L6:
            java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
            r0 = 37
            java.lang.String r1 = "End index: "
            java.lang.String r2 = " >= "
            java.lang.String r4 = p304r4.C5785f.m12134a(r0, r1, r4, r2, r5)
            r3.<init>(r4)
            throw r3
    }

    /* renamed from: a */
    public abstract byte mo4193a(int r1);

    /* renamed from: e */
    public abstract byte mo4194e(int r1);

    public abstract boolean equals(java.lang.Object r1);

    /* renamed from: h */
    public abstract int mo4195h();

    public final int hashCode() {
            r2 = this;
            int r0 = r2.f7636Y
            if (r0 != 0) goto L12
            int r0 = r2.mo4195h()
            r1 = 0
            int r0 = r2.mo4219i(r0, r1, r0)
            if (r0 != 0) goto L10
            r0 = 1
        L10:
            r2.f7636Y = r0
        L12:
            return r0
    }

    /* renamed from: i */
    public abstract int mo4219i(int r1, int r2, int r3);

    @Override // java.lang.Iterable
    public final /* synthetic */ java.util.Iterator<java.lang.Byte> iterator() {
            r1 = this;
            e7.d5 r0 = new e7.d5
            r0.<init>(r1)
            return r0
    }

    /* renamed from: l */
    public abstract p072e7.AbstractC1638i5 mo4220l(int r1, int r2);

    /* renamed from: m */
    public abstract java.lang.String mo4221m(java.nio.charset.Charset r1);

    /* renamed from: n */
    public abstract void mo4222n(p367v1.C6488b r1);

    /* renamed from: p */
    public abstract boolean mo4223p();

    public final java.lang.String toString() {
            r5 = this;
            java.util.Locale r0 = java.util.Locale.ROOT
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            int r2 = java.lang.System.identityHashCode(r5)
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            r3 = 0
            r1[r3] = r2
            int r2 = r5.mo4195h()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4 = 1
            r1[r4] = r2
            int r2 = r5.mo4195h()
            r4 = 50
            if (r2 > r4) goto L28
            java.lang.String r2 = p052d6.C1310h0.m3802d(r5)
            goto L38
        L28:
            r2 = 47
            e7.i5 r2 = r5.mo4220l(r3, r2)
            java.lang.String r2 = p052d6.C1310h0.m3802d(r2)
            java.lang.String r3 = "..."
            java.lang.String r2 = r2.concat(r3)
        L38:
            r3 = 2
            r1[r3] = r2
            java.lang.String r2 = "<ByteString@%s size=%d contents=\"%s\">"
            java.lang.String r0 = java.lang.String.format(r0, r2, r1)
            return r0
    }
}
