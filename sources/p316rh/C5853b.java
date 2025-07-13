package p316rh;

/* renamed from: rh.b */
/* loaded from: classes.dex */
public final class C5853b extends p062dh.AbstractC1478n {

    /* renamed from: Y */
    public final int f22650Y;

    /* renamed from: Z */
    public final int f22651Z;

    /* renamed from: a0 */
    public boolean f22652a0;

    /* renamed from: b0 */
    public int f22653b0;

    public C5853b(int r3, int r4, int r5) {
            r2 = this;
            r2.<init>()
            r2.f22650Y = r5
            r2.f22651Z = r4
            r0 = 1
            r1 = 0
            if (r5 <= 0) goto Le
            if (r3 > r4) goto L11
            goto L12
        Le:
            if (r3 < r4) goto L11
            goto L12
        L11:
            r0 = 0
        L12:
            r2.f22652a0 = r0
            if (r0 == 0) goto L17
            goto L18
        L17:
            r3 = r4
        L18:
            r2.f22653b0 = r3
            return
    }

    @Override // p062dh.AbstractC1478n
    /* renamed from: a */
    public int mo4012a() {
            r2 = this;
            int r0 = r2.f22653b0
            int r1 = r2.f22651Z
            if (r0 != r1) goto L14
            boolean r1 = r2.f22652a0
            if (r1 == 0) goto Le
            r1 = 0
            r2.f22652a0 = r1
            goto L19
        Le:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L14:
            int r1 = r2.f22650Y
            int r1 = r1 + r0
            r2.f22653b0 = r1
        L19:
            return r0
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
            r1 = this;
            boolean r0 = r1.f22652a0
            return r0
    }
}
