package p124h7;

/* renamed from: h7.z0 */
/* loaded from: classes.dex */
public final class C2972z0 extends java.util.AbstractList<java.lang.String> implements java.util.RandomAccess, p124h7.InterfaceC2683j {

    /* renamed from: Y */
    public final p124h7.InterfaceC2683j f12046Y;

    public C2972z0(p124h7.InterfaceC2683j r1) {
            r0 = this;
            r0.<init>()
            r0.f12046Y = r1
            return
    }

    @Override // p124h7.InterfaceC2683j
    /* renamed from: V */
    public final void mo6820V(p124h7.AbstractC2574cg r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // p124h7.InterfaceC2683j
    /* renamed from: d */
    public final p124h7.InterfaceC2683j mo6821d() {
            r0 = this;
            return r0
    }

    @Override // p124h7.InterfaceC2683j
    /* renamed from: g */
    public final java.util.List<?> mo6823g() {
            r1 = this;
            h7.j r0 = r1.f12046Y
            java.util.List r0 = r0.mo6823g()
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object get(int r2) {
            r1 = this;
            h7.j r0 = r1.f12046Y
            h7.i r0 = (p124h7.C2665i) r0
            java.lang.String r2 = r0.m6822e(r2)
            return r2
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator<java.lang.String> iterator() {
            r1 = this;
            e7.d8 r0 = new e7.d8
            r0.<init>(r1)
            return r0
    }

    @Override // p124h7.InterfaceC2683j
    /* renamed from: j */
    public final java.lang.Object mo6824j(int r2) {
            r1 = this;
            h7.j r0 = r1.f12046Y
            java.lang.Object r2 = r0.mo6824j(r2)
            return r2
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.ListIterator<java.lang.String> listIterator(int r2) {
            r1 = this;
            e7.c8 r0 = new e7.c8
            r0.<init>(r1, r2)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
            r1 = this;
            h7.j r0 = r1.f12046Y
            int r0 = r0.size()
            return r0
    }
}
