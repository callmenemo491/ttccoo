package p036c6;

/* renamed from: c6.l */
/* loaded from: classes.dex */
public class C0895l extends p270p6.AbstractC5367a {

    @androidx.annotation.RecentlyNonNull
    public static final android.os.Parcelable.Creator<p036c6.C0895l> CREATOR = null;

    /* renamed from: Y */
    public int f4796Y;

    /* renamed from: Z */
    public java.lang.String f4797Z;

    /* renamed from: a0 */
    public java.util.List<p036c6.C0893k> f4798a0;

    /* renamed from: b0 */
    public java.util.List<p233n6.C4691a> f4799b0;

    /* renamed from: c0 */
    public double f4800c0;

    static {
            c6.p0 r0 = new c6.p0
            r0.<init>()
            p036c6.C0895l.CREATOR = r0
            return
    }

    public C0895l() {
            r0 = this;
            r0.<init>()
            r0.m2604X()
            return
    }

    public C0895l(int r1, java.lang.String r2, java.util.List<p036c6.C0893k> r3, java.util.List<p233n6.C4691a> r4, double r5) {
            r0 = this;
            r0.<init>()
            r0.f4796Y = r1
            r0.f4797Z = r2
            r0.f4798a0 = r3
            r0.f4799b0 = r4
            r0.f4800c0 = r5
            return
    }

    public /* synthetic */ C0895l(p036c6.C0895l r3) {
            r2 = this;
            r2.<init>()
            int r0 = r3.f4796Y
            r2.f4796Y = r0
            java.lang.String r0 = r3.f4797Z
            r2.f4797Z = r0
            java.util.List<c6.k> r0 = r3.f4798a0
            r2.f4798a0 = r0
            java.util.List<n6.a> r0 = r3.f4799b0
            r2.f4799b0 = r0
            double r0 = r3.f4800c0
            r2.f4800c0 = r0
            return
    }

    public /* synthetic */ C0895l(p052d6.C1310h0 r1) {
            r0 = this;
            r0.<init>()
            r0.m2604X()
            return
    }

    /* renamed from: X */
    public final void m2604X() {
            r2 = this;
            r0 = 0
            r2.f4796Y = r0
            r0 = 0
            r2.f4797Z = r0
            r2.f4798a0 = r0
            r2.f4799b0 = r0
            r0 = 0
            r2.f4800c0 = r0
            return
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof p036c6.C0895l
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            c6.l r8 = (p036c6.C0895l) r8
            int r1 = r7.f4796Y
            int r3 = r8.f4796Y
            if (r1 != r3) goto L39
            java.lang.String r1 = r7.f4797Z
            java.lang.String r3 = r8.f4797Z
            boolean r1 = android.text.TextUtils.equals(r1, r3)
            if (r1 == 0) goto L39
            java.util.List<c6.k> r1 = r7.f4798a0
            java.util.List<c6.k> r3 = r8.f4798a0
            boolean r1 = p248o6.C4924o.m11074a(r1, r3)
            if (r1 == 0) goto L39
            java.util.List<n6.a> r1 = r7.f4799b0
            java.util.List<n6.a> r3 = r8.f4799b0
            boolean r1 = p248o6.C4924o.m11074a(r1, r3)
            if (r1 == 0) goto L39
            double r3 = r7.f4800c0
            double r5 = r8.f4800c0
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L39
            return r0
        L39:
            return r2
    }

    public int hashCode() {
            r3 = this;
            r0 = 5
            java.lang.Object[] r0 = new java.lang.Object[r0]
            int r1 = r3.f4796Y
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = r3.f4797Z
            r2 = 1
            r0[r2] = r1
            java.util.List<c6.k> r1 = r3.f4798a0
            r2 = 2
            r0[r2] = r1
            java.util.List<n6.a> r1 = r3.f4799b0
            r2 = 3
            r0[r2] = r1
            double r1 = r3.f4800c0
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            r2 = 4
            r0[r2] = r1
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@androidx.annotation.RecentlyNonNull android.os.Parcel r5, int r6) {
            r4 = this;
            r6 = 20293(0x4f45, float:2.8437E-41)
            int r6 = p270p6.C5369c.m11723k(r5, r6)
            r0 = 2
            int r1 = r4.f4796Y
            r2 = 4
            p270p6.C5369c.m11724l(r5, r0, r2)
            r5.writeInt(r1)
            r0 = 3
            java.lang.String r1 = r4.f4797Z
            r3 = 0
            p270p6.C5369c.m11719g(r5, r0, r1, r3)
            java.util.List<c6.k> r0 = r4.f4798a0
            r1 = 0
            if (r0 != 0) goto L1e
            r0 = r1
            goto L22
        L1e:
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
        L22:
            p270p6.C5369c.m11722j(r5, r2, r0, r3)
            r0 = 5
            java.util.List<n6.a> r2 = r4.f4799b0
            if (r2 != 0) goto L2b
            goto L2f
        L2b:
            java.util.List r1 = java.util.Collections.unmodifiableList(r2)
        L2f:
            p270p6.C5369c.m11722j(r5, r0, r1, r3)
            r0 = 6
            double r1 = r4.f4800c0
            r3 = 8
            p270p6.C5369c.m11724l(r5, r0, r3)
            r5.writeDouble(r1)
            p270p6.C5369c.m11726n(r5, r6)
            return
    }
}
