package p124h7;

/* renamed from: h7.yf */
/* loaded from: classes.dex */
public final class C2969yf extends p124h7.AbstractC2987zf {

    /* renamed from: Y */
    public int f12043Y;

    /* renamed from: Z */
    public final int f12044Z;

    /* renamed from: a0 */
    public final /* synthetic */ p124h7.AbstractC2574cg f12045a0;

    public C2969yf(p124h7.AbstractC2574cg r2) {
            r1 = this;
            r1.f12045a0 = r2
            r1.<init>()
            r0 = 0
            r1.f12043Y = r0
            int r2 = r2.mo6474h()
            r1.f12044Z = r2
            return
    }

    @Override // p124h7.AbstractC2987zf
    /* renamed from: a */
    public final byte mo7327a() {
            r2 = this;
            int r0 = r2.f12043Y
            int r1 = r2.f12044Z
            if (r0 >= r1) goto L11
            int r1 = r0 + 1
            r2.f12043Y = r1
            h7.cg r1 = r2.f12045a0
            byte r0 = r1.mo6473e(r0)
            return r0
        L11:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r2 = this;
            int r0 = r2.f12043Y
            int r1 = r2.f12044Z
            if (r0 >= r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }
}
