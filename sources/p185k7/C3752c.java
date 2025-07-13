package p185k7;

/* renamed from: k7.c */
/* loaded from: classes.dex */
public final class C3752c implements java.util.Iterator<p185k7.InterfaceC3916o> {

    /* renamed from: Y */
    public final /* synthetic */ java.util.Iterator f16538Y;

    /* renamed from: Z */
    public final /* synthetic */ java.util.Iterator f16539Z;

    public C3752c(java.util.Iterator r1, java.util.Iterator r2) {
            r0 = this;
            r0.f16538Y = r1
            r0.f16539Z = r2
            r0.<init>()
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r1 = this;
            java.util.Iterator r0 = r1.f16538Y
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto La
            r0 = 1
            return r0
        La:
            java.util.Iterator r0 = r1.f16539Z
            boolean r0 = r0.hasNext()
            return r0
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ p185k7.InterfaceC3916o next() {
            r2 = this;
            java.util.Iterator r0 = r2.f16538Y
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L1a
            k7.r r0 = new k7.r
            java.util.Iterator r1 = r2.f16538Y
            java.lang.Object r1 = r1.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            goto L2f
        L1a:
            java.util.Iterator r0 = r2.f16539Z
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L30
            k7.r r0 = new k7.r
            java.util.Iterator r1 = r2.f16539Z
            java.lang.Object r1 = r1.next()
            java.lang.String r1 = (java.lang.String) r1
            r0.<init>(r1)
        L2f:
            return r0
        L30:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }
}
