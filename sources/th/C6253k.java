package th;

/* renamed from: th.k */
/* loaded from: classes.dex */
public final class C6253k<T, R> implements th.InterfaceC6246d<R> {

    /* renamed from: a */
    public final th.InterfaceC6246d<T> f24239a;

    /* renamed from: b */
    public final mh.InterfaceC4620l<T, R> f24240b;

    /* renamed from: th.k$a */
    public static final class a implements java.util.Iterator<R>, p259oh.InterfaceC5277a {

        /* renamed from: Y */
        public final java.util.Iterator<T> f24241Y;

        /* renamed from: Z */
        public final /* synthetic */ th.C6253k<T, R> f24242Z;

        public a(th.C6253k<T, R> r1) {
                r0 = this;
                r0.f24242Z = r1
                r0.<init>()
                th.d<T> r1 = r1.f24239a
                java.util.Iterator r1 = r1.iterator()
                r0.f24241Y = r1
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r1 = this;
                java.util.Iterator<T> r0 = r1.f24241Y
                boolean r0 = r0.hasNext()
                return r0
        }

        @Override // java.util.Iterator
        public R next() {
                r2 = this;
                th.k<T, R> r0 = r2.f24242Z
                mh.l<T, R> r0 = r0.f24240b
                java.util.Iterator<T> r1 = r2.f24241Y
                java.lang.Object r1 = r1.next()
                java.lang.Object r0 = r0.mo107b(r1)
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

    public C6253k(th.InterfaceC6246d<? extends T> r1, mh.InterfaceC4620l<? super T, ? extends R> r2) {
            r0 = this;
            r0.<init>()
            r0.f24239a = r1
            r0.f24240b = r2
            return
    }

    @Override // th.InterfaceC6246d
    public java.util.Iterator<R> iterator() {
            r1 = this;
            th.k$a r0 = new th.k$a
            r0.<init>(r1)
            return r0
    }
}
