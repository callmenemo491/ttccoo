package p086f2;

/* renamed from: f2.a */
/* loaded from: classes.dex */
public final class C1986a<IT> implements p086f2.InterfaceC1987b<IT> {

    /* renamed from: Y */
    public final /* synthetic */ int f8766Y;

    /* renamed from: Z */
    public p019b2.InterfaceC0655a<?> f8767Z;

    /* renamed from: a0 */
    public final int f8768a0;

    public C1986a(p019b2.InterfaceC0655a r2, int r3) {
            r1 = this;
            r0 = 0
            r1.f8766Y = r0
            r1.<init>()
            r1.f8767Z = r2
            r1.f8768a0 = r3
            return
    }

    public C1986a(p019b2.InterfaceC0658d r2, int r3) {
            r1 = this;
            r0 = 1
            r1.f8766Y = r0
            r1.<init>()
            r1.f8768a0 = r3
            r1.f8767Z = r2
            return
    }

    /* renamed from: a */
    public p019b2.InterfaceC0658d<?> m5081a() {
            r2 = this;
            b2.a<?> r0 = r2.f8767Z
            b2.d r0 = (p019b2.InterfaceC0658d) r0
            if (r0 == 0) goto L7
            return r0
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Already disposed."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r2 = this;
            int r0 = r2.f8766Y
            r1 = 0
            switch(r0) {
                case 0: goto L7;
                default: goto L6;
            }
        L6:
            goto La
        L7:
            r2.f8767Z = r1
            return
        La:
            r2.f8767Z = r1
            return
    }

    @Override // p086f2.InterfaceC1987b
    public java.lang.Object getItem() {
            r2 = this;
            int r0 = r2.f8766Y
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto L1f
        L6:
            b2.a<?> r0 = r2.f8767Z
            b2.a r0 = (p019b2.InterfaceC0655a) r0
            if (r0 == 0) goto L13
            int r1 = r2.f8768a0
            java.lang.Object r0 = r0.get(r1)
            return r0
        L13:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Already disposed"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L1f:
            b2.d r0 = r2.m5081a()
            int r1 = r2.f8768a0
            java.lang.Object r0 = r0.get(r1)
            return r0
    }
}
