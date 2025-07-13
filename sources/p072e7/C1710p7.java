package p072e7;

/* renamed from: e7.p7 */
/* loaded from: classes.dex */
public final class C1710p7 implements java.util.Iterator<java.lang.Object> {

    /* renamed from: Y */
    public final /* synthetic */ int f7739Y;

    public C1710p7(int r1) {
            r0 = this;
            r0.f7739Y = r1
            r0.<init>()
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r1 = this;
            int r0 = r1.f7739Y
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto Lc
        L6:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        Lc:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    @Override // java.util.Iterator
    public final void remove() {
            r1 = this;
            int r0 = r1.f7739Y
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto Lc
        L6:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
        Lc:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }
}
