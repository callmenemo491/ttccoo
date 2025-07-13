package th;

/* renamed from: th.b */
/* loaded from: classes.dex */
public final class C6244b<T> implements th.InterfaceC6246d<T>, th.InterfaceC6245c<T> {

    /* renamed from: a */
    public final th.InterfaceC6246d<T> f24229a;

    /* renamed from: b */
    public final int f24230b;

    /* renamed from: th.b$a */
    public static final class a implements java.util.Iterator<T>, p259oh.InterfaceC5277a {

        /* renamed from: Y */
        public final java.util.Iterator<T> f24231Y;

        /* renamed from: Z */
        public int f24232Z;

        public a(th.C6244b<T> r2) {
                r1 = this;
                r1.<init>()
                th.d<T> r0 = r2.f24229a
                java.util.Iterator r0 = r0.iterator()
                r1.f24231Y = r0
                int r2 = r2.f24230b
                r1.f24232Z = r2
                return
        }

        /* renamed from: a */
        public final void m12828a() {
                r1 = this;
            L0:
                int r0 = r1.f24232Z
                if (r0 <= 0) goto L18
                java.util.Iterator<T> r0 = r1.f24231Y
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto L18
                java.util.Iterator<T> r0 = r1.f24231Y
                r0.next()
                int r0 = r1.f24232Z
                int r0 = r0 + (-1)
                r1.f24232Z = r0
                goto L0
            L18:
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r1 = this;
                r1.m12828a()
                java.util.Iterator<T> r0 = r1.f24231Y
                boolean r0 = r0.hasNext()
                return r0
        }

        @Override // java.util.Iterator
        public T next() {
                r1 = this;
                r1.m12828a()
                java.util.Iterator<T> r0 = r1.f24231Y
                java.lang.Object r0 = r0.next()
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

    public C6244b(th.InterfaceC6246d<? extends T> r2, int r3) {
            r1 = this;
            java.lang.String r0 = "sequence"
            p214m2.C4339q.m9706k(r2, r0)
            r1.<init>()
            r1.f24229a = r2
            r1.f24230b = r3
            if (r3 < 0) goto L10
            r2 = 1
            goto L11
        L10:
            r2 = 0
        L11:
            if (r2 == 0) goto L14
            return
        L14:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "count must be non-negative, but was "
            r2.append(r0)
            r2.append(r3)
            r3 = 46
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }

    @Override // th.InterfaceC6245c
    /* renamed from: a */
    public th.InterfaceC6246d<T> mo12827a(int r3) {
            r2 = this;
            int r0 = r2.f24230b
            int r0 = r0 + r3
            if (r0 >= 0) goto Lb
            th.b r0 = new th.b
            r0.<init>(r2, r3)
            goto L13
        Lb:
            th.b r3 = new th.b
            th.d<T> r1 = r2.f24229a
            r3.<init>(r1, r0)
            r0 = r3
        L13:
            return r0
    }

    @Override // th.InterfaceC6246d
    public java.util.Iterator<T> iterator() {
            r1 = this;
            th.b$a r0 = new th.b$a
            r0.<init>(r1)
            return r0
    }
}
