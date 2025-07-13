package p185k7;

/* renamed from: k7.j */
/* loaded from: classes.dex */
public final class C3850j implements java.util.Iterator<p185k7.InterfaceC3916o> {

    /* renamed from: Y */
    public final /* synthetic */ java.util.Iterator f16697Y;

    public C3850j(java.util.Iterator r1) {
            r0 = this;
            r0.f16697Y = r1
            r0.<init>()
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r1 = this;
            java.util.Iterator r0 = r1.f16697Y
            boolean r0 = r0.hasNext()
            return r0
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ p185k7.InterfaceC3916o next() {
            r2 = this;
            k7.r r0 = new k7.r
            java.util.Iterator r1 = r2.f16697Y
            java.lang.Object r1 = r1.next()
            java.lang.String r1 = (java.lang.String) r1
            r0.<init>(r1)
            return r0
    }
}
