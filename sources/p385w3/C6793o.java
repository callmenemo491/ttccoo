package p385w3;

/* renamed from: w3.o */
/* loaded from: classes.dex */
public final class C6793o implements bh.InterfaceC0769a {

    /* renamed from: Y */
    public final /* synthetic */ int f26347Y;

    /* renamed from: Z */
    public final bh.InterfaceC0769a<p050d4.InterfaceC1277a> f26348Z;

    /* renamed from: a0 */
    public final bh.InterfaceC0769a<p050d4.InterfaceC1277a> f26349a0;

    /* renamed from: b0 */
    public final bh.InterfaceC0769a<p446z3.InterfaceC7245c> f26350b0;

    /* renamed from: c0 */
    public final bh.InterfaceC0769a<p005a4.C0020i> f26351c0;

    /* renamed from: d0 */
    public final bh.InterfaceC0769a<p005a4.C0022k> f26352d0;

    public C6793o(bh.InterfaceC0769a r2, bh.InterfaceC0769a r3, bh.InterfaceC0769a r4, bh.InterfaceC0769a r5, bh.InterfaceC0769a r6, int r7) {
            r1 = this;
            r1.f26347Y = r7
            r0 = 1
            if (r7 == r0) goto L13
            r1.<init>()
            r1.f26348Z = r2
            r1.f26349a0 = r3
            r1.f26350b0 = r4
            r1.f26351c0 = r5
            r1.f26352d0 = r6
            return
        L13:
            r1.<init>()
            r1.f26348Z = r2
            r1.f26349a0 = r3
            r1.f26350b0 = r4
            r1.f26351c0 = r5
            r1.f26352d0 = r6
            return
    }

    @Override // bh.InterfaceC0769a
    public java.lang.Object get() {
            r7 = this;
            int r0 = r7.f26347Y
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto L3a
        L6:
            bh.a<d4.a> r0 = r7.f26348Z
            java.lang.Object r0 = r0.get()
            r2 = r0
            d4.a r2 = (p050d4.InterfaceC1277a) r2
            bh.a<d4.a> r0 = r7.f26349a0
            java.lang.Object r0 = r0.get()
            r3 = r0
            d4.a r3 = (p050d4.InterfaceC1277a) r3
            bh.a<z3.c> r0 = r7.f26350b0
            java.lang.Object r0 = r0.get()
            r4 = r0
            z3.c r4 = (p446z3.InterfaceC7245c) r4
            bh.a<a4.i> r0 = r7.f26351c0
            java.lang.Object r0 = r0.get()
            r5 = r0
            a4.i r5 = (p005a4.C0020i) r5
            bh.a<a4.k> r0 = r7.f26352d0
            java.lang.Object r0 = r0.get()
            r6 = r0
            a4.k r6 = (p005a4.C0022k) r6
            w3.m r0 = new w3.m
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            return r0
        L3a:
            bh.a<d4.a> r0 = r7.f26348Z
            java.lang.Object r0 = r0.get()
            r2 = r0
            java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2
            bh.a<d4.a> r0 = r7.f26349a0
            java.lang.Object r0 = r0.get()
            r3 = r0
            x3.d r3 = (p405x3.InterfaceC6922d) r3
            bh.a<z3.c> r0 = r7.f26350b0
            java.lang.Object r0 = r0.get()
            r4 = r0
            a4.l r4 = (p005a4.InterfaceC0023l) r4
            bh.a<a4.i> r0 = r7.f26351c0
            java.lang.Object r0 = r0.get()
            r5 = r0
            b4.c r5 = (p021b4.InterfaceC0666c) r5
            bh.a<a4.k> r0 = r7.f26352d0
            java.lang.Object r0 = r0.get()
            r6 = r0
            c4.b r6 = (p034c4.InterfaceC0867b) r6
            z3.b r0 = new z3.b
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            return r0
    }
}
