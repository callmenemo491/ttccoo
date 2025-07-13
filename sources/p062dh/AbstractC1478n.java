package p062dh;

/* renamed from: dh.n */
/* loaded from: classes.dex */
public abstract class AbstractC1478n implements java.util.Iterator<java.lang.Integer>, p259oh.InterfaceC5277a {
    public AbstractC1478n() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public abstract int mo4012a();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ java.lang.Integer next() {
            r1 = this;
            int r0 = r1.mo4012a()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
    }

    @Override // java.util.Iterator
    public void remove() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }
}
