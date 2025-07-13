package p026b9;

/* renamed from: b9.q */
/* loaded from: classes.dex */
public final class C0717q extends p026b9.AbstractC0690b<java.lang.Object> {

    /* renamed from: a0 */
    public final /* synthetic */ java.util.Iterator f3991a0;

    /* renamed from: b0 */
    public final /* synthetic */ p010a9.InterfaceC0039g f3992b0;

    public C0717q(java.util.Iterator r1, p010a9.InterfaceC0039g r2) {
            r0 = this;
            r0.f3991a0 = r1
            r0.f3992b0 = r2
            r0.<init>()
            return
    }

    @Override // p026b9.AbstractC0690b
    /* renamed from: a */
    public java.lang.Object mo2257a() {
            r2 = this;
        L0:
            java.util.Iterator r0 = r2.f3991a0
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L17
            java.util.Iterator r0 = r2.f3991a0
            java.lang.Object r0 = r0.next()
            a9.g r1 = r2.f3992b0
            boolean r1 = r1.apply(r0)
            if (r1 == 0) goto L0
            return r0
        L17:
            r0 = 3
            r2.f3896Y = r0
            r0 = 0
            return r0
    }
}
