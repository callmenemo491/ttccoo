package p062dh;

/* renamed from: dh.a */
/* loaded from: classes.dex */
public abstract class AbstractC1465a<E> implements java.util.Collection<E>, p259oh.InterfaceC5277a {

    /* renamed from: dh.a$a */
    public static final class a extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<E, java.lang.CharSequence> {

        /* renamed from: Z */
        public final /* synthetic */ p062dh.AbstractC1465a<E> f7226Z;

        public a(p062dh.AbstractC1465a<? extends E> r1) {
                r0 = this;
                r0.f7226Z = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public java.lang.CharSequence mo107b(java.lang.Object r2) {
                r1 = this;
                dh.a<E> r0 = r1.f7226Z
                if (r2 != r0) goto L7
                java.lang.String r2 = "(this Collection)"
                goto Lb
            L7:
                java.lang.String r2 = java.lang.String.valueOf(r2)
            Lb:
                return r2
        }
    }

    public AbstractC1465a() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public abstract int mo3981a();

    @Override // java.util.Collection
    public boolean add(E r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Collection
    public boolean addAll(java.util.Collection<? extends E> r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Collection
    public void clear() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Collection
    public boolean contains(E r4) {
            r3 = this;
            boolean r0 = r3.isEmpty()
            r1 = 0
            if (r0 == 0) goto L8
            goto L1d
        L8:
            java.util.Iterator r0 = r3.iterator()
        Lc:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L1d
            java.lang.Object r2 = r0.next()
            boolean r2 = p214m2.C4339q.m9702c(r2, r4)
            if (r2 == 0) goto Lc
            r1 = 1
        L1d:
            return r1
    }

    @Override // java.util.Collection
    public boolean containsAll(java.util.Collection<? extends java.lang.Object> r3) {
            r2 = this;
            java.lang.String r0 = "elements"
            p214m2.C4339q.m9706k(r3, r0)
            boolean r0 = r3.isEmpty()
            r1 = 1
            if (r0 == 0) goto Ld
            goto L22
        Ld:
            java.util.Iterator r3 = r3.iterator()
        L11:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L22
            java.lang.Object r0 = r3.next()
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L11
            r1 = 0
        L22:
            return r1
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
            r1 = this;
            int r0 = r1.mo3981a()
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Override // java.util.Collection
    public boolean remove(java.lang.Object r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Collection
    public boolean removeAll(java.util.Collection<? extends java.lang.Object> r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Collection
    public boolean retainAll(java.util.Collection<? extends java.lang.Object> r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
            r1 = this;
            int r0 = r1.mo3981a()
            return r0
    }

    @Override // java.util.Collection
    public java.lang.Object[] toArray() {
            r1 = this;
            java.lang.Object[] r0 = p239nh.C4825e.m10851a(r1)
            return r0
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] r2) {
            r1 = this;
            java.lang.String r0 = "array"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.Object[] r2 = p239nh.C4825e.m10852b(r1, r2)
            return r2
    }

    public java.lang.String toString() {
            r8 = this;
            dh.a$a r6 = new dh.a$a
            r6.<init>(r8)
            java.lang.String r1 = ", "
            java.lang.String r2 = "["
            java.lang.String r3 = "]"
            r4 = 0
            r5 = 0
            r7 = 24
            r0 = r8
            java.lang.String r0 = p062dh.C1473i.m4000L(r0, r1, r2, r3, r4, r5, r6, r7)
            return r0
    }
}
