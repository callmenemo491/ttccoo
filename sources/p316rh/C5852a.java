package p316rh;

/* renamed from: rh.a */
/* loaded from: classes.dex */
public class C5852a implements java.lang.Iterable<java.lang.Integer>, p259oh.InterfaceC5277a {

    /* renamed from: Y */
    public final int f22647Y;

    /* renamed from: Z */
    public final int f22648Z;

    /* renamed from: a0 */
    public final int f22649a0;

    public C5852a(int r3, int r4, int r5) {
            r2 = this;
            r2.<init>()
            if (r5 == 0) goto L48
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == r0) goto L40
            r2.f22647Y = r3
            if (r5 <= 0) goto L1f
            if (r3 < r4) goto L10
            goto L33
        L10:
            int r0 = p074e9.C1805a.m4531p(r4, r5)
            int r3 = p074e9.C1805a.m4531p(r3, r5)
            int r0 = r0 - r3
            int r3 = p074e9.C1805a.m4531p(r0, r5)
            int r4 = r4 - r3
            goto L33
        L1f:
            if (r5 >= 0) goto L38
            if (r3 > r4) goto L24
            goto L33
        L24:
            int r0 = -r5
            int r3 = p074e9.C1805a.m4531p(r3, r0)
            int r1 = p074e9.C1805a.m4531p(r4, r0)
            int r3 = r3 - r1
            int r3 = p074e9.C1805a.m4531p(r3, r0)
            int r4 = r4 + r3
        L33:
            r2.f22648Z = r4
            r2.f22649a0 = r5
            return
        L38:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Step is zero."
            r3.<init>(r4)
            throw r3
        L40:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Step must be greater than Int.MIN_VALUE to avoid overflow on negation."
            r3.<init>(r4)
            throw r3
        L48:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Step must be non-zero."
            r3.<init>(r4)
            throw r3
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof p316rh.C5852a
            if (r0 == 0) goto L29
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L13
            r0 = r3
            rh.a r0 = (p316rh.C5852a) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L27
        L13:
            int r0 = r2.f22647Y
            rh.a r3 = (p316rh.C5852a) r3
            int r1 = r3.f22647Y
            if (r0 != r1) goto L29
            int r0 = r2.f22648Z
            int r1 = r3.f22648Z
            if (r0 != r1) goto L29
            int r0 = r2.f22649a0
            int r3 = r3.f22649a0
            if (r0 != r3) goto L29
        L27:
            r3 = 1
            goto L2a
        L29:
            r3 = 0
        L2a:
            return r3
    }

    public int hashCode() {
            r2 = this;
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L8
            r0 = -1
            goto L14
        L8:
            int r0 = r2.f22647Y
            int r0 = r0 * 31
            int r1 = r2.f22648Z
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.f22649a0
            int r0 = r0 + r1
        L14:
            return r0
    }

    public boolean isEmpty() {
            r4 = this;
            int r0 = r4.f22649a0
            r1 = 1
            r2 = 0
            if (r0 <= 0) goto Ld
            int r0 = r4.f22647Y
            int r3 = r4.f22648Z
            if (r0 <= r3) goto L14
            goto L15
        Ld:
            int r0 = r4.f22647Y
            int r3 = r4.f22648Z
            if (r0 >= r3) goto L14
            goto L15
        L14:
            r1 = 0
        L15:
            return r1
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<java.lang.Integer> iterator() {
            r4 = this;
            rh.b r0 = new rh.b
            int r1 = r4.f22647Y
            int r2 = r4.f22648Z
            int r3 = r4.f22649a0
            r0.<init>(r1, r2, r3)
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            int r0 = r3.f22649a0
            java.lang.String r1 = " step "
            if (r0 <= 0) goto L20
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r2 = r3.f22647Y
            r0.append(r2)
            java.lang.String r2 = ".."
            r0.append(r2)
            int r2 = r3.f22648Z
            r0.append(r2)
            r0.append(r1)
            int r1 = r3.f22649a0
            goto L3a
        L20:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r2 = r3.f22647Y
            r0.append(r2)
            java.lang.String r2 = " downTo "
            r0.append(r2)
            int r2 = r3.f22648Z
            r0.append(r2)
            r0.append(r1)
            int r1 = r3.f22649a0
            int r1 = -r1
        L3a:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
