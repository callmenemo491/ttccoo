package p185k7;

/* renamed from: k7.d5 */
/* loaded from: classes.dex */
public final class C3772d5 extends p072e7.AbstractC1598e5 {

    /* renamed from: Z */
    public int f16557Z;

    /* renamed from: a0 */
    public final int f16558a0;

    /* renamed from: b0 */
    public final /* synthetic */ p185k7.AbstractC3842i5 f16559b0;

    public C3772d5(p185k7.AbstractC3842i5 r2) {
            r1 = this;
            r1.f16559b0 = r2
            r0 = 1
            r1.<init>(r0)
            r0 = 0
            r1.f16557Z = r0
            int r2 = r2.mo8520h()
            r1.f16558a0 = r2
            return
    }

    @Override // p072e7.AbstractC1598e5
    /* renamed from: a */
    public final byte mo4149a() {
            r2 = this;
            int r0 = r2.f16557Z
            int r1 = r2.f16558a0
            if (r0 >= r1) goto L11
            int r1 = r0 + 1
            r2.f16557Z = r1
            k7.i5 r1 = r2.f16559b0
            byte r0 = r1.mo8519e(r0)
            return r0
        L11:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r2 = this;
            int r0 = r2.f16557Z
            int r1 = r2.f16558a0
            if (r0 >= r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }
}
