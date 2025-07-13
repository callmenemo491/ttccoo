package p221m9;

/* renamed from: m9.p1 */
/* loaded from: classes.dex */
public class C4480p1 extends java.util.AbstractList<java.lang.String> implements p221m9.InterfaceC4449f0, java.util.RandomAccess {

    /* renamed from: Y */
    public final p221m9.InterfaceC4449f0 f18207Y;

    /* renamed from: m9.p1$a */
    public class a implements java.util.ListIterator<java.lang.String> {

        /* renamed from: Y */
        public java.util.ListIterator<java.lang.String> f18208Y;

        public a(p221m9.C4480p1 r1, int r2) {
                r0 = this;
                r0.<init>()
                m9.f0 r1 = r1.f18207Y
                java.util.ListIterator r1 = r1.listIterator(r2)
                r0.f18208Y = r1
                return
        }

        @Override // java.util.ListIterator
        public void add(java.lang.String r1) {
                r0 = this;
                java.lang.String r1 = (java.lang.String) r1
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
                r1 = this;
                java.util.ListIterator<java.lang.String> r0 = r1.f18208Y
                boolean r0 = r0.hasNext()
                return r0
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
                r1 = this;
                java.util.ListIterator<java.lang.String> r0 = r1.f18208Y
                boolean r0 = r0.hasPrevious()
                return r0
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public java.lang.Object next() {
                r1 = this;
                java.util.ListIterator<java.lang.String> r0 = r1.f18208Y
                java.lang.Object r0 = r0.next()
                java.lang.String r0 = (java.lang.String) r0
                return r0
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
                r1 = this;
                java.util.ListIterator<java.lang.String> r0 = r1.f18208Y
                int r0 = r0.nextIndex()
                return r0
        }

        @Override // java.util.ListIterator
        public java.lang.String previous() {
                r1 = this;
                java.util.ListIterator<java.lang.String> r0 = r1.f18208Y
                java.lang.Object r0 = r0.previous()
                java.lang.String r0 = (java.lang.String) r0
                return r0
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
                r1 = this;
                java.util.ListIterator<java.lang.String> r0 = r1.f18208Y
                int r0 = r0.previousIndex()
                return r0
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        @Override // java.util.ListIterator
        public void set(java.lang.String r1) {
                r0 = this;
                java.lang.String r1 = (java.lang.String) r1
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }
    }

    /* renamed from: m9.p1$b */
    public class b implements java.util.Iterator<java.lang.String> {

        /* renamed from: Y */
        public java.util.Iterator<java.lang.String> f18209Y;

        public b(p221m9.C4480p1 r1) {
                r0 = this;
                r0.<init>()
                m9.f0 r1 = r1.f18207Y
                java.util.Iterator r1 = r1.iterator()
                r0.f18209Y = r1
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r1 = this;
                java.util.Iterator<java.lang.String> r0 = r1.f18209Y
                boolean r0 = r0.hasNext()
                return r0
        }

        @Override // java.util.Iterator
        public java.lang.String next() {
                r1 = this;
                java.util.Iterator<java.lang.String> r0 = r1.f18209Y
                java.lang.Object r0 = r0.next()
                java.lang.String r0 = (java.lang.String) r0
                return r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }
    }

    public C4480p1(p221m9.InterfaceC4449f0 r1) {
            r0 = this;
            r0.<init>()
            r0.f18207Y = r1
            return
    }

    @Override // p221m9.InterfaceC4449f0
    /* renamed from: G */
    public p221m9.InterfaceC4449f0 mo9982G() {
            r0 = this;
            return r0
    }

    @Override // p221m9.InterfaceC4449f0
    /* renamed from: J */
    public void mo9983J(p221m9.AbstractC4454h r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // p221m9.InterfaceC4449f0
    /* renamed from: M */
    public java.lang.Object mo9984M(int r2) {
            r1 = this;
            m9.f0 r0 = r1.f18207Y
            java.lang.Object r2 = r0.mo9984M(r2)
            return r2
    }

    @Override // p221m9.InterfaceC4449f0
    /* renamed from: N */
    public java.util.List<?> mo9985N() {
            r1 = this;
            m9.f0 r0 = r1.f18207Y
            java.util.List r0 = r0.mo9985N()
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object get(int r2) {
            r1 = this;
            m9.f0 r0 = r1.f18207Y
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            return r2
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public java.util.Iterator<java.lang.String> iterator() {
            r1 = this;
            m9.p1$b r0 = new m9.p1$b
            r0.<init>(r1)
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public java.util.ListIterator<java.lang.String> listIterator(int r2) {
            r1 = this;
            m9.p1$a r0 = new m9.p1$a
            r0.<init>(r1, r2)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
            r1 = this;
            m9.f0 r0 = r1.f18207Y
            int r0 = r0.size()
            return r0
    }
}
