package p082ek;

/* renamed from: ek.r */
/* loaded from: classes.dex */
public class C1905r extends p082ek.AbstractC1907t<java.lang.Iterable<java.lang.Object>> {

    /* renamed from: a */
    public final /* synthetic */ p082ek.AbstractC1907t f8209a;

    public C1905r(p082ek.AbstractC1907t r1) {
            r0 = this;
            r0.f8209a = r1
            r0.<init>()
            return
    }

    @Override // p082ek.AbstractC1907t
    /* renamed from: a */
    public void mo4684a(p082ek.C1909v r3, java.lang.Iterable<java.lang.Object> r4) {
            r2 = this;
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            if (r4 != 0) goto L5
            goto L19
        L5:
            java.util.Iterator r4 = r4.iterator()
        L9:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L19
            java.lang.Object r0 = r4.next()
            ek.t r1 = r2.f8209a
            r1.mo4684a(r3, r0)
            goto L9
        L19:
            return
    }
}
