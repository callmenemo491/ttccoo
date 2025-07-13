package p026b9;

/* renamed from: b9.b */
/* loaded from: classes.dex */
public abstract class AbstractC0690b<T> extends p026b9.AbstractC0713m0<T> {

    /* renamed from: Y */
    public int f3896Y;

    /* renamed from: Z */
    public T f3897Z;

    public AbstractC0690b() {
            r1 = this;
            r1.<init>()
            r0 = 2
            r1.f3896Y = r0
            return
    }

    /* renamed from: a */
    public abstract T mo2257a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r5 = this;
            int r0 = r5.f3896Y
            r1 = 0
            r2 = 1
            r3 = 4
            if (r0 == r3) goto L9
            r4 = 1
            goto La
        L9:
            r4 = 0
        La:
            if (r4 == 0) goto L27
            int r0 = p365v.C6480g.m13148b(r0)
            if (r0 == 0) goto L26
            r4 = 2
            if (r0 == r4) goto L25
            r5.f3896Y = r3
            java.lang.Object r0 = r5.mo2257a()
            r5.f3897Z = r0
            int r0 = r5.f3896Y
            r3 = 3
            if (r0 == r3) goto L25
            r5.f3896Y = r2
            r1 = 1
        L25:
            return r1
        L26:
            return r2
        L27:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
    }

    @Override // java.util.Iterator
    public final T next() {
            r2 = this;
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Lf
            r0 = 2
            r2.f3896Y = r0
            T r0 = r2.f3897Z
            r1 = 0
            r2.f3897Z = r1
            return r0
        Lf:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }
}
