package p124h7;

/* renamed from: h7.w2 */
/* loaded from: classes.dex */
public final class C2920w2 extends p124h7.AbstractC2829r1<p124h7.InterfaceC2739m1, p124h7.C2545b5> {

    /* renamed from: b */
    public final /* synthetic */ int f11980b;

    public C2920w2(java.lang.Class r2, int r3) {
            r1 = this;
            r1.f11980b = r3
            r0 = 1
            if (r3 == r0) goto L9
            r1.<init>(r2)
            return
        L9:
            r1.<init>(r2)
            return
    }

    @Override // p124h7.AbstractC2829r1
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ p124h7.InterfaceC2739m1 mo6522a(p124h7.C2545b5 r5) {
            r4 = this;
            int r0 = r4.f11980b
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto L16
        L6:
            h7.b5 r5 = (p124h7.C2545b5) r5
            h7.p7 r0 = new h7.p7
            h7.cg r5 = r5.m6492w()
            byte[] r5 = r5.m6537C()
            r0.<init>(r5)
            return r0
        L16:
            h7.w3 r5 = (p124h7.C2921w3) r5
            h7.b8 r0 = new h7.b8
            androidx.fragment.app.l0 r1 = new androidx.fragment.app.l0
            h7.cg r2 = r5.m7232x()
            byte[] r2 = r2.m6537C()
            r3 = 8
            r1.<init>(r2, r3)
            h7.b4 r5 = r5.m7231w()
            int r5 = r5.m6485r()
            r0.<init>(r1, r5)
            return r0
    }
}
