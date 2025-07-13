package p072e7;

/* renamed from: e7.e5 */
/* loaded from: classes.dex */
public abstract class AbstractC1598e5 implements java.util.Iterator {

    /* renamed from: Y */
    public final /* synthetic */ int f7546Y;

    public AbstractC1598e5(int r1) {
            r0 = this;
            r0.f7546Y = r1
            r0.<init>()
            return
    }

    /* renamed from: a */
    public abstract byte mo4149a();

    @Override // java.util.Iterator
    public final /* synthetic */ java.lang.Object next() {
            r1 = this;
            int r0 = r1.f7546Y
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto Lf
        L6:
            byte r0 = r1.mo4149a()
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            return r0
        Lf:
            byte r0 = r1.mo4149a()
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            return r0
    }

    @Override // java.util.Iterator
    public final void remove() {
            r1 = this;
            int r0 = r1.f7546Y
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
