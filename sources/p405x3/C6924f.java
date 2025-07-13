package p405x3;

/* renamed from: x3.f */
/* loaded from: classes.dex */
public final class C6924f implements bh.InterfaceC0769a {

    /* renamed from: Y */
    public final /* synthetic */ int f26951Y;

    /* renamed from: Z */
    public final bh.InterfaceC0769a<android.content.Context> f26952Z;

    /* renamed from: a0 */
    public final bh.InterfaceC0769a<p050d4.InterfaceC1277a> f26953a0;

    /* renamed from: b0 */
    public final bh.InterfaceC0769a<p050d4.InterfaceC1277a> f26954b0;

    public C6924f(bh.InterfaceC0769a r2, bh.InterfaceC0769a r3, bh.InterfaceC0769a r4, int r5) {
            r1 = this;
            r1.f26951Y = r5
            r0 = 1
            if (r5 == r0) goto Lf
            r1.<init>()
            r1.f26952Z = r2
            r1.f26953a0 = r3
            r1.f26954b0 = r4
            return
        Lf:
            r1.<init>()
            r1.f26952Z = r2
            r1.f26953a0 = r3
            r1.f26954b0 = r4
            return
    }

    @Override // bh.InterfaceC0769a
    public java.lang.Object get() {
            r4 = this;
            int r0 = r4.f26951Y
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto L24
        L6:
            bh.a<android.content.Context> r0 = r4.f26952Z
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            bh.a<d4.a> r1 = r4.f26953a0
            java.lang.Object r1 = r1.get()
            d4.a r1 = (p050d4.InterfaceC1277a) r1
            bh.a<d4.a> r2 = r4.f26954b0
            java.lang.Object r2 = r2.get()
            d4.a r2 = (p050d4.InterfaceC1277a) r2
            x3.e r3 = new x3.e
            r3.<init>(r0, r1, r2)
            return r3
        L24:
            bh.a<android.content.Context> r0 = r4.f26952Z
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            bh.a<d4.a> r1 = r4.f26953a0
            java.lang.Object r1 = r1.get()
            java.lang.String r1 = (java.lang.String) r1
            bh.a<d4.a> r2 = r4.f26954b0
            java.lang.Object r2 = r2.get()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            b4.p r3 = new b4.p
            r3.<init>(r0, r1, r2)
            return r3
    }
}
