package p185k7;

/* renamed from: k7.f8 */
/* loaded from: classes.dex */
public final class C3803f8 extends java.util.AbstractList<java.lang.String> implements java.util.RandomAccess, p185k7.InterfaceC3949q6 {

    /* renamed from: Y */
    public final p185k7.InterfaceC3949q6 f16637Y;

    public C3803f8(p185k7.InterfaceC3949q6 r1) {
            r0 = this;
            r0.<init>()
            r0.f16637Y = r1
            return
    }

    @Override // p185k7.InterfaceC3949q6
    /* renamed from: d */
    public final p185k7.InterfaceC3949q6 mo8542d() {
            r0 = this;
            return r0
    }

    @Override // p185k7.InterfaceC3949q6
    /* renamed from: g */
    public final java.util.List<?> mo8543g() {
            r1 = this;
            k7.q6 r0 = r1.f16637Y
            java.util.List r0 = r0.mo8543g()
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object get(int r2) {
            r1 = this;
            k7.q6 r0 = r1.f16637Y
            k7.p6 r0 = (p185k7.C3936p6) r0
            java.lang.String r2 = r0.m8880e(r2)
            return r2
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator<java.lang.String> iterator() {
            r1 = this;
            e7.d8 r0 = new e7.d8
            r0.<init>(r1)
            return r0
    }

    @Override // p185k7.InterfaceC3949q6
    /* renamed from: j */
    public final java.lang.Object mo8544j(int r2) {
            r1 = this;
            k7.q6 r0 = r1.f16637Y
            java.lang.Object r2 = r0.mo8544j(r2)
            return r2
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.ListIterator<java.lang.String> listIterator(int r2) {
            r1 = this;
            e7.c8 r0 = new e7.c8
            r0.<init>(r1, r2)
            return r0
    }

    @Override // p185k7.InterfaceC3949q6
    /* renamed from: r */
    public final void mo8545r(p185k7.AbstractC3842i5 r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
            r1 = this;
            k7.q6 r0 = r1.f16637Y
            int r0 = r0.size()
            return r0
    }
}
