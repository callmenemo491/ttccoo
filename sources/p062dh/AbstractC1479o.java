package p062dh;

/* renamed from: dh.o */
/* loaded from: classes.dex */
public abstract class AbstractC1479o implements java.util.Iterator<java.lang.Long>, p259oh.InterfaceC5277a {
    public AbstractC1479o() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public abstract long mo4013a();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ java.lang.Long next() {
            r2 = this;
            long r0 = r2.mo4013a()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
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
