package p026b9;

/* renamed from: b9.r */
/* loaded from: classes.dex */
public final class C0718r extends p026b9.AbstractC0713m0<java.lang.Object> {

    /* renamed from: Y */
    public boolean f3993Y;

    /* renamed from: Z */
    public final /* synthetic */ java.lang.Object f3994Z;

    public C0718r(java.lang.Object r1) {
            r0 = this;
            r0.f3994Z = r1
            r0.<init>()
            return
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
            r1 = this;
            boolean r0 = r1.f3993Y
            r0 = r0 ^ 1
            return r0
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
            r1 = this;
            boolean r0 = r1.f3993Y
            if (r0 != 0) goto La
            r0 = 1
            r1.f3993Y = r0
            java.lang.Object r0 = r1.f3994Z
            return r0
        La:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }
}
