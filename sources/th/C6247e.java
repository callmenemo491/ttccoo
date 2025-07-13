package th;

/* renamed from: th.e */
/* loaded from: classes.dex */
public final class C6247e<T> extends th.AbstractC6248f<T> implements java.util.Iterator<T>, p101fh.InterfaceC2172d<ch.C0985l>, p259oh.InterfaceC5277a {

    /* renamed from: Y */
    public int f24233Y;

    /* renamed from: Z */
    public T f24234Z;

    /* renamed from: a0 */
    public p101fh.InterfaceC2172d<? super ch.C0985l> f24235a0;

    public C6247e() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // th.AbstractC6248f
    /* renamed from: a */
    public java.lang.Object mo12829a(T r1, p101fh.InterfaceC2172d<? super ch.C0985l> r2) {
            r0 = this;
            r0.f24234Z = r1
            r1 = 3
            r0.f24233Y = r1
            r0.f24235a0 = r2
            gh.a r1 = gh.EnumC2389a.f10764Y
            return r1
    }

    /* renamed from: b */
    public final java.lang.Throwable m12830b() {
            r3 = this;
            int r0 = r3.f24233Y
            r1 = 4
            if (r0 == r1) goto L25
            r1 = 5
            if (r0 == r1) goto L1d
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Unexpected state of the iterator: "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            int r2 = r3.f24233Y
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            goto L2a
        L1d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Iterator has failed."
            r0.<init>(r1)
            goto L2a
        L25:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
        L2a:
            return r0
    }

    @Override // p101fh.InterfaceC2172d
    /* renamed from: c */
    public p101fh.InterfaceC2175g mo5706c() {
            r1 = this;
            fh.i r0 = p101fh.C2177i.f9918Y
            return r0
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
            r4 = this;
        L0:
            int r0 = r4.f24233Y
            r1 = 0
            if (r0 == 0) goto L25
            r2 = 2
            r3 = 1
            if (r0 == r3) goto L19
            if (r0 == r2) goto L18
            r1 = 3
            if (r0 == r1) goto L18
            r1 = 4
            if (r0 != r1) goto L13
            r0 = 0
            return r0
        L13:
            java.lang.Throwable r0 = r4.m12830b()
            throw r0
        L18:
            return r3
        L19:
            p214m2.C4339q.m9704i(r1)
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L25
            r4.f24233Y = r2
            return r3
        L25:
            r0 = 5
            r4.f24233Y = r0
            fh.d<? super ch.l> r0 = r4.f24235a0
            p214m2.C4339q.m9704i(r0)
            r4.f24235a0 = r1
            ch.l r1 = ch.C0985l.f5061a
            r0.mo5707k(r1)
            goto L0
    }

    @Override // p101fh.InterfaceC2172d
    /* renamed from: k */
    public void mo5707k(java.lang.Object r1) {
            r0 = this;
            p074e9.C1805a.m4540y(r1)
            r1 = 4
            r0.f24233Y = r1
            return
    }

    @Override // java.util.Iterator
    public T next() {
            r4 = this;
            int r0 = r4.f24233Y
            if (r0 == 0) goto L25
            r1 = 1
            if (r0 == r1) goto L25
            r2 = 2
            r3 = 0
            if (r0 == r2) goto L1b
            r1 = 3
            if (r0 != r1) goto L16
            r0 = 0
            r4.f24233Y = r0
            T r0 = r4.f24234Z
            r4.f24234Z = r3
            return r0
        L16:
            java.lang.Throwable r0 = r4.m12830b()
            throw r0
        L1b:
            r4.f24233Y = r1
            p214m2.C4339q.m9704i(r3)
            java.lang.Object r0 = r3.next()
            return r0
        L25:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L30
            java.lang.Object r0 = r4.next()
            return r0
        L30:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
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
