package p072e7;

/* renamed from: e7.c8 */
/* loaded from: classes.dex */
public final class C1581c8 implements java.util.ListIterator<java.lang.String> {

    /* renamed from: Y */
    public final /* synthetic */ int f7513Y;

    /* renamed from: Z */
    public final java.util.ListIterator<java.lang.String> f7514Z;

    /* renamed from: a0 */
    public final /* synthetic */ java.lang.Object f7515a0;

    public C1581c8(p072e7.C1601e8 r2, int r3) {
            r1 = this;
            r0 = 0
            r1.f7513Y = r0
            r1.f7515a0 = r2
            r1.<init>()
            e7.l6 r2 = r2.f7551Y
            java.util.ListIterator r2 = r2.listIterator(r3)
            r1.f7514Z = r2
            return
    }

    public C1581c8(p124h7.C2972z0 r2, int r3) {
            r1 = this;
            r0 = 1
            r1.f7513Y = r0
            r1.f7515a0 = r2
            r1.<init>()
            h7.j r2 = r2.f12046Y
            java.util.ListIterator r2 = r2.listIterator(r3)
            r1.f7514Z = r2
            return
    }

    public C1581c8(p185k7.C3803f8 r2, int r3) {
            r1 = this;
            r0 = 2
            r1.f7513Y = r0
            r1.f7515a0 = r2
            r1.<init>()
            k7.q6 r2 = r2.f16637Y
            java.util.ListIterator r2 = r2.listIterator(r3)
            r1.f7514Z = r2
            return
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(java.lang.String r2) {
            r1 = this;
            int r0 = r1.f7513Y
            switch(r0) {
                case 0: goto Le;
                case 1: goto L6;
                default: goto L5;
            }
        L5:
            goto L16
        L6:
            java.lang.String r2 = (java.lang.String) r2
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            r2.<init>()
            throw r2
        Le:
            java.lang.String r2 = (java.lang.String) r2
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            r2.<init>()
            throw r2
        L16:
            java.lang.String r2 = (java.lang.String) r2
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            r2.<init>()
            throw r2
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
            r1 = this;
            int r0 = r1.f7513Y
            switch(r0) {
                case 0: goto Ld;
                case 1: goto L6;
                default: goto L5;
            }
        L5:
            goto L14
        L6:
            java.util.ListIterator<java.lang.String> r0 = r1.f7514Z
            boolean r0 = r0.hasNext()
            return r0
        Ld:
            java.util.ListIterator<java.lang.String> r0 = r1.f7514Z
            boolean r0 = r0.hasNext()
            return r0
        L14:
            java.util.ListIterator<java.lang.String> r0 = r1.f7514Z
            boolean r0 = r0.hasNext()
            return r0
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
            r1 = this;
            int r0 = r1.f7513Y
            switch(r0) {
                case 0: goto Ld;
                case 1: goto L6;
                default: goto L5;
            }
        L5:
            goto L14
        L6:
            java.util.ListIterator<java.lang.String> r0 = r1.f7514Z
            boolean r0 = r0.hasPrevious()
            return r0
        Ld:
            java.util.ListIterator<java.lang.String> r0 = r1.f7514Z
            boolean r0 = r0.hasPrevious()
            return r0
        L14:
            java.util.ListIterator<java.lang.String> r0 = r1.f7514Z
            boolean r0 = r0.hasPrevious()
            return r0
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
            r1 = this;
            int r0 = r1.f7513Y
            switch(r0) {
                case 0: goto Lf;
                case 1: goto L6;
                default: goto L5;
            }
        L5:
            goto L18
        L6:
            java.util.ListIterator<java.lang.String> r0 = r1.f7514Z
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            return r0
        Lf:
            java.util.ListIterator<java.lang.String> r0 = r1.f7514Z
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L18:
            java.util.ListIterator<java.lang.String> r0 = r1.f7514Z
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
            r1 = this;
            int r0 = r1.f7513Y
            switch(r0) {
                case 0: goto Ld;
                case 1: goto L6;
                default: goto L5;
            }
        L5:
            goto L14
        L6:
            java.util.ListIterator<java.lang.String> r0 = r1.f7514Z
            int r0 = r0.nextIndex()
            return r0
        Ld:
            java.util.ListIterator<java.lang.String> r0 = r1.f7514Z
            int r0 = r0.nextIndex()
            return r0
        L14:
            java.util.ListIterator<java.lang.String> r0 = r1.f7514Z
            int r0 = r0.nextIndex()
            return r0
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ java.lang.String previous() {
            r1 = this;
            int r0 = r1.f7513Y
            switch(r0) {
                case 0: goto Lf;
                case 1: goto L6;
                default: goto L5;
            }
        L5:
            goto L18
        L6:
            java.util.ListIterator<java.lang.String> r0 = r1.f7514Z
            java.lang.Object r0 = r0.previous()
            java.lang.String r0 = (java.lang.String) r0
            return r0
        Lf:
            java.util.ListIterator<java.lang.String> r0 = r1.f7514Z
            java.lang.Object r0 = r0.previous()
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L18:
            java.util.ListIterator<java.lang.String> r0 = r1.f7514Z
            java.lang.Object r0 = r0.previous()
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
            r1 = this;
            int r0 = r1.f7513Y
            switch(r0) {
                case 0: goto Ld;
                case 1: goto L6;
                default: goto L5;
            }
        L5:
            goto L14
        L6:
            java.util.ListIterator<java.lang.String> r0 = r1.f7514Z
            int r0 = r0.previousIndex()
            return r0
        Ld:
            java.util.ListIterator<java.lang.String> r0 = r1.f7514Z
            int r0 = r0.previousIndex()
            return r0
        L14:
            java.util.ListIterator<java.lang.String> r0 = r1.f7514Z
            int r0 = r0.previousIndex()
            return r0
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
            r1 = this;
            int r0 = r1.f7513Y
            switch(r0) {
                case 0: goto Lc;
                case 1: goto L6;
                default: goto L5;
            }
        L5:
            goto L12
        L6:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
        Lc:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
        L12:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(java.lang.String r2) {
            r1 = this;
            int r0 = r1.f7513Y
            switch(r0) {
                case 0: goto Le;
                case 1: goto L6;
                default: goto L5;
            }
        L5:
            goto L16
        L6:
            java.lang.String r2 = (java.lang.String) r2
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            r2.<init>()
            throw r2
        Le:
            java.lang.String r2 = (java.lang.String) r2
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            r2.<init>()
            throw r2
        L16:
            java.lang.String r2 = (java.lang.String) r2
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            r2.<init>()
            throw r2
    }
}
