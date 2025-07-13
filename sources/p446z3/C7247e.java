package p446z3;

/* renamed from: z3.e */
/* loaded from: classes.dex */
public final class C7247e implements bh.InterfaceC0769a {

    /* renamed from: Y */
    public final /* synthetic */ int f27847Y;

    /* renamed from: Z */
    public final bh.InterfaceC0769a<android.content.Context> f27848Z;

    /* renamed from: a0 */
    public final bh.InterfaceC0769a<p021b4.InterfaceC0666c> f27849a0;

    /* renamed from: b0 */
    public final bh.InterfaceC0769a<com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC1044c> f27850b0;

    /* renamed from: c0 */
    public final bh.InterfaceC0769a<p050d4.InterfaceC1277a> f27851c0;

    public C7247e(bh.InterfaceC0769a r2, bh.InterfaceC0769a r3, bh.InterfaceC0769a r4, bh.InterfaceC0769a r5, int r6) {
            r1 = this;
            r1.f27847Y = r6
            r0 = 1
            if (r6 == r0) goto L20
            r0 = 2
            if (r6 == r0) goto L14
            r1.<init>()
            r1.f27848Z = r2
            r1.f27849a0 = r3
            r1.f27850b0 = r4
            r1.f27851c0 = r5
            return
        L14:
            r1.<init>()
            r1.f27848Z = r2
            r1.f27849a0 = r3
            r1.f27850b0 = r4
            r1.f27851c0 = r5
            return
        L20:
            r1.<init>()
            r1.f27848Z = r2
            r1.f27849a0 = r3
            r1.f27850b0 = r4
            r1.f27851c0 = r5
            return
    }

    @Override // bh.InterfaceC0769a
    public java.lang.Object get() {
            r5 = this;
            int r0 = r5.f27847Y
            switch(r0) {
                case 0: goto L2c;
                case 1: goto L6;
                default: goto L5;
            }
        L5:
            goto L52
        L6:
            bh.a<android.content.Context> r0 = r5.f27848Z
            java.lang.Object r0 = r0.get()
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0
            bh.a<b4.c> r1 = r5.f27849a0
            java.lang.Object r1 = r1.get()
            b4.c r1 = (p021b4.InterfaceC0666c) r1
            bh.a<com.google.android.datatransport.runtime.scheduling.jobscheduling.c> r2 = r5.f27850b0
            java.lang.Object r2 = r2.get()
            a4.l r2 = (p005a4.InterfaceC0023l) r2
            bh.a<d4.a> r3 = r5.f27851c0
            java.lang.Object r3 = r3.get()
            c4.b r3 = (p034c4.InterfaceC0867b) r3
            a4.k r4 = new a4.k
            r4.<init>(r0, r1, r2, r3)
            return r4
        L2c:
            bh.a<android.content.Context> r0 = r5.f27848Z
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            bh.a<b4.c> r1 = r5.f27849a0
            java.lang.Object r1 = r1.get()
            b4.c r1 = (p021b4.InterfaceC0666c) r1
            bh.a<com.google.android.datatransport.runtime.scheduling.jobscheduling.c> r2 = r5.f27850b0
            java.lang.Object r2 = r2.get()
            com.google.android.datatransport.runtime.scheduling.jobscheduling.c r2 = (com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC1044c) r2
            bh.a<d4.a> r3 = r5.f27851c0
            java.lang.Object r3 = r3.get()
            d4.a r3 = (p050d4.InterfaceC1277a) r3
            a4.b r3 = new a4.b
            r3.<init>(r0, r1, r2)
            return r3
        L52:
            bh.a<android.content.Context> r0 = r5.f27848Z
            java.lang.Object r0 = r0.get()
            d4.a r0 = (p050d4.InterfaceC1277a) r0
            bh.a<b4.c> r1 = r5.f27849a0
            java.lang.Object r1 = r1.get()
            d4.a r1 = (p050d4.InterfaceC1277a) r1
            bh.a<com.google.android.datatransport.runtime.scheduling.jobscheduling.c> r2 = r5.f27850b0
            java.lang.Object r2 = r2.get()
            bh.a<d4.a> r3 = r5.f27851c0
            java.lang.Object r3 = r3.get()
            b4.k r4 = new b4.k
            b4.d r2 = (p021b4.AbstractC0667d) r2
            b4.p r3 = (p021b4.C0679p) r3
            r4.<init>(r0, r1, r2, r3)
            return r4
    }
}
