package p072e7;

/* renamed from: e7.d5 */
/* loaded from: classes.dex */
public final class C1588d5 extends p072e7.AbstractC1598e5 {

    /* renamed from: Z */
    public int f7521Z;

    /* renamed from: a0 */
    public final int f7522a0;

    /* renamed from: b0 */
    public final /* synthetic */ p072e7.AbstractC1638i5 f7523b0;

    public C1588d5(p072e7.AbstractC1638i5 r2) {
            r1 = this;
            r1.f7523b0 = r2
            r0 = 0
            r1.<init>(r0)
            r1.f7521Z = r0
            int r2 = r2.mo4195h()
            r1.f7522a0 = r2
            return
    }

    @Override // p072e7.AbstractC1598e5
    /* renamed from: a */
    public final byte mo4149a() {
            r2 = this;
            int r0 = r2.f7521Z
            int r1 = r2.f7522a0
            if (r0 >= r1) goto L11
            int r1 = r0 + 1
            r2.f7521Z = r1
            e7.i5 r1 = r2.f7523b0
            byte r0 = r1.mo4194e(r0)
            return r0
        L11:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r2 = this;
            int r0 = r2.f7521Z
            int r1 = r2.f7522a0
            if (r0 >= r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }
}
