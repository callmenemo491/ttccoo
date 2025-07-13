package p062dh;

/* JADX WARN: Unexpected interfaces in signature: [oh.a] */
/* renamed from: dh.b */
/* loaded from: classes.dex */
public abstract class AbstractC1466b<E> extends p062dh.AbstractC1465a<E> implements java.util.List<E> {

    /* renamed from: dh.b$a */
    public class a implements java.util.Iterator<E>, p259oh.InterfaceC5277a {

        /* renamed from: Y */
        public int f7227Y;

        /* renamed from: Z */
        public final /* synthetic */ p062dh.AbstractC1466b<E> f7228Z;

        public a(p062dh.AbstractC1466b r1) {
                r0 = this;
                r0.f7228Z = r1
                r0.<init>()
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                int r0 = r2.f7227Y
                dh.b<E> r1 = r2.f7228Z
                int r1 = r1.mo3981a()
                if (r0 >= r1) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        @Override // java.util.Iterator
        public E next() {
                r3 = this;
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L13
                dh.b<E> r0 = r3.f7228Z
                int r1 = r3.f7227Y
                int r2 = r1 + 1
                r3.f7227Y = r2
                java.lang.Object r0 = r0.get(r1)
                return r0
            L13:
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

    /* JADX WARN: Unexpected interfaces in signature: [oh.a] */
    /* renamed from: dh.b$b */
    public class b extends p062dh.AbstractC1466b<E>.a implements java.util.ListIterator<E> {

        /* renamed from: a0 */
        public final /* synthetic */ p062dh.AbstractC1466b<E> f7229a0;

        public b(p062dh.AbstractC1466b r4, int r5) {
                r3 = this;
                r3.f7229a0 = r4
                r3.<init>(r4)
                int r4 = r4.mo3981a()
                if (r5 < 0) goto L10
                if (r5 > r4) goto L10
                r3.f7227Y = r5
                return
            L10:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.String r1 = "index: "
                java.lang.String r2 = ", size: "
                java.lang.String r4 = p243o1.C4872b.m11020a(r1, r5, r2, r4)
                r0.<init>(r4)
                throw r0
        }

        @Override // java.util.ListIterator
        public void add(E r2) {
                r1 = this;
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "Operation is not supported for read-only collection"
                r2.<init>(r0)
                throw r2
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
                r1 = this;
                int r0 = r1.f7227Y
                if (r0 <= 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
                r1 = this;
                int r0 = r1.f7227Y
                return r0
        }

        @Override // java.util.ListIterator
        public E previous() {
                r2 = this;
                boolean r0 = r2.hasPrevious()
                if (r0 == 0) goto L13
                dh.b<E> r0 = r2.f7229a0
                int r1 = r2.f7227Y
                int r1 = r1 + (-1)
                r2.f7227Y = r1
                java.lang.Object r0 = r0.get(r1)
                return r0
            L13:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
                r1 = this;
                int r0 = r1.f7227Y
                int r0 = r0 + (-1)
                return r0
        }

        @Override // java.util.ListIterator
        public void set(E r2) {
                r1 = this;
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "Operation is not supported for read-only collection"
                r2.<init>(r0)
                throw r2
        }
    }

    /* renamed from: dh.b$c */
    public static final class c<E> extends p062dh.AbstractC1466b<E> implements java.util.RandomAccess {

        /* renamed from: Y */
        public final p062dh.AbstractC1466b<E> f7230Y;

        /* renamed from: Z */
        public final int f7231Z;

        /* renamed from: a0 */
        public int f7232a0;

        public c(p062dh.AbstractC1466b<? extends E> r5, int r6, int r7) {
                r4 = this;
                r4.<init>()
                r4.f7230Y = r5
                r4.f7231Z = r6
                int r5 = r5.mo3981a()
                java.lang.String r0 = "fromIndex: "
                if (r6 < 0) goto L23
                if (r7 > r5) goto L23
                if (r6 > r7) goto L17
                int r7 = r7 - r6
                r4.f7232a0 = r7
                return
            L17:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.String r1 = " > toIndex: "
                java.lang.String r6 = p243o1.C4872b.m11020a(r0, r6, r1, r7)
                r5.<init>(r6)
                throw r5
            L23:
                java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
                java.lang.String r2 = ", toIndex: "
                java.lang.String r3 = ", size: "
                java.lang.StringBuilder r6 = androidx.recyclerview.widget.C0608s.m2117a(r0, r6, r2, r7, r3)
                r6.append(r5)
                java.lang.String r5 = r6.toString()
                r1.<init>(r5)
                throw r1
        }

        @Override // p062dh.AbstractC1465a
        /* renamed from: a */
        public int mo3981a() {
                r1 = this;
                int r0 = r1.f7232a0
                return r0
        }

        @Override // p062dh.AbstractC1466b, java.util.List
        public E get(int r5) {
                r4 = this;
                int r0 = r4.f7232a0
                if (r5 < 0) goto L10
                if (r5 >= r0) goto L10
                dh.b<E> r0 = r4.f7230Y
                int r1 = r4.f7231Z
                int r1 = r1 + r5
                java.lang.Object r5 = r0.get(r1)
                return r5
            L10:
                java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
                java.lang.String r2 = "index: "
                java.lang.String r3 = ", size: "
                java.lang.String r5 = p243o1.C4872b.m11020a(r2, r5, r3, r0)
                r1.<init>(r5)
                throw r1
        }
    }

    public AbstractC1466b() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.List
    public void add(int r1, E r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Operation is not supported for read-only collection"
            r1.<init>(r2)
            throw r1
    }

    @Override // java.util.List
    public boolean addAll(int r1, java.util.Collection<? extends E> r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Operation is not supported for read-only collection"
            r1.<init>(r2)
            throw r1
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof java.util.List
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            java.util.Collection r6 = (java.util.Collection) r6
            java.lang.String r1 = "c"
            p214m2.C4339q.m9706k(r5, r1)
            java.lang.String r1 = "other"
            p214m2.C4339q.m9706k(r6, r1)
            int r1 = r5.size()
            int r3 = r6.size()
            if (r1 == r3) goto L22
        L20:
            r0 = 0
            goto L3f
        L22:
            java.util.Iterator r6 = r6.iterator()
            java.util.Iterator r1 = r5.iterator()
        L2a:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L3f
            java.lang.Object r3 = r1.next()
            java.lang.Object r4 = r6.next()
            boolean r3 = p214m2.C4339q.m9702c(r3, r4)
            if (r3 != 0) goto L2a
            goto L20
        L3f:
            return r0
    }

    @Override // java.util.List
    public abstract E get(int r1);

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
            r3 = this;
            java.lang.String r0 = "c"
            p214m2.C4339q.m9706k(r3, r0)
            java.util.Iterator r0 = r3.iterator()
            r1 = 1
        La:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L20
            java.lang.Object r2 = r0.next()
            int r1 = r1 * 31
            if (r2 == 0) goto L1d
            int r2 = r2.hashCode()
            goto L1e
        L1d:
            r2 = 0
        L1e:
            int r1 = r1 + r2
            goto La
        L20:
            return r1
    }

    @Override // java.util.List
    public int indexOf(E r4) {
            r3 = this;
            java.util.Iterator r0 = r3.iterator()
            r1 = 0
        L5:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L19
            java.lang.Object r2 = r0.next()
            boolean r2 = p214m2.C4339q.m9702c(r2, r4)
            if (r2 == 0) goto L16
            goto L1a
        L16:
            int r1 = r1 + 1
            goto L5
        L19:
            r1 = -1
        L1a:
            return r1
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public java.util.Iterator<E> iterator() {
            r1 = this;
            dh.b$a r0 = new dh.b$a
            r0.<init>(r1)
            return r0
    }

    @Override // java.util.List
    public int lastIndexOf(E r3) {
            r2 = this;
            int r0 = r2.size()
            java.util.ListIterator r0 = r2.listIterator(r0)
        L8:
            boolean r1 = r0.hasPrevious()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r0.previous()
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 == 0) goto L8
            int r3 = r0.nextIndex()
            goto L1e
        L1d:
            r3 = -1
        L1e:
            return r3
    }

    @Override // java.util.List
    public java.util.ListIterator<E> listIterator() {
            r2 = this;
            dh.b$b r0 = new dh.b$b
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    @Override // java.util.List
    public java.util.ListIterator<E> listIterator(int r2) {
            r1 = this;
            dh.b$b r0 = new dh.b$b
            r0.<init>(r1, r2)
            return r0
    }

    @Override // java.util.List
    public E remove(int r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.List
    public E set(int r1, E r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Operation is not supported for read-only collection"
            r1.<init>(r2)
            throw r1
    }

    @Override // java.util.List
    public java.util.List<E> subList(int r2, int r3) {
            r1 = this;
            dh.b$c r0 = new dh.b$c
            r0.<init>(r1, r2, r3)
            return r0
    }
}
