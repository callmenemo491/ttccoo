package p026b9;

/* renamed from: b9.k0 */
/* loaded from: classes.dex */
public final class C0709k0<E> extends p026b9.AbstractC0716p<E> {

    /* renamed from: b0 */
    public final transient E f3970b0;

    /* renamed from: c0 */
    public transient int f3971c0;

    public C0709k0(E r1) {
            r0 = this;
            r0.<init>()
            java.util.Objects.requireNonNull(r1)
            r0.f3970b0 = r1
            return
    }

    public C0709k0(E r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f3970b0 = r1
            r0.f3971c0 = r2
            return
    }

    @Override // p026b9.AbstractC0710l, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(java.lang.Object r2) {
            r1 = this;
            E r0 = r1.f3970b0
            boolean r2 = r0.equals(r2)
            return r2
    }

    @Override // p026b9.AbstractC0710l
    /* renamed from: e */
    public int mo2260e(java.lang.Object[] r2, int r3) {
            r1 = this;
            E r0 = r1.f3970b0
            r2[r3] = r0
            int r3 = r3 + 1
            return r3
    }

    @Override // p026b9.AbstractC0716p, java.util.Collection, java.util.Set
    public final int hashCode() {
            r1 = this;
            int r0 = r1.f3971c0
            if (r0 != 0) goto Lc
            E r0 = r1.f3970b0
            int r0 = r0.hashCode()
            r1.f3971c0 = r0
        Lc:
            return r0
    }

    @Override // p026b9.AbstractC0716p, p026b9.AbstractC0710l, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
            r1 = this;
            b9.m0 r0 = r1.mo2270n()
            return r0
    }

    @Override // p026b9.AbstractC0710l
    /* renamed from: m */
    public boolean mo2264m() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // p026b9.AbstractC0710l
    /* renamed from: n */
    public p026b9.AbstractC0713m0<E> mo2270n() {
            r2 = this;
            E r0 = r2.f3970b0
            b9.r r1 = new b9.r
            r1.<init>(r0)
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // java.util.AbstractCollection
    public java.lang.String toString() {
            r2 = this;
            r0 = 91
            java.lang.StringBuilder r0 = p367v1.C6487a.m13176a(r0)
            E r1 = r2.f3970b0
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // p026b9.AbstractC0716p
    /* renamed from: w */
    public p026b9.AbstractC0714n<E> mo2271w() {
            r1 = this;
            E r0 = r1.f3970b0
            b9.n r0 = p026b9.AbstractC0714n.m2306D(r0)
            return r0
    }

    @Override // p026b9.AbstractC0716p
    /* renamed from: z */
    public boolean mo2304z() {
            r1 = this;
            int r0 = r1.f3971c0
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }
}
