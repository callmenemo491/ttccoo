package p072e7;

/* renamed from: e7.e8 */
/* loaded from: classes.dex */
public final class C1601e8 extends java.util.AbstractList<java.lang.String> implements java.util.RandomAccess, p072e7.InterfaceC1669l6 {

    /* renamed from: Y */
    public final p072e7.InterfaceC1669l6 f7551Y;

    public C1601e8(p072e7.InterfaceC1669l6 r1) {
            r0 = this;
            r0.<init>()
            r0.f7551Y = r1
            return
    }

    @Override // p072e7.InterfaceC1669l6
    /* renamed from: f */
    public final p072e7.InterfaceC1669l6 mo4186f() {
            r0 = this;
            return r0
    }

    @Override // p072e7.InterfaceC1669l6
    /* renamed from: g */
    public final java.util.List<?> mo4187g() {
            r1 = this;
            e7.l6 r0 = r1.f7551Y
            java.util.List r0 = r0.mo4187g()
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object get(int r2) {
            r1 = this;
            e7.l6 r0 = r1.f7551Y
            e7.k6 r0 = (p072e7.C1659k6) r0
            java.lang.String r2 = r0.m4316e(r2)
            return r2
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator<java.lang.String> iterator() {
            r1 = this;
            e7.d8 r0 = new e7.d8
            r0.<init>(r1)
            return r0
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
            e7.l6 r0 = r1.f7551Y
            int r0 = r0.size()
            return r0
    }

    @Override // p072e7.InterfaceC1669l6
    /* renamed from: t */
    public final java.lang.Object mo4188t(int r2) {
            r1 = this;
            e7.l6 r0 = r1.f7551Y
            java.lang.Object r2 = r0.mo4188t(r2)
            return r2
    }
}
